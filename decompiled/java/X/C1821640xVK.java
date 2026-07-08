package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.model.thirdpartylink.PcsThirdPartyLinkData;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.thirdpartylink.viewmodel.PcsThirdPartyLinkVm;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.smb.SMBThirdPartyLinkGetBySkuResponse;
import webcast.api.smb.ThirdPartyLinkInfo;

/* JADX INFO: renamed from: X.0xVK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.thirdpartylink.viewmodel.PcsThirdPartyLinkVm$fetchThirdPartyLink$2", f = "PcsThirdPartyLinkVm.kt", l = {77}, m = "invokeSuspend")
public final class C1821640xVK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PcsThirdPartyLinkVm LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1821640xVK(PcsThirdPartyLinkVm pcsThirdPartyLinkVm, long j, InterfaceC1364105Vn<? super C1821640xVK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pcsThirdPartyLinkVm;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1821640xVK(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Object objLIZ;
        PcsThirdPartyLinkData pcsThirdPartyLinkData;
        String str2;
        ThirdPartyLinkInfo thirdPartyLinkInfo;
        C1C7U.LIZ("PcsThirdPartyLinkVm@ace1.fetchThirdPartyLink$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLIZ = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            PcsThirdPartyLinkVm pcsThirdPartyLinkVm = this.LLILLJJLI;
            C351101Xx c351101Xx = pcsThirdPartyLinkVm.LLILLL;
            long j = this.LLILLL;
            C1821570xVD c1821570xVDXQ2 = pcsThirdPartyLinkVm.xQ2();
            if (c1821570xVDXQ2 == null || (pcsThirdPartyLinkData = c1821570xVDXQ2.LL) == null || (str = pcsThirdPartyLinkData.secAnchorId) == null) {
                str = "";
            }
            this.LL = 1;
            objLIZ = c351101Xx.LIZ(j, str, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("PcsThirdPartyLinkVm@ace1.fetchThirdPartyLink$2");
                return objLJFF;
            }
        }
        PcsThirdPartyLinkVm pcsThirdPartyLinkVm2 = this.LLILLJJLI;
        if (C189200o6.m8isSuccessimpl(objLIZ)) {
            SMBThirdPartyLinkGetBySkuResponse.ResponseData responseData = (SMBThirdPartyLinkGetBySkuResponse.ResponseData) objLIZ;
            Boolean boolValueOf = null;
            if (responseData != null && (thirdPartyLinkInfo = responseData.linkInfo) != null) {
                str2 = thirdPartyLinkInfo.targetUrl;
            } else {
                str2 = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchThirdPartyLink success, found=");
            if (responseData != null) {
                boolValueOf = Boolean.valueOf(responseData.found);
            }
            sbLIZ.append(boolValueOf);
            sbLIZ.append(", url=");
            sbLIZ.append(str2);
            C20441214yg.LIZIZ("PcsThirdPartyLinkVm", C2188811AlT.LIZIZ(sbLIZ));
            pcsThirdPartyLinkVm2.setState(new C1821660xVM(responseData));
        }
        PcsThirdPartyLinkVm pcsThirdPartyLinkVm3 = this.LLILLJJLI;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(objLIZ);
        if (thM5exceptionOrNullimpl != null) {
            C20441214yg.LJFF("PcsThirdPartyLinkVm", "fetchThirdPartyLink failed", thM5exceptionOrNullimpl);
            pcsThirdPartyLinkVm3.setState(new C1821740xVU());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsThirdPartyLinkVm@ace1.fetchThirdPartyLink$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
