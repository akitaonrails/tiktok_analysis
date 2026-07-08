package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15GA, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15GA implements InterfaceC447510Hgj {
    public final String LIZ;
    public final C291001Au<Boolean> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15GA)) {
            return false;
        }
        C15GA c15ga = (C15GA) obj;
        return Intrinsics.LJFF(this.LIZ, c15ga.LIZ) && Intrinsics.LJFF(this.LIZIZ, c15ga.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchBarData(keyword=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", clearEvent=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C15GA(C291001Au c291001Au, String str) {
        this.LIZ = str;
        this.LIZIZ = c291001Au;
    }
}
