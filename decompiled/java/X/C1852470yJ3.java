package X;

import com.ss.android.ugc.aweme.tako.model.TakoPageContext;
import com.ss.android.ugc.aweme.tako.otherpage.image.create.TakoImageTemplateTabViewModel;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0yJ3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.image.create.TakoImageTemplateTabViewModel", f = "TakoImageTemplateTabViewModel.kt", l = {316}, m = "loadMore")
public final class C1852470yJ3 extends AbstractC23140094w {
    public C1852490yJ5 LL;
    public C19EG LLILLJJLI;
    public TakoPageContext LLILLL;
    public Function2 LLILZ;
    public InterfaceC1631620sYq LLILZIL;
    public Object LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ TakoImageTemplateTabViewModel LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1852470yJ3(TakoImageTemplateTabViewModel takoImageTemplateTabViewModel, InterfaceC1364105Vn<? super C1852470yJ3> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = takoImageTemplateTabViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoImageTemplateTabViewModel@ff21.loadMore$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLIZLLLIL.vQ2(null, null, null, null, null, this);
        C1C7U.LIZIZ("TakoImageTemplateTabViewModel@ff21.loadMore$1");
        return objVQ2;
    }
}
