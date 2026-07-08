package com.bytedance.android.live.effect.sticker.list;

import X.C08CX;
import X.C0UBG;
import X.C13LP;
import X.C13LZ;
import X.C1846520y9S;
import X.C20441214yg;
import X.C21673319rv;
import X.C21673919s1;
import X.C21683519tZ;
import X.C21683619ta;
import X.C21683719tb;
import X.C2188811AlT;
import X.C2189501Ama;
import X.C2189641Amo;
import X.C497740JfY;
import X.EnumC769180UFg;
import X.EnumC992290bvf;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes34.dex */
public class SpannedGridLayoutManager extends RecyclerView.LayoutManager {
    public final EnumC769180UFg LL;
    public int LLILLL;
    public C21683519tZ LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public Integer LLIZLLLIL;
    public boolean LLJ;
    public C0UBG LLJI;
    public final int LLILLJJLI = 5;
    public final Map<Integer, Rect> LLIZ = new LinkedHashMap();

    public final int LJIILL() {
        return this.LL == EnumC769180UFg.VERTICAL ? getPaddingBottom() : getPaddingRight();
    }

    public final int LJIILLIIL() {
        return this.LL == EnumC769180UFg.VERTICAL ? getPaddingTop() : getPaddingLeft();
    }

    public final C21683519tZ LJIIZILJ() {
        C21683519tZ c21683519tZ = this.LLILZ;
        if (c21683519tZ != null) {
            return c21683519tZ;
        }
        return null;
    }

    public final int LJIJ() {
        return this.LL == EnumC769180UFg.VERTICAL ? getHeight() : getWidth();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return this.LL == EnumC769180UFg.HORIZONTAL;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return this.LL == EnumC769180UFg.VERTICAL;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final Parcelable onSaveInstanceState() {
        if (!this.LLJ || getChildCount() <= 0) {
            return null;
        }
        return new SavedState(LJIILJJIL());
    }

    public final int LJIILJJIL() {
        View childAt;
        if (getChildCount() == 0 || (childAt = getChildAt(0)) == null) {
            return 0;
        }
        return getPosition(childAt);
    }

    public static final class SavedState implements Parcelable {
        public final int firstVisibleItem;
        public static final C21683619ta Companion = new Object() { // from class: X.19ta
        };
        public static final Parcelable.Creator<SavedState> CREATOR = new C2189641Amo(12);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public SavedState(int i) {
            this.firstVisibleItem = i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.firstVisibleItem);
        }
    }

    public SpannedGridLayoutManager(EnumC769180UFg enumC769180UFg) {
        this.LL = enumC769180UFg;
    }

    public final void LJIIL(C21673319rv c21673319rv) {
        int iLIZIZ;
        int iLIZIZ2;
        int iLJIJ = this.LLILLL + LJIJ();
        if (LJIIZILJ().LIZIZ() <= 0 || (iLIZIZ = this.LLILZLL / LJIIZILJ().LIZIZ()) > (iLIZIZ2 = iLJIJ / LJIIZILJ().LIZIZ())) {
            return;
        }
        while (true) {
            Set set = (Set) ((LinkedHashMap) LJIIZILJ().LIZLLL).get(Integer.valueOf(iLIZIZ));
            if (set != null) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    int iIntValue = ((Number) it2.next()).intValue();
                    if (findViewByPosition(iIntValue) == null) {
                        LJIJI(iIntValue, EnumC992290bvf.END, c21673319rv);
                    }
                }
            }
            if (iLIZIZ != iLIZIZ2) {
                iLIZIZ++;
            } else {
                return;
            }
        }
    }

    public final void LJIILIIL(C21673319rv c21673319rv) {
        int iLIZIZ = LJIIZILJ().LIZIZ();
        if (iLIZIZ > 0) {
            C1846520y9S c1846520y9SLJIIL = C13LZ.LJIIL(C13LZ.LJIILJJIL((this.LLILLL - LJIILLIIL()) / iLIZIZ, ((this.LLILLL + LJIJ()) - LJIILLIIL()) / iLIZIZ));
            int i = c1846520y9SLJIIL.LL;
            int i2 = c1846520y9SLJIIL.LLILLJJLI;
            int i3 = c1846520y9SLJIIL.LLILLL;
            if (i3 > 0) {
                if (i > i2) {
                    return;
                }
            } else if (i3 >= 0 || i2 > i) {
                return;
            }
            while (true) {
                Iterable iterable = (Set) ((LinkedHashMap) LJIIZILJ().LIZLLL).get(Integer.valueOf(i));
                if (iterable == null) {
                    iterable = C08CX.INSTANCE;
                }
                Iterator it2 = C13LP.LJLJJLL(iterable).iterator();
                while (it2.hasNext()) {
                    int iIntValue = ((Number) it2.next()).intValue();
                    if (findViewByPosition(iIntValue) == null) {
                        LJIJI(iIntValue, EnumC992290bvf.START, c21673319rv);
                    }
                }
                if (i == i2) {
                    return;
                } else {
                    i += i3;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollExtent(C21673919s1 c21673919s1) {
        return getChildCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollOffset(C21673919s1 c21673919s1) {
        if (getChildCount() == 0) {
            return 0;
        }
        return LJIILJJIL();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollRange(C21673919s1 c21673919s1) {
        return c21673919s1.LIZIZ();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollExtent(C21673919s1 c21673919s1) {
        return getChildCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollOffset(C21673919s1 c21673919s1) {
        if (getChildCount() == 0) {
            return 0;
        }
        return LJIILJJIL();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollRange(C21673919s1 c21673919s1) {
        return c21673919s1.LIZIZ();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int getDecoratedBottom(View view) {
        int position = getPosition(view);
        int topDecorationHeight = getTopDecorationHeight(view) + getBottomDecorationHeight(view);
        Rect rect = (Rect) ((LinkedHashMap) this.LLIZ).get(Integer.valueOf(position));
        if (rect != null) {
            topDecorationHeight = rect.bottom;
        }
        if (this.LL == EnumC769180UFg.VERTICAL) {
            return topDecorationHeight - (this.LLILLL - LJIILLIIL());
        }
        return topDecorationHeight;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int getDecoratedLeft(View view) {
        int position = getPosition(view);
        int leftDecorationWidth = getLeftDecorationWidth(view);
        Rect rect = (Rect) ((LinkedHashMap) this.LLIZ).get(Integer.valueOf(position));
        if (rect != null) {
            leftDecorationWidth = rect.left;
        }
        if (this.LL == EnumC769180UFg.HORIZONTAL) {
            return leftDecorationWidth - this.LLILLL;
        }
        return leftDecorationWidth;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int getDecoratedMeasuredHeight(View view) {
        int position = getPosition(view);
        Rect rect = (Rect) ((LinkedHashMap) this.LLIZ).get(Integer.valueOf(position));
        if (rect != null) {
            return rect.height();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int getDecoratedMeasuredWidth(View view) {
        int position = getPosition(view);
        Rect rect = (Rect) ((LinkedHashMap) this.LLIZ).get(Integer.valueOf(position));
        if (rect != null) {
            return rect.width();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int getDecoratedRight(View view) {
        int position = getPosition(view);
        int leftDecorationWidth = getLeftDecorationWidth(view) + getRightDecorationWidth(view);
        Rect rect = (Rect) ((LinkedHashMap) this.LLIZ).get(Integer.valueOf(position));
        if (rect != null) {
            leftDecorationWidth = rect.right;
        }
        if (this.LL == EnumC769180UFg.HORIZONTAL) {
            return leftDecorationWidth - (this.LLILLL - LJIILLIIL());
        }
        return leftDecorationWidth;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int getDecoratedTop(View view) {
        int position = getPosition(view);
        int topDecorationHeight = getTopDecorationHeight(view);
        Rect rect = (Rect) ((LinkedHashMap) this.LLIZ).get(Integer.valueOf(position));
        if (rect != null) {
            topDecorationHeight = rect.top;
        }
        if (this.LL == EnumC769180UFg.VERTICAL) {
            return topDecorationHeight - this.LLILLL;
        }
        return topDecorationHeight;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState;
        if ((parcelable instanceof SavedState) && (savedState = (SavedState) parcelable) != null) {
            scrollToPosition(savedState.firstVisibleItem);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void scrollToPosition(int i) {
        this.LLIZLLLIL = Integer.valueOf(i);
        requestLayout();
    }

    public final void LJIJJ(EnumC992290bvf enumC992290bvf, C21673319rv c21673319rv) {
        int decoratedLeft;
        int decoratedRight;
        if (enumC992290bvf == EnumC992290bvf.END) {
            int childCount = getChildCount();
            int iLJIILLIIL = LJIILLIIL();
            ArrayList<View> arrayList = new ArrayList();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt != null) {
                    if (this.LL == EnumC769180UFg.VERTICAL) {
                        decoratedRight = getDecoratedBottom(childAt);
                    } else {
                        decoratedRight = getDecoratedRight(childAt);
                    }
                    if (decoratedRight < iLJIILLIIL) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Child: ");
                        sbLIZ.append(i);
                        C20441214yg.LIZIZ("SpannedGridLayoutMan::AddToDetachStart", C2188811AlT.LIZIZ(sbLIZ));
                        arrayList.add(childAt);
                    }
                }
            }
            for (View view : arrayList) {
                removeAndRecycleView(view, c21673319rv);
                LJIL(view, enumC992290bvf);
            }
            return;
        }
        int childCount2 = getChildCount();
        int iLJIJ = LJIJ() + LJIILL();
        ArrayList<View> arrayList2 = new ArrayList();
        C1846520y9S c1846520y9SLJIIL = C13LZ.LJIIL(C13LZ.LJIILJJIL(0, childCount2));
        int i2 = c1846520y9SLJIIL.LL;
        int i3 = c1846520y9SLJIIL.LLILLJJLI;
        int i4 = c1846520y9SLJIIL.LLILLL;
        if (i4 <= 0 ? !(i4 >= 0 || i3 > i2) : i2 <= i3) {
            while (true) {
                View childAt2 = getChildAt(i2);
                if (childAt2 != null) {
                    if (this.LL == EnumC769180UFg.VERTICAL) {
                        decoratedLeft = getDecoratedTop(childAt2);
                    } else {
                        decoratedLeft = getDecoratedLeft(childAt2);
                    }
                    if (decoratedLeft > iLJIJ) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Child: ");
                        sbLIZ2.append(i2);
                        C20441214yg.LIZIZ("SpannedGridLayoutMan::AddToDetachEnd", C2188811AlT.LIZIZ(sbLIZ2));
                        arrayList2.add(childAt2);
                    }
                }
                if (i2 == i3) {
                    break;
                } else {
                    i2 += i4;
                }
            }
        }
        for (View view2 : arrayList2) {
            removeAndRecycleView(view2, c21673319rv);
            LJIL(view2, enumC992290bvf);
        }
    }

    public final int LJIJJLI(int i, C21673919s1 c21673919s1) {
        int iLIZIZ = this.LLILZLL + LJIIZILJ().LIZIZ() + LJIILL();
        int i2 = this.LLILLL - i;
        this.LLILLL = i2;
        if (i2 < 0) {
            i += i2;
            this.LLILLL = 0;
        }
        if (this.LLILLL + LJIJ() > iLIZIZ && LJIILJJIL() + getChildCount() + this.LLILLJJLI >= c21673919s1.LIZIZ()) {
            i -= (iLIZIZ - this.LLILLL) - LJIJ();
            this.LLILLL = iLIZIZ - LJIJ();
        }
        if (this.LL == EnumC769180UFg.VERTICAL) {
            offsetChildrenVertical(i);
            return i;
        }
        offsetChildrenHorizontal(i);
        return i;
    }

    public final void LJIL(View view, EnumC992290bvf enumC992290bvf) {
        int decoratedLeft;
        int decoratedRight;
        EnumC769180UFg enumC769180UFg = this.LL;
        EnumC769180UFg enumC769180UFg2 = EnumC769180UFg.VERTICAL;
        if (enumC769180UFg == enumC769180UFg2) {
            decoratedLeft = getDecoratedTop(view);
        } else {
            decoratedLeft = getDecoratedLeft(view);
        }
        int i = decoratedLeft + this.LLILLL;
        if (this.LL == enumC769180UFg2) {
            decoratedRight = getDecoratedBottom(view);
        } else {
            decoratedRight = getDecoratedRight(view);
        }
        int i2 = decoratedRight + this.LLILLL;
        if (enumC992290bvf == EnumC992290bvf.END) {
            this.LLILZIL = LJIILLIIL() + i2;
        } else {
            if (enumC992290bvf != EnumC992290bvf.START) {
                return;
            }
            this.LLILZLL = LJIILLIIL() + i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x01b3, code lost:
    
        r13 = r12.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01bb, code lost:
    
        if (r13.hasNext() == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01bd, code lost:
    
        r6 = r13.next();
        r2 = (android.graphics.Rect) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01c8, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r2, r7) != false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ce, code lost:
    
        if (r2.contains(r7) == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01d0, code lost:
    
        if (r6 == null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01d3, code lost:
    
        ((java.util.ArrayList) r11.LJFF).add(r7);
     */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayoutChildren(X.C21673319rv r18, X.C21673919s1 r19) {
        /*
            Method dump skipped, instruction units count: 775
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.sticker.list.SpannedGridLayoutManager.onLayoutChildren(X.19rv, X.19s1):void");
    }

    public final void LJIJI(int i, EnumC992290bvf enumC992290bvf, C21673319rv c21673319rv) {
        C21683719tb c21683719tb;
        final int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int decoratedLeft;
        View viewLJI = c21673319rv.LJI(i);
        if (C497740JfY.LJJ()) {
            viewLJI.setLayoutDirection(1);
        } else {
            viewLJI.setLayoutDirection(0);
        }
        C21683519tZ c21683519tZLJIIZILJ = LJIIZILJ();
        int iLIZIZ = c21683519tZLJIIZILJ.LIZIZ();
        int iLIZIZ2 = c21683519tZLJIIZILJ.LIZIZ();
        C0UBG c0ubg = this.LLJI;
        if (c0ubg != null) {
            c21683719tb = c0ubg.LIZ(i);
        } else {
            c21683719tb = new C21683719tb(1, 1);
        }
        if (this.LL == EnumC769180UFg.HORIZONTAL) {
            i2 = c21683719tb.LIZIZ;
        } else {
            i2 = c21683719tb.LIZ;
        }
        if (i2 <= this.LLILLJJLI && i2 >= 1) {
            Rect rectLIZ = c21683519tZLJIIZILJ.LIZ(i, c21683719tb);
            if (C497740JfY.LJJ()) {
                i3 = this.LLILLJJLI - rectLIZ.right;
            } else {
                i3 = rectLIZ.left;
            }
            int i7 = i3 * iLIZIZ;
            if (C497740JfY.LJJ()) {
                i4 = this.LLILLJJLI - rectLIZ.left;
            } else {
                i4 = rectLIZ.right;
            }
            int i8 = i4 * iLIZIZ;
            int i9 = rectLIZ.top * iLIZIZ2;
            int i10 = rectLIZ.bottom * iLIZIZ2;
            Rect rect = new Rect();
            calculateItemDecorationsForChild(viewLJI, rect);
            if (C497740JfY.LJJ()) {
                i5 = (i7 - i8) - rect.left;
                i6 = rect.right;
            } else {
                i5 = (i8 - i7) - rect.left;
                i6 = rect.right;
            }
            int i11 = i5 - i6;
            int i12 = ((i10 - i9) - rect.top) - rect.bottom;
            ViewGroup.LayoutParams layoutParams = viewLJI.getLayoutParams();
            layoutParams.width = i11;
            layoutParams.height = i12;
            measureChildWithMargins(viewLJI, i11, i12);
            this.LLIZ.put(Integer.valueOf(i), new Rect(i7, i9, i8, i10));
            Rect rect2 = (Rect) ((LinkedHashMap) this.LLIZ).get(Integer.valueOf(i));
            if (rect2 != null) {
                int i13 = this.LLILLL;
                int iLJIILLIIL = LJIILLIIL();
                if (this.LL == EnumC769180UFg.VERTICAL) {
                    layoutDecorated(viewLJI, rect2.left + getPaddingLeft(), (rect2.top - i13) + iLJIILLIIL, rect2.right + getPaddingLeft(), (rect2.bottom - i13) + iLJIILLIIL);
                } else {
                    layoutDecorated(viewLJI, (rect2.left - i13) + iLJIILLIIL, rect2.top + getPaddingTop(), (rect2.right - i13) + iLJIILLIIL, rect2.bottom + getPaddingTop());
                }
            }
            if (this.LL == EnumC769180UFg.VERTICAL) {
                decoratedLeft = getDecoratedTop(viewLJI);
            } else {
                decoratedLeft = getDecoratedLeft(viewLJI);
            }
            int iLJIILLIIL2 = decoratedLeft + this.LLILLL + LJIILLIIL();
            if (iLJIILLIIL2 < this.LLILZIL) {
                this.LLILZIL = iLJIILLIIL2;
            }
            int iLIZIZ3 = iLJIILLIIL2 + LJIIZILJ().LIZIZ();
            if (iLIZIZ3 > this.LLILZLL) {
                this.LLILZLL = iLIZIZ3;
            }
            if (enumC992290bvf == EnumC992290bvf.END) {
                addView(viewLJI);
                return;
            } else {
                addView(viewLJI, 0);
                return;
            }
        }
        final int i14 = this.LLILLJJLI;
        throw new RuntimeException(i2, i14) { // from class: X.01Cf
            /* JADX WARN: Illegal instructions before constructor call */
            {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Invalid item span size: ");
                sbLIZ.append(i2);
                sbLIZ.append(". Span size must be in the range: (1...");
                sbLIZ.append(i14);
                sbLIZ.append(')');
                super(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
    }

    public final int scrollBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        boolean z;
        EnumC992290bvf enumC992290bvf;
        if (i == 0) {
            return 0;
        }
        boolean z2 = true;
        if (LJIILJJIL() >= 0 && this.LLILLL > 0 && i < 0) {
            z = true;
        } else {
            z = false;
        }
        if (LJIILJJIL() + getChildCount() > c21673919s1.LIZIZ() || this.LLILLL + LJIJ() >= this.LLILZLL + LJIIZILJ().LIZIZ() + LJIILL()) {
            z2 = false;
        }
        if (!z && !z2) {
            return 0;
        }
        int iLJIJJLI = LJIJJLI(-i, c21673919s1);
        if (i > 0) {
            enumC992290bvf = EnumC992290bvf.END;
        } else {
            enumC992290bvf = EnumC992290bvf.START;
        }
        LJIJJ(enumC992290bvf, c21673319rv);
        if (enumC992290bvf == EnumC992290bvf.END) {
            LJIIL(c21673319rv);
        } else {
            LJIILIIL(c21673319rv);
        }
        return -iLJIJJLI;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        return scrollBy(i, c21673319rv, c21673919s1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        return scrollBy(i, c21673319rv, c21673919s1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
        C2189501Ama c2189501Ama = new C2189501Ama(this, recyclerView.getContext(), 0);
        c2189501Ama.LIZ = i;
        startSmoothScroll(c2189501Ama);
    }
}
