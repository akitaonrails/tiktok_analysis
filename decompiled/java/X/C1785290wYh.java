package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.repository.PcsIndustryApi;
import java.util.ArrayList;
import java.util.List;
import webcast.api.smb.SMBIndustryVerificationSubmitRequest;
import webcast.api.smb.SMBVerificationInfoResponse;
import webcast.api.sub.UpsellIndustryListResponse;
import webcast.api.sub.UpsellSelectIndustryRequest;

/* JADX INFO: renamed from: X.0wYh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1785290wYh implements InterfaceC1784740wXo {
    public final PcsIndustryApi LIZ;

    public C1785290wYh(PcsIndustryApi pcsIndustryApi) {
        this.LIZ = pcsIndustryApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.InterfaceC1784740wXo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super X.C1268104xj> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C1784850wXz
            if (r0 == 0) goto L20
            r4 = r6
            X.0wXz r4 = (X.C1784850wXz) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L40
        L20:
            X.0wXz r4 = new X.0wXz
            r4.<init>(r5, r6)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.repository.PcsIndustryApi r0 = r5.LIZ     // Catch: java.lang.Throwable -> L4d
            X.11NZ r0 = r0.getQualification()     // Catch: java.lang.Throwable -> L4d
            r4.LLILLL = r1     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r3 = X.C11UD.LIZJ(r0, r4)     // Catch: java.lang.Throwable -> L4d
            if (r3 != r2) goto L43
            return r2
        L40:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L4d
        L43:
            X.0Icr r3 = (X.C470590Icr) r3     // Catch: java.lang.Throwable -> L4d
            T r4 = r3.data     // Catch: java.lang.Throwable -> L4d
            webcast.api.sub.SMBOptInQualificationResponse$ResponseData r4 = (webcast.api.sub.SMBOptInQualificationResponse.ResponseData) r4     // Catch: java.lang.Throwable -> L4d
            X.C189200o6.m2constructorimpl(r4)     // Catch: java.lang.Throwable -> L4d
            goto L59
        L4d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r4 = new X.00Yq
            r4.<init>(r0)
            X.C189200o6.m2constructorimpl(r4)
        L59:
            boolean r1 = X.C189200o6.m7isFailureimpl(r4)
            r0 = 0
            if (r1 == 0) goto L61
            r4 = r0
        L61:
            webcast.api.sub.SMBOptInQualificationResponse$ResponseData r4 = (webcast.api.sub.SMBOptInQualificationResponse.ResponseData) r4
            if (r4 != 0) goto L66
            return r0
        L66:
            X.04xj r3 = new X.04xj
            boolean r2 = r4.inBlockIndustryCoolingDown
            int r1 = r4.servicePlusOptInStatus
            com.bytedance.android.livesdk.chatroom.api.UpsellRevokeInfo r0 = r4.revokeInfo
            if (r0 == 0) goto L76
            int r0 = r0.revokeReason
        L72:
            r3.<init>(r2, r1, r0)
            return r3
        L76:
            r0 = 0
            goto L72
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1785290wYh.LIZJ(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1784740wXo
    public final Object getIndustryList(InterfaceC1364105Vn<? super C470590Icr<UpsellIndustryListResponse.Data>> interfaceC1364105Vn) {
        return this.LIZ.getIndustryList(interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1784740wXo
    public final Object getSmbVerificationInfo(InterfaceC1364105Vn<? super C470590Icr<SMBVerificationInfoResponse.Data>> interfaceC1364105Vn) {
        return this.LIZ.getSmbVerificationInfo(interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1784740wXo
    public final Object LIZIZ(List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        SMBIndustryVerificationSubmitRequest sMBIndustryVerificationSubmitRequest = new SMBIndustryVerificationSubmitRequest();
        sMBIndustryVerificationSubmitRequest.type = 1;
        sMBIndustryVerificationSubmitRequest.fileUris = new ArrayList(list);
        return this.LIZ.submitIndustryVerification(sMBIndustryVerificationSubmitRequest, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1784740wXo
    public final Object LIZ(int i, long j, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        UpsellSelectIndustryRequest upsellSelectIndustryRequest = new UpsellSelectIndustryRequest();
        upsellSelectIndustryRequest.selectedIndustry = j;
        upsellSelectIndustryRequest.selectScene = i;
        upsellSelectIndustryRequest.scene = str;
        return this.LIZ.selectIndustry(upsellSelectIndustryRequest, interfaceC1364105Vn);
    }
}
