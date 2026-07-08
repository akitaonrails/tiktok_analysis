package X;

import Y.AAListenerS328S0100000_17;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ecq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1095940ecq extends AbstractC1096120ed8 {
    public final InterfaceC1095350ebt LIZLLL;
    public final ImageView LJ;
    public final ImageView LJFF;
    public final C16F5 LJI;
    public final C16F5 LJII;
    public final LinearLayout LJIIIIZZ;
    public final LiveIconView LJIIIZ;
    public final C16F5 LJIIJ;
    public final ImageView LJIIJJI;
    public final LinearLayout LJIIL;
    public final Function0<AnimatorSet> LJIILIIL;
    public final ImageView LJIILJJIL;
    public final C16F5 LJIILL;
    public final LiveIconView LJIILLIIL;

    public final void LJIJI(String str, String str2, boolean z, int i, int i2, int i3, Function0<Unit> function0) {
        int iLJIIIZ;
        int width;
        int measuredWidth;
        LinearLayout.LayoutParams layoutParams;
        int iLJIIIZ2;
        int i4;
        InterfaceC1095350ebt interfaceC1095350ebt = this.LIZLLL;
        if (interfaceC1095350ebt == null) {
            return;
        }
        ((C1096340edU) interfaceC1095350ebt).LIZJ();
        int iLJIIIZ3 = C497740JfY.LJIIIZ(R.dimen.ayy);
        if (i3 > 0) {
            iLJIIIZ = (int) C497740JfY.LIZIZ(i3);
        } else {
            iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.ayw);
        }
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        if (i > 0 && i2 > 0) {
            scaleType = ImageView.ScaleType.FIT_XY;
            iLJIIIZ3 = (i * iLJIIIZ) / i2;
        }
        C1143680frq.LJ(this.LJIIJJI, str, str2, scaleType);
        LiveIconView liveIconView = this.LJIILLIIL;
        if (liveIconView != null) {
            if (z) {
                i4 = 8;
            } else {
                i4 = 0;
            }
            C786410Ut5.LLJJIJIL(liveIconView, i4);
        }
        ImageView imageView = this.LJIIJJI;
        ViewGroup.LayoutParams layoutParams2 = null;
        if (imageView != null) {
            layoutParams2 = imageView.getLayoutParams();
        }
        if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
            if (z) {
                iLJIIIZ2 = C497740JfY.LJIIIZ(R.dimen.az0);
            } else {
                iLJIIIZ2 = 0;
            }
            layoutParams.setMarginStart(iLJIIIZ2);
            layoutParams.width = iLJIIIZ3;
            layoutParams.height = iLJIIIZ;
            C786410Ut5.c6(this.LJIIJJI, layoutParams);
        }
        LinearLayout linearLayout = this.LJIIIIZZ;
        if (linearLayout != null) {
            C786410Ut5.LJZL(4, linearLayout);
            linearLayout.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        ViewGroup viewGroup = ((C1096340edU) this.LIZLLL).LJ;
        if (viewGroup != null) {
            width = viewGroup.getWidth();
        } else {
            width = 0;
        }
        LinearLayout linearLayout2 = this.LJIIIIZZ;
        if (linearLayout2 != null) {
            measuredWidth = linearLayout2.getMeasuredWidth();
        } else {
            measuredWidth = 0;
        }
        LinearLayout linearLayout3 = this.LJIIIIZZ;
        if (linearLayout3 != null) {
            C786410Ut5.LJZL(8, linearLayout3);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorLJIIJ = LJIIJ(width, measuredWidth);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LJIIIIZZ, (Property<LinearLayout, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(AbstractC1096120ed8.LJIIL(5));
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setStartDelay(200L);
        objectAnimatorOfFloat.addListener(new AAListenerS328S0100000_17(this, 49));
        ObjectAnimator objectAnimatorLIZ = AbstractC1096120ed8.LIZ(this.LJFF, View.ALPHA, 1.0f, 0.0f);
        objectAnimatorLIZ.setDuration(200L);
        objectAnimatorLIZ.addListener(new AAListenerS328S0100000_17(this, 50));
        ObjectAnimator objectAnimatorLIZ2 = AbstractC1096120ed8.LIZ(this.LJI, View.ALPHA, 1.0f, 0.0f);
        objectAnimatorLIZ2.setDuration(200L);
        objectAnimatorLIZ2.addListener(new AAListenerS328S0100000_17(this, 51));
        animatorSet.playTogether(valueAnimatorLJIIJ, objectAnimatorOfFloat, objectAnimatorLIZ, objectAnimatorLIZ2);
        AnimatorSet animatorSet2 = new AnimatorSet();
        ValueAnimator valueAnimatorLJIIJ2 = LJIIJ(measuredWidth, width);
        ObjectAnimator objectAnimatorLIZ3 = AbstractC1096120ed8.LIZ(this.LJFF, View.ALPHA, 0.0f, 1.0f);
        objectAnimatorLIZ3.setDuration(200L);
        objectAnimatorLIZ3.addListener(new AAListenerS328S0100000_17(this, 52));
        ObjectAnimator objectAnimatorLIZ4 = AbstractC1096120ed8.LIZ(this.LJI, View.ALPHA, 0.0f, 1.0f);
        objectAnimatorLIZ4.setDuration(200L);
        objectAnimatorLIZ4.addListener(new AAListenerS328S0100000_17(this, 53));
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LJIIIIZZ, (Property<LinearLayout, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat2.setInterpolator(AbstractC1096120ed8.LJIIL(5));
        objectAnimatorOfFloat2.setDuration(200L);
        objectAnimatorOfFloat2.addListener(new AAListenerS328S0100000_17(this, 54));
        animatorSet2.setStartDelay(2500L);
        animatorSet2.playTogether(valueAnimatorLJIIJ2, objectAnimatorLIZ3, objectAnimatorLIZ4, objectAnimatorOfFloat2);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.addListener(new AAListenerS328S0100000_17(function0, 55));
        animatorSet3.playTogether(animatorSet, animatorSet2);
        animatorSet3.start();
    }

    public C1095940ecq(InterfaceC1095350ebt interfaceC1095350ebt, ImageView imageView, ImageView imageView2, C16F5 c16f5, C16F5 c16f52, LinearLayout linearLayout, LiveIconView liveIconView, C16F5 c16f53, ImageView imageView3, C1295960jpS c1295960jpS, LinearLayout linearLayout2, C1095980ecu c1095980ecu, BPEAHandler bPEAHandler) {
        ImageView imageView4;
        C16F5 c16f54;
        super(interfaceC1095350ebt, c1295960jpS, bPEAHandler);
        this.LIZLLL = interfaceC1095350ebt;
        this.LJ = imageView;
        this.LJFF = imageView2;
        this.LJI = c16f5;
        this.LJII = c16f52;
        this.LJIIIIZZ = linearLayout;
        this.LJIIIZ = liveIconView;
        this.LJIIJ = c16f53;
        this.LJIIJJI = imageView3;
        this.LJIIL = linearLayout2;
        this.LJIILIIL = c1095980ecu;
        if (linearLayout2 != null) {
            imageView4 = (ImageView) linearLayout2.findViewById(R.id.lgt);
        } else {
            imageView4 = null;
        }
        this.LJIILJJIL = imageView4;
        if (linearLayout2 != null) {
            c16f54 = (C16F5) linearLayout2.findViewById(R.id.zln);
        } else {
            c16f54 = null;
        }
        this.LJIILL = c16f54;
        this.LJIILLIIL = linearLayout != null ? (LiveIconView) linearLayout.findViewById(R.id.wpp) : null;
    }
}
