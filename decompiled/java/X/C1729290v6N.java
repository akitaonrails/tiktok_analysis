package X;

import android.content.Context;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.TemplateListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import njp.a;

/* JADX INFO: renamed from: X.0v6N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.TemplateListViewModel$cancelDisplay$1$1", f = "TemplateListViewModel.kt", l = {372}, m = "invokeSuspend")
public final class C1729290v6N extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TemplateListViewModel LLILLJJLI;
    public final /* synthetic */ ViewGroup LLILLL;
    public final /* synthetic */ TemplateItem LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1729290v6N(ViewGroup viewGroup, TemplateItem templateItem, TemplateListViewModel templateListViewModel, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = templateListViewModel;
        this.LLILLL = viewGroup;
        this.LLILZ = templateItem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1729290v6N(this.LLILLL, this.LLILZ, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateListViewModel@ac46.cancelDisplay$1$1");
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
            this.LLILLJJLI.setState(AFwS268S0000000_26.get$arr$(601));
            TemplateListViewModel templateListViewModel = this.LLILLJJLI;
            C1730010v7X c1730010v7X = templateListViewModel.LLILLL;
            InterfaceC1729810v7D interfaceC1729810v7D = templateListViewModel.LLILZIL;
            Context context = this.LLILLL.getContext();
            TemplateItem templateItem = this.LLILZ;
            AwS427S0200000_26 awS427S0200000_26 = new AwS427S0200000_26(this.LLILLJJLI, templateItem, 74);
            AwS605S0100000_26 awS605S0100000_26 = new AwS605S0100000_26(this.LLILLJJLI, 609);
            this.LL = 1;
            if (c1730010v7X.LIZ(interfaceC1729810v7D, context, templateItem, awS427S0200000_26, awS605S0100000_26, this) == objLJFF) {
                C1C7U.LIZIZ("TemplateListViewModel@ac46.cancelDisplay$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateListViewModel@ac46.cancelDisplay$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
