package X;

import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.feed.platform.cell.interact.InteractContainerComponent;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RE2, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RE2 extends C09AY implements Function1<C0RTA, Unit> {
    public final /* synthetic */ BaseFeedPageParams LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RE2(BaseFeedPageParams baseFeedPageParams) {
        super(1);
        this.LL = baseFeedPageParams;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RTA c0rta) {
        C0RTA c0rta2 = c0rta;
        c0rta2.LLJI = R.id.view_rootview;
        InteractContainerComponent interactContainerComponent = new InteractContainerComponent();
        interactContainerComponent.LLJJJJLIIL = this.LL;
        c0rta2.LLJ = interactContainerComponent;
        return Unit.LIZ;
    }
}
