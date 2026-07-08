package X;

import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bBj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C963810bBj implements InterfaceC963820bBk {
    public final long LIZ;
    public final int LIZIZ;
    public final User LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C963810bBj)) {
            return false;
        }
        C963810bBj c963810bBj = (C963810bBj) obj;
        return this.LIZ == c963810bBj.LIZ && this.LIZIZ == c963810bBj.LIZIZ && Intrinsics.LJFF(this.LIZJ, c963810bBj.LIZJ);
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FollowUserItemData(userId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", followStatus=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", user=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ() {
        int i = this.LIZIZ;
        return i == 1 || i == 2;
    }

    public C963810bBj(long j, int i, User user) {
        this.LIZ = j;
        this.LIZIZ = i;
        this.LIZJ = user;
    }
}
