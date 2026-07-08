package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.TemplateEditBottomAreaViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import njp.a;

/* JADX INFO: renamed from: X.0v7j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.TemplateEditBottomAreaViewModel$doSaveAndDisplay$2", f = "TemplateEditBottomAreaViewModel.kt", l = {110}, m = "invokeSuspend")
public final class C1730130v7j extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TemplateEditBottomAreaViewModel LLILLJJLI;
    public final /* synthetic */ TemplateItem LLILLL;
    public final /* synthetic */ TemplateItem LLILZ;
    public final /* synthetic */ ViewGroup LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1730130v7j(TemplateEditBottomAreaViewModel templateEditBottomAreaViewModel, TemplateItem templateItem, TemplateItem templateItem2, ViewGroup viewGroup, boolean z, InterfaceC1364105Vn<? super C1730130v7j> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = templateEditBottomAreaViewModel;
        this.LLILLL = templateItem;
        this.LLILZ = templateItem2;
        this.LLILZIL = viewGroup;
        this.LLILZLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1730130v7j(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateEditBottomAreaViewModel@a013.doSaveAndDisplay$2");
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
            TemplateItem templateItem = this.LLILLL;
            TemplateItem templateItem2 = this.LLILZ;
            ViewGroup viewGroup = this.LLILZIL;
            boolean z = this.LLILZLL;
            AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(templateEditBottomAreaViewModel, 890);
            AwS605S0100000_26 awS605S0100000_26 = new AwS605S0100000_26(this.LLILLJJLI, 338);
            this.LL = 1;
            if (c1730010v7X.LIZIZ(interfaceC1729810v7D, templateItem, templateItem2, viewGroup, z, awS570S0100000_26, awS605S0100000_26, this) == objLJFF) {
                C1C7U.LIZIZ("TemplateEditBottomAreaViewModel@a013.doSaveAndDisplay$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateEditBottomAreaViewModel@a013.doSaveAndDisplay$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
