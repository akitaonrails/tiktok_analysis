package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.TemplateEditBottomAreaViewModel;

/* JADX INFO: renamed from: X.0v7l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.TemplateEditBottomAreaViewModel", f = "TemplateEditBottomAreaViewModel.kt", l = {150, 151}, m = "showTemplateMultiDisplaySheetInner")
public final class C1730150v7l extends AbstractC23140094w {
    public TemplateItem LL;
    public TemplateItem LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ TemplateEditBottomAreaViewModel LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1730150v7l(TemplateEditBottomAreaViewModel templateEditBottomAreaViewModel, InterfaceC1364105Vn<? super C1730150v7l> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = templateEditBottomAreaViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateEditBottomAreaViewModel@a013.showTemplateMultiDisplaySheetInner$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILZIL.wQ2(null, null, null, this);
        C1C7U.LIZIZ("TemplateEditBottomAreaViewModel@a013.showTemplateMultiDisplaySheetInner$1");
        return objWQ2;
    }
}
