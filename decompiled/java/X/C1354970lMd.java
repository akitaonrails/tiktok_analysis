package X;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: renamed from: X.0lMd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1354970lMd extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LLJILJILJ = 0;
    public C1346290l8d LL;
    public Aweme LLILLJJLI;
    public Comment LLILLL;
    public String LLILZ;
    public Function0<Unit> LLILZIL;
    public int LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public View LLJIJIL;
    public boolean LLJILJIL;

    public final TuxIconView I5() {
        return (TuxIconView) this.LLIZLLLIL.getValue();
    }

    public final RadiusLayout L5() {
        return (RadiusLayout) this.LLIZ.getValue();
    }

    public C1354970lMd(View view) {
        super(view);
        this.LLILZ = "";
        this.LLIZ = C452501pT.LIZIZ(new AwS565S0100000_21(view, 1352));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS565S0100000_21(view, 1351));
        this.LLJ = C452501pT.LIZIZ(new AwS565S0100000_21(view, 1353));
        this.LLJI = C452501pT.LIZIZ(new AwS565S0100000_21(view, 1354));
        this.LLJILJIL = true;
        C2211751BhN.LIZ(view, new AbstractC1355050lMl(this) { // from class: X.0lMh
            public final AFwS209S0000000_21 LJ = AFwS209S0000000_21.get$arr$(503);
            public Function0<String> LJFF;
            public final C1402200mao LJI;

            @Override // X.AbstractC2211791BhR
            public final /* bridge */ /* synthetic */ Map LJII() {
                return null;
            }

            @Override // X.AbstractC2211791BhR
            public final Function0<String> LIZIZ() {
                return this.LJ;
            }

            @Override // X.AbstractC2211791BhR
            public final Function0<String> LIZLLL() {
                return this.LJFF;
            }

            @Override // X.AbstractC2211791BhR
            public final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF() {
                return this.LJI;
            }

            {
                this.LJFF = new AwS565S0100000_21(this, 1350);
                this.LJI = new C1402200mao(this, 13);
            }

            @Override // X.AbstractC2211791BhR
            public final void LJIILL(Function0<String> function0) {
                this.LJFF = function0;
            }
        });
    }

    public final void N5(C1346290l8d c1346290l8d) {
        int i;
        int iIntValue;
        Integer num;
        int i2;
        int i3;
        final int iIntValue2;
        final int iIntValue3;
        String str = c1346290l8d.LIZLLL;
        if (str != null) {
            ((TextView) this.LLJ.getValue()).setText(str);
        }
        if (c1346290l8d.LJFF.LIZIZ) {
            i = R.attr.a1l;
        } else {
            i = R.attr.a1h;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(i, this.itemView.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        ((TextView) this.LLJ.getValue()).setTextColor(iIntValue);
        Integer num2 = c1346290l8d.LIZJ;
        if (num2 != null) {
            int iIntValue4 = num2.intValue();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = iIntValue4;
            c419910GdJ.LJ = Integer.valueOf(i);
            I5().setTuxIcon(c419910GdJ);
        }
        C1346310l8f c1346310l8f = c1346290l8d.LJFF;
        int i4 = c1346310l8f.LIZ;
        if ((i4 & 17) == 17) {
            L5().setRadius(C418440Gaw.LIZIZ(10));
            num = null;
            i2 = 21;
            C426750GoL.LJIIL(L5(), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(19))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(19))), 21);
        } else if ((i4 & 1) == 1) {
            L5().LIZ(C418440Gaw.LIZIZ(10), C418440Gaw.LIZIZ(10), 0.0f, 0.0f);
            num = null;
            i2 = 21;
            C426750GoL.LJIIL(L5(), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(19))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15))), 21);
        } else if ((i4 & 16) == 16) {
            L5().LIZ(0.0f, 0.0f, C418440Gaw.LIZIZ(10), C418440Gaw.LIZIZ(10));
            num = null;
            i2 = 21;
            C426750GoL.LJIIL(L5(), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(19))), 21);
        } else {
            L5().setRadius(0.0f);
            num = null;
            i2 = 21;
            C426750GoL.LJIIL(L5(), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15))), 21);
        }
        C1354990lMf.LIZ.getClass();
        if (C1354990lMf.LIZIZ()) {
            C426750GoL.LJIIL(L5(), num, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), num, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), i2);
        }
        EnumC1346400l8o enumC1346400l8o = c1346310l8f.LIZJ;
        if (enumC1346400l8o != null && (i3 = C1346410l8p.LIZ[enumC1346400l8o.ordinal()]) != 1) {
            if (i3 == 2) {
                final RadiusLayout radiusLayoutL5 = L5();
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a0c, radiusLayoutL5.getContext());
                if (numLIZJ2 != null) {
                    iIntValue2 = numLIZJ2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1f, radiusLayoutL5.getContext());
                if (numLIZJ3 != null) {
                    iIntValue3 = numLIZJ3.intValue();
                } else {
                    iIntValue3 = -1;
                }
                final ArgbEvaluator argbEvaluator = new ArgbEvaluator();
                ValueAnimator valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofKeyframe("prog", Keyframe.ofFloat(0.0f, 0.95f), Keyframe.ofFloat(0.90909094f, 0.95f), Keyframe.ofFloat(1.0f, 1.0f)));
                valueAnimatorOfPropertyValuesHolder.setDuration(3300L);
                valueAnimatorOfPropertyValuesHolder.setInterpolator(C1619980sG4.LIZLLL());
                valueAnimatorOfPropertyValuesHolder.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0hj0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        radiusLayoutL5.setBackgroundColor(((Integer) argbEvaluator.evaluate(((Float) valueAnimator.getAnimatedValue()).floatValue(), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3))).intValue());
                    }
                });
                valueAnimatorOfPropertyValuesHolder.addListener(new Animator.AnimatorListener() { // from class: X.0him
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
                        radiusLayoutL5.setBackgroundColor(iIntValue3);
                    }
                });
                C1351950lHl.LJIILLIIL(radiusLayoutL5, new AwS600S0100000_21(valueAnimatorOfPropertyValuesHolder, 296));
                return;
            }
            throw new C1954807lC();
        }
    }
}
