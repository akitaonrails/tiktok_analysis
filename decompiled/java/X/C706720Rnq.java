package X;

import com.ss.android.ugc.aweme.feed.assem.story.QuickDMEntranceTrigger;
import com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Rnq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C706720Rnq extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ QuickDMEntranceTrigger LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C706720Rnq(QuickDMEntranceTrigger quickDMEntranceTrigger) {
        super(1);
        this.LL = quickDMEntranceTrigger;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        QuickDMEntranceTrigger quickDMEntranceTrigger = this.LL;
        PriorityAbility priorityAbility = (PriorityAbility) quickDMEntranceTrigger.LLJL.getValue();
        if (priorityAbility != null) {
            priorityAbility.nw0(quickDMEntranceTrigger, false);
        }
        FeedBottomButtonAbility feedBottomButtonAbility = (FeedBottomButtonAbility) quickDMEntranceTrigger.LLJLIL.getValue();
        if (feedBottomButtonAbility != null) {
            feedBottomButtonAbility.Ds2();
        }
        return Unit.LIZ;
    }
}
