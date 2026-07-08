package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.viewmodel.PcsIndustrySelectVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.sub.UpsellIndustryListResponse;

/* JADX INFO: renamed from: X.0wXr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.viewmodel.PcsIndustrySelectVM$fetchIndustryList$2$industryDeferred$1", f = "PcsIndustrySelectVM.kt", l = {105}, m = "invokeSuspend")
public final class C1784770wXr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C470590Icr<UpsellIndustryListResponse.Data>>, Object> {
    public int LL;
    public final /* synthetic */ PcsIndustrySelectVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1784770wXr(PcsIndustrySelectVM pcsIndustrySelectVM, InterfaceC1364105Vn<? super C1784770wXr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pcsIndustrySelectVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1784770wXr(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("PcsIndustrySelectVM@8dd7.fetchIndustryList$2$industryDeferred$1");
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
            PcsIndustrySelectVM pcsIndustrySelectVM = this.LLILLJJLI;
            String str = pcsIndustrySelectVM.LLILZLL;
            C1784760wXq c1784760wXq = new C1784760wXq(pcsIndustrySelectVM, null);
            this.LL = 1;
            obj = C1808280x9m.LIZ.LIZLLL(str, "/webcast/sub/upsell/industry_list/", C2097608Jq.LJ(), AnonymousClass0207.get$arr$(153), c1784760wXq, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PcsIndustrySelectVM@8dd7.fetchIndustryList$2$industryDeferred$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PcsIndustrySelectVM@8dd7.fetchIndustryList$2$industryDeferred$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C470590Icr<UpsellIndustryListResponse.Data>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
