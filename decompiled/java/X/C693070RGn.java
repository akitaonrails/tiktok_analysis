package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RGn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C693070RGn implements InterfaceC693060RGm {
    public final Aweme LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final Aweme LJI;
    public final Boolean LJII;
    public final int LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C693070RGn)) {
            return false;
        }
        C693070RGn c693070RGn = (C693070RGn) obj;
        return Intrinsics.LJFF(this.LIZ, c693070RGn.LIZ) && this.LIZIZ == c693070RGn.LIZIZ && this.LIZJ == c693070RGn.LIZJ && this.LIZLLL == c693070RGn.LIZLLL && this.LJ == c693070RGn.LJ && this.LJFF == c693070RGn.LJFF && Intrinsics.LJFF(this.LJI, c693070RGn.LJI) && Intrinsics.LJFF(this.LJII, c693070RGn.LJII) && this.LJIIIIZZ == c693070RGn.LJIIIIZZ;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31;
        Aweme aweme = this.LJI;
        int iHashCode2 = (iHashCode + (aweme == null ? 0 : aweme.hashCode())) * 31;
        Boolean bool = this.LJII;
        return ((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31) + this.LJIIIIZZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryPageSelectParam(aweme=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", storyListPosition=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", storyPosition=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", totalCount=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isSlideToSelect=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", shouldPlay=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", lastAweme=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", realSelect=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", initialIndex=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C693070RGn(Aweme aweme, int i, int i2, int i3, boolean z, boolean z2, Aweme aweme2, Boolean bool, int i4, int i5) {
        z2 = (i5 & 32) != 0 ? true : z2;
        aweme2 = (i5 & 64) != 0 ? null : aweme2;
        bool = (i5 & 128) != 0 ? Boolean.FALSE : bool;
        i4 = (i5 & 256) != 0 ? 0 : i4;
        this.LIZ = aweme;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = aweme2;
        this.LJII = bool;
        this.LJIIIIZZ = i4;
    }
}
