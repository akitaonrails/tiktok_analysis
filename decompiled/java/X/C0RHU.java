package X;

import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.DownloadPlaceHolderComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RHU, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RHU extends C09AY implements Function0<InteractAreaCommonAbility> {
    public final /* synthetic */ DownloadPlaceHolderComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RHU(DownloadPlaceHolderComponent downloadPlaceHolderComponent) {
        super(0);
        this.LL = downloadPlaceHolderComponent;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final InteractAreaCommonAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), InteractAreaCommonAbility.class, null);
    }
}
