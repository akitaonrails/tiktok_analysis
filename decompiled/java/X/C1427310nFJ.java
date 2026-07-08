package X;

import android.view.View;
import com.bytedance.tux.icon.TuxIconView;

/* JADX INFO: renamed from: X.0nFJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1427310nFJ extends AbstractC1427330nFL {
    public EnumC1070180dxI LIZ = EnumC1070180dxI.PRIMARY;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public View.OnClickListener LJFF;
    public int LJI;
    public TuxIconView LJII;
    public C1749260vca LJIIIIZZ;

    public final void LIZIZ(EnumC1070180dxI enumC1070180dxI) {
        C1749260vca c1749260vca;
        this.LIZ = enumC1070180dxI;
        TuxIconView tuxIconView = this.LJII;
        if (tuxIconView != null && (c1749260vca = this.LJIIIIZZ) != null) {
            if (enumC1070180dxI == EnumC1070180dxI.PRIMARY) {
                tuxIconView.setTintColor(c1749260vca.getPrimaryColor$tux_theme_release());
            } else {
                tuxIconView.setTintColor(c1749260vca.getSecondaryColor$tux_theme_release());
            }
        }
    }

    public final void LIZ(int i, int i2, int i3, int i4) {
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = i4;
        TuxIconView tuxIconView = this.LJII;
        if (tuxIconView != null) {
            C426750GoL.LJIIL(tuxIconView, Integer.valueOf(i3), null, Integer.valueOf(i4), null, 26);
            C426750GoL.LJIIIZ(tuxIconView, Integer.valueOf(i), null, Integer.valueOf(i2), null, false, 26);
        }
    }
}
