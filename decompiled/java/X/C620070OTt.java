package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OTt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C620070OTt {
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
        if (!(obj instanceof C620070OTt)) {
            return false;
        }
        C620070OTt c620070OTt = (C620070OTt) obj;
        return Intrinsics.LJFF(this.LIZ, c620070OTt.LIZ) && Intrinsics.LJFF(this.LIZIZ, c620070OTt.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c620070OTt.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c620070OTt.LIZLLL) && Intrinsics.LJFF(this.LJ, c620070OTt.LJ) && Intrinsics.LJFF(this.LJFF, c620070OTt.LJFF) && Intrinsics.LJFF(this.LJI, c620070OTt.LJI);
    }

    public final int hashCode() {
        return (((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinEventContext(bbId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", channelStatus=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", identity=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", subscribeStatus=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", creatorId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", quota=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C620070OTt(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = str7;
    }
}
