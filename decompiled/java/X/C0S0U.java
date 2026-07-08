package X;

import com.ss.android.ugc.aweme.feed.model.MiniDramaCardInfo;
import com.ss.android.ugc.aweme.feed.model.MiniDramaFeedCardStyle;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0S0U, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S0U extends C09AY implements Function1<C711340RvI, Boolean> {
    public C0S0U() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C711340RvI c711340RvI) {
        PaidContentInfo paidContentInfo;
        MiniDramaCardInfo miniDramaCardInfo;
        C711340RvI c711340RvI2 = c711340RvI;
        boolean z = false;
        if (c711340RvI2.LIZ.getAwemeType() == 110 && (paidContentInfo = c711340RvI2.LIZ.mPaidContentInfo) != null && (miniDramaCardInfo = paidContentInfo.getMiniDramaCardInfo()) != null) {
            Integer num = miniDramaCardInfo.style;
            int value = MiniDramaFeedCardStyle.MINI_DRAMA_FEED_CARD_STYLE_HIGHLIGHT_VIDEO.getValue();
            if (num != null && num.intValue() == value) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
