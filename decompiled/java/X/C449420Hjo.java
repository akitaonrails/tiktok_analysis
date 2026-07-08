package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.CustomColor;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0Hjo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C449420Hjo extends ConstraintLayout {
    public static final int LLJILJILJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(320));
    public static final int LLJILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(62));
    public static final float LLJJ = C418440Gaw.LIZIZ(8);
    public static final int LLJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
    public static final float LLJJIII = C418440Gaw.LIZIZ(Double.valueOf(3.5d));
    public static final int LLJJIJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
    public static final int LLJJIJIIJIL;
    public static final int LLJJIJIL;
    public static final float LLJJJ;
    public static final int LLJJJIL;
    public static final int LLJJJJ;
    public static final float LLJJJJJIL;
    public static final int LLJJJJLIIL;
    public static final int LLJJL;
    public static final float LLJJLIIIJLLLLLLLZ;
    public static final float LLJL;
    public static final float LLJLIL;
    public static final int LLJLILLLLZIIL;
    public static final int LLJLL;
    public static final int LLJLLIL;
    public static final int LLJLLL;
    public static final int LLJZ;
    public static final int LLJZIJLIL;
    public static final int LLL;
    public static final int LLLF;
    public static final float LLLFF;
    public static final int LLLFFI;
    public static final int LLLFZ;
    public static final int LLLI;
    public static final int LLLII;
    public final SmartImageView LL;
    public final SmartImageView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final C0GRK LLILZ;
    public final TuxTextView LLILZIL;
    public final TuxTextView LLILZLL;
    public final TuxTextView LLIZ;
    public final C429650Gt1 LLIZLLLIL;
    public final C977203ru LLJ;
    public final TuxTextView LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;

    static {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(55));
        LLJJIJIIJIL = iLIZIZ;
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        LLJJIJIL = iLIZIZ2;
        LLJJJ = iLIZIZ / iLIZIZ2;
        LLJJJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        LLJJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
        LLJJJJJIL = C418440Gaw.LIZIZ(3);
        LLJJJJLIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(55));
        LLJJL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
        LLJJLIIIJLLLLLLLZ = C418440Gaw.LIZIZ(1);
        LLJL = C418440Gaw.LIZIZ(2);
        LLJLIL = C418440Gaw.LIZIZ(2);
        LLJLILLLLZIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(70));
        LLJLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        LLJLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        LLJLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        LLJZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        LLJZIJLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
        LLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
        LLLF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
        LLLFF = C418440Gaw.LIZIZ(4);
        LLLFFI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        LLLFZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        LLLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        LLLII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    }

    private final Paint getPaintPunchHoleArc() {
        return (Paint) this.LLJILJIL.getValue();
    }

    private final Paint getPaintPunchHoleCircle() {
        return (Paint) this.LLJIJIL.getValue();
    }

    public final View getStatusButtonView() {
        return this.LLJ;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float x = this.LLILZ.getX() + (this.LLILZ.getWidth() / 2.0f);
        float f = LLJJIII;
        float f2 = x - f;
        float f3 = x + f;
        canvas.drawCircle(x, 0.0f, f, getPaintPunchHoleCircle());
        canvas.drawArc(f2, -f, f3, f, 0.0f, 180.0f, false, getPaintPunchHoleArc());
        float height = getHeight();
        canvas.drawCircle(x, height, f, getPaintPunchHoleCircle());
        canvas.drawArc(f2, height - f, f3, height + f, 0.0f, -180.0f, false, getPaintPunchHoleArc());
    }

    public final void setCountPadding(int i) {
        C0H1U.LJIIIIZZ(i, this.LLJI);
        C0H1U.LJIIIZ(i, this.LLJI);
    }

    public final void setCountText(String str) {
        if (str != null && str.length() != 0) {
            C03DZ.LIZJ(this.LLJI);
            this.LLJI.setText(str);
        } else {
            C03DZ.LIZ(this.LLJI);
        }
    }

    public final void setCountTextColor(int i) {
        this.LLJI.setTextColorRes(i);
    }

    public final void setCouponContainer(boolean z) {
        C449420Hjo c449420Hjo = this;
        if (z) {
            c449420Hjo.getLayoutParams().width = -1;
            int i = LLLII;
            C426750GoL.LJIIIZ(c449420Hjo, Integer.valueOf(i), 0, Integer.valueOf(i), Integer.valueOf(i), false, 16);
        } else {
            c449420Hjo.getLayoutParams().width = LLJILJILJ;
            c449420Hjo = c449420Hjo;
            C426750GoL.LJIIIZ(c449420Hjo, 0, 0, 0, 0, false, 16);
        }
        c449420Hjo.requestLayout();
    }

    public final void setDiscountText(String str) {
        if (str != null && str.length() != 0) {
            C03DZ.LIZJ(this.LLILZIL);
            this.LLILZIL.setText(str);
        } else {
            C03DZ.LIZ(this.LLILZIL);
        }
    }

    public final void setDiscountTextColor(int i) {
        this.LLILZIL.setTextColorRes(i);
    }

    public final void setDiscountTextFont(int i) {
        this.LLILZIL.setTuxFont(i);
    }

    public final void setStartLabelPendant(Drawable drawable) {
        if (drawable != null) {
            C03DZ.LIZJ(this.LLILLJJLI);
            this.LLILLJJLI.setImageDrawable(drawable);
        } else {
            C03DZ.LIZ(this.LLILLJJLI);
        }
    }

    public final void setStartLabelText(String str) {
        if (str != null && str.length() != 0) {
            C03DZ.LIZJ(this.LLILLL);
            this.LLILLL.setText(str);
        } else {
            C03DZ.LIZ(this.LLILLL);
        }
    }

    public final void setStartLabelTextColor(int i) {
        this.LLILLL.setTextColorRes(i);
    }

    public final void setStatusButtonAlpha(float f) {
        C977203ru c977203ru = this.LLJ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c977203ru);
        c977203ru.setAlpha(f);
    }

    public final void setStatusButtonClickable(boolean z) {
        this.LLJ.setEnabled(z);
        this.LLJ.setClickable(z);
        this.LLJ.setFocusable(z);
    }

    public final void setStatusButtonHeight(Integer num) {
        if (num != null && num.intValue() > 0 && this.LLJ.getLayoutParams().height != num.intValue()) {
            this.LLJ.getLayoutParams().height = num.intValue();
            this.LLJ.requestLayout();
        }
    }

    public final void setStatusButtonText(String str) {
        if (str != null && str.length() != 0) {
            C03DZ.LIZJ(this.LLJ);
            this.LLJ.setText(str);
        } else {
            C03DZ.LIZ(this.LLJ);
        }
    }

    public final void setStatusButtonTextColor(int i) {
        this.LLJ.setTextColorRes(i);
    }

    public final void setThresholdText(String str) {
        if (str != null && str.length() != 0) {
            C03DZ.LIZJ(this.LLILZLL);
            this.LLILZLL.setText(str);
        } else {
            C03DZ.LIZ(this.LLILZLL);
        }
    }

    public final void setThresholdTextColor(int i) {
        this.LLILZLL.setTextColorRes(i);
    }

    public final void e0(Long l, String str) {
        if (l != null && l.longValue() > 0) {
            this.LLILZLL.setMaxLines(1);
            C03DZ.LIZJ(this.LLIZLLLIL);
            this.LLIZLLLIL.LJJJJL(l.longValue());
            if (str != null && str.length() != 0) {
                C03DZ.LIZJ(this.LLIZ);
                this.LLIZ.setText(str);
                return;
            } else {
                C03DZ.LIZ(this.LLIZ);
                return;
            }
        }
        this.LLILZLL.setMaxLines(2);
        C03DZ.LIZ(this.LLIZ);
        C03DZ.LIZ(this.LLIZLLLIL);
    }

    public C449420Hjo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        SmartImageView smartImageView = new SmartImageView(getContext());
        smartImageView.setId(ViewGroup.generateViewId());
        int i2 = LLJJIJI;
        C786410Ut5.G6(smartImageView, new C19ME(i2, i2));
        C786410Ut5.LLFF(8, smartImageView);
        this.LL = smartImageView;
        SmartImageView smartImageView2 = new SmartImageView(getContext());
        smartImageView2.setId(ViewGroup.generateViewId());
        int i3 = LLJJJJ;
        C786410Ut5.G6(smartImageView2, new C19ME(i3, i3));
        C786410Ut5.Tc(smartImageView2, LLJJJJJIL);
        C786410Ut5.td(smartImageView2, LLJJJJJIL);
        C786410Ut5.LLFF(8, smartImageView2);
        this.LLILLJJLI = smartImageView2;
        TuxTextView tuxTextView = new TuxTextView(getContext(), null, 6, 0);
        tuxTextView.setId(ViewGroup.generateViewId());
        C786410Ut5.R6(tuxTextView, new C19ME(LLJJJJLIIL, -2));
        tuxTextView.setGravity(17);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(2);
        tuxTextView.setTextColorRes(R.attr.a1q);
        tuxTextView.setTuxFont(92);
        this.LLILLL = tuxTextView;
        C0GRK c0grk = new C0GRK(getContext());
        c0grk.setId(ViewGroup.generateViewId());
        C19ME c19me = new C19ME(LLJJL, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0grk);
        c0grk.setLayoutParams(c19me);
        this.LLILZ = c0grk;
        TuxTextView tuxTextView2 = new TuxTextView(getContext(), null, 6, 0);
        tuxTextView2.setId(ViewGroup.generateViewId());
        C786410Ut5.R6(tuxTextView2, new C19ME(0, -2));
        tuxTextView2.setGravity(16);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView2.setMaxLines(1);
        tuxTextView2.setTextColorRes(R.attr.a1q);
        tuxTextView2.setTuxFont(43);
        this.LLILZIL = tuxTextView2;
        TuxTextView tuxTextView3 = new TuxTextView(getContext(), null, 6, 0);
        tuxTextView3.setId(ViewGroup.generateViewId());
        C786410Ut5.R6(tuxTextView3, new C19ME(0, -2));
        tuxTextView3.setGravity(16);
        tuxTextView3.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView3.setMaxLines(2);
        tuxTextView3.setTextColorRes(R.attr.a1h);
        tuxTextView3.setTuxFont(91);
        this.LLILZLL = tuxTextView3;
        TuxTextView tuxTextView4 = new TuxTextView(getContext(), null, 6, 0);
        tuxTextView4.setId(ViewGroup.generateViewId());
        C786410Ut5.R6(tuxTextView4, new C19ME(-2, -2));
        tuxTextView4.setGravity(16);
        tuxTextView4.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView4.setMaxLines(1);
        tuxTextView4.setTextColorRes(R.attr.a1h);
        tuxTextView4.setTuxFont(91);
        C03DZ.LIZ(tuxTextView4);
        this.LLIZ = tuxTextView4;
        C429650Gt1 c429650Gt1 = new C429650Gt1(getContext());
        c429650Gt1.setId(ViewGroup.generateViewId());
        c429650Gt1.setTextColorRes(R.attr.a1q);
        c429650Gt1.setTuxFont(91);
        C03DZ.LIZ(c429650Gt1);
        this.LLIZLLLIL = c429650Gt1;
        C977203ru c977203ru = new C977203ru(getContext(), null, 6);
        c977203ru.setId(ViewGroup.generateViewId());
        C19ME c19me2 = new C19ME(-2, LLJZ);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c977203ru);
        c977203ru.setLayoutParams(c19me2);
        c977203ru.setMaxWidth(LLJZIJLIL);
        c977203ru.setMinWidth(LLL);
        int i4 = LLLFFI;
        c977203ru.setPadding(i4, 0, i4, 0);
        c977203ru.setGravity(17);
        c977203ru.setEllipsize(TextUtils.TruncateAt.END);
        c977203ru.setMaxLines(1);
        c977203ru.setTuxFont(72);
        c977203ru.setButtonSize(0);
        this.LLJ = c977203ru;
        TuxTextView tuxTextView5 = new TuxTextView(getContext(), null, 6, 0);
        tuxTextView5.setId(ViewGroup.generateViewId());
        C786410Ut5.R6(tuxTextView5, new C19ME(-2, -2));
        int i5 = LLLI;
        tuxTextView5.setPadding(i5, 0, i5, 0);
        tuxTextView5.setGravity(16);
        tuxTextView5.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView5.setMaxLines(1);
        tuxTextView5.setTextColorRes(R.attr.hn);
        tuxTextView5.setTuxFont(82);
        C786410Ut5.LLLLZLL(tuxTextView5, 8);
        this.LLJI = tuxTextView5;
        this.LLJIJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(639));
        this.LLJILJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(638));
        ViewGroup.LayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(LLJILJILJ, LLJILLL);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(marginLayoutParams);
        setLayerType(1, null);
        addView(smartImageView);
        addView(smartImageView2);
        addView(tuxTextView);
        addView(c0grk);
        addView(tuxTextView2);
        addView(tuxTextView3);
        addView(tuxTextView4);
        addView(c429650Gt1);
        addView(c977203ru);
        addView(tuxTextView5);
        C19MB c19mb = new C19MB();
        c19mb.LJII(this);
        c19mb.LJIIIIZZ(smartImageView.getId(), 6, 0, 6);
        c19mb.LJIIIIZZ(smartImageView.getId(), 7, c0grk.getId(), 6);
        c19mb.LJIIIIZZ(smartImageView.getId(), 3, 0, 3);
        c19mb.LJIIIIZZ(smartImageView.getId(), 4, tuxTextView.getId(), 3);
        c19mb.LJJIIZI(smartImageView.getId(), 2);
        c19mb.LJIIIIZZ(smartImageView2.getId(), 7, smartImageView.getId(), 7);
        c19mb.LJIIIIZZ(smartImageView2.getId(), 4, smartImageView.getId(), 4);
        c19mb.LJJIIZI(smartImageView2.getId(), 2);
        c19mb.LJIIIIZZ(tuxTextView.getId(), 6, 0, 6);
        c19mb.LJIIIIZZ(tuxTextView.getId(), 7, c0grk.getId(), 6);
        c19mb.LJIIIIZZ(tuxTextView.getId(), 3, smartImageView.getId(), 4);
        c19mb.LJIIIIZZ(tuxTextView.getId(), 4, 0, 4);
        c19mb.LJJIIZI(tuxTextView.getId(), 2);
        c19mb.LJJIIJZLJL(tuxTextView.getId(), 3, LLJJJIL);
        c19mb.LJIIIIZZ(c0grk.getId(), 6, 0, 6);
        c19mb.LJIIIIZZ(c0grk.getId(), 3, 0, 3);
        c19mb.LJIIIIZZ(c0grk.getId(), 4, 0, 4);
        c19mb.LJJIIJZLJL(c0grk.getId(), 6, LLJLILLLLZIIL);
        int id = c0grk.getId();
        int i6 = LLJLL;
        c19mb.LJJIIJZLJL(id, 3, i6);
        c19mb.LJJIIJZLJL(c0grk.getId(), 4, i6);
        c19mb.LJIIIIZZ(tuxTextView2.getId(), 6, c0grk.getId(), 7);
        c19mb.LJIIIIZZ(tuxTextView2.getId(), 7, c977203ru.getId(), 6);
        c19mb.LJIIIIZZ(tuxTextView2.getId(), 3, 0, 3);
        c19mb.LJIIIIZZ(tuxTextView2.getId(), 4, tuxTextView3.getId(), 3);
        c19mb.LJIIJ(tuxTextView2.getId());
        c19mb.LJJIIZI(tuxTextView2.getId(), 2);
        c19mb.LJJII(0.0f, tuxTextView2.getId());
        int id2 = tuxTextView2.getId();
        int i7 = LLJLLIL;
        c19mb.LJJIIJZLJL(id2, 6, i7);
        c19mb.LJJIIJZLJL(tuxTextView2.getId(), 7, i7);
        c19mb.LJIIIIZZ(tuxTextView3.getId(), 6, c0grk.getId(), 7);
        c19mb.LJIIIIZZ(tuxTextView3.getId(), 7, c977203ru.getId(), 6);
        c19mb.LJIIIIZZ(tuxTextView3.getId(), 3, tuxTextView2.getId(), 4);
        c19mb.LJIIIIZZ(tuxTextView3.getId(), 4, c429650Gt1.getId(), 3);
        c19mb.LJIIJ(tuxTextView3.getId());
        c19mb.LJJIIZI(tuxTextView3.getId(), 2);
        c19mb.LJJII(0.0f, tuxTextView3.getId());
        c19mb.LJJIIJZLJL(tuxTextView3.getId(), 6, i7);
        c19mb.LJJIIJZLJL(tuxTextView3.getId(), 7, i7);
        c19mb.LJIIIIZZ(c429650Gt1.getId(), 6, tuxTextView4.getId(), 7);
        c19mb.LJIIIIZZ(c429650Gt1.getId(), 7, c977203ru.getId(), 6);
        c19mb.LJIIIIZZ(c429650Gt1.getId(), 3, tuxTextView3.getId(), 4);
        c19mb.LJIIIIZZ(c429650Gt1.getId(), 4, 0, 4);
        c19mb.LJIILL(c429650Gt1.getId(), 0);
        c19mb.LJIJI(c429650Gt1.getId()).LIZLLL.LJJLIIIIJ = true;
        c19mb.LJIIJ(c429650Gt1.getId());
        c19mb.LJJIIZI(c429650Gt1.getId(), 2);
        c19mb.LJJIII(c429650Gt1.getId(), 2);
        c19mb.LJJIIJZLJL(c429650Gt1.getId(), 7, i7);
        c19mb.LJJIIJZLJL(c429650Gt1.getId(), 6, LLJLLL);
        c19mb.LJJI(c429650Gt1.getId(), 6, i7);
        c19mb.LJIIIIZZ(tuxTextView4.getId(), 6, c0grk.getId(), 7);
        c19mb.LJIIIIZZ(tuxTextView4.getId(), 7, c429650Gt1.getId(), 6);
        c19mb.LJIIIIZZ(tuxTextView4.getId(), 3, c429650Gt1.getId(), 3);
        c19mb.LJIIIIZZ(tuxTextView4.getId(), 4, c429650Gt1.getId(), 4);
        c19mb.LJIILL(tuxTextView4.getId(), 0);
        c19mb.LJIJI(tuxTextView4.getId()).LIZLLL.LJJLIIIIJ = true;
        c19mb.LJIIJ(tuxTextView4.getId());
        c19mb.LJJIII(tuxTextView4.getId(), 2);
        c19mb.LJJII(0.0f, tuxTextView4.getId());
        c19mb.LJJIIJZLJL(tuxTextView4.getId(), 6, i7);
        c19mb.LJIIIIZZ(c977203ru.getId(), 7, 0, 7);
        c19mb.LJIIIIZZ(c977203ru.getId(), 3, 0, 3);
        c19mb.LJIIIIZZ(c977203ru.getId(), 4, 0, 4);
        c19mb.LJJIIJZLJL(c977203ru.getId(), 7, LLLFZ);
        c19mb.LJIIIIZZ(tuxTextView5.getId(), 7, 0, 7);
        c19mb.LJIIIIZZ(tuxTextView5.getId(), 3, 0, 3);
        c19mb.LIZIZ(this);
    }

    public final void i0(Image image, boolean z, Integer num) {
        float fLIZIZ;
        float fLIZIZ2;
        if (image != null) {
            C03DZ.LIZJ(this.LL);
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(image);
            c1331670kl3LIZLLL.LJJ = EnumC1338240kve.FIT_CENTER;
            c1331670kl3LIZLLL.LJJ(this.LL);
            if (num != null) {
                c1331670kl3LIZLLL.LJJIIZ(num.intValue());
            }
            if (z) {
                C1331750klB c1331750klB = new C1331750klB();
                c1331750klB.LIZ = true;
                c1331670kl3LIZLLL.LJJI = new C1331730kl9(c1331750klB);
            }
            Integer width = image.getWidth();
            if (width != null) {
                fLIZIZ = C418440Gaw.LIZIZ(width);
            } else {
                fLIZIZ = 0.0f;
            }
            Integer height = image.getHeight();
            if (height != null) {
                fLIZIZ2 = C418440Gaw.LIZIZ(height);
            } else {
                fLIZIZ2 = 0.0f;
            }
            if (fLIZIZ > 0.0f && fLIZIZ2 > 0.0f) {
                float f = fLIZIZ / fLIZIZ2;
                if (f > LLJJJ) {
                    int i = LLJJIJIIJIL;
                    int i2 = (int) (i / f);
                    C1744700vVE.LJII(this.LL, i, i2);
                    c1331670kl3LIZLLL.LJIIIIZZ = i;
                    c1331670kl3LIZLLL.LJIIIZ = i2;
                } else {
                    int i3 = LLJJIJIL;
                    int i4 = (int) (i3 * f);
                    C1744700vVE.LJII(this.LL, i4, i3);
                    c1331670kl3LIZLLL.LJIIIIZZ = i4;
                    c1331670kl3LIZLLL.LJIIIZ = i3;
                }
            }
            c1331670kl3LIZLLL.LJIIJJI();
            return;
        }
        C03DZ.LIZ(this.LL);
    }

    public final void h0(CustomColor customColor, CustomColor customColor2, CustomColor customColor3, int i, Integer num, Float f) {
        Integer numLIZ;
        Integer numLIZ2;
        Integer numLIZ3;
        Drawable drawableLIZ;
        float fFloatValue;
        Float fValueOf = f;
        Integer numLIZJ = null;
        if (customColor != null) {
            numLIZ = C038L.LIZ(customColor, getContext(), null);
        } else {
            numLIZ = null;
        }
        if (customColor2 != null) {
            numLIZ2 = C038L.LIZ(customColor2, getContext(), null);
        } else {
            numLIZ2 = null;
        }
        if (customColor3 != null) {
            numLIZ3 = C038L.LIZ(customColor3, getContext(), null);
        } else {
            numLIZ3 = null;
        }
        if (num != null) {
            numLIZJ = C1308910kAL.LIZJ(num.intValue(), getContext());
        }
        int iIntValue = 0;
        if (numLIZ != null && numLIZ2 != null && numLIZ3 != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            if (Build.VERSION.SDK_INT >= 29) {
                gradientDrawable.setColors(new int[]{numLIZ.intValue(), numLIZ2.intValue(), numLIZ3.intValue()}, new float[]{0.0f, 0.22f, 1.0f});
            } else {
                gradientDrawable.setColors(new int[]{numLIZ.intValue(), numLIZ2.intValue(), numLIZ3.intValue()});
            }
            gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
            if (fValueOf != null) {
                fFloatValue = fValueOf.floatValue();
            } else {
                fFloatValue = LLJJ;
            }
            gradientDrawable.setCornerRadius(fFloatValue);
            drawableLIZ = gradientDrawable;
            if (numLIZJ != null) {
                gradientDrawable.setStroke(LLJJI, numLIZJ.intValue());
                drawableLIZ = gradientDrawable;
            }
        } else {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(i);
            if (fValueOf == null) {
                fValueOf = Float.valueOf(LLJJ);
            }
            c384050F3z.LIZJ = fValueOf;
            c384050F3z.LIZLLL = Integer.valueOf(LLJJI);
            c384050F3z.LJ = numLIZJ;
            drawableLIZ = c384050F3z.LIZ(getContext());
        }
        setBackground(drawableLIZ);
        Paint paintPunchHoleArc = getPaintPunchHoleArc();
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        }
        paintPunchHoleArc.setColor(iIntValue);
    }
}
