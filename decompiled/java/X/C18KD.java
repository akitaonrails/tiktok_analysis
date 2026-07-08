package X;

import com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.FcpComponentTracker;
import com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.FcpPageNode;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18KD, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18KD extends C09AY implements Function1<FcpPageNode, Boolean> {
    public C18KD() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(FcpPageNode fcpPageNode) {
        FcpComponentTracker tracker = fcpPageNode.getTracker();
        if (tracker != null) {
            tracker.resume();
        }
        return Boolean.TRUE;
    }
}
