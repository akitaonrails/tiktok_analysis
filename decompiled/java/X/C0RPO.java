package X;

import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;
import com.ss.android.ugc.feed.platform.cell.interact.info.titlecontainer.InteractTitleContainerAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RPO, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RPO extends C09AY implements Function0<InteractTitleContainerAbility> {
    public final /* synthetic */ InteractAreaComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RPO(InteractAreaComponent interactAreaComponent) {
        super(0);
        this.LL = interactAreaComponent;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.feed.platform.cell.interact.info.titlecontainer.InteractTitleContainerAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final InteractTitleContainerAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), InteractTitleContainerAbility.class, null);
    }
}
