package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.viewmodel.PcsIndustrySelectVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;
import webcast.api.smb.SMBVerificationInfoResponse;

/* JADX INFO: renamed from: X.0wXm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.viewmodel.PcsIndustrySelectVM$fetchIndustryList$2$verificationDeferred$1$1$1", f = "PcsIndustrySelectVM.kt", l = {115}, m = "invokeSuspend")
public final class C1784720wXm extends C09AX implements Function1<InterfaceC1364105Vn<? super C470590Icr<SMBVerificationInfoResponse.Data>>, Object> {
    public int LL;
    public final /* synthetic */ PcsIndustrySelectVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1784720wXm(PcsIndustrySelectVM pcsIndustrySelectVM, InterfaceC1364105Vn<? super C1784720wXm> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = pcsIndustrySelectVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1784720wXm(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C470590Icr<SMBVerificationInfoResponse.Data>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsIndustrySelectVM@8dd7.fetchIndustryList$2$verificationDeferred$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC1784740wXo interfaceC1784740wXo = this.LLILLJJLI.LL;
            this.LL = 1;
            obj = interfaceC1784740wXo.getSmbVerificationInfo(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PcsIndustrySelectVM@8dd7.fetchIndustryList$2$verificationDeferred$1$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PcsIndustrySelectVM@8dd7.fetchIndustryList$2$verificationDeferred$1$1$1");
        return obj;
    }
}
