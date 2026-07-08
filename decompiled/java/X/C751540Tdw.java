package X;

import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tdw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.panel.viewpager.ViewPagerPanelComponent$preloadTriggerJobLazy$1$1$1", f = "ViewPagerPanelComponent.kt", l = {223}, m = "invokeSuspend")
public final class C751540Tdw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ VerticalViewPager LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751540Tdw(VerticalViewPager verticalViewPager, InterfaceC1364105Vn<? super C751540Tdw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = verticalViewPager;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C751540Tdw(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ViewPagerPanelComponent@376b.preloadTriggerJobLazy$1$1$1");
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
            if (C1BCA.LIZLLL().LIZ != EnumC1006810cJ5.Low) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("ViewPagerPanelComponent@376b.preloadTriggerJobLazy$1$1$1");
                return unit;
            }
            EnumC1006810cJ5 enumC1006810cJ5 = C1BCA.LJIIIIZZ().LIZ;
            if (enumC1006810cJ5 == EnumC1006810cJ5.Unknown) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("ViewPagerPanelComponent@376b.preloadTriggerJobLazy$1$1$1");
                return unit2;
            }
            if (enumC1006810cJ5.compareTo((EnumC1006810cJ5) C751550Tdx.LIZ.getValue()) < 0) {
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("ViewPagerPanelComponent@376b.preloadTriggerJobLazy$1$1$1");
                return unit3;
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C751530Tdv c751530Tdv = new C751530Tdv(this.LLILLJJLI, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c751530Tdv) == objLJFF) {
                C1C7U.LIZIZ("ViewPagerPanelComponent@376b.preloadTriggerJobLazy$1$1$1");
                return objLJFF;
            }
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("ViewPagerPanelComponent@376b.preloadTriggerJobLazy$1$1$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
