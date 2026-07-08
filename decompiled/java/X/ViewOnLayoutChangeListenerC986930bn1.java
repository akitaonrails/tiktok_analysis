package X;

import Y.AComparatorS34S0000000_15;
import Y.ARunnableS115S0100000_15;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bn1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class ViewOnLayoutChangeListenerC986930bn1 implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public ViewOnLayoutChangeListenerC986930bn1(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }

    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC986930bn1 viewOnLayoutChangeListenerC986930bn1, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2;
        if (((ViewGroup) viewOnLayoutChangeListenerC986930bn1.l0) == null) {
            return;
        }
        C947530alT c947530alT = (C947530alT) viewOnLayoutChangeListenerC986930bn1.l1;
        if (c947530alT.LJIIZILJ != null && c947530alT.LJIILLIIL != null && ((View) viewOnLayoutChangeListenerC986930bn1.l2) != null && (view2 = c947530alT.LIZLLL) != null) {
            HandlerHook.viewPost(view2, new ARunnableS115S0100000_15(c947530alT, 128));
        }
    }

    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC986930bn1 viewOnLayoutChangeListenerC986930bn1, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        final C947560alW c947560alW;
        View view2;
        int height;
        if (((ViewGroup) viewOnLayoutChangeListenerC986930bn1.l0) != null && (view2 = (c947560alW = (C947560alW) viewOnLayoutChangeListenerC986930bn1.l1).LJIIZILJ) != null && c947560alW.LJIILLIIL != null && ((View) viewOnLayoutChangeListenerC986930bn1.l2) != null && c947560alW.LIZLLL != null) {
            int height2 = view2.getHeight();
            ViewGroup viewGroup = c947560alW.LJFF;
            if (viewGroup != null) {
                height = viewGroup.getHeight();
            } else {
                height = 0;
            }
            final int iMin = Math.min((int) (((((((double) C497740JfY.LJIILLIIL()) * 0.8d) - ((double) C497740JfY.LJIIIZ(R.dimen.abn))) - ((double) C497740JfY.LJIIIZ(R.dimen.abm))) - ((double) height)) - ((double) height2)), (int) C497740JfY.LIZIZ(260.0f));
            int i9 = c947560alW.LJJI;
            if (i9 != iMin) {
                c947560alW.LJJI = iMin;
                C936070aSz.LIZIZ(c947560alW.LIZLLL, c947560alW.LJIILLIIL, c947560alW.LJIJ, c947560alW.LJIJI, c947560alW.LJIJJ, c947560alW.LJIJJLI);
                if (i9 > 0) {
                    Animator animator = c947560alW.LJJ;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(c947560alW.LJJI, iMin);
                    valueAnimatorOfInt.addListener(new AnimatorListenerAdapter() { // from class: X.0alV
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator2) {
                            C500260Jjc.LJJZ(iMin, c947560alW.LIZLLL);
                        }
                    });
                    valueAnimatorOfInt.setDuration(250L);
                    valueAnimatorOfInt.start();
                    c947560alW.LJJ = valueAnimatorOfInt;
                    return;
                }
                C500260Jjc.LJJZ(iMin, c947560alW.LIZLLL);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object, java.util.HashMap, java.util.LinkedHashMap] */
    public static final void onLayoutChange$2(ViewOnLayoutChangeListenerC986930bn1 viewOnLayoutChangeListenerC986930bn1, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewGroup viewGroup;
        int iIntValue;
        Object next;
        int width;
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        ?? linkedHashMap = new LinkedHashMap();
        if (viewGroup != null) {
            for (View view2 : new C09RD(viewGroup)) {
                if (view2 instanceof AbstractC939840aZ4) {
                    AbstractC939840aZ4 abstractC939840aZ4 = (AbstractC939840aZ4) view2;
                    linkedHashMap.put(Integer.valueOf(abstractC939840aZ4.getElementType().hashCode()), Integer.valueOf(abstractC939840aZ4.getVisibility()));
                }
            }
        }
        if (i != i5 || i3 != i7 || !Intrinsics.LJFF(linkedHashMap, ((C259800zU) viewOnLayoutChangeListenerC986930bn1.l0).element)) {
            if (!((C08J9) viewOnLayoutChangeListenerC986930bn1.l1).LIZ()) {
                C937310aUz.LJII("LayoutBizView", "onLayoutChange return as methodLimiter");
                return;
            }
            ((C259800zU) viewOnLayoutChangeListenerC986930bn1.l0).element = linkedHashMap;
            List listLJLLLL = C13LP.LJLLLL(new AComparatorS34S0000000_15(22), ((C939730aYt) viewOnLayoutChangeListenerC986930bn1.l2).getAllBottomElements());
            if (!((C939730aYt) viewOnLayoutChangeListenerC986930bn1.l2).LLILZLL.LJ()) {
                C937310aUz.LJII("LayoutBizView", "onLayoutChange return as is not panelLayout");
                Iterator it2 = listLJLLLL.iterator();
                while (it2.hasNext()) {
                    ((AbstractC939840aZ4) it2.next()).setExternalHiddenViewWidth(null);
                }
                return;
            }
            Iterator it3 = listLJLLLL.iterator();
            while (true) {
                iIntValue = 0;
                if (it3.hasNext()) {
                    next = it3.next();
                    if (((AbstractC939840aZ4) next).getPriority().LIZIZ > 0) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AbstractC939840aZ4 abstractC939840aZ42 = (AbstractC939840aZ4) next;
            ArrayList<AbstractC939840aZ4> arrayList = new ArrayList();
            for (Object obj : listLJLLLL) {
                if (((AbstractC939840aZ4) obj).getPriority().LIZIZ == 0) {
                    arrayList.add(obj);
                }
            }
            if (abstractC939840aZ42 != null) {
                iIntValue = abstractC939840aZ42.getElementWidth();
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                Integer externalHiddenViewWidth = ((AbstractC939840aZ4) it4.next()).getExternalHiddenViewWidth();
                if (externalHiddenViewWidth != null) {
                    iIntValue -= externalHiddenViewWidth.intValue();
                }
            }
            if (abstractC939840aZ42 != null && iIntValue < abstractC939840aZ42.getPriority().LIZIZ) {
                int elementWidth = abstractC939840aZ42.getElementWidth();
                C937310aUz.LJII("LayoutBizView", "onLayoutChange hide some views");
                for (AbstractC939840aZ4 abstractC939840aZ43 : arrayList) {
                    Integer externalHiddenViewWidth2 = abstractC939840aZ43.getExternalHiddenViewWidth();
                    if (externalHiddenViewWidth2 != null && externalHiddenViewWidth2.intValue() > 0) {
                        width = externalHiddenViewWidth2.intValue();
                    } else {
                        width = abstractC939840aZ43.getWidth();
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onLayoutChange ");
                    sbLIZ.append(abstractC939840aZ43);
                    sbLIZ.append(" externalHiddenViewWidth:");
                    sbLIZ.append(externalHiddenViewWidth2);
                    sbLIZ.append(" width:");
                    sbLIZ.append(width);
                    C937310aUz.LJII("LayoutBizView", C2188811AlT.LIZIZ(sbLIZ));
                    if (elementWidth < abstractC939840aZ42.getPriority().LIZIZ && width > 0) {
                        abstractC939840aZ43.setExternalHiddenViewWidth(Integer.valueOf(width));
                        elementWidth += width;
                    } else {
                        abstractC939840aZ42.setExternalHiddenViewWidth(null);
                    }
                }
            } else {
                C937310aUz.LJII("LayoutBizView", "onLayoutChange reset all element:" + abstractC939840aZ42 + " showHiddenViewRealWidth:" + iIntValue);
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    ((AbstractC939840aZ4) it5.next()).setExternalHiddenViewWidth(null);
                }
                return;
            }
        }
        ((C259800zU) viewOnLayoutChangeListenerC986930bn1.l0).element = linkedHashMap;
    }
}
