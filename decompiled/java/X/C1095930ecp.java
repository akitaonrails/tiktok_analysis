package X;

import Y.AAListenerS139S0300000_17;
import Y.AAListenerS269S0200000_17;
import Y.AAListenerS328S0100000_17;
import Y.AAListenerS90S0101000_17;
import Y.ALAdapterS12S0200000_17;
import Y.ALAdapterS13S0100000_17;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0ecp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1095930ecp extends AbstractC1096120ed8 {
    public static final /* synthetic */ int LJJJJ = 0;
    public final InterfaceC1095350ebt LIZLLL;
    public final ViewGroup LJ;
    public final C1091250eVH LJFF;
    public final ConstraintLayout LJI;
    public final ConstraintLayout LJII;
    public final FrameLayout LJIIIIZZ;
    public final C1324720kZq LJIIIZ;
    public C16F5 LJIIJ;
    public C16F5 LJIIJJI;
    public final FrameLayout LJIIL;
    public final C430340Gu8 LJIILIIL;
    public final C430340Gu8 LJIILJJIL;
    public final C1324720kZq LJIILL;
    public final C1324720kZq LJIILLIIL;
    public final ImageView LJIIZILJ;
    public final C16F5 LJIJ;
    public final ImageView LJIJI;
    public final C1295960jpS LJIJJ;
    public final C16F5 LJIJJLI;
    public final C430340Gu8 LJIL;
    public final C1295960jpS LJJ;
    public final C1295960jpS LJJI;
    public final ImageView LJJIFFI;
    public final ImageView LJJII;
    public final ImageView LJJIII;
    public final C16F5 LJJIIJ;
    public final C16F5 LJJIIJZLJL;
    public final LinearLayout LJJIIZ;
    public final LinearLayout LJJIIZI;
    public final ImageView LJJIJ;
    public final View LJJIJIIJI;
    public final LinearLayout LJJIJIIJIL;
    public final Function0<AnimatorSet> LJJIJIL;
    public final Handler LJJIJL;
    public final Room LJJIJLIJ;
    public final C11NJ LJJIL;
    public final ImageView LJJIZ;
    public final C16F5 LJJJ;
    public final LiveIconView LJJJI;
    public C1143920fsE LJJJIL;

    public static String LJIJI(long j) {
        return String.valueOf(C19374310qz.LIZ(Long.valueOf(j), new C19348710mr(EnumC19356510o7.DECIMAL, EnumC19356310o5.COMPACT, null, 12), null, 1, 20));
    }

    public final int LJIJJ(long j) {
        Integer numValueOf;
        int measuredWidth;
        int iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.ant);
        C16F5 c16f5 = this.LJJIIJ;
        if (c16f5 != null) {
            c16f5.setText(LJIJI(j));
        }
        LinearLayout linearLayout = this.LJJIIZ;
        if (linearLayout != null) {
            numValueOf = Integer.valueOf(linearLayout.getVisibility());
        } else {
            numValueOf = null;
        }
        LinearLayout linearLayout2 = this.LJJIIZ;
        if (linearLayout2 != null) {
            C786410Ut5.LJZL(4, linearLayout2);
        }
        LinearLayout linearLayout3 = this.LJJIIZ;
        int iIntValue = 0;
        if (linearLayout3 != null) {
            linearLayout3.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        LinearLayout linearLayout4 = this.LJJIIZ;
        if (linearLayout4 != null) {
            measuredWidth = linearLayout4.getMeasuredWidth();
        } else {
            measuredWidth = 0;
        }
        LinearLayout linearLayout5 = this.LJJIIZ;
        if (linearLayout5 != null) {
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            }
            C786410Ut5.LJZL(iIntValue, linearLayout5);
        }
        return measuredWidth + iLJIIIZ + ((int) C497740JfY.LIZIZ(16.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ObjectAnimator[] LJIJJLI(Function0<Unit> function0) {
        ObjectAnimator objectAnimatorLIZ = AbstractC1096120ed8.LIZ(this.LJIJI, View.ALPHA, 1.0f, 0.0f);
        objectAnimatorLIZ.setDuration(200L);
        objectAnimatorLIZ.setStartDelay(100L);
        Pair pairLIZIZ = AbstractC1096120ed8.LIZIZ(1.0f, 0.0f, 300L, 0L, this.LJIJI);
        ((Animator) pairLIZIZ.getFirst()).addListener(new ALAdapterS12S0200000_17(this, function0, 43));
        return new ObjectAnimator[]{objectAnimatorLIZ, pairLIZIZ.getFirst(), pairLIZIZ.getSecond()};
    }

    public final void LJJIFFI(Function0<Unit> function0) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LJIIIZ, (Property<C1324720kZq, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LJIILIIL, (Property<C430340Gu8, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(200L);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.LJIILIIL, (Property<C430340Gu8, Float>) View.ALPHA, 1.0f, 1.0f);
        objectAnimatorOfFloat3.setDuration(1200L);
        objectAnimatorOfFloat3.setStartDelay(200L);
        objectAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat3.addListener(new AAListenerS328S0100000_17(function0, 58));
        AnimatorSet animatorSetInvoke = this.LJJIJIL.invoke();
        if (animatorSetInvoke != null) {
            animatorSetInvoke.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
            animatorSetInvoke.start();
        }
    }

    public final void LJJIIJ(boolean z) {
        ViewParent parent;
        C1096060ed2.LIZ(this.LJ, z);
        ViewGroup viewGroup = this.LJ;
        ViewGroup viewGroup2 = null;
        if (viewGroup != null) {
            parent = viewGroup.getParent();
        } else {
            parent = null;
        }
        if (parent instanceof ViewGroup) {
            viewGroup2 = (ViewGroup) parent;
        }
        C1096060ed2.LIZ(viewGroup2, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ObjectAnimator[] LJIL(long j, Function0<Unit> function0) {
        ObjectAnimator objectAnimatorLIZ = AbstractC1096120ed8.LIZ(this.LJIJI, View.ALPHA, 0.0f, 1.0f);
        objectAnimatorLIZ.setDuration(50L);
        objectAnimatorLIZ.setStartDelay(j);
        objectAnimatorLIZ.addListener(new ALAdapterS13S0100000_17(this, 110));
        Pair pairLIZIZ = AbstractC1096120ed8.LIZIZ(1.0f, 1.3f, 200L, j, this.LJIJI);
        Pair pairLIZIZ2 = AbstractC1096120ed8.LIZIZ(1.3f, 1.0f, 200L, j + 200, this.LJIJI);
        ((Animator) pairLIZIZ2.getFirst()).addListener(new ALAdapterS13S0100000_17(function0, 111));
        return new ObjectAnimator[]{objectAnimatorLIZ, pairLIZIZ.getFirst(), pairLIZIZ.getSecond(), pairLIZIZ2.getFirst(), pairLIZIZ2.getSecond()};
    }

    public final void LJJI(Text text, Function0<Unit> function0) {
        Integer numValueOf;
        if (this.LIZLLL == null) {
            return;
        }
        C16F5 c16f5 = this.LJIJJLI;
        if (c16f5 != null) {
            c16f5.setText(C1133830fbx.LJIILIIL(text, ""));
        }
        ((C1096340edU) this.LIZLLL).LIZJ();
        ViewGroup viewGroup = ((C1096340edU) this.LIZLLL).LJ;
        if (viewGroup != null) {
            numValueOf = Integer.valueOf(viewGroup.getWidth());
        } else {
            numValueOf = null;
        }
        C443120HZe c443120HZeLJIIJJI = AbstractC1096120ed8.LJIIJJI(this, this.LIZLLL, this.LJIJJLI, 1500L, 0L, 0L, new AwS561S0100000_17(viewGroup, 669), new AwS418S0200000_17(viewGroup, numValueOf, 142), false, 308);
        Object first = c443120HZeLJIIJJI.getFirst();
        long jLongValue = ((Number) c443120HZeLJIIJJI.getSecond()).longValue();
        long jLongValue2 = ((Number) c443120HZeLJIIJJI.getThird()).longValue();
        ObjectAnimator objectAnimatorLIZ = AbstractC1096120ed8.LIZ(this.LJJII, View.ALPHA, 1.0f, 0.0f);
        objectAnimatorLIZ.setDuration(200L);
        ObjectAnimator objectAnimatorLIZ2 = AbstractC1096120ed8.LIZ(this.LJJIIZ, View.ALPHA, 1.0f, 0.0f);
        objectAnimatorLIZ2.setDuration(200L);
        ObjectAnimator objectAnimatorLIZ3 = AbstractC1096120ed8.LIZ(this.LJJII, View.ALPHA, 0.0f, 1.0f);
        objectAnimatorLIZ3.setDuration(300L);
        objectAnimatorLIZ3.setStartDelay(jLongValue);
        ObjectAnimator objectAnimatorLIZ4 = AbstractC1096120ed8.LIZ(this.LJJIIZ, View.ALPHA, 1.0f, 1.0f);
        objectAnimatorLIZ4.setDuration(20L);
        objectAnimatorLIZ4.setStartDelay(jLongValue2);
        objectAnimatorLIZ4.addListener(new ALAdapterS12S0200000_17(this, function0, 45));
        AnimatorSet animatorSetInvoke = this.LJJIJIL.invoke();
        if (animatorSetInvoke != null) {
            C323580CmK c323580CmK = new C323580CmK(5);
            c323580CmK.LIZIZ(first);
            c323580CmK.LIZ(objectAnimatorLIZ);
            c323580CmK.LIZ(objectAnimatorLIZ2);
            c323580CmK.LIZ(objectAnimatorLIZ3);
            c323580CmK.LIZ(objectAnimatorLIZ4);
            animatorSetInvoke.playTogether((Animator[]) c323580CmK.LIZLLL(new Animator[c323580CmK.LIZJ()]));
            animatorSetInvoke.start();
        }
    }

    public final void LJJII(String str, String str2) {
        C12ES.LJIILL(0, this.LJJI);
        C1295960jpS c1295960jpS = this.LJJI;
        if (c1295960jpS != null) {
            c1295960jpS.removeAllAnimatorListeners();
        }
        C1295960jpS c1295960jpS2 = this.LJJI;
        if (c1295960jpS2 != null) {
            c1295960jpS2.addAnimatorListener(new AAListenerS269S0200000_17(this, 11));
        }
        C1295960jpS c1295960jpS3 = this.LJJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(".zip");
        C1143680frq.LJIIL(c1295960jpS3, str2, C2188811AlT.LIZIZ(sbLIZ), "", true, null, Boolean.FALSE, null);
    }

    public final void LJJ(boolean z, Text text, Function0<Unit> function0) {
        Integer numValueOf;
        View view;
        if (this.LIZLLL == null) {
            return;
        }
        C16F5 c16f5 = this.LJIJJLI;
        if (c16f5 != null) {
            c16f5.setText(C1133830fbx.LJIILIIL(text, ""));
        }
        ((C1096340edU) this.LIZLLL).LIZJ();
        ViewGroup viewGroup = ((C1096340edU) this.LIZLLL).LJ;
        if (viewGroup != null) {
            numValueOf = Integer.valueOf(viewGroup.getWidth());
        } else {
            numValueOf = null;
        }
        C443120HZe c443120HZeLJIIJJI = AbstractC1096120ed8.LJIIJJI(this, this.LIZLLL, this.LJIJJLI, 1500L, 0L, 0L, new AwS561S0100000_17(viewGroup, 668), new AwS418S0200000_17(viewGroup, numValueOf, 141), false, 308);
        Object first = c443120HZeLJIIJJI.getFirst();
        long jLongValue = ((Number) c443120HZeLJIIJJI.getSecond()).longValue();
        long jLongValue2 = ((Number) c443120HZeLJIIJJI.getThird()).longValue();
        ObjectAnimator objectAnimatorLIZ = AbstractC1096120ed8.LIZ(this.LJIIIZ, View.ALPHA, 1.0f, 0.0f);
        objectAnimatorLIZ.setDuration(200L);
        ObjectAnimator objectAnimatorLIZ2 = AbstractC1096120ed8.LIZ(this.LJIILIIL, View.ALPHA, 1.0f, 0.0f);
        objectAnimatorLIZ2.setDuration(200L);
        objectAnimatorLIZ2.addListener(new ALAdapterS13S0100000_17(this, 112));
        ObjectAnimator objectAnimatorLIZ3 = AbstractC1096120ed8.LIZ(this.LJIIIZ, View.ALPHA, 0.0f, 1.0f);
        objectAnimatorLIZ3.setDuration(300L);
        objectAnimatorLIZ3.setStartDelay(jLongValue);
        if (z) {
            C12ES.LJIILL(8, this.LJIJI);
            view = this.LJIJI;
        } else {
            view = this.LJIILIIL;
        }
        ObjectAnimator objectAnimatorLIZ4 = AbstractC1096120ed8.LIZ(view, View.ALPHA, 1.0f, 1.0f);
        objectAnimatorLIZ4.setDuration(20L);
        objectAnimatorLIZ4.setStartDelay(jLongValue2);
        objectAnimatorLIZ4.addListener(new ALAdapterS12S0200000_17(view, function0, 44));
        AnimatorSet animatorSetInvoke = this.LJJIJIL.invoke();
        if (animatorSetInvoke != null) {
            C323580CmK c323580CmK = new C323580CmK(5);
            c323580CmK.LIZIZ(first);
            c323580CmK.LIZ(objectAnimatorLIZ);
            c323580CmK.LIZ(objectAnimatorLIZ2);
            c323580CmK.LIZ(objectAnimatorLIZ3);
            c323580CmK.LIZ(objectAnimatorLIZ4);
            animatorSetInvoke.playTogether((Animator[]) c323580CmK.LIZLLL(new Animator[c323580CmK.LIZJ()]));
            animatorSetInvoke.start();
        }
    }

    public final void LJJIII(String str, String str2, boolean z, int i, int i2, int i3, Function0<Unit> function0) {
        int iLJIIIZ;
        int width;
        int visibility;
        int visibility2;
        int visibility3;
        int visibility4;
        int i4;
        LinearLayout.LayoutParams layoutParams;
        InterfaceC1095350ebt interfaceC1095350ebt = this.LIZLLL;
        if (interfaceC1095350ebt == null) {
            return;
        }
        ((C1096340edU) interfaceC1095350ebt).LIZJ();
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        C1143680frq.LIZLLL(this.LJJIJ, str, str2);
        int iLJIIIZ2 = C497740JfY.LJIIIZ(R.dimen.ayy);
        if (i3 > 0) {
            iLJIIIZ = (int) C497740JfY.LIZIZ(i3);
        } else {
            iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.ayw);
        }
        if (i2 > 0 && i > 0) {
            iLJIIIZ2 = (iLJIIIZ * i2) / i;
            scaleType = ImageView.ScaleType.FIT_XY;
        }
        ImageView imageView = this.LJJIJ;
        ViewGroup.LayoutParams layoutParams2 = null;
        if (imageView != null) {
            layoutParams2 = imageView.getLayoutParams();
        }
        if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
            layoutParams.width = iLJIIIZ2;
            C786410Ut5.c6(this.LJJIJ, layoutParams);
        }
        C1143680frq.LJ(this.LJJIJ, str, str2, scaleType);
        LiveIconView liveIconView = this.LJJJI;
        int visibility5 = 8;
        if (liveIconView != null) {
            if (z) {
                i4 = 8;
            } else {
                i4 = 0;
            }
            C786410Ut5.LLJJIJIL(liveIconView, i4);
        }
        ViewGroup viewGroup = ((C1096340edU) this.LIZLLL).LJ;
        if (viewGroup != null) {
            width = viewGroup.getWidth();
        } else {
            width = 0;
        }
        C1094580eae.LIZ.getClass();
        int iLJIIIZ3 = C497740JfY.LJIIIZ(R.dimen.az0) + C497740JfY.LJIIIZ(R.dimen.az1) + C497740JfY.LJIIIZ(R.dimen.ayx) + C497740JfY.LJIIIZ(R.dimen.ayy);
        LinearLayout linearLayout = this.LJJIIZI;
        if (linearLayout != null) {
            C786410Ut5.LJZL(8, linearLayout);
        }
        C1324720kZq c1324720kZq = this.LJIIIZ;
        if (c1324720kZq != null) {
            visibility = c1324720kZq.getVisibility();
        } else {
            visibility = 8;
        }
        C430340Gu8 c430340Gu8 = this.LJIILIIL;
        if (c430340Gu8 != null) {
            visibility2 = c430340Gu8.getVisibility();
        } else {
            visibility2 = 8;
        }
        View view = this.LJJIJIIJI;
        if (view != null) {
            visibility3 = view.getVisibility();
        } else {
            visibility3 = 8;
        }
        ImageView imageView2 = this.LJIIZILJ;
        if (imageView2 != null) {
            visibility4 = imageView2.getVisibility();
        } else {
            visibility4 = 8;
        }
        C16F5 c16f5 = this.LJIJ;
        if (c16f5 != null) {
            visibility5 = c16f5.getVisibility();
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorLJIIJ = LJIIJ(width, iLJIIIZ3);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LJJIIZI, (Property<LinearLayout, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(AbstractC1096120ed8.LJIIL(5));
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setStartDelay(200L);
        objectAnimatorOfFloat.addListener(new AAListenerS269S0200000_17(this, viewGroup, 10));
        ObjectAnimator objectAnimatorLIZ = AbstractC1096120ed8.LIZ(this.LJIIIZ, View.ALPHA, 1.0f, 0.0f);
        objectAnimatorLIZ.setDuration(200L);
        objectAnimatorLIZ.addListener(new AAListenerS328S0100000_17(this, 59));
        ObjectAnimator objectAnimatorLIZ2 = AbstractC1096120ed8.LIZ(this.LJIILIIL, View.ALPHA, 1.0f, 0.0f);
        objectAnimatorLIZ2.setDuration(200L);
        objectAnimatorLIZ2.addListener(new AAListenerS328S0100000_17(this, 60));
        ObjectAnimator objectAnimatorLIZ3 = AbstractC1096120ed8.LIZ(this.LJJIJIIJI, View.ALPHA, 1.0f, 0.0f);
        objectAnimatorLIZ3.setDuration(200L);
        objectAnimatorLIZ3.addListener(new AAListenerS328S0100000_17(this, 61));
        ObjectAnimator objectAnimatorLIZ4 = AbstractC1096120ed8.LIZ(this.LJIIZILJ, View.ALPHA, 1.0f, 0.0f);
        objectAnimatorLIZ4.setDuration(200L);
        objectAnimatorLIZ4.addListener(new AAListenerS328S0100000_17(this, 62));
        ObjectAnimator objectAnimatorLIZ5 = AbstractC1096120ed8.LIZ(this.LJIJ, View.ALPHA, 1.0f, 0.0f);
        objectAnimatorLIZ5.setDuration(200L);
        objectAnimatorLIZ5.addListener(new AAListenerS328S0100000_17(this, 63));
        animatorSet.playTogether(valueAnimatorLJIIJ, objectAnimatorOfFloat, objectAnimatorLIZ, objectAnimatorLIZ2, objectAnimatorLIZ3, objectAnimatorLIZ4, objectAnimatorLIZ5);
        AnimatorSet animatorSet2 = new AnimatorSet();
        ValueAnimator valueAnimatorLJIIJ2 = LJIIJ(iLJIIIZ3, width);
        ObjectAnimator objectAnimatorLIZ6 = AbstractC1096120ed8.LIZ(this.LJIIIZ, View.ALPHA, 0.0f, 1.0f);
        objectAnimatorLIZ6.setDuration(200L);
        objectAnimatorLIZ6.addListener(new AAListenerS90S0101000_17(visibility, this, 13));
        ObjectAnimator objectAnimatorLIZ7 = AbstractC1096120ed8.LIZ(this.LJIJ, View.ALPHA, 0.0f, 1.0f);
        objectAnimatorLIZ7.setDuration(200L);
        objectAnimatorLIZ7.addListener(new AAListenerS90S0101000_17(visibility5, this, 14));
        ObjectAnimator objectAnimatorLIZ8 = AbstractC1096120ed8.LIZ(this.LJIILIIL, View.ALPHA, 0.0f, 1.0f);
        objectAnimatorLIZ8.setDuration(200L);
        objectAnimatorLIZ8.addListener(new AAListenerS90S0101000_17(visibility2, this, 15));
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LJJIJIIJI, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat2.setInterpolator(AbstractC1096120ed8.LJIIL(5));
        objectAnimatorOfFloat2.setDuration(200L);
        objectAnimatorOfFloat2.addListener(new AAListenerS90S0101000_17(visibility3, this, 16));
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.LJIIZILJ, (Property<ImageView, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat3.setInterpolator(AbstractC1096120ed8.LJIIL(5));
        objectAnimatorOfFloat3.setDuration(200L);
        objectAnimatorOfFloat3.addListener(new AAListenerS90S0101000_17(visibility4, this, 17));
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.LJJIIZI, (Property<LinearLayout, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat4.setInterpolator(AbstractC1096120ed8.LJIIL(5));
        objectAnimatorOfFloat4.setDuration(200L);
        objectAnimatorOfFloat4.addListener(new AAListenerS328S0100000_17(this, 64));
        animatorSet2.setStartDelay(2500L);
        animatorSet2.playTogether(valueAnimatorLJIIJ2, objectAnimatorLIZ6, objectAnimatorLIZ8, objectAnimatorOfFloat2, objectAnimatorOfFloat4, objectAnimatorOfFloat3, objectAnimatorLIZ7);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.addListener(new AAListenerS139S0300000_17(viewGroup, this, function0, 7));
        animatorSet3.playTogether(animatorSet, animatorSet2);
        animatorSet3.start();
    }

    public C1095930ecp(InterfaceC1095350ebt interfaceC1095350ebt, ViewGroup viewGroup, C1091250eVH c1091250eVH, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, FrameLayout frameLayout, C1324720kZq c1324720kZq, C16F5 c16f5, C16F5 c16f52, FrameLayout frameLayout2, C430340Gu8 c430340Gu8, C430340Gu8 c430340Gu82, C1126540fQC c1126540fQC, C1126540fQC c1126540fQC2, ImageView imageView, C16F5 c16f53, ImageView imageView2, C1295960jpS c1295960jpS, C1295960jpS c1295960jpS2, C16F5 c16f54, C430340Gu8 c430340Gu83, C1295960jpS c1295960jpS3, C1295960jpS c1295960jpS4, ImageView imageView3, ImageView imageView4, ImageView imageView5, C16F5 c16f55, C16F5 c16f56, LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView6, View view, LinearLayout linearLayout3, C1095990ecv c1095990ecv, BPEAHandler bPEAHandler, Room room) {
        ImageView imageView7;
        C16F5 c16f57;
        super(interfaceC1095350ebt, c1295960jpS, bPEAHandler);
        this.LIZLLL = interfaceC1095350ebt;
        this.LJ = viewGroup;
        this.LJFF = c1091250eVH;
        this.LJI = constraintLayout;
        this.LJII = constraintLayout2;
        this.LJIIIIZZ = frameLayout;
        this.LJIIIZ = c1324720kZq;
        this.LJIIJ = c16f5;
        this.LJIIJJI = c16f52;
        this.LJIIL = frameLayout2;
        this.LJIILIIL = c430340Gu8;
        this.LJIILJJIL = c430340Gu82;
        this.LJIILL = c1126540fQC;
        this.LJIILLIIL = c1126540fQC2;
        this.LJIIZILJ = imageView;
        this.LJIJ = c16f53;
        this.LJIJI = imageView2;
        this.LJIJJ = c1295960jpS2;
        this.LJIJJLI = c16f54;
        this.LJIL = c430340Gu83;
        this.LJJ = c1295960jpS3;
        this.LJJI = c1295960jpS4;
        this.LJJIFFI = imageView3;
        this.LJJII = imageView4;
        this.LJJIII = imageView5;
        this.LJJIIJ = c16f55;
        this.LJJIIJZLJL = c16f56;
        this.LJJIIZ = linearLayout;
        this.LJJIIZI = linearLayout2;
        this.LJJIJ = imageView6;
        this.LJJIJIIJI = view;
        this.LJJIJIIJIL = linearLayout3;
        this.LJJIJIL = c1095990ecv;
        this.LJJIJL = bPEAHandler;
        this.LJJIJLIJ = room;
        this.LJJIL = new C11NJ();
        if (linearLayout3 != null) {
            imageView7 = (ImageView) linearLayout3.findViewById(R.id.lgt);
        } else {
            imageView7 = null;
        }
        this.LJJIZ = imageView7;
        if (linearLayout3 != null) {
            c16f57 = (C16F5) linearLayout3.findViewById(R.id.zln);
        } else {
            c16f57 = null;
        }
        this.LJJJ = c16f57;
        this.LJJJI = linearLayout2 != null ? (LiveIconView) linearLayout2.findViewById(R.id.wpp) : null;
    }
}
