package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e8R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1077090e8R implements InterfaceC111300bX {
    public final C1262950iyD LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1077090e8R)) {
            return false;
        }
        C1077090e8R c1077090e8R = (C1077090e8R) obj;
        return Intrinsics.LJFF(this.LL, c1077090e8R.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1077090e8R.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1077090e8R.LLILLL) && this.LLILZ == c1077090e8R.LLILZ;
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NewVersionRecFriendsDetail(config=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", platforms=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", skipPlatforms=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isAfterAuth=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1077090e8R(C1262950iyD c1262950iyD, String str, String str2, boolean z) {
        this.LL = c1262950iyD;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = z;
    }
}
