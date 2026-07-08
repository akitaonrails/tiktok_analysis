package X;

import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.FriendsIDInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H0p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C434130H0p {
    public final boolean LIZ;
    public final FriendsIDInfo LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C434130H0p)) {
            return false;
        }
        C434130H0p c434130H0p = (C434130H0p) obj;
        return this.LIZ == c434130H0p.LIZ && Intrinsics.LJFF(this.LIZIZ, c434130H0p.LIZIZ);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        FriendsIDInfo friendsIDInfo = this.LIZIZ;
        return iZ2 + (friendsIDInfo == null ? 0 : friendsIDInfo.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InputEntranceState(visible=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", friendsIDInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C434130H0p(boolean z, FriendsIDInfo friendsIDInfo) {
        this.LIZ = z;
        this.LIZIZ = friendsIDInfo;
    }

    public static C434130H0p LIZ(C434130H0p c434130H0p, boolean z, FriendsIDInfo friendsIDInfo, int i) {
        if ((i & 1) != 0) {
            z = c434130H0p.LIZ;
        }
        if ((i & 2) != 0) {
            friendsIDInfo = c434130H0p.LIZIZ;
        }
        c434130H0p.getClass();
        return new C434130H0p(z, friendsIDInfo);
    }
}
