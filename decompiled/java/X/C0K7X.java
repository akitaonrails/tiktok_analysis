package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0K7X, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K7X {
    public final String LIZ;
    public final String LIZIZ;
    public final C0K7U LIZJ;
    public final String LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final C0K46 LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0K7X)) {
            return false;
        }
        C0K7X c0k7x = (C0K7X) obj;
        return Intrinsics.LJFF(this.LIZ, c0k7x.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0k7x.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0k7x.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0k7x.LIZLLL) && this.LJ == c0k7x.LJ && this.LJFF == c0k7x.LJFF && this.LJI == c0k7x.LJI;
    }

    public final int hashCode() {
        return (((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubSpaceDraft(spaceId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", draftId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", payload=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", ownerSecUid=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", updatedAt=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", createdAt=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", mode=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0K7X() {
        this("", "", new C0K7U(null, null, null, null, null, null, null, null, 8191), "", 0L, 0L, C0K46.POST);
    }

    public C0K7X(String str, String str2, C0K7U c0k7u, String str3, long j, long j2, C0K46 c0k46) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = c0k7u;
        this.LIZLLL = str3;
        this.LJ = j;
        this.LJFF = j2;
        this.LJI = c0k46;
    }
}
