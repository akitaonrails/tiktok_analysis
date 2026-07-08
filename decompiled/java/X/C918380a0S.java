package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0a0S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C918380a0S {
    public static final /* synthetic */ int LIZJ = 0;
    public final List<C916860Zy0> LIZ;
    public final List<LinkPlayerInfo> LIZIZ;

    static {
        new C918390a0T();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C918380a0S)) {
            return false;
        }
        C918380a0S c918380a0S = (C918380a0S) obj;
        return Intrinsics.LJFF(this.LIZ, c918380a0S.LIZ) && Intrinsics.LJFF(this.LIZIZ, c918380a0S.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InviteCore(targets=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", playerInfoList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final LinkPlayerInfo LIZ() {
        LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) C13LP.LJJJLL(this.LIZIZ);
        if (linkPlayerInfo != null) {
            return linkPlayerInfo;
        }
        LinkPlayerInfo linkPlayerInfo2 = new LinkPlayerInfo();
        linkPlayerInfo2.LJII = ((C916860Zy0) C13LP.LJJJJZI(this.LIZ)).LIZIZ;
        User user = new User();
        user.setId(((C916860Zy0) C13LP.LJJJJZI(this.LIZ)).LIZ);
        linkPlayerInfo2.mUser = user;
        return linkPlayerInfo2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C918380a0S(List<C916860Zy0> list, List<? extends LinkPlayerInfo> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
        if (!list.isEmpty()) {
            return;
        }
        "InviteCore.targets must not be empty".toString();
        throw new IllegalArgumentException("InviteCore.targets must not be empty");
    }
}
