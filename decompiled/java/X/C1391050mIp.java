package X;

import Y.AUListenerS262S0100000_12;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.bytedance.tux.widget.RadiusLayout;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0mIp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1391050mIp {
    public static final C0HU6 LIZJ = new C0HU6(new C1342130l1v(631.65f), new C1342130l1v(50.27f));
    public static final List<C19746412Nq> LIZLLL = C1697810uHb.LJIIJJI(new C19746412Nq("ScaleX", new C0HIW(1.1f, 1.0f)), new C19746412Nq("ScaleY", new C0HIX(1.1f, 1.0f)), new C19746412Nq("Alpha_Show", new C0HUY(0.0f, 1.0f)));
    public static final List<C19746412Nq> LJ = Collections.singletonList(new C19746412Nq("Pad_Show_Alpha", new C0HUY(0.0f, 1.0f)));
    public static final List<C19746412Nq> LJFF = Collections.singletonList(new C19746412Nq("Alpha_Exit", new C0HUY(1.0f, 0.0f)));
    public static final C1776900wLA LJI = new C1776900wLA(new C1342130l1v(0.0f), new C1342130l1v(0.0f), new C1342130l1v(1.0f), new C1342130l1v(1.0f), 150);
    public static final List<C19746412Nq> LJII = Collections.singletonList(new C19746412Nq("Alpha_Show", new C0HUY(0.0f, 1.0f)));
    public boolean LIZ;
    public boolean LIZIZ;

    public static ValueAnimator LIZ(Function1 function1) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(C1397600mTO.LJJII, 0.0f);
        valueAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.33f, 0.86f, 0.2f, 1.0f));
        valueAnimatorOfFloat.setDuration(350L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS262S0100000_12(function1, 53));
        return valueAnimatorOfFloat;
    }

    public final void LIZJ(Context context, View view) {
        C19746312Np c19746312Np;
        if (C07XO.LIZ) {
            c19746312Np = new C19746312Np(EnumC19746112Nn.BEZIER, LJI, LJII);
        } else {
            c19746312Np = new C19746312Np(EnumC19746112Nn.SPRING, LIZJ, LIZLLL);
        }
        new C21647019ng(context, view, c19746312Np, this.LIZIZ).LJI(true);
    }

    public final void LIZLLL(Context context, RadiusLayout radiusLayout, C338760DPu c338760DPu) {
        C19746312Np c19746312Np;
        if (!C497820Jfg.LJ(context) && !C497820Jfg.LIZLLL(context)) {
            LIZJ(context, radiusLayout);
            return;
        }
        if (C07XO.LIZ) {
            c19746312Np = new C19746312Np(EnumC19746112Nn.BEZIER, LJI, LJ);
        } else {
            c19746312Np = new C19746312Np(EnumC19746112Nn.SPRING, LIZJ, LJ);
        }
        new C21647019ng(context, c338760DPu, c19746312Np, this.LIZIZ).LJI(true);
        if (C07XO.LIZ) {
            return;
        }
        new C21647019ng(context, radiusLayout, new C19746312Np(EnumC19746112Nn.SPRING, LIZJ, Collections.singletonList(new C19746412Nq("Pad_Show_Y", new C0HV5(C497820Jfg.LIZ(context), 0.0f)))), this.LIZIZ).LJI(true);
    }

    public final void LIZIZ(Context context, View view, Function1<? super Float, Unit> function1, final Function0<Unit> function0) {
        C19746312Np c19746312Np;
        if (this.LIZ) {
            return;
        }
        final ValueAnimator valueAnimatorLIZ = LIZ(function1);
        if (C07XO.LIZ) {
            c19746312Np = new C19746312Np(EnumC19746112Nn.BEZIER, LJI, LJFF);
        } else {
            c19746312Np = new C19746312Np(EnumC19746112Nn.SPRING, LIZJ, LJFF);
        }
        C21647019ng c21647019ng = new C21647019ng(context, view, c19746312Np, this.LIZIZ);
        c21647019ng.LIZJ("Alpha_Exit", new InterfaceC21641019mi() { // from class: X.0mIr
            @Override // X.InterfaceC21641019mi
            public final void LIZIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
            }

            @Override // X.InterfaceC21641019mi
            public final void LIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
                this.LIZ.LIZ = false;
                ValueAnimator valueAnimator = valueAnimatorLIZ;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
            }
        });
        c21647019ng.LJI(true);
        valueAnimatorLIZ.start();
        this.LIZ = true;
    }
}
