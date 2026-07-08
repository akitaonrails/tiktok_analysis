package X;

import Y.AAListenerS323S0100000_12;
import Y.ALAdapterS18S0200000_24;
import Y.ALAdapterS8S0110000_24;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.0rwU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1607840rwU {
    public static final Interpolator LIZLLL() {
        C1606640ruY.LIZ.getClass();
        int i = C1606640ruY.LIZ().enterInterpolator;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? C1619980sG4.LIZJ() : new DecelerateInterpolator() : new LinearInterpolator() : C1619980sG4.LJ() : C1619980sG4.LJIIIZ();
    }

    public static final long LJ(View view) {
        C1606640ruY.LIZ.getClass();
        long j = C1606640ruY.LIZ().exitAnimDuration;
        if (j <= 0) {
            try {
                return view.getContext().getResources().getInteger(R.integer.b0);
            } catch (Resources.NotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                return 300L;
            }
        }
        return j;
    }

    public static final Animator LIZ(int i, int i2, int i3, int i4, View view, boolean z) {
        float width;
        Animator animatorLIZJ;
        float height = 0.0f;
        if (view.getWidth() != 0) {
            width = i3 / view.getWidth();
        } else {
            width = 0.0f;
        }
        if (view.getHeight() != 0) {
            height = i4 / view.getHeight();
        }
        C1606640ruY.LIZ.getClass();
        long integer = C1606640ruY.LIZ().enterAnimDuration;
        if (integer <= 0) {
            try {
                integer = view.getContext().getResources().getInteger(R.integer.b0);
            } catch (Resources.NotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                integer = 300;
            }
        }
        try {
            animatorLIZJ = LIZJ(view, i, i2, width, height, z, integer);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            animatorLIZJ = null;
        }
        if (animatorLIZJ != null) {
            return animatorLIZJ;
        }
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, width, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, height, 1.0f));
        if (z) {
            listLJIILJJIL.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(C13LP.LLIIII(listLJIILJJIL));
        view.setPivotX(i);
        view.setPivotY(i2);
        animatorSet.setDuration(integer);
        animatorSet.setInterpolator(LIZLLL());
        if (z) {
            animatorSet.addListener(new AAListenerS323S0100000_12(view, 10));
        }
        return animatorSet;
    }

    public static final Animator LIZIZ(final View view, int i, int i2, final float f, final float f2, final boolean z, long j) {
        if (!C21392318nh.LIZIZ()) {
            return null;
        }
        C786410Ut5.Ob(view, 1.0f);
        C786410Ut5.pc(view, 1.0f);
        view.setPivotX(i);
        view.setPivotY(i2);
        C21392318nh c21392318nh = new C21392318nh(view);
        c21392318nh.LIZ(f, 8);
        c21392318nh.LIZ(f2, 16);
        if (z) {
            c21392318nh.LIZ(0.0f, SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);
        }
        List<Animator> listLIZJ = c21392318nh.LIZJ();
        if (listLIZJ == null || ((ArrayList) listLIZJ).isEmpty()) {
            return null;
        }
        final ArrayList arrayList = (ArrayList) listLIZJ;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Animator) it2.next()).setDuration(j);
        }
        C21390118nL c21390118nL = (C21390118nL) view.findViewById(R.id.tyd);
        if (c21390118nL != null) {
            c21390118nL.LIZ(1.0f, f, j, 2, C1619980sG4.LJIIIZ(), new InterfaceC21390418nO() { // from class: X.0rwV
                @Override // X.InterfaceC21390418nO
                public final void LIZ(AwS576S0100000_32 awS576S0100000_32) {
                    List<Animator> list = arrayList;
                    C118300cf c118300cf = new C118300cf();
                    c118300cf.element = list.size();
                    Iterator<Animator> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().addListener(new ALAdapterS18S0200000_24(c118300cf, awS576S0100000_32, 2));
                    }
                }
            });
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((Animator) it3.next()).start();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(j);
        duration.addListener(new AnimatorListenerAdapter() { // from class: X.0rwX
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                C786410Ut5.Ob(view, f);
                C786410Ut5.pc(view, f2);
                if (z) {
                    C786410Ut5.T4(view, 0.0f);
                }
            }
        });
        return duration;
    }

    public static final Animator LIZJ(View view, int i, int i2, float f, float f2, boolean z, long j) {
        if (!C21392318nh.LIZIZ()) {
            return null;
        }
        C786410Ut5.Ob(view, f);
        C786410Ut5.pc(view, f2);
        view.setPivotX(i);
        view.setPivotY(i2);
        if (z) {
            C786410Ut5.T4(view, 0.0f);
        }
        C21392318nh c21392318nh = new C21392318nh(view);
        c21392318nh.LIZ(1.0f, 8);
        c21392318nh.LIZ(1.0f, 16);
        if (z) {
            c21392318nh.LIZ(1.0f, SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);
        }
        List<Animator> listLIZJ = c21392318nh.LIZJ();
        if (listLIZJ == null || ((ArrayList) listLIZJ).isEmpty()) {
            return null;
        }
        final ArrayList arrayList = (ArrayList) listLIZJ;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Animator) it2.next()).setDuration(j);
        }
        Interpolator interpolatorLIZLLL = LIZLLL();
        C21390118nL c21390118nL = (C21390118nL) view.findViewById(R.id.tyd);
        if (c21390118nL != null) {
            c21390118nL.LIZ(f, 1.0f, j, 2, interpolatorLIZLLL, new InterfaceC21390418nO() { // from class: X.0rwW
                @Override // X.InterfaceC21390418nO
                public final void LIZ(AwS576S0100000_32 awS576S0100000_32) {
                    List<Animator> list = arrayList;
                    C118300cf c118300cf = new C118300cf();
                    c118300cf.element = list.size();
                    Iterator<Animator> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().addListener(new ALAdapterS18S0200000_24(c118300cf, awS576S0100000_32, 2));
                    }
                }
            });
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((Animator) it3.next()).start();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(j);
        duration.addListener(new ALAdapterS8S0110000_24(view, z, 0));
        return duration;
    }
}
