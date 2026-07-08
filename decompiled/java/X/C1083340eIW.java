package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ies.sdk.widgets.LayerInfo;
import com.bytedance.ies.sdk.widgets.LayeredConstraintLayout$LayoutParams;
import com.bytedance.ies.sdk.widgets.PriorityConstraintSolver;
import com.bytedance.ies.sdk.widgets.ViewIdUtils;
import com.bytedance.ies.sdk.widgets.dependence.Barrier;
import com.bytedance.ies.sdk.widgets.dependence.ChainSolver;
import com.bytedance.ies.sdk.widgets.dependence.Constraint;
import com.bytedance.ies.sdk.widgets.dependence.ConstraintCalculator;
import com.bytedance.ies.sdk.widgets.dependence.ConstraintSolver;
import com.bytedance.ies.sdk.widgets.dependence.DefaultProperty;
import com.bytedance.ies.sdk.widgets.dependence.Guideline;
import com.bytedance.ies.sdk.widgets.dependence.HorizontalChainSolver;
import com.bytedance.ies.sdk.widgets.dependence.HorizontalSpaceSolver;
import com.bytedance.ies.sdk.widgets.dependence.Placeholder;
import com.bytedance.ies.sdk.widgets.dependence.SpaceSolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0eIW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1083340eIW extends ConstraintLayout {
    public final ConstraintCalculator calculator;
    public Map<Integer, ChainSolver> chainSolvers;
    public ConstraintSolver constraintSolver;
    public final List<C1083100eI8> mCompatConstraintHelpers;
    public Map<Integer, SpaceSolver> spaceSolvers;

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public C19ME generateDefaultLayoutParams() {
        return new LayeredConstraintLayout$LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        throw new UnsupportedOperationException();
    }

    private final String printChildrenWeight() {
        if (getChildCount() <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(100);
        sb.append(e3.e);
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            sb.append(getWeightInternal(getChildAt(i)));
            if (i < getChildCount() - 1) {
                sb.append(",");
            }
            i++;
            if (i % 10 == 0) {
                sb.append(" ");
            }
            if (i % 20 == 0) {
                sb.append("\n");
            }
        }
        sb.append(e3.f);
        return sb.toString();
    }

    public final ConstraintSolver getConstraintSolver() {
        return this.constraintSolver;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return generateDefaultLayoutParams();
    }

    public C1083340eIW(Context context) {
        this(context, null, 0);
    }

    private final int binarySearchWeight(int i) {
        int childCount = getChildCount() - 1;
        int i2 = 0;
        while (i2 <= childCount) {
            int i3 = (i2 + childCount) >>> 1;
            int weightInternal = getWeightInternal(getChildAt(i3));
            if (weightInternal < i) {
                i2 = i3 + 1;
            } else if (weightInternal > i) {
                childCount = i3 - 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    private final int getWeightInternal(View view) {
        LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof LayeredConstraintLayout$LayoutParams) && (layeredConstraintLayout$LayoutParams = (LayeredConstraintLayout$LayoutParams) layoutParams) != null) {
            return layeredConstraintLayout$LayoutParams.getWeight$live_widget_release();
        }
        return 0;
    }

    public final void addConstraintHelper(C1083100eI8 c1083100eI8) {
        if (!this.mCompatConstraintHelpers.contains(c1083100eI8)) {
            this.mCompatConstraintHelpers.add(c1083100eI8);
        }
    }

    public final void addViewByWeight(View view) {
        LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof LayeredConstraintLayout$LayoutParams) && (layeredConstraintLayout$LayoutParams = (LayeredConstraintLayout$LayoutParams) layoutParams) != null) {
                int childCount = getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    if (getWeightInternal(getChildAt(i)) > layeredConstraintLayout$LayoutParams.getWeight$live_widget_release()) {
                        if (i != -1) {
                            addView(view, i);
                            return;
                        }
                    } else {
                        i++;
                    }
                }
                addView(view, getChildCount());
                return;
            }
            addView(view);
            return;
        }
        addView(view);
    }

    public final void attach(View view) {
        LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams;
        ViewGroup.LayoutParams layoutParams = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        }
        if ((layoutParams instanceof LayeredConstraintLayout$LayoutParams) && (layeredConstraintLayout$LayoutParams = (LayeredConstraintLayout$LayoutParams) layoutParams) != null) {
            int childCount = getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                if (getWeightInternal(getChildAt(i)) > layeredConstraintLayout$LayoutParams.getWeight$live_widget_release()) {
                    if (i != -1) {
                        attachViewToParent(view, i, layeredConstraintLayout$LayoutParams);
                        return;
                    }
                } else {
                    i++;
                }
            }
            attachViewToParent(view, getChildCount(), layeredConstraintLayout$LayoutParams);
        }
    }

    public final LayeredConstraintLayout$LayoutParams calculateChildLayoutParams(int i) {
        ConstraintCalculator constraintCalculator = this.calculator;
        Context context = getContext();
        ConstraintSolver constraintSolver = this.constraintSolver;
        if (constraintSolver != null) {
            return constraintCalculator.calculateLayoutParams(context, constraintSolver, i);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayeredConstraintLayout$LayoutParams;
    }

    public final void detach(View view) {
        if (view != null) {
            detachViewFromParent(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Iterator<C1083100eI8> it2 = this.mCompatConstraintHelpers.iterator();
        while (it2.hasNext()) {
            it2.next().updatePreDraw(this);
        }
        super.dispatchDraw(canvas);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C19ME) {
            return new LayeredConstraintLayout$LayoutParams((C19ME) layoutParams);
        }
        return new LayeredConstraintLayout$LayoutParams(layoutParams);
    }

    public final DefaultProperty getDefaultProperty(int i) {
        ConstraintSolver constraintSolver = this.constraintSolver;
        if (constraintSolver != null) {
            return constraintSolver.getDefaultProperty(getContext(), i);
        }
        return new DefaultProperty.Builder().build();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        if (view == null) {
            return;
        }
        super.onViewAdded(view);
        if (view instanceof C1083100eI8) {
            if (!this.mCompatConstraintHelpers.contains(view)) {
                this.mCompatConstraintHelpers.add(view);
            }
        } else {
            Iterator<C1083100eI8> it2 = this.mCompatConstraintHelpers.iterator();
            while (it2.hasNext()) {
                it2.next().onViewAdded(view);
            }
        }
        this.calculator.onViewAdded(this.constraintSolver, view);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        if (view == null) {
            return;
        }
        super.onViewRemoved(view);
        if (!C19719512Dh.LIZ(this.mCompatConstraintHelpers).remove(view)) {
            Iterator<C1083100eI8> it2 = this.mCompatConstraintHelpers.iterator();
            while (it2.hasNext()) {
                it2.next().onViewRemoved(view);
            }
        }
        this.calculator.onViewRemoved(this.constraintSolver, view);
    }

    public final boolean removeConstraintHelper(C1083100eI8 c1083100eI8) {
        return this.mCompatConstraintHelpers.remove(c1083100eI8);
    }

    public final void removeSceneConstraintAndLayoutParams(View view) {
        PriorityConstraintSolver priorityConstraintSolver;
        ConstraintSolver constraintSolver = this.constraintSolver;
        if ((constraintSolver instanceof PriorityConstraintSolver) && (priorityConstraintSolver = (PriorityConstraintSolver) constraintSolver) != null) {
            priorityConstraintSolver.removeSceneConstraintAndLayoutParams(view.getId());
        }
    }

    public final void resolveChain(int i) {
        ChainSolver chainSolver = this.chainSolvers.get(Integer.valueOf(i));
        if (chainSolver == null) {
            return;
        }
        chainSolver.resolveChain(i);
    }

    public final void resolveSpace(int i) {
        SpaceSolver spaceSolver = this.spaceSolvers.get(Integer.valueOf(i));
        if (spaceSolver == null) {
            return;
        }
        spaceSolver.resolveSpace(i);
    }

    public final void setConstraintSolver(ConstraintSolver constraintSolver) {
        this.constraintSolver = constraintSolver;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public C19ME generateLayoutParams(AttributeSet attributeSet) {
        return new LayeredConstraintLayout$LayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateLayoutParams(attributeSet);
    }

    public C1083340eIW(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final Constraint makeConstraint(View view, C19ME c19me) {
        Constraint constraint;
        String idName = ViewIdUtils.getIdName(view);
        if (view instanceof C1090450eTz) {
            constraint = new Guideline(view.getId(), idName, Constraint.Type.SCENE);
        } else if (view instanceof C1090460eU0) {
            constraint = new Barrier(view.getId(), idName, Constraint.Type.SCENE);
        } else if (view instanceof C1100290ejr) {
            constraint = new Placeholder(view.getId(), idName, Constraint.Type.SCENE);
        } else {
            constraint = new Constraint(view.getId(), idName, Constraint.Type.SCENE);
        }
        constraint.leftToLeft = c19me.leftToLeft;
        constraint.leftToRight = c19me.leftToRight;
        constraint.rightToLeft = c19me.rightToLeft;
        constraint.rightToRight = c19me.rightToRight;
        constraint.startToStart = c19me.startToStart;
        constraint.startToEnd = c19me.startToEnd;
        constraint.endToStart = c19me.endToStart;
        constraint.endToEnd = c19me.endToEnd;
        constraint.topToTop = c19me.topToTop;
        constraint.topToBottom = c19me.topToBottom;
        constraint.bottomToTop = c19me.bottomToTop;
        constraint.bottomToBottom = c19me.bottomToBottom;
        constraint.baselineToBaseline = c19me.baselineToBaseline;
        return constraint;
    }

    public final void addView(View view, LayerInfo layerInfo) {
        LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParamsCalculateChildLayoutParams;
        int i;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayeredConstraintLayout$LayoutParams) || (layeredConstraintLayout$LayoutParamsCalculateChildLayoutParams = (LayeredConstraintLayout$LayoutParams) layoutParams) == null) {
            layeredConstraintLayout$LayoutParamsCalculateChildLayoutParams = calculateChildLayoutParams(view.getId());
        }
        layeredConstraintLayout$LayoutParamsCalculateChildLayoutParams.setLayerAndOrder(layerInfo.getLayer(), layerInfo.getOrder());
        int iBinarySearchWeight = binarySearchWeight(layeredConstraintLayout$LayoutParamsCalculateChildLayoutParams.getWeight$live_widget_release());
        if (iBinarySearchWeight >= 0) {
            i = iBinarySearchWeight + 1;
        } else {
            i = (-iBinarySearchWeight) - 1;
        }
        addView(view, i, layeredConstraintLayout$LayoutParamsCalculateChildLayoutParams);
    }

    public final void updateView(View view, LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams) {
        PriorityConstraintSolver priorityConstraintSolver;
        ConstraintSolver constraintSolver = this.constraintSolver;
        if ((constraintSolver instanceof PriorityConstraintSolver) && (priorityConstraintSolver = (PriorityConstraintSolver) constraintSolver) != null) {
            priorityConstraintSolver.addSceneConstraintAndLayoutParams(makeConstraint(view, layeredConstraintLayout$LayoutParams), layeredConstraintLayout$LayoutParams);
            this.calculator.onViewUpdated(priorityConstraintSolver, view);
        }
    }

    public C1083340eIW(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mCompatConstraintHelpers = new ArrayList();
        this.calculator = new ConstraintCalculator();
        this.spaceSolvers = new LinkedHashMap();
        this.chainSolvers = new LinkedHashMap();
    }

    public final void addChainSolver(int i, float f, int i2, int[] iArr) {
        HorizontalChainSolver horizontalChainSolver = new HorizontalChainSolver(iArr, this, i, f, i2);
        for (int i3 : iArr) {
            this.chainSolvers.put(Integer.valueOf(i3), horizontalChainSolver);
        }
    }

    public final void addSpaceSolver(int i, int i2, int i3, int[] iArr) {
        HorizontalSpaceSolver horizontalSpaceSolver = new HorizontalSpaceSolver(iArr, this, i3);
        for (int i4 : iArr) {
            this.spaceSolvers.put(Integer.valueOf(i4), horizontalSpaceSolver);
        }
    }
}
