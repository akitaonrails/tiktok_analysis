package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05ev, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1406305ev extends AbstractC1406905f1 {
    public final int LIZ;
    public final long LIZIZ;
    public final InterfaceC1406105et LIZJ;

    public C1406305ev() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1406305ev)) {
            return false;
        }
        C1406305ev c1406305ev = (C1406305ev) obj;
        return this.LIZ == c1406305ev.LIZ && this.LIZIZ == c1406305ev.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1406305ev.LIZJ);
    }

    public final int hashCode() {
        int iY2 = ((this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31;
        InterfaceC1406105et interfaceC1406105et = this.LIZJ;
        return iY2 + (interfaceC1406105et == null ? 0 : interfaceC1406105et.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Paused(lastProgress=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", lastRemainTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", customContext=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1406305ev(int i) {
        this(0, -1L, null);
    }

    public C1406305ev(int i, long j, InterfaceC1406105et interfaceC1406105et) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = interfaceC1406105et;
    }
}
