package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NxA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryFeedViewUpdater$updateUserStoryToPO$1", f = "StoryFeedViewUpdater.kt", l = {112}, m = "invokeSuspend")
public final class C610580NxA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ UserStory LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C610580NxA(String str, UserStory userStory, InterfaceC1364105Vn<? super C610580NxA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = userStory;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C610580NxA(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryFeedViewUpdater@d417.updateUserStoryToPO$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                InterfaceC610590NxB interfaceC610590NxBLJFF = C614770O9j.LIZIZ.LJFF();
                String str = this.LLILLJJLI;
                UserStory userStory = this.LLILLL;
                this.LL = 1;
                if (interfaceC610590NxBLJFF.LIZIZ(str, userStory, this) == objLJFF) {
                    C1C7U.LIZIZ("StoryFeedViewUpdater@d417.updateUserStoryToPO$1");
                    return objLJFF;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryFeedViewUpdater@d417.updateUserStoryToPO$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
