package X;

import com.bytedance.android.live.base.model.user.User;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.room.WebcastRoomRepostRepostersResponse;

/* JADX INFO: renamed from: X.0y2M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1842120y2M implements InterfaceC1891350zJl {
    public final Aweme LL;
    public final WebcastRoomRepostRepostersResponse.Reposter LLILLJJLI;
    public final LiveRoomStruct LLILLL;
    public final Map<String, String> LLILZ;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        User user;
        Object[] objArr = new Object[1];
        WebcastRoomRepostRepostersResponse.Reposter reposter = this.LLILLJJLI;
        objArr[0] = (reposter == null || (user = reposter.user) == null) ? null : Long.valueOf(user.getId());
        return Objects.hash(objArr);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostPanelListItem(aweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", reposter=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", room=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", logMap=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        Long lValueOf;
        Long lValueOf2;
        Long l;
        User user;
        User user2;
        User user3;
        User user4;
        if (!(interfaceC1891350zJl instanceof C1842120y2M)) {
            return false;
        }
        WebcastRoomRepostRepostersResponse.Reposter reposter = this.LLILLJJLI;
        Long l2 = null;
        if (reposter != null && (user4 = reposter.user) != null) {
            lValueOf = Long.valueOf(user4.getId());
        } else {
            lValueOf = null;
        }
        C1842120y2M c1842120y2M = (C1842120y2M) interfaceC1891350zJl;
        WebcastRoomRepostRepostersResponse.Reposter reposter2 = c1842120y2M.LLILLJJLI;
        if (reposter2 != null && (user3 = reposter2.user) != null) {
            lValueOf2 = Long.valueOf(user3.getId());
        } else {
            lValueOf2 = null;
        }
        if (!Intrinsics.LJFF(lValueOf, lValueOf2)) {
            return false;
        }
        WebcastRoomRepostRepostersResponse.Reposter reposter3 = this.LLILLJJLI;
        if (reposter3 != null && (user2 = reposter3.user) != null) {
            l = user2.followStatus;
        } else {
            l = null;
        }
        WebcastRoomRepostRepostersResponse.Reposter reposter4 = c1842120y2M.LLILLJJLI;
        if (reposter4 != null && (user = reposter4.user) != null) {
            l2 = user.followStatus;
        }
        if (!Intrinsics.LJFF(l, l2)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        Long lValueOf;
        User user;
        User user2;
        if (!(interfaceC1891350zJl instanceof C1842120y2M)) {
            return false;
        }
        WebcastRoomRepostRepostersResponse.Reposter reposter = this.LLILLJJLI;
        Long lValueOf2 = null;
        if (reposter != null && (user2 = reposter.user) != null) {
            lValueOf = Long.valueOf(user2.getId());
        } else {
            lValueOf = null;
        }
        WebcastRoomRepostRepostersResponse.Reposter reposter2 = ((C1842120y2M) interfaceC1891350zJl).LLILLJJLI;
        if (reposter2 != null && (user = reposter2.user) != null) {
            lValueOf2 = Long.valueOf(user.getId());
        }
        return Intrinsics.LJFF(lValueOf, lValueOf2);
    }

    public final boolean equals(Object obj) {
        Long lValueOf;
        Long lValueOf2;
        Long l;
        User user;
        User user2;
        User user3;
        User user4;
        if (!(obj instanceof C1842120y2M)) {
            return false;
        }
        WebcastRoomRepostRepostersResponse.Reposter reposter = this.LLILLJJLI;
        Long l2 = null;
        if (reposter != null && (user4 = reposter.user) != null) {
            lValueOf = Long.valueOf(user4.getId());
        } else {
            lValueOf = null;
        }
        C1842120y2M c1842120y2M = (C1842120y2M) obj;
        WebcastRoomRepostRepostersResponse.Reposter reposter2 = c1842120y2M.LLILLJJLI;
        if (reposter2 != null && (user3 = reposter2.user) != null) {
            lValueOf2 = Long.valueOf(user3.getId());
        } else {
            lValueOf2 = null;
        }
        if (!Intrinsics.LJFF(lValueOf, lValueOf2)) {
            return false;
        }
        WebcastRoomRepostRepostersResponse.Reposter reposter3 = this.LLILLJJLI;
        if (reposter3 != null && (user2 = reposter3.user) != null) {
            l = user2.followStatus;
        } else {
            l = null;
        }
        WebcastRoomRepostRepostersResponse.Reposter reposter4 = c1842120y2M.LLILLJJLI;
        if (reposter4 != null && (user = reposter4.user) != null) {
            l2 = user.followStatus;
        }
        if (!Intrinsics.LJFF(l, l2)) {
            return false;
        }
        return true;
    }

    public C1842120y2M(Aweme aweme, WebcastRoomRepostRepostersResponse.Reposter reposter, LiveRoomStruct liveRoomStruct, Map<String, String> map) {
        this.LL = aweme;
        this.LLILLJJLI = reposter;
        this.LLILLL = liveRoomStruct;
        this.LLILZ = map;
    }
}
