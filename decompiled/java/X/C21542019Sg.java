package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import u4.q0;

/* JADX INFO: renamed from: X.19Sg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21542019Sg extends LinearLayout {
    public final List<C21542419Sk> LL;
    public final C21542319Sj LLILLJJLI;
    public final C19S2 LLILLL;
    public final LinkedHashSet<InterfaceC21542519Sl> LLILZ;
    public final C21542219Si LLILZIL;
    public Integer[] LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public int LLJI;

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof C19S0) && LJ(i2)) {
                i++;
            }
        }
        return i;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return C21542019Sg.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.LLIZLLLIL) {
            return this.LLJI;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            C19S0 c19s0LIZLLL = LIZLLL(i);
            if (c19s0LIZLLL.isChecked()) {
                arrayList.add(Integer.valueOf(c19s0LIZLLL.getId()));
            }
        }
        return arrayList;
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (LJ(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (LJ(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    public final void LIZ() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            C19S0 c19s0LIZLLL = LIZLLL(i);
            int iMin = Math.min(c19s0LIZLLL.getStrokeWidth(), LIZLLL(i - 1).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = c19s0LIZLLL.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                layoutParams2.setMarginStart(0);
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19s0LIZLLL);
            c19s0LIZLLL.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) LIZLLL(firstVisibleChildIndex).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    public final void LJII() {
        C21542419Sk c21542419Sk;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            C19S0 c19s0LIZLLL = LIZLLL(i);
            if (c19s0LIZLLL.getVisibility() != 8) {
                C19RX shapeAppearanceModel = c19s0LIZLLL.getShapeAppearanceModel();
                shapeAppearanceModel.getClass();
                C19RY c19ry = new C19RY(shapeAppearanceModel);
                C21542419Sk c21542419Sk2 = (C21542419Sk) ListProtector.get(this.LL, i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z = getOrientation() == 0;
                    if (i != firstVisibleChildIndex) {
                        if (i == lastVisibleChildIndex) {
                            if (!z) {
                                C1844490y6B c1844490y6B = C21542419Sk.LJ;
                                c21542419Sk = new C21542419Sk(c1844490y6B, c21542419Sk2.LIZLLL, c1844490y6B, c21542419Sk2.LIZJ);
                            } else if (C21551419Vw.LIZJ(this)) {
                                InterfaceC21538819Ra interfaceC21538819Ra = c21542419Sk2.LIZ;
                                InterfaceC21538819Ra interfaceC21538819Ra2 = c21542419Sk2.LIZLLL;
                                C1844490y6B c1844490y6B2 = C21542419Sk.LJ;
                                c21542419Sk = new C21542419Sk(interfaceC21538819Ra, interfaceC21538819Ra2, c1844490y6B2, c1844490y6B2);
                            } else {
                                C1844490y6B c1844490y6B3 = C21542419Sk.LJ;
                                c21542419Sk = new C21542419Sk(c1844490y6B3, c1844490y6B3, c21542419Sk2.LIZIZ, c21542419Sk2.LIZJ);
                            }
                        }
                        c19ry.LIZJ(0.0f);
                    } else if (!z) {
                        InterfaceC21538819Ra interfaceC21538819Ra3 = c21542419Sk2.LIZ;
                        C1844490y6B c1844490y6B4 = C21542419Sk.LJ;
                        c21542419Sk = new C21542419Sk(interfaceC21538819Ra3, c1844490y6B4, c21542419Sk2.LIZIZ, c1844490y6B4);
                    } else if (C21551419Vw.LIZJ(this)) {
                        C1844490y6B c1844490y6B5 = C21542419Sk.LJ;
                        c21542419Sk = new C21542419Sk(c1844490y6B5, c1844490y6B5, c21542419Sk2.LIZIZ, c21542419Sk2.LIZJ);
                    } else {
                        InterfaceC21538819Ra interfaceC21538819Ra4 = c21542419Sk2.LIZ;
                        InterfaceC21538819Ra interfaceC21538819Ra5 = c21542419Sk2.LIZLLL;
                        C1844490y6B c1844490y6B6 = C21542419Sk.LJ;
                        c21542419Sk = new C21542419Sk(interfaceC21538819Ra4, interfaceC21538819Ra5, c1844490y6B6, c1844490y6B6);
                    }
                    c21542419Sk2 = c21542419Sk;
                    c19ry.LJ = c21542419Sk2.LIZ;
                    c19ry.LJII = c21542419Sk2.LIZLLL;
                    c19ry.LJFF = c21542419Sk2.LIZIZ;
                    c19ry.LJI = c21542419Sk2.LIZJ;
                } else if (c21542419Sk2 == null) {
                    c19ry.LIZJ(0.0f);
                } else {
                    c19ry.LJ = c21542419Sk2.LIZ;
                    c19ry.LJII = c21542419Sk2.LIZLLL;
                    c19ry.LJFF = c21542419Sk2.LIZIZ;
                    c19ry.LJI = c21542419Sk2.LIZJ;
                }
                c19s0LIZLLL.setShapeAppearanceModel(new C19RX(c19ry));
            }
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.LLJI;
        if (i != -1) {
            LJFF(i, true);
            LJI(i, true);
            setCheckedId(i);
        }
    }

    private void setCheckedId(int i) {
        this.LLJI = i;
        LIZJ(i, true);
    }

    private void setGeneratedIdIfNeeded(C19S0 c19s0) {
        if (c19s0.getId() == -1) {
            c19s0.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(C19S0 c19s0) {
        c19s0.setMaxLines(1);
        c19s0.setEllipsize(TextUtils.TruncateAt.END);
        c19s0.setCheckable(true);
        c19s0.LLILLJJLI.add(this.LLILLJJLI);
        c19s0.setOnPressedChangeListenerInternal(this.LLILLL);
        c19s0.setShouldDrawSurfaceColorStroke(true);
    }

    public final void LIZIZ(int i) {
        if (i == this.LLJI) {
            return;
        }
        LJFF(i, true);
        LJI(i, true);
        setCheckedId(i);
    }

    public final C19S0 LIZLLL(int i) {
        return (C19S0) getChildAt(i);
    }

    public final boolean LJ(int i) {
        if (getChildAt(i).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.LLILZIL);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(LIZLLL(i), Integer.valueOf(i));
        }
        this.LLILZLL = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatWrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (this.LLIZLLLIL) {
            i = 1;
        } else {
            i = 2;
        }
        accessibilityNodeInfoCompatWrap.setCollectionInfo(C20093113jd.LIZIZ(1, visibleButtonCount, i, false));
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof C19S0) {
            C19S0 c19s0 = (C19S0) view;
            c19s0.LLILLJJLI.remove(this.LLILLJJLI);
            c19s0.setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            ListProtector.remove(this.LL, iIndexOfChild);
        }
        LJII();
        LIZ();
    }

    public void setSelectionRequired(boolean z) {
        this.LLJ = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.LLIZLLLIL != z) {
            this.LLIZLLLIL = z;
            this.LLIZ = true;
            for (int i = 0; i < getChildCount(); i++) {
                C19S0 c19s0LIZLLL = LIZLLL(i);
                c19s0LIZLLL.setChecked(false);
                LIZJ(c19s0LIZLLL.getId(), false);
            }
            this.LLIZ = false;
            setCheckedId(-1);
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.19Sj] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.19Si] */
    public C21542019Sg(Context context, AttributeSet attributeSet) {
        super(C1369550lk9.LIZ(context, attributeSet, R.attr.f3b, R.style.a52), attributeSet, R.attr.f3b);
        this.LL = new ArrayList();
        this.LLILLJJLI = new C19S3() { // from class: X.19Sj
            @Override // X.C19S3
            public final void LIZ(C19S0 c19s0, boolean z) {
                int id;
                C21542019Sg c21542019Sg = this.LIZ;
                if (c21542019Sg.LLIZ) {
                    return;
                }
                if (c21542019Sg.LLIZLLLIL) {
                    if (z) {
                        id = c19s0.getId();
                    } else {
                        id = -1;
                    }
                    c21542019Sg.LLJI = id;
                }
                if (this.LIZ.LJI(c19s0.getId(), z)) {
                    this.LIZ.LIZJ(c19s0.getId(), c19s0.isChecked());
                }
                this.LIZ.invalidate();
            }
        };
        this.LLILLL = new C19S2(this);
        this.LLILZ = new LinkedHashSet<>();
        this.LLILZIL = new Comparator<C19S0>() { // from class: X.19Si
            @Override // java.util.Comparator
            public final int compare(C19S0 c19s0, C19S0 c19s02) {
                C19S0 c19s03 = c19s0;
                C19S0 c19s04 = c19s02;
                int iCompareTo = Boolean.valueOf(c19s03.isChecked()).compareTo(Boolean.valueOf(c19s04.isChecked()));
                if (iCompareTo == 0) {
                    int iCompareTo2 = Boolean.valueOf(c19s03.isPressed()).compareTo(Boolean.valueOf(c19s04.isPressed()));
                    if (iCompareTo2 == 0) {
                        return Integer.valueOf(this.LL.indexOfChild(c19s03)).compareTo(Integer.valueOf(this.LL.indexOfChild(c19s04)));
                    }
                    return iCompareTo2;
                }
                return iCompareTo;
            }
        };
        this.LLIZ = false;
        TypedArray typedArrayLIZLLL = C19PG.LIZLLL(getContext(), attributeSet, R$styleable.MaterialButtonToggleGroup, R.attr.f3b, R.style.a52, new int[0]);
        setSingleSelection(typedArrayLIZLLL.getBoolean(R$styleable.MaterialButtonToggleGroup_singleSelection, false));
        this.LLJI = typedArrayLIZLLL.getResourceId(R$styleable.MaterialButtonToggleGroup_checkedButton, -1);
        this.LLJ = typedArrayLIZLLL.getBoolean(R$styleable.MaterialButtonToggleGroup_selectionRequired, false);
        setChildrenDrawingOrderEnabled(true);
        typedArrayLIZLLL.recycle();
        setImportantForAccessibility(1);
    }

    public final void LIZJ(int i, boolean z) {
        Iterator<InterfaceC21542519Sl> it2 = this.LLILZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(i, z);
        }
    }

    public final void LJFF(int i, boolean z) {
        View viewFindViewById = findViewById(i);
        if (viewFindViewById instanceof C19S0) {
            this.LLIZ = true;
            ((C19S0) viewFindViewById).setChecked(z);
            this.LLIZ = false;
        }
    }

    public final boolean LJI(int i, boolean z) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (this.LLJ && checkedButtonIds.isEmpty()) {
            LJFF(i, true);
            this.LLJI = i;
            return false;
        }
        if (z && this.LLIZLLLIL) {
            checkedButtonIds.remove(Integer.valueOf(i));
            Iterator<Integer> it2 = checkedButtonIds.iterator();
            while (it2.hasNext()) {
                int iIntValue = it2.next().intValue();
                LJFF(iIntValue, false);
                LIZJ(iIntValue, false);
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.LLILZLL;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        return i2;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        LJII();
        LIZ();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof C19S0)) {
            return;
        }
        super.addView(view, i, layoutParams);
        C19S0 c19s0 = (C19S0) view;
        setGeneratedIdIfNeeded(c19s0);
        setupButtonChild(c19s0);
        if (c19s0.isChecked()) {
            LJI(c19s0.getId(), true);
            setCheckedId(c19s0.getId());
        }
        C19RX shapeAppearanceModel = c19s0.getShapeAppearanceModel();
        ((ArrayList) this.LL).add(new C21542419Sk(shapeAppearanceModel.LJ, shapeAppearanceModel.LJII, shapeAppearanceModel.LJFF, shapeAppearanceModel.LJI));
        q0.LJIJ(c19s0, new C20094213jo() { // from class: X.19Sh
            @Override // X.C20094213jo
            public final void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                int i2;
                super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                C21542019Sg c21542019Sg = this.LIZ;
                c21542019Sg.getClass();
                if (view2 instanceof C19S0) {
                    i2 = 0;
                    for (int i3 = 0; i3 < c21542019Sg.getChildCount(); i3++) {
                        if (c21542019Sg.getChildAt(i3) == view2) {
                            break;
                        }
                        if ((c21542019Sg.getChildAt(i3) instanceof C19S0) && c21542019Sg.LJ(i3)) {
                            i2++;
                        }
                    }
                    i2 = -1;
                } else {
                    i2 = -1;
                }
                accessibilityNodeInfoCompat.setCollectionItemInfo(C20092913jb.LIZ(0, 1, i2, 1, ((C19S0) view2).isChecked()));
            }
        });
    }
}
