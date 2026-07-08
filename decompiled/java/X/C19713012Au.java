package X;

import Y.AAListenerS339S0100000_29;
import Y.ARunnableS27S0210000_29;
import Y.AUListenerS157S0300000_29;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS273S0300000_29;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.12Au, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19713012Au extends ConstraintLayout {
    public static final /* synthetic */ int LLJJ = 0;
    public final View LL;
    public final View LLILLJJLI;
    public EnumC441770HTz LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public TextSwitcher LLJ;
    public boolean LLJI;
    public String LLJIJIL;
    public ValueAnimator LLJILJIL;
    public AnimatorSet LLJILJILJ;
    public AnimatorSet LLJILLL;

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    private final View getBarContainer() {
        return (View) this.LLILZIL.getValue();
    }

    private final boolean getForceStyle() {
        return ((Boolean) this.LLILZ.getValue()).booleanValue();
    }

    private final View getTextContainer() {
        return (View) this.LLILZLL.getValue();
    }

    public final View getBgView() {
        return (View) this.LLIZ.getValue();
    }

    public final TuxTextView getTvTitle() {
        return (TuxTextView) this.LLIZLLLIL.getValue();
    }

    public final boolean isShowing() {
        return this.LLJI || getVisibility() == 0;
    }

    public final void l0() {
        setDesc("");
    }

    @Override // android.view.View
    public final void clearAnimation() {
        super.clearAnimation();
        ValueAnimator valueAnimator = this.LLJILJIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        AnimatorSet animatorSet = this.LLJILJILJ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.LLJILLL;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.LLJI = false;
    }

    public final void B0(int i) {
        View bgView = getBgView();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) bgView.getLayoutParams();
        marginLayoutParams.width = i;
        C786410Ut5.W5(bgView, marginLayoutParams);
        getBarContainer().requestLayout();
    }

    public final void LLLLLILLIL(long j) {
        String string;
        int i;
        int i2 = C0HU0.LIZ[this.LLILLL.ordinal()];
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                throw new C1954807lC();
            }
            if (getForceStyle()) {
                Context context = getContext();
                if (C545810Lat.LIZ()) {
                    i = 2131755022;
                } else {
                    i = 2131755023;
                }
                string = C0T8Y.LIZ(i, 2131755024, j, context);
            } else {
                string = C0T8Y.LIZ(2131755018, 2131755017, j, getContext());
                TextPaint paint = getTvTitle().getPaint();
                if (paint.measureText(string) >= ((double) C1415610mwR.LIZIZ()) * 0.4d) {
                    float fMeasureText = paint.measureText(string) / 2;
                    List<String> listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(string, new String[]{" "}, 0, 6);
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder();
                    for (String str : listLJJLIIIJILLIZJL) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append((Object) sb);
                        sbLIZ.append(' ');
                        sbLIZ.append(str);
                        if (paint.measureText(C2188811AlT.LIZIZ(sbLIZ)) <= fMeasureText) {
                            if (sb.length() > 0) {
                                sb.append(" ");
                            }
                            sb.append(str);
                        } else {
                            if (sb2.length() > 0) {
                                sb2.append(" ");
                            }
                            sb2.append(str);
                        }
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append((Object) sb);
                    sbLIZ2.append('\n');
                    sbLIZ2.append((Object) sb2);
                    string = C2188811AlT.LIZIZ(sbLIZ2);
                }
            }
        } else {
            string = getContext().getResources().getString(2131820721);
        }
        getTvTitle().setText(string);
        getTvTitle().requestLayout();
    }

    public final void setDesc(String str) {
        if (Intrinsics.LJFF(this.LLJIJIL, str)) {
            return;
        }
        this.LLJIJIL = str;
        if (this.LLILLL == EnumC441770HTz.ESTIMATING) {
            TextSwitcher textSwitcher = this.LLJ;
            if (textSwitcher != null) {
                textSwitcher.setText(getContext().getString(2131820722));
            }
            TextSwitcher textSwitcher2 = this.LLJ;
            if (textSwitcher2 != null) {
                textSwitcher2.requestLayout();
                return;
            }
            return;
        }
        if (str.length() > 0) {
            TextSwitcher textSwitcher3 = this.LLJ;
            if (textSwitcher3 != null) {
                textSwitcher3.setText(str);
            }
            TextSwitcher textSwitcher4 = this.LLJ;
            if (textSwitcher4 != null) {
                textSwitcher4.requestLayout();
            }
        }
    }

    public final void z0(int i) {
        View currentView;
        View nextView;
        TextView textView;
        TextView textView2;
        View bgView = getBgView();
        C19ME c19me = (C19ME) bgView.getLayoutParams();
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ((ViewGroup.MarginLayoutParams) c19me).width = bgView.getMeasuredWidth();
                    c19me.startToStart = -1;
                }
            } else {
                ((ViewGroup.MarginLayoutParams) c19me).width = 0;
                c19me.startToStart = 0;
                getTvTitle().getPaint().setShader(null);
                getTvTitle().invalidate();
                TextSwitcher textSwitcher = this.LLJ;
                if (textSwitcher != null) {
                    currentView = textSwitcher.getCurrentView();
                } else {
                    currentView = null;
                }
                if ((currentView instanceof TuxTextView) && (textView2 = (TextView) currentView) != null) {
                    TextPaint paint = textView2.getPaint();
                    if (paint != null) {
                        paint.setShader(null);
                    }
                    textView2.invalidate();
                }
                TextSwitcher textSwitcher2 = this.LLJ;
                if (textSwitcher2 != null) {
                    nextView = textSwitcher2.getNextView();
                } else {
                    nextView = null;
                }
                if ((nextView instanceof TuxTextView) && (textView = (TextView) nextView) != null) {
                    TextPaint paint2 = textView.getPaint();
                    if (paint2 != null) {
                        paint2.setShader(null);
                    }
                    textView.invalidate();
                }
            }
        } else {
            ((ViewGroup.MarginLayoutParams) c19me).width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));
            c19me.startToStart = -1;
        }
        C786410Ut5.W5(bgView, c19me);
    }

    public final void j0(Function0 function0, boolean z) {
        AnimatorSet animatorSet = this.LLJILJILJ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LLJILJILJ = new AnimatorSet();
        if (z) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LL, "scaleX", 1.0f, 0.3f);
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJIIIZ());
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LL, "scaleY", 1.0f, 0.3f);
            objectAnimatorOfFloat2.setDuration(300L);
            objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LJIIIZ());
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.LL, "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat3.setDuration(300L);
            objectAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
            View view = this.LLILLJJLI;
            if (view != null) {
                C786410Ut5.T4(view, 1.0f);
                C786410Ut5.Ob(view, 0.0f);
                C786410Ut5.pc(view, 0.0f);
            }
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.LLILLJJLI, "scaleX", 0.0f, 1.0f);
            objectAnimatorOfFloat4.setDuration(400L);
            objectAnimatorOfFloat4.setInterpolator(C1619980sG4.LJIIIZ());
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.LLILLJJLI, "scaleY", 0.0f, 1.0f);
            objectAnimatorOfFloat5.setDuration(400L);
            objectAnimatorOfFloat5.setInterpolator(C1619980sG4.LJIIIZ());
            C786410Ut5.T4(getBgView(), 1.0f);
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(getBgView(), "scaleX", 0.0f, 1.0f);
            objectAnimatorOfFloat6.setDuration(400L);
            objectAnimatorOfFloat6.setInterpolator(C1619980sG4.LJIIIZ());
            ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(getBgView(), "scaleY", 0.0f, 1.0f);
            objectAnimatorOfFloat7.setDuration(400L);
            objectAnimatorOfFloat7.setInterpolator(C1619980sG4.LJIIIZ());
            AnimatorSet animatorSet2 = this.LLJILJILJ;
            if (animatorSet2 != null) {
                animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, objectAnimatorOfFloat5, objectAnimatorOfFloat6, objectAnimatorOfFloat7);
            }
        } else {
            ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.LLILLJJLI, "scaleX", 1.0f, 0.0f);
            objectAnimatorOfFloat8.setDuration(200L);
            objectAnimatorOfFloat8.setInterpolator(C1619980sG4.LJIIIZ());
            ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this.LLILLJJLI, "scaleY", 1.0f, 0.0f);
            objectAnimatorOfFloat9.setDuration(200L);
            objectAnimatorOfFloat9.setInterpolator(C1619980sG4.LJIIIZ());
            ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(this.LLILLJJLI, "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat10.setDuration(200L);
            objectAnimatorOfFloat10.setInterpolator(new LinearInterpolator());
            C786410Ut5.T4(this.LL, 1.0f);
            ObjectAnimator objectAnimatorOfFloat11 = ObjectAnimator.ofFloat(this.LL, "scaleX", 0.0f, 1.0f);
            objectAnimatorOfFloat11.setDuration(500L);
            objectAnimatorOfFloat11.setInterpolator(C1619980sG4.LJIIIZ());
            ObjectAnimator objectAnimatorOfFloat12 = ObjectAnimator.ofFloat(this.LL, "scaleY", 0.0f, 1.0f);
            objectAnimatorOfFloat12.setDuration(500L);
            objectAnimatorOfFloat12.setInterpolator(C1619980sG4.LJIILJJIL());
            ObjectAnimator objectAnimatorOfFloat13 = ObjectAnimator.ofFloat(getBgView(), "scaleX", 1.0f, 0.0f);
            objectAnimatorOfFloat13.setDuration(200L);
            objectAnimatorOfFloat13.setInterpolator(C1619980sG4.LJIIIZ());
            ObjectAnimator objectAnimatorOfFloat14 = ObjectAnimator.ofFloat(getBgView(), "scaleY", 1.0f, 0.0f);
            objectAnimatorOfFloat14.setDuration(200L);
            objectAnimatorOfFloat14.setInterpolator(C1619980sG4.LJIIIZ());
            ObjectAnimator objectAnimatorOfFloat15 = ObjectAnimator.ofFloat(getBgView(), "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat15.setDuration(150L);
            objectAnimatorOfFloat15.setInterpolator(new LinearInterpolator());
            AnimatorSet animatorSet3 = this.LLJILJILJ;
            if (animatorSet3 != null) {
                animatorSet3.playTogether(objectAnimatorOfFloat15, objectAnimatorOfFloat13, objectAnimatorOfFloat14, objectAnimatorOfFloat8, objectAnimatorOfFloat9, objectAnimatorOfFloat10, objectAnimatorOfFloat11, objectAnimatorOfFloat12);
            }
        }
        AnimatorSet animatorSet4 = this.LLJILJILJ;
        if (animatorSet4 != null) {
            animatorSet4.addListener(new AAListenerS339S0100000_29(function0, 28));
        }
        AnimatorSet animatorSet5 = this.LLJILJILJ;
        if (animatorSet5 != null) {
            animatorSet5.start();
        }
    }

    public final float n0(TuxTextView tuxTextView, String str) {
        if (getForceStyle()) {
            return getTvTitle().getPaint().measureText(getTvTitle().getText().toString());
        }
        float fMeasureText = tuxTextView.getPaint().measureText(str);
        if (fMeasureText < ((double) C1415610mwR.LIZIZ()) * 0.4d) {
            return fMeasureText;
        }
        return fMeasureText / 2.0f;
    }

    public C19713012Au(SmartImageView smartImageView, View view, Context context) {
        EnumC441770HTz enumC441770HTz;
        int marginEnd;
        super(context, null, 0);
        this.LL = smartImageView;
        this.LLILLJJLI = view;
        if (C545810Lat.LIZ()) {
            enumC441770HTz = EnumC441770HTz.ESTIMATING;
        } else {
            enumC441770HTz = EnumC441770HTz.UPDATE_REMAIN_TIME;
        }
        this.LLILLL = enumC441770HTz;
        this.LLILZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(553));
        this.LLILZIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1096));
        this.LLILZLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1099));
        this.LLIZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1097));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1100));
        this.LLJIJIL = "";
        C786410Ut5.Sd(R.layout.wv, C786410Ut5.ne(context), this);
        C375780EoK.LIZIZ(this, false);
        if (getForceStyle()) {
            final TextSwitcher textSwitcher = (TextSwitcher) findViewById(R.id.xkf);
            textSwitcher.setFactory(new ViewSwitcher.ViewFactory() { // from class: X.0Hyc
                @Override // android.widget.ViewSwitcher.ViewFactory
                public final View makeView() {
                    LinearLayout.LayoutParams layoutParams;
                    TuxTextView tuxTextView = new TuxTextView(textSwitcher.getContext(), null, 6, 0);
                    tuxTextView.setTextColorRes(R.attr.zl);
                    tuxTextView.setTuxFont(81);
                    tuxTextView.setMaxLines(1);
                    ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
                    if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
                        layoutParams.gravity = 8388613;
                    }
                    tuxTextView.setTextAlignment(6);
                    return tuxTextView;
                }
            });
            textSwitcher.setAnimateFirstView(false);
            this.LLJ = textSwitcher;
            C375780EoK.LIZIZ(textSwitcher, true);
            getTvTitle().setMaxLines(1);
            setMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(152)));
            return;
        }
        setMaxWidth((int) (C1415610mwR.LIZIZ() * 0.9f));
        TuxTextView tvTitle = getTvTitle();
        int maxWidth = getMaxWidth();
        ViewGroup.LayoutParams layoutParams = getTextContainer().getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd();
        } else {
            marginEnd = 0;
        }
        int i = maxWidth - marginEnd;
        ViewGroup.LayoutParams layoutParams2 = getTvTitle().getLayoutParams();
        tvTitle.setMaxWidth(i - (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart() : 0));
        getTvTitle().setMaxLines(2);
        getTvTitle().setEllipsize(TextUtils.TruncateAt.END);
    }

    public static final void i0(C19713012Au c19713012Au, C118300cf c118300cf, Function0<Unit> function0) {
        ValueAnimator valueAnimatorE0 = c19713012Au.e0(C418440Gaw.LIZIZ(50), c118300cf.element, true);
        c19713012Au.LLJILJIL = valueAnimatorE0;
        valueAnimatorE0.addListener(new AAListenerS339S0100000_29(function0, 29));
        ValueAnimator valueAnimator = c19713012Au.LLJILJIL;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    public static void p0(C19713012Au c19713012Au, Function0 function0, int i) {
        boolean z;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        if (!c19713012Au.isShowing()) {
            if (function0 != null) {
                function0.invoke();
            }
            c19713012Au.LLJI = false;
        } else {
            if (c19713012Au.getVisibility() != 0 && !c19713012Au.LLJI) {
                return;
            }
            c19713012Au.h0(new AwS430S0200000_29(c19713012Au, (C19713012Au) function0, (Function0<Unit>) 128), false, z);
        }
    }

    public static void s0(TuxTextView tuxTextView, float f, int i) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        TextPaint paint = tuxTextView.getPaint();
        int[] iArr = new int[4];
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.uk, tuxTextView.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        iArr[0] = iIntValue;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.uk, tuxTextView.getContext());
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        iArr[1] = iIntValue2;
        Integer numLIZJ3 = C1308910kAL.LIZJ(i, tuxTextView.getContext());
        if (numLIZJ3 != null) {
            iIntValue3 = numLIZJ3.intValue();
        } else {
            iIntValue3 = 0;
        }
        iArr[2] = iIntValue3;
        Integer numLIZJ4 = C1308910kAL.LIZJ(i, tuxTextView.getContext());
        if (numLIZJ4 != null) {
            iIntValue4 = numLIZJ4.intValue();
        } else {
            iIntValue4 = 0;
        }
        iArr[3] = iIntValue4;
        paint.setShader(new LinearGradient(0.0f, 0.0f, f, 0.0f, iArr, new float[]{0.0f, f / tuxTextView.getWidth(), f / tuxTextView.getWidth(), 1.0f}, Shader.TileMode.CLAMP));
    }

    public final ValueAnimator e0(float f, float f2, boolean z) {
        ValueAnimator valueAnimatorOfFloat;
        if (z) {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
            valueAnimatorOfFloat.setDuration(400L);
            valueAnimatorOfFloat.addListener(new AAListenerS339S0100000_29(this, 32));
            valueAnimatorOfFloat.addListener(new AAListenerS339S0100000_29(this, 31));
        } else {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.addListener(new AAListenerS339S0100000_29(this, 30));
        }
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJIIIZ());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS157S0300000_29(this, new C817403Hg(), new C817403Hg(), 0));
        return valueAnimatorOfFloat;
    }

    public final void h0(final Function0 function0, boolean z, final boolean z2) {
        int marginEnd;
        int marginStart;
        int marginEnd2;
        int marginStart2;
        int marginEnd3;
        int marginEnd4;
        TuxTextView tuxTextView;
        int marginStart3;
        int marginEnd5;
        int marginStart4;
        int marginEnd6;
        int marginEnd7;
        AnimatorSet animatorSet = this.LLJILLL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LLJILLL = new AnimatorSet();
        ValueAnimator valueAnimator = this.LLJILJIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        C375780EoK.LIZIZ(this, true);
        C118300cf c118300cf = new C118300cf();
        int measuredWidth = getBarContainer().getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams = getBgView().getLayoutParams();
        int marginEnd8 = 0;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd();
        } else {
            marginEnd = 0;
        }
        int i = measuredWidth - marginEnd;
        c118300cf.element = i;
        if (z) {
            float fN0 = n0(getTvTitle(), getTvTitle().getText().toString());
            ViewGroup.LayoutParams layoutParams2 = getTvTitle().getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                marginStart = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart();
            } else {
                marginStart = 0;
            }
            float f = fN0 + marginStart;
            ViewGroup.LayoutParams layoutParams3 = getTvTitle().getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                marginEnd2 = ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd();
            } else {
                marginEnd2 = 0;
            }
            float f2 = f + marginEnd2;
            s0(getTvTitle(), f2, R.attr.zi);
            int i2 = c118300cf.element;
            int i3 = (int) f2;
            ViewGroup.LayoutParams layoutParams4 = getTextContainer().getLayoutParams();
            if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                marginStart2 = ((ViewGroup.MarginLayoutParams) layoutParams4).getMarginStart();
            } else {
                marginStart2 = 0;
            }
            int i4 = i3 + marginStart2;
            ViewGroup.LayoutParams layoutParams5 = getTextContainer().getLayoutParams();
            if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                marginEnd3 = ((ViewGroup.MarginLayoutParams) layoutParams5).getMarginEnd();
            } else {
                marginEnd3 = 0;
            }
            int i5 = i4 + marginEnd3;
            ViewGroup.LayoutParams layoutParams6 = getBgView().getLayoutParams();
            if (layoutParams6 instanceof ViewGroup.MarginLayoutParams) {
                marginEnd4 = ((ViewGroup.MarginLayoutParams) layoutParams6).getMarginEnd();
            } else {
                marginEnd4 = 0;
            }
            c118300cf.element = Math.max(i2, i5 - marginEnd4);
            TextSwitcher textSwitcher = this.LLJ;
            View currentView = null;
            if (textSwitcher != null) {
                currentView = textSwitcher.getCurrentView();
            }
            if ((currentView instanceof TuxTextView) && (tuxTextView = (TuxTextView) currentView) != null) {
                float fN02 = n0(tuxTextView, tuxTextView.getText().toString());
                ViewGroup.LayoutParams layoutParams7 = tuxTextView.getLayoutParams();
                if (layoutParams7 instanceof ViewGroup.MarginLayoutParams) {
                    marginStart3 = ((ViewGroup.MarginLayoutParams) layoutParams7).getMarginStart();
                } else {
                    marginStart3 = 0;
                }
                float f3 = fN02 + marginStart3;
                ViewGroup.LayoutParams layoutParams8 = tuxTextView.getLayoutParams();
                if (layoutParams8 instanceof ViewGroup.MarginLayoutParams) {
                    marginEnd5 = ((ViewGroup.MarginLayoutParams) layoutParams8).getMarginEnd();
                } else {
                    marginEnd5 = 0;
                }
                float f4 = f3 + marginEnd5;
                s0(tuxTextView, f4, R.attr.zl);
                int i6 = c118300cf.element;
                int i7 = (int) f4;
                ViewGroup.LayoutParams layoutParams9 = getTextContainer().getLayoutParams();
                if (layoutParams9 instanceof ViewGroup.MarginLayoutParams) {
                    marginStart4 = ((ViewGroup.MarginLayoutParams) layoutParams9).getMarginStart();
                } else {
                    marginStart4 = 0;
                }
                int i8 = i7 + marginStart4;
                ViewGroup.LayoutParams layoutParams10 = getTextContainer().getLayoutParams();
                if (layoutParams10 instanceof ViewGroup.MarginLayoutParams) {
                    marginEnd6 = ((ViewGroup.MarginLayoutParams) layoutParams10).getMarginEnd();
                } else {
                    marginEnd6 = 0;
                }
                int i9 = i8 + marginEnd6;
                ViewGroup.LayoutParams layoutParams11 = getBgView().getLayoutParams();
                if (layoutParams11 instanceof ViewGroup.MarginLayoutParams) {
                    marginEnd7 = ((ViewGroup.MarginLayoutParams) layoutParams11).getMarginEnd();
                } else {
                    marginEnd7 = 0;
                }
                c118300cf.element = Math.max(i6, i9 - marginEnd7);
            }
            if (!z2) {
                View view = this.LLILLJJLI;
                if (view != null) {
                    C786410Ut5.T4(view, 1.0f);
                    C786410Ut5.Ob(view, 1.0f);
                    C786410Ut5.pc(view, 1.0f);
                }
                C786410Ut5.T4(this.LL, 0.0f);
            }
            if (getForceStyle()) {
                C786410Ut5.Ob(getBgView(), 1.0f);
                C786410Ut5.pc(getBgView(), 1.0f);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getBgView(), "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJIIIZ());
                this.LLJILJIL = e0(C418440Gaw.LIZIZ(50), c118300cf.element, true);
                AnimatorSet animatorSet2 = this.LLJILLL;
                if (animatorSet2 != null) {
                    animatorSet2.addListener(new AAListenerS339S0100000_29(function0, 33));
                }
                AnimatorSet animatorSet3 = this.LLJILLL;
                if (animatorSet3 != null) {
                    animatorSet3.playSequentially(objectAnimatorOfFloat, this.LLJILJIL);
                }
                AnimatorSet animatorSet4 = this.LLJILLL;
                if (animatorSet4 != null) {
                    animatorSet4.start();
                    return;
                }
                return;
            }
            int i10 = c118300cf.element;
            int maxWidth = getMaxWidth();
            ViewGroup.LayoutParams layoutParams12 = getBgView().getLayoutParams();
            if (layoutParams12 instanceof ViewGroup.MarginLayoutParams) {
                marginEnd8 = ((ViewGroup.MarginLayoutParams) layoutParams12).getMarginEnd();
            }
            c118300cf.element = Math.min(i10, maxWidth - marginEnd8);
            if (z2) {
                j0(new AwS273S0300000_29(this, (C19713012Au) c118300cf, (C118300cf) function0, (Function0<Unit>) 30), true);
                return;
            } else {
                C786410Ut5.T4(getBgView(), 1.0f);
                i0(this, c118300cf, function0);
                return;
            }
        }
        ValueAnimator valueAnimatorE0 = e0(i, C418440Gaw.LIZIZ(50), false);
        this.LLJILJIL = valueAnimatorE0;
        valueAnimatorE0.addListener(new Animator.AnimatorListener(this) { // from class: X.12Av
            public final /* synthetic */ C19713012Au LLILLJJLI;

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (z2) {
                    this.LLILLJJLI.j0(new AwS573S0100000_29(function0, (Function0<? extends Banner>) 1095), false);
                    return;
                }
                Function0 function02 = function0;
                if (function02 == null) {
                    return;
                }
                function02.invoke();
            }

            {
                this.LLILLJJLI = this;
            }
        });
        AnimatorSet animatorSet5 = this.LLJILLL;
        if (animatorSet5 != null) {
            animatorSet5.playTogether(this.LLJILJIL);
        }
        AnimatorSet animatorSet6 = this.LLJILLL;
        if (animatorSet6 == null) {
            return;
        }
        animatorSet6.start();
    }

    public final void u0(long j, String str, Function0 function0, boolean z) {
        if (isShowing()) {
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            this.LLJI = true;
            setDesc(str);
            LLLLLILLIL(j);
            HandlerHook.viewPost(getTvTitle(), new ARunnableS27S0210000_29(function0, z, this, 2));
        }
    }
}
