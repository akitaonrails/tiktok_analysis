package X;

import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O4l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C613490O4l implements IEvent {
    public final TopicRawInfo LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C613490O4l)) {
            return false;
        }
        C613490O4l c613490O4l = (C613490O4l) obj;
        return Intrinsics.LJFF(this.LIZ, c613490O4l.LIZ) && this.LIZIZ == c613490O4l.LIZIZ;
    }

    public final int hashCode() {
        TopicRawInfo topicRawInfo = this.LIZ;
        return ((topicRawInfo == null ? 0 : topicRawInfo.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C1440005kM.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C1440005kM.LIZIZ(this);
        return this;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollectTopicEvent(topicInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", collectStatus=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C613490O4l(TopicRawInfo topicRawInfo, boolean z) {
        this.LIZ = topicRawInfo;
        this.LIZIZ = z;
    }
}
