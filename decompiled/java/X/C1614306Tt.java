package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.ss.android.ugc.aweme.story.feed.immersive.component.StoryHighlightsComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Tt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.immersive.component.StoryHighlightsComponent$initObserver$1", f = "StoryHighlightsComponent.kt", l = {152}, m = "invokeSuspend")
public final class C1614306Tt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LifecycleOwner LLILLJJLI;
    public final /* synthetic */ StoryHighlightsComponent LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1614306Tt(LifecycleOwner lifecycleOwner, StoryHighlightsComponent storyHighlightsComponent, InterfaceC1364105Vn<? super C1614306Tt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = storyHighlightsComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1614306Tt(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryHighlightsComponent@b00f.initObserver$1");
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
            LifecycleOwner lifecycleOwner = this.LLILLJJLI;
            Lifecycle.State state = Lifecycle.State.STARTED;
            C1613906Tp c1613906Tp = new C1613906Tp(this.LLILLL, null);
            this.LL = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycleOwner, state, c1613906Tp, this) == objLJFF) {
                C1C7U.LIZIZ("StoryHighlightsComponent@b00f.initObserver$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryHighlightsComponent@b00f.initObserver$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
