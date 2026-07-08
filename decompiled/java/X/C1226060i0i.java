package X;

import com.bytedance.android.live.base.model.user.User;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i0i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226060i0i {
    public final List<User> LIZ;
    public final List<User> LIZIZ;
    public final List<User> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1226060i0i)) {
            return false;
        }
        C1226060i0i c1226060i0i = (C1226060i0i) obj;
        return Intrinsics.LJFF(this.LIZ, c1226060i0i.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1226060i0i.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1226060i0i.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveInviteGuestSelectedDataItem(allSelectedUserInfos=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", selectedFriendInfos=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", selectedUserInfos=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1226060i0i(List<? extends User> list, List<? extends User> list2, List<? extends User> list3) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = list3;
    }
}
