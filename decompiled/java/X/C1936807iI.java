package X;

import com.google.gson.m;
import com.google.gson.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07iI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1936807iI implements InterfaceC1277930jMN {
    public final boolean LIZ;
    public final n LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1936807iI)) {
            return false;
        }
        C1936807iI c1936807iI = (C1936807iI) obj;
        return this.LIZ == c1936807iI.LIZ && Intrinsics.LJFF(this.LIZIZ, c1936807iI.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LowLatencyProperty(supportLowLatency=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", rtpTokenMap=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1277930jMN
    public final boolean isValid() {
        if (!this.LIZ) {
            return true;
        }
        n nVar = this.LIZIZ;
        nVar.getClass();
        return !(nVar instanceof m);
    }

    public C1936807iI(n nVar, boolean z) {
        this.LIZ = z;
        this.LIZIZ = nVar;
    }
}
