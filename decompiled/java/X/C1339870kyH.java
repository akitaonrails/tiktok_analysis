package X;

import Y.ALAdapterS10S0300000_21;
import Y.ARunnableS121S0100000_21;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS80S0500000_21;

/* JADX INFO: renamed from: X.0kyH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1339870kyH {
    public Animator LIZ;
    public Animator LIZIZ;
    public int LIZJ;

    public static void LIZIZ(View view, Map map) {
        if (map.containsKey(Integer.valueOf(view.getId()))) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                LIZIZ(viewGroup.getChildAt(i), map);
            }
        }
    }

    public static void LIZJ(View view, Map map) {
        int iIntValue;
        if (map.containsKey(Integer.valueOf(view.getId()))) {
            Integer num = (Integer) map.get(Integer.valueOf(view.getId()));
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 8;
            }
            C786410Ut5.LJLLLLLL(iIntValue, view);
            map.remove(Integer.valueOf(view.getId()));
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                LIZJ(viewGroup.getChildAt(i), map);
            }
        }
    }

    public static void LIZ(View view, List list, Map map) {
        if (list.contains(Integer.valueOf(view.getId())) && view.getVisibility() != 8) {
            map.put(Integer.valueOf(view.getId()), Integer.valueOf(view.getVisibility()));
            C786410Ut5.LJLLLLLL(8, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                LIZ(viewGroup.getChildAt(i), list, map);
            }
        }
    }

    public static void LIZLLL(View view, List list, Map map) {
        if (list.contains(Integer.valueOf(view.getId())) && view.getVisibility() != 8) {
            map.put(Integer.valueOf(view.getId()), Integer.valueOf(view.getVisibility()));
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                LIZLLL(viewGroup.getChildAt(i), list, map);
            }
        }
    }

    public final void LJ(C1345550l7R c1345550l7R, final View view, final C1353360lK2 c1353360lK2, final Map<Integer, Integer> map, final List<Integer> list, final TuxTextView tuxTextView, final boolean z) {
        int height;
        int height2;
        long j;
        long j2;
        if (c1345550l7R != null) {
            c1345550l7R.setIsHateAnimating(true);
        }
        if (C294180Bg0.LIZIZ()) {
            HandlerHook.viewPostDelay(view, new ARunnableS121S0100000_21(view, 142), 240L);
        }
        if (c1353360lK2 != null) {
            height = c1353360lK2.getHeight();
        } else {
            height = 0;
        }
        this.LIZJ = height;
        if (c1353360lK2 != null) {
            height2 = c1353360lK2.getHeight();
        } else {
            height2 = 0;
        }
        Animator animatorLIZ = C1342140l1w.LIZ(c1353360lK2, height2, 0, new AwS80S0500000_21(this, (C1339870kyH) view, (View) map, (Map<Integer, Integer>) list, (List<Integer>) tuxTextView, (TuxTextView) 5), 8);
        ObjectAnimator objectAnimatorOfFloat = null;
        if (animatorLIZ != null) {
            if (C294180Bg0.LIZIZ()) {
                j2 = 2240;
            } else {
                j2 = 240;
            }
            animatorLIZ.setStartDelay(j2);
            animatorLIZ.addListener(new AnimatorListenerAdapter() { // from class: X.0kyI
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    if (z) {
                        C1353360lK2 c1353360lK22 = c1353360lK2;
                        if (c1353360lK22 != null) {
                            C786410Ut5.w(c1353360lK22, 4);
                        }
                        C1353360lK2 c1353360lK23 = c1353360lK2;
                        if (c1353360lK23 != null) {
                            c1353360lK23.setMaxHeight(0);
                        }
                    } else {
                        C1353360lK2 c1353360lK24 = c1353360lK2;
                        if (c1353360lK24 != null) {
                            C786410Ut5.w(c1353360lK24, 8);
                        }
                    }
                    if (C07CE.LIZ()) {
                        C1339870kyH c1339870kyH = this;
                        View view2 = view;
                        Map<Integer, Integer> map2 = map;
                        c1339870kyH.getClass();
                        C1339870kyH.LIZIZ(view2, map2);
                    } else {
                        C1339870kyH c1339870kyH2 = this;
                        View view3 = view;
                        List<Integer> list2 = list;
                        Map<Integer, Integer> map3 = map;
                        c1339870kyH2.getClass();
                        C1339870kyH.LIZ(view3, list2, map3);
                    }
                    TuxTextView tuxTextView2 = tuxTextView;
                    if (tuxTextView2 != null) {
                        C786410Ut5.LLLLZLL(tuxTextView2, 0);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    if (z) {
                        C1353360lK2 c1353360lK22 = c1353360lK2;
                        if (c1353360lK22 != null) {
                            C786410Ut5.w(c1353360lK22, 4);
                        }
                        C1353360lK2 c1353360lK23 = c1353360lK2;
                        if (c1353360lK23 != null) {
                            c1353360lK23.setMaxHeight(0);
                        }
                    } else {
                        C1353360lK2 c1353360lK24 = c1353360lK2;
                        if (c1353360lK24 != null) {
                            C786410Ut5.w(c1353360lK24, 8);
                        }
                    }
                    this.LIZ = null;
                }
            });
            animatorLIZ.start();
        } else {
            animatorLIZ = null;
        }
        this.LIZ = animatorLIZ;
        if (tuxTextView != null) {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxTextView, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(120L);
            if (C294180Bg0.LIZIZ()) {
                j = 2240;
            } else {
                j = 240;
            }
            objectAnimatorOfFloat.setStartDelay(j);
            objectAnimatorOfFloat.addListener(new ALAdapterS10S0300000_21(c1345550l7R, this, tuxTextView, 2));
            objectAnimatorOfFloat.start();
        }
        this.LIZIZ = objectAnimatorOfFloat;
    }
}
