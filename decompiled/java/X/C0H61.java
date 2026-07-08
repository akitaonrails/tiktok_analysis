package X;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import kotlin.Pair;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0H61, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H61 {
    public static final C0H61 CHECKBOX_TRANSLATION;
    public static final C0H61 GRADIENT;
    public static final C0H61 HIDE;
    public static final /* synthetic */ C0H61[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final C0H61 NORMAL_TRANSLATION;
    public final String LL;
    public final Interpolator LLILLJJLI;
    public final InterfaceC1631620sYq<Boolean, Boolean, Integer, Pair<Float, Float>> LLILLL;

    public static InterfaceC2044707zh<C0H61> getEntries() {
        return LLILZIL;
    }

    static {
        C0H61 c0h61 = new C0H61("NORMAL_TRANSLATION", 0, "translationX", C1619980sG4.LJIILIIL(), C020A.get$arr$(8));
        NORMAL_TRANSLATION = c0h61;
        C0H61 c0h612 = new C0H61("CHECKBOX_TRANSLATION", 1, "translationX", C1619980sG4.LJIILIIL(), C020A.get$arr$(9));
        CHECKBOX_TRANSLATION = c0h612;
        C0H61 c0h613 = new C0H61("GRADIENT", 2, "alpha", C1619980sG4.LJI(), C020A.get$arr$(10));
        GRADIENT = c0h613;
        C0H61 c0h614 = new C0H61("HIDE", 3, "alpha", C1619980sG4.LJI(), C020A.get$arr$(11));
        HIDE = c0h614;
        C0H61[] c0h61Arr = {c0h61, c0h612, c0h613, c0h614};
        LLILZ = c0h61Arr;
        LLILZIL = new C2254308sP(c0h61Arr);
    }

    public static C0H61[] values() {
        return (C0H61[]) LLILZ.clone();
    }

    public static C0H61 valueOf(String str) {
        return (C0H61) C08FF.LIZ(C0H61.class, str);
    }

    public final ObjectAnimator createAnimator$awemenotice_api_release(View view, boolean z, Integer num) {
        Pair<Float, Float> pairInvoke = this.LLILLL.invoke(Boolean.valueOf(z), Boolean.valueOf(C426750GoL.LIZLLL(C1383370m6R.LIZ)), num);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, this.LL, pairInvoke.getFirst().floatValue(), pairInvoke.getSecond().floatValue());
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(this.LLILLJJLI);
        return objectAnimatorOfFloat;
    }

    public C0H61(String str, int i, String str2, Interpolator interpolator, InterfaceC1631620sYq interfaceC1631620sYq) {
        this.LL = str2;
        this.LLILLJJLI = interpolator;
        this.LLILLL = interfaceC1631620sYq;
    }
}
