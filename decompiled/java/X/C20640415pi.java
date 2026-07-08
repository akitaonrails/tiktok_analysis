package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.15pi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20640415pi implements C0XEZ, InterfaceC486470J5x {
    public static final C20640415pi LL = new C20640415pi();

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:6:0x0010, B:8:0x0016, B:16:0x0061, B:10:0x002e, B:13:0x004d, B:15:0x005a), top: B:29:0x0010 }] */
    @Override // X.InterfaceC486470J5x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.bytedance.common.wschannel.model.WsChannelMsg r9) {
        /*
            r8 = this;
            X.01GW r0 = X.C19331310k3.LIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.IAccountUserService r0 = (com.ss.android.ugc.aweme.IAccountUserService) r0
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto Lf
            return
        Lf:
            r4 = 0
            int r1 = r9.method     // Catch: java.lang.Throwable -> L65
            r0 = 1778(0x6f2, float:2.492E-42)
            if (r1 != r0) goto L2e
            X.10k1 r5 = X.EnumC19331110k1.FROM_FRONTIER     // Catch: java.lang.Throwable -> L65
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L65
            byte[] r2 = r9.LIZ()     // Catch: java.lang.Throwable -> L65
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L65
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8     // Catch: java.lang.Throwable -> L65
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L65
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L65
            com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r3 = X.C20640115pf.LIZJ(r5, r3)     // Catch: java.lang.Throwable -> L65
            if (r3 != 0) goto L61
        L2e:
            byte[] r2 = r9.LIZ()     // Catch: java.lang.Throwable -> L65
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L65
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8     // Catch: java.lang.Throwable -> L65
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L65
            java.lang.Class<com.ss.android.ugc.aweme.innerpush.model.PushWrapper> r0 = com.ss.android.ugc.aweme.innerpush.model.PushWrapper.class
            java.lang.Object r7 = X.C08JS.LIZ(r1, r0)     // Catch: java.lang.Throwable -> L65
            com.ss.android.ugc.aweme.innerpush.model.PushWrapper r7 = (com.ss.android.ugc.aweme.innerpush.model.PushWrapper) r7     // Catch: java.lang.Throwable -> L65
            java.lang.String r1 = r7.getExtraStr()     // Catch: java.lang.Throwable -> L65
            r0 = 1
            com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r3 = X.C19331310k3.LJIIIZ(r1, r0)     // Catch: java.lang.Throwable -> L65
            if (r3 != 0) goto L4d
            return
        L4d:
            X.C19331310k3.LIZLLL(r3, r7)     // Catch: java.lang.Throwable -> L65
            long r5 = r3.getRid()     // Catch: java.lang.Throwable -> L65
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L61
            long r0 = r7.getRid()     // Catch: java.lang.Throwable -> L65
            r3.setRid(r0)     // Catch: java.lang.Throwable -> L65
        L61:
            X.C189200o6.m2constructorimpl(r3)     // Catch: java.lang.Throwable -> L65
            goto L71
        L65:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r3 = new X.00Yq
            r3.<init>(r0)
            X.C189200o6.m2constructorimpl(r3)
        L71:
            boolean r0 = X.C189200o6.m8isSuccessimpl(r3)
            if (r0 == 0) goto L94
            r2 = r3
            com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r2 = (com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage) r2
            X.10k1 r0 = X.EnumC19331110k1.FROM_FRONTIER
            r2.markReceiveFrom(r0)
            X.10k2 r0 = X.C19331210k2.LIZ
            r0.getClass()
            X.C19331210k2.LJIIJJI(r2)
            boolean r0 = X.C20640515pj.LIZ(r2)
            if (r0 == 0) goto L8e
            return
        L8e:
            com.ss.android.ugc.aweme.innerpush.core.InnerPushQueueLooper r1 = com.ss.android.ugc.aweme.innerpush.core.InnerPushQueueLooper.LL
            r0 = 4
            com.ss.android.ugc.aweme.innerpush.core.InnerPushQueueLooper.LJFF(r1, r2, r0)
        L94:
            java.lang.Throwable r3 = X.C189200o6.m5exceptionOrNullimpl(r3)
            if (r3 == 0) goto Laf
            X.10k2 r2 = X.C19331210k2.LIZ
            X.10nz r1 = X.EnumC19355710nz.FRONTIER_RECEIVE_MSG
            java.lang.String r0 = r3.getMessage()
            r2.getClass()
            X.C19331210k2.LJIIIZ(r4, r1, r0)
            java.lang.String r1 = "FrontierNotifier"
            java.lang.String r0 = "onReceiveMsg error"
            X.C19290510dT.LIZJ(r1, r0, r3)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20640415pi.LIZIZ(com.bytedance.common.wschannel.model.WsChannelMsg):void");
    }

    @Override // X.C0XEZ
    public final void LIZ(C821280WJq c821280WJq, JSONObject jSONObject) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceiveConnectEvent:");
        sbLIZ.append(c821280WJq.LIZIZ);
        C19290510dT.LIZ("FrontierNotifier", C2188811AlT.LIZIZ(sbLIZ));
    }
}
