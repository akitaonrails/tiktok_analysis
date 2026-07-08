package X;

import com.bytedance.android.livesdk.chatroom.model.RoomReplay;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.anchor.HighlightCollection;
import tikcast.api.anchor.HighlightCollectionElement;
import tikcast.api.anchor.LiveFragmentDetail;

/* JADX INFO: renamed from: X.0xot, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1833770xot implements InterfaceC1891350zJl {
    public final RoomReplay LL;
    public final List<LiveFragmentDetail> LLILLJJLI;
    public final HighlightCollection LLILLL;
    public boolean LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1833770xot)) {
            return false;
        }
        C1833770xot c1833770xot = (C1833770xot) obj;
        return Intrinsics.LJFF(this.LL, c1833770xot.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1833770xot.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1833770xot.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveReplayItem(roomPlay=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", liveFragmentList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", highlightCollection=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        List<LiveFragmentDetail> list;
        C1833770xot c1833770xot;
        HighlightCollection highlightCollection;
        boolean z = interfaceC1891350zJl instanceof C1833770xot;
        List<HighlightCollectionElement> list2 = null;
        if (z) {
            C1833770xot c1833770xot2 = (C1833770xot) interfaceC1891350zJl;
            if (c1833770xot2 != null) {
                list = c1833770xot2.LLILLJJLI;
            } else {
                list = null;
            }
            if (z && (c1833770xot = (C1833770xot) interfaceC1891350zJl) != null && (highlightCollection = c1833770xot.LLILLL) != null) {
                list2 = highlightCollection.elementList;
            }
            if (list != null && this.LLILLJJLI.size() == list.size() && list2 != null && this.LLILLL.elementList.size() == list2.size()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1833770xot c1833770xot;
        RoomReplay roomReplay;
        String str = this.LL.id;
        String str2 = null;
        if ((interfaceC1891350zJl instanceof C1833770xot) && (c1833770xot = (C1833770xot) interfaceC1891350zJl) != null && (roomReplay = c1833770xot.LL) != null) {
            str2 = roomReplay.id;
        }
        if (str.length() > 0 && C500260Jjc.LJJIIZ(str2) && Intrinsics.LJFF(str, str2)) {
            return true;
        }
        return false;
    }

    public C1833770xot(RoomReplay roomReplay, List<LiveFragmentDetail> list, HighlightCollection highlightCollection) {
        this.LL = roomReplay;
        this.LLILLJJLI = list;
        this.LLILLL = highlightCollection;
    }
}
