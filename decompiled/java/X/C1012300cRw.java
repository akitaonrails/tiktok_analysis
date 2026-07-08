package X;

import Y.AAListenerS317S0100000_6;
import Y.AAListenerS327S0100000_16;
import Y.AUListenerS256S0100000_6;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.app.R$styleable;
import kotlin.jvm.internal.AwS417S0200000_16;

/* JADX INFO: renamed from: X.0cRw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1012300cRw extends ViewGroup {
    public static final /* synthetic */ int LLILZLL = 0;
    public final TuxIconView LL;
    public final TuxIconView LLILLJJLI;
    public AnimatorSet LLILLL;
    public InterfaceC419590Gcn LLILZ;
    public EnumC1012120cRe LLILZIL;

    private final int getIconMeasuredHeight() {
        return this.LLILLJJLI.getMeasuredHeight();
    }

    public final EnumC1012120cRe getState() {
        return this.LLILZIL;
    }

    public final void setAnimator(InterfaceC419590Gcn interfaceC419590Gcn) {
        this.LLILZ = interfaceC419590Gcn;
    }

    public C1012300cRw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZ = new InterfaceC419590Gcn() { // from class: X.0Gcl
            @Override // X.InterfaceC419590Gcn
            public final AnimatorSet LIZ(TuxIconView tuxIconView, TuxIconView tuxIconView2) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setInterpolator(new Interpolator() { // from class: X.0Gcm
                    @Override // android.animation.TimeInterpolator
                    public final float getInterpolation(float f) {
                        return (float) ((Math.pow(2.0d, (-10) * f) * Math.sin((((double) (f - (3.642f / 4))) * 6.283185307179586d) / ((double) 3.642f))) + ((double) 1));
                    }
                });
                valueAnimatorOfFloat.setDuration(343L);
                valueAnimatorOfFloat.addListener(new AAListenerS317S0100000_6(tuxIconView, 41));
                valueAnimatorOfFloat.addListener(new AAListenerS317S0100000_6(tuxIconView, 40));
                valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(tuxIconView, 47));
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                valueAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator(1.5f));
                valueAnimatorOfFloat2.setDuration(200L);
                valueAnimatorOfFloat2.addListener(new AAListenerS317S0100000_6(tuxIconView2, 43));
                valueAnimatorOfFloat2.addListener(new AAListenerS317S0100000_6(tuxIconView2, 42));
                valueAnimatorOfFloat2.addUpdateListener(new AUListenerS256S0100000_6(tuxIconView2, 46));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
                return animatorSet;
            }
        };
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BinaryStateIcon);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = typedArrayObtainStyledAttributes.getResourceId(R$styleable.BinaryStateIcon_binary_off_icon, 0);
        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.BinaryStateIcon_binary_off_icon_label);
        c419910GdJ.LJI = strXd == null ? "" : strXd;
        c419910GdJ.LIZLLL = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(R$styleable.BinaryStateIcon_binary_off_tint_color, -16777216));
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = typedArrayObtainStyledAttributes.getResourceId(R$styleable.BinaryStateIcon_binary_on_icon, 0);
        String strXd2 = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.BinaryStateIcon_binary_on_icon_label);
        c419910GdJ2.LJI = strXd2 != null ? strXd2 : "";
        c419910GdJ2.LIZLLL = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(R$styleable.BinaryStateIcon_binary_on_tint_color, -65536));
        C1011980cRQ c1011980cRQ = EnumC1012120cRe.Companion;
        int i = R$styleable.BinaryStateIcon_binary_default_state;
        EnumC1012120cRe enumC1012120cRe = EnumC1012120cRe.OFF;
        int i2 = typedArrayObtainStyledAttributes.getInt(i, enumC1012120cRe.getValue());
        c1011980cRQ.getClass();
        EnumC1012120cRe enumC1012120cReLIZ = C1011980cRQ.LIZ(i2);
        this.LLILZIL = enumC1012120cReLIZ != null ? enumC1012120cReLIZ : enumC1012120cRe;
        typedArrayObtainStyledAttributes.recycle();
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        C786410Ut5.M6(tuxIconView, generateDefaultLayoutParams());
        tuxIconView.setTuxIcon(c419910GdJ);
        this.LLILLJJLI = tuxIconView;
        TuxIconView tuxIconView2 = new TuxIconView(context, null, 0, 6, null);
        C786410Ut5.M6(tuxIconView2, generateDefaultLayoutParams());
        tuxIconView2.setTuxIcon(c419910GdJ2);
        this.LL = tuxIconView2;
        addView(tuxIconView);
        addView(tuxIconView2);
        LIZ(this.LLILZIL, false);
    }

    public final void LIZ(EnumC1012120cRe enumC1012120cRe, boolean z) {
        AnimatorSet animatorSetLIZ;
        AnimatorSet animatorSet;
        AwS417S0200000_16 awS417S0200000_16 = new AwS417S0200000_16(enumC1012120cRe, this, 32);
        if (z) {
            AnimatorSet animatorSet2 = this.LLILLL;
            if (animatorSet2 != null && animatorSet2.isRunning() && (animatorSet = this.LLILLL) != null) {
                animatorSet.cancel();
            }
            int i = C1012130cRf.LIZ[enumC1012120cRe.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    animatorSetLIZ = this.LLILZ.LIZ(this.LL, this.LLILLJJLI);
                } else {
                    throw new C1954807lC();
                }
            } else {
                animatorSetLIZ = this.LLILZ.LIZ(this.LLILLJJLI, this.LL);
            }
            this.LLILLL = animatorSetLIZ;
            if (animatorSetLIZ != null) {
                animatorSetLIZ.addListener(new AAListenerS327S0100000_16(awS417S0200000_16, 3));
            }
            AnimatorSet animatorSet3 = this.LLILLL;
            if (animatorSet3 != null) {
                animatorSet3.start();
                return;
            }
            return;
        }
        awS417S0200000_16.invoke();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i3 = (size - paddingLeft) - paddingRight;
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        this.LLILLJJLI.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
        this.LL.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
        setMeasuredDimension(ViewGroup.resolveSize(getIconMeasuredHeight() + paddingLeft + paddingRight, i), ViewGroup.resolveSize(getIconMeasuredHeight() + paddingLeft + paddingRight, i2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int iconMeasuredHeight = getIconMeasuredHeight() + paddingLeft;
        int iconMeasuredHeight2 = getIconMeasuredHeight() + paddingTop;
        this.LLILLJJLI.layout(paddingLeft, paddingTop, iconMeasuredHeight, iconMeasuredHeight2);
        this.LL.layout(paddingLeft, paddingTop, iconMeasuredHeight, iconMeasuredHeight2);
    }
}
