package X;

import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.InteractVideoTagAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RZ8, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RZ8 extends C09AY implements Function0<InteractVideoTagAbility> {
    public final /* synthetic */ InteractAreaComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RZ8(InteractAreaComponent interactAreaComponent) {
        super(0);
        this.LL = interactAreaComponent;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.InteractVideoTagAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final InteractVideoTagAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), InteractVideoTagAbility.class, null);
    }
}
