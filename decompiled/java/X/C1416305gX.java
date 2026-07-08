package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.inbox.view.StoryOnThisDayInboxCell;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05gX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.inbox.view.StoryOnThisDayInboxCell$onItemViewClick$1$1$job2$1", f = "StoryOnThisDayInboxCell.kt", l = {113}, m = "invokeSuspend")
public final class C1416305gX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryOnThisDayInboxCell LLILLJJLI;
    public final /* synthetic */ List<Aweme> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1416305gX(StoryOnThisDayInboxCell storyOnThisDayInboxCell, List<? extends Aweme> list, InterfaceC1364105Vn<? super C1416305gX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyOnThisDayInboxCell;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1416305gX(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryOnThisDayInboxCell@e45c.onItemViewClick$1$1$job2$1");
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
            StoryOnThisDayInboxCell storyOnThisDayInboxCell = this.LLILLJJLI;
            List<Aweme> list = this.LLILLL;
            this.LL = 1;
            storyOnThisDayInboxCell.getClass();
            if (StoryOnThisDayInboxCell.L5(1, list, this) == objLJFF) {
                C1C7U.LIZIZ("StoryOnThisDayInboxCell@e45c.onItemViewClick$1$1$job2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryOnThisDayInboxCell@e45c.onItemViewClick$1$1$job2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
