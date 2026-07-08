package X;

import com.ss.android.ugc.aweme.ecommerce.search.middle.ai.ui.EcSearchMiddlePagerContainerFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0J3D, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.middle.ai.ui.EcSearchMiddlePagerContainerFragment$setUpTabAndViewPager$4$1", f = "EcSearchMiddlePagerContainerFragment.kt", l = {367}, m = "invokeSuspend")
public final class C0J3D extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ EcSearchMiddlePagerContainerFragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0J3D(int i, EcSearchMiddlePagerContainerFragment ecSearchMiddlePagerContainerFragment, InterfaceC1364105Vn<? super C0J3D> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = ecSearchMiddlePagerContainerFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0J3D(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C20632315oP c20632315oP;
        C1C7U.LIZ("EcSearchMiddlePagerContainerFragment@ad04.setUpTabAndViewPager$4$1");
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
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("EcSearchMiddlePagerContainerFragment@ad04.setUpTabAndViewPager$4$1");
                return objLJFF;
            }
        }
        EcSearchMiddlePagerContainerFragment ecSearchMiddlePagerContainerFragment = this.LLILLL;
        if (!ecSearchMiddlePagerContainerFragment.mStatusDestroyed && ecSearchMiddlePagerContainerFragment.isViewValid() && (c20632315oP = this.LLILLL.LLJJJIL) != null) {
            c20632315oP.setOffscreenPageLimit(1);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcSearchMiddlePagerContainerFragment@ad04.setUpTabAndViewPager$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
