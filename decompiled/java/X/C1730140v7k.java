package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.TemplateEditBottomAreaViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import njp.a;

/* JADX INFO: renamed from: X.0v7k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.TemplateEditBottomAreaViewModel$showTemplateMultiDisplaySheet$2", f = "TemplateEditBottomAreaViewModel.kt", l = {126, 130}, m = "invokeSuspend")
public final class C1730140v7k extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TemplateEditBottomAreaViewModel LLILLJJLI;
    public final /* synthetic */ TemplateItem LLILLL;
    public final /* synthetic */ TemplateItem LLILZ;
    public final /* synthetic */ ViewGroup LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1730140v7k(TemplateEditBottomAreaViewModel templateEditBottomAreaViewModel, TemplateItem templateItem, TemplateItem templateItem2, ViewGroup viewGroup, InterfaceC1364105Vn<? super C1730140v7k> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = templateEditBottomAreaViewModel;
        this.LLILLL = templateItem;
        this.LLILZ = templateItem2;
        this.LLILZIL = viewGroup;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1730140v7k(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        RootData rootData;
        C1728990v5t c1728990v5tUm1;
        C1C7U.LIZ("TemplateEditBottomAreaViewModel@a013.showTemplateMultiDisplaySheet$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TemplateEditBottomAreaViewModel@a013.showTemplateMultiDisplaySheet$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
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
            TemplateItem templateItem2 = this.LLILZ;
            this.LL = 1;
            obj = c1730010v7X.LJI(rootData, templateItem, templateItem2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TemplateEditBottomAreaViewModel@a013.showTemplateMultiDisplaySheet$2");
                return objLJFF;
            }
        }
        C1730110v7h c1730110v7h = (C1730110v7h) obj;
        if (c1730110v7h.LIZ) {
            this.LLILLJJLI.setState(AFwS268S0000000_26.get$arr$(618));
            TemplateEditBottomAreaViewModel templateEditBottomAreaViewModel2 = this.LLILLJJLI;
            TemplateItem templateItem3 = this.LLILLL;
            TemplateItem templateItem4 = this.LLILZ;
            ViewGroup viewGroup = this.LLILZIL;
            this.LL = 2;
            if (templateEditBottomAreaViewModel2.wQ2(templateItem3, templateItem4, viewGroup, this) == objLJFF) {
                C1C7U.LIZIZ("TemplateEditBottomAreaViewModel@a013.showTemplateMultiDisplaySheet$2");
                return objLJFF;
            }
        } else if (c1730110v7h.LIZJ == 3) {
            this.LLILLJJLI.setState(new AwS605S0100000_26(c1730110v7h, 637));
        } else {
            this.LLILLJJLI.setState(new AwS605S0100000_26(c1730110v7h, 638));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TemplateEditBottomAreaViewModel@a013.showTemplateMultiDisplaySheet$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
