package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.0EKp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C362890EKp {
    /* JADX WARN: Removed duplicated region for block: B:5:0x0004  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZ(com.ss.android.ugc.effectmanager.effect.model.Effect r3) {
        /*
            r2 = 0
            if (r3 == 0) goto L4
            goto L6
        L4:
            r1 = r2
            goto L1b
        L6:
            java.lang.String r0 = r3.getExtra()     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L4
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1f
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = "is_effect_style"
            boolean r0 = r1.optBoolean(r0)     // Catch: java.lang.Throwable -> L1f
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L1f
        L1b:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L1f
            goto L2b
        L1f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L2b:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L32
            r2 = r1
        L32:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C362890EKp.LIZ(com.ss.android.ugc.effectmanager.effect.model.Effect):boolean");
    }

    public static final <T> T LIZIZ(Effect effect, Class<T> cls) {
        T t;
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            String extra = effect.getExtra();
            c1227904rF.getClass();
            t = (T) C1227904rF.LIZIZ(extra, cls);
            C189200o6.m2constructorimpl(t);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            t = (T) new C098200Yq(th);
            C189200o6.m2constructorimpl(t);
        }
        if (C189200o6.m7isFailureimpl(t)) {
            return null;
        }
        return t;
    }

    public static final <T> T LIZJ(Effect effect, Class<T> cls) {
        T t;
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            String sdkExtra = effect.getSdkExtra();
            c1227904rF.getClass();
            t = (T) C1227904rF.LIZIZ(sdkExtra, cls);
            C189200o6.m2constructorimpl(t);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            t = (T) new C098200Yq(th);
            C189200o6.m2constructorimpl(t);
        }
        if (C189200o6.m7isFailureimpl(t)) {
            return null;
        }
        return t;
    }
}
