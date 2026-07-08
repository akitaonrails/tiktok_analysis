package X;

import com.ss.android.ugc.feed.platform.cell.component.adaption.FeedCellAdaptionComponentV2;
import com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15bz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20555315bz extends C09AY implements Function0<InteractRightAreaAttachAbility> {
    public final /* synthetic */ FeedCellAdaptionComponentV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20555315bz(FeedCellAdaptionComponentV2 feedCellAdaptionComponentV2) {
        super(0);
        this.LL = feedCellAdaptionComponentV2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final InteractRightAreaAttachAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), InteractRightAreaAttachAbility.class, null);
    }
}
