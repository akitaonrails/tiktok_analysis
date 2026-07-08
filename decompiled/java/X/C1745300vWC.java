package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.address.widget.InputResultIndicator;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0vWC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1745300vWC extends LinearLayout {
    public FrameLayout LL;
    public View LLILLJJLI;
    public C1748260vay LLILLL;
    public C0I7D LLILZ;
    public TuxTextView LLILZIL;
    public C0I7D LLILZLL;
    public TuxTextView LLIZ;
    public TuxIconView LLIZLLLIL;
    public C1745850vX5 LLJ;
    public InputResultIndicator LLJI;
    public FrameLayout LLJIJIL;
    public View LLJILJIL;
    public TuxTextView LLJILJILJ;
    public TuxTextView LLJILLL;
    public View LLJJ;
    public final boolean LLJJI;
    public boolean LLJJIII;
    public Integer LLJJIJI;
    public Integer LLJJIJIIJIL;
    public Integer LLJJIJIL;
    public Integer LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;

    public final void LIZIZ() {
        InputResultIndicator inputResultIndicatorFromXml = getInputResultIndicatorFromXml();
        inputResultIndicatorFromXml.LL.setBackgroundColor(inputResultIndicatorFromXml.LLILZ);
        C786410Ut5.LJLLLLLL(8, inputResultIndicatorFromXml.LLILLJJLI);
        if (this.LLJJIII) {
            LJI(this.LLJJIJI, this.LLJJIJIIJIL, this.LLJJIJIL, this.LLJJJ, this.LLJJJIL);
        }
    }

    public View getContentView() {
        return null;
    }

    public int getContentViewLayoutId() {
        return -1;
    }

    public View getFooterView() {
        return null;
    }

    public int getFooterViewLayoutId() {
        return -1;
    }

    public final TuxTextView getAddressHintMessageFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.agy);
            this.LLJILJILJ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getAddressInvalidMessageFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ah3);
            this.LLJILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxIconView getArrowFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b8t);
            this.LLIZLLLIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final FrameLayout getContentViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.euf);
            this.LL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final C0I7D getEditViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gnn);
            this.LLILZLL = (C0I7D) callbackFindViewById;
        }
        return (C0I7D) callbackFindViewById;
    }

    public final FrameLayout getFooterViewContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ihg);
            this.LLJIJIL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final View getInputBottomSpaceFromXml() {
        View view = this.LLJJ;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.kp_);
        this.LLJJ = viewFindViewById;
        return viewFindViewById;
    }

    public final InputResultIndicator getInputResultIndicatorFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.kq1);
            this.LLJI = (InputResultIndicator) callbackFindViewById;
        }
        return (InputResultIndicator) callbackFindViewById;
    }

    public final View getInputWithIndicatorBar() {
        View view = this.LLILLJJLI;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.kq5);
        this.LLILLJJLI = viewFindViewById;
        return viewFindViewById;
    }

    public final C0I7D getInputWithIndicatorEditTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.kq8);
            this.LLILZ = (C0I7D) callbackFindViewById;
        }
        return (C0I7D) callbackFindViewById;
    }

    public final C1748260vay getInputWithIndicatorFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.kq4);
            this.LLILLL = (C1748260vay) callbackFindViewById;
        }
        return (C1748260vay) callbackFindViewById;
    }

    public final C1745850vX5 getPhoneInputFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qap);
            this.LLJ = (C1745850vX5) callbackFindViewById;
        }
        return (C1745850vX5) callbackFindViewById;
    }

    public final TuxTextView getTextViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.xkj);
            this.LLIZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.title);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final View getTitleSpaceFromXml() {
        View view = this.LLJILJIL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.xzq);
        this.LLJILJIL = viewFindViewById;
        return viewFindViewById;
    }

    public final void LIZJ() {
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, getContext());
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1m, getContext());
        if (this.LLJJJIL) {
            FrameLayout contentViewFromXml = getContentViewFromXml();
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(8));
            gradientDrawable.setGradientType(0);
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            if (numLIZJ != null) {
                gradientDrawable.setColor(numLIZJ.intValue());
            }
            if (numLIZJ2 != null) {
                gradientDrawable.setStroke(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), numLIZJ2.intValue());
            }
            contentViewFromXml.setBackground(gradientDrawable);
        }
        getInputResultIndicatorFromXml().setResultTextTuxFont(62);
    }

    public final InputResultIndicator getInputResultIndicator() {
        return getInputResultIndicatorFromXml();
    }

    public final void LJ(String str) {
        if (str != null && str.length() != 0) {
            C03DZ.LIZJ(getAddressHintMessageFromXml());
            getAddressHintMessageFromXml().setText(str);
        }
    }

    public final void LJFF(C1745340vWG c1745340vWG) {
        String str;
        int i;
        if (!this.LLJJJJ && c1745340vWG != null) {
            InputResultIndicator inputResultIndicatorFromXml = getInputResultIndicatorFromXml();
            if (inputResultIndicatorFromXml.LLILZLL) {
                C786410Ut5.LJLLLLLL(0, inputResultIndicatorFromXml.LL);
                View view = inputResultIndicatorFromXml.LL;
                if (!C1745310vWD.LIZ(c1745340vWG) && c1745340vWG.LIZIZ == EnumC1154240g8s.ERROR) {
                    i = inputResultIndicatorFromXml.LLILZIL;
                } else {
                    i = inputResultIndicatorFromXml.LLILZ;
                }
                view.setBackgroundColor(i);
            } else {
                C786410Ut5.LJLLLLLL(8, inputResultIndicatorFromXml.LL);
            }
            String str2 = c1745340vWG.LIZ;
            if (str2 != null && str2.length() > 0) {
                C786410Ut5.LJLLLLLL(0, inputResultIndicatorFromXml.LLILLJJLI);
                inputResultIndicatorFromXml.LLILLL.setText(c1745340vWG.LIZ);
                TuxIconView tuxIconView = (TuxIconView) inputResultIndicatorFromXml.findViewById(R.id.tdp);
                EnumC1154240g8s enumC1154240g8s = c1745340vWG.LIZIZ;
                if (enumC1154240g8s != EnumC1154240g8s.TIPS && enumC1154240g8s != EnumC1154240g8s.WEAK_ERROR) {
                    inputResultIndicatorFromXml.LLILLL.setTextColor(C960203pA.LIZ(R.attr.zs, inputResultIndicatorFromXml.getContext()));
                    tuxIconView.setIconRes(R.raw.icon_exclamation_mark_triangle_fill);
                    tuxIconView.setTintColorRes(R.attr.zs);
                } else {
                    inputResultIndicatorFromXml.LLILLL.setTextColor(C960203pA.LIZ(R.attr.a1k, inputResultIndicatorFromXml.getContext()));
                    tuxIconView.setIconRes(R.raw.icon_exclamation_mark_circle);
                    tuxIconView.setTintColorRes(R.attr.a1j);
                }
            }
            if (this.LLJJIII && (str = c1745340vWG.LIZ) != null && str.length() > 0 && c1745340vWG.LIZIZ == EnumC1154240g8s.ERROR) {
                LIZJ();
            }
        }
    }

    public final void setAddressHintMessageFromXml(TuxTextView tuxTextView) {
        this.LLJILJILJ = tuxTextView;
    }

    public final void setAddressInvalidMessageFromXml(TuxTextView tuxTextView) {
        this.LLJILLL = tuxTextView;
    }

    public final void setArrowFromXml(TuxIconView tuxIconView) {
        this.LLIZLLLIL = tuxIconView;
    }

    public final void setContentViewFromXml(FrameLayout frameLayout) {
        this.LL = frameLayout;
    }

    public final void setDontKownZipCode(boolean z) {
        this.LLJJJJ = z;
    }

    public final void setEditViewFromXml(C0I7D c0i7d) {
        this.LLILZLL = c0i7d;
    }

    public final void setFooterViewContainerFromXml(FrameLayout frameLayout) {
        this.LLJIJIL = frameLayout;
    }

    public final void setInputBottomSpaceFromXml(View view) {
        this.LLJJ = view;
    }

    public final void setInputResultIndicatorFromXml(InputResultIndicator inputResultIndicator) {
        this.LLJI = inputResultIndicator;
    }

    public final void setInputWithIndicatorBar(View view) {
        this.LLILLJJLI = view;
    }

    public final void setInputWithIndicatorEditTextFromXml(C0I7D c0i7d) {
        this.LLILZ = c0i7d;
    }

    public final void setInputWithIndicatorFromXml(C1748260vay c1748260vay) {
        this.LLILLL = c1748260vay;
    }

    public final void setPhoneInputFromXml(C1745850vX5 c1745850vX5) {
        this.LLJ = c1745850vX5;
    }

    public final void setTextViewFromXml(TuxTextView tuxTextView) {
        this.LLIZ = tuxTextView;
    }

    public final void setTitleFromXml(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    public final void setTitleSpaceFromXml(View view) {
        this.LLJILJIL = view;
    }

    public final void setVerifyResult(C1745340vWG c1745340vWG) {
        if (C1745310vWD.LIZ(c1745340vWG)) {
            LIZIZ();
        } else {
            LJFF(c1745340vWG);
        }
    }

    public C1745300vWC(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LIZLLL(String str, boolean z) {
        boolean z2;
        int iIntValue = 0;
        if (str != null && str.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            C786410Ut5.LLLLZLL(getTitleFromXml(), 8);
            View titleSpaceFromXml = getTitleSpaceFromXml();
            if (!this.LLJJIII) {
                iIntValue = 8;
            }
            C786410Ut5.LJLLLLLL(iIntValue, titleSpaceFromXml);
            return;
        }
        C786410Ut5.LLLLZLL(getTitleFromXml(), 0);
        C786410Ut5.LJLLLLLL(8, getTitleSpaceFromXml());
        if (!z) {
            getTitleFromXml().setText(str);
            return;
        }
        TuxTextView titleFromXml = getTitleFromXml();
        if (titleFromXml == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(str).append((CharSequence) "*");
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1r, getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        }
        C786410Ut5.q2(spannableStringBuilderAppend, new ForegroundColorSpan(iIntValue), str.length(), str.length() + 1, 33);
        titleFromXml.setText(spannableStringBuilderAppend);
    }

    public C1745300vWC(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJJJIL = true;
        C786410Ut5.LJLLJ(context, R.layout.ait, this);
        this.LLJJI = true;
        setOrientation(1);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            layoutParams.width = -1;
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        int contentViewLayoutId = getContentViewLayoutId();
        View contentView = getContentView();
        if (contentViewLayoutId != -1) {
            C786410Ut5.LJLLJ(context, contentViewLayoutId, this);
        } else if (contentView != null) {
            addView(contentView);
        }
        int footerViewLayoutId = getFooterViewLayoutId();
        View viewLJLLJ = footerViewLayoutId != -1 ? C786410Ut5.LJLLJ(context, footerViewLayoutId, null) : getFooterView();
        if (viewLJLLJ != null) {
            getFooterViewContainerFromXml().addView(viewLJLLJ);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.LLJJI) {
            getContentViewFromXml().addView(view, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    public final void LJI(Integer num, Integer num2, Integer num3, Integer num4, boolean z) {
        int iLIZIZ;
        int iLIZIZ2;
        this.LLJJIII = true;
        this.LLJJIJI = num;
        this.LLJJIJIIJIL = num2;
        this.LLJJIJIL = num3;
        this.LLJJJ = num4;
        this.LLJJJIL = z;
        TuxTextView titleFromXml = getTitleFromXml();
        if (num != null) {
            iLIZIZ = num.intValue();
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        }
        C0H9H.LJI(iLIZIZ, titleFromXml);
        TuxTextView titleFromXml2 = getTitleFromXml();
        if (num2 != null) {
            iLIZIZ2 = num2.intValue();
        } else {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        }
        C0H9H.LIZJ(iLIZIZ2, titleFromXml2);
        InputResultIndicator inputResultIndicatorFromXml = getInputResultIndicatorFromXml();
        inputResultIndicatorFromXml.LLILZLL = false;
        C786410Ut5.LJLLLLLL(8, inputResultIndicatorFromXml.LL);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, getContext());
        if (z) {
            FrameLayout contentViewFromXml = getContentViewFromXml();
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(8));
            gradientDrawable.setGradientType(0);
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            if (numLIZJ != null) {
                gradientDrawable.setColor(numLIZJ.intValue());
            }
            contentViewFromXml.setBackground(gradientDrawable);
        }
        if (num3 != null && num4 != null) {
            C426750GoL.LJIIL(getContentViewFromXml(), num3, null, num4, null, 26);
        }
    }
}
