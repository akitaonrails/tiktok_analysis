package X;

import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1D0J, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1D0J {
    public final int LIZ = R.raw.icon_chevron_up_double;
    public final int LIZIZ = 2131826952;
    public final int LIZJ = 2131826953;
    public final int LIZLLL = R.raw.icon_text_latin;
    public final int LJ = 2131828774;
    public final int LJFF = R.raw.icon_chevron_collapse;
    public final int LJI = R.raw.icon_full_screen;
    public final int LJII = 2131828854;
    public final int LJIIIIZZ = 2131828853;
    public final int LJIIIZ = 2131840511;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1D0J)) {
            return false;
        }
        C1D0J c1d0j = (C1D0J) obj;
        return this.LIZ == c1d0j.LIZ && this.LIZIZ == c1d0j.LIZIZ && this.LIZJ == c1d0j.LIZJ && this.LIZLLL == c1d0j.LIZLLL && this.LJ == c1d0j.LJ && this.LJFF == c1d0j.LJFF && this.LJI == c1d0j.LJI && this.LJII == c1d0j.LJII && this.LJIIIIZZ == c1d0j.LJIIIIZZ && this.LJIIIZ == c1d0j.LJIIIZ;
    }

    public final int hashCode() {
        return (((((((((((((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF) * 31) + this.LJI) * 31) + this.LJII) * 31) + this.LJIIIIZZ) * 31) + this.LJIIIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedBottomBarResources(autoScrollIcon=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", autoScrollTextOff=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", autoScrollTextOn=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", captionsIcon=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", captionsText=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", clearModeIconOn=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", clearModeIconOff=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", clearModeTextOn=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", clearModeTextOff=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", speedText=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
