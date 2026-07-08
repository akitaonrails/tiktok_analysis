package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.064w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15496064w extends AbstractC15499064z {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15496064w)) {
            return false;
        }
        C15496064w c15496064w = (C15496064w) obj;
        return Intrinsics.LJFF(this.LIZ, c15496064w.LIZ) && Intrinsics.LJFF(this.LIZIZ, c15496064w.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c15496064w.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c15496064w.LIZLLL) && Intrinsics.LJFF(this.LJ, c15496064w.LJ) && Intrinsics.LJFF(this.LJFF, c15496064w.LJFF) && Intrinsics.LJFF(this.LJI, c15496064w.LJI);
    }

    public final int hashCode() {
        return (((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowFollow(inviteId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", uniqId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", targetUid=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", targetSecUid=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", avatarUrl=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", userName=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", eggUrl=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C15496064w(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = str7;
    }
}
