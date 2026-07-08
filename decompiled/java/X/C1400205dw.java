package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection;
import com.ss.android.ugc.aweme.story.note.StoryThoughtMyDataManagerImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05dw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.note.StoryThoughtMyDataManagerImpl$getMyStoryThoughtFromCache$1$1", f = "StoryThoughtMyDataManagerImpl.kt", l = {}, m = "invokeSuspend")
public final class C1400205dw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StoryThoughtMyDataManagerImpl LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function1<StoryNoteDataCollection, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1400205dw(StoryThoughtMyDataManagerImpl storyThoughtMyDataManagerImpl, String str, Function1<? super StoryNoteDataCollection, Unit> function1, InterfaceC1364105Vn<? super C1400205dw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = storyThoughtMyDataManagerImpl;
        this.LLILLJJLI = str;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1400205dw(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("StoryThoughtMyDataManagerImpl@896a.getMyStoryThoughtFromCache$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String string = this.LL.LLILZLL.getString(this.LLILLJJLI, "");
        StoryThoughtMyDataManagerImpl storyThoughtMyDataManagerImpl = this.LL;
        try {
            c098200Yq = (StoryNoteDataCollection) ((Gson) storyThoughtMyDataManagerImpl.LLIZ.getValue()).LJII(string, StoryNoteDataCollection.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        storyThoughtMyDataManagerImpl.LLILLL = (StoryNoteDataCollection) c098200Yq;
        StoryThoughtMyDataManagerImpl storyThoughtMyDataManagerImpl2 = this.LL;
        C23250099c.LIZLLL(storyThoughtMyDataManagerImpl2.LLJ, null, null, new C1400305dx(this.LLILLL, storyThoughtMyDataManagerImpl2, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryThoughtMyDataManagerImpl@896a.getMyStoryThoughtFromCache$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
