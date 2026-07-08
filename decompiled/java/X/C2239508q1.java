package X;

import android.os.Handler;
import android.util.Log;
import com.bytedance.sysoptimizer.java.ReflectionUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.08q1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2239508q1 {
    public static final IUnKnownOwnershipBusinessOuterService LIZ = (IUnKnownOwnershipBusinessOuterService) PluggableExtentionKt.pluggableSpi(IUnKnownOwnershipBusinessOuterService.class);

    public static void LIZIZ(Handler handler, Handler handler2) {
        try {
            Field fieldLIZ = C1961107mD.LIZ(Handler.class, "mCallback");
            Handler.Callback callback = (Handler.Callback) fieldLIZ.get(handler);
            if (callback != null) {
                ReflectionUtils.removeFinal(fieldLIZ);
                fieldLIZ.set(handler2, callback);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            IUnKnownOwnershipBusinessOuterService iUnKnownOwnershipBusinessOuterService = LIZ;
            if (iUnKnownOwnershipBusinessOuterService != null) {
                Log.getStackTraceString(e);
                iUnKnownOwnershipBusinessOuterService.LJIIZILJ();
            }
        }
    }

    public static void LIZJ(Object obj, Field field, Object obj2) {
        try {
            C1960207m4.LIZIZ(C1960207m4.LIZ(field), obj, obj2);
            IUnKnownOwnershipBusinessOuterService iUnKnownOwnershipBusinessOuterService = LIZ;
            if (iUnKnownOwnershipBusinessOuterService != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("reset ");
                sbLIZ.append(obj.getClass().getName());
                sbLIZ.append(":");
                sbLIZ.append(field.getName());
                sbLIZ.append(" to ");
                sbLIZ.append(obj2.getClass().getName());
                sbLIZ.append(" success");
                C2188811AlT.LIZIZ(sbLIZ);
                iUnKnownOwnershipBusinessOuterService.LJIIZILJ();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            IUnKnownOwnershipBusinessOuterService iUnKnownOwnershipBusinessOuterService2 = LIZ;
            if (iUnKnownOwnershipBusinessOuterService2 != null) {
                Log.getStackTraceString(th);
                iUnKnownOwnershipBusinessOuterService2.LJIIZILJ();
            }
        }
    }

    public static void LIZ(Object obj, Field field, Object obj2, Object obj3) {
        try {
            C1960207m4.LIZIZ(C1960207m4.LIZ(field), obj, obj3);
            IUnKnownOwnershipBusinessOuterService iUnKnownOwnershipBusinessOuterService = LIZ;
            if (iUnKnownOwnershipBusinessOuterService != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("change ");
                sbLIZ.append(obj2.getClass().getName());
                sbLIZ.append(" to ");
                sbLIZ.append(obj3.getClass().getName());
                sbLIZ.append(" success");
                C2188811AlT.LIZIZ(sbLIZ);
                iUnKnownOwnershipBusinessOuterService.LJIIZILJ();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            IUnKnownOwnershipBusinessOuterService iUnKnownOwnershipBusinessOuterService2 = LIZ;
            if (iUnKnownOwnershipBusinessOuterService2 != null) {
                Log.getStackTraceString(th);
                iUnKnownOwnershipBusinessOuterService2.LJIIZILJ();
            }
        }
    }
}
