package X;

import Y.AAListenerS329S0100000_18;
import Y.AAListenerS67S0110000_18;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.res.Configuration;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.Window;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0hF2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1196500hF2 extends C214906198m {
    public static final int LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
    public final Activity LL;
    public final View LLILLJJLI;
    public Function0<Unit> LLILLL;
    public Function0<Unit> LLILZ;
    public Function0<Unit> LLILZIL;
    public final ViewOnClickListenerC1203580hQS LLILZLL;
    public final C1196510hF3 LLIZ;

    @Override // X.C214906198m, android.widget.PopupWindow
    public final void dismiss() {
        this.LLILZLL.animate().cancel();
        LJJIIJZLJL(false).addListener(new AAListenerS329S0100000_18(this, 4));
        C487280J9a.LIZJ(this.LLIZ);
        PopupManager.LIZJ(C1261830iwP.class);
    }

    public final void show() {
        this.LLILZLL.measure(0, 0);
        showAtLocation(this.LLILLJJLI, 80, 0, LLIZLLLIL);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJI(this);
        C787990Uvd.LIZ.getClass();
        C994003uc.LIZ();
        LJJIIJZLJL(true);
    }

    public final Animator LJJIIJZLJL(boolean z) {
        float f;
        float f2;
        float f3;
        long j;
        float f4 = 0.0f;
        if (z) {
            f2 = LLIZLLLIL;
            f = 0.0f;
        } else {
            f = LLIZLLLIL;
            f2 = 0.0f;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.LLILZLL, "translationY", f2, f).setDuration(348L);
        duration.setInterpolator(new InterpolatorC448120Hhi(1.71f));
        ViewOnClickListenerC1203580hQS viewOnClickListenerC1203580hQS = this.LLILZLL;
        float[] fArr = new float[2];
        if (z) {
            f3 = 0.0f;
        } else {
            f3 = 1.0f;
        }
        fArr[0] = f3;
        if (z) {
            f4 = 1.0f;
        }
        fArr[1] = f4;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewOnClickListenerC1203580hQS, "alpha", fArr);
        if (z) {
            j = 150;
        } else {
            j = 100;
        }
        ObjectAnimator duration2 = objectAnimatorOfFloat.setDuration(j);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration2, duration);
        animatorSet.addListener(new AAListenerS67S0110000_18(this, z, 4));
        animatorSet.start();
        return animatorSet;
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [X.0hF3] */
    public C1196500hF2(Activity activity, EnumC1169600gXe enumC1169600gXe) {
        View decorView;
        String string;
        String strLIZIZ;
        this.LL = activity;
        Window window = activity.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            this.LLILLJJLI = decorView;
            InterfaceC1203590hQT interfaceC1203590hQT = new InterfaceC1203590hQT() { // from class: X.0gYA
                @Override // X.InterfaceC1203590hQT
                public final void LIZ() {
                    Function0<Unit> function0 = this.LIZ.LLILZ;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    this.LIZ.dismiss();
                }

                @Override // X.InterfaceC1203590hQT
                public final void LIZIZ() {
                    Function0<Unit> function0 = this.LIZ.LLILLL;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            };
            ViewOnClickListenerC1203580hQS viewOnClickListenerC1203580hQS = new ViewOnClickListenerC1203580hQS(activity, null);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_camera_person_double_star_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            viewOnClickListenerC1203580hQS.setIconImageResource(c419910GdJ.LIZ(activity));
            EnumC1169600gXe enumC1169600gXe2 = EnumC1169600gXe.ONLY_NICKNAME;
            if (enumC1169600gXe == enumC1169600gXe2) {
                string = viewOnClickListenerC1203580hQS.getContext().getString(2131828475);
            } else {
                string = viewOnClickListenerC1203580hQS.getContext().getString(2131828474);
            }
            if (enumC1169600gXe == enumC1169600gXe2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(viewOnClickListenerC1203580hQS.getContext().getString(2131828477));
                sbLIZ.append(' ');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(viewOnClickListenerC1203580hQS.getContext().getString(2131828476));
                sbLIZ2.append(' ');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(strLIZIZ);
            sb.append(string);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb);
            int iLJJJJI = a0.LJJJJI(spannableStringBuilder.toString(), string, 0, 6);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, activity);
            if (numLIZJ != null) {
                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(numLIZJ.intValue()), iLJJJJI, string.length() + iLJJJJI, 34);
            }
            C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), iLJJJJI, string.length() + iLJJJJI, 34);
            viewOnClickListenerC1203580hQS.setTitleText(spannableStringBuilder);
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = R.raw.icon_x_mark_small;
            c419910GdJ2.LJ = Integer.valueOf(R.attr.a1p);
            viewOnClickListenerC1203580hQS.setCloseImage(c419910GdJ2.LIZ(activity));
            viewOnClickListenerC1203580hQS.setNoticeBackgroundColor(0);
            View viewFindViewById = viewOnClickListenerC1203580hQS.findViewById(R.id.pcz);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.bx);
            viewFindViewById.setBackground(c384050F3z.LIZ(viewOnClickListenerC1203580hQS.getContext()));
            viewOnClickListenerC1203580hQS.setElevation(2.0f);
            setContentView(viewOnClickListenerC1203580hQS);
            C786410Ut5.x3(getContentView().getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1208840hYw(this, 2));
            this.LLILZLL = viewOnClickListenerC1203580hQS;
            this.LLIZ = new InterfaceC487330J9f() { // from class: X.0hF3
                @Override // X.InterfaceC487330J9f
                public final void onConfigurationChanged(Activity activity2, Configuration configuration) {
                    ViewOnClickListenerC1203580hQS viewOnClickListenerC1203580hQS2 = this.LL.LLILZLL;
                    viewOnClickListenerC1203580hQS2.setPadding(0, viewOnClickListenerC1203580hQS2.getPaddingTop(), viewOnClickListenerC1203580hQS2.getPaddingRight(), viewOnClickListenerC1203580hQS2.getPaddingBottom());
                }
            };
            setWidth(-1);
            setHeight(-2);
            viewOnClickListenerC1203580hQS.setOnInternalClickListener(interfaceC1203590hQT);
            return;
        }
        throw new IllegalStateException("Bad activity");
    }
}
