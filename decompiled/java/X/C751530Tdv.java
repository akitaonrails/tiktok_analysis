package X;

import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tdv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.panel.viewpager.ViewPagerPanelComponent$preloadTriggerJobLazy$1$1$1$1", f = "ViewPagerPanelComponent.kt", l = {}, m = "invokeSuspend")
public final class C751530Tdv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ VerticalViewPager LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751530Tdv(VerticalViewPager verticalViewPager, InterfaceC1364105Vn<? super C751530Tdv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = verticalViewPager;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C751530Tdv(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ViewPagerPanelComponent@376b.preloadTriggerJobLazy$1$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        VerticalViewPager verticalViewPager = this.LL;
        verticalViewPager.LLLFFI = true;
        verticalViewPager.LJJIII();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ViewPagerPanelComponent@376b.preloadTriggerJobLazy$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
