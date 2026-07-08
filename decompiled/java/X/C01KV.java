package X;

import com.ss.android.ugc.aweme.story.api.StoryApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01KV, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.reveal.StoryRevealActiveManager$reportActive$1", f = "StoryRevealActiveManager.kt", l = {57}, m = "invokeSuspend")
public final class C01KV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C01KV(InterfaceC1364105Vn<? super C01KV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01KV(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryRevealActiveManager@1b2d.reportActive$1");
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
            StoryApi storyApi = StoryApi.LIZIZ;
            this.LL = 1;
            if (storyApi.reportStoryReveal(2, this) == objLJFF) {
                C1C7U.LIZIZ("StoryRevealActiveManager@1b2d.reportActive$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryRevealActiveManager@1b2d.reportActive$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C01KV(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
