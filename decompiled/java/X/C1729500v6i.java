package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TopBannerInfo;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.TemplateListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import njp.a;

/* JADX INFO: renamed from: X.0v6i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.TemplateListViewModel$cancelBanner$1", f = "TemplateListViewModel.kt", l = {511}, m = "invokeSuspend")
public final class C1729500v6i extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TemplateListViewModel LLILLJJLI;
    public final /* synthetic */ TopBannerInfo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1729500v6i(TemplateListViewModel templateListViewModel, TopBannerInfo topBannerInfo, InterfaceC1364105Vn<? super C1729500v6i> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = templateListViewModel;
        this.LLILLL = topBannerInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1729500v6i(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        RootData rootData;
        C1728990v5t c1728990v5tUm1;
        C1C7U.LIZ("TemplateListViewModel@ac46.cancelBanner$1");
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
            InterfaceC1729810v7D interfaceC1729810v7D = this.LLILLJJLI.LLILZIL;
            if (interfaceC1729810v7D != null && (c1728990v5tUm1 = interfaceC1729810v7D.Um1()) != null) {
                rootData = c1728990v5tUm1.LL;
            } else {
                rootData = null;
            }
            C1729440v6c c1729440v6c = new C1729440v6c(rootData, "mobile_app");
            c1729440v6c.LIZ(0L, "campaign_banner", null);
            this.LLILLJJLI.setState(AFwS268S0000000_26.get$arr$(620));
            TemplateListViewModel templateListViewModel = this.LLILLJJLI;
            C1728330v4p c1728330v4p = templateListViewModel.LLILZ;
            InterfaceC1729810v7D interfaceC1729810v7D2 = templateListViewModel.LLILZIL;
            AwS270S0300000_26 awS270S0300000_26 = new AwS270S0300000_26(templateListViewModel, c1729440v6c, this.LLILLL, 127);
            AwS392S0200000_26 awS392S0200000_26 = new AwS392S0200000_26(c1729440v6c, this.LLILLJJLI, 149);
            this.LL = 1;
            if (c1728330v4p.LIZIZ(interfaceC1729810v7D2, awS270S0300000_26, awS392S0200000_26, this) == objLJFF) {
                C1C7U.LIZIZ("TemplateListViewModel@ac46.cancelBanner$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateListViewModel@ac46.cancelBanner$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
