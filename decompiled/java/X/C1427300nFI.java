package X;

import android.view.View;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0nFI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1427300nFI extends AbstractC1427330nFL {
    public EnumC1070180dxI LIZ = EnumC1070180dxI.PRIMARY;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public View.OnClickListener LJFF;
    public String LJI;
    public TuxTextView LJII;
    public C1749260vca LJIIIIZZ;

    public final void LIZIZ(EnumC1070180dxI enumC1070180dxI) {
        C1749260vca c1749260vca;
        this.LIZ = enumC1070180dxI;
        TuxTextView tuxTextView = this.LJII;
        if (tuxTextView != null && (c1749260vca = this.LJIIIIZZ) != null) {
            if (enumC1070180dxI == EnumC1070180dxI.PRIMARY) {
                tuxTextView.setTextColor(c1749260vca.getPrimaryColor$tux_theme_release());
            } else {
                tuxTextView.setTextColor(c1749260vca.getSecondaryColor$tux_theme_release());
            }
        }
    }

    public final void LIZ(int i, int i2, int i3, int i4) {
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = i4;
        TuxTextView tuxTextView = this.LJII;
        if (tuxTextView != null) {
            C426750GoL.LJIIL(tuxTextView, Integer.valueOf(i3), null, Integer.valueOf(i4), null, 26);
            C426750GoL.LJIIIZ(tuxTextView, Integer.valueOf(i), null, Integer.valueOf(i2), null, false, 26);
        }
    }
}
