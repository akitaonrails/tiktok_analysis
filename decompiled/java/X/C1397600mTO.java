package X;

import android.content.Context;
import android.content.res.TypedArray;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0mTO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1397600mTO {
    public static final float LJJII = C1389610mGV.LIZ();
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final float LJI;
    public final float LJII;
    public final float LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public final int LJIIL;
    public final int LJIILIIL;
    public final int LJIILJJIL;
    public final int LJIILL;
    public final int LJIILLIIL;
    public final int LJIIZILJ;
    public final String LJIJ;
    public final int LJIJI;
    public final String LJIJJ;
    public final int LJIJJLI;
    public final int LJIL;
    public final int LJJ;
    public final int LJJI;
    public final int LJJIFFI;

    public C1397600mTO(Context context) {
        int i;
        int color;
        int color2;
        int color3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.TuxDialog, R.attr.xt, 0);
        this.LIZ = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxDialog__tux_dialog_fontTitle, 0);
        this.LIZIZ = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxDialog__tux_dialog_fontContent, 0);
        this.LIZJ = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxDialog__tux_dialog_fontContentBig, 0);
        this.LIZLLL = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxDialog__tux_dialog_fontButtonNormal, 0);
        this.LJ = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxDialog__tux_dialog_fontButtonBold, 0);
        if (C1397510mTF.LLJJIJIIJIL != 0) {
            i = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxDialog__tux_dialog_defaultButtonSize, 0);
        } else {
            i = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxDialog__tux_dialog_defaultButtonSizeLegacy, 0);
        }
        this.LJFF = i;
        this.LJI = typedArrayObtainStyledAttributes.getDimension(R$styleable.TuxDialog__tux_dialog_containerRadius, C418440Gaw.LIZIZ(16));
        this.LJII = typedArrayObtainStyledAttributes.getDimension(R$styleable.TuxDialog__tux_dialog_topHorizontalGap, C418440Gaw.LIZIZ(16));
        this.LJIIIIZZ = typedArrayObtainStyledAttributes.getDimension(R$styleable.TuxDialog__tux_dialog_bottomHorizontalGap, C418440Gaw.LIZIZ(14));
        this.LJIIIZ = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxDialog__tux_dialog_colorTextTitle, 0);
        if (C1397510mTF.LLJJIJIIJIL != 0) {
            color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxDialog__tux_dialog_colorTextPrimary, 0);
        } else {
            color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxDialog__tux_dialog_colorTextPrimaryLegacy, 0);
        }
        this.LJIIJ = color;
        if (C1397510mTF.LLJJIJIIJIL != 0) {
            color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxDialog__tux_dialog_colorTextSecondary, 0);
        } else {
            color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxDialog__tux_dialog_colorTextSecondaryLegacy, 0);
        }
        this.LJIIJJI = color2;
        if (C1397510mTF.LLJJIJIIJIL != 0) {
            color3 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxDialog__tux_dialog_colorTextTertiary, 0);
        } else {
            color3 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxDialog__tux_dialog_colorTextTertiaryLegacy, 0);
        }
        this.LJIIL = color3;
        this.LJIILIIL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxDialog__tux_dialog_colorBgTertiary, 0);
        this.LJIILJJIL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxDialog__tux_dialog_colorCloseButtonNormal, 0);
        this.LJIILL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxDialog__tux_dialog_colorDividerLine, 0);
        this.LJIILLIIL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxDialog__tux_dialog_colorTextNegative, 0);
        this.LJIIZILJ = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxDialog__tux_dialog_colorTextDisable, 0);
        this.LJIJ = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxDialog__tux_dialog_textCancelAction);
        this.LJIJI = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxDialog__tux_dialog_iconClose, 0);
        this.LJIJJ = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxDialog__tux_dialog_textDescription);
        this.LJIJJLI = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxDialog__tux_dialog_buttonVariantPrimary, 0);
        this.LJIL = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxDialog__tux_dialog_buttonVariantSecondary, 0);
        this.LJJ = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxDialog__tux_dialog_buttonVariantDanger, 0);
        this.LJJI = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxDialog__tux_dialog_linkAccessoryVariant, 0);
        this.LJJIFFI = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxDialog__tux_dialog_editTextAccessoryBgColor, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
