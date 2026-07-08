package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05er, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1405905er extends AbstractC1406905f1 {
    public final int LIZ;
    public final long LIZIZ;
    public final InterfaceC1406105et LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1405905er)) {
            return false;
        }
        C1405905er c1405905er = (C1405905er) obj;
        return this.LIZ == c1405905er.LIZ && this.LIZIZ == c1405905er.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1405905er.LIZJ);
    }

    public final int hashCode() {
        int iY2 = ((this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31;
        InterfaceC1406105et interfaceC1406105et = this.LIZJ;
        return iY2 + (interfaceC1406105et == null ? 0 : interfaceC1406105et.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Running(progress=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", remainTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", customContext=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1405905er(int i) {
        this(i, -1L, null);
    }

    public C1405905er(int i, long j, InterfaceC1406105et interfaceC1406105et) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = interfaceC1406105et;
    }
}
