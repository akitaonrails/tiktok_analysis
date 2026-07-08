package X;

import Y.ARunnableS25S0100100_27;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.experiment.TakoEnterMethodListExperiment;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: renamed from: X.0yNj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1855370yNj extends FrameLayout {
    public static final /* synthetic */ int LLJILLL = 0;
    public TuxTextView LL;
    public LinearLayout LLILLJJLI;
    public TuxIconView LLILLL;
    public TuxTextView LLILZ;
    public final FrameLayout LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public long LLJIJIL;
    public Pair<Integer, Integer> LLJILJIL;
    public EnumC1855360yNi LLJILJILJ;

    private final ValueAnimator getContentAnimation() {
        return (ValueAnimator) this.LLJI.getValue();
    }

    private final FrameLayout getContentTipContainer() {
        return (FrameLayout) this.LLIZLLLIL.getValue();
    }

    private final View getGradientMaskView() {
        return (View) this.LLILZLL.getValue();
    }

    private final View getSolidMaskView() {
        return (View) this.LLIZ.getValue();
    }

    private final ValueAnimator getTipAnimation() {
        return (ValueAnimator) this.LLJ.getValue();
    }

    public final void LIZ() {
        long j = this.LLJIJIL;
        EnumC1855360yNi enumC1855360yNi = this.LLJILJILJ;
        if (enumC1855360yNi == EnumC1855360yNi.MSG_TOO_SHORT_TIP || enumC1855360yNi == EnumC1855360yNi.UN_RECOGNIZE_TIP) {
            HandlerHook.viewPostDelay(this, new ARunnableS25S0100100_27(j, this, 4), 2000L);
        } else {
            LIZIZ();
        }
    }

    public final void LIZLLL() {
        FrameLayout frameLayout = this.LLILZIL;
        if (frameLayout != null) {
            C426750GoL.LJIIIZ(frameLayout, null, null, null, 0, false, 23);
        }
    }

    public final TuxTextView getContentFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.eu1);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final LinearLayout getTipFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.xya);
            this.LLILLJJLI = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxIconView getTipIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.xyp);
            this.LLILLL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getTipTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.xyu);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void LIZIZ() {
        ViewGroup viewGroup;
        if (getParent() != null) {
            ViewParent parent = getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(this, viewGroup);
            }
        }
        getContentFromXml().setText("");
        setTipState(EnumC1855360yNi.DEFAULT);
    }

    public final Pair<Integer, Integer> getAnchorViewCoordinate() {
        return this.LLJILJIL;
    }

    public final long getLastShowTime() {
        return this.LLJIJIL;
    }

    public final FrameLayout getRootLayout() {
        return this.LLILZIL;
    }

    public final EnumC1855360yNi getTipState() {
        return this.LLJILJILJ;
    }

    public C1855370yNj(Context context) {
        ViewGroup.LayoutParams layoutParams;
        super(context, null, 0);
        this.LLILZLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1050));
        this.LLIZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1052));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1048));
        if (C298800BnS.LIZ() && TakoEnterMethodListExperiment.LIZ(false)) {
            C21146717pB.LIZIZ(context, R.layout.fp_, this, true);
        } else {
            C786410Ut5.Sd(R.layout.fp_, C786410Ut5.ne(context), this);
        }
        C786410Ut5.LLLLZLL(getContentFromXml(), 0);
        C786410Ut5.LJZL(8, getTipFromXml());
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.x7n);
        this.LLILZIL = frameLayout;
        if (frameLayout != null && (layoutParams = frameLayout.getLayoutParams()) != null) {
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(94));
        }
        getGradientMaskView().getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(46));
        getContentTipContainer().setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        View gradientMaskView = getGradientMaskView();
        C12P5 c12p5 = new C12P5();
        c12p5.LIZLLL = Integer.valueOf(R.attr.zm);
        c12p5.LJI = C12KQ.VERTICAL;
        c12p5.LJII = EnumC197015126j.LINEAR;
        c12p5.LJ = Float.valueOf(0.0f);
        c12p5.LJFF = Float.valueOf(1.0f);
        gradientMaskView.setBackground(c12p5.LIZ(getContext()));
        View solidMaskView = getSolidMaskView();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zm, getContext());
        solidMaskView.setBackgroundColor(numLIZJ != null ? numLIZJ.intValue() : 0);
        this.LLJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1056));
        this.LLJI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1045));
        this.LLJILJIL = new Pair<>(0, 0);
        this.LLJILJILJ = EnumC1855360yNi.DEFAULT;
    }

    public final void setAnchorViewCoordinate(Pair<Integer, Integer> pair) {
        this.LLJILJIL = pair;
    }

    public final void setContentFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public final void setLastShowTime(long j) {
        this.LLJIJIL = j;
    }

    public final void setTipFromXml(LinearLayout linearLayout) {
        this.LLILLJJLI = linearLayout;
    }

    public final void setTipIconFromXml(TuxIconView tuxIconView) {
        this.LLILLL = tuxIconView;
    }

    public final void setTipState(EnumC1855360yNi enumC1855360yNi) {
        if (enumC1855360yNi == this.LLJILJILJ) {
            return;
        }
        if (getTipAnimation().isRunning()) {
            getTipAnimation().cancel();
        }
        if (getContentAnimation().isRunning()) {
            getContentAnimation().cancel();
        }
        if (C1855400yNm.LIZ[enumC1855360yNi.ordinal()] == 1) {
            CharSequence text = getContentFromXml().getText();
            if (text != null && text.length() != 0) {
                C786410Ut5.LLLLZLL(getContentFromXml(), 0);
                getContentAnimation().start();
            }
            C786410Ut5.LJZL(8, getTipFromXml());
        } else if (enumC1855360yNi != EnumC1855360yNi.DEFAULT) {
            C786410Ut5.LJZL(0, getTipFromXml());
            C786410Ut5.LLLLZLL(getContentFromXml(), 8);
            getTipAnimation().start();
            if (enumC1855360yNi.getIconRes() != null) {
                TuxIconView tipIconFromXml = getTipIconFromXml();
                C786410Ut5.LLLLLLZZ(tipIconFromXml, 0);
                tipIconFromXml.setTintColorRes(enumC1855360yNi.getColorAttrRes());
                tipIconFromXml.setIconRes(enumC1855360yNi.getIconRes().intValue());
            } else {
                C786410Ut5.LLLLLLZZ(getTipIconFromXml(), 8);
            }
            TuxTextView tipTextFromXml = getTipTextFromXml();
            tipTextFromXml.setText(tipTextFromXml.getContext().getString(enumC1855360yNi.getTextRes()));
            tipTextFromXml.setTextColorRes(enumC1855360yNi.getColorAttrRes());
        }
        this.LLJILJILJ = enumC1855360yNi;
    }

    public final void setTipTextFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void LIZJ(View view, int[] iArr) {
        ViewGroup viewGroup;
        Window window;
        ViewGroup viewGroup2;
        this.LLJIJIL = System.currentTimeMillis();
        this.LLJILJIL = new Pair<>(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
        getContentFromXml().setText("");
        setTipState(EnumC1855360yNi.DEFAULT);
        if (getParent() != null) {
            ViewParent parent = getParent();
            if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(this, viewGroup2);
            }
        }
        getLocationOnScreen(iArr);
        if (getMeasuredHeight() > 0) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setX(0.0f);
            float fFloatValue = this.LLJILJIL.getSecond().floatValue() - getMeasuredHeight();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setY(fFloatValue);
        }
        if (view == null) {
            Activity activityLIZ = C1388190mED.LIZ(getContext());
            if (activityLIZ != null && (window = activityLIZ.getWindow()) != null) {
                view = window.getDecorView();
            } else {
                view = null;
            }
        }
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            viewGroup.addView(this, new FrameLayout.LayoutParams(-1, -2));
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setX(0.0f);
        float fFloatValue = this.LLJILJIL.getSecond().floatValue() - i2;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setY(fFloatValue);
        super.onSizeChanged(i, i2, i3, i4);
    }
}
