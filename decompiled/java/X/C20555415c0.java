package X;

import com.ss.android.ugc.feed.platform.cell.component.adaption.FeedCellAdaptionComponentV2;
import com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15c0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20555415c0 extends C09AY implements Function0<InteractInfoAreaAttachAbility> {
    public final /* synthetic */ FeedCellAdaptionComponentV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20555415c0(FeedCellAdaptionComponentV2 feedCellAdaptionComponentV2) {
        super(0);
        this.LL = feedCellAdaptionComponentV2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final InteractInfoAreaAttachAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), InteractInfoAreaAttachAbility.class, null);
    }
}
