package X;

import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2;
import com.ss.android.ugc.feed.platform.cell.component.adaption.FeedCellAdaptionComponentV2;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.159W, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final /* synthetic */ class C159W extends C2217421BqW implements Function0<VideoAdaptionResult> {
    public C159W(FeedCellAdaptionComponentV2 feedCellAdaptionComponentV2) {
        super(0, feedCellAdaptionComponentV2, FeedCellAdaptionComponentV2.class, "getDesireAdaptionResult", "getDesireAdaptionResult()Lcom/ss/android/ugc/aweme/videoadaption/adaptionparams/VideoAdaptionResult;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final VideoAdaptionResult invoke() {
        return ((CellAdaptionComponentV2) this.receiver).wB2();
    }
}
