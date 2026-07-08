package X;

import com.bytedance.android.livesdk.chatroom.model.RoomReplay;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.anchor.LiveFragmentDetail;

/* JADX INFO: renamed from: X.0xpO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1834080xpO implements InterfaceC1891350zJl {
    public final RoomReplay LL;
    public final List<C1834130xpT> LLILLJJLI;
    public final List<LiveFragmentDetail> LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1834080xpO)) {
            return false;
        }
        C1834080xpO c1834080xpO = (C1834080xpO) obj;
        return Intrinsics.LJFF(this.LL, c1834080xpO.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1834080xpO.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1834080xpO.LLILLL) && this.LLILZ == c1834080xpO.LLILZ && this.LLILZIL == c1834080xpO.LLILZIL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveReplayFromBBItem(roomPlay=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", fragmentCoverItemList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", liveFragmentList=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isBBFans=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isFromCampaign=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return this.LLILLJJLI.size();
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        List<C1834130xpT> list;
        C1834080xpO c1834080xpO;
        if ((interfaceC1891350zJl instanceof C1834080xpO) && (c1834080xpO = (C1834080xpO) interfaceC1891350zJl) != null) {
            list = c1834080xpO.LLILLJJLI;
        } else {
            list = null;
        }
        if (list == null || this.LLILLJJLI.size() != list.size()) {
            return false;
        }
        int i = 0;
        for (C1834130xpT c1834130xpT : this.LLILLJJLI) {
            int i2 = i + 1;
            if (i >= 0) {
                C1834130xpT c1834130xpT2 = c1834130xpT;
                C1834130xpT c1834130xpT3 = (C1834130xpT) C13LP.LJJJLZIJ(i, list);
                if (c1834130xpT3 == null || c1834130xpT2.LLILZLL != c1834130xpT3.LLILZLL) {
                    return false;
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1834080xpO c1834080xpO;
        RoomReplay roomReplay;
        String str = this.LL.id;
        String str2 = null;
        if ((interfaceC1891350zJl instanceof C1834080xpO) && (c1834080xpO = (C1834080xpO) interfaceC1891350zJl) != null && (roomReplay = c1834080xpO.LL) != null) {
            str2 = roomReplay.id;
        }
        if (str.length() > 0 && C500260Jjc.LJJIIZ(str2) && Intrinsics.LJFF(str, str2)) {
            return true;
        }
        return false;
    }

    public C1834080xpO(RoomReplay roomReplay, List<C1834130xpT> list, List<LiveFragmentDetail> list2, boolean z, boolean z2) {
        this.LL = roomReplay;
        this.LLILLJJLI = list;
        this.LLILLL = list2;
        this.LLILZ = z;
        this.LLILZIL = z2;
    }
}
