package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BaseTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardTrackParams;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.TemplateEditBottomAreaViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS140S1100000_26;
import njp.a;

/* JADX INFO: renamed from: X.0v7u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.TemplateEditBottomAreaViewModel$getTemplateItemByCacheKey$1", f = "TemplateEditBottomAreaViewModel.kt", l = {183}, m = "invokeSuspend")
public final class C1730240v7u extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Integer LLILZLL;
    public final /* synthetic */ TemplateEditBottomAreaViewModel LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1730240v7u(String str, String str2, String str3, String str4, Integer num, TemplateEditBottomAreaViewModel templateEditBottomAreaViewModel, InterfaceC1364105Vn<? super C1730240v7u> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = num;
        this.LLIZ = templateEditBottomAreaViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1730240v7u(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJII = obj;
        C1C7U.LIZ("TemplateEditBottomAreaViewModel@a013.getTemplateItemByCacheKey$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJII);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJII);
            C1730290v7z c1730290v7z = C1730290v7z.LIZ;
            String str = this.LLILLJJLI;
            String str2 = this.LLILLL;
            String str3 = this.LLILZ;
            String str4 = this.LLILZIL;
            Integer num = this.LLILZLL;
            this.LL = 1;
            objLJII = c1730290v7z.LJII(str, str2, str3, str4, num, false, this);
            if (objLJII == objLJFF) {
                C1C7U.LIZIZ("TemplateEditBottomAreaViewModel@a013.getTemplateItemByCacheKey$1");
                return objLJFF;
            }
        }
        TemplateItem baseTemplateItem = (TemplateItem) objLJII;
        if (baseTemplateItem == null) {
            baseTemplateItem = new BaseTemplateItem(0, null, "", "", "", "", "", C13BV.INSTANCE, false, false, false, true, null, null, null, null, false, new BillboardTrackParams(0));
        }
        this.LLIZ.setState(new AwS140S1100000_26(baseTemplateItem, this.LLILZ, 44));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateEditBottomAreaViewModel@a013.getTemplateItemByCacheKey$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
