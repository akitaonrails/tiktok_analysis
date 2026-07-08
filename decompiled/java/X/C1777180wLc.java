package X;

import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wLc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777180wLc implements InterfaceC1785530wZ5 {
    public final User LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777180wLc)) {
            return false;
        }
        C1777180wLc c1777180wLc = (C1777180wLc) obj;
        return Intrinsics.LJFF(this.LIZ, c1777180wLc.LIZ) && this.LIZIZ == c1777180wLc.LIZIZ && this.LIZJ == c1777180wLc.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1777180wLc.LIZLLL) && this.LJ == c1777180wLc.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OpenUserProfile(user=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", rank=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", rankName=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", showAlreadyInLiveToast=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777180wLc(User user, long j, long j2, String str, boolean z) {
        this.LIZ = user;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = str;
        this.LJ = z;
    }
}
