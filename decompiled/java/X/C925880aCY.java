package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aCY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925880aCY {
    public final String LIZ;
    public final EnumC925840aCU LIZIZ;
    public final EnumC925840aCU LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C925880aCY)) {
            return false;
        }
        C925880aCY c925880aCY = (C925880aCY) obj;
        return Intrinsics.LJFF(this.LIZ, c925880aCY.LIZ) && this.LIZIZ == c925880aCY.LIZIZ && this.LIZJ == c925880aCY.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkMicStageDef(stage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", from=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", to=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C925880aCY(String str, EnumC925840aCU enumC925840aCU, EnumC925840aCU enumC925840aCU2) {
        this.LIZ = str;
        this.LIZIZ = enumC925840aCU;
        this.LIZJ = enumC925840aCU2;
    }
}
