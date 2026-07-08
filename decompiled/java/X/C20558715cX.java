package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.cell.component.adaption.FeedCellAdaptionComponentV2;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15cX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20558715cX extends C09AY implements Function0<String> {
    public final /* synthetic */ FeedCellAdaptionComponentV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20558715cX(FeedCellAdaptionComponentV2 feedCellAdaptionComponentV2) {
        super(0);
        this.LL = feedCellAdaptionComponentV2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        Aweme awemeKp = this.LL.kp();
        if (awemeKp != null) {
            return awemeKp.getAid();
        }
        return null;
    }
}
