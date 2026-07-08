package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.14jH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20345714jH {
    public final EnumC20439114yL LIZ;
    public final String LIZIZ;
    public final Pair<Integer, Integer> LIZJ;
    public final Pair<Integer, Integer> LIZLLL;

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        Pair<Integer, Integer> pair = this.LIZJ;
        int iHashCode2 = (iHashCode + (pair == null ? 0 : pair.hashCode())) * 31;
        Pair<Integer, Integer> pair2 = this.LIZLLL;
        return iHashCode2 + (pair2 != null ? pair2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ScreenShotLottieInfo(resType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", res=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", allSize=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", avatarSize=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C20345714jH(EnumC20439114yL enumC20439114yL, String str, Pair<Integer, Integer> pair, Pair<Integer, Integer> pair2) {
        this.LIZ = enumC20439114yL;
        this.LIZIZ = str;
        this.LIZJ = pair;
        this.LIZLLL = pair2;
    }
}
