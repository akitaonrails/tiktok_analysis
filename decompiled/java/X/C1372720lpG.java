package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0lpG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C1372720lpG extends C2217421BqW implements Function1<InterfaceC1370310llN, Boolean> {
    public final /* synthetic */ C1379140lzc LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1372720lpG(C1379140lzc c1379140lzc) {
        super(1, C1449605lu.class, "actionFilter", "handleActionsByLPP$actionFilter(Lcom/ss/android/ugc/aweme/feed/share/action/SheetActionController;Lcom/ss/android/ugc/aweme/share/base/model/SheetAction;)Z", 0);
        this.LL = c1379140lzc;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0086  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke(X.InterfaceC1370310llN r3) {
        /*
            r2 = this;
            X.0llN r3 = (X.InterfaceC1370310llN) r3
            X.0lzc r1 = r2.LL
            java.util.ArrayList<java.lang.String> r0 = X.C1379140lzc.LJIJI
            boolean r0 = r3 instanceof X.C1372710lpF
            if (r0 == 0) goto L15
            X.0lpF r3 = (X.C1372710lpF) r3
            boolean r0 = r3.enable()
        L10:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L15:
            boolean r0 = r3 instanceof X.C0M80
            if (r0 == 0) goto L57
            java.lang.String r1 = r1.LJIIIIZZ
            X.0lza r0 = X.C1379120lza.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.longpress.LPPProtocol r0 = X.C1379120lza.LIZ()
            if (r0 == 0) goto L55
            X.01GW r0 = r0.LIZ
            java.lang.Object r0 = r0.getValue()
            java.util.HashMap r0 = (java.util.HashMap) r0
            if (r0 == 0) goto L55
            java.lang.Object r1 = r0.get(r1)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L55
            com.ss.android.ugc.aweme.longpress.LPPProtocol r0 = X.C1379120lza.LIZ()
            if (r0 == 0) goto L53
            java.lang.String r0 = r0.rootKey
        L40:
            java.lang.Object r0 = r1.get(r0)
            com.ss.android.ugc.aweme.longpress.LongPressStructure r0 = (com.ss.android.ugc.aweme.longpress.LongPressStructure) r0
            if (r0 == 0) goto L55
            java.util.List<java.lang.String> r1 = r0.children
            if (r1 == 0) goto L55
            java.lang.String r0 = "share_container"
            boolean r0 = r1.contains(r0)
            goto L10
        L53:
            r0 = 0
            goto L40
        L55:
            r0 = 0
            goto L10
        L57:
            java.lang.String r1 = r3.key()
            java.lang.String r0 = "clear_mode"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r1 = 1
            if (r0 != 0) goto L86
            X.0lza r0 = X.C1379120lza.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.longpress.LPPProtocol r0 = X.C1379120lza.LIZ()
            if (r0 == 0) goto L86
            com.ss.android.ugc.aweme.longpress.LongPressPanelConfig r0 = r0.longPressPanelConfig
            if (r0 == 0) goto L86
            com.ss.android.ugc.aweme.longpress.LongPressPanelStyleConfig r0 = r0.styleConfig
            if (r0 == 0) goto L86
            java.lang.Boolean r0 = r0.actionShowStrategy
            if (r0 == 0) goto L86
            boolean r0 = r0.booleanValue()
            if (r0 != r1) goto L86
            boolean r0 = r3.enable()
            goto L10
        L86:
            r0 = 1
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1372720lpG.invoke(java.lang.Object):java.lang.Object");
    }
}
