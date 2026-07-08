package X;

import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarAssemTrigger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Qzg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C688580Qzg extends C09AY implements Function0<CellAdaptionComponentAbility> {
    public final /* synthetic */ FeedSearchBottomBarAssemTrigger LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C688580Qzg(FeedSearchBottomBarAssemTrigger feedSearchBottomBarAssemTrigger) {
        super(0);
        this.LL = feedSearchBottomBarAssemTrigger;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final CellAdaptionComponentAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), CellAdaptionComponentAbility.class, null);
    }
}
