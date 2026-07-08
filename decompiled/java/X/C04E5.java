package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;

/* JADX INFO: renamed from: X.04E5, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04E5 extends LinearLayout {
    public static final int LLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68));
    public static final int LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public static final int LLJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    public static final int LLJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
    public static final int LLJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
    public static final int LLJILJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public final C04E4 LL;
    public final C10503048v LLILLJJLI;
    public C04E8 LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;

    public final void LIZ() {
        if (((Number) C04ET.LIZ.getValue()).intValue() == 3) {
            if (this.LLILZLL) {
                this.LL.getContext().setTheme(R.style.y0);
                C04E4 c04e4 = this.LL;
                c04e4.setCustomBgColor(C1308910kAL.LIZJ(R.attr.a03, c04e4.getContext()));
                return;
            }
            return;
        }
        Integer style = this.LL.getStyle();
        if (style == null || style.intValue() != 3) {
            if (this.LLILZLL) {
                this.LL.setCustomBgColor(C1308910kAL.LIZJ(R.attr.gl, getContext()));
                return;
            } else {
                this.LL.setCustomBgColor(C1308910kAL.LIZJ(R.attr.a07, getContext()));
                return;
            }
        }
        if (this.LLILZLL) {
            this.LL.setCustomBgColor(C1308910kAL.LIZJ(R.attr.zr, getContext()));
        } else {
            this.LL.setCustomBgColor(null);
        }
    }

    public C04E5(Context context) {
        Integer numLIZJ;
        int i;
        LinearLayout.LayoutParams layoutParams;
        super(context, null, 0);
        setOrientation(0);
        setGravity(16);
        int i2 = LLJ;
        int i3 = LLIZLLLIL;
        setPadding(i2, i3, i2, i3);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.z_, context);
        if (numLIZJ2 != null) {
            setBackgroundColor(numLIZJ2.intValue());
        }
        int iLIZ = C04CU.LIZ();
        C04E4 c04e4 = new C04E4(new ContextThemeWrapper(getContext(), getContext().getTheme()), null);
        c04e4.setId(R.id.afo);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -1, 1.0f);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c04e4);
        c04e4.setLayoutParams(layoutParams2);
        c04e4.setEllipsize(TextUtils.TruncateAt.END);
        c04e4.setGravity(17);
        c04e4.setText(c04e4.getContext().getString(2131833079));
        c04e4.setTextAlignment(4);
        c04e4.setMaxLines(2);
        c04e4.setSupportClickWhenDisable(true);
        c04e4.setButtonSize(3);
        c04e4.setButtonVariant(1);
        c04e4.LJJJJLI(true);
        int i4 = LLJIJIL;
        c04e4.setIconWidth(i4);
        c04e4.setIconHeight(i4);
        if (((Number) C04ET.LIZ.getValue()).intValue() != 3) {
            ViewGroup.LayoutParams layoutParams3 = c04e4.getLayoutParams();
            if ((layoutParams3 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams3) != null) {
                layoutParams.weight = 0.0f;
                layoutParams.width = LLJI;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c04e4);
                c04e4.setLayoutParams(layoutParams);
            }
            c04e4.setText((CharSequence) null);
            if (iLIZ == 3) {
                numLIZJ = null;
            } else {
                numLIZJ = C1308910kAL.LIZJ(R.attr.a07, c04e4.getContext());
            }
            c04e4.setCustomBgColor(numLIZJ);
            c04e4.setButtonStartIcon(Integer.valueOf(R.raw.icon_add_shopping_cart_ltr));
            if (iLIZ == 3) {
                i = R.attr.hd;
            } else {
                i = R.attr.a1q;
            }
            c04e4.setIconTintColorRes(i);
        }
        C786410Ut5.I7(new AjS40S0200000_1(this, c04e4, 88), c04e4);
        this.LL = c04e4;
        addView(c04e4);
        C10503048v c10503048v = new C10503048v(getContext(), null, 6);
        c10503048v.setId(R.id.cnx);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -1, 1.0f);
        layoutParams4.setMarginStart(LLJILJIL);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c10503048v);
        c10503048v.setLayoutParams(layoutParams4);
        c10503048v.setSupportClickWhenDisable(true);
        c10503048v.LIZLLL(iLIZ);
        C786410Ut5.I7(new AjS40S0200000_1(this, c10503048v, 89), c10503048v);
        this.LLILLJJLI = c10503048v;
        addView(c10503048v);
    }

    public final void LIZIZ(boolean z) {
        int i;
        C10503048v c10503048v = this.LLILLJJLI;
        ViewGroup.LayoutParams layoutParams = c10503048v.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (z) {
                i = LLJILJIL;
            } else {
                i = 0;
            }
            marginLayoutParams.setMarginStart(i);
            C786410Ut5.W5(c10503048v, marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    public final void setListener(C04E8 c04e8) {
        this.LLILLL = c04e8;
    }
}
