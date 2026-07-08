package X;

import Y.AAListenerS334S0100000_24;
import Y.ALAdapterS0S0200001_24;
import Y.ALAdapterS18S0200000_24;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.0rwZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1607890rwZ {
    public static final /* synthetic */ int LIZ = 0;

    public static C1607880rwY LJ(boolean z, Long l, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return new C1607880rwY(l, z, z2);
    }

    public static Animator LJFF(View view, View view2, Long l, boolean z) {
        boolean z2;
        float f;
        long integer;
        List listLIZ;
        float width = view2.getWidth();
        boolean z3 = false;
        if (view2.getLayoutDirection() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            f = -width;
        } else {
            f = width;
        }
        if (view2.getLayoutDirection() == 1) {
            z3 = true;
        }
        if (!z3) {
            width = -width;
        }
        if (l != null) {
            integer = l.longValue();
        } else {
            integer = view2.getContext().getResources().getInteger(R.integer.b0);
        }
        if (!z) {
            return LIZLLL(view, view2, f, width, integer);
        }
        try {
            listLIZ = LIZ(view, view2, f, width, integer);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            listLIZ = C13BV.INSTANCE;
        }
        if (!(!listLIZ.isEmpty())) {
            return LIZLLL(view, view2, f, width, integer);
        }
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(integer);
        duration.addListener(new ALAdapterS0S0200001_24(view, view2, f, 0));
        return duration;
    }

    public static List LIZ(View view, View view2, float f, float f2, long j) {
        long j2 = j;
        if (!C21392318nh.LIZIZ()) {
            return C13BV.INSTANCE;
        }
        C786410Ut5.Jc(view, 0.0f);
        C786410Ut5.Jc(view2, f2);
        C21390118nL c21390118nL = (C21390118nL) view.findViewById(R.id.tyd);
        C21390118nL c21390118nL2 = (C21390118nL) view2.findViewById(R.id.tyd);
        C21392318nh c21392318nh = new C21392318nh(view);
        c21392318nh.LIZ(f, 1);
        final List<Animator> listLIZJ = c21392318nh.LIZJ();
        C21392318nh c21392318nh2 = new C21392318nh(view2);
        c21392318nh2.LIZ(0.0f, 1);
        final List<Animator> listLIZJ2 = c21392318nh2.LIZJ();
        if (listLIZJ != null && !((ArrayList) listLIZJ).isEmpty() && listLIZJ2 != null && !((ArrayList) listLIZJ2).isEmpty()) {
            int iLIZ = C054J.LIZ();
            if (iLIZ != 1) {
                if (iLIZ != 2) {
                    if (iLIZ == 3) {
                        j2 = 200;
                    }
                } else {
                    j2 = 300;
                }
            } else {
                j2 = 260;
            }
            List listLJLIL = C13LP.LJLIL(listLIZJ2, listLIZJ);
            ArrayList<Animator> arrayList = (ArrayList) listLJLIL;
            for (Animator animator : arrayList) {
                animator.setDuration(j2);
                if (C054J.LIZIZ) {
                    animator.setInterpolator(C1619980sG4.LJIILIIL());
                }
            }
            if (c21390118nL != null && c21390118nL2 != null) {
                c21390118nL.LIZ(0.0f, f, j2, null, null, new InterfaceC21390418nO() { // from class: X.0rwb
                    @Override // X.InterfaceC21390418nO
                    public final void LIZ(AwS576S0100000_32 awS576S0100000_32) {
                        List<Animator> list = listLIZJ;
                        C118300cf c118300cf = new C118300cf();
                        c118300cf.element = list.size();
                        Iterator<Animator> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().addListener(new ALAdapterS18S0200000_24(c118300cf, awS576S0100000_32, 3));
                        }
                    }
                });
                c21390118nL2.LIZ(f2, 0.0f, j2, null, null, new InterfaceC21390418nO() { // from class: X.0rwc
                    @Override // X.InterfaceC21390418nO
                    public final void LIZ(AwS576S0100000_32 awS576S0100000_32) {
                        List<Animator> list = listLIZJ2;
                        C118300cf c118300cf = new C118300cf();
                        c118300cf.element = list.size();
                        Iterator<Animator> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().addListener(new ALAdapterS18S0200000_24(c118300cf, awS576S0100000_32, 3));
                        }
                    }
                });
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((Animator) it2.next()).start();
            }
            return listLJLIL;
        }
        return C13BV.INSTANCE;
    }

    public static Animator LIZJ(View view, int i, int i2, float f, long j) {
        if (!C21392318nh.LIZIZ()) {
            return null;
        }
        view.setPivotX(i);
        view.setPivotY(i2);
        C786410Ut5.Ob(view, f);
        C786410Ut5.pc(view, f);
        C21392318nh c21392318nh = new C21392318nh(view);
        c21392318nh.LIZ(1.0f, 8);
        c21392318nh.LIZ(1.0f, 16);
        List<Animator> listLIZJ = c21392318nh.LIZJ();
        if (listLIZJ == null || ((ArrayList) listLIZJ).isEmpty()) {
            return null;
        }
        Interpolator interpolatorLJIIIZ = C1619980sG4.LJIIIZ();
        final ArrayList<Animator> arrayList = (ArrayList) listLIZJ;
        for (Animator animator : arrayList) {
            animator.setDuration(j);
            animator.setInterpolator(interpolatorLJIIIZ);
        }
        C21390118nL c21390118nL = (C21390118nL) view.findViewById(R.id.tyd);
        if (c21390118nL != null) {
            c21390118nL.LIZ(f, 1.0f, j, 2, interpolatorLJIIIZ, new InterfaceC21390418nO() { // from class: X.0rwe
                @Override // X.InterfaceC21390418nO
                public final void LIZ(AwS576S0100000_32 awS576S0100000_32) {
                    List<Animator> list = arrayList;
                    C118300cf c118300cf = new C118300cf();
                    c118300cf.element = list.size();
                    Iterator<Animator> it2 = list.iterator();
                    while (it2.hasNext()) {
                        it2.next().addListener(new ALAdapterS18S0200000_24(c118300cf, awS576S0100000_32, 3));
                    }
                }
            });
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Animator) it2.next()).start();
        }
        return ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(j);
    }

    public static Animator LIZLLL(View view, View view2, float f, float f2, long j) {
        C786410Ut5.Jc(view, 0.0f);
        C786410Ut5.Jc(view2, f2);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, 0.0f, f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, f2, 0.0f);
        if (C054J.LIZIZ) {
            objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJIILIIL());
            objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LJIILIIL());
        }
        int iLIZ = C054J.LIZ();
        if (iLIZ != 1) {
            if (iLIZ != 2) {
                if (iLIZ == 3) {
                    j = 200;
                }
            } else {
                j = 300;
            }
        } else {
            j = 260;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setDuration(j);
        animatorSet.addListener(new AAListenerS334S0100000_24(view, 8));
        return animatorSet;
    }

    public static Animator LIZIZ(View view, int i, int i2, int i3, int i4, long j) {
        boolean z;
        if (!C21392318nh.LIZIZ()) {
            return null;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        float fLJ = C13LZ.LJ(i3, 1, width) / width;
        float fLJ2 = C13LZ.LJ(i4, 1, height) / height;
        if (fLJ == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        float f = i;
        if (!z) {
            f /= 1.0f - fLJ;
        }
        view.setPivotX(f);
        view.setPivotY(fLJ2 == 1.0f ? i2 : i2 / (1.0f - fLJ2));
        C786410Ut5.Ob(view, fLJ);
        C786410Ut5.pc(view, fLJ2);
        C786410Ut5.T4(view, 0.5f);
        C21392318nh c21392318nh = new C21392318nh(view);
        c21392318nh.LIZ(1.0f, 8);
        c21392318nh.LIZ(1.0f, 16);
        c21392318nh.LIZ(1.0f, SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);
        List<Animator> listLIZJ = c21392318nh.LIZJ();
        if (listLIZJ == null || ((ArrayList) listLIZJ).isEmpty()) {
            return null;
        }
        Interpolator interpolatorLJIILIIL = C1619980sG4.LJIILIIL();
        final ArrayList<Animator> arrayList = (ArrayList) listLIZJ;
        for (Animator animator : arrayList) {
            animator.setDuration(j);
            animator.setInterpolator(interpolatorLJIILIIL);
        }
        C21390118nL c21390118nL = (C21390118nL) view.findViewById(R.id.tyd);
        if (c21390118nL != null) {
            c21390118nL.LIZ(fLJ, 1.0f, j, 2, interpolatorLJIILIIL, new InterfaceC21390418nO() { // from class: X.0rwd
                @Override // X.InterfaceC21390418nO
                public final void LIZ(AwS576S0100000_32 awS576S0100000_32) {
                    List<Animator> list = arrayList;
                    C118300cf c118300cf = new C118300cf();
                    c118300cf.element = list.size();
                    Iterator<Animator> it2 = list.iterator();
                    while (it2.hasNext()) {
                        it2.next().addListener(new ALAdapterS18S0200000_24(c118300cf, awS576S0100000_32, 3));
                    }
                }
            });
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Animator) it2.next()).start();
        }
        return ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(j);
    }
}
