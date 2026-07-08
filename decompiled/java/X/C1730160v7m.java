package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.TemplateEditBottomAreaViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS605S0100000_26;
import njp.a;

/* JADX INFO: renamed from: X.0v7m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.TemplateEditBottomAreaViewModel$doReview$2", f = "TemplateEditBottomAreaViewModel.kt", l = {84}, m = "invokeSuspend")
public final class C1730160v7m extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TemplateEditBottomAreaViewModel LLILLJJLI;
    public final /* synthetic */ TemplateItem LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1730160v7m(TemplateEditBottomAreaViewModel templateEditBottomAreaViewModel, TemplateItem templateItem, Function0<Unit> function0, InterfaceC1364105Vn<? super C1730160v7m> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = templateEditBottomAreaViewModel;
        this.LLILLL = templateItem;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1730160v7m(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        RootData rootData;
        C1728990v5t c1728990v5tUm1;
        C1C7U.LIZ("TemplateEditBottomAreaViewModel@a013.doReview$2");
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
            TemplateEditBottomAreaViewModel templateEditBottomAreaViewModel = this.LLILLJJLI;
            C1730010v7X c1730010v7X = templateEditBottomAreaViewModel.LL;
            InterfaceC1729810v7D interfaceC1729810v7D = templateEditBottomAreaViewModel.LLILLJJLI;
            if (interfaceC1729810v7D != null && (c1728990v5tUm1 = interfaceC1729810v7D.Um1()) != null) {
                rootData = c1728990v5tUm1.LL;
            } else {
                rootData = null;
            }
            TemplateItem templateItem = this.LLILLL;
            this.LL = 1;
            obj = c1730010v7X.LJFF(rootData, templateItem, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TemplateEditBottomAreaViewModel@a013.doReview$2");
                return objLJFF;
            }
        }
        C1730110v7h c1730110v7h = (C1730110v7h) obj;
        if (c1730110v7h.LIZ) {
            Function0<Unit> function0 = this.LLILZ;
            if (function0 != null) {
                function0.invoke();
            }
            this.LLILLJJLI.setState(new AwS605S0100000_26(c1730110v7h, 624));
        } else if (c1730110v7h.LIZJ == 3) {
            this.LLILLJJLI.setState(new AwS605S0100000_26(c1730110v7h, 625));
        } else {
            this.LLILLJJLI.setState(new AwS605S0100000_26(c1730110v7h, 626));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateEditBottomAreaViewModel@a013.doReview$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
