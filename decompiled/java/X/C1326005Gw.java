package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05Gw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1326005Gw {
    public final String LIZ;
    public final InterfaceC1325705Gt LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1326005Gw)) {
            return false;
        }
        C1326005Gw c1326005Gw = (C1326005Gw) obj;
        return Intrinsics.LJFF(this.LIZ, c1326005Gw.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1326005Gw.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        InterfaceC1325705Gt interfaceC1325705Gt = this.LIZIZ;
        return iHashCode + (interfaceC1325705Gt == null ? 0 : interfaceC1325705Gt.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishTask(textContent=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", oneShotListener=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1326005Gw(String str, C341180DZc c341180DZc) {
        this.LIZ = str;
        this.LIZIZ = c341180DZc;
    }
}
