package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gF1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158050gF1 {
    public final String LIZ;
    public final EnumC485960J3y LIZIZ;
    public final long LIZJ;
    public final boolean LIZLLL;
    public final EnumC1156220gC4 LJ;
    public final int LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1158050gF1)) {
            return false;
        }
        C1158050gF1 c1158050gF1 = (C1158050gF1) obj;
        return Intrinsics.LJFF(this.LIZ, c1158050gF1.LIZ) && this.LIZIZ == c1158050gF1.LIZIZ && this.LIZJ == c1158050gF1.LIZJ && this.LIZLLL == c1158050gF1.LIZLLL && this.LJ == c1158050gF1.LJ && this.LJFF == c1158050gF1.LJFF && Intrinsics.LJFF(this.LJI, c1158050gF1.LJI);
    }

    public final int hashCode() {
        return (((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + this.LJ.hashCode()) * 31) + this.LJFF) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiGuestMonitorExternalEventInfo(key=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", timeStamp=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", thumbnail=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", loadType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", liveStatus=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", sticker=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1158050gF1(String str, EnumC485960J3y enumC485960J3y, EnumC1156220gC4 enumC1156220gC4, int i, String str2, int i2) {
        long jCurrentTimeMillis;
        String str3 = str2;
        int i3 = i;
        EnumC1156220gC4 enumC1156220gC42 = enumC1156220gC4;
        if ((i2 & 4) != 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        } else {
            jCurrentTimeMillis = 0;
        }
        this(str, enumC485960J3y, jCurrentTimeMillis, false, (i2 & 16) != 0 ? EnumC1156220gC4.DISK : enumC1156220gC42, (i2 & 32) != 0 ? -1 : i3, (i2 & 64) != 0 ? "" : str3);
    }

    public C1158050gF1(String str, EnumC485960J3y enumC485960J3y, long j, boolean z, EnumC1156220gC4 enumC1156220gC4, int i, String str2) {
        this.LIZ = str;
        this.LIZIZ = enumC485960J3y;
        this.LIZJ = j;
        this.LIZLLL = z;
        this.LJ = enumC1156220gC4;
        this.LJFF = i;
        this.LJI = str2;
    }
}
