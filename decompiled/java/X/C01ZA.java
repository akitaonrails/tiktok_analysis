package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01ZA, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01ZA implements InterfaceC951240arS<Object> {
    public final C01F5 LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final String LJ;
    public final long LJFF;

    public C01ZA() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C01ZA)) {
            return false;
        }
        C01ZA c01za = (C01ZA) obj;
        return Intrinsics.LJFF(this.LIZ, c01za.LIZ) && this.LIZIZ == c01za.LIZIZ && Intrinsics.LJFF(this.LIZJ, c01za.LIZJ) && this.LIZLLL == c01za.LIZLLL && Intrinsics.LJFF(this.LJ, c01za.LJ) && this.LJFF == c01za.LJFF;
    }

    public final int hashCode() {
        C01F5 c01f5 = this.LIZ;
        return ((((((((((c01f5 == null ? 0 : c01f5.hashCode()) * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + this.LJ.hashCode()) * 31) + C786410Ut5.Y2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BizTextHeaderRecordInfo(richTextStyle=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", reviewStatus=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mediaNodeId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", recordId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", originMediaNodeId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", originRecordId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C01ZA(int i) {
        this(null, 0, "", 0L, "", 0L);
    }

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        if (!(obj instanceof C01ZA)) {
            return false;
        }
        return Intrinsics.LJFF(obj, this);
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        return obj instanceof C01ZA;
    }

    public C01ZA(C01F5 c01f5, int i, String str, long j, String str2, long j2) {
        this.LIZ = c01f5;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = j;
        this.LJ = str2;
        this.LJFF = j2;
    }
}
