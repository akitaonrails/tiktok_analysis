package X;

import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wLd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777190wLd implements InterfaceC1777220wLg {
    public final User LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777190wLd)) {
            return false;
        }
        C1777190wLd c1777190wLd = (C1777190wLd) obj;
        return Intrinsics.LJFF(this.LIZ, c1777190wLd.LIZ) && this.LIZIZ == c1777190wLd.LIZIZ && this.LIZJ == c1777190wLd.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1777190wLd.LIZLLL) && this.LJ == c1777190wLd.LJ;
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

    public /* synthetic */ C1777190wLd(User user, long j, long j2, String str) {
        this(user, j, j2, str, false);
    }

    public C1777190wLd(User user, long j, long j2, String str, boolean z) {
        this.LIZ = user;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = str;
        this.LJ = z;
    }
}
