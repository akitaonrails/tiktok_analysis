package X;

import Y.AUListenerS265S0100000_16;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0uoN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class DialogC1718130uoN extends DialogC19728412Gs {
    public final Context LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public C1295960jpS LLILZ;
    public View LLILZIL;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        C1295960jpS c1295960jpS = (C1295960jpS) findViewById(R.id.nr8);
        if (c1295960jpS != null) {
            c1295960jpS.pauseAnimation();
        }
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        C1295960jpS c1295960jpS = this.LLILZ;
        if (c1295960jpS != null) {
            c1295960jpS.setAnimationFromUrl(this.LLILLJJLI);
            c1295960jpS.playAnimation();
        }
    }

    public final void LJJLIIIJLLLLLLLZ(final AwS570S0100000_26 awS570S0100000_26) {
        final int measuredHeight;
        View viewFindViewById;
        C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchToSuccess");
        sbLIZ.append(" invoke");
        c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ));
        if (TextUtils.isEmpty(this.LLILLL)) {
            C1708720uZC c1708720uZCLIZ2 = C1708710uZB.LIZ("Cashier");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("switchToSuccess");
            sbLIZ2.append(" successPath is empty, just return");
            c1708720uZCLIZ2.LIZ(4, C2188811AlT.LIZIZ(sbLIZ2));
            awS570S0100000_26.invoke();
            return;
        }
        View view = this.LLILZIL;
        View viewFindViewById2 = null;
        if (view != null) {
            viewFindViewById2 = view.findViewById(R.id.o9n);
        }
        final int measuredWidth = 0;
        if (viewFindViewById2 != null) {
            measuredHeight = viewFindViewById2.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        View view2 = this.LLILZIL;
        if (view2 != null && (viewFindViewById = view2.findViewById(R.id.o9n)) != null) {
            measuredWidth = viewFindViewById.getMeasuredWidth();
        }
        C1708720uZC c1708720uZCLIZ3 = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("switchToSuccess");
        sbLIZ3.append(" initH: ");
        sbLIZ3.append(measuredHeight);
        sbLIZ3.append(", initW: ");
        sbLIZ3.append(measuredWidth);
        c1708720uZCLIZ3.LIZ(4, C2188811AlT.LIZIZ(sbLIZ3));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS265S0100000_16(this, 60));
        valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: X.0bzF
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
                DialogC1718130uoN dialogC1718130uoN = this.LL;
                C1295960jpS c1295960jpS = dialogC1718130uoN.LLILZ;
                if (c1295960jpS != null) {
                    c1295960jpS.setAnimationFromUrl(dialogC1718130uoN.LLILLL);
                }
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat2.setDuration(300L);
                final DialogC1718130uoN dialogC1718130uoN2 = this.LL;
                final int i = measuredHeight;
                final int i2 = measuredWidth;
                valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0bzE
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Float f;
                        View viewFindViewById3;
                        ViewGroup.LayoutParams layoutParams;
                        View viewFindViewById4;
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
                            DialogC1718130uoN dialogC1718130uoN3 = dialogC1718130uoN2;
                            int i3 = i;
                            int i4 = i2;
                            float fFloatValue = f.floatValue();
                            C1295960jpS c1295960jpS2 = dialogC1718130uoN3.LLILZ;
                            if (c1295960jpS2 != null) {
                                C786410Ut5.f5(c1295960jpS2, fFloatValue);
                            }
                            int i5 = (int) ((40 * fFloatValue) + i3);
                            View view3 = dialogC1718130uoN3.LLILZIL;
                            if (view3 != null && (viewFindViewById3 = view3.findViewById(R.id.o9n)) != null && (layoutParams = viewFindViewById3.getLayoutParams()) != null) {
                                layoutParams.width = i4;
                                layoutParams.height = i5;
                                View view4 = dialogC1718130uoN3.LLILZIL;
                                if (view4 != null && (viewFindViewById4 = view4.findViewById(R.id.o9n)) != null) {
                                    viewFindViewById4.requestLayout();
                                }
                            }
                        }
                    }
                });
                valueAnimatorOfFloat2.start();
                C1295960jpS c1295960jpS2 = this.LL.LLILZ;
                if (c1295960jpS2 != null) {
                    c1295960jpS2.playAnimation();
                }
                C786410Ut5.LJLIIL(500L, new BPEAHandler(Looper.getMainLooper()), new RunnableC514801zW(awS570S0100000_26, (Function0<Unit>) 182));
            }
        });
        valueAnimatorOfFloat.start();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        TextView textView;
        View viewFindViewById;
        super.onCreate(bundle);
        View viewSd = C786410Ut5.Sd(R.layout.dvt, C786410Ut5.ne(this.LL), null);
        this.LLILZIL = viewSd;
        if (viewSd != null && (viewFindViewById = viewSd.findViewById(R.id.o9n)) != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.uj, this.LL);
            c384050F3z.LIZJ = Float.valueOf(C1722120uuo.LIZJ(12));
            viewFindViewById.setBackground(c384050F3z.LIZ(this.LL));
        }
        View view = this.LLILZIL;
        if (view != null && (textView = (TextView) view.findViewById(R.id.message_tv)) != null) {
            textView.setText(2131857115);
        }
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setDimAmount(0.0f);
        }
        View view2 = this.LLILZIL;
        if (view2 != null) {
            setContentView(view2);
        }
        this.LLILZ = (C1295960jpS) findViewById(R.id.nr8);
    }

    public DialogC1718130uoN(Context context, String str) {
        super(context);
        this.LL = context;
        this.LLILLJJLI = str;
        this.LLILLL = null;
    }
}
