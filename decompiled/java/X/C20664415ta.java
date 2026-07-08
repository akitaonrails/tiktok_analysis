package X;

import Y.ACListenerS165S0100000_31;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15ta, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20664415ta extends FrameLayout implements InterfaceC20672015uo {
    public C20730716Af LL;
    public FrameLayout LLILLJJLI;
    public C1908500zlQ LLILLL;
    public InterfaceC20665015tg LLILZ;
    public InnerPushMessage LLILZIL;
    public final CountDownTimerC20747916Gv LLILZLL;
    public final int LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;

    @Override // X.InterfaceC20672015uo
    public void setShowDuration(long j) {
    }

    @Override // X.InterfaceC20672015uo
    public final void LIZJ() {
        this.LLILZLL.cancel();
        this.LLILZLL.start();
    }

    @Override // X.InterfaceC20672015uo
    public final void onShow() {
        if (C20731216Ak.LIZ()) {
            C418440Gaw.LIZIZ(-76);
            C21647019ng c21647019ng = new C21647019ng(getContext(), this, new C19746312Np(EnumC19746112Nn.SPRING, new C0HU6(new C1342130l1v(322.27f), new C1342130l1v(35.9f)), Collections.singletonList(new C19746412Nq("DMPushLayout", new C0HV5(C418440Gaw.LIZIZ(-76) - this.LLIZ, C418440Gaw.LIZIZ(0))))), false);
            this.LLIZLLLIL = true;
            this.LLJ = false;
            c21647019ng.LJI(true);
            this.LLILZLL.start();
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "translationY", C418440Gaw.LIZIZ(-76) - this.LLIZ, 0.0f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJIILIIL());
        C786410Ut5.Pd(objectAnimatorOfFloat);
        this.LLIZLLLIL = true;
        this.LLJ = false;
        this.LLILZLL.start();
    }

    public InnerPushMessage getMessage() {
        return this.LLILZIL;
    }

    public C20664415ta(Context context) {
        int i;
        View viewInflate;
        FrameLayout frameLayout;
        super(context, null, 0);
        this.LLILZLL = new CountDownTimerC20747916Gv(this, 2);
        this.LLIZ = C497820Jfg.LIZJ(context);
        Activity activityLIZ = C1388190mED.LIZ(getContext());
        if (C296900BkO.LIZ()) {
            i = R.layout.ct5;
        } else {
            i = R.layout.ct9;
        }
        if (C20674015v8.LIZIZ() && C20673215v0.LIZ(i, getContext()) && activityLIZ != null) {
            viewInflate = C20673215v0.LIZLLL(i, activityLIZ, this, true);
        } else if (C20674015v8.LIZJ() && activityLIZ != null) {
            viewInflate = C21146717pB.LIZIZ(activityLIZ, i, this, true);
        } else {
            viewInflate = FrameLayout.inflate(getContext(), i, this);
        }
        C20730716Af c20730716Af = (C20730716Af) viewInflate.findViewById(R.id.si2);
        this.LL = c20730716Af;
        C2271391DvN.LIZ(c20730716Af, (C1A5L) C2271381DvM.LLLJIL.getValue());
        C20730716Af c20730716Af2 = this.LL;
        if (c20730716Af2 != null) {
            c20730716Af2.setDismissAction(new AwS575S0100000_31(this, 758));
        }
        C20730716Af c20730716Af3 = this.LL;
        if (c20730716Af3 != null) {
            c20730716Af3.setOnRightAreaClick(new AwS575S0100000_31(this, 1468));
        }
        this.LLILLJJLI = (FrameLayout) viewInflate.findViewById(R.id.tp9);
        this.LLILLL = new C1908500zlQ(this.LLILLJJLI);
        if (Build.VERSION.SDK_INT < 28 && (frameLayout = this.LLILLJJLI) != null) {
            frameLayout.setLayerType(1, null);
        }
        FrameLayout frameLayout2 = this.LLILLJJLI;
        if (frameLayout2 != null) {
            frameLayout2.setBackground(this.LLILLL);
        }
    }

    public final void LIZ(View view) {
        C20665215ti c20665215ti;
        if ((view instanceof C20665215ti) && (c20665215ti = (C20665215ti) view) != null) {
            FrameLayout frameLayout = this.LLILLJJLI;
            if (frameLayout != null) {
                C786410Ut5.LJJJJIZL(frameLayout);
            }
            FrameLayout frameLayout2 = this.LLILLJJLI;
            if (frameLayout2 != null) {
                frameLayout2.addView(view);
            }
            C20730716Af c20730716Af = this.LL;
            if (c20730716Af != null) {
                c20730716Af.setRightAreaView(c20665215ti.getRightContainer());
            }
            C20730716Af c20730716Af2 = this.LL;
            if (c20730716Af2 != null) {
                c20730716Af2.setInnerPushView(c20665215ti.getContentContainer());
            }
            FrameLayout frameLayout3 = this.LLILLJJLI;
            if (frameLayout3 != null) {
                C786410Ut5.O7(frameLayout3, new ACListenerS165S0100000_31(c20665215ti, 75));
                return;
            }
            return;
        }
        C20730716Af c20730716Af3 = this.LL;
        if (c20730716Af3 != null) {
            c20730716Af3.setRightAreaView(view.findViewById(R.id.kox));
        }
        C20730716Af c20730716Af4 = this.LL;
        if (c20730716Af4 != null) {
            c20730716Af4.setInnerPushView((ViewGroup) view.findViewById(R.id.koo));
        }
        FrameLayout frameLayout4 = this.LLILLJJLI;
        if (frameLayout4 == null) {
            return;
        }
        C786410Ut5.O7(frameLayout4, new ACListenerS165S0100000_31(view, 76));
    }

    public final void LIZIZ(final Function0<Unit> function0) {
        C19290510dT.LIZIZ("DMPushLayout", "hideAnimation");
        if (C20731216Ak.LIZ()) {
            final float f = (-getMeasuredHeight()) - this.LLIZ;
            C21647019ng c21647019ng = new C21647019ng(getContext(), this, new C19746312Np(EnumC19746112Nn.SPRING, new C0HU6(new C1342130l1v(322.27f), new C1342130l1v(35.9f)), Collections.singletonList(new C19746412Nq("DMPushLayout", new C0HV5(C418440Gaw.LIZIZ(0), C418440Gaw.LIZIZ(Float.valueOf(f)))))), false);
            c21647019ng.LIZJ("DMPushLayout", new InterfaceC21641019mi() { // from class: X.15tX
                @Override // X.InterfaceC21641019mi
                public final void LIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
                    C20664415ta c20664415ta = this;
                    c20664415ta.LLIZLLLIL = false;
                    c20664415ta.LLJ = false;
                    Function0<Unit> function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                    }
                }

                @Override // X.InterfaceC21641019mi
                public final void LIZIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
                    float value = interfaceC1844880y6o.getValue();
                    Math.abs(value / C418440Gaw.LIZIZ(Float.valueOf(f)));
                    if (value >= f) {
                        C20664415ta c20664415ta = this;
                        c20664415ta.LLIZLLLIL = false;
                        c20664415ta.LLJ = false;
                    }
                }
            });
            this.LLJ = true;
            c21647019ng.LJI(true);
            return;
        }
        final float f2 = (-getMeasuredHeight()) - this.LLIZ;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "translationY", 0.0f, f2);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJIILIIL());
        objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.15tY
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Float f3;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue instanceof Float) {
                    f3 = (Float) animatedValue;
                } else {
                    f3 = null;
                }
                if (Intrinsics.LIZLLL(f3, f2)) {
                    Function0<Unit> function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                    }
                    C20664415ta c20664415ta = this;
                    c20664415ta.LLIZLLLIL = false;
                    c20664415ta.LLJ = false;
                }
            }
        });
        this.LLJ = true;
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    @Override // X.InterfaceC20672015uo
    public void setInnerPushLayoutRadius(int i) {
        C1908500zlQ c1908500zlQ = this.LLILLL;
        if (c1908500zlQ != null) {
            c1908500zlQ.LIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        }
    }

    @Override // X.InterfaceC20672015uo
    public void setInnerPushNotifier(InterfaceC20665015tg interfaceC20665015tg) {
        this.LLILZ = interfaceC20665015tg;
    }

    @Override // X.InterfaceC20672015uo
    public void setMessage(InnerPushMessage innerPushMessage) {
        this.LLILZIL = innerPushMessage;
    }
}
