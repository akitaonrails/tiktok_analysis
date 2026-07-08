package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S1Z, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S1Z extends AbstractC714580S1g {
    public final User LIZ;
    public final C0Y8T LIZIZ;
    public final Function0<String> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0S1Z)) {
            return false;
        }
        C0S1Z c0s1z = (C0S1Z) obj;
        return Intrinsics.LJFF(this.LIZ, c0s1z.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0s1z.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0s1z.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShareUnreadGroupMetaData(user=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", conversation=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", draftMessage=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0S1Z(User user, C0Y8T c0y8t, AwS412S0200000_11 awS412S0200000_11) {
        this.LIZ = user;
        this.LIZIZ = c0y8t;
        this.LIZJ = awS412S0200000_11;
    }
}
