package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07gA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1923607gA {
    public final InterfaceC1921807fs LIZ;
    public final boolean LIZIZ;
    public final InterfaceC1924707gL LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1923607gA)) {
            return false;
        }
        C1923607gA c1923607gA = (C1923607gA) obj;
        return Intrinsics.LJFF(this.LIZ, c1923607gA.LIZ) && this.LIZIZ == c1923607gA.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1923607gA.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OperatorParsed(left=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", not=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", op=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1923607gA(InterfaceC1921807fs interfaceC1921807fs, boolean z, InterfaceC1924707gL interfaceC1924707gL) {
        this.LIZ = interfaceC1921807fs;
        this.LIZIZ = z;
        this.LIZJ = interfaceC1924707gL;
    }
}
