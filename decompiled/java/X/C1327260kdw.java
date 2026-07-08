package X;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.provider.MediaStore;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0kdw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1327260kdw extends AbstractC1327410keB implements InterfaceC1327290kdz<C1328480kfu> {
    public static final Class<?> LIZLLL = C1327260kdw.class;
    public static final String[] LJ = {"_id", "_data"};
    public static final String[] LJFF = {"_data"};
    public static final Rect LJI = new Rect(0, 0, 512, 384);
    public static final Rect LJII = new Rect(0, 0, 96, 96);
    public final ContentResolver LIZJ;

    @Override // X.AbstractC1327410keB
    public final String LJ() {
        return "LocalContentUriThumbnailFetchProducer";
    }

    public static int LJFF(String str) {
        if (str != null) {
            try {
                return C1327280kdy.LIZ(C2204961BRm.LJLILLLLZI(new ExifInterface(str), 1, new C0WZX("dzBzEgQ7XM/eWlgqCxuJZ9R1iSH8CvqoEW3SbK9pZCoLP1ExETQoqDB8LowtWKEXnO9SDGzT5HcgnZTK2qBBZW99MZS9o7X+x/I=", new String[]{"019e5"})));
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                Class<?> cls = LIZLLL;
                Object[] objArr = {str};
                if (C1328570kg3.LIZ.LIZIZ(6)) {
                    C1328570kg3.LIZ.e(cls.getSimpleName(), C786410Ut5.k4(null, "Unable to retrieve thumbnail rotation for %s", objArr), e);
                }
            }
        }
        return 0;
    }

    public static int LJII(C1324630kZh c1324630kZh) {
        Rect rect = LJII;
        if (C1327270kdx.LIZ(rect.width(), rect.height(), c1324630kZh)) {
            return 3;
        }
        Rect rect2 = LJI;
        if (C1327270kdx.LIZ(rect2.width(), rect2.height(), c1324630kZh)) {
            return 1;
        }
        return 0;
    }

    @Override // X.InterfaceC1327290kdz
    public final boolean LIZ(C1324630kZh c1324630kZh) {
        Rect rect = LJI;
        return C1327270kdx.LIZ(rect.width(), rect.height(), c1324630kZh);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        if (r3 == null) goto L54;
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00a3: MOVE (r9 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:16777379), block:B:44:0x00a3 */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.AbstractC1327410keB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1328480kfu LIZLLL(X.C1325710kbR r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1327260kdw.LIZLLL(X.0kbR):X.0kfu");
    }

    public final C1328480kfu LJI(int i, C1324630kZh c1324630kZh) throws Throwable {
        int length;
        int iLJII = LJII(c1324630kZh);
        Cursor cursor = null;
        if (iLJII == 0) {
            return null;
        }
        try {
            Cursor cursorQueryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.LIZJ, i, iLJII, LJFF);
            if (cursorQueryMiniThumbnail == null) {
                return null;
            }
            try {
                cursorQueryMiniThumbnail.moveToFirst();
                if (cursorQueryMiniThumbnail.getCount() > 0) {
                    String string = cursorQueryMiniThumbnail.getString(cursorQueryMiniThumbnail.getColumnIndex("_data"));
                    if (new C0VSJ(string).exists()) {
                        C0VSP c0vsp = new C0VSP(string);
                        if (string == null) {
                            length = -1;
                        } else {
                            length = (int) new C0VSJ(string).length();
                        }
                        C1328480kfu c1328480kfuLIZJ = LIZJ(c0vsp, length);
                        cursorQueryMiniThumbnail.close();
                        return c1328480kfuLIZJ;
                    }
                }
                cursorQueryMiniThumbnail.close();
                return null;
            } catch (Throwable th) {
                th = th;
                cursor = cursorQueryMiniThumbnail;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        break;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public C1327260kdw(Executor executor, InterfaceC1327440keE interfaceC1327440keE, ContentResolver contentResolver) {
        super(executor, interfaceC1327440keE);
        this.LIZJ = contentResolver;
    }
}
