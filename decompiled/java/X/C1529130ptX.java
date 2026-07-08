package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0ptX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1529130ptX {
    public static InterfaceC1529220ptg LIZIZ;
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1529190ptd());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C1529200pte());
    public static final C01GW LJ = C452501pT.LIZIZ(new C1529240pti());
    public static final C01GW LJFF = C452501pT.LIZIZ(new C1529050ptP());
    public static final C01GW LJI = C452501pT.LIZIZ(new C1529210ptf());

    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1529100ptU LIZ(java.lang.String r9, X.C1529040ptO r10) {
        /*
            r10.getClass()
            X.01GW r1 = X.C1529150ptZ.LIZIZ
            java.lang.Object r0 = r1.getValue()
            com.bytedance.keva.Keva r0 = (com.bytedance.keva.Keva) r0
            r7 = r9
            boolean r0 = r0.contains(r7)
            r6 = 0
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r1.getValue()
            com.bytedance.keva.Keva r0 = (com.bytedance.keva.Keva) r0
            java.lang.String r0 = r0.getString(r7, r6)
            if (r0 == 0) goto L74
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L52
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L52
            java.lang.String r0 = "expire"
            long r3 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getLong(r5, r0)     // Catch: java.lang.Throwable -> L52
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L52
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L74
            java.lang.String r0 = "info"
            java.lang.String r1 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r5, r0)     // Catch: java.lang.Throwable -> L52
            java.lang.Class<com.bytedance.lynx.hybrid.info.model.HybridInfo> r0 = com.bytedance.lynx.hybrid.info.model.HybridInfo.class
            java.lang.Object r0 = X.C1058250de3.LIZ(r1, r0)     // Catch: java.lang.Throwable -> L52
            com.bytedance.lynx.hybrid.info.model.HybridInfo r0 = (com.bytedance.lynx.hybrid.info.model.HybridInfo) r0     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L7f
            X.0ptU r2 = new X.0ptU
            r3 = 1
            java.util.List r4 = java.util.Collections.singletonList(r0)
            X.0gIF r8 = X.EnumC1160050gIF.NONE
            r5 = r7
            r6 = r6
            r7 = r6
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
        L52:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getHybridInfo parse fail, oid:"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ", error:"
            r1.append(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            r0 = 6
            X.C2283308x5.LIZ(r0, r1, r6)
        L74:
            X.01GW r0 = X.C1529150ptZ.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.bytedance.keva.Keva r0 = (com.bytedance.keva.Keva) r0
            r0.erase(r7)
        L7f:
            boolean r0 = r10.LIZJ
            if (r0 == 0) goto L90
            X.0ptU r4 = new X.0ptU
            r5 = 0
            X.0ptV r8 = X.EnumC1529110ptV.CACHE_MISS_ERROR
            java.lang.String r9 = "cache miss."
            X.0gIF r10 = X.EnumC1160050gIF.NONE
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        L90:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1529130ptX.LIZ(java.lang.String, X.0ptO):X.0ptU");
    }
}
