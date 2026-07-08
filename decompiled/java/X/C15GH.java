package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15GH, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15GH implements InterfaceC447510Hgj {
    public final String LIZ;
    public final C291001Au<Boolean> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15GH)) {
            return false;
        }
        C15GH c15gh = (C15GH) obj;
        return Intrinsics.LJFF(this.LIZ, c15gh.LIZ) && Intrinsics.LJFF(this.LIZIZ, c15gh.LIZIZ);
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

    public C15GH(C291001Au c291001Au, String str) {
        this.LIZ = str;
        this.LIZIZ = c291001Au;
    }
}
