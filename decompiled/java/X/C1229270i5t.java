package X;

import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0i5t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1229270i5t {
    public final int LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final Float LJ;
    public final String LJFF;
    public final Integer LJI;
    public final String LJII;
    public final int LJIIIIZZ;
    public final Float LJIIIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupListUIConfigParam(cellMargin=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enableHeaderIndex=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enableHiddenList=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", enableArranging=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", panelHeightRatio=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", panelTitle=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", panelNavCreateGroupIconRes=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", panelBottomTip=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", cornerRadiusPx=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1229270i5t(int i, boolean z, Float f, String str, Integer num, String str2, int i2, Float f2, int i3) {
        boolean z2;
        i = (i3 & 1) != 0 ? 12 : i;
        if ((i3 & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        z = (i3 & 4) != 0 ? true : z;
        boolean z3 = (i3 & 8) != 0;
        f = (i3 & 16) != 0 ? null : f;
        str = (i3 & 32) != 0 ? null : str;
        num = (i3 & 64) != 0 ? null : num;
        str2 = (i3 & 128) != 0 ? null : str2;
        i2 = (i3 & 256) != 0 ? R.attr.zm : i2;
        f2 = (i3 & 512) != 0 ? null : f2;
        this.LIZ = i;
        this.LIZIZ = z2;
        this.LIZJ = z;
        this.LIZLLL = z3;
        this.LJ = f;
        this.LJFF = str;
        this.LJI = num;
        this.LJII = str2;
        this.LJIIIIZZ = i2;
        this.LJIIIZ = f2;
    }
}
