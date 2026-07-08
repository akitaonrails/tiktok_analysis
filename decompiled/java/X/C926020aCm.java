package X;

import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aCm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C926020aCm extends AbstractC926030aCn {
    public final String LIZLLL;
    public final User LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C926020aCm)) {
            return false;
        }
        C926020aCm c926020aCm = (C926020aCm) obj;
        return Intrinsics.LJFF(this.LIZLLL, c926020aCm.LIZLLL) && Intrinsics.LJFF(this.LJ, c926020aCm.LJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZLLL.hashCode() * 31;
        User user = this.LJ;
        return iHashCode + (user == null ? 0 : user.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PostBgToFgInvitedDialog(originLinkmicId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", sourceUser=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C926020aCm(User user, String str) {
        this.LIZLLL = str;
        this.LJ = user;
    }
}
