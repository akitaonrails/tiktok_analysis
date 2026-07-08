package X;

import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wLb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777170wLb implements InterfaceC1785530wZ5 {
    public final User LIZ;
    public final long LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777170wLb)) {
            return false;
        }
        C1777170wLb c1777170wLb = (C1777170wLb) obj;
        return Intrinsics.LJFF(this.LIZ, c1777170wLb.LIZ) && this.LIZIZ == c1777170wLb.LIZIZ && this.LIZJ == c1777170wLb.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowPrivateFollowGuide(user=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", rank=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777170wLb(long j, long j2, User user) {
        this.LIZ = user;
        this.LIZIZ = j;
        this.LIZJ = j2;
    }
}
