package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.io.BufferedOutputStream;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.01sy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C474201sy {
    public static final C474201sy LIZ = new C474201sy();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(565));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(581));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(580));

    public final void LIZ(String str) {
        Pair pairLIZ = C0HBT.LIZ();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((Number) pairLIZ.getFirst()).intValue(), ((Number) pairLIZ.getSecond()).intValue(), Bitmap.Config.ARGB_8888);
        LIZIZ(this, bitmapCreateBitmap, str, Bitmap.CompressFormat.WEBP);
        bitmapCreateBitmap.recycle();
        BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
    }

    public static void LIZIZ(C474201sy c474201sy, Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) throws Throwable {
        c474201sy.getClass();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new C0VSV(new C0VSJ(str)));
        Throwable th = null;
        try {
            bitmap.compress(compressFormat, 100, bufferedOutputStream);
            bufferedOutputStream.flush();
            C2107108Nh.LIZ(bufferedOutputStream, null);
        } catch (Throwable th2) {
            try {
                TryCatchGuardChecker.doCheck(th2);
                try {
                    throw th2;
                } catch (Throwable th3) {
                    th = th3;
                    th = th2;
                    while (true) {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            C2107108Nh.LIZ(bufferedOutputStream, th);
                            throw th;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }
}
