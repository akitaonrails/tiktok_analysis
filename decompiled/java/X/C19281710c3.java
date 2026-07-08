package X;

import Y.AObjectS74S0000000_24;

/* JADX INFO: renamed from: X.10c3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19281710c3 {
    public static Boolean LIZ;

    public static void LIZIZ() {
        C10UB.LIZ.getClass();
        int iLIZIZ = C10UB.LIZIZ("active_days_record_switch");
        if (iLIZIZ != -1) {
            boolean z = iLIZIZ == 1;
            LIZ = Boolean.valueOf(z);
            C19281810c4 c19281810c4 = C19281810c4.LIZ;
            String strValueOf = String.valueOf(z);
            c19281810c4.getClass();
            C10ZP.LIZJ("active_manager", "core_switch", strValueOf);
            C19282310c9.LIZIZ("updateSwitchCache", new AObjectS74S0000000_24(5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(final java.lang.String r3) {
        /*
            java.lang.Boolean r0 = X.C19281710c3.LIZ
            if (r0 != 0) goto L1d
            X.10c4 r0 = X.C19281810c4.LIZ
            r0.getClass()
            java.lang.String r1 = "active_manager"
            java.lang.String r0 = "core_switch"
            java.lang.String r1 = X.C10ZP.LIZ(r1, r0)
            java.lang.String r0 = "true"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C19281710c3.LIZ = r0
        L1d:
            java.lang.Boolean r1 = X.C19281710c3.LIZ
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            java.lang.String r2 = "Launch"
            if (r0 != 0) goto L34
            Y.AObjectS78S0000000_28 r1 = new Y.AObjectS78S0000000_28
            r0 = 15
            r1.<init>(r0)
            X.C19282310c9.LIZIZ(r2, r1)
            return
        L34:
            int r1 = r3.hashCode()
            r0 = -1646874943(0xffffffff9dd6aec1, float:-5.682602E-21)
            if (r1 == r0) goto L70
            r0 = 1107057793(0x41fc5c81, float:31.545168)
            if (r1 == r0) goto L65
            r0 = 1574763844(0x5ddcfd44, float:1.9904948E18)
            if (r1 != r0) goto L7b
            java.lang.String r0 = "hybrid_ab"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7b
            X.0wPR r1 = X.EnumC1779550wPR.HYBRID_AB
        L51:
            X.07Xt r0 = new X.07Xt
            r0.<init>()
            X.C19282310c9.LIZIZ(r2, r0)
            X.01GW<X.10c7> r0 = X.C19282110c7.LJ
            java.lang.Object r0 = r0.getValue()
            X.10c7 r0 = (X.C19282110c7) r0
            r0.LIZJ(r1)
            return
        L65:
            java.lang.String r0 = "on_app_foreground"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7b
            X.0wPR r1 = X.EnumC1779550wPR.APP_FOREGROUND
            goto L51
        L70:
            java.lang.String r0 = "delay_task"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7b
            X.0wPR r1 = X.EnumC1779550wPR.DELAY_TASK
            goto L51
        L7b:
            X.0wPR r1 = X.EnumC1779550wPR.APP_LAUNCH
            goto L51
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19281710c3.LIZ(java.lang.String):void");
    }
}
