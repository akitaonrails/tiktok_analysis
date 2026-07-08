package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S1X, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S1X extends AbstractC714580S1g {
    public final User LIZ;
    public final Function0<String> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0S1X)) {
            return false;
        }
        C0S1X c0s1x = (C0S1X) obj;
        return Intrinsics.LJFF(this.LIZ, c0s1x.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0s1x.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShareUnreadSingleMetaData(user=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", draftMessage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0S1X(User user, AwS412S0200000_11 awS412S0200000_11) {
        this.LIZ = user;
        this.LIZIZ = awS412S0200000_11;
    }
}
