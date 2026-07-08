package X;

import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HpK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C452840HpK {
    public final boolean LIZ;
    public final List<StickerItem> LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final EnumC452930HpT LJFF;
    public final EnumC452870HpN LJI;
    public final String LJII;

    public C452840HpK() {
        this(false, null, null, null, null, null, null, null, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C452840HpK)) {
            return false;
        }
        C452840HpK c452840HpK = (C452840HpK) obj;
        return this.LIZ == c452840HpK.LIZ && Intrinsics.LJFF(this.LIZIZ, c452840HpK.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c452840HpK.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c452840HpK.LIZLLL) && Intrinsics.LJFF(this.LJ, c452840HpK.LJ) && this.LJFF == c452840HpK.LJFF && this.LJI == c452840HpK.LJI && Intrinsics.LJFF(this.LJII, c452840HpK.LJII);
    }

    public final int hashCode() {
        int iZ2 = ((((((((((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31;
        String str = this.LJII;
        return iZ2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PanelState(isVisible=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", stickerList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", querySessionId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", inputLanguage=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", stickerSource=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", recommendationSource=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", awemeId=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C452840HpK(boolean z, List<StickerItem> list, String str, String str2, String str3, EnumC452930HpT enumC452930HpT, EnumC452870HpN enumC452870HpN, String str4) {
        this.LIZ = z;
        this.LIZIZ = list;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = enumC452930HpT;
        this.LJI = enumC452870HpN;
        this.LJII = str4;
    }

    public C452840HpK(boolean z, List list, String str, String str2, String str3, EnumC452930HpT enumC452930HpT, EnumC452870HpN enumC452870HpN, String str4, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) == 0 ? str3 : "", (i & 32) != 0 ? EnumC452930HpT.LL : enumC452930HpT, (i & 64) != 0 ? EnumC452870HpN.LL : enumC452870HpN, (i & 128) != 0 ? null : str4);
    }
}
