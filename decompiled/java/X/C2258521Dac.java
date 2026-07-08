package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.network.IGroupChatNetworkRequestApi;

/* JADX INFO: renamed from: X.1Dac, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2258521Dac implements IGroupChatNetworkRequestApi {
    public static final C2258521Dac LIZ = new C2258521Dac();
    public static final IGroupChatNetworkRequestApi LIZIZ;

    static {
        InterfaceC2661011f interfaceC2661011fLIZ;
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpiForReal(IRetrofitFactory.class);
        LIZIZ = (iRetrofitFactory == null || (interfaceC2661011fLIZ = iRetrofitFactory.LIZ(C1477305qN.LIZ)) == null) ? null : (IGroupChatNetworkRequestApi) interfaceC2661011fLIZ.create(IGroupChatNetworkRequestApi.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    @Override // com.ss.android.ugc.aweme.network.IGroupChatNetworkRequestApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.network.model.GetAuditListRequestBody r13, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.network.model.GetAuditListResponseBody> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof X.C2258541Dae
            if (r0 == 0) goto L42
            r3 = r14
            X.1Dae r3 = (X.C2258541Dae) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L42
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r4 = r3.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L48
            X.C155000ia.LIZIZ(r4)
        L22:
            if (r4 != 0) goto L31
        L24:
            com.ss.android.ugc.aweme.network.model.GetAuditListResponseBody r4 = new com.ss.android.ugc.aweme.network.model.GetAuditListResponseBody
            r5 = 0
            r6 = 0
            r7 = 0
            r10 = 15
            r9 = r6
            r11 = r5
            r4.<init>(r5, r6, r7, r9, r10, r11)
        L31:
            return r4
        L32:
            X.C155000ia.LIZIZ(r4)
            com.ss.android.ugc.aweme.network.IGroupChatNetworkRequestApi r0 = X.C2258521Dac.LIZIZ
            if (r0 == 0) goto L24
            r3.LLILLL = r1
            java.lang.Object r4 = r0.LIZ(r13, r3)
            if (r4 != r2) goto L22
            return r2
        L42:
            X.1Dae r3 = new X.1Dae
            r3.<init>(r12, r14)
            goto L12
        L48:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2258521Dac.LIZ(com.ss.android.ugc.aweme.network.model.GetAuditListRequestBody, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    @Override // com.ss.android.ugc.aweme.network.IGroupChatNetworkRequestApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.aweme.network.model.AuditClearUnreadRequest r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.base.api.BaseResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C2258511Dab
            if (r0 == 0) goto L3a
            r4 = r7
            X.1Dab r4 = (X.C2258511Dab) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3a
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2a
            if (r0 != r1) goto L40
            X.C155000ia.LIZIZ(r3)
        L22:
            if (r3 != 0) goto L29
        L24:
            com.ss.android.ugc.aweme.base.api.BaseResponse r3 = new com.ss.android.ugc.aweme.base.api.BaseResponse
            r3.<init>()
        L29:
            return r3
        L2a:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.network.IGroupChatNetworkRequestApi r0 = X.C2258521Dac.LIZIZ
            if (r0 == 0) goto L24
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LIZIZ(r6, r4)
            if (r3 != r2) goto L22
            return r2
        L3a:
            X.1Dab r4 = new X.1Dab
            r4.<init>(r5, r7)
            goto L12
        L40:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2258521Dac.LIZIZ(com.ss.android.ugc.aweme.network.model.AuditClearUnreadRequest, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    @Override // com.ss.android.ugc.aweme.network.IGroupChatNetworkRequestApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(com.ss.android.ugc.aweme.network.model.AuditBatchAckReqBody r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.network.model.AuditBatchAckResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C2258501Daa
            if (r0 == 0) goto L3b
            r4 = r7
            X.1Daa r4 = (X.C2258501Daa) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2b
            if (r0 != r1) goto L41
            X.C155000ia.LIZIZ(r3)
        L22:
            if (r3 != 0) goto L2a
        L24:
            com.ss.android.ugc.aweme.network.model.AuditBatchAckResponse r3 = new com.ss.android.ugc.aweme.network.model.AuditBatchAckResponse
            r0 = 0
            r3.<init>(r0, r1, r0)
        L2a:
            return r3
        L2b:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.network.IGroupChatNetworkRequestApi r0 = X.C2258521Dac.LIZIZ
            if (r0 == 0) goto L24
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LIZLLL(r6, r4)
            if (r3 != r2) goto L22
            return r2
        L3b:
            X.1Daa r4 = new X.1Daa
            r4.<init>(r5, r7)
            goto L12
        L41:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2258521Dac.LIZLLL(com.ss.android.ugc.aweme.network.model.AuditBatchAckReqBody, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    @Override // com.ss.android.ugc.aweme.network.IGroupChatNetworkRequestApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(com.ss.android.ugc.aweme.network.model.GetAccessCriteriaRequestBody r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.network.model.GetAccessCriteriaResponseBody> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C2258531Dad
            if (r0 == 0) goto L3b
            r4 = r7
            X.1Dad r4 = (X.C2258531Dad) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2b
            if (r0 != r1) goto L41
            X.C155000ia.LIZIZ(r3)
        L22:
            if (r3 != 0) goto L2a
        L24:
            com.ss.android.ugc.aweme.network.model.GetAccessCriteriaResponseBody r3 = new com.ss.android.ugc.aweme.network.model.GetAccessCriteriaResponseBody
            r0 = 0
            r3.<init>(r0)
        L2a:
            return r3
        L2b:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.network.IGroupChatNetworkRequestApi r0 = X.C2258521Dac.LIZIZ
            if (r0 == 0) goto L24
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LJ(r6, r4)
            if (r3 != r2) goto L22
            return r2
        L3b:
            X.1Dad r4 = new X.1Dad
            r4.<init>(r5, r7)
            goto L12
        L41:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2258521Dac.LJ(com.ss.android.ugc.aweme.network.model.GetAccessCriteriaRequestBody, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    @Override // com.ss.android.ugc.aweme.network.IGroupChatNetworkRequestApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(com.ss.android.ugc.aweme.network.model.GetManagementPageSettingsBody r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.network.model.GetManagementPageSettingsResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C2258551Daf
            if (r0 == 0) goto L3b
            r4 = r7
            X.1Daf r4 = (X.C2258551Daf) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2b
            if (r0 != r1) goto L41
            X.C155000ia.LIZIZ(r3)
        L22:
            if (r3 != 0) goto L2a
        L24:
            com.ss.android.ugc.aweme.network.model.GetManagementPageSettingsResponse r3 = new com.ss.android.ugc.aweme.network.model.GetManagementPageSettingsResponse
            r0 = 0
            r3.<init>(r0)
        L2a:
            return r3
        L2b:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.network.IGroupChatNetworkRequestApi r0 = X.C2258521Dac.LIZIZ
            if (r0 == 0) goto L24
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LJFF(r6, r4)
            if (r3 != r2) goto L22
            return r2
        L3b:
            X.1Daf r4 = new X.1Daf
            r4.<init>(r5, r7)
            goto L12
        L41:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2258521Dac.LJFF(com.ss.android.ugc.aweme.network.model.GetManagementPageSettingsBody, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    @Override // com.ss.android.ugc.aweme.network.IGroupChatNetworkRequestApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getUnreadAuditCount(java.lang.String r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.network.model.GetUnreadAuditCountResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C2258481DaY
            if (r0 == 0) goto L3b
            r4 = r7
            X.1DaY r4 = (X.C2258481DaY) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2b
            if (r0 != r1) goto L41
            X.C155000ia.LIZIZ(r3)
        L22:
            if (r3 != 0) goto L2a
        L24:
            com.ss.android.ugc.aweme.network.model.GetUnreadAuditCountResponse r3 = new com.ss.android.ugc.aweme.network.model.GetUnreadAuditCountResponse
            r0 = 0
            r3.<init>(r0, r1, r0)
        L2a:
            return r3
        L2b:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.network.IGroupChatNetworkRequestApi r0 = X.C2258521Dac.LIZIZ
            if (r0 == 0) goto L24
            r4.LLILLL = r1
            java.lang.Object r3 = r0.getUnreadAuditCount(r6, r4)
            if (r3 != r2) goto L22
            return r2
        L3b:
            X.1DaY r4 = new X.1DaY
            r4.<init>(r5, r7)
            goto L12
        L41:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2258521Dac.getUnreadAuditCount(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    @Override // com.ss.android.ugc.aweme.network.IGroupChatNetworkRequestApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(int r10, java.lang.String r11, long r12, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.network.model.GroupLinkPreviewResponse> r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof X.C2258491DaZ
            if (r0 == 0) goto L3e
            r8 = r14
            X.1DaZ r8 = (X.C2258491DaZ) r8
            int r2 = r8.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3e
            int r2 = r2 - r1
            r8.LLILLL = r2
        L12:
            java.lang.Object r3 = r8.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r8.LLILLL
            r0 = 1
            if (r1 == 0) goto L2b
            if (r1 != r0) goto L44
            X.C155000ia.LIZIZ(r3)
        L22:
            if (r3 != 0) goto L2a
        L24:
            com.ss.android.ugc.aweme.network.model.GroupLinkPreviewResponse r3 = new com.ss.android.ugc.aweme.network.model.GroupLinkPreviewResponse
            r0 = 0
            r3.<init>(r0, r0)
        L2a:
            return r3
        L2b:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.network.IGroupChatNetworkRequestApi r3 = X.C2258521Dac.LIZIZ
            if (r3 == 0) goto L24
            r8.LLILLL = r0
            r6 = r12
            r5 = r11
            r4 = r10
            java.lang.Object r3 = r3.LIZJ(r4, r5, r6, r8)
            if (r3 != r2) goto L22
            return r2
        L3e:
            X.1DaZ r8 = new X.1DaZ
            r8.<init>(r9, r14)
            goto L12
        L44:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2258521Dac.LIZJ(int, java.lang.String, long, X.05Vn):java.lang.Object");
    }
}
