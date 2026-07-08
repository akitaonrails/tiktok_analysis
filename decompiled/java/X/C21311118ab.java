package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RemoteViews;
import android.widget.TextView;
import android.widget.ViewAnimator;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;

/* JADX INFO: renamed from: X.18ab, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@RemoteViews.RemoteView
public class C21311118ab extends RelativeLayout {
    public static InterfaceC21311618ag optimizeConfig;
    public final boolean DEBUG;
    public boolean mAllowBrokenMeasureSpecs;
    public View mBaselineView;
    public final Rect mContentBounds;
    public boolean mDirtyHierarchy;
    public final C21311218ac mGraph;
    public boolean mMeasureVerticalWithPaddingMargin;
    public final Rect mSelfBounds;
    public View[] mSortedHorizontalChildren;
    public View[] mSortedVerticalChildren;
    public SortedSet<View> mTopToBottomLeftToRightSet;
    public Map<View, Integer> measureMap;
    public boolean optimize;
    public static final int[] RULES_VERTICAL = {2, 3, 4, 6, 8};
    public static final int[] RULES_HORIZONTAL = {0, 1, 5, 7, 16, 17, 18, 19};
    public static boolean sPreserveMarginParamsInLayoutParamConversion = true;

    static {
        setOptimizeConfig(new InterfaceC21311618ag() { // from class: X.18af
        });
    }

    private boolean isLayoutRtl() {
        return false;
    }

    public static boolean isValid(int i) {
        return (i == -1 || ((-16777216) & i) == 0 || (i & 16711680) == 0) ? false : true;
    }

    public void postChildMeasure(View view, int i, int i2) {
    }

    private void init() {
        InterfaceC21311618ag interfaceC21311618ag = optimizeConfig;
        if (interfaceC21311618ag != null) {
            interfaceC21311618ag.getClass();
            this.optimize = lambda$static$0();
        }
    }

    public static boolean lambda$static$0() {
        return ((Boolean) C1777906xl.LIZIZ.getValue()).booleanValue() || ((Boolean) C1777906xl.LIZJ.getValue()).booleanValue();
    }

    private void sortChildren() {
        Map<View, Integer> map = this.measureMap;
        if (map != null) {
            map.clear();
        } else {
            this.measureMap = new HashMap((int) (((double) getChildCount()) * 1.25d));
        }
        int childCount = getChildCount();
        View[] viewArr = this.mSortedVerticalChildren;
        if (viewArr == null || viewArr.length != childCount) {
            this.mSortedVerticalChildren = new View[childCount];
        }
        View[] viewArr2 = this.mSortedHorizontalChildren;
        if (viewArr2 == null || viewArr2.length != childCount) {
            this.mSortedHorizontalChildren = new View[childCount];
        }
        C21311218ac c21311218ac = this.mGraph;
        ArrayList<C21311418ae> arrayList = c21311218ac.LIZ;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C21311418ae c21311418ae = (C21311418ae) ListProtector.get(arrayList, i);
            c21311418ae.LIZ = null;
            c21311418ae.LIZIZ.clear();
            c21311418ae.LIZJ.clear();
            C21311418ae.LIZLLL.LIZ(c21311418ae);
        }
        arrayList.clear();
        c21311218ac.LIZIZ.clear();
        c21311218ac.LIZJ.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            C21311418ae c21311418aeLIZIZ = C21311418ae.LIZLLL.LIZIZ();
            if (c21311418aeLIZIZ == null) {
                c21311418aeLIZIZ = new C21311418ae();
            }
            c21311418aeLIZIZ.LIZ = childAt;
            if (id != -1) {
                c21311218ac.LIZIZ.put(id, c21311418aeLIZIZ);
            }
            c21311218ac.LIZ.add(c21311418aeLIZIZ);
        }
        c21311218ac.LIZ(this.optimize, this.measureMap, 2, this.mSortedVerticalChildren, RULES_VERTICAL);
        c21311218ac.LIZ(this.optimize, this.measureMap, 1, this.mSortedHorizontalChildren, RULES_HORIZONTAL);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return this.optimize ? new C21311318ad(-2, -2) : super.generateDefaultLayoutParams();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return C21311118ab.class.getName();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public int getBaseline() {
        if (!this.optimize) {
            return super.getBaseline();
        }
        View view = this.mBaselineView;
        return view != null ? view.getBaseline() : super.getBaseline();
    }

    @Override // android.widget.RelativeLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        this.mDirtyHierarchy = true;
    }

    public C21311118ab(Context context) {
        this(context, null);
    }

    private int getRelatedViewBaselineOffset(int[] iArr) {
        int baseline;
        View relatedView = getRelatedView(iArr, 4);
        if (relatedView == null || (baseline = relatedView.getBaseline()) == -1 || !(relatedView.getLayoutParams() instanceof C21311318ad)) {
            return -1;
        }
        return ((C21311318ad) relatedView.getLayoutParams()).LIZIZ + baseline;
    }

    private void queryCompatibilityModes(Context context) {
        boolean z;
        int i = context.getApplicationInfo().targetSdkVersion;
        boolean z2 = true;
        if (i <= 17) {
            z = true;
        } else {
            z = false;
        }
        this.mAllowBrokenMeasureSpecs = z;
        if (i < 18) {
            z2 = false;
        }
        this.mMeasureVerticalWithPaddingMargin = z2;
    }

    public static void setOptimizeConfig(InterfaceC21311618ag interfaceC21311618ag) {
        optimizeConfig = interfaceC21311618ag;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (this.optimize && view != null && view.getLayoutParams() != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!(layoutParams instanceof C21311318ad) && (layoutParams instanceof RelativeLayout.LayoutParams)) {
                C786410Ut5.W5(view, new C21311318ad((RelativeLayout.LayoutParams) layoutParams));
            }
        }
        super.addView(view);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (this.optimize) {
            return layoutParams instanceof C21311318ad;
        }
        return super.checkLayoutParams(layoutParams);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (this.optimize) {
            if (sPreserveMarginParamsInLayoutParamConversion) {
                if (layoutParams instanceof C21311318ad) {
                    return new C21311318ad((C21311318ad) layoutParams);
                }
                if (layoutParams instanceof RelativeLayout.LayoutParams) {
                    return new C21311318ad((RelativeLayout.LayoutParams) layoutParams);
                }
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    return new C21311318ad((ViewGroup.MarginLayoutParams) layoutParams);
                }
            }
            return new C21311318ad(layoutParams);
        }
        return super.generateLayoutParams(layoutParams);
    }

    public void setEnableOptimize(boolean z) {
        this.optimize = z;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public RelativeLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        if (this.optimize) {
            return new C21311318ad(getContext(), attributeSet);
        }
        return super.generateLayoutParams(attributeSet);
    }

    public C21311118ab(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int compareLayoutPosition(C21311318ad c21311318ad, C21311318ad c21311318ad2) {
        int i = c21311318ad.LIZIZ - c21311318ad2.LIZIZ;
        if (i != 0) {
            return i;
        }
        return c21311318ad.LIZ - c21311318ad2.LIZ;
    }

    private View getRelatedView(int[] iArr, int i) {
        C21311418ae c21311418ae;
        View view;
        int i2 = iArr[i];
        if (i2 == 0 || (c21311418ae = this.mGraph.LIZIZ.get(i2)) == null) {
            return null;
        }
        View view2 = c21311418ae.LIZ;
        while (view2.getVisibility() == 8) {
            C21311418ae c21311418ae2 = this.mGraph.LIZIZ.get(((C21311318ad) view2.getLayoutParams()).getRules()[i]);
            if (c21311418ae2 == null || view2 == (view = c21311418ae2.LIZ)) {
                return null;
            }
            view2 = view;
        }
        return view2;
    }

    private C21311318ad getRelatedViewParams(int[] iArr, int i) {
        View relatedView = getRelatedView(iArr, i);
        if (relatedView != null && (relatedView.getLayoutParams() instanceof C21311318ad)) {
            return (C21311318ad) relatedView.getLayoutParams();
        }
        return null;
    }

    private boolean mayNeedMeasured4Baseline(View view, C21311318ad c21311318ad) {
        if (c21311318ad.getRules()[4] != 0) {
            if ((view instanceof TextView) || (view instanceof RelativeLayout) || (view instanceof ImageView) || (view instanceof ViewAnimator)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (this.optimize && view != null && layoutParams != null && !(layoutParams instanceof C21311318ad) && (layoutParams instanceof RelativeLayout.LayoutParams)) {
            layoutParams = new C21311318ad((RelativeLayout.LayoutParams) layoutParams);
        }
        super.addView(view, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01d5 A[PHI: r19
      0x01d5: PHI (r19v9 boolean) = (r19v4 boolean), (r19v6 boolean), (r19v2 boolean) binds: [B:159:0x029f, B:153:0x027e, B:120:0x01d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0201 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0124  */
    @Override // android.widget.RelativeLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r32, int r33) {
        /*
            Method dump skipped, instruction units count: 1111
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21311118ab.onMeasure(int, int):void");
    }

    public void onSetLayoutParams(View view, ViewGroup.LayoutParams layoutParams) {
        if (this.optimize && !(layoutParams instanceof C21311318ad)) {
            C786410Ut5.W5(view, generateLayoutParams(layoutParams));
        } else {
            requestLayout();
        }
    }

    public C21311118ab(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    private void applyHorizontalSizeRules(C21311318ad c21311318ad, int i, int[] iArr) {
        c21311318ad.LIZ = Integer.MIN_VALUE;
        c21311318ad.LIZJ = Integer.MIN_VALUE;
        C21311318ad relatedViewParams = getRelatedViewParams(iArr, 0);
        if (relatedViewParams != null) {
            c21311318ad.LIZJ = relatedViewParams.LIZ - (((RelativeLayout.LayoutParams) relatedViewParams).leftMargin + ((RelativeLayout.LayoutParams) c21311318ad).rightMargin);
        } else if (((RelativeLayout.LayoutParams) c21311318ad).alignWithParent && iArr[0] != 0 && i >= 0) {
            c21311318ad.LIZJ = (i - getPaddingRight()) - ((RelativeLayout.LayoutParams) c21311318ad).rightMargin;
        }
        C21311318ad relatedViewParams2 = getRelatedViewParams(iArr, 1);
        if (relatedViewParams2 != null) {
            c21311318ad.LIZ = relatedViewParams2.LIZJ + ((RelativeLayout.LayoutParams) relatedViewParams2).rightMargin + ((RelativeLayout.LayoutParams) c21311318ad).leftMargin;
        } else if (((RelativeLayout.LayoutParams) c21311318ad).alignWithParent && iArr[1] != 0) {
            c21311318ad.LIZ = getPaddingLeft() + ((RelativeLayout.LayoutParams) c21311318ad).leftMargin;
        }
        C21311318ad relatedViewParams3 = getRelatedViewParams(iArr, 5);
        if (relatedViewParams3 != null) {
            c21311318ad.LIZ = relatedViewParams3.LIZ + ((RelativeLayout.LayoutParams) c21311318ad).leftMargin;
        } else if (((RelativeLayout.LayoutParams) c21311318ad).alignWithParent && iArr[5] != 0) {
            c21311318ad.LIZ = getPaddingLeft() + ((RelativeLayout.LayoutParams) c21311318ad).leftMargin;
        }
        C21311318ad relatedViewParams4 = getRelatedViewParams(iArr, 7);
        if (relatedViewParams4 != null) {
            c21311318ad.LIZJ = relatedViewParams4.LIZJ - ((RelativeLayout.LayoutParams) c21311318ad).rightMargin;
        } else if (((RelativeLayout.LayoutParams) c21311318ad).alignWithParent && iArr[7] != 0 && i >= 0) {
            c21311318ad.LIZJ = (i - getPaddingRight()) - ((RelativeLayout.LayoutParams) c21311318ad).rightMargin;
        }
        if (iArr[9] != 0) {
            c21311318ad.LIZ = getPaddingLeft() + ((RelativeLayout.LayoutParams) c21311318ad).leftMargin;
        }
        if (iArr[11] != 0 && i >= 0) {
            c21311318ad.LIZJ = (i - getPaddingRight()) - ((RelativeLayout.LayoutParams) c21311318ad).rightMargin;
        }
    }

    private void applyVerticalSizeRules(C21311318ad c21311318ad, int i, int i2) {
        int[] rules = c21311318ad.getRules();
        int relatedViewBaselineOffset = getRelatedViewBaselineOffset(rules);
        if (relatedViewBaselineOffset != -1) {
            if (i2 != -1) {
                relatedViewBaselineOffset -= i2;
            }
            c21311318ad.LIZIZ = relatedViewBaselineOffset;
            c21311318ad.LIZLLL = Integer.MIN_VALUE;
            return;
        }
        c21311318ad.LIZIZ = Integer.MIN_VALUE;
        c21311318ad.LIZLLL = Integer.MIN_VALUE;
        C21311318ad relatedViewParams = getRelatedViewParams(rules, 2);
        if (relatedViewParams != null) {
            c21311318ad.LIZLLL = relatedViewParams.LIZIZ - (((RelativeLayout.LayoutParams) relatedViewParams).topMargin + ((RelativeLayout.LayoutParams) c21311318ad).bottomMargin);
        } else if (((RelativeLayout.LayoutParams) c21311318ad).alignWithParent && rules[2] != 0 && i >= 0) {
            c21311318ad.LIZLLL = (i - getPaddingBottom()) - ((RelativeLayout.LayoutParams) c21311318ad).bottomMargin;
        }
        C21311318ad relatedViewParams2 = getRelatedViewParams(rules, 3);
        if (relatedViewParams2 != null) {
            c21311318ad.LIZIZ = relatedViewParams2.LIZLLL + ((RelativeLayout.LayoutParams) relatedViewParams2).bottomMargin + ((RelativeLayout.LayoutParams) c21311318ad).topMargin;
        } else if (((RelativeLayout.LayoutParams) c21311318ad).alignWithParent && rules[3] != 0) {
            c21311318ad.LIZIZ = getPaddingTop() + ((RelativeLayout.LayoutParams) c21311318ad).topMargin;
        }
        C21311318ad relatedViewParams3 = getRelatedViewParams(rules, 6);
        if (relatedViewParams3 != null) {
            c21311318ad.LIZIZ = relatedViewParams3.LIZIZ + ((RelativeLayout.LayoutParams) c21311318ad).topMargin;
        } else if (((RelativeLayout.LayoutParams) c21311318ad).alignWithParent && rules[6] != 0) {
            c21311318ad.LIZIZ = getPaddingTop() + ((RelativeLayout.LayoutParams) c21311318ad).topMargin;
        }
        C21311318ad relatedViewParams4 = getRelatedViewParams(rules, 8);
        if (relatedViewParams4 != null) {
            c21311318ad.LIZLLL = relatedViewParams4.LIZLLL - ((RelativeLayout.LayoutParams) c21311318ad).bottomMargin;
        } else if (((RelativeLayout.LayoutParams) c21311318ad).alignWithParent && rules[8] != 0 && i >= 0) {
            c21311318ad.LIZLLL = (i - getPaddingBottom()) - ((RelativeLayout.LayoutParams) c21311318ad).bottomMargin;
        }
        if (rules[10] != 0) {
            c21311318ad.LIZIZ = getPaddingTop() + ((RelativeLayout.LayoutParams) c21311318ad).topMargin;
        }
        if (rules[12] != 0 && i >= 0) {
            c21311318ad.LIZLLL = (i - getPaddingBottom()) - ((RelativeLayout.LayoutParams) c21311318ad).bottomMargin;
        }
    }

    public static void centerHorizontal(View view, C21311318ad c21311318ad, int i) {
        int measuredWidth = view.getMeasuredWidth();
        int i2 = (i - measuredWidth) / 2;
        c21311318ad.LIZ = i2;
        c21311318ad.LIZJ = i2 + measuredWidth;
    }

    public static void centerVertical(View view, C21311318ad c21311318ad, int i) {
        int measuredHeight = view.getMeasuredHeight();
        int i2 = (i - measuredHeight) / 2;
        c21311318ad.LIZIZ = i2;
        c21311318ad.LIZLLL = i2 + measuredHeight;
    }

    private void positionAtEdge(View view, C21311318ad c21311318ad, int i) {
        if (isLayoutRtl()) {
            int paddingRight = (i - getPaddingRight()) - ((RelativeLayout.LayoutParams) c21311318ad).rightMargin;
            c21311318ad.LIZJ = paddingRight;
            c21311318ad.LIZ = paddingRight - view.getMeasuredWidth();
        } else {
            int paddingLeft = getPaddingLeft() + ((RelativeLayout.LayoutParams) c21311318ad).leftMargin;
            c21311318ad.LIZ = paddingLeft;
            c21311318ad.LIZJ = paddingLeft + view.getMeasuredWidth();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.optimize && view != null && layoutParams != null && !(layoutParams instanceof C21311318ad) && (layoutParams instanceof RelativeLayout.LayoutParams)) {
            layoutParams = new C21311318ad((RelativeLayout.LayoutParams) layoutParams);
        }
        super.addView(view, i, layoutParams);
    }

    public C21311118ab(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mContentBounds = new Rect();
        this.mSelfBounds = new Rect();
        this.mTopToBottomLeftToRightSet = null;
        this.mGraph = new C21311218ac();
        this.measureMap = null;
        this.mAllowBrokenMeasureSpecs = false;
        this.mMeasureVerticalWithPaddingMargin = false;
        this.optimize = false;
        init();
        queryCompatibilityModes(context);
    }

    private void measureChild(View view, C21311318ad c21311318ad, int i, int i2) {
        int childMeasureSpec = getChildMeasureSpec(c21311318ad.LIZ, c21311318ad.LIZJ, ((RelativeLayout.LayoutParams) c21311318ad).width, ((RelativeLayout.LayoutParams) c21311318ad).leftMargin, ((RelativeLayout.LayoutParams) c21311318ad).rightMargin, getPaddingLeft(), getPaddingRight(), i);
        int childMeasureSpec2 = getChildMeasureSpec(c21311318ad.LIZIZ, c21311318ad.LIZLLL, ((RelativeLayout.LayoutParams) c21311318ad).height, ((RelativeLayout.LayoutParams) c21311318ad).topMargin, ((RelativeLayout.LayoutParams) c21311318ad).bottomMargin, getPaddingTop(), getPaddingBottom(), i2);
        view.measure(childMeasureSpec, childMeasureSpec2);
        postChildMeasure(view, childMeasureSpec, childMeasureSpec2);
    }

    private void measureChildHorizontal(View view, C21311318ad c21311318ad, int i, int i2) {
        int iMax;
        int iMakeMeasureSpec;
        int childMeasureSpec = getChildMeasureSpec(c21311318ad.LIZ, c21311318ad.LIZJ, ((RelativeLayout.LayoutParams) c21311318ad).width, ((RelativeLayout.LayoutParams) c21311318ad).leftMargin, ((RelativeLayout.LayoutParams) c21311318ad).rightMargin, getPaddingLeft(), getPaddingRight(), i);
        int i3 = 1073741824;
        if (i2 < 0 && !this.mAllowBrokenMeasureSpecs) {
            int i4 = ((RelativeLayout.LayoutParams) c21311318ad).height;
            if (i4 >= 0) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
        } else {
            if (this.mMeasureVerticalWithPaddingMargin) {
                iMax = Math.max(0, (((i2 - getPaddingTop()) - getPaddingBottom()) - ((RelativeLayout.LayoutParams) c21311318ad).topMargin) - ((RelativeLayout.LayoutParams) c21311318ad).bottomMargin);
            } else {
                iMax = Math.max(0, i2);
            }
            if (((RelativeLayout.LayoutParams) c21311318ad).height != -1) {
                i3 = Integer.MIN_VALUE;
            }
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, i3);
        }
        view.measure(childMeasureSpec, iMakeMeasureSpec);
        postChildMeasure(view, childMeasureSpec, iMakeMeasureSpec);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean positionChildHorizontal(android.view.View r6, X.C21311318ad r7, int r8, boolean r9) {
        /*
            r5 = this;
            r5.getLayoutDirection()
            int[] r4 = r7.getRules()
            int r1 = r7.LIZ
            r3 = 1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L21
            int r1 = r7.LIZJ
            if (r1 == r2) goto L31
            int r0 = r6.getMeasuredWidth()
            int r1 = r1 - r0
            r7.LIZ = r1
        L19:
            r0 = 21
            r0 = r4[r0]
            if (r0 != 0) goto L20
            r3 = 0
        L20:
            return r3
        L21:
            if (r1 == r2) goto L31
            int r0 = r7.LIZJ
            if (r0 != r2) goto L2f
            int r0 = r6.getMeasuredWidth()
            int r1 = r1 + r0
            r7.LIZJ = r1
            goto L19
        L2f:
            if (r1 != r2) goto L19
        L31:
            int r0 = r7.LIZJ
            if (r0 != r2) goto L19
            r0 = 13
            r0 = r4[r0]
            if (r0 != 0) goto L45
            r0 = 14
            r0 = r4[r0]
            if (r0 != 0) goto L45
            r5.positionAtEdge(r6, r7, r8)
            goto L19
        L45:
            if (r9 != 0) goto L4b
            centerHorizontal(r6, r7, r8)
            return r3
        L4b:
            r5.positionAtEdge(r6, r7, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21311118ab.positionChildHorizontal(android.view.View, X.18ad, int, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean positionChildVertical(android.view.View r6, X.C21311318ad r7, int r8, boolean r9) {
        /*
            r5 = this;
            int[] r4 = r7.getRules()
            int r1 = r7.LIZIZ
            r3 = 1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L1e
            int r1 = r7.LIZLLL
            if (r1 == r2) goto L2e
            int r0 = r6.getMeasuredHeight()
            int r1 = r1 - r0
            r7.LIZIZ = r1
        L16:
            r0 = 12
            r0 = r4[r0]
            if (r0 != 0) goto L1d
            r3 = 0
        L1d:
            return r3
        L1e:
            if (r1 == r2) goto L2e
            int r0 = r7.LIZLLL
            if (r0 != r2) goto L2c
            int r0 = r6.getMeasuredHeight()
            int r1 = r1 + r0
            r7.LIZLLL = r1
            goto L16
        L2c:
            if (r1 != r2) goto L16
        L2e:
            int r0 = r7.LIZLLL
            if (r0 != r2) goto L16
            r0 = 13
            r0 = r4[r0]
            if (r0 != 0) goto L4f
            r0 = 15
            r0 = r4[r0]
            if (r0 != 0) goto L4f
            int r1 = r5.getPaddingTop()
            int r0 = r7.topMargin
            int r1 = r1 + r0
            r7.LIZIZ = r1
            int r0 = r6.getMeasuredHeight()
            int r1 = r1 + r0
            r7.LIZLLL = r1
            goto L16
        L4f:
            if (r9 != 0) goto L55
            centerVertical(r6, r7, r8)
            return r3
        L55:
            int r1 = r5.getPaddingTop()
            int r0 = r7.topMargin
            int r1 = r1 + r0
            r7.LIZIZ = r1
            int r0 = r6.getMeasuredHeight()
            int r1 = r1 + r0
            r7.LIZLLL = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21311118ab.positionChildVertical(android.view.View, X.18ad, int, boolean):boolean");
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (!this.optimize) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C21311318ad c21311318ad = (C21311318ad) childAt.getLayoutParams();
                childAt.layout(c21311318ad.LIZ, c21311318ad.LIZIZ, c21311318ad.LIZJ, c21311318ad.LIZLLL);
            }
        }
    }

    private int getChildMeasureSpec(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        int i9;
        int i10;
        int i11 = 0;
        if (i8 < 0) {
            z = true;
        } else {
            z = false;
        }
        int i12 = 1073741824;
        if (z && !this.mAllowBrokenMeasureSpecs) {
            if (i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE) {
                i3 = Math.max(0, i2 - i);
            } else {
                if (i3 < 0) {
                    i3 = 0;
                }
                return View.MeasureSpec.makeMeasureSpec(i3, i11);
            }
            i11 = 1073741824;
            return View.MeasureSpec.makeMeasureSpec(i3, i11);
        }
        if (i == Integer.MIN_VALUE) {
            i9 = i6 + i4;
        } else {
            i9 = i;
        }
        if (i2 == Integer.MIN_VALUE) {
            i10 = (i8 - i7) - i5;
        } else {
            i10 = i2;
        }
        int i13 = i10 - i9;
        if (i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE) {
            if (z) {
                i12 = 0;
            }
            i3 = Math.max(0, i13);
        } else if (i3 >= 0) {
            if (i13 >= 0) {
                i3 = Math.min(i13, i3);
            }
        } else if (i3 == -1) {
            if (z) {
                i12 = 0;
            }
            i3 = Math.max(0, i13);
        } else {
            if (i3 == -2 && i13 >= 0) {
                i3 = i13;
                i11 = Integer.MIN_VALUE;
            } else {
                i3 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i3, i11);
        }
        i11 = i12;
        return View.MeasureSpec.makeMeasureSpec(i3, i11);
    }
}
