package X;

import Y.ACListenerS162S0100000_28;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1099, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class AnonymousClass1099 extends LinearLayout {
    public LinearLayout LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxIconView LLILZ;
    public FrameLayout LLILZIL;
    public C1841350y17 LLILZLL;
    public TuxSpinner LLIZ;
    public AnonymousClass1098 LLIZLLLIL;
    public int LLJ;
    public final int LLJI;
    public Function0<Unit> LLJIJIL;
    public CharSequence LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;

    public final void LIZIZ() {
        if (!this.LLJILJILJ) {
            getCellContainerFromXml().setForeground(null);
        } else {
            C427690Gpr.LJ(getCellContainerFromXml(), 0.0f);
            getRadioViewWrapperFromXml().setClickable(false);
        }
    }

    public final LinearLayout getCellContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dlh);
            this.LL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxIconView getIconIvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.k1_);
            this.LLILZ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final C1841350y17 getRadioViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.spm);
            this.LLILZLL = (C1841350y17) callbackFindViewById;
        }
        return (C1841350y17) callbackFindViewById;
    }

    public final FrameLayout getRadioViewWrapperFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.spn);
            this.LLILZIL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final TuxSpinner getSpinnerViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vuk);
            this.LLIZ = (TuxSpinner) callbackFindViewById;
        }
        return (TuxSpinner) callbackFindViewById;
    }

    public final TuxTextView getSubtitleTvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wmy);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTitleTvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.y3j);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void LIZ() {
        int i;
        TuxTextView titleTvFromXml = getTitleTvFromXml();
        int iLIZIZ = this.LLJI;
        if (iLIZIZ < 0) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJILLL ? 8 : 0)));
        }
        AnonymousClass1098 anonymousClass1098 = this.LLIZLLLIL;
        if (anonymousClass1098 != null && (i = anonymousClass1098.LIZ) >= 0) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        }
        C426750GoL.LJIIIZ(titleTvFromXml, Integer.valueOf(iLIZIZ), null, null, null, false, 30);
    }

    public final C1841350y17 getRadioView() {
        return getRadioViewFromXml();
    }

    public final CharSequence getSubtitle() {
        return getSubtitleTvFromXml().getText();
    }

    public final boolean getCellEnabled() {
        return this.LLJILJILJ;
    }

    public final Function0<Unit> getDisableClickListener() {
        return this.LLJIJIL;
    }

    public final CharSequence getTitle() {
        return this.LLJILJIL;
    }

    public final int getTitleColorRes() {
        return this.LLJ;
    }

    public final AnonymousClass1098 getUiConfig() {
        return this.LLIZLLLIL;
    }

    private final void setViewEnable(boolean z) {
        int i;
        int iIntValue;
        TuxTextView titleTvFromXml = getTitleTvFromXml();
        Context context = getContext();
        int i2 = R.attr.a1p;
        if (z) {
            i = this.LLJ;
        } else {
            i = R.attr.a1p;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(i, context);
        int iIntValue2 = 0;
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        titleTvFromXml.setTextColor(iIntValue);
        TuxTextView subtitleTvFromXml = getSubtitleTvFromXml();
        Context context2 = getContext();
        if (z) {
            i2 = R.attr.a1k;
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(i2, context2);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        }
        subtitleTvFromXml.setTextColor(iIntValue2);
        LIZJ(z);
        getRadioViewFromXml().setEnabled(z);
        LIZIZ();
    }

    private final void setWithIcon(boolean z) {
        int i;
        this.LLJILLL = z;
        TuxIconView iconIvFromXml = getIconIvFromXml();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLLLLLZZ(iconIvFromXml, i);
        LIZ();
    }

    public final void LIZJ(boolean z) {
        int iIntValue;
        AnonymousClass1098 anonymousClass1098;
        Integer num;
        TuxIconView iconIvFromXml = getIconIvFromXml();
        Context context = getContext();
        int iIntValue2 = R.attr.a1p;
        if (z && (anonymousClass1098 = this.LLIZLLLIL) != null && (num = anonymousClass1098.LIZLLL) != null) {
            iIntValue2 = num.intValue();
        }
        Integer numLIZJ = C1308910kAL.LIZJ(iIntValue2, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        iconIvFromXml.setTintColor(iIntValue);
    }

    public final void setCellContainerFromXml(LinearLayout linearLayout) {
        this.LL = linearLayout;
    }

    public final void setCellEnabled(boolean z) {
        this.LLJILJILJ = z;
        setViewEnable(z);
    }

    public final void setDisableClickListener(Function0<Unit> function0) {
        this.LLJIJIL = function0;
    }

    @Override // android.view.View
    @InterfaceC1294060jmO
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        getCellContainerFromXml().setEnabled(z);
        setViewEnable(z);
    }

    public final void setIcon(C419910GdJ c419910GdJ) {
        boolean z;
        if (c419910GdJ != null) {
            getIconIvFromXml().setIconRes(c419910GdJ.LIZ);
            Integer num = c419910GdJ.LIZLLL;
            if (num != null) {
                getIconIvFromXml().setTintColor(num.intValue());
            }
            Integer num2 = c419910GdJ.LJ;
            if (num2 != null) {
                getIconIvFromXml().setTintColorRes(num2.intValue());
            }
            LIZJ(this.LLJILJILJ);
            z = true;
        } else {
            z = false;
        }
        setWithIcon(z);
    }

    public final void setIconIvFromXml(TuxIconView tuxIconView) {
        this.LLILZ = tuxIconView;
    }

    public final void setLoading(boolean z) {
        int i;
        C1841350y17 radioViewFromXml = getRadioViewFromXml();
        int i2 = 0;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        C786410Ut5.LLLLZ(radioViewFromXml, i);
        TuxSpinner spinnerViewFromXml = getSpinnerViewFromXml();
        if (!z) {
            i2 = 8;
        }
        C786410Ut5.LLZILL(spinnerViewFromXml, i2);
    }

    @Override // android.view.View
    @InterfaceC1294060jmO
    public void setOnClickListener(View.OnClickListener onClickListener) {
        C786410Ut5.e9(getRadioView(), onClickListener);
    }

    public final void setRadioViewFromXml(C1841350y17 c1841350y17) {
        this.LLILZLL = c1841350y17;
    }

    public final void setRadioViewWrapperFromXml(FrameLayout frameLayout) {
        this.LLILZIL = frameLayout;
    }

    public final void setSpinnerViewFromXml(TuxSpinner tuxSpinner) {
        this.LLIZ = tuxSpinner;
    }

    public final void setSubtitle(CharSequence charSequence) {
        int visibility = getSubtitleTvFromXml().getVisibility();
        if (charSequence != null && charSequence.length() != 0) {
            getSubtitleTvFromXml().setText(charSequence);
            C786410Ut5.LLLLZLL(getSubtitleTvFromXml(), 0);
            if (!(charSequence instanceof String)) {
                getSubtitleTvFromXml().setMovementMethod(C431260Gvc.LIZ);
                getSubtitleTvFromXml().setClickable(false);
                getSubtitleTvFromXml().setLongClickable(false);
            } else {
                getSubtitleTvFromXml().setMovementMethod(null);
            }
        } else {
            C786410Ut5.LLLLZLL(getSubtitleTvFromXml(), 8);
        }
        if (visibility != getSubtitleTvFromXml().getVisibility()) {
            LIZ();
        }
    }

    public final void setSubtitleTvFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void setTitle(CharSequence charSequence) {
        this.LLJILJIL = charSequence;
        getTitleTvFromXml().setText(charSequence);
        if (!(charSequence instanceof String)) {
            getTitleTvFromXml().setMovementMethod(C431260Gvc.LIZ);
            getTitleTvFromXml().setClickable(false);
            getTitleTvFromXml().setLongClickable(false);
            return;
        }
        getTitleTvFromXml().setMovementMethod(null);
    }

    public final void setTitleColorRes(int i) {
        this.LLJ = i;
    }

    public final void setTitleTvFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setUiConfig(AnonymousClass1098 anonymousClass1098) {
        LinearLayout cellContainerFromXml;
        C191884105a c191884105a;
        TuxTextView subtitleTvFromXml;
        C191884105a c191884105a2;
        TuxTextView titleTvFromXml;
        this.LLIZLLLIL = anonymousClass1098;
        LIZ();
        AnonymousClass1098 anonymousClass10982 = this.LLIZLLLIL;
        if (anonymousClass10982 != null) {
            C105X c105x = anonymousClass10982.LIZIZ;
            if (c105x != null) {
                InterfaceC191885105b interfaceC191885105b = c105x.LIZJ;
                if ((interfaceC191885105b instanceof C191884105a) && (c191884105a2 = (C191884105a) interfaceC191885105b) != null && (titleTvFromXml = getTitleTvFromXml()) != null) {
                    titleTvFromXml.setTuxFont(c191884105a2.LIZ);
                }
            }
            C105X c105x2 = anonymousClass10982.LIZJ;
            if (c105x2 != null) {
                InterfaceC191885105b interfaceC191885105b2 = c105x2.LIZJ;
                if ((interfaceC191885105b2 instanceof C191884105a) && (c191884105a = (C191884105a) interfaceC191885105b2) != null && (subtitleTvFromXml = getSubtitleTvFromXml()) != null) {
                    subtitleTvFromXml.setTuxFont(c191884105a.LIZ);
                }
            }
            C105Z c105z = anonymousClass10982.LJ;
            if (c105z != null && (cellContainerFromXml = getCellContainerFromXml()) != null) {
                C426750GoL.LJIIL(cellContainerFromXml, Integer.valueOf(c105z.LIZ), null, Integer.valueOf(c105z.LIZIZ), null, 26);
            }
        }
    }

    public AnonymousClass1099(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJ = R.attr.a1h;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SheetRadioItemView);
        this.LLJI = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SheetRadioItemView_title_margin_start, -1);
        typedArrayObtainStyledAttributes.recycle();
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.bei, this, true);
        LIZIZ();
        setViewEnable(true);
        LIZ();
        C786410Ut5.R7(getCellContainerFromXml(), new ACListenerS162S0100000_28(this, 112));
        this.LLJILJILJ = true;
    }
}
