package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XFw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C845780XFw extends C0XGA {
    public final boolean LJIIIZ;
    public final int LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C845780XFw)) {
            return false;
        }
        C845780XFw c845780XFw = (C845780XFw) obj;
        return this.LJIIIZ == c845780XFw.LJIIIZ && this.LJIIJ == c845780XFw.LJIIJ && Intrinsics.LJFF(this.LJIIJJI, c845780XFw.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c845780XFw.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c845780XFw.LJIILIIL);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LJIIIZ) * 31) + this.LJIIJ) * 31;
        String str = this.LJIIJJI;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJIIL;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJIILIIL;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrepareWebLoginResponse(success=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", api=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", nonce=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", state=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(", ticket=");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C845780XFw(boolean z, int i, String str, String str2, String str3) {
        super(z, i);
        this.LJIIIZ = z;
        this.LJIIJ = i;
        this.LJIIJJI = str;
        this.LJIIL = str2;
        this.LJIILIIL = str3;
    }
}
