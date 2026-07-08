package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.inbox.StoryInboxItem;
import com.ss.android.ugc.aweme.story.inbox.view.StoryInboxCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Cxp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.inbox.view.StoryInboxCell$refreshViewerInsightCache$1$1", f = "StoryInboxCell.kt", l = {}, m = "invokeSuspend")
public final class C330710Cxp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ StoryInboxCell LLILLJJLI;
    public final /* synthetic */ InterfaceC330550CxZ LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C330710Cxp(int i, StoryInboxCell storyInboxCell, InterfaceC330550CxZ interfaceC330550CxZ, String str, InterfaceC1364105Vn<? super C330710Cxp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = storyInboxCell;
        this.LLILLL = interfaceC330550CxZ;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C330710Cxp(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryInboxCell@cf72.refreshViewerInsightCache$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = this.LL;
        StoryInboxCell storyInboxCell = this.LLILLJJLI;
        if (i != storyInboxCell.LLILZ) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("StoryInboxCell@cf72.refreshViewerInsightCache$1$1");
            return unit;
        }
        storyInboxCell.LLILLJJLI = null;
        storyInboxCell.LLILLL = null;
        if (this.LLILLL == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("StoryInboxCell@cf72.refreshViewerInsightCache$1$1");
            return unit2;
        }
        if (storyInboxCell.LLJJJJ && storyInboxCell.LLJJIJIL) {
            StoryInboxItem storyInboxItemB7 = storyInboxCell.b7();
            if (storyInboxItemB7 == null) {
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("StoryInboxCell@cf72.refreshViewerInsightCache$1$1");
                return unit3;
            }
            this.LLILLJJLI.getClass();
            Aweme awemeL7 = StoryInboxCell.l7(storyInboxItemB7);
            if (awemeL7 == null) {
                Unit unit4 = Unit.LIZ;
                C1C7U.LIZIZ("StoryInboxCell@cf72.refreshViewerInsightCache$1$1");
                return unit4;
            }
            if (!Intrinsics.LJFF(awemeL7.getAid(), this.LLILZ)) {
                Unit unit5 = Unit.LIZ;
                C1C7U.LIZIZ("StoryInboxCell@cf72.refreshViewerInsightCache$1$1");
                return unit5;
            }
            this.LLILLJJLI.T5(storyInboxItemB7, awemeL7, this.LLILLL);
            Unit unit6 = Unit.LIZ;
            C1C7U.LIZIZ("StoryInboxCell@cf72.refreshViewerInsightCache$1$1");
            return unit6;
        }
        Unit unit7 = Unit.LIZ;
        C1C7U.LIZIZ("StoryInboxCell@cf72.refreshViewerInsightCache$1$1");
        return unit7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
