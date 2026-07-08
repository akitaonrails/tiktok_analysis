package X;

import com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomAreaComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RI0, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RI0 extends C09AY implements Function0<InteractInfoAreaAttachAbility> {
    public final /* synthetic */ InteractBottomAreaComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RI0(InteractBottomAreaComponent interactBottomAreaComponent) {
        super(0);
        this.LL = interactBottomAreaComponent;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final InteractInfoAreaAttachAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), InteractInfoAreaAttachAbility.class, null);
    }
}
