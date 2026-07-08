package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04hn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1169304hn implements InterfaceC1165104h7 {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1169304hn)) {
            return false;
        }
        C1169304hn c1169304hn = (C1169304hn) obj;
        return Intrinsics.LJFF(this.LIZ, c1169304hn.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1169304hn.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TitleAndSubtitle(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", subtitle=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1169304hn(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
