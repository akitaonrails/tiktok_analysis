package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FC8, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FC8 extends C0FC7 {
    public final String LIZ;
    public boolean LIZIZ = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0FC8)) {
            return false;
        }
        C0FC8 c0fc8 = (C0FC8) obj;
        return Intrinsics.LJFF(this.LIZ, c0fc8.LIZ) && this.LIZIZ == c0fc8.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReportItem(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isChecked=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0FC8(String str) {
        this.LIZ = str;
    }
}
