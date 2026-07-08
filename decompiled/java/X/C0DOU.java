package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AwS405S0200000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DOU, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DOU extends ConstraintLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public String LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public String LLILZLL;
    public boolean LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public boolean LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public String LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;

    private final int getActionStartMargin() {
        return ((Number) this.LLJJIII.getValue()).intValue();
    }

    private final TuxTextView getContentView() {
        return (TuxTextView) this.LLILZIL.getValue();
    }

    private final float getCornerRadius() {
        return ((Number) this.LLJJIJI.getValue()).floatValue();
    }

    private final TuxTextView getCtaTextView() {
        return (TuxTextView) this.LLJILJIL.getValue();
    }

    private final int getHorizontalPadding() {
        return ((Number) this.LLJILLL.getValue()).intValue();
    }

    private final ImageView getIconView() {
        return (ImageView) this.LLJ.getValue();
    }

    private final int getTextGap() {
        return ((Number) this.LLJJI.getValue()).intValue();
    }

    private final TuxTextView getTitleView() {
        return (TuxTextView) this.LLILLJJLI.getValue();
    }

    private final int getVerticalPadding() {
        return ((Number) this.LLJJ.getValue()).intValue();
    }

    public final int getContentViewId() {
        return ((Number) this.LLILZ.getValue()).intValue();
    }

    public final int getCtaTextViewId() {
        return ((Number) this.LLJIJIL.getValue()).intValue();
    }

    public final int getIconViewId() {
        return ((Number) this.LLIZLLLIL.getValue()).intValue();
    }

    public final int getTitleViewId() {
        return ((Number) this.LL.getValue()).intValue();
    }

    public final String getContent() {
        return getContentView().getText().toString();
    }

    public final String getCtaText() {
        return getCtaTextView().getText().toString();
    }

    public final String getTitle() {
        return getTitleView().getText().toString();
    }

    public final boolean getContentIsPlaceholder() {
        return this.LLIZ;
    }

    public C0DOU(Context context) {
        super(context);
        this.LL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4997));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS405S0200000_4(context, this, 54));
        this.LLILLL = "";
        this.LLILZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4991));
        this.LLILZIL = C452501pT.LIZIZ(new AwS405S0200000_4(context, this, 51));
        this.LLILZLL = "";
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4995));
        this.LLJ = C452501pT.LIZIZ(new AwS405S0200000_4(context, this, 53));
        this.LLJIJIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4993));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS405S0200000_4(context, this, 52));
        this.LLJILJILJ = "";
        this.LLJILLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4994));
        this.LLJJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4998));
        this.LLJJI = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4996));
        this.LLJJIII = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4990));
        this.LLJJIJI = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4992));
        setPadding(getHorizontalPadding(), getVerticalPadding(), getHorizontalPadding(), getVerticalPadding());
        TuxTextView titleView = getTitleView();
        C19ME c19me = new C19ME(-2, -2);
        c19me.endToStart = getCtaTextViewId();
        c19me.startToStart = 0;
        c19me.horizontalBias = 0.0f;
        addView(titleView, c19me);
        TuxTextView contentView = getContentView();
        C19ME c19me2 = new C19ME(-2, -2);
        ((ViewGroup.MarginLayoutParams) c19me2).topMargin = getTextGap();
        c19me2.topToBottom = getTitleViewId();
        c19me2.endToStart = getCtaTextViewId();
        c19me2.startToStart = 0;
        c19me2.horizontalBias = 0.0f;
        addView(contentView, c19me2);
        ImageView iconView = getIconView();
        C19ME c19me3 = new C19ME(-2, -2);
        c19me3.endToEnd = 0;
        c19me3.topToTop = 0;
        c19me3.bottomToBottom = 0;
        c19me3.setMarginStart(getActionStartMargin());
        addView(iconView, c19me3);
        TuxTextView ctaTextView = getCtaTextView();
        C19ME c19me4 = new C19ME(-2, -2);
        c19me4.endToStart = getIconViewId();
        c19me4.topToTop = 0;
        c19me4.bottomToBottom = 0;
        c19me4.setMarginStart(getActionStartMargin());
        addView(ctaTextView, c19me4);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zn, context);
        if (numLIZJ != null) {
            C440190HNx c440190HNx = new C440190HNx(getCornerRadius(), numLIZJ.intValue());
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a03, context);
            if (numLIZJ2 != null) {
                c440190HNx.LJIIJ(0.5f, numLIZJ2.intValue());
            }
            setBackground(c440190HNx);
        }
        C427690Gpr.LJ(this, getCornerRadius());
    }

    public final void setArrowVisible(boolean z) {
        int i;
        if (this.LLJI != z) {
            ImageView iconView = getIconView();
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, iconView);
        }
        this.LLJI = z;
    }

    public final void setContent(String str) {
        if (!Intrinsics.LJFF(this.LLILZLL, str)) {
            getContentView().setText(str);
        }
        this.LLILZLL = str;
    }

    public final void setContentIsPlaceholder(boolean z) {
        int i;
        if (this.LLIZ != z) {
            TuxTextView contentView = getContentView();
            if (z) {
                i = R.attr.a1p;
            } else {
                i = R.attr.a1h;
            }
            contentView.setTextColorRes(i);
        }
        this.LLIZ = z;
    }

    public final void setCtaText(String str) {
        if (!Intrinsics.LJFF(this.LLJILJILJ, str)) {
            getCtaTextView().setText(str);
            TuxTextView ctaTextView = getCtaTextView();
            int i = 0;
            if (str.length() <= 0) {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, ctaTextView);
        }
        this.LLJILJILJ = str;
    }

    public final void setTitle(String str) {
        if (!Intrinsics.LJFF(this.LLILLL, str)) {
            getTitleView().setText(str);
        }
        this.LLILLL = str;
    }
}
