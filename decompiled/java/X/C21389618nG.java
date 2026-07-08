package X;

import Y.ALAdapterS26S0100000_32;
import Y.ALAdapterS26S0200000_32;
import Y.ALAdapterS6S0000000_32;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.fragment.app.Fragment;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.IStorySafCompatAbility;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.18nG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21389618nG {
    public static final List<Animator> LIZ(View view) {
        if (!C21392318nh.LIZIZ()) {
            return C13BV.INSTANCE;
        }
        C786410Ut5.Ob(view, 1.0f);
        C786410Ut5.pc(view, 1.0f);
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        C21390118nL c21390118nL = (C21390118nL) view.findViewById(R.id.tyd);
        C21392318nh c21392318nh = new C21392318nh(view);
        c21392318nh.LIZ(0.0f, 8);
        c21392318nh.LIZ(0.0f, 16);
        c21392318nh.LIZ(0.0f, SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);
        List<Animator> listLIZJ = c21392318nh.LIZJ();
        if (listLIZJ != null && !((ArrayList) listLIZJ).isEmpty()) {
            long jLIZ = C294650Bgl.LIZ();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZJ, 10));
            final ArrayList arrayList2 = (ArrayList) listLIZJ;
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((Animator) it2.next()).setDuration(jLIZ));
            }
            if (c21390118nL != null) {
                c21390118nL.LIZ(1.0f, 0.0f, jLIZ, 2, null, new InterfaceC21390418nO() { // from class: X.18nJ
                    @Override // X.InterfaceC21390418nO
                    public final void LIZ(AwS576S0100000_32 awS576S0100000_32) {
                        List<Animator> list = arrayList2;
                        C118300cf c118300cf = new C118300cf();
                        c118300cf.element = list.size();
                        Iterator<Animator> it3 = list.iterator();
                        while (it3.hasNext()) {
                            it3.next().addListener(new ALAdapterS26S0200000_32(awS576S0100000_32, c118300cf, 6));
                        }
                    }
                });
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((Animator) it3.next()).start();
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public static final List<Animator> LIZIZ(View view) {
        if (!C21392318nh.LIZIZ()) {
            return C13BV.INSTANCE;
        }
        C786410Ut5.Ob(view, 1.0f);
        C786410Ut5.pc(view, 1.0f);
        C786410Ut5.T4(view, 1.0f);
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        C21390118nL c21390118nL = (C21390118nL) view.findViewById(R.id.tyd);
        long jLIZ = C294650Bgl.LIZ();
        long jLIZ2 = C289430BWb.LIZ();
        Interpolator interpolatorLIZIZ = C0GY9.LIZIZ(0.7f, 0.0f, 1.0f, 1.0f);
        C21392318nh c21392318nh = new C21392318nh(view);
        c21392318nh.LIZ(0.0f, 8);
        c21392318nh.LIZ(0.0f, 16);
        List<Animator> listLIZJ = c21392318nh.LIZJ();
        if (listLIZJ != null && !((ArrayList) listLIZJ).isEmpty()) {
            ArrayList<Animator> arrayList = (ArrayList) listLIZJ;
            for (Animator animator : arrayList) {
                animator.setDuration(jLIZ);
                animator.setInterpolator(interpolatorLIZIZ);
            }
            C21392318nh c21392318nh2 = new C21392318nh(view);
            c21392318nh2.LIZ(0.0f, SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);
            List<Animator> listLIZJ2 = c21392318nh2.LIZJ();
            if (listLIZJ2 != null && !((ArrayList) listLIZJ2).isEmpty()) {
                ArrayList<Animator> arrayList2 = (ArrayList) listLIZJ2;
                for (Animator animator2 : arrayList2) {
                    animator2.setDuration(jLIZ2);
                    animator2.setInterpolator(new LinearInterpolator());
                }
                final List<Animator> listLJLIL = C13LP.LJLIL(arrayList2, arrayList);
                if (c21390118nL != null) {
                    c21390118nL.LIZ(1.0f, 0.0f, jLIZ, 2, interpolatorLIZIZ, new InterfaceC21390418nO() { // from class: X.18nI
                        @Override // X.InterfaceC21390418nO
                        public final void LIZ(AwS576S0100000_32 awS576S0100000_32) {
                            List<Animator> list = listLJLIL;
                            C118300cf c118300cf = new C118300cf();
                            c118300cf.element = list.size();
                            Iterator<Animator> it2 = list.iterator();
                            while (it2.hasNext()) {
                                it2.next().addListener(new ALAdapterS26S0200000_32(awS576S0100000_32, c118300cf, 7));
                            }
                        }
                    });
                }
                Iterator it2 = ((ArrayList) listLJLIL).iterator();
                while (it2.hasNext()) {
                    ((Animator) it2.next()).start();
                }
                return listLJLIL;
            }
            return C13BV.INSTANCE;
        }
        return C13BV.INSTANCE;
    }

    public static final List<Animator> LIZJ(final View view) {
        if (!C21392318nh.LIZIZ()) {
            return C13BV.INSTANCE;
        }
        C786410Ut5.Ob(view, 0.0f);
        C786410Ut5.pc(view, 0.0f);
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        C21390118nL c21390118nL = (C21390118nL) view.findViewById(R.id.tyd);
        C21392318nh c21392318nh = new C21392318nh(view);
        c21392318nh.LIZ(1.0f, 8);
        c21392318nh.LIZ(1.0f, 16);
        List<Animator> listLIZJ = c21392318nh.LIZJ();
        if (listLIZJ != null && !((ArrayList) listLIZJ).isEmpty()) {
            long jLIZ = C276500Asa.LIZ();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZJ, 10));
            final ArrayList arrayList2 = (ArrayList) listLIZJ;
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((Animator) it2.next()).setDuration(jLIZ));
            }
            if (c21390118nL != null) {
                c21390118nL.LIZ(0.0f, 1.0f, jLIZ, 2, null, new InterfaceC21390418nO() { // from class: X.18nK
                    @Override // X.InterfaceC21390418nO
                    public final void LIZ(final AwS576S0100000_32 awS576S0100000_32) {
                        List<Animator> list = arrayList2;
                        final View view2 = view;
                        final C118300cf c118300cf = new C118300cf();
                        c118300cf.element = list.size();
                        Iterator<Animator> it3 = list.iterator();
                        while (it3.hasNext()) {
                            it3.next().addListener(new AnimatorListenerAdapter() { // from class: X.18nM
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator animator) {
                                    C118300cf c118300cf2 = c118300cf;
                                    int i = c118300cf2.element - 1;
                                    c118300cf2.element = i;
                                    if (i == 0) {
                                        awS576S0100000_32.invoke();
                                        C21389618nG.LJII(view2);
                                    }
                                }
                            });
                        }
                    }
                });
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((Animator) it3.next()).start();
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public static final Animator LJ(View view) {
        C786410Ut5.Ob(view, 1.0f);
        C786410Ut5.pc(view, 1.0f);
        C786410Ut5.T4(view, 1.0f);
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        Interpolator interpolatorLIZIZ = C0GY9.LIZIZ(0.7f, 0.0f, 1.0f, 1.0f);
        long jLIZ = C294650Bgl.LIZ();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(jLIZ);
        objectAnimatorOfFloat.setInterpolator(interpolatorLIZIZ);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.0f);
        objectAnimatorOfFloat2.setDuration(jLIZ);
        objectAnimatorOfFloat2.setInterpolator(interpolatorLIZIZ);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat3.setDuration(C289430BWb.LIZ());
        objectAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        return animatorSet;
    }

    public static final void LJII(View view) {
        Fragment fragmentLIZ;
        IStorySafCompatAbility iStorySafCompatAbility;
        view.setTag(R.id.w9y, Boolean.TRUE);
        IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
        if (iDetailFeedSafService != null && (fragmentLIZ = iDetailFeedSafService.LIZ(view)) != null && (iStorySafCompatAbility = (IStorySafCompatAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLIZ, null), IStorySafCompatAbility.class, null)) != null) {
            iStorySafCompatAbility.j12();
        }
    }

    public static final Animator LIZLLL(View view, InterpolatorC448120Hhi interpolatorC448120Hhi) {
        C786410Ut5.Ob(view, 1.0f);
        C786410Ut5.pc(view, 1.0f);
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setDuration(C294650Bgl.LIZ());
        animatorSet.setInterpolator(interpolatorC448120Hhi);
        return animatorSet;
    }

    public static final Animator LJFF(View view, Interpolator interpolator) {
        C786410Ut5.Ob(view, 0.0f);
        C786410Ut5.pc(view, 0.0f);
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setDuration(C276500Asa.LIZ());
        animatorSet.setInterpolator(interpolator);
        animatorSet.addListener(new ALAdapterS26S0100000_32(view, 15));
        return animatorSet;
    }

    public static final Animator LJI(View view, boolean z) {
        List listLIZJ;
        if (z) {
            C710330Rtf.LIZJ(false, false);
            return LJFF(view, C1619980sG4.LIZIZ());
        }
        try {
            listLIZJ = LIZJ(view);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            listLIZJ = C13BV.INSTANCE;
        }
        if (!(!listLIZJ.isEmpty())) {
            C710330Rtf.LIZJ(true, false);
            return LJFF(view, C1619980sG4.LIZIZ());
        }
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(C276500Asa.LIZ());
        duration.addListener(new ALAdapterS6S0000000_32(1));
        C710330Rtf.LIZJ(true, true);
        return duration;
    }
}
