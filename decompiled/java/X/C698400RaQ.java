package X;

import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;
import com.ss.android.ugc.feed.platform.cell.interact.mob.InteractAreaSizeMobAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RaQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698400RaQ extends C09AY implements Function0<InteractAreaSizeMobAbility> {
    public final /* synthetic */ InteractAreaComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C698400RaQ(InteractAreaComponent interactAreaComponent) {
        super(0);
        this.LL = interactAreaComponent;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.feed.platform.cell.interact.mob.InteractAreaSizeMobAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final InteractAreaSizeMobAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), InteractAreaSizeMobAbility.class, null);
    }
}
