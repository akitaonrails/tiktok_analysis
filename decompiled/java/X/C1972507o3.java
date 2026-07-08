package X;

import android.os.Build;
import android.view.SurfaceView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.07o3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1972507o3 {
    public static Field LIZ;
    public static Method LIZIZ;

    public static void LIZ(SurfaceView surfaceView) {
        if (Build.VERSION.SDK_INT != 33 || surfaceView == null) {
            return;
        }
        try {
            if (LIZ == null) {
                Field declaredField = SurfaceView.class.getDeclaredField("mBlastBufferQueue");
                LIZ = declaredField;
                declaredField.setAccessible(true);
            }
            Object obj = LIZ.get(surfaceView);
            if (obj == null) {
                C1481110oe5.LIZ("RepairAndroid13SurfaceView failed: mBlastBufferQueue is null");
                return;
            }
            if (LIZIZ == null) {
                Method declaredMethod = Class.forName("android.graphics.BLASTBufferQueue").getDeclaredMethod("setTransactionHangCallback", Class.forName("android.graphics.BLASTBufferQueue$TransactionHangCallback"));
                LIZIZ = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            LIZIZ.invoke(obj, null);
            C1481110oe5.LIZ("RepairAndroid13SurfaceView success");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("RepairAndroid13SurfaceView failed: ");
            sbLIZ.append(th);
            C1481110oe5.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
