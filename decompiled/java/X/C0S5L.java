package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S5L, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S5L extends C0S5P {
    public final String LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final C0S5M LJ;
    public final C207047160f LJFF;
    public final Map<EnumC207101162h, C164G> LJI;
    public final C0S5O LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0S5L)) {
            return false;
        }
        C0S5L c0s5l = (C0S5L) obj;
        return Intrinsics.LJFF(this.LIZIZ, c0s5l.LIZIZ) && this.LIZJ == c0s5l.LIZJ && this.LIZLLL == c0s5l.LIZLLL && Intrinsics.LJFF(this.LJ, c0s5l.LJ) && Intrinsics.LJFF(this.LJFF, c0s5l.LJFF) && Intrinsics.LJFF(this.LJI, c0s5l.LJI) && Intrinsics.LJFF(this.LJII, c0s5l.LJII);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        C0S5M c0s5m = this.LJ;
        int iHashCode2 = (iHashCode + (c0s5m == null ? 0 : c0s5m.hashCode())) * 31;
        C207047160f c207047160f = this.LJFF;
        int iHashCode3 = (iHashCode2 + (c207047160f == null ? 0 : c207047160f.hashCode())) * 31;
        Map<EnumC207101162h, C164G> map = this.LJI;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        C0S5O c0s5o = this.LJII;
        return iHashCode4 + (c0s5o != null ? c0s5o.hashCode() : 0);
    }

    @Override // X.C0S5P
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Translated(translationLang=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", autoTranslate=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", descriptionTranslated=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", stickerData=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", captionData=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", externalElementData=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", dubbingData=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0S5L(String str, boolean z, boolean z2, C0S5M c0s5m, C207047160f c207047160f, Map<EnumC207101162h, C164G> map, C0S5O c0s5o) {
        super(C0SKK.TRANSLATED);
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = c0s5m;
        this.LJFF = c207047160f;
        this.LJI = map;
        this.LJII = c0s5o;
    }
}
