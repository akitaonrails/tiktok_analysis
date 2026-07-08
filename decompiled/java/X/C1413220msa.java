package X;

import com.ss.android.ugc.aweme.feed.model.trendingtopic.VideoTrendingTopic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0msa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1413220msa implements InterfaceC1891350zJl {
    public final VideoTrendingTopic LL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TopicListItem(topic=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LL.eventId);
    }

    public C1413220msa(VideoTrendingTopic videoTrendingTopic) {
        this.LL = videoTrendingTopic;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1413220msa) || this.LL.eventId != ((C1413220msa) obj).LL.eventId) {
            return false;
        }
        return true;
    }
}
