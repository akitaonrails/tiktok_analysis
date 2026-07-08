package X;

import kotlin.text.CharsKt__CharJVMKt;

/* JADX INFO: renamed from: X.13FW, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13FW {
    public int LIZ;

    public C13FW() {
        this(0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IntRef(element = ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(")@");
        int iHashCode = hashCode();
        CharsKt__CharJVMKt.checkRadix(16);
        sbLIZ.append(Integer.toString(iHashCode, 16));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C13FW(int i) {
        this.LIZ = i;
    }
}
