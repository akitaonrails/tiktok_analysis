package X;

import com.ss.android.ugc.aweme.videoadaption.adaptionparams.AdaptionPaddingValues;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2;
import com.ss.android.ugc.feed.platform.cell.component.adaption.FeedCellAdaptionComponentV2;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.159Z, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final /* synthetic */ class C159Z extends C2217421BqW implements Function0<AdaptionPaddingValues> {
    public C159Z(FeedCellAdaptionComponentV2 feedCellAdaptionComponentV2) {
        super(0, feedCellAdaptionComponentV2, FeedCellAdaptionComponentV2.class, "getDesireVideoPaddingValues", "getDesireVideoPaddingValues()Lcom/ss/android/ugc/aweme/videoadaption/adaptionparams/AdaptionPaddingValues;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final AdaptionPaddingValues invoke() {
        return ((CellAdaptionComponentV2) this.receiver).n81();
    }
}
