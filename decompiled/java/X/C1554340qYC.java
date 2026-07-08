package X;

import com.bytedance.geckox.model.UpdatePackage;

/* JADX INFO: renamed from: X.0qYC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1554340qYC extends AbstractC1552040qUU {
    public final int $t;

    @Override // X.AbstractC1552040qUU
    public final void LJIJJLI(UpdatePackage updatePackage) {
        if (this.$t != 0) {
            super.LJIJJLI(updatePackage);
        } else {
            LJIJJLI$0(this, updatePackage);
        }
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIL(long j, UpdatePackage updatePackage) {
        switch (this.$t) {
            case 0:
                LJIL$0(this, j, updatePackage);
                break;
            case 1:
                LJIL$1(this, j, updatePackage);
                break;
            default:
                super.LJIL(j, updatePackage);
                break;
        }
    }

    public C1554340qYC(int i) {
        this.$t = i;
    }

    public static final void LJIJJLI$0(C1554340qYC c1554340qYC, UpdatePackage updatePackage) {
        String channel;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUpdateStart, channel:");
        if (updatePackage != null) {
            channel = updatePackage.getChannel();
        } else {
            channel = null;
        }
        sbLIZ.append(channel);
        C1534250q1n.LJII("GeckoXAdapter", C2188811AlT.LIZIZ(sbLIZ), false);
    }

    public static final void LJIL$0(C1554340qYC c1554340qYC, long j, UpdatePackage updatePackage) {
        String channel;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUpdateSuccess, channel:");
        if (updatePackage != null) {
            channel = updatePackage.getChannel();
        } else {
            channel = null;
        }
        sbLIZ.append(channel);
        sbLIZ.append(" version:");
        sbLIZ.append(j);
        C1534250q1n.LJII("GeckoXAdapter", C2188811AlT.LIZIZ(sbLIZ), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIL$1(X.C1554340qYC r6, long r7, com.bytedance.geckox.model.UpdatePackage r9) {
        /*
            X.00w2 r6 = new X.00w2
            r6.<init>()
            if (r9 == 0) goto L56
            boolean r1 = r9.getUpdateWithPatch()
            r0 = 1
            if (r1 != r0) goto L56
        Le:
            r5 = 0
            if (r0 == 0) goto L43
            com.bytedance.geckox.model.UpdatePackage$Package r0 = r9.getPatch()
            if (r0 == 0) goto L21
            com.bytedance.geckox.model.UpdatePackage$Package r0 = r9.getPatch()
            long r0 = r0.getLength()
            r6.element = r0
        L21:
            X.00w2 r4 = new X.00w2
            r4.<init>()
            r1 = 0
            if (r9 == 0) goto L58
            X.0qU7 r0 = r9.getStatisticModel()
            if (r0 == 0) goto L58
            long r7 = r0.LJIIJ
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L58
            if (r9 == 0) goto L40
            X.0qU7 r0 = r9.getStatisticModel()
            if (r0 == 0) goto L40
            long r1 = r0.LJIIJ
        L40:
            r4.element = r1
            goto L58
        L43:
            if (r9 == 0) goto L21
            com.bytedance.geckox.model.UpdatePackage$Package r0 = r9.getFullPackage()
            if (r0 == 0) goto L21
            com.bytedance.geckox.model.UpdatePackage$Package r0 = r9.getFullPackage()
            long r0 = r0.getLength()
            r6.element = r0
            goto L21
        L56:
            r0 = 0
            goto Le
        L58:
            X.03Hh r3 = X.C817503Hh.LL     // Catch: java.lang.Exception -> L8f
            X.1DFB r2 = X.C0PEM.LIZJ     // Catch: java.lang.Exception -> L8f
            X.09Od r1 = new X.09Od     // Catch: java.lang.Exception -> L8f
            r1.<init>(r9, r6, r4, r5)     // Catch: java.lang.Exception -> L8f
            r0 = 2
            X.C23250099c.LIZLLL(r3, r2, r5, r1, r0)     // Catch: java.lang.Exception -> L8f
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L8f
            java.lang.String r0 = "1111onUpdateSuccess channelname="
            r2.append(r0)     // Catch: java.lang.Exception -> L8f
            if (r9 == 0) goto L74
            java.lang.String r5 = r9.getChannel()     // Catch: java.lang.Exception -> L8f
        L74:
            r2.append(r5)     // Catch: java.lang.Exception -> L8f
            java.lang.String r0 = "  size="
            r2.append(r0)     // Catch: java.lang.Exception -> L8f
            long r0 = r6.element     // Catch: java.lang.Exception -> L8f
            r2.append(r0)     // Catch: java.lang.Exception -> L8f
            java.lang.String r0 = " unzipDur="
            r2.append(r0)     // Catch: java.lang.Exception -> L8f
            long r0 = r4.element     // Catch: java.lang.Exception -> L8f
            r2.append(r0)     // Catch: java.lang.Exception -> L8f
            X.C2188811AlT.LIZIZ(r2)     // Catch: java.lang.Exception -> L8f
            return
        L8f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1554340qYC.LJIL$1(X.0qYC, long, com.bytedance.geckox.model.UpdatePackage):void");
    }
}
