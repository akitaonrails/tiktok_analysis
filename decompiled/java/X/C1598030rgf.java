package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rgf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1598030rgf {
    public final User LIZ;
    public final ThoughtInfo LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1598030rgf)) {
            return false;
        }
        C1598030rgf c1598030rgf = (C1598030rgf) obj;
        return Intrinsics.LJFF(this.LIZ, c1598030rgf.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1598030rgf.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1598030rgf.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RawThoughtItem(user=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", thoughtInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", entityId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1598030rgf(User user, ThoughtInfo thoughtInfo, String str) {
        this.LIZ = user;
        this.LIZIZ = thoughtInfo;
        this.LIZJ = str;
    }
}
