package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sSh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1627810sSh implements InterfaceC1627870sSn {
    public final int LIZIZ;
    public final InterfaceC1664360tPe<InterfaceC1627880sSo> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1627810sSh)) {
            return false;
        }
        C1627810sSh c1627810sSh = (C1627810sSh) obj;
        return this.LIZIZ == c1627810sSh.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1627810sSh.LIZJ);
    }

    public final int hashCode() {
        return (this.LIZIZ * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Loading(startIndex=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", items=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1627810sSh(InterfaceC1664360tPe interfaceC1664360tPe, int i) {
        this.LIZIZ = i;
        this.LIZJ = interfaceC1664360tPe;
    }
}
