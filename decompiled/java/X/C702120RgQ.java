package X;

import com.ss.android.ugc.feed.platform.componentmanager.data.FCPConfigState;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0RgQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C702120RgQ extends C09AY implements Function2<FCPConfigState, Object, FCPConfigState> {
    public C702120RgQ() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final FCPConfigState invoke(FCPConfigState fCPConfigState, Object obj) {
        FeedComponentPriorityData feedComponentPriorityData;
        C702530Rh5 c702530Rh5 = (C702530Rh5) C700690Re7.LJFF(obj);
        FeedComponentPriorityData feedComponentPriorityData2 = null;
        if (c702530Rh5 != null) {
            feedComponentPriorityData2 = c702530Rh5.LIZ;
            feedComponentPriorityData = c702530Rh5.LIZ;
        } else {
            feedComponentPriorityData = null;
        }
        return new FCPConfigState(feedComponentPriorityData2, feedComponentPriorityData, null, null, null, null);
    }
}
