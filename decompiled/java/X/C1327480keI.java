package X;

import Y.ARunnableS42S0300000_9;
import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.util.Size;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0keI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1327480keI implements InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>> {
    public final Executor LIZ;
    public final Executor LIZIZ;
    public final ContentResolver LIZJ;

    public static Bitmap LIZLLL(C1325710kbR c1325710kbR) {
        InterfaceC1324680kZm interfaceC1324680kZmLJ;
        InterfaceC1317730kOZ interfaceC1317730kOZLJIIJ;
        File file;
        try {
            if (c1325710kbR.LIZLLL()) {
                interfaceC1324680kZmLJ = C1324810kZz.LJI().LIZLLL(c1325710kbR);
            } else {
                C1324810kZz c1324810kZzLJI = C1324810kZz.LJI();
                c1324810kZzLJI.getClass();
                interfaceC1324680kZmLJ = c1324810kZzLJI.LJ(c1325710kbR.LIZIZ);
            }
            EnumC1325560kbC enumC1325560kbC = c1325710kbR.LIZ;
            if (enumC1325560kbC == EnumC1325560kbC.CUSTOM) {
                InterfaceC1326920kdO interfaceC1326920kdO = (InterfaceC1326920kdO) C1328130kfL.LJIILIIL().LJIIIZ().get(c1325710kbR.LJIL);
                if (interfaceC1326920kdO != null) {
                    interfaceC1317730kOZLJIIJ = interfaceC1326920kdO.LJIIJ(interfaceC1324680kZmLJ);
                } else {
                    interfaceC1317730kOZLJIIJ = null;
                }
            } else if (enumC1325560kbC == EnumC1325560kbC.SMALL) {
                interfaceC1317730kOZLJIIJ = C1328130kfL.LJIILIIL().LJIJJ().LJIIJ(interfaceC1324680kZmLJ);
            } else {
                interfaceC1317730kOZLJIIJ = C1328130kfL.LJIILIIL().LJIILL().LJIIJ(interfaceC1324680kZmLJ);
            }
            if ((interfaceC1317730kOZLJIIJ instanceof C1335740krc) && (file = ((C1335740krc) interfaceC1317730kOZLJIIJ).LIZ) != null && file.exists()) {
                return BitmapFactory.decodeFile(file.getAbsolutePath());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getCachedBitmapFromFile ");
            sbLIZ.append(e);
            C1328570kg3.LJFF("VideoThumbnailProducer", C2188811AlT.LIZIZ(sbLIZ));
        }
        return null;
    }

    public final String LJ(C1325710kbR c1325710kbR) throws Throwable {
        String str;
        String[] strArr;
        Uri uri = c1325710kbR.LIZIZ;
        if ("file".equals(C1325880kbi.LIZ(uri))) {
            return c1325710kbR.LIZJ().getPath();
        }
        if (C1325880kbi.LIZLLL(uri)) {
            if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
                String documentId = DocumentsContract.getDocumentId(uri);
                uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                strArr = new String[]{documentId.split(":")[1]};
                str = "_id=?";
            } else {
                str = null;
                strArr = null;
            }
            Cursor cursorLJJJ = C2204961BRm.LJJJ(this.LIZJ, uri, new String[]{"_data"}, str, strArr, null, new C0WZX("dzBzEgQ7XM/eWlgqCxuJZ9R1iSH8CvqoEW3SbK9pZCoLP1ExETQoqDB8O4onSastsNPFrkiNH7s6IzH2zcu+tQ==", new String[]{"019e5"}));
            if (cursorLJJJ != null) {
                try {
                    if (cursorLJJJ.moveToFirst()) {
                        String string = cursorLJJJ.getString(cursorLJJJ.getColumnIndexOrThrow("_data"));
                        cursorLJJJ.close();
                        return string;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    cursorLJJJ.close();
                    throw th;
                }
            }
            if (cursorLJJJ != null) {
                cursorLJJJ.close();
            }
        }
        return null;
    }

    public static void LIZJ(C1325710kbR c1325710kbR, final Bitmap bitmap) {
        InterfaceC1324680kZm interfaceC1324680kZmLJ;
        InterfaceC1326920kdO interfaceC1326920kdOLJIILL;
        try {
            final boolean zLIZLLL = c1325710kbR.LIZLLL();
            if (zLIZLLL) {
                interfaceC1324680kZmLJ = C1324810kZz.LJI().LIZLLL(c1325710kbR);
            } else {
                C1324810kZz c1324810kZzLJI = C1324810kZz.LJI();
                c1324810kZzLJI.getClass();
                interfaceC1324680kZmLJ = c1324810kZzLJI.LJ(c1325710kbR.LIZIZ);
            }
            EnumC1325560kbC enumC1325560kbC = c1325710kbR.LIZ;
            if (enumC1325560kbC == EnumC1325560kbC.CUSTOM) {
                interfaceC1326920kdOLJIILL = (InterfaceC1326920kdO) C1328130kfL.LJIILIIL().LJIIIZ().get(c1325710kbR.LJIL);
            } else if (enumC1325560kbC == EnumC1325560kbC.SMALL) {
                interfaceC1326920kdOLJIILL = C1328130kfL.LJIILIIL().LJIJJ();
            } else {
                interfaceC1326920kdOLJIILL = C1328130kfL.LJIILIIL().LJIILL();
            }
            if (interfaceC1326920kdOLJIILL != null) {
                interfaceC1326920kdOLJIILL.LJIIIIZZ(interfaceC1324680kZmLJ, new InterfaceC1327040kda() { // from class: X.0keN
                    @Override // X.InterfaceC1327040kda
                    public final void LIZ(C1335560krK c1335560krK) {
                        Bitmap.CompressFormat compressFormat;
                        int i;
                        if (zLIZLLL) {
                            compressFormat = Bitmap.CompressFormat.JPEG;
                            i = 85;
                        } else {
                            compressFormat = Bitmap.CompressFormat.PNG;
                            i = 100;
                        }
                        bitmap.compress(compressFormat, i, c1335560krK);
                    }
                });
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cacheBitmapToFile ");
            sbLIZ.append(e);
            C1328570kg3.LJFF("VideoThumbnailProducer", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0keJ, java.lang.Runnable] */
    @Override // X.InterfaceC1327390ke9
    public final void LIZIZ(final InterfaceC1328020kfA<C1323050kX9<AbstractC1327750kej>> interfaceC1328020kfA, InterfaceC1327930kf1 interfaceC1327930kf1) {
        final InterfaceC1325690kbP interfaceC1325690kbPLIZ = interfaceC1327930kf1.LIZ();
        final String id = interfaceC1327930kf1.getId();
        final C1325710kbR c1325710kbRLJFF = interfaceC1327930kf1.LJFF();
        final ?? r1 = new AbstractC1327520keM<C1323050kX9<AbstractC1327750kej>>(interfaceC1328020kfA, interfaceC1325690kbPLIZ, id) { // from class: X.0keJ
            @Override // X.AbstractRunnableC2124508Tz
            public final Object LIZJ() throws Throwable {
                boolean z;
                int i;
                int i2;
                int i3;
                int i4;
                this.LLJ.getClass();
                if (!C1328130kfL.LJIILIIL().LJJIIZ) {
                    C1328800kgQ c1328800kgQLJII = C1328800kgQ.LJII();
                    c1328800kgQLJII.getClass();
                    try {
                        C1332310km5 c1332310km5 = c1328800kgQLJII.LIZ.LJJIJIL;
                        InterfaceC2217461Bqa[] interfaceC2217461BqaArr = C1332300km4.LJJIJL;
                        z = ((Boolean) c1332310km5.LIZ()).booleanValue();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("isNewLocalVideoThumbnailOptEnabled: t = ");
                        sbLIZ.append(th);
                        C1328570kg3.LJFF("debug_tt", C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
                if (!z) {
                    C1327480keI c1327480keI = this.LLJ;
                    C1325710kbR c1325710kbR = c1325710kbRLJFF;
                    String strLJ = c1327480keI.LJ(c1325710kbR);
                    if (strLJ == null) {
                        return null;
                    }
                    Bitmap bitmapLIZLLL = C1327480keI.LIZLLL(c1325710kbR);
                    if (Build.VERSION.SDK_INT >= 29 && !Environment.isExternalStorageLegacy() && C1325880kbi.LIZLLL(c1325710kbR.LIZIZ)) {
                        ContentResolver contentResolver = c1327480keI.LIZJ;
                        Uri uri = c1325710kbR.LIZIZ;
                        C1324630kZh c1324630kZh = c1325710kbR.LJIIJJI;
                        if (c1324630kZh != null) {
                            i = c1324630kZh.LIZ;
                            i2 = c1324630kZh.LIZIZ;
                        } else {
                            i = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
                            i2 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
                        }
                        bitmapLIZLLL = contentResolver.loadThumbnail(uri, new Size(i, i2), null);
                    }
                    if (bitmapLIZLLL == null) {
                        C1324630kZh c1324630kZh2 = c1325710kbR.LJIIJJI;
                        bitmapLIZLLL = ThumbnailUtils.createVideoThumbnail(strLJ, (c1324630kZh2 == null || c1324630kZh2.LIZ > 96 || c1324630kZh2 == null || c1324630kZh2.LIZIZ > 96) ? 1 : 3);
                        if (bitmapLIZLLL == null) {
                            return null;
                        }
                        if (c1325710kbR.LIZLLL() && bitmapLIZLLL.getHeight() != 0 && c1325710kbR.LJIIJJI.LIZIZ != 0) {
                            float width = bitmapLIZLLL.getWidth() / bitmapLIZLLL.getHeight();
                            C1324630kZh c1324630kZh3 = c1325710kbR.LJIIJJI;
                            int i5 = c1324630kZh3.LIZ;
                            int i6 = c1324630kZh3.LIZIZ;
                            float f = i5;
                            float f2 = i6;
                            if (f / f2 > width) {
                                i6 = (int) (f / width);
                            } else {
                                i5 = (int) (f2 * width);
                            }
                            bitmapLIZLLL = Bitmap.createScaledBitmap(bitmapLIZLLL, i5, i6, true);
                        }
                        C1327480keI.LIZJ(c1325710kbR, bitmapLIZLLL);
                    }
                    return C1323050kX9.LJIJJLI(new C1325120kaU(bitmapLIZLLL, C530820Kro.LIZIZ(), C1328060kfE.LIZLLL, 0));
                }
                C1327480keI c1327480keI2 = this.LLJ;
                C1325710kbR c1325710kbR2 = c1325710kbRLJFF;
                c1327480keI2.getClass();
                Bitmap bitmapLIZLLL2 = C1327480keI.LIZLLL(c1325710kbR2);
                if (bitmapLIZLLL2 != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("cacheBitmapReadTask getCachedBitmapFromFile return ");
                    sbLIZ2.append(c1325710kbR2);
                    C1328570kg3.LIZIZ("VideoThumbnailProducer", C2188811AlT.LIZIZ(sbLIZ2));
                    return C1323050kX9.LJIJJLI(new C1325120kaU(bitmapLIZLLL2, C530820Kro.LIZIZ(), C1328060kfE.LIZLLL, 0));
                }
                if (Build.VERSION.SDK_INT >= 29 && C1325880kbi.LIZLLL(c1325710kbR2.LIZIZ)) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("aboveQThumbnailReadTask mContentResolver.loadThumbnail return ");
                    sbLIZ3.append(c1325710kbR2);
                    C1328570kg3.LIZIZ("VideoThumbnailProducer", C2188811AlT.LIZIZ(sbLIZ3));
                    ContentResolver contentResolver2 = c1327480keI2.LIZJ;
                    Uri uri2 = c1325710kbR2.LIZIZ;
                    C1324630kZh c1324630kZh4 = c1325710kbR2.LJIIJJI;
                    if (c1324630kZh4 != null) {
                        i3 = c1324630kZh4.LIZ;
                        i4 = c1324630kZh4.LIZIZ;
                    } else {
                        i3 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
                        i4 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
                    }
                    Bitmap bitmapLoadThumbnail = contentResolver2.loadThumbnail(uri2, new Size(i3, i4), null);
                    if (bitmapLoadThumbnail != null) {
                        c1327480keI2.LIZIZ.execute(new ARunnableS42S0300000_9(c1325710kbR2, bitmapLoadThumbnail.copy(bitmapLoadThumbnail.getConfig(), true), c1327480keI2, 7));
                        return C1323050kX9.LJIJJLI(new C1325120kaU(bitmapLoadThumbnail, C530820Kro.LIZIZ(), C1328060kfE.LIZLLL, 0));
                    }
                }
                String strLJ2 = c1327480keI2.LJ(c1325710kbR2);
                if (strLJ2 == null) {
                    return null;
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("aboveQThumbnailReadTask ThumbnailUtils.createVideoThumbnail return");
                sbLIZ4.append(c1325710kbR2);
                C1328570kg3.LIZIZ("VideoThumbnailProducer", C2188811AlT.LIZIZ(sbLIZ4));
                C1324630kZh c1324630kZh5 = c1325710kbR2.LJIIJJI;
                Bitmap bitmapCreateVideoThumbnail = ThumbnailUtils.createVideoThumbnail(strLJ2, (c1324630kZh5 == null || c1324630kZh5.LIZ > 96 || c1324630kZh5 == null || c1324630kZh5.LIZIZ > 96) ? 1 : 3);
                if (bitmapCreateVideoThumbnail == null) {
                    return null;
                }
                c1327480keI2.LIZIZ.execute(new ARunnableS42S0300000_9(c1325710kbR2, bitmapCreateVideoThumbnail.copy(bitmapCreateVideoThumbnail.getConfig(), true), c1327480keI2, 8));
                return C1323050kX9.LJIJJLI(new C1325120kaU(bitmapCreateVideoThumbnail, C530820Kro.LIZIZ(), C1328060kfE.LIZLLL, 0));
            }

            @Override // X.AbstractRunnableC2124508Tz
            public final void LIZIZ(Object obj) {
                C1323050kX9.LJII((C1323050kX9) obj);
            }

            @Override // X.AbstractC1327520keM, X.AbstractRunnableC2124508Tz
            public final void LJ(Exception exc) {
                super.LJ(exc);
                interfaceC1325690kbPLIZ.LJIIIZ(id, "VideoThumbnailProducer", false);
            }

            @Override // X.AbstractC1327520keM, X.AbstractRunnableC2124508Tz
            public final void LJFF(Object obj) {
                boolean z;
                super.LJFF(obj);
                InterfaceC1325690kbP interfaceC1325690kbP = interfaceC1325690kbPLIZ;
                String str = id;
                if (obj != null) {
                    z = true;
                } else {
                    z = false;
                }
                interfaceC1325690kbP.LJIIIZ(str, "VideoThumbnailProducer", z);
            }

            @Override // X.AbstractC1327520keM
            public final Map LJIIIIZZ(C1323050kX9<AbstractC1327750kej> c1323050kX9) {
                boolean z;
                if (c1323050kX9 != null) {
                    z = true;
                } else {
                    z = false;
                }
                return C19871212ow.of("createdThumbnail", String.valueOf(z));
            }
        };
        interfaceC1327930kf1.LJ(new C1330860kjk() { // from class: X.0keP
            @Override // X.InterfaceC1330340kiu
            public final void LIZJ() {
                r1.LIZ();
            }
        });
        this.LIZ.execute(r1);
    }

    public C1327480keI(Executor executor, Executor executor2, ContentResolver contentResolver) {
        this.LIZ = executor;
        this.LIZIZ = executor2;
        this.LIZJ = contentResolver;
    }

    public static void LJFF(C1325710kbR c1325710kbR, Bitmap bitmap, String str) {
        if (c1325710kbR.LIZLLL() && bitmap.getHeight() != 0 && c1325710kbR.LJIIJJI.LIZIZ != 0) {
            float width = bitmap.getWidth() / bitmap.getHeight();
            C1324630kZh c1324630kZh = c1325710kbR.LJIIJJI;
            int i = c1324630kZh.LIZ;
            int i2 = c1324630kZh.LIZIZ;
            float f = i;
            float f2 = i2;
            if (f / f2 > width) {
                i2 = (int) (f / width);
            } else {
                i = (int) (f2 * width);
            }
            bitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        }
        C1328570kg3.LIZIZ("VideoThumbnailProducer", str);
        LIZJ(c1325710kbR, bitmap);
    }
}
