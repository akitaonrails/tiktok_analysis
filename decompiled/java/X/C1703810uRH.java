package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.pns.product.deps.IPNSProductAccountDepService;

/* JADX INFO: renamed from: X.0uRH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1703810uRH implements InterfaceC1703830uRJ {
    public static final C1703810uRH LIZ = new C1703810uRH();

    @Override // X.InterfaceC1703830uRJ
    public final boolean LIZJ() {
        String curUserId;
        C1703820uRI.LIZ.getClass();
        Keva keva = C1703820uRI.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("audience_control_status_");
        IPNSProductAccountDepService iPNSProductAccountDepService = (IPNSProductAccountDepService) PluggableExtentionKt.pluggableSpi$default(IPNSProductAccountDepService.class, false, false, false, 14, null);
        if (iPNSProductAccountDepService == null || (curUserId = iPNSProductAccountDepService.getCurUserId()) == null) {
            curUserId = CardStruct.IStatusCode.DEFAULT;
        }
        sbLIZ.append(curUserId);
        return keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    @Override // X.InterfaceC1703830uRJ
    public final void LIZ(boolean z) {
        String curUserId;
        C1703820uRI.LIZ.getClass();
        Keva keva = C1703820uRI.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("audience_control_status_");
        IPNSProductAccountDepService iPNSProductAccountDepService = (IPNSProductAccountDepService) PluggableExtentionKt.pluggableSpi$default(IPNSProductAccountDepService.class, false, false, false, 14, null);
        if (iPNSProductAccountDepService == null || (curUserId = iPNSProductAccountDepService.getCurUserId()) == null) {
            curUserId = CardStruct.IStatusCode.DEFAULT;
        }
        sbLIZ.append(curUserId);
        keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), z);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @Override // X.InterfaceC1703830uRJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(boolean r11, X.InterfaceC1364105Vn<? super X.C189200o6<? extends com.ss.android.ugc.aweme.network.model.BaseResponse>> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.C1703800uRG
            if (r0 == 0) goto L22
            r6 = r12
            X.0uRG r6 = (X.C1703800uRG) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r3 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r4 = 1
            if (r0 == 0) goto L30
            if (r0 != r4) goto L28
            boolean r11 = r6.LL
            goto L4a
        L22:
            X.0uRG r6 = new X.0uRG
            r6.<init>(r10, r12)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r3)
            X.0XtD r2 = com.ss.android.ugc.tiktok.pns.utils.network.api.UserSetSettingsApi.LIZ     // Catch: java.lang.Throwable -> L53
            java.lang.String r1 = "enable_audience_control"
            if (r11 == 0) goto L3b
            r0 = 1
            goto L3c
        L3b:
            r0 = 0
        L3c:
            r6.LL = r11     // Catch: java.lang.Throwable -> L53
            r6.LLILZ = r4     // Catch: java.lang.Throwable -> L53
            r2.getClass()     // Catch: java.lang.Throwable -> L53
            java.lang.Object r3 = X.C862930XtD.LIZ(r1, r0, r6)     // Catch: java.lang.Throwable -> L53
            if (r3 != r5) goto L4d
            return r5
        L4a:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L53
        L4d:
            com.ss.android.ugc.aweme.network.model.BaseResponse r3 = (com.ss.android.ugc.aweme.network.model.BaseResponse) r3     // Catch: java.lang.Throwable -> L53
            X.C189200o6.m2constructorimpl(r3)     // Catch: java.lang.Throwable -> L53
            goto L5f
        L53:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r3 = new X.00Yq
            r3.<init>(r0)
            X.C189200o6.m2constructorimpl(r3)
        L5f:
            boolean r0 = X.C189200o6.m8isSuccessimpl(r3)
            if (r0 == 0) goto L97
            X.0uRI r0 = X.C1703820uRI.LIZ
            r0.getClass()
            com.bytedance.keva.Keva r2 = X.C1703820uRI.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "audience_control_status_"
            r1.append(r0)
            java.lang.Class<com.ss.android.ugc.tiktok.pns.product.deps.IPNSProductAccountDepService> r4 = com.ss.android.ugc.tiktok.pns.product.deps.IPNSProductAccountDepService.class
            r5 = 0
            r8 = 14
            r9 = 0
            r6 = r5
            r7 = r5
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r4, r5, r6, r7, r8, r9)
            com.ss.android.ugc.tiktok.pns.product.deps.IPNSProductAccountDepService r0 = (com.ss.android.ugc.tiktok.pns.product.deps.IPNSProductAccountDepService) r0
            if (r0 == 0) goto L8b
            java.lang.String r0 = r0.getCurUserId()
            if (r0 != 0) goto L8d
        L8b:
            java.lang.String r0 = "0"
        L8d:
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.storeBoolean(r0, r11)
        L97:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1703810uRH.LIZIZ(boolean, X.05Vn):java.lang.Object");
    }
}
