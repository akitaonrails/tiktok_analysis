package X;

import Y.AAListenerS266S0200000_14;
import Y.AAListenerS325S0100000_14;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.LongPressConfig;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS415S0200000_14;

/* JADX INFO: renamed from: X.0ZrO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C912760ZrO extends C458860Hz2 {
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final View LLJJJJLIIL;
    public final View LLJJL;
    public Animator LLJJLIIIJLLLLLLLZ;

    private final int getBottomPadding() {
        return ((Number) this.LLJJJ.getValue()).intValue();
    }

    private final int getDefaultActionSidePadding() {
        return ((Number) this.LLJJJJJIL.getValue()).intValue();
    }

    private final int getItemSpacing() {
        return ((Number) this.LLJJIJIIJIL.getValue()).intValue();
    }

    private final int getLeftPadding() {
        return ((Number) this.LLJJJIL.getValue()).intValue();
    }

    private final int getReactionHorizontalPaddingPx() {
        return ((Number) this.LLJJIII.getValue()).intValue();
    }

    private final int getReactionVerticalPaddingPx() {
        return ((Number) this.LLJJIJI.getValue()).intValue();
    }

    private final int getRightPadding() {
        return ((Number) this.LLJJJJ.getValue()).intValue();
    }

    private final int getTopPadding() {
        return ((Number) this.LLJJIJIL.getValue()).intValue();
    }

    @Override // X.C893640Z3y
    public final void LIZ(C0ZL0 c0zl0) {
        boolean z;
        boolean z2;
        if (getCurrentDisplayState() == EnumC912750ZrN.VISIBLE) {
            Animator currentAnimator = getCurrentAnimator();
            if (currentAnimator != null && currentAnimator.isRunning()) {
                return;
            }
            Animator animator = this.LLJJLIIIJLLLLLLLZ;
            if (animator != null) {
                animator.cancel();
            }
            this.LLJJLIIIJLLLLLLLZ = null;
            setCurrentDisplayState(EnumC912750ZrN.HIDDEN);
            AnimatorSet animatorSet = new AnimatorSet();
            Animator[] animatorArr = new Animator[4];
            CardView reactionSelectionPanel = getReactionSelectionPanel();
            AwS415S0200000_14 awS415S0200000_14 = new AwS415S0200000_14(reactionSelectionPanel, getLastEntryState(), 100);
            AnimatorSet animatorSet2 = new AnimatorSet();
            if (reactionSelectionPanel.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                awS415S0200000_14.invoke();
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(reactionSelectionPanel, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(reactionSelectionPanel, "scaleX", 1.0f, 0.8f), ObjectAnimator.ofFloat(reactionSelectionPanel, "scaleY", 1.0f, 0.8f));
                animatorSet2.addListener(new AAListenerS266S0200000_14(reactionSelectionPanel, awS415S0200000_14, 6));
                animatorSet2.setInterpolator(C1619980sG4.LJIILIIL());
            }
            animatorArr[0] = animatorSet2;
            FrameLayout actionPanel = getActionPanel();
            AwS415S0200000_14 awS415S0200000_142 = new AwS415S0200000_14(actionPanel, getLastEntryState(), 98);
            AnimatorSet animatorSet3 = new AnimatorSet();
            if (actionPanel.getVisibility() == 0) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(actionPanel, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(actionPanel, "scaleX", 1.0f, 0.8f), ObjectAnimator.ofFloat(actionPanel, "scaleY", 1.0f, 0.8f));
                animatorSet3.addListener(new AAListenerS266S0200000_14(actionPanel, awS415S0200000_142, 5));
                animatorSet3.setInterpolator(C1619980sG4.LJIILIIL());
            } else {
                awS415S0200000_142.invoke();
            }
            animatorArr[1] = animatorSet3;
            AnimatorSet animatorSet4 = new AnimatorSet();
            if (this.LLJJJJLIIL.getVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && this.LLJJL.getVisibility() == 0) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.LLJJJJLIIL, "alpha", 0.0f), ObjectAnimator.ofFloat(this.LLJJL, "alpha", 0.0f));
                animatorSet4.setDuration(200L);
                animatorSet4.setInterpolator(C1619980sG4.LJIIIZ());
            }
            animatorArr[2] = animatorSet4;
            animatorArr[3] = ObjectAnimator.ofFloat(getMaskViewContainer(), "alpha", 0.85f, 0.0f);
            animatorSet.playTogether(animatorArr);
            animatorSet.addListener(new AAListenerS325S0100000_14(this, 1));
            animatorSet.addListener(new AAListenerS266S0200000_14(this, c0zl0, 3));
            animatorSet.addListener(new AAListenerS266S0200000_14(this, c0zl0, 2));
            animatorSet.setInterpolator(C1619980sG4.LJIIIZ());
            animatorSet.setDuration(200L);
            animatorSet.start();
            setCurrentAnimator(animatorSet);
            AnonymousClass0956 anonymousClass0956 = this.LLJILJIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLJILJIL = null;
        }
    }

    public C912760ZrO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJIII = C1509305vX.LIZ(AnonymousClass0206.get$arr$(377));
        this.LLJJIJI = C1509305vX.LIZ(AnonymousClass0206.get$arr$(378));
        this.LLJJIJIIJIL = C1509305vX.LIZ(AnonymousClass0206.get$arr$(375));
        this.LLJJIJIL = C1509305vX.LIZ(AnonymousClass0206.get$arr$(380));
        this.LLJJJ = C1509305vX.LIZ(AnonymousClass0206.get$arr$(373));
        this.LLJJJIL = C1509305vX.LIZ(AnonymousClass0206.get$arr$(376));
        this.LLJJJJ = C1509305vX.LIZ(AnonymousClass0206.get$arr$(379));
        this.LLJJJJJIL = C1509305vX.LIZ(AnonymousClass0206.get$arr$(374));
        View viewFindViewById = findViewById(R.id.nqm);
        this.LLJJJJLIIL = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.nqc);
        this.LLJJL = viewFindViewById2;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zm, context);
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            viewFindViewById.setBackground(new ColorDrawable(iIntValue));
            viewFindViewById2.setBackground(new ColorDrawable(iIntValue));
            C786410Ut5.T4(viewFindViewById, 0.0f);
            C786410Ut5.T4(viewFindViewById2, 0.0f);
        }
    }

    public static int LJIIIZ(int i, View view) {
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i3 = 0;
        try {
            View viewFindViewById = view.findViewById(i);
            if (viewFindViewById.getVisibility() == 8) {
                return 0;
            }
            int height = viewFindViewById.getHeight();
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                i2 = marginLayoutParams2.topMargin;
            } else {
                i2 = 0;
            }
            int i4 = height + i2;
            ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                i3 = marginLayoutParams.bottomMargin;
            }
            return i4 + i3;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return i3;
        }
    }

    public final void LJIIIIZZ(View view, int i, int i2, int i3) {
        CardView reactionSelectionPanel = getReactionSelectionPanel();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(reactionSelectionPanel);
        reactionSelectionPanel.setY(i);
        C786410Ut5.Md(getActionPanel(), i3);
        Animator animator = this.LLJJLIIIJLLLLLLLZ;
        if (animator != null) {
            animator.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", i2);
        objectAnimatorOfFloat.setStartDelay(200L);
        objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJIIIZ());
        objectAnimatorOfFloat.setDuration(200L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
        this.LLJJLIIIJLLLLLLLZ = objectAnimatorOfFloat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [X.099V, java.lang.Integer, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r20v0, types: [X.05Vn] */
    public final void LJIIJ(List list, C0ZLQ c0zlq, AwS415S0200000_14 awS415S0200000_14, LongPressConfig longPressConfig) {
        FrameLayout.LayoutParams layoutParams;
        int i;
        FrameLayout.LayoutParams layoutParams2;
        int i2;
        Animator animator;
        View view;
        EnumC912790ZrR enumC912790ZrR = longPressConfig.position;
        ?? r13 = 0;
        obj = null;
        Object obj = null;
        if (this.LLILZ == EnumC912750ZrN.HIDDEN && ((animator = this.LLILLL) == null || !animator.isRunning())) {
            this.LLILZ = EnumC912750ZrN.VISIBLE;
            this.LLILZLL = c0zlq;
            this.LLILZIL = enumC912790ZrR;
            c0zlq.LIZIZ();
            Object parent = getParent();
            if ((parent instanceof View) && (view = (View) parent) != null) {
                ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
                if (layoutParams3 != null) {
                    if (layoutParams3.height >= 0) {
                        layoutParams3.height = Math.max(0, (view.getHeight() - view.getPaddingTop()) - view.getPaddingBottom());
                    }
                    C786410Ut5.W5(this, layoutParams3);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            C786410Ut5.LJLLLLLL(0, this);
            C786410Ut5.LJLLLLLL(0, this.LL);
        }
        setupActionsBeforeShow(list);
        setupReactionsBeforeShow(longPressConfig.reactionConfig);
        ViewGroup.LayoutParams layoutParams4 = getReactionSelectionPanel().getLayoutParams();
        if (layoutParams4 instanceof FrameLayout.LayoutParams) {
            layoutParams = (FrameLayout.LayoutParams) layoutParams4;
        } else {
            layoutParams = null;
        }
        int i3 = 8388611;
        if (layoutParams != null) {
            int[] iArr = C912780ZrQ.LIZ;
            int i4 = iArr[enumC912790ZrR.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        i2 = 8388613;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    i2 = 1;
                }
            } else {
                i2 = 8388611;
            }
            layoutParams.gravity = i2;
            int i5 = iArr[enumC912790ZrR.ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        i = 2;
                        C426750GoL.LJIIJ(layoutParams, getContext(), 0, null, Integer.valueOf(getRightPadding() - getReactionHorizontalPaddingPx()), null, 52);
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    i = 2;
                    layoutParams = layoutParams;
                    obj = null;
                    C426750GoL.LJIIJ(layoutParams, getContext(), 0, null, 0, null, 52);
                }
            } else {
                i = 2;
                C426750GoL.LJIIJ(layoutParams, getContext(), Integer.valueOf(getLeftPadding() - getReactionHorizontalPaddingPx()), null, 0, null, 52);
            }
            C786410Ut5.j6(getReactionSelectionPanel(), layoutParams);
            r13 = obj;
        } else {
            i = 2;
        }
        ViewGroup.LayoutParams layoutParams5 = getActionPanel().getLayoutParams();
        if ((layoutParams5 instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams5) != null) {
            int[] iArr2 = C912780ZrQ.LIZ;
            int i6 = iArr2[enumC912790ZrR.ordinal()];
            if (i6 != 1) {
                if (i6 != i) {
                    if (i6 == 3) {
                        i3 = 8388613;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    i3 = 1;
                }
            }
            layoutParams2.gravity = i3;
            int i7 = iArr2[enumC912790ZrR.ordinal()];
            if (i7 != 1) {
                if (i7 != i) {
                    if (i7 == 3) {
                        C426750GoL.LJIIJ(layoutParams2, getContext(), Integer.valueOf(getDefaultActionSidePadding()), r13, Integer.valueOf(getRightPadding()), r13, 52);
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    C426750GoL.LJIIJ(layoutParams2, getContext(), Integer.valueOf(getDefaultActionSidePadding()), r13, Integer.valueOf(getDefaultActionSidePadding()), r13, 52);
                }
            } else {
                C426750GoL.LJIIJ(layoutParams2, getContext(), Integer.valueOf(getLeftPadding()), r13, Integer.valueOf(getDefaultActionSidePadding()), r13, 52);
            }
            C786410Ut5.a6(getActionPanel(), layoutParams2);
        }
        C786410Ut5.LJLLLLLL(4, getReactionSelectionPanel());
        C786410Ut5.LJLLLLLL(4, getActionPanel());
        C23250099c.LIZLLL(getScope(), r13, r13, new C912770ZrP(longPressConfig, awS415S0200000_14, this, list, enumC912790ZrR, r13), 3);
    }

    public final void LJIIJJI(View view, boolean z, LongPressConfig.MovingLongPressPanelConfig movingLongPressPanelConfig, LongPressConfig.LegacyConfig legacyConfig) {
        View view2;
        int i;
        int i2;
        int height;
        int itemSpacing;
        int i3;
        int i4;
        FrameLayout.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        View view3;
        C20244914Jj c20244914JjLIZ;
        C20244914Jj c20244914JjLIZ2;
        if (getCurrentDisplayState() == EnumC912750ZrN.HIDDEN) {
            return;
        }
        view.setElevation(5.0f);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        getLocationOnScreen(iArr2);
        int i5 = iArr[1] - iArr2[1];
        Object parent = view.getParent();
        if (!(parent instanceof View) || (view2 = (View) parent) == null) {
            view2 = view;
        }
        C20246014Ju c20246014JuLIZ = C14K4.LIZ(this);
        int itemSpacing2 = 0;
        if (legacyConfig.e2eMode.isStatusApplied() && c20246014JuLIZ != null && (c20244914JjLIZ2 = c20246014JuLIZ.LIZ(1)) != null) {
            i = c20244914JjLIZ2.LIZIZ;
        } else {
            i = 0;
        }
        if (legacyConfig.e2eMode.isNavBarApplied() && c20246014JuLIZ != null && (c20244914JjLIZ = c20246014JuLIZ.LIZ(2)) != null) {
            i2 = c20244914JjLIZ.LIZLLL;
        } else {
            i2 = 0;
        }
        int height2 = getHeight();
        if (height2 <= 0) {
            return;
        }
        int[] iArr3 = new int[2];
        Object parent2 = view2.getParent();
        if ((parent2 instanceof View) && (view3 = (View) parent2) != null) {
            view3.getLocationOnScreen(iArr3);
        }
        int i6 = iArr3[1] - iArr2[1];
        int height3 = view2.getHeight();
        int i7 = (height2 - i6) - height3;
        if (z) {
            height = getReactionSelectionPanel().getHeight() - (getReactionVerticalPaddingPx() * 2);
        } else {
            height = 0;
        }
        int height4 = view.getHeight() - view.getPaddingBottom();
        Iterator<Integer> it2 = movingLongPressPanelConfig.requireHeightAdjustmentTopComponents.iterator();
        while (it2.hasNext()) {
            int iLJIIIZ = LJIIIZ(it2.next().intValue(), view);
            i5 += iLJIIIZ;
            height4 -= iLJIIIZ;
        }
        Iterator<Integer> it3 = movingLongPressPanelConfig.requireHeightAdjustmentBottomComponents.iterator();
        while (it3.hasNext()) {
            height4 -= LJIIIZ(it3.next().intValue(), view);
        }
        int height5 = getActionPanel().getHeight();
        if (height > 0) {
            itemSpacing = getItemSpacing();
        } else {
            itemSpacing = 0;
        }
        if (height5 > 0) {
            itemSpacing2 = getItemSpacing();
        }
        int topPadding = getTopPadding() + i;
        int bottomPadding = getBottomPadding() + i2;
        int i8 = topPadding + height + itemSpacing;
        int i9 = i8 + height4;
        int i10 = i9 + itemSpacing2 + height5 + bottomPadding;
        ViewGroup.LayoutParams layoutParams3 = this.LLJJJJLIIL.getLayoutParams();
        if ((layoutParams3 instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams3) != null) {
            layoutParams2.height = i6;
            C786410Ut5.W5(this.LLJJJJLIIL, layoutParams2);
        }
        ViewGroup.LayoutParams layoutParams4 = this.LLJJL.getLayoutParams();
        if ((layoutParams4 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams4) != null) {
            layoutParams.height = i7;
            C786410Ut5.W5(this.LLJJL, layoutParams);
        }
        if (i10 <= height2 && i9 <= view2.getHeight() + view2.getY() && height4 <= height3 && height4 + itemSpacing2 + height5 + bottomPadding <= i7 + height3 && (i3 = i5 + height4) <= (i4 = i6 + height3) && i3 <= ((height2 - itemSpacing2) - height5) - bottomPadding) {
            if (i9 <= i4 && i5 >= i8 && i5 >= i6) {
                CardView reactionSelectionPanel = getReactionSelectionPanel();
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(reactionSelectionPanel);
                reactionSelectionPanel.setY(((i5 - height) - itemSpacing) - getReactionVerticalPaddingPx());
                C786410Ut5.Md(getActionPanel(), i3 + itemSpacing2);
                return;
            }
            int iMax = Math.max(i8, i6);
            LJIIIIZZ(view, ((iMax - height) - itemSpacing) - getReactionVerticalPaddingPx(), iMax - i5, height4 + iMax + itemSpacing2);
            return;
        }
        int iMin = Math.min((((height2 - bottomPadding) - height5) - itemSpacing2) - height4, (i6 + height3) - height4);
        LJIIIIZZ(view, Math.max(topPadding, (iMin - height) - itemSpacing) - getReactionVerticalPaddingPx(), iMin - i5, height4 + iMin + itemSpacing2);
    }
}
