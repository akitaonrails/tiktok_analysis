package androidx.recyclerview.widget;

import X.AbstractC21673619ry;
import X.AbstractC21679819sy;
import X.C21673319rv;
import X.C21673819s0;
import X.C21673919s1;
import X.C21674119s3;
import X.C21675919sL;
import X.C21681319tD;
import X.C21681619tG;
import X.C21681719tH;
import X.C21681819tI;
import X.C21682019tK;
import X.C2188811AlT;
import X.C2189641Amo;
import X.InterfaceC20634915op;
import X.InterfaceC21677219sY;
import Y.ARunnableS118S0100000_18;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class StaggeredGridLayoutManager extends RecyclerView.LayoutManager implements InterfaceC20634915op {
    public C21681319tD[] LLILLJJLI;
    public AbstractC21679819sy LLILLL;
    public AbstractC21679819sy LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public final C21681619tG LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public BitSet LLJI;
    public boolean LLJJ;
    public boolean LLJJI;
    public SavedState LLJJIII;
    public int LLJJIJI;
    public int[] LLJJJJ;
    public int LL = -1;
    public int LLJIJIL = -1;
    public int LLJILJIL = Integer.MIN_VALUE;
    public final LazySpanLookup LLJILJILJ = new LazySpanLookup();
    public int LLJILLL = 2;
    public final Rect LLJJIJIIJIL = new Rect();
    public final C21682019tK LLJJIJIL = new C21682019tK(this);
    public boolean LLJJJ = false;
    public final boolean LLJJJIL = true;
    public final ARunnableS118S0100000_18 LLJJJJJIL = new ARunnableS118S0100000_18(this, 0);

    public static class LazySpanLookup {
        public int[] LIZ;
        public List<FullSpanItem> LIZIZ;

        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new C2189641Amo(10);
            public int LL;
            public int LLILLJJLI;
            public int[] LLILLL;
            public boolean LLILZ;

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FullSpanItem{mPosition=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", mGapDir=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(", mHasUnwantedGapAfter=");
                sbLIZ.append(this.LLILZ);
                sbLIZ.append(", mGapPerSpan=");
                sbLIZ.append(Arrays.toString(this.LLILLL));
                sbLIZ.append('}');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public FullSpanItem() {
            }

            public FullSpanItem(Parcel parcel) {
                this.LL = parcel.readInt();
                this.LLILLJJLI = parcel.readInt();
                this.LLILZ = parcel.readInt() == 1;
                int i = parcel.readInt();
                if (i > 0) {
                    int[] iArr = new int[i];
                    this.LLILLL = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.LL);
                parcel.writeInt(this.LLILLJJLI);
                parcel.writeInt(this.LLILZ ? 1 : 0);
                int[] iArr = this.LLILLL;
                if (iArr != null && iArr.length > 0) {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.LLILLL);
                } else {
                    parcel.writeInt(0);
                }
            }
        }

        public final void LIZIZ() {
            int[] iArr = this.LIZ;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.LIZIZ = null;
        }

        public final void LIZ(FullSpanItem fullSpanItem) {
            if (this.LIZIZ == null) {
                this.LIZIZ = new ArrayList();
            }
            int size = this.LIZIZ.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = (FullSpanItem) ListProtector.get(this.LIZIZ, i);
                if (fullSpanItem2.LL == fullSpanItem.LL) {
                    ListProtector.remove(this.LIZIZ, i);
                }
                if (fullSpanItem2.LL >= fullSpanItem.LL) {
                    ListProtector.add(this.LIZIZ, i, fullSpanItem);
                    return;
                }
            }
            this.LIZIZ.add(fullSpanItem);
        }

        public final void LIZJ(int i) {
            int[] iArr = this.LIZ;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.LIZ = iArr2;
                Arrays.fill(iArr2, -1);
            } else {
                if (i < iArr.length) {
                    return;
                }
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.LIZ = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.LIZ;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public final void LIZLLL(int i) {
            List<FullSpanItem> list = this.LIZIZ;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else if (((FullSpanItem) ListProtector.get(this.LIZIZ, size)).LL >= i) {
                        ListProtector.remove(this.LIZIZ, size);
                    }
                }
            }
            LJI(i);
        }

        public final FullSpanItem LJFF(int i) {
            List<FullSpanItem> list = this.LIZIZ;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) ListProtector.get(this.LIZIZ, size);
                if (fullSpanItem.LL == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public final int LJI(int i) {
            int[] iArr = this.LIZ;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            if (this.LIZIZ != null) {
                FullSpanItem fullSpanItemLJFF = LJFF(i);
                if (fullSpanItemLJFF != null) {
                    this.LIZIZ.remove(fullSpanItemLJFF);
                }
                int size = this.LIZIZ.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    if (((FullSpanItem) ListProtector.get(this.LIZIZ, i2)).LL >= i) {
                        if (i2 != -1) {
                            FullSpanItem fullSpanItem = (FullSpanItem) ListProtector.get(this.LIZIZ, i2);
                            ListProtector.remove(this.LIZIZ, i2);
                            int i3 = fullSpanItem.LL;
                            if (i3 != -1) {
                                int iMin = Math.min(i3 + 1, this.LIZ.length);
                                Arrays.fill(this.LIZ, i, iMin, -1);
                                return iMin;
                            }
                        }
                    } else {
                        i2++;
                    }
                }
            }
            int[] iArr2 = this.LIZ;
            Arrays.fill(iArr2, i, iArr2.length, -1);
            return this.LIZ.length;
        }

        public final void LJII(int i, int i2) {
            int[] iArr = this.LIZ;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                LIZJ(i3);
                int[] iArr2 = this.LIZ;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.LIZ, i, i3, -1);
                List<FullSpanItem> list = this.LIZIZ;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        FullSpanItem fullSpanItem = (FullSpanItem) ListProtector.get(this.LIZIZ, size);
                        int i4 = fullSpanItem.LL;
                        if (i4 >= i) {
                            fullSpanItem.LL = i4 + i2;
                        }
                    }
                }
            }
        }

        public final void LJIIIIZZ(int i, int i2) {
            int[] iArr = this.LIZ;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                LIZJ(i3);
                int[] iArr2 = this.LIZ;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.LIZ;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                List<FullSpanItem> list = this.LIZIZ;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        FullSpanItem fullSpanItem = (FullSpanItem) ListProtector.get(this.LIZIZ, size);
                        int i4 = fullSpanItem.LL;
                        if (i4 >= i) {
                            if (i4 < i3) {
                                ListProtector.remove(this.LIZIZ, size);
                            } else {
                                fullSpanItem.LL = i4 - i2;
                            }
                        }
                    }
                }
            }
        }

        public final FullSpanItem LJ(int i, int i2, int i3) {
            List<FullSpanItem> list = this.LIZIZ;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = (FullSpanItem) ListProtector.get(this.LIZIZ, i4);
                int i5 = fullSpanItem.LL;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || fullSpanItem.LLILLJJLI == i3 || fullSpanItem.LLILZ)) {
                    return fullSpanItem;
                }
            }
            return null;
        }
    }

    public final void LJJIIZ() {
        this.LLJILJILJ.LIZIZ();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.LLILZIL == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.LLILZIL == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.LLILZIL == 0 ? new C21681819tI(-2, -1) : new C21681819tI(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean isAutoMeasureEnabled() {
        return this.LLJILLL != 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final Parcelable onSaveInstanceState() {
        int iLJIIJJI;
        int iLJIIJ;
        int[] iArr;
        if (this.LLJJIII != null) {
            return new SavedState(this.LLJJIII);
        }
        SavedState savedState = new SavedState();
        savedState.LLIZLLLIL = this.LLIZLLLIL;
        savedState.LLJ = this.LLJJ;
        savedState.LLJI = this.LLJJI;
        LazySpanLookup lazySpanLookup = this.LLJILJILJ;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.LIZ) == null) {
            savedState.LLILZIL = 0;
        } else {
            savedState.LLILZLL = iArr;
            savedState.LLILZIL = iArr.length;
            savedState.LLIZ = lazySpanLookup.LIZIZ;
        }
        if (getChildCount() > 0) {
            savedState.LL = this.LLJJ ? LJJI() : LJJ();
            View viewLJIILLIIL = this.LLJ ? LJIILLIIL(true) : LJIIZILJ(true);
            savedState.LLILLJJLI = viewLJIILLIIL != null ? getPosition(viewLJIILLIIL) : -1;
            int i = this.LL;
            savedState.LLILLL = i;
            savedState.LLILZ = new int[i];
            for (int i2 = 0; i2 < this.LL; i2++) {
                if (this.LLJJ) {
                    iLJIIJJI = this.LLILLJJLI[i2].LJIIIIZZ(Integer.MIN_VALUE);
                    if (iLJIIJJI != Integer.MIN_VALUE) {
                        iLJIIJ = this.LLILLL.LJI();
                        iLJIIJJI -= iLJIIJ;
                    }
                } else {
                    iLJIIJJI = this.LLILLJJLI[i2].LJIIJJI(Integer.MIN_VALUE);
                    if (iLJIIJJI != Integer.MIN_VALUE) {
                        iLJIIJ = this.LLILLL.LJIIJ();
                        iLJIIJJI -= iLJIIJ;
                    }
                }
                savedState.LLILZ[i2] = iLJIIJJI;
            }
        } else {
            savedState.LL = -1;
            savedState.LLILLJJLI = -1;
            savedState.LLILLL = 0;
        }
        return savedState;
    }

    public final void resolveShouldLayoutReverse() {
        if (this.LLILZIL == 1 || !isLayoutRTL()) {
            this.LLJ = this.LLIZLLLIL;
        } else {
            this.LLJ = !this.LLIZLLLIL;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return this.LLJJIII == null;
    }

    public final boolean LJIILIIL() {
        int iLJJ;
        int iLJJI;
        if (getChildCount() == 0 || this.LLJILLL == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.LLJ) {
            iLJJ = LJJI();
            iLJJI = LJJ();
        } else {
            iLJJ = LJJ();
            iLJJI = LJJI();
        }
        if (iLJJ == 0 && LJJIIJZLJL() != null) {
            this.LLJILJILJ.LIZIZ();
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        }
        if (!this.LLJJJ) {
            return false;
        }
        int i = this.LLJ ? -1 : 1;
        int i2 = iLJJI + 1;
        LazySpanLookup.FullSpanItem fullSpanItemLJ = this.LLJILJILJ.LJ(iLJJ, i2, i);
        if (fullSpanItemLJ == null) {
            this.LLJJJ = false;
            this.LLJILJILJ.LIZLLL(i2);
            return false;
        }
        LazySpanLookup.FullSpanItem fullSpanItemLJ2 = this.LLJILJILJ.LJ(iLJJ, fullSpanItemLJ.LL, -i);
        if (fullSpanItemLJ2 == null) {
            this.LLJILJILJ.LIZLLL(fullSpanItemLJ.LL);
        } else {
            this.LLJILJILJ.LIZLLL(fullSpanItemLJ2.LL + 1);
        }
        requestSimpleAnimationsInNextLayout();
        requestLayout();
        return true;
    }

    public final int LJJ() {
        if (getChildCount() != 0) {
            return getPosition(getChildAt(0));
        }
        return 0;
    }

    public final int LJJI() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x006d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LJJIIJZLJL() {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.LJJIIJZLJL():android.view.View");
    }

    public final boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2189641Amo(11);
        public int LL;
        public int LLILLJJLI;
        public int LLILLL;
        public int[] LLILZ;
        public int LLILZIL;
        public int[] LLILZLL;
        public List<LazySpanLookup.FullSpanItem> LLIZ;
        public boolean LLIZLLLIL;
        public boolean LLJ;
        public boolean LLJI;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            boolean z;
            boolean z2;
            this.LL = parcel.readInt();
            this.LLILLJJLI = parcel.readInt();
            int i = parcel.readInt();
            this.LLILLL = i;
            if (i > 0) {
                int[] iArr = new int[i];
                this.LLILZ = iArr;
                parcel.readIntArray(iArr);
            }
            int i2 = parcel.readInt();
            this.LLILZIL = i2;
            if (i2 > 0) {
                int[] iArr2 = new int[i2];
                this.LLILZLL = iArr2;
                parcel.readIntArray(iArr2);
            }
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.LLIZLLLIL = z;
            if (parcel.readInt() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.LLJ = z2;
            this.LLJI = parcel.readInt() == 1;
            this.LLIZ = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.LLILLL = savedState.LLILLL;
            this.LL = savedState.LL;
            this.LLILLJJLI = savedState.LLILLJJLI;
            this.LLILZ = savedState.LLILZ;
            this.LLILZIL = savedState.LLILZIL;
            this.LLILZLL = savedState.LLILZLL;
            this.LLIZLLLIL = savedState.LLIZLLLIL;
            this.LLJ = savedState.LLJ;
            this.LLJI = savedState.LLJI;
            this.LLIZ = savedState.LLIZ;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.LL);
            parcel.writeInt(this.LLILLJJLI);
            parcel.writeInt(this.LLILLL);
            if (this.LLILLL > 0) {
                parcel.writeIntArray(this.LLILZ);
            }
            parcel.writeInt(this.LLILZIL);
            if (this.LLILZIL > 0) {
                parcel.writeIntArray(this.LLILZLL);
            }
            parcel.writeInt(this.LLIZLLLIL ? 1 : 0);
            parcel.writeInt(this.LLJ ? 1 : 0);
            parcel.writeInt(this.LLJI ? 1 : 0);
            parcel.writeList(this.LLIZ);
        }
    }

    public int LJJIII() {
        return this.LL;
    }

    public final int LJIIL(int i) {
        boolean z;
        if (getChildCount() == 0) {
            if (!this.LLJ) {
                return -1;
            }
            return 1;
        }
        if (i < LJJ()) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.LLJ) {
            return -1;
        }
        return 1;
    }

    public final int[] LJIILL(int[] iArr) {
        int iLJII;
        if (iArr == null) {
            iArr = new int[this.LL];
        } else if (iArr.length < this.LL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Provided int[]'s size must be more than or equal to span count. Expected:");
            sbLIZ.append(this.LL);
            sbLIZ.append(", array size:");
            sbLIZ.append(iArr.length);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        for (int i = 0; i < this.LL; i++) {
            C21681319tD c21681319tD = this.LLILLJJLI[i];
            if (c21681319tD.LJFF.LLIZLLLIL) {
                iLJII = c21681319tD.LJII(c21681319tD.LIZ.size() - 1, -1, true);
            } else {
                iLJII = c21681319tD.LJII(0, c21681319tD.LIZ.size(), true);
            }
            iArr[i] = iLJII;
        }
        return iArr;
    }

    public final View LJIILLIIL(boolean z) {
        int iLJIIJ = this.LLILLL.LJIIJ();
        int iLJI = this.LLILLL.LJI();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int iLJ = this.LLILLL.LJ(childAt);
            int iLIZIZ = this.LLILLL.LIZIZ(childAt);
            if (iLIZIZ > iLJIIJ && iLJ < iLJI) {
                if (iLIZIZ > iLJI && z) {
                    if (view == null) {
                        view = childAt;
                    }
                } else {
                    return childAt;
                }
            }
        }
        return view;
    }

    public final View LJIIZILJ(boolean z) {
        int iLJIIJ = this.LLILLL.LJIIJ();
        int iLJI = this.LLILLL.LJI();
        int childCount = getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int iLJ = this.LLILLL.LJ(childAt);
            if (this.LLILLL.LIZIZ(childAt) > iLJIIJ && iLJ < iLJI) {
                if (iLJ < iLJIIJ && z) {
                    if (view == null) {
                        view = childAt;
                    }
                } else {
                    return childAt;
                }
            }
        }
        return view;
    }

    public final int[] LJIJ(int[] iArr) {
        int iLJII;
        if (iArr == null) {
            iArr = new int[this.LL];
        } else if (iArr.length < this.LL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Provided int[]'s size must be more than or equal to span count. Expected:");
            sbLIZ.append(this.LL);
            sbLIZ.append(", array size:");
            sbLIZ.append(iArr.length);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        for (int i = 0; i < this.LL; i++) {
            C21681319tD c21681319tD = this.LLILLJJLI[i];
            if (c21681319tD.LJFF.LLIZLLLIL) {
                iLJII = c21681319tD.LJII(c21681319tD.LIZ.size() - 1, -1, false);
            } else {
                iLJII = c21681319tD.LJII(0, c21681319tD.LIZ.size(), false);
            }
            iArr[i] = iLJII;
        }
        return iArr;
    }

    public final int[] LJIJI(int[] iArr) {
        int iLJII;
        if (iArr == null) {
            iArr = new int[this.LL];
        } else if (iArr.length < this.LL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Provided int[]'s size must be more than or equal to span count. Expected:");
            sbLIZ.append(this.LL);
            sbLIZ.append(", array size:");
            sbLIZ.append(iArr.length);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        for (int i = 0; i < this.LL; i++) {
            C21681319tD c21681319tD = this.LLILLJJLI[i];
            if (c21681319tD.LJFF.LLIZLLLIL) {
                iLJII = c21681319tD.LJII(0, c21681319tD.LIZ.size(), true);
            } else {
                iLJII = c21681319tD.LJII(c21681319tD.LIZ.size() - 1, -1, true);
            }
            iArr[i] = iLJII;
        }
        return iArr;
    }

    public final int[] LJIJJ(int[] iArr) {
        int iLJII;
        if (iArr == null) {
            iArr = new int[this.LL];
        } else if (iArr.length < this.LL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Provided int[]'s size must be more than or equal to span count. Expected:");
            sbLIZ.append(this.LL);
            sbLIZ.append(", array size:");
            sbLIZ.append(iArr.length);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        for (int i = 0; i < this.LL; i++) {
            C21681319tD c21681319tD = this.LLILLJJLI[i];
            if (c21681319tD.LJFF.LLIZLLLIL) {
                iLJII = c21681319tD.LJII(0, c21681319tD.LIZ.size(), false);
            } else {
                iLJII = c21681319tD.LJII(c21681319tD.LIZ.size() - 1, -1, false);
            }
            iArr[i] = iLJII;
        }
        return iArr;
    }

    public final int LJJIFFI(int i) {
        int iLJIIIIZZ = this.LLILLJJLI[0].LJIIIIZZ(i);
        for (int i2 = 1; i2 < this.LL; i2++) {
            int iLJIIIIZZ2 = this.LLILLJJLI[i2].LJIIIIZZ(i);
            if (iLJIIIIZZ2 > iLJIIIIZZ) {
                iLJIIIIZZ = iLJIIIIZZ2;
            }
        }
        return iLJIIIIZZ;
    }

    public final int LJJII(int i) {
        int iLJIIJJI = this.LLILLJJLI[0].LJIIJJI(i);
        for (int i2 = 1; i2 < this.LL; i2++) {
            int iLJIIJJI2 = this.LLILLJJLI[i2].LJIIJJI(i);
            if (iLJIIJJI2 < iLJIIJJI) {
                iLJIIJJI = iLJIIJJI2;
            }
        }
        return iLJIIJJI;
    }

    public final boolean LJJIJIIJI(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.LLILZIL == 0) {
            if (i == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 != this.LLJ) {
                return true;
            }
            return false;
        }
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z == this.LLJ) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 == isLayoutRTL()) {
            return true;
        }
        return false;
    }

    public final void LJJIL(int i) {
        assertNotInLayoutOrScroll(null);
        if (i == this.LLJILLL) {
            return;
        }
        if (i != 0 && i != 2) {
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
        this.LLJILLL = i;
        requestLayout();
    }

    public final void LJJIZ(int i) {
        boolean z;
        C21681619tG c21681619tG = this.LLIZ;
        c21681619tG.LJ = i;
        boolean z2 = this.LLJ;
        int i2 = 1;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z2 != z) {
            i2 = -1;
        }
        c21681619tG.LIZLLL = i2;
    }

    public final void LJJJ(int i) {
        assertNotInLayoutOrScroll(null);
        if (i != this.LL) {
            LJJIIZ();
            this.LL = i;
            this.LLJI = new BitSet(this.LL);
            this.LLILLJJLI = new C21681319tD[this.LL];
            for (int i2 = 0; i2 < this.LL; i2++) {
                this.LLILLJJLI[i2] = new C21681319tD(this, i2);
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void assertNotInLayoutOrScroll(String str) {
        if (this.LLJJIII == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof C21681819tI;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollExtent(C21673919s1 c21673919s1) {
        return computeScrollExtent(c21673919s1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollOffset(C21673919s1 c21673919s1) {
        return computeScrollOffset(c21673919s1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollRange(C21673919s1 c21673919s1) {
        return computeScrollRange(c21673919s1);
    }

    public final int computeScrollExtent(C21673919s1 c21673919s1) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C21681719tH.LIZ(c21673919s1, this.LLILLL, LJIIZILJ(!this.LLJJJIL), LJIILLIIL(!this.LLJJJIL), this, this.LLJJJIL);
    }

    public final int computeScrollOffset(C21673919s1 c21673919s1) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C21681719tH.LIZIZ(c21673919s1, this.LLILLL, LJIIZILJ(!this.LLJJJIL), LJIILLIIL(!this.LLJJJIL), this, this.LLJJJIL, this.LLJ);
    }

    public final int computeScrollRange(C21673919s1 c21673919s1) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C21681719tH.LIZJ(c21673919s1, this.LLILLL, LJIIZILJ(!this.LLJJJIL), LJIILLIIL(!this.LLJJJIL), this, this.LLJJJIL);
    }

    @Override // X.InterfaceC20634915op
    public final PointF computeScrollVectorForPosition(int i) {
        int iLJIIL = LJIIL(i);
        PointF pointF = new PointF();
        if (iLJIIL == 0) {
            return null;
        }
        if (this.LLILZIL == 0) {
            pointF.x = iLJIIL;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = iLJIIL;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollExtent(C21673919s1 c21673919s1) {
        return computeScrollExtent(c21673919s1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollOffset(C21673919s1 c21673919s1) {
        return computeScrollOffset(c21673919s1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollRange(C21673919s1 c21673919s1) {
        return computeScrollRange(c21673919s1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C21681819tI((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C21681819tI(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i2 = 0; i2 < this.LL; i2++) {
            C21681319tD c21681319tD = this.LLILLJJLI[i2];
            int i3 = c21681319tD.LIZIZ;
            if (i3 != Integer.MIN_VALUE) {
                c21681319tD.LIZIZ = i3 + i;
            }
            int i4 = c21681319tD.LIZJ;
            if (i4 != Integer.MIN_VALUE) {
                c21681319tD.LIZJ = i4 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i2 = 0; i2 < this.LL; i2++) {
            C21681319tD c21681319tD = this.LLILLJJLI[i2];
            int i3 = c21681319tD.LIZIZ;
            if (i3 != Integer.MIN_VALUE) {
                c21681319tD.LIZIZ = i3 + i;
            }
            int i4 = c21681319tD.LIZJ;
            if (i4 != Integer.MIN_VALUE) {
                c21681319tD.LIZJ = i4 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View viewLJIIZILJ = LJIIZILJ(false);
            View viewLJIILLIIL = LJIILLIIL(false);
            if (viewLJIIZILJ != null && viewLJIILLIIL != null) {
                int position = getPosition(viewLJIIZILJ);
                int position2 = getPosition(viewLJIILLIIL);
                if (position < position2) {
                    accessibilityEvent.setFromIndex(position);
                    accessibilityEvent.setToIndex(position2);
                } else {
                    accessibilityEvent.setFromIndex(position2);
                    accessibilityEvent.setToIndex(position);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.LLJILJILJ.LIZIZ();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(C21673919s1 c21673919s1) {
        super.onLayoutCompleted(c21673919s1);
        this.LLJIJIL = -1;
        this.LLJILJIL = Integer.MIN_VALUE;
        this.LLJJIII = null;
        this.LLJJIJIL.LIZ();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.LLJJIII = savedState;
            if (this.LLJIJIL != -1) {
                savedState.LLILZ = null;
                savedState.LLILLL = 0;
                savedState.LL = -1;
                savedState.LLILLJJLI = -1;
                savedState.LLILZ = null;
                savedState.LLILLL = 0;
                savedState.LLILZIL = 0;
                savedState.LLILZLL = null;
                savedState.LLIZ = null;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i) {
        if (i == 0) {
            LJIILIIL();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void scrollToPosition(int i) {
        SavedState savedState = this.LLJJIII;
        if (savedState != null && savedState.LL != i) {
            savedState.LLILZ = null;
            savedState.LLILLL = 0;
            savedState.LL = -1;
            savedState.LLILLJJLI = -1;
        }
        this.LLJIJIL = i;
        this.LLJILJIL = Integer.MIN_VALUE;
        requestLayout();
    }

    public final void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i == this.LLILZIL) {
            return;
        }
        this.LLILZIL = i;
        AbstractC21679819sy abstractC21679819sy = this.LLILLL;
        this.LLILLL = this.LLILZ;
        this.LLILZ = abstractC21679819sy;
        requestLayout();
    }

    public final void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        SavedState savedState = this.LLJJIII;
        if (savedState != null && savedState.LLIZLLLIL != z) {
            savedState.LLIZLLLIL = z;
        }
        this.LLIZLLLIL = z;
        requestLayout();
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.LLILZIL = i2;
        LJJJ(i);
        this.LLIZ = new C21681619tG();
        this.LLILLL = AbstractC21679819sy.LIZ(this.LLILZIL, this);
        this.LLILZ = AbstractC21679819sy.LIZ(1 - this.LLILZIL, this);
    }

    public final void LJJIJIIJIL(int i, C21673919s1 c21673919s1) {
        int iLJJ;
        int i2;
        if (i > 0) {
            iLJJ = LJJI();
            i2 = 1;
        } else {
            iLJJ = LJJ();
            i2 = -1;
        }
        this.LLIZ.LIZ = true;
        LJJJIL(iLJJ, c21673919s1);
        LJJIZ(i2);
        C21681619tG c21681619tG = this.LLIZ;
        c21681619tG.LIZJ = iLJJ + c21681619tG.LIZLLL;
        c21681619tG.LIZIZ = Math.abs(i);
    }

    public final void LJJIJIL(C21673319rv c21673319rv, C21681619tG c21681619tG) {
        int iMin;
        int iMin2;
        if (c21681619tG.LIZ && !c21681619tG.LJIIIIZZ) {
            if (c21681619tG.LIZIZ == 0) {
                if (c21681619tG.LJ == -1) {
                    LJJIJL(c21681619tG.LJI, c21673319rv);
                    return;
                } else {
                    LJJIJLIJ(c21681619tG.LJFF, c21673319rv);
                    return;
                }
            }
            int i = 1;
            if (c21681619tG.LJ == -1) {
                int i2 = c21681619tG.LJFF;
                int iLJIIJJI = this.LLILLJJLI[0].LJIIJJI(i2);
                while (i < this.LL) {
                    int iLJIIJJI2 = this.LLILLJJLI[i].LJIIJJI(i2);
                    if (iLJIIJJI2 > iLJIIJJI) {
                        iLJIIJJI = iLJIIJJI2;
                    }
                    i++;
                }
                int i3 = i2 - iLJIIJJI;
                if (i3 < 0) {
                    iMin2 = c21681619tG.LJI;
                } else {
                    iMin2 = c21681619tG.LJI - Math.min(i3, c21681619tG.LIZIZ);
                }
                LJJIJL(iMin2, c21673319rv);
                return;
            }
            int i4 = c21681619tG.LJI;
            int iLJIIIIZZ = this.LLILLJJLI[0].LJIIIIZZ(i4);
            while (i < this.LL) {
                int iLJIIIIZZ2 = this.LLILLJJLI[i].LJIIIIZZ(i4);
                if (iLJIIIIZZ2 < iLJIIIIZZ) {
                    iLJIIIIZZ = iLJIIIIZZ2;
                }
                i++;
            }
            int i5 = iLJIIIIZZ - c21681619tG.LJI;
            if (i5 < 0) {
                iMin = c21681619tG.LJFF;
            } else {
                iMin = Math.min(i5, c21681619tG.LIZIZ) + c21681619tG.LJFF;
            }
            LJJIJLIJ(iMin, c21673319rv);
        }
    }

    public final void LJJIJL(int i, C21673319rv c21673319rv) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.LLILLL.LJ(childAt) >= i && this.LLILLL.LJIILJJIL(childAt) >= i) {
                C21681819tI c21681819tI = (C21681819tI) childAt.getLayoutParams();
                if (c21681819tI.LLILLJJLI) {
                    for (int i2 = 0; i2 < this.LL; i2++) {
                        if (this.LLILLJJLI[i2].LIZ.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.LL; i3++) {
                        this.LLILLJJLI[i3].LJIIL();
                    }
                } else if (c21681819tI.LL.LIZ.size() == 1) {
                    return;
                } else {
                    c21681819tI.LL.LJIIL();
                }
                removeAndRecycleView(childAt, c21673319rv);
            } else {
                return;
            }
        }
    }

    public final void LJJIJLIJ(int i, C21673319rv c21673319rv) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.LLILLL.LIZIZ(childAt) <= i && this.LLILLL.LJIILIIL(childAt) <= i) {
                C21681819tI c21681819tI = (C21681819tI) childAt.getLayoutParams();
                if (c21681819tI.LLILLJJLI) {
                    for (int i2 = 0; i2 < this.LL; i2++) {
                        if (this.LLILLJJLI[i2].LIZ.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.LL; i3++) {
                        this.LLILLJJLI[i3].LJIILIIL();
                    }
                } else if (c21681819tI.LL.LIZ.size() == 1) {
                    return;
                } else {
                    c21681819tI.LL.LJIILIIL();
                }
                removeAndRecycleView(childAt, c21673319rv);
            } else {
                return;
            }
        }
    }

    public final void LJJJI(int i, int i2) {
        for (int i3 = 0; i3 < this.LL; i3++) {
            if (!this.LLILLJJLI[i3].LIZ.isEmpty()) {
                LJJJJ(this.LLILLJJLI[i3], i, i2);
            }
        }
    }

    public final void LJJJIL(int i, C21673919s1 c21673919s1) {
        int iLJIIJJI;
        int iLJIIJJI2;
        int i2;
        boolean z;
        C21681619tG c21681619tG = this.LLIZ;
        boolean z2 = false;
        c21681619tG.LIZIZ = 0;
        c21681619tG.LIZJ = i;
        if (isSmoothScrolling() && (i2 = c21673919s1.LIZ) != -1) {
            boolean z3 = this.LLJ;
            if (i2 < i) {
                z = true;
            } else {
                z = false;
            }
            if (z3 == z) {
                iLJIIJJI = this.LLILLL.LJIIJJI();
                iLJIIJJI2 = 0;
            } else {
                iLJIIJJI2 = this.LLILLL.LJIIJJI();
                iLJIIJJI = 0;
            }
        } else {
            iLJIIJJI = 0;
            iLJIIJJI2 = 0;
        }
        if (getClipToPadding()) {
            this.LLIZ.LJFF = this.LLILLL.LJIIJ() - iLJIIJJI2;
            this.LLIZ.LJI = this.LLILLL.LJI() + iLJIIJJI;
        } else {
            this.LLIZ.LJI = this.LLILLL.LJFF() + iLJIIJJI;
            this.LLIZ.LJFF = -iLJIIJJI2;
        }
        C21681619tG c21681619tG2 = this.LLIZ;
        c21681619tG2.LJII = false;
        c21681619tG2.LIZ = true;
        if (this.LLILLL.LJIIIIZZ() == 0 && this.LLILLL.LJFF() == 0) {
            z2 = true;
        }
        c21681619tG2.LJIIIIZZ = z2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C21681819tI(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(AbstractC21673619ry abstractC21673619ry, AbstractC21673619ry abstractC21673619ry2) {
        this.LLJILJILJ.LIZIZ();
        for (int i = 0; i < this.LL; i++) {
            this.LLILLJJLI[i].LIZLLL();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, C21673319rv c21673319rv) {
        super.onDetachedFromWindow(recyclerView, c21673319rv);
        removeCallbacks(this.LLJJJJJIL);
        for (int i = 0; i < this.LL; i++) {
            this.LLILLJJLI[i].LIZLLL();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        LJJIJ(c21673319rv, c21673919s1, true);
    }

    public final void scrollToPositionWithOffset(int i, int i2) {
        SavedState savedState = this.LLJJIII;
        if (savedState != null) {
            savedState.LLILZ = null;
            savedState.LLILLL = 0;
            savedState.LL = -1;
            savedState.LLILLJJLI = -1;
        }
        this.LLJIJIL = i;
        this.LLJILJIL = i2;
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJIILJJIL(X.C21673319rv r27, X.C21681619tG r28, X.C21673919s1 r29) {
        /*
            Method dump skipped, instruction units count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.LJIILJJIL(X.19rv, X.19tG, X.19s1):int");
    }

    public final void LJIJJLI(C21673319rv c21673319rv, C21673919s1 c21673919s1, boolean z) {
        int iLJI;
        int iLJJIFFI = LJJIFFI(Integer.MIN_VALUE);
        if (iLJJIFFI != Integer.MIN_VALUE && (iLJI = this.LLILLL.LJI() - iLJJIFFI) > 0) {
            int i = iLJI - (-scrollBy(-iLJI, c21673319rv, c21673919s1));
            if (z && i > 0) {
                this.LLILLL.LJIILL(i);
            }
        }
    }

    public final void LJIL(C21673319rv c21673319rv, C21673919s1 c21673919s1, boolean z) {
        int iLJIIJ;
        int iLJJII = LJJII(Integer.MAX_VALUE);
        if (iLJJII != Integer.MAX_VALUE && (iLJIIJ = iLJJII - this.LLILLL.LJIIJ()) > 0) {
            int iScrollBy = iLJIIJ - scrollBy(iLJIIJ, c21673319rv, c21673919s1);
            if (z && iScrollBy > 0) {
                this.LLILLL.LJIILL(-iScrollBy);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJ(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.LLJ
            if (r0 == 0) goto L3e
            int r5 = r6.LJJI()
        L8:
            r4 = 8
            if (r9 != r4) goto L3b
            if (r7 >= r8) goto L37
            int r3 = r8 + 1
        L10:
            r2 = r7
        L11:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r6.LLJILJILJ
            r0.LJI(r2)
            r1 = 1
            if (r9 == r1) goto L31
            r0 = 2
            if (r9 == r0) goto L2b
            if (r9 != r4) goto L28
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r6.LLJILJILJ
            r0.LJIIIIZZ(r7, r1)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r6.LLJILJILJ
            r0.LJII(r8, r1)
        L28:
            if (r3 > r5) goto L43
            return
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r6.LLJILJILJ
            r0.LJIIIIZZ(r7, r8)
            goto L28
        L31:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r0 = r6.LLJILJILJ
            r0.LJII(r7, r8)
            goto L28
        L37:
            int r3 = r7 + 1
            r2 = r8
            goto L11
        L3b:
            int r3 = r7 + r8
            goto L10
        L3e:
            int r5 = r6.LJJ()
            goto L8
        L43:
            boolean r0 = r6.LLJ
            if (r0 == 0) goto L51
            int r0 = r6.LJJ()
        L4b:
            if (r2 > r0) goto L50
            r6.requestLayout()
        L50:
            return
        L51:
            int r0 = r6.LJJI()
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.LJJIIJ(int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0425  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJ(X.C21673319rv r12, X.C21673919s1 r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 1070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.LJJIJ(X.19rv, X.19s1, boolean):void");
    }

    public final void LJJJJ(C21681319tD c21681319tD, int i, int i2) {
        int i3 = c21681319tD.LIZLLL;
        if (i == -1) {
            int i4 = c21681319tD.LIZIZ;
            if (i4 == Integer.MIN_VALUE) {
                c21681319tD.LIZJ();
                i4 = c21681319tD.LIZIZ;
            }
            if (i4 + i3 <= i2) {
                this.LLJI.set(c21681319tD.LJ, false);
                return;
            }
            return;
        }
        int i5 = c21681319tD.LIZJ;
        if (i5 == Integer.MIN_VALUE) {
            c21681319tD.LIZIZ();
            i5 = c21681319tD.LIZJ;
        }
        if (i5 - i3 < i2) {
            return;
        }
        this.LLJI.set(c21681319tD.LJ, false);
    }

    public final int LJJJJI(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        LJJIIJ(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        LJJIIJ(i, i2, 2);
    }

    public final int scrollBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        LJJIJIIJIL(i, c21673919s1);
        int iLJIILJJIL = LJIILJJIL(c21673319rv, this.LLIZ, c21673919s1);
        if (this.LLIZ.LIZIZ >= iLJIILJJIL) {
            if (i < 0) {
                i = -iLJIILJJIL;
            } else {
                i = iLJIILJJIL;
            }
        }
        this.LLILLL.LJIILL(-i);
        this.LLJJ = this.LLJ;
        C21681619tG c21681619tG = this.LLIZ;
        c21681619tG.LIZIZ = 0;
        LJJIJIL(c21673319rv, c21681619tG);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        return scrollBy(i, c21673319rv, c21673919s1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        return scrollBy(i, c21673319rv, c21673919s1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void setMeasuredDimension(Rect rect, int i, int i2) {
        int iChooseSize;
        int iChooseSize2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.LLILZIL == 1) {
            iChooseSize2 = RecyclerView.LayoutManager.chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            iChooseSize = RecyclerView.LayoutManager.chooseSize(i, (this.LLILZLL * this.LL) + paddingLeft, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.LayoutManager.chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            iChooseSize2 = RecyclerView.LayoutManager.chooseSize(i2, (this.LLILZLL * this.LL) + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
        C21674119s3 c21674119s3 = new C21674119s3(recyclerView.getContext());
        c21674119s3.LIZ = i;
        startSmoothScroll(c21674119s3);
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        C21675919sL properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i, i2);
        setOrientation(properties.LIZ);
        LJJJ(properties.LIZIZ);
        setReverseLayout(properties.LIZJ);
        this.LLIZ = new C21681619tG();
        this.LLILLL = AbstractC21679819sy.LIZ(this.LLILZIL, this);
        this.LLILZ = AbstractC21679819sy.LIZ(1 - this.LLILZIL, this);
    }

    public final void LJJIIZI(View view, int i, int i2, boolean z) {
        calculateItemDecorationsForChild(view, this.LLJJIJIIJIL);
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        Rect rect = this.LLJJIJIIJIL;
        int iLJJJJI = LJJJJI(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        Rect rect2 = this.LLJJIJIIJIL;
        int iLJJJJI2 = LJJJJI(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + rect2.bottom);
        if (shouldMeasureChild(view, iLJJJJI, iLJJJJI2, layoutParams)) {
            view.measure(iLJJJJI, iLJJJJI2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void collectAdjacentPrefetchPositions(int i, int i2, C21673919s1 c21673919s1, InterfaceC21677219sY interfaceC21677219sY) {
        int iLJIIIIZZ;
        int iLJIIJJI;
        if (this.LLILZIL != 0) {
            i = i2;
        }
        if (getChildCount() != 0 && i != 0) {
            LJJIJIIJIL(i, c21673919s1);
            int[] iArr = this.LLJJJJ;
            if (iArr == null || iArr.length < this.LL) {
                this.LLJJJJ = new int[this.LL];
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.LL; i4++) {
                C21681619tG c21681619tG = this.LLIZ;
                if (c21681619tG.LIZLLL == -1) {
                    iLJIIIIZZ = c21681619tG.LJFF;
                    iLJIIJJI = this.LLILLJJLI[i4].LJIIJJI(iLJIIIIZZ);
                } else {
                    iLJIIIIZZ = this.LLILLJJLI[i4].LJIIIIZZ(c21681619tG.LJI);
                    iLJIIJJI = this.LLIZ.LJI;
                }
                int i5 = iLJIIIIZZ - iLJIIJJI;
                if (i5 >= 0) {
                    this.LLJJJJ[i3] = i5;
                    i3++;
                }
            }
            Arrays.sort(this.LLJJJJ, 0, i3);
            for (int i6 = 0; i6 < i3; i6++) {
                int i7 = this.LLIZ.LIZJ;
                if (i7 >= 0 && i7 < c21673919s1.LIZIZ()) {
                    ((C21673819s0) interfaceC21677219sY).LIZ(this.LLIZ.LIZJ, this.LLJJJJ[i6]);
                    C21681619tG c21681619tG2 = this.LLIZ;
                    c21681619tG2.LIZJ += c21681619tG2.LIZLLL;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        if (r11.LLILZIL == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0099, code lost:
    
        if (r11.LLILZIL == 1) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009b  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onFocusSearchFailed(android.view.View r12, int r13, X.C21673319rv r14, X.C21673919s1 r15) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.onFocusSearchFailed(android.view.View, int, X.19rv, X.19s1):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        LJJIIJ(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        LJJIIJ(i, i2, 4);
    }
}
