package X;

import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0a90, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C923680a90 {
    public final String LIZ;
    public final User LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C923680a90)) {
            return false;
        }
        C923680a90 c923680a90 = (C923680a90) obj;
        return Intrinsics.LJFF(this.LIZ, c923680a90.LIZ) && Intrinsics.LJFF(this.LIZIZ, c923680a90.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        User user = this.LIZIZ;
        return iHashCode + (user == null ? 0 : user.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiGuestV3GuestCheckAndShowInvitedDialogData(originLinkId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", approverUser=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C923680a90(User user, String str) {
        this.LIZ = str;
        this.LIZIZ = user;
    }
}
