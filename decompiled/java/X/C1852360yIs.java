package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.model.TakoPageContext;
import com.ss.android.ugc.aweme.tako.otherpage.image.create.TabTemplateFragmentItem;
import com.ss.android.ugc.aweme.tako.otherpage.image.create.TakoImageCreateTabFragment;
import com.ss.android.ugc.aweme.tako.otherpage.image.create.TakoImageTemplateTabViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS571S0100000_27;
import njp.a;

/* JADX INFO: renamed from: X.0yIs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.image.create.TakoImageCreateTabFragment$initList$config$1$onRefresh$1", f = "TakoImageCreateTabFragment.kt", l = {229}, m = "invokeSuspend")
public final class C1852360yIs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ TakoImageCreateTabFragment LLILLL;
    public final /* synthetic */ InterfaceC1364105Vn<AbstractC316870CbV<C1852490yJ5>> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1852360yIs(TakoImageCreateTabFragment takoImageCreateTabFragment, InterfaceC1364105Vn<? super AbstractC316870CbV<C1852490yJ5>> interfaceC1364105Vn, InterfaceC1364105Vn<? super C1852360yIs> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LLILLL = takoImageCreateTabFragment;
        this.LLILZ = interfaceC1364105Vn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1852360yIs c1852360yIs = new C1852360yIs(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1852360yIs.LLILLJJLI = obj;
        return c1852360yIs;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        TakoPageContext takoPageContext;
        C1C7U.LIZ("TakoImageCreateTabFragment@e4bf.initList$config$1$onRefresh$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                TakoImageCreateTabFragment takoImageCreateTabFragment = this.LLILLL;
                InterfaceC1364105Vn<AbstractC316870CbV<C1852490yJ5>> interfaceC1364105Vn = this.LLILZ;
                TakoImageTemplateTabViewModel takoImageTemplateTabViewModelSR = takoImageCreateTabFragment.SR();
                String str = takoImageCreateTabFragment.LLIZ;
                C19EG activity = takoImageCreateTabFragment.getActivity();
                TabTemplateFragmentItem tabTemplateFragmentItem = takoImageCreateTabFragment.LLJI;
                if (tabTemplateFragmentItem != null) {
                    takoPageContext = tabTemplateFragmentItem.takoPageContext;
                } else {
                    takoPageContext = null;
                }
                C1852390yIv c1852390yIvWQ2 = takoImageTemplateTabViewModelSR.wQ2(str, activity, takoPageContext, new AwS571S0100000_27(takoImageCreateTabFragment, 1396), new C1852410yIx(takoImageCreateTabFragment), new C1852330yIp(takoImageCreateTabFragment));
                takoImageCreateTabFragment.LLJJIJIL = c1852390yIvWQ2.LIZIZ;
                takoImageCreateTabFragment.LLJJJ = c1852390yIvWQ2.LIZJ;
                AbstractC316870CbV<C1852490yJ5> abstractC316870CbV = c1852390yIvWQ2.LIZ;
                C189200o6.m2constructorimpl(abstractC316870CbV);
                interfaceC1364105Vn.resumeWith(abstractC316870CbV);
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C1852380yIu c1852380yIu = new C1852380yIu(takoImageCreateTabFragment, null);
                this.LL = 1;
                if (C23250099c.LJI(this, abstractC2238408pq, c1852380yIu) == objLJFF) {
                    C1C7U.LIZIZ("TakoImageCreateTabFragment@e4bf.initList$config$1$onRefresh$1");
                    return objLJFF;
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoImageCreateTabFragment@e4bf.initList$config$1$onRefresh$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
