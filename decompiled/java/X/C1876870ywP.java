package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ywP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1876870ywP {
    public final List<InterfaceC1876680yw6> LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final InterfaceC1876240yvO<Object> LJ;
    public final Integer LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1876870ywP)) {
            return false;
        }
        C1876870ywP c1876870ywP = (C1876870ywP) obj;
        return Intrinsics.LJFF(this.LIZ, c1876870ywP.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1876870ywP.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1876870ywP.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1876870ywP.LIZLLL) && Intrinsics.LJFF(this.LJ, c1876870ywP.LJ) && Intrinsics.LJFF(this.LJFF, c1876870ywP.LJFF);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        InterfaceC1876240yvO<Object> interfaceC1876240yvO = this.LJ;
        int iHashCode2 = (iHashCode + (interfaceC1876240yvO == null ? 0 : interfaceC1876240yvO.hashCode())) * 31;
        Integer num = this.LJFF;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AwemeLoadMessage(awemeInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", prev=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", next=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", behavior=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", callback=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", queryType=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1876870ywP(List<? extends InterfaceC1876680yw6> list, String str, String str2, String str3, InterfaceC1876240yvO<Object> interfaceC1876240yvO, Integer num) {
        this.LIZ = list;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = interfaceC1876240yvO;
        this.LJFF = num;
    }
}
