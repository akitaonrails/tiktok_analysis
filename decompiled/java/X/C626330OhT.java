package X;

import Y.AAListenerS28S0301000_9;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.animation.Interpolator;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.story.experiment.feed.StoryGestureConfig;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OhT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C626330OhT {
    public static void LIZ(final C714420S0q c714420S0q, int i, final Fragment fragment) {
        int currentItem;
        Interpolator interpolatorLIZLLL = C1619980sG4.LIZLLL();
        int width = c714420S0q.getWidth();
        if (!c714420S0q.LLLIZZ) {
            if (C444960Hcc.LIZIZ()) {
                currentItem = c714420S0q.getCurrentItem() - i;
            } else {
                currentItem = i - c714420S0q.getCurrentItem();
            }
            final ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, width * currentItem);
            final C118300cf c118300cf = new C118300cf();
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0Oa9
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C128Y c128yLIZLLL;
                    boolean zIsFinishing;
                    Integer num;
                    Object c098200Yq;
                    InterfaceC214902198i interfaceC214902198i;
                    IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
                    Boolean boolValueOf = null;
                    if (iDetailFeedSafService != null) {
                        c128yLIZLLL = iDetailFeedSafService.LIZLLL(fragment);
                    } else {
                        c128yLIZLLL = null;
                    }
                    if ((c128yLIZLLL instanceof InterfaceC214902198i) && (interfaceC214902198i = (InterfaceC214902198i) c128yLIZLLL) != null) {
                        if (!SAFExtensionKt.LJIIZILJ(interfaceC214902198i) && !interfaceC214902198i.SL()) {
                            zIsFinishing = false;
                        } else {
                            zIsFinishing = true;
                        }
                    } else {
                        Activity activityLIZ = C1388190mED.LIZ(c714420S0q.getContext());
                        if (activityLIZ != null) {
                            zIsFinishing = activityLIZ.isFinishing();
                        }
                        if (!Intrinsics.LJFF(boolValueOf, Boolean.FALSE) && fragment.getActivity() != null) {
                            Object animatedValue = valueAnimator.getAnimatedValue();
                            if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
                                int iIntValue = num.intValue();
                                try {
                                    c714420S0q.LJIILIIL(-(iIntValue - c118300cf.element));
                                    c098200Yq = Unit.LIZ;
                                    C189200o6.m2constructorimpl(c098200Yq);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    c098200Yq = new C098200Yq(th);
                                    C189200o6.m2constructorimpl(c098200Yq);
                                }
                                ValueAnimator valueAnimator2 = valueAnimatorOfInt;
                                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                                    valueAnimator2.cancel();
                                    return;
                                } else {
                                    c118300cf.element = iIntValue;
                                    return;
                                }
                            }
                            return;
                        }
                        valueAnimatorOfInt.cancel();
                    }
                    boolValueOf = Boolean.valueOf(zIsFinishing);
                    if (!Intrinsics.LJFF(boolValueOf, Boolean.FALSE)) {
                    }
                    valueAnimatorOfInt.cancel();
                }
            });
            valueAnimatorOfInt.addListener(new AAListenerS28S0301000_9(fragment, c714420S0q, i, c714420S0q, 2));
            valueAnimatorOfInt.setInterpolator(interpolatorLIZLLL);
            valueAnimatorOfInt.setDuration(((StoryGestureConfig) C626340OhU.LIZIZ.getValue()).ttStoryHorizontalSwitchUserAnimInterval);
            valueAnimatorOfInt.start();
        }
    }
}
