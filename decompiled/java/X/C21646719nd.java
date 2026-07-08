package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.widget.TextSwitcher;
import android.widget.ViewSwitcher;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AwS277S0300000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.19nd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21646719nd {
    public static final float LJIIIZ = C418440Gaw.LIZIZ(20);
    public final ConstraintLayout LIZ;
    public final TextSwitcher LIZIZ;
    public final ViewSwitcher LIZJ;
    public final View LIZLLL;
    public EnumC21646819ne LJ = EnumC21646819ne.LL;
    public final boolean LJFF;
    public final C01GW LJI;
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;

    public final void LJI() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        ConstraintLayout constraintLayout = this.LIZ;
        if (constraintLayout != null && (viewPropertyAnimatorAnimate2 = constraintLayout.animate()) != null) {
            viewPropertyAnimatorAnimate2.cancel();
        }
        ConstraintLayout constraintLayout2 = this.LIZ;
        if (constraintLayout2 != null) {
            C786410Ut5.jd(constraintLayout2, 0.0f);
        }
        View view = this.LIZLLL;
        if (view != null && (viewPropertyAnimatorAnimate = view.animate()) != null) {
            viewPropertyAnimatorAnimate.cancel();
        }
        View view2 = this.LIZLLL;
        if (view2 != null) {
            C786410Ut5.ed(view2, 0.0f);
        }
    }

    public final void LIZ(Function0 function0) {
        ConstraintLayout constraintLayout = this.LIZ;
        View view = this.LIZLLL;
        if (view == null) {
            view = constraintLayout;
        }
        if (constraintLayout != null && view != null && constraintLayout.isLaidOut() && view.isLaidOut()) {
            view.animate().cancel();
            float translationY = view.getTranslationY();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            float f = iArr[1];
            function0.invoke();
            constraintLayout.addOnLayoutChangeListener(new C0IDO(constraintLayout, new C421700GgC(this, view, translationY, f), 2));
            constraintLayout.requestLayout();
            return;
        }
        LJI();
        function0.invoke();
    }

    public final float LIZIZ(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        float fIntValue;
        ViewGroup.LayoutParams layoutParams = this.LIZJ.getLayoutParams();
        Object obj = null;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            i = marginLayoutParams.topMargin;
        } else {
            i = 0;
        }
        Iterator it2 = C1697810uHb.LJIIJJI(Integer.valueOf(this.LIZJ.getHeight()), Integer.valueOf(this.LIZJ.getMeasuredHeight()), Integer.valueOf(view.getHeight()), Integer.valueOf(view.getMeasuredHeight())).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((Number) next).intValue() > 0) {
                obj = next;
                break;
            }
        }
        Integer num = (Integer) obj;
        if (num != null) {
            fIntValue = num.intValue();
        } else {
            fIntValue = LJIIIZ;
        }
        return (fIntValue + i) / 2.0f;
    }

    public final void LIZJ(final Context context) {
        this.LIZIZ.setFactory(new ViewSwitcher.ViewFactory() { // from class: X.06o9
            @Override // android.widget.ViewSwitcher.ViewFactory
            public final View makeView() {
                C21646719nd c21646719nd = this.LIZ;
                Context context2 = context;
                if (context2 == null) {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                c21646719nd.getClass();
                TuxTextView tuxTextView = new TuxTextView(context2, null, 6, 0);
                tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                tuxTextView.setGravity(8388611);
                tuxTextView.setMaxLines(1);
                tuxTextView.setSingleLine();
                tuxTextView.setTextColor(C1383370m6R.LJFF(R.attr.a1k));
                C786410Ut5.LJLLLLLL(8, tuxTextView);
                tuxTextView.setTuxFont(71);
                tuxTextView.setTextColorRes(R.attr.a1k);
                return tuxTextView;
            }
        });
        this.LIZIZ.setInAnimation((Animation) this.LJII.getValue());
        this.LIZIZ.setOutAnimation((Animation) this.LJIIIIZZ.getValue());
    }

    public final void LJFF(View view) {
        this.LJ = EnumC21646819ne.LLILZ;
        LJI();
        C786410Ut5.LJLLLLLL(8, view);
        C786410Ut5.LJLLLLLL(8, this.LIZJ);
    }

    public final void LJII(boolean z) {
        boolean z2 = true;
        if (this.LJ == EnumC21646819ne.LLILLJJLI && this.LIZJ.getVisibility() == 0 && this.LIZJ.getDisplayedChild() == 0) {
            return;
        }
        if (!z || this.LIZJ.getVisibility() != 8) {
            z2 = false;
        }
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(this, 3873);
        if (z2) {
            LIZ(awS577S0100000_33);
        } else {
            LJI();
            awS577S0100000_33.invoke();
        }
    }

    public final void LJIIJ(CharSequence charSequence) {
        EnumC21646819ne enumC21646819ne = this.LJ;
        if (enumC21646819ne != EnumC21646819ne.LLILLL && enumC21646819ne != EnumC21646819ne.LLILZ) {
            LJI();
            if (charSequence != null && charSequence.length() != 0) {
                C1360520lVa c1360520lVa = new C1360520lVa();
                c1360520lVa.LIZ.append(charSequence);
                this.LIZIZ.setCurrentText(c1360520lVa.LIZ);
                LJII(false);
                return;
            }
            LIZLLL(false, EnumC21646819ne.LL, AFwS224S0000000_33.get$arr$(571));
        }
    }

    public final void LJ(View view, CharSequence charSequence) {
        EnumC21646819ne enumC21646819ne = this.LJ;
        if (enumC21646819ne != EnumC21646819ne.LLILLL && enumC21646819ne != EnumC21646819ne.LLILZ) {
            return;
        }
        LJI();
        if (charSequence != null && charSequence.length() != 0) {
            this.LIZIZ.setCurrentText(charSequence);
            C786410Ut5.LJLLLLLL(8, view);
            LJII(true);
        } else {
            LIZLLL(true, EnumC21646819ne.LL, new AwS577S0100000_33(view, 3872));
        }
    }

    public final void LJIIIIZZ(View view, boolean z) {
        boolean z2 = false;
        if (this.LJ == EnumC21646819ne.LLILLL && this.LIZJ.getVisibility() == 0 && this.LIZJ.getDisplayedChild() == 1 && view.getVisibility() == 0) {
            return;
        }
        if (z && this.LIZJ.getVisibility() == 8) {
            z2 = true;
        }
        AwS434S0200000_33 awS434S0200000_33 = new AwS434S0200000_33(this, view, 158);
        if (z2) {
            LIZ(awS434S0200000_33);
        } else {
            LJI();
            awS434S0200000_33.invoke();
        }
    }

    public final void LJIIIZ(CharSequence charSequence, boolean z) {
        EnumC21646819ne enumC21646819ne = this.LJ;
        if (enumC21646819ne != EnumC21646819ne.LLILLL && enumC21646819ne != EnumC21646819ne.LLILZ) {
            if (charSequence != null && charSequence.length() != 0) {
                if (z) {
                    C1360520lVa c1360520lVa = new C1360520lVa();
                    c1360520lVa.LIZ.append(charSequence);
                    charSequence = c1360520lVa.LIZ;
                }
                if (this.LIZIZ.getVisibility() == 8) {
                    this.LIZIZ.setCurrentText(charSequence);
                } else {
                    this.LIZIZ.setText(charSequence);
                }
                LJII(true);
                return;
            }
            if (this.LJ != EnumC21646819ne.LLILLJJLI) {
                return;
            }
            LIZLLL(true, EnumC21646819ne.LL, AFwS224S0000000_33.get$arr$(571));
        }
    }

    public final void LIZLLL(boolean z, EnumC21646819ne enumC21646819ne, Function0<Unit> function0) {
        if (this.LIZJ.getVisibility() == 8 && this.LJ == enumC21646819ne) {
            function0.invoke();
            return;
        }
        AwS277S0300000_33 awS277S0300000_33 = new AwS277S0300000_33(this, (C21646719nd) enumC21646819ne, (EnumC21646819ne) function0, (Function0<Unit>) 7);
        if (z && this.LIZJ.getVisibility() == 0) {
            LIZ(awS277S0300000_33);
        } else {
            LJI();
            awS277S0300000_33.invoke();
        }
    }

    public C21646719nd(ConstraintLayout constraintLayout, TextSwitcher textSwitcher, ViewSwitcher viewSwitcher, View view) {
        boolean z;
        this.LIZ = constraintLayout;
        this.LIZIZ = textSwitcher;
        this.LIZJ = viewSwitcher;
        this.LIZLLL = view;
        if (viewSwitcher == textSwitcher) {
            z = true;
        } else {
            z = false;
        }
        this.LJFF = z;
        this.LJI = C1509305vX.LIZ(AFwS221S0000000_31.get$arr$(385));
        this.LJII = C1509305vX.LIZ(new AwS575S0100000_31(this, 1375));
        this.LJIIIIZZ = C1509305vX.LIZ(AFwS221S0000000_31.get$arr$(386));
    }
}
