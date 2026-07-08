package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0K6W, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K6W {
    public static final /* synthetic */ int LJ = 0;
    public final String LIZ;
    public final boolean LIZIZ = true;
    public final String LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0K6W)) {
            return false;
        }
        C0K6W c0k6w = (C0K6W) obj;
        return Intrinsics.LJFF(this.LIZ, c0k6w.LIZ) && this.LIZIZ == c0k6w.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0k6w.LIZJ) && this.LIZLLL == c0k6w.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivilegeDetailKey(secAnchorId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", useNewPage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", liveSubOnlyLiveTier=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0K6W(long j, String str, String str2) {
        this.LIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = j;
    }
}
