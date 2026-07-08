package X;

import Y.AgS283S0100000_2;
import com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsMyDataManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05e1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsMyDataManager$1", f = "StoryHighlightsMyDataManager.kt", l = {69}, m = "invokeSuspend")
public final class C1400705e1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryHighlightsMyDataManager LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1400705e1(StoryHighlightsMyDataManager storyHighlightsMyDataManager, InterfaceC1364105Vn<? super C1400705e1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyHighlightsMyDataManager;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1400705e1(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryHighlightsMyDataManager@3b8f.<init>$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            StoryHighlightsMyDataManager storyHighlightsMyDataManager = this.LLILLJJLI;
            C2252321DDq c2252321DDq = storyHighlightsMyDataManager.LIZIZ;
            AgS283S0100000_2 agS283S0100000_2 = new AgS283S0100000_2(storyHighlightsMyDataManager, 41);
            this.LL = 1;
            if (c2252321DDq.collect(agS283S0100000_2, this) == objLJFF) {
                C1C7U.LIZIZ("StoryHighlightsMyDataManager@3b8f.<init>$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
