package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03IX, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03IX {
    public final C419910GdJ LIZ;
    public final Icon LIZIZ;
    public final Integer LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final boolean LJFF;
    public final boolean LJI;

    public C03IX(C419910GdJ c419910GdJ, Icon icon, Integer num, int i, boolean z, boolean z2, int i2) {
        int i3;
        if ((i2 & 1) != 0) {
            c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_exclamation_mark_triangle;
            c419910GdJ.LJ = Integer.valueOf(R.attr.zs);
        }
        icon = (i2 & 2) != 0 ? null : icon;
        num = (i2 & 4) != 0 ? null : num;
        i = (i2 & 8) != 0 ? R.attr.zs : i;
        if ((i2 & 16) != 0) {
            i3 = 51;
        } else {
            i3 = 0;
        }
        z = (i2 & 32) != 0 ? true : z;
        z2 = (i2 & 64) != 0 ? false : z2;
        this.LIZ = c419910GdJ;
        this.LIZIZ = icon;
        this.LIZJ = num;
        this.LIZLLL = i;
        this.LJ = i3;
        this.LJFF = z;
        this.LJI = z2;
    }
}
