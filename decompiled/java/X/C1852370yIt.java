package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.model.TakoPageContext;
import com.ss.android.ugc.aweme.tako.otherpage.image.create.TabTemplateFragmentItem;
import com.ss.android.ugc.aweme.tako.otherpage.image.create.TakoImageCreateTabFragment;
import com.ss.android.ugc.aweme.tako.otherpage.image.create.TakoImageTemplateTabViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0yIt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.image.create.TakoImageCreateTabFragment$initList$config$1$onLoadMore$1", f = "TakoImageCreateTabFragment.kt", l = {243}, m = "invokeSuspend")
public final class C1852370yIt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC1364105Vn LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ TakoImageCreateTabFragment LLILZ;
    public final /* synthetic */ C1852490yJ5 LLILZIL;
    public final /* synthetic */ InterfaceC1364105Vn<AbstractC316870CbV<C1852490yJ5>> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1852370yIt(TakoImageCreateTabFragment takoImageCreateTabFragment, C1852490yJ5 c1852490yJ5, InterfaceC1364105Vn<? super AbstractC316870CbV<C1852490yJ5>> interfaceC1364105Vn, InterfaceC1364105Vn<? super C1852370yIt> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LLILZ = takoImageCreateTabFragment;
        this.LLILZIL = c1852490yJ5;
        this.LLILZLL = interfaceC1364105Vn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1852370yIt c1852370yIt = new C1852370yIt(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1852370yIt.LLILLL = obj;
        return c1852370yIt;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        TakoImageCreateTabFragment takoImageCreateTabFragment;
        InterfaceC1364105Vn<AbstractC316870CbV<C1852490yJ5>> interfaceC1364105Vn;
        TakoPageContext takoPageContext;
        C1C7U.LIZ("TakoImageCreateTabFragment@e4bf.initList$config$1$onLoadMore$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            if (i != 0) {
                if (i == 1) {
                    interfaceC1364105Vn = this.LL;
                    takoImageCreateTabFragment = (TakoImageCreateTabFragment) this.LLILLL;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                takoImageCreateTabFragment = this.LLILZ;
                C1852490yJ5 c1852490yJ5 = this.LLILZIL;
                interfaceC1364105Vn = this.LLILZLL;
                TakoImageTemplateTabViewModel takoImageTemplateTabViewModelSR = takoImageCreateTabFragment.SR();
                C19EG activity = takoImageCreateTabFragment.getActivity();
                TabTemplateFragmentItem tabTemplateFragmentItem = takoImageCreateTabFragment.LLJI;
                if (tabTemplateFragmentItem != null) {
                    takoPageContext = tabTemplateFragmentItem.takoPageContext;
                } else {
                    takoPageContext = null;
                }
                C1852400yIw c1852400yIw = new C1852400yIw(takoImageCreateTabFragment);
                C1852340yIq c1852340yIq = new C1852340yIq(takoImageCreateTabFragment);
                this.LLILLL = takoImageCreateTabFragment;
                this.LL = interfaceC1364105Vn;
                this.LLILLJJLI = 1;
                obj = takoImageTemplateTabViewModelSR.vQ2(c1852490yJ5, activity, takoPageContext, c1852400yIw, c1852340yIq, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("TakoImageCreateTabFragment@e4bf.initList$config$1$onLoadMore$1");
                    return objLJFF;
                }
            }
            C1852390yIv c1852390yIv = (C1852390yIv) obj;
            takoImageCreateTabFragment.ZR(c1852390yIv.LIZJ, "load_more", c1852390yIv.LIZIZ);
            AbstractC316870CbV<C1852490yJ5> abstractC316870CbV = c1852390yIv.LIZ;
            C189200o6.m2constructorimpl(abstractC316870CbV);
            interfaceC1364105Vn.resumeWith(abstractC316870CbV);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoImageCreateTabFragment@e4bf.initList$config$1$onLoadMore$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
