package X;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.096h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23177096h implements C096X {
    public final String LIZJ;
    public final int[] LJ;
    public final int[] LJFF;
    public final InterfaceC352560Dry LJI;
    public final int LIZ = 1920;
    public final int LIZIZ = 1920;
    public final Integer LIZLLL = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23177096h)) {
            return false;
        }
        C23177096h c23177096h = (C23177096h) obj;
        return this.LIZ == c23177096h.LIZ && this.LIZIZ == c23177096h.LIZIZ && Intrinsics.LJFF(this.LIZJ, c23177096h.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c23177096h.LIZLLL) && Intrinsics.LJFF(this.LJ, c23177096h.LJ) && Intrinsics.LJFF(this.LJFF, c23177096h.LJFF) && Intrinsics.LJFF(this.LJI, c23177096h.LJI);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31;
        Integer num = this.LIZLLL;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        int[] iArr = this.LJ;
        int iHashCode3 = (iHashCode2 + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
        int[] iArr2 = this.LJFF;
        int iHashCode4 = (iHashCode3 + (iArr2 == null ? 0 : Arrays.hashCode(iArr2))) * 31;
        InterfaceC352560Dry interfaceC352560Dry = this.LJI;
        return iHashCode4 + (interfaceC352560Dry != null ? interfaceC352560Dry.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompressVideoConfig(width=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", workSpacePath=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", outBps=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", vTrimIn=");
        sbLIZ.append(Arrays.toString(this.LJ));
        sbLIZ.append(", vTrimOut=");
        sbLIZ.append(Arrays.toString(this.LJFF));
        sbLIZ.append(", callback=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C23177096h(String str, int[] iArr, int[] iArr2, InterfaceC352560Dry interfaceC352560Dry) {
        this.LIZJ = str;
        this.LJ = iArr;
        this.LJFF = iArr2;
        this.LJI = interfaceC352560Dry;
    }
}
