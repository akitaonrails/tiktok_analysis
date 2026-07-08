package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RaT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698430RaT extends C09AY implements Function0<C699160Rbe<VideoItemParams>> {
    public final /* synthetic */ InteractAreaComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C698430RaT(InteractAreaComponent interactAreaComponent) {
        super(0);
        this.LL = interactAreaComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C699160Rbe<VideoItemParams> invoke() {
        InteractAreaComponent interactAreaComponent = this.LL;
        return new C699160Rbe<>(interactAreaComponent, new C0RYN(interactAreaComponent));
    }
}
