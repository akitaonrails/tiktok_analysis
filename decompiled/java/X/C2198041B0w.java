package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1B0w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2198041B0w extends C1B10 {
    public final EnumC2198051B0x LIZ;
    public final C517630KRt LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2198041B0w)) {
            return false;
        }
        C2198041B0w c2198041B0w = (C2198041B0w) obj;
        return this.LIZ == c2198041B0w.LIZ && Intrinsics.LJFF(this.LIZIZ, c2198041B0w.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C517630KRt c517630KRt = this.LIZIZ;
        return iHashCode + (c517630KRt == null ? 0 : c517630KRt.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Ineligible(reason=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", raw=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2198041B0w(EnumC2198051B0x enumC2198051B0x, C517630KRt c517630KRt) {
        this.LIZ = enumC2198051B0x;
        this.LIZIZ = c517630KRt;
    }
}
