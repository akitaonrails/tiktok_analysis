package androidx.constraintlayout.widget;

import X.AbstractC21527819Mu;
import X.C12MG;
import X.C1602160rnK;
import X.C19MB;
import X.C19MD;
import X.C19ME;
import X.C19MO;
import X.C19MX;
import X.C19O3;
import X.C19O9;
import X.C19OA;
import X.C19OI;
import X.C19OV;
import X.C20742216Eq;
import X.C21527919Mv;
import X.C21530319Nt;
import X.C21531219Oc;
import X.C786410Ut5;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes34.dex */
public class ConstraintLayout extends ViewGroup {
    public SparseArray<View> mChildrenByIds;
    public ArrayList<C19MX> mConstraintHelpers;
    public C19MO mConstraintLayoutSpec;
    public C19MB mConstraintSet;
    public int mConstraintSetId;
    public AbstractC21527819Mu mConstraintsChangedListener;
    public HashMap<String, Integer> mDesignIds;
    public boolean mDirtyHierarchy;
    public int mLastMeasureHeight;
    public int mLastMeasureHeightMode;
    public int mLastMeasureHeightSize;
    public int mLastMeasureWidth;
    public int mLastMeasureWidthMode;
    public int mLastMeasureWidthSize;
    public C19O9 mLayoutWidget;
    public int mMaxHeight;
    public int mMaxWidth;
    public C21530319Nt mMeasurer;
    public C21527919Mv mMetrics;
    public int mMinHeight;
    public int mMinWidth;
    public int mOnMeasureHeightMeasureSpec;
    public int mOnMeasureWidthMeasureSpec;
    public int mOptimizationLevel;
    public SparseArray<C19OA> mTempMapIdToWidget;

    private void markHierarchyDirty() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    private void setChildrenConstraints() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C19OA viewWidget = getViewWidget(getChildAt(i));
            if (viewWidget != null) {
                viewWidget.reset();
            }
        }
        if (zIsInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    getTargetWidget(childAt.getId()).mDebugName = resourceName;
                } catch (Resources.NotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof C19MD)) {
                    this.mConstraintSet = ((C19MD) childAt2).getConstraintSet();
                }
            }
        }
        C19MB c19mb = this.mConstraintSet;
        if (c19mb != null) {
            c19mb.LIZJ(this);
        }
        this.mLayoutWidget.LIZ.clear();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            int i4 = 0;
            do {
                ((C19MX) ListProtector.get(this.mConstraintHelpers, i4)).updatePreLayout(this);
                i4++;
            } while (i4 < size);
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof C12MG) {
                C12MG c12mg = (C12MG) childAt3;
                if (c12mg.LL == -1 && !c12mg.isInEditMode()) {
                    int i6 = c12mg.LLILLL;
                    int visibility = c12mg.getVisibility();
                    c12mg.setVisibility(i6);
                    C1602160rnK.LIZIZ(visibility, i6, c12mg);
                }
                View viewFindViewById = findViewById(c12mg.LL);
                c12mg.LLILLJJLI = viewFindViewById;
                if (viewFindViewById != null) {
                    ((C19ME) viewFindViewById.getLayoutParams()).isInPlaceholder = true;
                    C786410Ut5.LJLLLLLL(0, c12mg.LLILLJJLI);
                    int visibility2 = c12mg.getVisibility();
                    c12mg.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility2, 0, c12mg);
                }
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt4 = getChildAt(i7);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt5 = getChildAt(i8);
            C19OA viewWidget2 = getViewWidget(childAt5);
            if (viewWidget2 != null) {
                C19ME c19me = (C19ME) childAt5.getLayoutParams();
                this.mLayoutWidget.LIZJ(viewWidget2);
                applyConstraintsFromLayoutParams(zIsInEditMode, childAt5, viewWidget2, c19me, this.mTempMapIdToWidget);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public C19ME generateDefaultLayoutParams() {
        return new C19ME(-2, -2);
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.LJIIL;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    private boolean updateHierarchy() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).isLayoutRequested()) {
                setChildrenConstraints();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void forceLayout() {
        markHierarchyDirty();
        super.forceLayout();
    }

    public boolean isRtl() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        markHierarchyDirty();
        super.requestLayout();
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public ConstraintLayout(Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new C19O9();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new C21530319Nt(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(null, 0, 0);
    }

    private final C19OA getTargetWidget(int i) {
        if (i == 0) {
            return this.mLayoutWidget;
        }
        View viewFindViewById = this.mChildrenByIds.get(i);
        if (viewFindViewById == null) {
            viewFindViewById = findViewById(i);
            if (viewFindViewById != null) {
                if (viewFindViewById != this && viewFindViewById.getParent() == this) {
                    onViewAdded(viewFindViewById);
                }
            } else {
                return null;
            }
        }
        if (viewFindViewById == this) {
            return this.mLayoutWidget;
        }
        if (viewFindViewById != null) {
            return ((C19ME) viewFindViewById.getLayoutParams()).widget;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C19ME;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<C19MX> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            int i = 0;
            do {
                ((C19MX) ListProtector.get(this.mConstraintHelpers, i)).updatePreDraw(this);
                i++;
            } while (i < size);
        }
        Canvas canvas2 = canvas;
        super.dispatchDraw(canvas2);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = CastIntegerProtector.parseInt(strArrSplit[0]);
                        int i4 = CastIntegerProtector.parseInt(strArrSplit[1]);
                        int i5 = CastIntegerProtector.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        int i8 = (int) ((CastIntegerProtector.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas2.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + i8;
                        Canvas canvas3 = canvas2;
                        canvas3.drawLine(f3, f2, f3, f4, paint);
                        canvas3.drawLine(f3, f4, f, f4, paint);
                        canvas3.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas3.drawLine(f, f2, f3, f4, paint);
                        canvas2 = canvas3;
                        canvas2.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public void fillMetrics(C21527919Mv c21527919Mv) {
        this.mLayoutWidget.LJFF.getClass();
    }

    @Override // android.view.ViewGroup
    public C19ME generateLayoutParams(AttributeSet attributeSet) {
        return new C19ME(getContext(), attributeSet);
    }

    public View getViewById(int i) {
        return this.mChildrenByIds.get(i);
    }

    public final C19OA getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((C19ME) view.getLayoutParams()).widget;
    }

    public void loadLayoutDescription(int i) {
        if (i != 0) {
            try {
                this.mConstraintLayoutSpec = new C19MO(getContext(), this, i);
                return;
            } catch (Resources.NotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                this.mConstraintLayoutSpec = null;
                return;
            }
        }
        this.mConstraintLayoutSpec = null;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C19OA viewWidget = getViewWidget(view);
        if ((view instanceof C20742216Eq) && !(viewWidget instanceof C19OI)) {
            C19ME c19me = (C19ME) view.getLayoutParams();
            C19OI c19oi = new C19OI();
            c19me.widget = c19oi;
            c19me.isGuideline = true;
            c19oi.LJ(c19me.orientation);
        }
        if (view instanceof C19MX) {
            C19MX c19mx = (C19MX) view;
            c19mx.validateParams();
            ((C19ME) view.getLayoutParams()).isHelper = true;
            if (!this.mConstraintHelpers.contains(c19mx)) {
                this.mConstraintHelpers.add(c19mx);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        C19OA viewWidget = getViewWidget(view);
        this.mLayoutWidget.LIZ.remove(viewWidget);
        viewWidget.reset();
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = new C19MO(getContext(), this, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    public void setConstraintSet(C19MB c19mb) {
        this.mConstraintSet = c19mb;
    }

    @Override // android.view.View
    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC21527819Mu abstractC21527819Mu) {
        C19MO c19mo = this.mConstraintLayoutSpec;
        if (c19mo != null) {
            c19mo.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        C19O9 c19o9 = this.mLayoutWidget;
        c19o9.LJIIL = i;
        C21531219Oc.LJIILL = c19o9.LJIIL(512);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C19ME(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new C19O9();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new C21530319Nt(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, 0, 0);
    }

    public Object getDesignInformation(int i, Object obj) {
        HashMap<String, Integer> map;
        if (i == 0 && (obj instanceof String) && (map = this.mDesignIds) != null && map.containsKey(obj)) {
            return this.mDesignIds.get(obj);
        }
        return null;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (!this.mDirtyHierarchy) {
            int childCount = getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                if (getChildAt(i3).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                }
                i3++;
            }
        }
        if (!this.mDirtyHierarchy) {
            int i4 = this.mOnMeasureWidthMeasureSpec;
            if (i4 == i && this.mOnMeasureHeightMeasureSpec == i2) {
                int width = this.mLayoutWidget.getWidth();
                int height = this.mLayoutWidget.getHeight();
                C19O9 c19o9 = this.mLayoutWidget;
                resolveMeasuredDimension(i, i2, width, height, c19o9.LJIILIIL, c19o9.LJIILJJIL);
                return;
            }
            if (i4 == i && View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && View.MeasureSpec.getMode(this.mOnMeasureHeightMeasureSpec) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i2) >= this.mLayoutWidget.getHeight()) {
                this.mOnMeasureWidthMeasureSpec = i;
                this.mOnMeasureHeightMeasureSpec = i2;
                int width2 = this.mLayoutWidget.getWidth();
                int height2 = this.mLayoutWidget.getHeight();
                C19O9 c19o92 = this.mLayoutWidget;
                resolveMeasuredDimension(i, i2, width2, height2, c19o92.LJIILIIL, c19o92.LJIILJJIL);
                return;
            }
        }
        this.mOnMeasureWidthMeasureSpec = i;
        this.mOnMeasureHeightMeasureSpec = i2;
        this.mLayoutWidget.LJ = isRtl();
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (updateHierarchy()) {
                C19O9 c19o93 = this.mLayoutWidget;
                c19o93.LIZIZ.LIZJ(c19o93);
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i, i2);
        int width3 = this.mLayoutWidget.getWidth();
        int height3 = this.mLayoutWidget.getHeight();
        C19O9 c19o94 = this.mLayoutWidget;
        resolveMeasuredDimension(i, i2, width3, height3, c19o94.LJIILIIL, c19o94.LJIILJJIL);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new C19O9();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new C21530319Nt(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i, 0);
    }

    private void init(AttributeSet attributeSet, int i, int i2) {
        C19O9 c19o9 = this.mLayoutWidget;
        c19o9.mCompanionWidget = this;
        C21530319Nt c21530319Nt = this.mMeasurer;
        c19o9.LIZLLL = c21530319Nt;
        c19o9.LIZJ.LJFF = c21530319Nt;
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, com.ss.android.ugc.aweme.app.R$styleable.ConstraintLayout_Layout, i, i2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == com.ss.android.ugc.aweme.app.R$styleable.ConstraintLayout_Layout_android_minWidth) {
                    this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == com.ss.android.ugc.aweme.app.R$styleable.ConstraintLayout_Layout_android_minHeight) {
                    this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == com.ss.android.ugc.aweme.app.R$styleable.ConstraintLayout_Layout_android_maxWidth) {
                    this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == com.ss.android.ugc.aweme.app.R$styleable.ConstraintLayout_Layout_android_maxHeight) {
                    this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == com.ss.android.ugc.aweme.app.R$styleable.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.mOptimizationLevel = typedArrayObtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == com.ss.android.ugc.aweme.app.R$styleable.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == com.ss.android.ugc.aweme.app.R$styleable.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C19MB c19mb = new C19MB();
                        this.mConstraintSet = c19mb;
                        c19mb.LJIJJ(resourceId2, getContext());
                    } catch (Resources.NotFoundException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        C19O9 c19o92 = this.mLayoutWidget;
        c19o92.LJIIL = this.mOptimizationLevel;
        C21531219Oc.LJIILL = c19o92.LJIIL(512);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.mDesignIds.put(strSubstring, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public void setState(int i, int i2, int i3) {
        C19MO c19mo = this.mConstraintLayoutSpec;
        if (c19mo != null) {
            c19mo.LIZIZ(i2, i3, i);
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new C19O9();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new C21530319Nt(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i, i2);
    }

    public void resolveSystem(C19O9 c19o9, int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i4 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        C21530319Nt c21530319Nt = this.mMeasurer;
        c21530319Nt.LIZIZ = iMax;
        c21530319Nt.LIZJ = iMax2;
        c21530319Nt.LIZLLL = paddingWidth;
        c21530319Nt.LJ = i4;
        c21530319Nt.LJFF = i2;
        c21530319Nt.LJI = i3;
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        if (iMax3 <= 0 && iMax4 <= 0) {
            iMax3 = Math.max(0, getPaddingLeft());
        } else if (isRtl()) {
            iMax3 = iMax4;
        }
        int i5 = size - paddingWidth;
        int i6 = size2 - i4;
        setSelfDimensionBehaviour(c19o9, mode, i5, mode2, i6);
        c19o9.LJIIJ(i, mode, i5, mode2, i6, iMax3, iMax);
    }

    public void applyConstraintsFromLayoutParams(boolean z, View view, C19OA c19oa, C19ME c19me, SparseArray<C19OA> sparseArray) {
        C19OA c19oa2;
        C19OA c19oa3;
        C19OA c19oa4;
        C19OA c19oa5;
        int i;
        C19OA c19oa6 = c19oa;
        c19me.validate();
        c19me.helped = false;
        c19oa6.mVisibility = view.getVisibility();
        if (c19me.isInPlaceholder) {
            c19oa6.inPlaceholder = true;
            c19oa6.mVisibility = 8;
        }
        c19oa6.mCompanionWidget = view;
        if (view instanceof C19MX) {
            ((C19MX) view).resolveRtl(c19oa6, this.mLayoutWidget.LJ);
        }
        if (c19me.isGuideline) {
            C19OI c19oi = (C19OI) c19oa6;
            int i2 = c19me.resolvedGuideBegin;
            int i3 = c19me.resolvedGuideEnd;
            float f = c19me.resolvedGuidePercent;
            if (f != -1.0f) {
                if (f > -1.0f) {
                    c19oi.LIZ = f;
                    c19oi.LIZIZ = -1;
                    c19oi.LIZJ = -1;
                    return;
                }
                return;
            }
            if (i2 != -1) {
                if (i2 <= -1) {
                    return;
                }
                c19oi.LIZ = -1.0f;
                c19oi.LIZIZ = i2;
                c19oi.LIZJ = -1;
                return;
            }
            if (i3 == -1 || i3 <= -1) {
                return;
            }
            c19oi.LIZ = -1.0f;
            c19oi.LIZIZ = -1;
            c19oi.LIZJ = i3;
            return;
        }
        int i4 = c19me.resolvedLeftToLeft;
        int i5 = c19me.resolvedLeftToRight;
        int i6 = c19me.resolvedRightToLeft;
        int i7 = c19me.resolvedRightToRight;
        int i8 = c19me.resolveGoneLeftMargin;
        int i9 = c19me.resolveGoneRightMargin;
        float f2 = c19me.resolvedHorizontalBias;
        int i10 = c19me.circleConstraint;
        if (i10 != -1) {
            C19OA c19oa7 = sparseArray.get(i10);
            if (c19oa7 != null) {
                c19oa6.connectCircularConstraint(c19oa7, c19me.circleAngle, c19me.circleRadius);
            }
        } else {
            if (i4 != -1) {
                C19OA c19oa8 = sparseArray.get(i4);
                if (c19oa8 != null) {
                    C19OV c19ov = C19OV.LEFT;
                    c19oa6.immediateConnect(c19ov, c19oa8, c19ov, ((ViewGroup.MarginLayoutParams) c19me).leftMargin, i8);
                }
            } else if (i5 != -1 && (c19oa2 = sparseArray.get(i5)) != null) {
                c19oa6.immediateConnect(C19OV.LEFT, c19oa2, C19OV.RIGHT, ((ViewGroup.MarginLayoutParams) c19me).leftMargin, i8);
            }
            if (i6 != -1) {
                C19OA c19oa9 = sparseArray.get(i6);
                if (c19oa9 != null) {
                    c19oa6 = c19oa6;
                    c19oa6.immediateConnect(C19OV.RIGHT, c19oa9, C19OV.LEFT, ((ViewGroup.MarginLayoutParams) c19me).rightMargin, i9);
                }
            } else if (i7 != -1 && (c19oa3 = sparseArray.get(i7)) != null) {
                C19OV c19ov2 = C19OV.RIGHT;
                c19oa6 = c19oa6;
                c19oa6.immediateConnect(c19ov2, c19oa3, c19ov2, ((ViewGroup.MarginLayoutParams) c19me).rightMargin, i9);
            }
            int i11 = c19me.topToTop;
            if (i11 != -1) {
                C19OA c19oa10 = sparseArray.get(i11);
                if (c19oa10 != null) {
                    C19OV c19ov3 = C19OV.TOP;
                    c19oa6.immediateConnect(c19ov3, c19oa10, c19ov3, ((ViewGroup.MarginLayoutParams) c19me).topMargin, c19me.goneTopMargin);
                }
            } else {
                int i12 = c19me.topToBottom;
                if (i12 != -1 && (c19oa4 = sparseArray.get(i12)) != null) {
                    c19oa6.immediateConnect(C19OV.TOP, c19oa4, C19OV.BOTTOM, ((ViewGroup.MarginLayoutParams) c19me).topMargin, c19me.goneTopMargin);
                }
            }
            int i13 = c19me.bottomToTop;
            if (i13 != -1) {
                C19OA c19oa11 = sparseArray.get(i13);
                if (c19oa11 != null) {
                    c19oa6.immediateConnect(C19OV.BOTTOM, c19oa11, C19OV.TOP, ((ViewGroup.MarginLayoutParams) c19me).bottomMargin, c19me.goneBottomMargin);
                }
            } else {
                int i14 = c19me.bottomToBottom;
                if (i14 != -1 && (c19oa5 = sparseArray.get(i14)) != null) {
                    C19OV c19ov4 = C19OV.BOTTOM;
                    c19oa6.immediateConnect(c19ov4, c19oa5, c19ov4, ((ViewGroup.MarginLayoutParams) c19me).bottomMargin, c19me.goneBottomMargin);
                }
            }
            int i15 = c19me.baselineToBaseline;
            if (i15 != -1) {
                View view2 = this.mChildrenByIds.get(i15);
                C19OA c19oa12 = sparseArray.get(c19me.baselineToBaseline);
                if (c19oa12 != null && view2 != null && (view2.getLayoutParams() instanceof C19ME)) {
                    C19ME c19me2 = (C19ME) view2.getLayoutParams();
                    c19me.needsBaseline = true;
                    c19me2.needsBaseline = true;
                    C19OV c19ov5 = C19OV.BASELINE;
                    c19oa6.getAnchor(c19ov5).LIZIZ(c19oa12.getAnchor(c19ov5), 0, -1, true);
                    c19oa6.hasBaseline = true;
                    c19me2.widget.hasBaseline = true;
                    c19oa6.getAnchor(C19OV.TOP).LJIIIZ();
                    c19oa6.getAnchor(C19OV.BOTTOM).LJIIIZ();
                }
            }
            if (f2 >= 0.0f) {
                c19oa6.mHorizontalBiasPercent = f2;
            }
            float f3 = c19me.verticalBias;
            if (f3 >= 0.0f) {
                c19oa6.mVerticalBiasPercent = f3;
            }
        }
        if (z && ((i = c19me.editorAbsoluteX) != -1 || c19me.editorAbsoluteY != -1)) {
            c19oa6.setOrigin(i, c19me.editorAbsoluteY);
        }
        if (!c19me.horizontalDimensionFixed) {
            if (((ViewGroup.MarginLayoutParams) c19me).width == -1) {
                if (c19me.constrainedWidth) {
                    c19oa6.setHorizontalDimensionBehaviour(C19O3.MATCH_CONSTRAINT);
                } else {
                    c19oa6.setHorizontalDimensionBehaviour(C19O3.MATCH_PARENT);
                }
                c19oa6.getAnchor(C19OV.LEFT).LJI = ((ViewGroup.MarginLayoutParams) c19me).leftMargin;
                c19oa6.getAnchor(C19OV.RIGHT).LJI = ((ViewGroup.MarginLayoutParams) c19me).rightMargin;
            } else {
                c19oa6.setHorizontalDimensionBehaviour(C19O3.MATCH_CONSTRAINT);
                c19oa6.setWidth(0);
            }
        } else {
            c19oa6.setHorizontalDimensionBehaviour(C19O3.FIXED);
            c19oa6.setWidth(((ViewGroup.MarginLayoutParams) c19me).width);
            if (((ViewGroup.MarginLayoutParams) c19me).width == -2) {
                c19oa6.setHorizontalDimensionBehaviour(C19O3.WRAP_CONTENT);
            }
        }
        if (!c19me.verticalDimensionFixed) {
            if (((ViewGroup.MarginLayoutParams) c19me).height == -1) {
                if (c19me.constrainedHeight) {
                    c19oa6.setVerticalDimensionBehaviour(C19O3.MATCH_CONSTRAINT);
                } else {
                    c19oa6.setVerticalDimensionBehaviour(C19O3.MATCH_PARENT);
                }
                c19oa6.getAnchor(C19OV.TOP).LJI = ((ViewGroup.MarginLayoutParams) c19me).topMargin;
                c19oa6.getAnchor(C19OV.BOTTOM).LJI = ((ViewGroup.MarginLayoutParams) c19me).bottomMargin;
            } else {
                c19oa6.setVerticalDimensionBehaviour(C19O3.MATCH_CONSTRAINT);
                c19oa6.setHeight(0);
            }
        } else {
            c19oa6.setVerticalDimensionBehaviour(C19O3.FIXED);
            c19oa6.setHeight(((ViewGroup.MarginLayoutParams) c19me).height);
            if (((ViewGroup.MarginLayoutParams) c19me).height == -2) {
                c19oa6.setVerticalDimensionBehaviour(C19O3.WRAP_CONTENT);
            }
        }
        c19oa6.setDimensionRatio(c19me.dimensionRatio);
        c19oa6.setHorizontalWeight(c19me.horizontalWeight);
        c19oa6.setVerticalWeight(c19me.verticalWeight);
        c19oa6.mHorizontalChainStyle = c19me.horizontalChainStyle;
        c19oa6.mVerticalChainStyle = c19me.verticalChainStyle;
        c19oa6.setHorizontalMatchStyle(c19me.matchConstraintDefaultWidth, c19me.matchConstraintMinWidth, c19me.matchConstraintMaxWidth, c19me.matchConstraintPercentWidth);
        c19oa6.setVerticalMatchStyle(c19me.matchConstraintDefaultHeight, c19me.matchConstraintMinHeight, c19me.matchConstraintMaxHeight, c19me.matchConstraintPercentHeight);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            C19ME c19me = (C19ME) childAt.getLayoutParams();
            C19OA c19oa = c19me.widget;
            if ((childAt.getVisibility() != 8 || c19me.isGuideline || c19me.isHelper || c19me.isVirtualGroup || zIsInEditMode) && !c19me.isInPlaceholder) {
                int x = c19oa.getX();
                int y = c19oa.getY();
                int width = c19oa.getWidth() + x;
                int height = c19oa.getHeight() + y;
                childAt.layout(x, y, width, height);
                if ((childAt instanceof C12MG) && (content = ((C12MG) childAt).getContent()) != null) {
                    C786410Ut5.LJLLLLLL(0, content);
                    content.layout(x, y, width, height);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            do {
                ((C19MX) ListProtector.get(this.mConstraintHelpers, i5)).updatePostLayout(this);
                i5++;
            } while (i5 < size);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[PHI: r4
      0x0071: PHI (r4v4 X.19O3) = (r4v3 X.19O3), (r4v0 X.19O3) binds: [B:20:0x0068, B:10:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSelfDimensionBehaviour(X.C19O9 r10, int r11, int r12, int r13, int r14) {
        /*
            r9 = this;
            X.19Nt r0 = r9.mMeasurer
            int r2 = r0.LJ
            int r3 = r0.LIZLLL
            X.19O3 r4 = X.C19O3.FIXED
            int r8 = r9.getChildCount()
            r7 = 1073741824(0x40000000, float:2.0)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 0
            if (r11 == r6) goto L92
            if (r11 == 0) goto L87
            if (r11 == r7) goto L7e
            r5 = r4
        L18:
            r12 = 0
        L19:
            if (r13 == r6) goto L73
            if (r13 == 0) goto L66
            if (r13 != r7) goto L71
            int r0 = r9.mMaxHeight
            int r0 = r0 - r2
            int r14 = java.lang.Math.min(r0, r14)
        L26:
            int r0 = r10.getWidth()
            if (r12 != r0) goto L32
            int r0 = r10.getHeight()
            if (r14 == r0) goto L37
        L32:
            X.19OB r6 = r10.LIZJ
            r0 = 1
            r6.LIZJ = r0
        L37:
            r10.mX = r1
            r10.mY = r1
            int r0 = r9.mMaxWidth
            int r0 = r0 - r3
            r10.setMaxWidth(r0)
            int r0 = r9.mMaxHeight
            int r0 = r0 - r2
            r10.setMaxHeight(r0)
            r10.setMinWidth(r1)
            r10.setMinHeight(r1)
            r10.setHorizontalDimensionBehaviour(r5)
            r10.setWidth(r12)
            r10.setVerticalDimensionBehaviour(r4)
            r10.setHeight(r14)
            int r0 = r9.mMinWidth
            int r0 = r0 - r3
            r10.setMinWidth(r0)
            int r0 = r9.mMinHeight
            int r0 = r0 - r2
            r10.setMinHeight(r0)
            return
        L66:
            X.19O3 r4 = X.C19O3.WRAP_CONTENT
            if (r8 != 0) goto L71
            int r0 = r9.mMinHeight
            int r14 = java.lang.Math.max(r1, r0)
            goto L26
        L71:
            r14 = 0
            goto L26
        L73:
            X.19O3 r4 = X.C19O3.WRAP_CONTENT
            if (r8 != 0) goto L26
            int r0 = r9.mMinHeight
            int r14 = java.lang.Math.max(r1, r0)
            goto L26
        L7e:
            int r0 = r9.mMaxWidth
            int r0 = r0 - r3
            int r12 = java.lang.Math.min(r0, r12)
            r5 = r4
            goto L19
        L87:
            X.19O3 r5 = X.C19O3.WRAP_CONTENT
            if (r8 != 0) goto L18
            int r0 = r9.mMinWidth
            int r12 = java.lang.Math.max(r1, r0)
            goto L19
        L92:
            X.19O3 r5 = X.C19O3.WRAP_CONTENT
            if (r8 != 0) goto L19
            int r0 = r9.mMinWidth
            int r12 = java.lang.Math.max(r1, r0)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.setSelfDimensionBehaviour(X.19O9, int, int, int, int):void");
    }

    public void resolveMeasuredDimension(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C21530319Nt c21530319Nt = this.mMeasurer;
        int i5 = c21530319Nt.LJ;
        int iResolveSizeAndState = ViewGroup.resolveSizeAndState(i3 + c21530319Nt.LIZLLL, i, 0);
        int iResolveSizeAndState2 = ViewGroup.resolveSizeAndState(i4 + i5, i2, 0) & 16777215;
        int iMin = Math.min(this.mMaxWidth, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.mMaxHeight, iResolveSizeAndState2);
        if (z) {
            iMin |= 16777216;
        }
        if (z2) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.mLastMeasureWidth = iMin;
        this.mLastMeasureHeight = iMin2;
    }
}
