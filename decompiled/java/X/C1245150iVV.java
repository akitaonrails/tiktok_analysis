package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iVV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1245150iVV {
    public final User LIZ;
    public final ProfileUser LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1245150iVV)) {
            return false;
        }
        C1245150iVV c1245150iVV = (C1245150iVV) obj;
        return Intrinsics.LJFF(this.LIZ, c1245150iVV.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1245150iVV.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SyncResult(currentUser=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", profileUser=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1245150iVV(User user, ProfileUser profileUser) {
        this.LIZ = user;
        this.LIZIZ = profileUser;
    }
}
