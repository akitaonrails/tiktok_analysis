package X;

import android.view.ViewGroup;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.assem.TemplateEditBottomAreaAssem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.TemplateEditBottomAreaViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import njp.a;

/* JADX INFO: renamed from: X.0v4y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.assem.TemplateEditBottomAreaAssem$addDisplayButtonClickListener$1$1", f = "TemplateEditBottomAreaAssem.kt", l = {}, m = "invokeSuspend")
public final class C1728420v4y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TemplateEditBottomAreaAssem LL;
    public final /* synthetic */ TemplateItem LLILLJJLI;
    public final /* synthetic */ TemplateItem LLILLL;
    public final /* synthetic */ ViewGroup LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1728420v4y(TemplateEditBottomAreaAssem templateEditBottomAreaAssem, TemplateItem templateItem, TemplateItem templateItem2, ViewGroup viewGroup, InterfaceC1364105Vn<? super C1728420v4y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = templateEditBottomAreaAssem;
        this.LLILLJJLI = templateItem;
        this.LLILLL = templateItem2;
        this.LLILZ = viewGroup;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1728420v4y(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateEditBottomAreaAssem@494a.addDisplayButtonClickListener$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.op().Um1().LLJIJIL && !this.LLILLJJLI.b0()) {
            TemplateEditBottomAreaViewModel templateEditBottomAreaViewModelYp = this.LL.yp();
            TemplateItem templateItem = this.LLILLJJLI;
            TemplateItem templateItem2 = this.LLILLL;
            ViewGroup viewGroup = this.LLILZ;
            templateEditBottomAreaViewModelYp.getClass();
            templateEditBottomAreaViewModelYp.setState(AFwS268S0000000_26.get$arr$(615));
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(templateEditBottomAreaViewModelYp), C2126308Ur.LJFF, null, new C1730140v7k(templateEditBottomAreaViewModelYp, templateItem, templateItem2, viewGroup, null), 2);
        } else {
            this.LL.yp().vQ2(this.LLILLJJLI, this.LLILLL, this.LLILZ, false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateEditBottomAreaAssem@494a.addDisplayButtonClickListener$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
