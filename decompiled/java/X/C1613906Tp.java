package X;

import com.ss.android.ugc.aweme.story.feed.immersive.component.StoryHighlightsComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Tp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.immersive.component.StoryHighlightsComponent$initObserver$1$1", f = "StoryHighlightsComponent.kt", l = {}, m = "invokeSuspend")
public final class C1613906Tp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ StoryHighlightsComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1613906Tp(StoryHighlightsComponent storyHighlightsComponent, InterfaceC1364105Vn<? super C1613906Tp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyHighlightsComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1613906Tp c1613906Tp = new C1613906Tp(this.LLILLJJLI, interfaceC1364105Vn);
        c1613906Tp.LL = obj;
        return c1613906Tp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryHighlightsComponent@b00f.initObserver$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1613806To(this.LLILLJJLI, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1614006Tq(this.LLILLJJLI, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1613606Tm(this.LLILLJJLI, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1613706Tn(this.LLILLJJLI, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1614106Tr(this.LLILLJJLI, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1614206Ts(this.LLILLJJLI, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryHighlightsComponent@b00f.initObserver$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
