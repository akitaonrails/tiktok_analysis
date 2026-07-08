package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.api.PcsApi;
import kotlin.Unit;
import webcast.api.smb.GetSMBOptInProgressResponse;
import webcast.api.smb.TriggerAIDMRequest;
import webcast.api.smb.TriggerAIDMResponse;
import webcast.api.sub.SMBBasicInfoEditRequest;
import webcast.api.sub.SMBOptInRequest;
import webcast.api.sub.SMBOptInResponse;
import webcast.api.sub.SMBServiceOptFormRequest;
import webcast.api.sub.UpdateDMStatusRequest;
import webcast.api.sub.UpdateDMStatusResponse;

/* JADX INFO: renamed from: X.0KVq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C518640KVq implements InterfaceC518660KVs {
    public final PcsApi LIZ;

    public C518640KVq(PcsApi pcsApi) {
        this.LIZ = pcsApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    @Override // X.InterfaceC518660KVs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super X.C470590Icr<webcast.api.sub.SMBOptInQualificationResponse.ResponseData>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C518670KVt
            if (r0 == 0) goto L35
            r4 = r6
            X.0KVt r4 = (X.C518670KVt) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L35
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L23
            if (r0 != r1) goto L3b
            X.C155000ia.LIZIZ(r3)
        L22:
            return r3
        L23:
            X.C155000ia.LIZIZ(r3)
            com.bytedance.android.livesdk.comp.api.pcs.data.api.PcsApi r0 = r5.LIZ
            X.11NZ r0 = r0.getSmbQualification()
            r4.LLILLL = r1
            java.lang.Object r3 = X.C11UD.LIZJ(r0, r4)
            if (r3 != r2) goto L22
            return r2
        L35:
            X.0KVt r4 = new X.0KVt
            r4.<init>(r5, r6)
            goto L12
        L3b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C518640KVq.LIZ(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC518660KVs
    public final Object LIZIZ(InterfaceC1364105Vn interfaceC1364105Vn) {
        return this.LIZ.getServiceSwitchInfo(false, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC518660KVs
    public final Object getSmbOptInProgress(InterfaceC1364105Vn<? super C470590Icr<GetSMBOptInProgressResponse.ResponseData>> interfaceC1364105Vn) {
        return this.LIZ.getSmbOptInProgress(interfaceC1364105Vn);
    }

    @Override // X.InterfaceC518660KVs
    public final Object requestBasicInfoEdit(SMBBasicInfoEditRequest sMBBasicInfoEditRequest, InterfaceC1364105Vn<? super C470590Icr<Unit>> interfaceC1364105Vn) {
        return this.LIZ.requestBasicInfoEdit(sMBBasicInfoEditRequest, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC518660KVs
    public final Object requestServiceOptForm(SMBServiceOptFormRequest sMBServiceOptFormRequest, InterfaceC1364105Vn<? super C470590Icr<Unit>> interfaceC1364105Vn) {
        return this.LIZ.requestServiceOptForm(sMBServiceOptFormRequest, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC518660KVs
    public final Object requestSmbOptIn(SMBOptInRequest sMBOptInRequest, InterfaceC1364105Vn<? super C470590Icr<SMBOptInResponse.ResponseData>> interfaceC1364105Vn) {
        return this.LIZ.requestSmbOptIn(sMBOptInRequest, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC518660KVs
    public final Object triggerAIDM(TriggerAIDMRequest triggerAIDMRequest, InterfaceC1364105Vn<? super C470590Icr<TriggerAIDMResponse.Data>> interfaceC1364105Vn) {
        return this.LIZ.triggerAIDM(triggerAIDMRequest, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC518660KVs
    public final Object updateDMStatus(UpdateDMStatusRequest updateDMStatusRequest, InterfaceC1364105Vn<? super C470590Icr<UpdateDMStatusResponse.ResponseData>> interfaceC1364105Vn) {
        return this.LIZ.updateDMStatus(updateDMStatusRequest, interfaceC1364105Vn);
    }
}
