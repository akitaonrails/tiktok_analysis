package X;

import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.info.InteractInfoAreaComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RHq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C693360RHq extends C09AY implements Function0<InteractAreaCommonAbility> {
    public final /* synthetic */ InteractInfoAreaComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C693360RHq(InteractInfoAreaComponent interactInfoAreaComponent) {
        super(0);
        this.LL = interactInfoAreaComponent;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final InteractAreaCommonAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), InteractAreaCommonAbility.class, null);
    }
}
