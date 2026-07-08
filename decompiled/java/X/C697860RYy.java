package X;

import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.GameLiveBottomBarAssemTriggerV2;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RYy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C697860RYy extends C09AY implements Function0<BottomBarPriorityAbility> {
    public final /* synthetic */ GameLiveBottomBarAssemTriggerV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C697860RYy(GameLiveBottomBarAssemTriggerV2 gameLiveBottomBarAssemTriggerV2) {
        super(0);
        this.LL = gameLiveBottomBarAssemTriggerV2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final BottomBarPriorityAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), BottomBarPriorityAbility.class, null);
    }
}
