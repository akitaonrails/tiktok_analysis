package X;

import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedEcSearchBottomBarAssemTrigger;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Qze, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C688560Qze extends C09AY implements Function0<BottomBarPriorityAbility> {
    public final /* synthetic */ FeedEcSearchBottomBarAssemTrigger LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C688560Qze(FeedEcSearchBottomBarAssemTrigger feedEcSearchBottomBarAssemTrigger) {
        super(0);
        this.LL = feedEcSearchBottomBarAssemTrigger;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final BottomBarPriorityAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), BottomBarPriorityAbility.class, null);
    }
}
