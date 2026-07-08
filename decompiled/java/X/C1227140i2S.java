package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i2S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227140i2S {
    public final EnumC1226540i1U LIZ;
    public final String LIZIZ;
    public final C1227280i2g LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1227140i2S)) {
            return false;
        }
        C1227140i2S c1227140i2S = (C1227140i2S) obj;
        return this.LIZ == c1227140i2S.LIZ && Intrinsics.LJFF(this.LIZIZ, c1227140i2S.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1227140i2S.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1227140i2S.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveInviteTabInfo(tabKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tabName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", requestWrapper=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", firstSelectorIndexString=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1227140i2S(EnumC1226540i1U enumC1226540i1U, String str, C1227280i2g c1227280i2g, String str2) {
        this.LIZ = enumC1226540i1U;
        this.LIZIZ = str;
        this.LIZJ = c1227280i2g;
        this.LIZLLL = str2;
    }
}
