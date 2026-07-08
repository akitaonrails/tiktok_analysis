package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.LongSparseArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0evl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1107670evl {
    public static LongSparseArray<WeakReference<Drawable.ConstantState>> LIZ;
    public static int LIZIZ;
    public static boolean LIZJ;

    public static void LIZ(Context context) {
        Object objLIZLLL;
        try {
            if ((context instanceof Activity) && Build.VERSION.SDK_INT >= 24 && !LIZJ && LIZ == null && LIZIZ == 0 && (objLIZLLL = C1965507mv.LIZLLL(context.getResources(), "mResourcesImpl")) != null) {
                LIZIZ = objLIZLLL.hashCode();
                Object objLIZLLL2 = C1965507mv.LIZLLL(objLIZLLL, "mDrawableCache");
                if (objLIZLLL2 != null) {
                    synchronized (objLIZLLL2) {
                        try {
                            Object objLIZ = C1965507mv.LIZ("getUnthemedLocked", objLIZLLL2, Boolean.TRUE);
                            if (objLIZ != null) {
                                LIZ = (LongSparseArray) objLIZ;
                            }
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
            }
        } catch (Exception th) {
        }
    }
}
