package X;

import Y.AAListenerS141S0300000_26;
import Y.ARunnableS39S0300000_6;
import Y.AUListenerS255S0100000_5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS7S0700000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vt3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1759470vt3 {
    public ObjectAnimator LIZ;
    public ObjectAnimator LIZIZ;
    public final HashMap<EnumC1759580vtE, SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB> LIZJ = new HashMap<>();

    public final void LIZ(ViewGroup viewGroup, EnumC1759580vtE enumC1759580vtE) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LIZJ.get(enumC1759580vtE);
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            C786410Ut5.LJLLLLLL(8, viewGroup);
            if (viewGroup.indexOfChild(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) != -1) {
                C786410Ut5.LJJJLZIJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, viewGroup);
            }
            boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
            this.LIZJ.remove(enumC1759580vtE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(final X.EnumC1759580vtE r22, final X.C1759590vtF r23, android.content.Context r24, final android.view.ViewGroup r25, com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel r26, final kotlin.jvm.functions.Function0<kotlin.Unit> r27, final kotlin.jvm.functions.Function0<kotlin.Unit> r28) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1759470vt3.LIZJ(X.0vtE, X.0vtF, android.content.Context, android.view.ViewGroup, com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0):void");
    }

    public static void LIZIZ(final C1759470vt3 c1759470vt3, View view, final EnumC1759580vtE enumC1759580vtE, Integer num, Boolean bool, Function0 function0, AwS7S0700000_26 awS7S0700000_26, Function0 function02, int i) {
        AwS7S0700000_26 awS7S0700000_262 = awS7S0700000_26;
        Function0 function03 = function0;
        Boolean bool2 = bool;
        if ((i & 8) != 0) {
            bool2 = Boolean.FALSE;
        }
        Function0 function04 = null;
        if ((i & 16) != 0) {
            function03 = null;
        }
        if ((i & 32) != 0) {
            awS7S0700000_262 = null;
        }
        if ((i & 64) == 0) {
            function04 = function02;
        }
        c1759470vt3.getClass();
        if (view instanceof ViewGroup) {
            EnumC1759580vtE enumC1759580vtE2 = EnumC1759580vtE.BOTTOM;
            if (enumC1759580vtE == enumC1759580vtE2 && Intrinsics.LJFF(bool2, Boolean.TRUE)) {
                ViewGroup viewGroup = (ViewGroup) view;
                AwS427S0200000_26 awS427S0200000_26 = new AwS427S0200000_26(function03, (Function0<Unit>) function04, (Function0<Unit>) 94);
                if (viewGroup != null) {
                    HandlerHook.viewPost(viewGroup, new ARunnableS39S0300000_6(viewGroup, c1759470vt3, awS427S0200000_26, 25));
                    return;
                }
                return;
            }
            if (num != null) {
                if (num.intValue() == 0) {
                    final ViewGroup viewGroup2 = (ViewGroup) view;
                    if (viewGroup2 == null || viewGroup2.getVisibility() != 0) {
                        return;
                    }
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup2, (Property<ViewGroup, Float>) View.TRANSLATION_Y, viewGroup2.getTranslationY(), 0.0f);
                    objectAnimatorOfFloat.setInterpolator(new PathInterpolator(0.42f, 0.0f, 0.75f, 0.53f));
                    objectAnimatorOfFloat.setDuration(400L);
                    objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: X.0vtI
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            this.LL.LIZ(viewGroup2, enumC1759580vtE);
                        }
                    });
                    C786410Ut5.Pd(objectAnimatorOfFloat);
                    return;
                }
                if (num.intValue() == 1) {
                    ViewGroup viewGroup3 = (ViewGroup) view;
                    if (viewGroup3 == null || viewGroup3.getVisibility() != 0) {
                        return;
                    }
                    float translationY = viewGroup3.getTranslationY();
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(viewGroup3, (Property<ViewGroup, Float>) View.TRANSLATION_Y, translationY, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200)) + translationY);
                    objectAnimatorOfFloat2.setInterpolator(new PathInterpolator(0.55f, 0.0f, 0.82f, 0.48f));
                    objectAnimatorOfFloat2.setDuration(400L);
                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(viewGroup3, (Property<ViewGroup, Float>) View.ALPHA, 1.0f, 0.0f);
                    objectAnimatorOfFloat3.setInterpolator(new PathInterpolator(0.33f, 0.0f, 0.67f, 1.0f));
                    objectAnimatorOfFloat3.setDuration(200L);
                    objectAnimatorOfFloat2.addUpdateListener(new AUListenerS255S0100000_5(objectAnimatorOfFloat3, 38));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.play(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3);
                    animatorSet.addListener(new AAListenerS141S0300000_26(viewGroup3, enumC1759580vtE, c1759470vt3, 1));
                    animatorSet.start();
                    return;
                }
                c1759470vt3.LIZ((ViewGroup) view, enumC1759580vtE);
                return;
            }
            if (enumC1759580vtE == enumC1759580vtE2) {
                ViewGroup viewGroup4 = (ViewGroup) view;
                C1759610vtH c1759610vtH = new C1759610vtH(c1759470vt3, view, enumC1759580vtE, awS7S0700000_262, function04);
                if (viewGroup4 == null) {
                    return;
                }
                HandlerHook.viewPost(viewGroup4, new ARunnableS39S0300000_6(viewGroup4, c1759470vt3, c1759610vtH, 25));
                return;
            }
            c1759470vt3.LIZ((ViewGroup) view, enumC1759580vtE);
        }
    }
}
