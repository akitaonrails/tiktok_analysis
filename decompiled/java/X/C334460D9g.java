package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D9g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C334460D9g {
    public final C0DA2 LIZ;
    public final EnumC334480D9i LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C334460D9g)) {
            return false;
        }
        C334460D9g c334460D9g = (C334460D9g) obj;
        return this.LIZ == c334460D9g.LIZ && this.LIZIZ == c334460D9g.LIZIZ && Intrinsics.LJFF(this.LIZJ, c334460D9g.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckoutProtocolContext(executionType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", coreState=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", continueUrl=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C334460D9g(C0DA2 c0da2, EnumC334480D9i enumC334480D9i, String str) {
        this.LIZ = c0da2;
        this.LIZIZ = enumC334480D9i;
        this.LIZJ = str;
    }
}
