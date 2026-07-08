package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.utils.AVLog;

/* JADX INFO: renamed from: X.07md, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1963707md {
    public static volatile Object LIZ;

    public static void LIZJ() {
        Object objLIZIZ = LIZIZ("triggerSmartHarPredict", new Class[]{String.class, Boolean.TYPE}, new Object[]{null, Boolean.TRUE});
        if (objLIZIZ instanceof Boolean) {
            ((Boolean) objLIZIZ).booleanValue();
        }
    }

    public static Object LIZ() {
        if (LIZ == null) {
            synchronized (C1963707md.class) {
                try {
                    if (LIZ == null) {
                        try {
                            LIZ = Class.forName("com.ss.android.ugc.aweme.ml.api.SmartHARService").getMethod("instance", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Failed to get SmartHARService instance: ");
                            sbLIZ.append(e);
                            AVLog.e("TTLHSmartHARServiceReflect", C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }

    public static Object LIZIZ(String str, Class<?>[] clsArr, Object[] objArr) {
        try {
            Object objLIZ = LIZ();
            if (objLIZ != null) {
                return C2204961BRm.a0(objLIZ.getClass().getMethod(str, clsArr), objLIZ, objArr, new C0WZX("dzBzEhEpEd7IWV43QAGQdGXVEhh91R8v3lLlFyDBs1F9EiiwUmpc8ydt9gvjRS6kDT/yRAHRalbzZa+ngrGHgmiD", null));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            AVLog.e("TTLHSmartHARServiceReflect", "Failed to invoke method: " + str + ", error: " + e);
        }
        return null;
    }
}
