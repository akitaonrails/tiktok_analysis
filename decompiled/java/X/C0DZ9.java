package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DZ9, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DZ9 implements C0DZB {
    public final User LIZ;
    public final ThoughtInfo LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0DZ9)) {
            return false;
        }
        C0DZ9 c0dz9 = (C0DZ9) obj;
        return Intrinsics.LJFF(this.LIZ, c0dz9.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0dz9.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OpenOthers(user=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", thought=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DZ9(User user, ThoughtInfo thoughtInfo) {
        this.LIZ = user;
        this.LIZIZ = thoughtInfo;
    }
}
