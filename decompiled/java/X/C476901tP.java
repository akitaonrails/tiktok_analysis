package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Build;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01tP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C476901tP {
    public static final List LIZ(int i, List list) {
        if (list.size() <= i) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        float size = ((list.size() - 1) * 1.0f) / (i - 1);
        int i2 = i - 2;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                arrayList.add(ListProtector.get(list, Math.round(i3 * size)));
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        arrayList.add(C13LP.LJJLIIIJJI(list));
        return arrayList;
    }

    public static final Bitmap LIZIZ(Bitmap bitmap, float f, float f2) {
        float width = f / bitmap.getWidth();
        float height = f2 / bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(width, height);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.graphics.Bitmap] */
    public static final boolean LIZJ(Bitmap bitmap, String str, String str2, boolean z) {
        C0VSV c0vsv;
        if (!Intrinsics.LJFF("mounted", C786410Ut5.X3())) {
            return false;
        }
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c0vsj);
        sbLIZ.append('/');
        sbLIZ.append(str2);
        C0VSJ c0vsj2 = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        if (!c0vsj2.exists()) {
            try {
                c0vsj2.createNewFile();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        ?? r2 = 0;
        C0VSV c0vsv2 = null;
        try {
            try {
                c0vsv = new C0VSV(c0vsj2);
                r2 = 90;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            if (!z) {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 90, c0vsv);
            } else if (Build.VERSION.SDK_INT >= 30) {
                bitmap.compress(Bitmap.CompressFormat.WEBP_LOSSY, 90, c0vsv);
            } else {
                bitmap.compress(Bitmap.CompressFormat.WEBP, 90, c0vsv);
            }
            c0vsv.flush();
            try {
                c0vsv.close();
                return true;
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                return true;
            }
        } catch (Exception e4) {
            e = e4;
            r2 = c0vsv;
            TryCatchGuardChecker.doCheck(e);
            try {
                r2.close();
                return false;
            } catch (Exception e5) {
                TryCatchGuardChecker.doCheck(e5);
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
            c0vsv2 = c0vsv;
            TryCatchGuardChecker.doCheck(th);
            try {
                c0vsv2.close();
                throw th;
            } catch (Exception e6) {
                TryCatchGuardChecker.doCheck(e6);
                throw th;
            }
        }
    }
}
