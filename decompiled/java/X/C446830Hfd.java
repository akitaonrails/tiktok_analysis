package X;

import Y.AAListenerS317S0100000_6;
import Y.ARunnableS0S0303000_6;
import Y.AsS33S0100000_6;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Looper;
import android.util.Property;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS150S0101000_10;

/* JADX INFO: renamed from: X.0Hfd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C446830Hfd implements InterfaceC446860Hfg {
    public final RecyclerView LIZ;
    public Integer LIZIZ;
    public Pair<Integer, Integer> LIZLLL;
    public boolean LJ;
    public RecyclerView LJFF;
    public View LJI;
    public boolean LJII;
    public Function0<Unit> LJIIIIZZ;
    public Pair<Integer, Integer> LIZJ = new Pair<>(0, 0);
    public final AsS33S0100000_6 LJIIIZ = new AsS33S0100000_6(this, 6);
    public final AsS33S0100000_6 LJIIJ = new AsS33S0100000_6(this, 7);

    public final void LIZJ() {
        this.LJ = false;
        this.LIZ.removeOnScrollListener(this.LJIIIZ);
        RecyclerView recyclerView = this.LJFF;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.LJIIJ);
        }
        Function0<Unit> function0 = this.LJIIIIZZ;
        if (function0 != null) {
            function0.invoke();
        }
        this.LJIIIIZZ = null;
    }

    public final void LJ() {
        RecyclerView.LayoutManager layoutManager;
        View viewFindViewByPosition;
        Integer num = this.LIZIZ;
        if (num == null || num.intValue() < 0 || 1 == 0 || num == null) {
            return;
        }
        int iIntValue = num.intValue();
        RecyclerView recyclerView = this.LJFF;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewFindViewByPosition = layoutManager.findViewByPosition(iIntValue)) == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewFindViewByPosition, (Property<View, Float>) View.SCALE_X, 1.0f, 1.0425532f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(viewFindViewByPosition, (Property<View, Float>) View.SCALE_Y, 1.0f, 1.0425532f);
        animatorSet.setDuration(240L);
        animatorSet.setInterpolator(C1619980sG4.LJI());
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(viewFindViewByPosition, (Property<View, Float>) View.SCALE_X, 1.0425532f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewFindViewByPosition, (Property<View, Float>) View.SCALE_Y, 1.0425532f, 1.0f);
        animatorSet2.setDuration(200L);
        animatorSet2.setInterpolator(C1619980sG4.LJI());
        animatorSet2.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.play(animatorSet2).after(animatorSet);
        animatorSet3.addListener(new AAListenerS317S0100000_6(this, 49));
        animatorSet3.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF() {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C446830Hfd.LJFF():void");
    }

    public C446830Hfd(RecyclerView recyclerView) {
        this.LIZ = recyclerView;
    }

    @Override // X.InterfaceC446860Hfg
    public final void LIZIZ(View view) {
        TypedValue typedValue = new TypedValue();
        view.getContext().getTheme().resolveAttribute(R.attr.br, typedValue, true);
        int i = typedValue.data;
        final int iRed = Color.red(i);
        final int iGreen = Color.green(i);
        final int iBlue = Color.blue(i);
        C817403Hg c817403Hg = new C817403Hg();
        c817403Hg.element = 0.06f;
        C817403Hg c817403Hg2 = new C817403Hg();
        c817403Hg2.element = 0.16f;
        float fApplyDimension = TypedValue.applyDimension(1, 5.0f, view.getResources().getDisplayMetrics());
        final GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(fApplyDimension);
        view.setBackground(gradientDrawable);
        if (C960203pA.LIZIZ(view.getContext())) {
            c817403Hg.element = 0.12f;
            c817403Hg2.element = 0.24f;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(c817403Hg.element, c817403Hg2.element);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.06YP
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                gradientDrawable.setColor(Color.argb((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255), iRed, iGreen, iBlue));
            }
        });
        valueAnimatorOfFloat.start();
        C786410Ut5.LJLIIL(1000L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS0S0303000_6(c817403Hg2, c817403Hg, gradientDrawable, iRed, iGreen, iBlue, 0));
    }

    public final Pair<Integer, Integer> LIZLLL(View view) {
        if (C426750GoL.LJ(this.LIZ)) {
            return new Pair<>(Integer.valueOf(view.getRight()), Integer.valueOf(view.getLeft()));
        }
        return new Pair<>(Integer.valueOf(view.getLeft()), Integer.valueOf(view.getRight()));
    }

    @Override // X.InterfaceC446860Hfg
    public final void LIZ(View view, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, int i, View view2, Integer num, Pair pair, AwS150S0101000_10 awS150S0101000_10) {
        int i2;
        C20244914Jj c20244914JjLIZ;
        int i3;
        boolean z;
        this.LJFF = viewOnAttachStateChangeListenerC20604515jv;
        this.LJI = view;
        this.LIZIZ = Integer.valueOf(i);
        this.LIZJ = pair;
        Pair<Integer, Integer> pair2 = null;
        if (view2 != null) {
            int width = view2.getWidth();
            if (num != null) {
                if (C426750GoL.LJ(this.LIZ)) {
                    i3 = -1;
                } else {
                    i3 = 1;
                }
                int iIntValue = i - num.intValue();
                if (iIntValue < 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.LJII = z;
                int iIntValue2 = iIntValue * (((Number) pair.getFirst()).intValue() + ((Number) pair.getSecond()).intValue() + width) * i3;
                pair2 = new Pair<>(Integer.valueOf(view2.getLeft() + iIntValue2), Integer.valueOf(iIntValue2 + view2.getRight()));
            }
        }
        this.LIZLLL = pair2;
        this.LJIIIIZZ = awS150S0101000_10;
        this.LIZ.addOnScrollListener(this.LJIIIZ);
        RecyclerView recyclerView = this.LJFF;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(this.LJIIJ);
        }
        View view3 = this.LJI;
        if (view3 != null && (!this.LJ)) {
            this.LJ = true;
            int[] iArr = {0, 0};
            View view4 = (View) view3.getParent();
            view4.getLocationInWindow(iArr);
            C20246014Ju c20246014JuLIZ = C14K4.LIZ(view3);
            if (c20246014JuLIZ != null && (c20244914JjLIZ = c20246014JuLIZ.LIZ(2)) != null) {
                i2 = c20244914JjLIZ.LIZLLL - c20244914JjLIZ.LIZIZ;
            } else {
                i2 = 0;
            }
            int height = ((iArr[1] + view4.getHeight()) - view3.getRootView().getHeight()) + i2;
            int bottom = view3.getBottom() - view4.getBottom();
            if (height < 0) {
                height = 0;
            }
            int i4 = bottom + height;
            if (i4 > 0) {
                this.LIZ.smoothScrollBy(0, i4, C1619980sG4.LJI(), DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
                return;
            } else {
                LJFF();
                return;
            }
        }
        LIZJ();
    }
}
