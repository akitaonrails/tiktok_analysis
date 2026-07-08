package X;

import Y.ARunnableS132S0100000_32;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.layout.core.PowerLayoutManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.19tv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21685719tv extends AbstractC21685919tx {
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public boolean LJIJ;
    public C21686219u0[] LJIJI;
    public BitSet LJIJJ;
    public final C21686819u6 LJIJJLI;
    public final List<View> LJIL;
    public WeakReference<PowerLayoutManager> LJJ;

    public C21685719tv() {
        this(1, 0);
    }

    public final void LJJ() {
        PowerLayoutManager powerLayoutManager;
        int iFindFirstVisibleItemPosition;
        int iFindLastCompletelyVisibleItemPosition;
        int iIntValue;
        int position;
        int iLIZIZ;
        int i;
        boolean z;
        Object obj;
        WeakReference<PowerLayoutManager> weakReference = this.LJJ;
        if (weakReference == null || (powerLayoutManager = weakReference.get()) == null || powerLayoutManager.getChildCount() == 0) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Layout information: Number of subviews=");
        sbLIZ.append(powerLayoutManager.getChildCount());
        sbLIZ.append(", isReverse=");
        sbLIZ.append(powerLayoutManager.getReverseLayout());
        sbLIZ.append(", column=");
        sbLIZ.append(this.LJIIJJI);
        C2188811AlT.LIZIZ(sbLIZ);
        C136N<Integer> c136n = this.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Current view range: Lower limit=");
        sbLIZ2.append(c136n.LIZ);
        sbLIZ2.append(", Upper limit=");
        sbLIZ2.append(c136n.LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (powerLayoutManager.getReverseLayout()) {
            iFindFirstVisibleItemPosition = powerLayoutManager.findLastVisibleItemPosition();
            iFindLastCompletelyVisibleItemPosition = powerLayoutManager.findFirstVisibleItemPosition();
            iIntValue = ((Integer) c136n.LIZIZ).intValue() - 1;
        } else {
            iFindFirstVisibleItemPosition = powerLayoutManager.findFirstVisibleItemPosition();
            iFindLastCompletelyVisibleItemPosition = powerLayoutManager.findLastCompletelyVisibleItemPosition();
            iIntValue = ((Integer) c136n.LIZ).intValue();
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Alignment information: minimum position=");
        sbLIZ3.append(iFindFirstVisibleItemPosition);
        sbLIZ3.append(", maximum position=");
        sbLIZ3.append(iFindLastCompletelyVisibleItemPosition);
        sbLIZ3.append(", align position=");
        sbLIZ3.append(iIntValue);
        C2188811AlT.LIZIZ(sbLIZ3);
        AbstractC21686519u3 abstractC21686519u3 = powerLayoutManager.LLILLJJLI;
        int childCount = powerLayoutManager.getChildCount();
        if (powerLayoutManager.getReverseLayout()) {
            int i2 = childCount - 1;
            for (int i3 = i2; i3 >= 0; i3--) {
                View childAt = powerLayoutManager.getChildAt(i3);
                if (childAt != null && (position = powerLayoutManager.getPosition(childAt)) == iIntValue) {
                    if (i3 == i2) {
                        iLIZIZ = abstractC21686519u3.LIZIZ(childAt);
                    } else {
                        View childAt2 = powerLayoutManager.getChildAt(i3 + 1);
                        iLIZIZ = childAt2 == null ? Integer.MIN_VALUE : powerLayoutManager.getPosition(childAt2) == position + (-1) ? powerLayoutManager.LJIJJ(childAt, true, true) + (abstractC21686519u3.LJ(childAt2) - powerLayoutManager.LJIJJ(childAt2, false, true)) : abstractC21686519u3.LIZIZ(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt3 = powerLayoutManager.getChildAt(i4);
            if (childAt3 != null) {
                position = powerLayoutManager.getPosition(childAt3);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("Check view: index=");
                sbLIZ4.append(i4);
                sbLIZ4.append(", position=");
                sbLIZ4.append(position);
                sbLIZ4.append(", start position=");
                sbLIZ4.append(abstractC21686519u3.LJ(childAt3));
                sbLIZ4.append(", end position=");
                sbLIZ4.append(abstractC21686519u3.LIZIZ(childAt3));
                C2188811AlT.LIZIZ(sbLIZ4);
                if (position == iIntValue) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("Find the reference view: posiiton=");
                    sbLIZ5.append(position);
                    sbLIZ5.append(", start position=");
                    sbLIZ5.append(abstractC21686519u3.LJ(childAt3));
                    sbLIZ5.append(", end position=");
                    sbLIZ5.append(abstractC21686519u3.LIZIZ(childAt3));
                    C2188811AlT.LIZIZ(sbLIZ5);
                    if (i4 == 0) {
                        iLIZIZ = abstractC21686519u3.LJ(childAt3);
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("For the first subview as a reference, align the line =");
                        sbLIZ6.append(iLIZIZ);
                        C2188811AlT.LIZIZ(sbLIZ6);
                    } else {
                        View childAt4 = powerLayoutManager.getChildAt(i4 - 1);
                        int iLIZIZ2 = abstractC21686519u3.LIZIZ(childAt4);
                        int iLJIJJ = powerLayoutManager.LJIJJ(childAt4, true, false);
                        int iLJIJJ2 = powerLayoutManager.LJIJJ(childAt3, false, false);
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("Calculate alignment lines: End of previous view=");
                        sbLIZ7.append(iLIZIZ2);
                        sbLIZ7.append(", Extra margin 1=");
                        sbLIZ7.append(iLJIJJ);
                        sbLIZ7.append(", Extra margin 2=");
                        sbLIZ7.append(iLJIJJ2);
                        C2188811AlT.LIZIZ(sbLIZ7);
                        iLIZIZ = (abstractC21686519u3.LIZIZ(childAt4) + powerLayoutManager.LJIJJ(childAt4, true, false)) - powerLayoutManager.LJIJJ(childAt3, false, false);
                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                        sbLIZ8.append("The alignment line is calculated=");
                        sbLIZ8.append(iLIZIZ);
                        C2188811AlT.LIZIZ(sbLIZ8);
                        int iLJ = abstractC21686519u3.LJ(childAt3);
                        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                        sbLIZ9.append("Current view start=");
                        sbLIZ9.append(iLJ);
                        C2188811AlT.LIZIZ(sbLIZ9);
                        if (iLIZIZ == iLJ) {
                            return;
                        }
                        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                        sbLIZ10.append("There is a potential gap: the alignment line is different from the start of the view, the difference=");
                        sbLIZ10.append(iLIZIZ - iLJ);
                        C2188811AlT.LIZIZ(sbLIZ10);
                        if (childAt4 != null && powerLayoutManager.getPosition(childAt4) != (i = iIntValue - 1)) {
                            powerLayoutManager.LLJJI.LIZ(i);
                        }
                    }
                }
            }
        }
        return;
        if (position != Integer.MIN_VALUE) {
            StringBuilder sbLIZ11 = C2188811AlT.LIZ();
            sbLIZ11.append("Start detecting gaps: reference position=");
            sbLIZ11.append(position);
            sbLIZ11.append(", alignLine=");
            sbLIZ11.append(iLIZIZ);
            C2188811AlT.LIZIZ(sbLIZ11);
            if (powerLayoutManager.findViewByPosition(position) != null) {
                new BitSet(this.LJIIJJI).set(0, this.LJIIJJI, true);
                C21686219u0[] c21686219u0Arr = this.LJIJI;
                if (c21686219u0Arr != null) {
                    for (C21686219u0 c21686219u0 : c21686219u0Arr) {
                        if (!c21686219u0.LIZ.isEmpty()) {
                            AbstractC21686519u3 abstractC21686519u32 = powerLayoutManager.LLILLJJLI;
                            if (powerLayoutManager.getReverseLayout()) {
                                int iLIZIZ3 = c21686219u0.LIZIZ(Integer.MIN_VALUE, abstractC21686519u32);
                                z = iLIZIZ3 != iLIZIZ;
                                boolean z2 = iLIZIZ3 < iLIZIZ;
                                if (z2 != z) {
                                    StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                                    sbLIZ12.append("[Reverse] hasGap:");
                                    sbLIZ12.append(z);
                                    sbLIZ12.append(" old:");
                                    sbLIZ12.append(z2);
                                    C2188811AlT.LIZIZ(sbLIZ12);
                                }
                            } else {
                                int iLIZJ = c21686219u0.LIZJ(Integer.MIN_VALUE, abstractC21686519u32);
                                z = iLIZJ != iLIZIZ;
                                boolean z3 = iLIZJ > iLIZIZ;
                                if (z3 != z) {
                                    StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                                    sbLIZ13.append("hasGap:");
                                    sbLIZ13.append(z);
                                    sbLIZ13.append(" old:");
                                    sbLIZ13.append(z3);
                                    C2188811AlT.LIZIZ(sbLIZ13);
                                }
                            }
                            if (z) {
                                if (powerLayoutManager.getReverseLayout()) {
                                    ArrayList<View> arrayList = c21686219u0.LIZ;
                                    obj = ListProtector.get(arrayList, arrayList.size() - 1);
                                } else {
                                    obj = ListProtector.get(c21686219u0.LIZ, 0);
                                }
                                View view = (View) obj;
                                if (view != null) {
                                    StringBuilder sbLIZ14 = C2188811AlT.LIZ();
                                    sbLIZ14.append("A gap that needs to be repaired is detected, refer to the view location=");
                                    sbLIZ14.append(powerLayoutManager.getPosition(view));
                                    C2188811AlT.LIZIZ(sbLIZ14);
                                    if (this.LJIJI != null) {
                                        StringBuilder sbLIZ15 = C2188811AlT.LIZ();
                                        sbLIZ15.append("Start the repair operation: Set the alignment line for all columns to:");
                                        sbLIZ15.append(iLIZIZ);
                                        C2188811AlT.LIZIZ(sbLIZ15);
                                        int length = this.LJIJI.length;
                                        for (int i5 = 0; i5 < length; i5++) {
                                            C21686219u0 c21686219u02 = this.LJIJI[i5];
                                            c21686219u02.LIZIZ = iLIZIZ;
                                            c21686219u02.LIZJ = iLIZIZ;
                                            c21686219u02.LJI = Integer.MIN_VALUE;
                                            c21686219u02.LJFF = Integer.MIN_VALUE;
                                            StringBuilder sbLIZ16 = C2188811AlT.LIZ();
                                            sbLIZ16.append("Alignment line reset in column[");
                                            sbLIZ16.append(i5);
                                            sbLIZ16.append(e3.f);
                                            C2188811AlT.LIZIZ(sbLIZ16);
                                        }
                                    }
                                    HandlerHook.viewPost(powerLayoutManager.LLILZIL, new ARunnableS132S0100000_32(powerLayoutManager, 1));
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void LJJI() {
        C21686219u0[] c21686219u0Arr = this.LJIJI;
        if (c21686219u0Arr == null || c21686219u0Arr.length != this.LJIIJJI || this.LJIJJ == null) {
            this.LJIJJ = new BitSet(this.LJIIJJI);
            this.LJIJI = new C21686219u0[this.LJIIJJI];
            for (int i = 0; i < this.LJIIJJI; i++) {
                this.LJIJI[i] = new C21686219u0(i);
            }
        }
    }

    @Override // X.AbstractC21686119tz
    public final void LJIIIIZZ(C21686719u5 c21686719u5) {
        C21686219u0[] c21686219u0Arr;
        LJJI();
        if (LJIIJJI(c21686719u5.LIZ) && (c21686219u0Arr = this.LJIJI) != null) {
            for (C21686219u0 c21686219u0 : c21686219u0Arr) {
                c21686219u0.LIZ();
            }
        }
    }

    @Override // X.AbstractC21685919tx
    public final void LJIL(InterfaceC21686919u7 interfaceC21686919u7) {
        WeakReference<PowerLayoutManager> weakReference = this.LJJ;
        if (weakReference != null && weakReference.get() == interfaceC21686919u7) {
            this.LJJ = null;
        }
    }

    public final String LJJIIZ(int i) {
        if (this.LIZ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i);
            sbLIZ.append("");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append((i - ((Integer) this.LIZ.LIZ).intValue()) + 1);
        sbLIZ2.append("/");
        sbLIZ2.append(this.LJI);
        sbLIZ2.append("[adapter:");
        sbLIZ2.append(i);
        sbLIZ2.append(e3.f);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public C21685719tv(int i, int i2) {
        this.LJIJJLI = new C21686819u6();
        this.LJIL = new ArrayList();
        this.LJJ = null;
        this.LJIIJJI = i;
        LJJI();
        this.LJIIL = i2;
        this.LJIILIIL = i2;
    }

    @Override // X.AbstractC21686119tz
    public final void LIZ(int i, InterfaceC21686919u7 interfaceC21686919u7) {
        C21686219u0[] c21686219u0Arr;
        if (interfaceC21686919u7.getOrientation() == 0 && (c21686219u0Arr = this.LJIJI) != null) {
            for (C21686219u0 c21686219u0 : c21686219u0Arr) {
                c21686219u0.LIZLLL(i);
            }
        }
    }

    @Override // X.AbstractC21686119tz
    public final void LIZIZ(int i, InterfaceC21686919u7 interfaceC21686919u7) {
        C21686219u0[] c21686219u0Arr;
        if (interfaceC21686919u7.getOrientation() == 1 && (c21686219u0Arr = this.LJIJI) != null) {
            for (C21686219u0 c21686219u0 : c21686219u0Arr) {
                c21686219u0.LIZLLL(i);
            }
        }
    }

    public final int LJJIFFI(int i, AbstractC21686519u3 abstractC21686519u3) {
        int iLIZIZ = this.LJIJI[0].LIZIZ(i, abstractC21686519u3);
        for (int i2 = 1; i2 < this.LJIIJJI; i2++) {
            int iLIZIZ2 = this.LJIJI[i2].LIZIZ(i, abstractC21686519u3);
            if (iLIZIZ2 > iLIZIZ) {
                iLIZIZ = iLIZIZ2;
            }
        }
        return iLIZIZ;
    }

    public final int LJJII(int i, AbstractC21686519u3 abstractC21686519u3) {
        int iLIZJ = this.LJIJI[0].LIZJ(i, abstractC21686519u3);
        for (int i2 = 1; i2 < this.LJIIJJI; i2++) {
            int iLIZJ2 = this.LJIJI[i2].LIZJ(i, abstractC21686519u3);
            if (iLIZJ2 > iLIZJ) {
                iLIZJ = iLIZJ2;
            }
        }
        return iLIZJ;
    }

    public final int LJJIII(int i, AbstractC21686519u3 abstractC21686519u3) {
        int iLIZIZ = this.LJIJI[0].LIZIZ(i, abstractC21686519u3);
        for (int i2 = 1; i2 < this.LJIIJJI; i2++) {
            int iLIZIZ2 = this.LJIJI[i2].LIZIZ(i, abstractC21686519u3);
            if (iLIZIZ2 < iLIZIZ) {
                iLIZIZ = iLIZIZ2;
            }
        }
        return iLIZIZ;
    }

    public final int LJJIIJ(int i, AbstractC21686519u3 abstractC21686519u3) {
        int iLIZJ = this.LJIJI[0].LIZJ(i, abstractC21686519u3);
        for (int i2 = 1; i2 < this.LJIIJJI; i2++) {
            int iLIZJ2 = this.LJIJI[i2].LIZJ(i, abstractC21686519u3);
            if (iLIZJ2 < iLIZJ) {
                iLIZJ = iLIZJ2;
            }
        }
        return iLIZJ;
    }

    @Override // X.AbstractC21686119tz
    public final void LIZLLL(int i, InterfaceC21686919u7 interfaceC21686919u7, boolean z) {
        View viewFindViewByPosition = interfaceC21686919u7.findViewByPosition(i);
        if (viewFindViewByPosition != null) {
            AbstractC21686519u3 abstractC21686519u3 = ((PowerLayoutManager) interfaceC21686919u7).LLILLJJLI;
            int viewPosition = ((RecyclerView.LayoutParams) viewFindViewByPosition.getLayoutParams()).getViewPosition();
            if (interfaceC21686919u7.getReverseLayout()) {
                if (z) {
                    C21686219u0 c21686219u0LJJIIJZLJL = LJJIIJZLJL(viewPosition, viewFindViewByPosition, true);
                    if (c21686219u0LJJIIJZLJL != null) {
                        c21686219u0LJJIIJZLJL.LJ(abstractC21686519u3);
                        return;
                    }
                    return;
                }
                C21686219u0 c21686219u0LJJIIJZLJL2 = LJJIIJZLJL(viewPosition, viewFindViewByPosition, false);
                if (c21686219u0LJJIIJZLJL2 == null) {
                    return;
                }
                c21686219u0LJJIIJZLJL2.LJFF(abstractC21686519u3);
                return;
            }
            if (z) {
                C21686219u0 c21686219u0LJJIIJZLJL3 = LJJIIJZLJL(viewPosition, viewFindViewByPosition, true);
                if (c21686219u0LJJIIJZLJL3 == null) {
                    return;
                }
                c21686219u0LJJIIJZLJL3.LJFF(abstractC21686519u3);
                return;
            }
            C21686219u0 c21686219u0LJJIIJZLJL4 = LJJIIJZLJL(viewPosition, viewFindViewByPosition, false);
            if (c21686219u0LJJIIJZLJL4 == null) {
                return;
            }
            c21686219u0LJJIIJZLJL4.LJ(abstractC21686519u3);
        }
    }

    @Override // X.AbstractC21686119tz
    public final void LJIIJ(int i, int i2, int i3) {
        if (i2 <= ((Integer) this.LIZ.LIZIZ).intValue() && i3 >= ((Integer) this.LIZ.LIZ).intValue() && i == 0) {
            LJJ();
        }
    }

    @Override // X.AbstractC21685919tx, X.AbstractC21686119tz
    public final void LJIILJJIL(C21673319rv c21673319rv, C21673919s1 c21673919s1, InterfaceC21686919u7 interfaceC21686919u7) {
        int iLJIIZILJ;
        int i;
        int i2;
        int i3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Prepare layout: column=");
        sbLIZ.append(this.LJIIJJI);
        C2188811AlT.LIZIZ(sbLIZ);
        super.LJIILJJIL(c21673319rv, c21673919s1, interfaceC21686919u7);
        super.LJIILJJIL(c21673319rv, c21673919s1, interfaceC21686919u7);
        if (interfaceC21686919u7.getOrientation() == 1) {
            iLJIIZILJ = (((PowerLayoutManager) interfaceC21686919u7).LJIJ() - interfaceC21686919u7.getPaddingLeft()) - interfaceC21686919u7.getPaddingRight();
            i = this.LIZIZ;
            i2 = this.LIZJ;
        } else {
            iLJIIZILJ = (((PowerLayoutManager) interfaceC21686919u7).LJIIZILJ() - interfaceC21686919u7.getPaddingTop()) - interfaceC21686919u7.getPaddingBottom();
            i = this.LIZLLL;
            i2 = this.LJ;
        }
        int i4 = iLJIIZILJ - (i + i2);
        int i5 = this.LJIIL;
        int i6 = this.LJIIJJI;
        int i7 = (int) (((double) ((i4 - (i5 * (i6 - 1))) / i6)) + 0.5d);
        this.LJIILLIIL = i7;
        int i8 = i4 - (i7 * i6);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Compute available space: availableWidth=");
        sbLIZ2.append(i4);
        sbLIZ2.append(", mColLength=");
        sbLIZ2.append(this.LJIILLIIL);
        sbLIZ2.append(", mHGap=");
        sbLIZ2.append(this.LJIIL);
        sbLIZ2.append(", mVGap=");
        sbLIZ2.append(this.LJIILIIL);
        C2188811AlT.LIZIZ(sbLIZ2);
        int i9 = this.LJIIJJI;
        if (i9 <= 1) {
            this.LJIILL = 0;
            this.LJIILJJIL = 0;
        } else if (i9 == 2) {
            this.LJIILJJIL = i8;
            this.LJIILL = i8;
        } else {
            if (interfaceC21686919u7.getOrientation() == 1) {
                i3 = this.LJIIL;
            } else {
                i3 = this.LJIILIIL;
            }
            this.LJIILL = i3;
            this.LJIILJJIL = i3;
        }
        WeakReference<PowerLayoutManager> weakReference = this.LJJ;
        if ((weakReference == null || weakReference.get() == null || this.LJJ.get() != interfaceC21686919u7) && (interfaceC21686919u7 instanceof PowerLayoutManager)) {
            this.LJJ = new WeakReference<>(interfaceC21686919u7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x01c9  */
    @Override // X.AbstractC21686119tz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(X.C21673919s1 r16, X.C21686719u5 r17, X.InterfaceC21686919u7 r18) {
        /*
            Method dump skipped, instruction units count: 667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21685719tv.LJIIZILJ(X.19s1, X.19u5, X.19u7):void");
    }

    public final C21686219u0 LJJIIJZLJL(int i, View view, boolean z) {
        int i2;
        int[] iArr = this.LJIJJLI.LIZ;
        if (iArr != null && i < iArr.length && i >= 0) {
            i2 = iArr[i];
        } else {
            i2 = Integer.MIN_VALUE;
        }
        C21686219u0[] c21686219u0Arr = this.LJIJI;
        if (c21686219u0Arr == null) {
            return null;
        }
        if (i2 >= 0 && i2 < c21686219u0Arr.length) {
            C21686219u0 c21686219u0 = c21686219u0Arr[i2];
            if (z) {
                if (c21686219u0.LIZ.size() > 0 && ListProtector.get(c21686219u0.LIZ, 0) == view) {
                    return c21686219u0;
                }
            } else {
                int size = c21686219u0.LIZ.size();
                if (size > 0 && ListProtector.get(c21686219u0.LIZ, size - 1) == view) {
                    return c21686219u0;
                }
            }
        }
        int i3 = 0;
        while (true) {
            C21686219u0[] c21686219u0Arr2 = this.LJIJI;
            if (i3 >= c21686219u0Arr2.length) {
                return null;
            }
            if (i3 != i2) {
                C21686219u0 c21686219u02 = c21686219u0Arr2[i3];
                if (z) {
                    if (c21686219u02.LIZ.size() > 0 && ListProtector.get(c21686219u02.LIZ, 0) == view) {
                        return c21686219u02;
                    }
                } else {
                    int size2 = c21686219u02.LIZ.size();
                    if (size2 > 0 && ListProtector.get(c21686219u02.LIZ, size2 - 1) == view) {
                        return c21686219u02;
                    }
                }
            }
            i3++;
        }
    }

    @Override // X.AbstractC21686119tz
    public final int LIZJ(int i, boolean z, boolean z2, InterfaceC21686919u7 interfaceC21686919u7) {
        boolean z3;
        int iLJJII;
        int iLJ;
        if (interfaceC21686919u7.getOrientation() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC21686519u3 abstractC21686519u3 = ((PowerLayoutManager) interfaceC21686919u7).LLILLJJLI;
        View viewFindViewByPosition = interfaceC21686919u7.findViewByPosition(((Integer) this.LIZ.LIZ).intValue() + i);
        if (viewFindViewByPosition == null) {
            return 0;
        }
        LJJI();
        if (z3) {
            if (z) {
                if (i == this.LJI - 1) {
                    return 0 + this.LJ + (LJJIFFI(abstractC21686519u3.LIZIZ(viewFindViewByPosition), abstractC21686519u3) - abstractC21686519u3.LIZIZ(viewFindViewByPosition));
                }
                if (!z2) {
                    iLJJII = LJJIII(abstractC21686519u3.LJ(viewFindViewByPosition), abstractC21686519u3);
                    iLJ = abstractC21686519u3.LIZIZ(viewFindViewByPosition);
                    return iLJJII - iLJ;
                }
            } else {
                if (i == 0) {
                    return (0 - this.LIZLLL) - (abstractC21686519u3.LJ(viewFindViewByPosition) - LJJIIJ(abstractC21686519u3.LJ(viewFindViewByPosition), abstractC21686519u3));
                }
                if (!z2) {
                    iLJJII = LJJII(abstractC21686519u3.LIZIZ(viewFindViewByPosition), abstractC21686519u3);
                    iLJ = abstractC21686519u3.LJ(viewFindViewByPosition);
                    return iLJJII - iLJ;
                }
            }
        }
        return 0;
    }

    public final void LJJIIZI(C21686219u0 c21686219u0, int i, int i2, AbstractC21686519u3 abstractC21686519u3) {
        int i3 = c21686219u0.LIZLLL;
        if (i == -1) {
            if (c21686219u0.LIZJ(Integer.MIN_VALUE, abstractC21686519u3) + i3 < i2) {
                this.LJIJJ.set(c21686219u0.LJ, false);
            }
        } else {
            if (c21686219u0.LIZIZ(Integer.MIN_VALUE, abstractC21686519u3) - i3 <= i2) {
                return;
            }
            this.LJIJJ.set(c21686219u0.LJ, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0641  */
    @Override // X.AbstractC21685919tx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(X.C21673319rv r33, X.C21673919s1 r34, X.C21686319u1 r35, X.C21687819uG r36, X.InterfaceC21686919u7 r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2071
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21685719tv.LJIJI(X.19rv, X.19s1, X.19u1, X.19uG, X.19u7):void");
    }

    @Override // X.AbstractC21685919tx, X.AbstractC21686119tz
    public final void LJFF(C21673319rv c21673319rv, C21673919s1 c21673919s1, int i, int i2, int i3, InterfaceC21686919u7 interfaceC21686919u7) throws Throwable {
        super.LJFF(c21673319rv, c21673919s1, i, i2, i3, interfaceC21686919u7);
        this.LJIJ = false;
        if (i <= ((Integer) this.LIZ.LIZIZ).intValue() && i2 >= ((Integer) this.LIZ.LIZ).intValue() && !c21673919s1.LJI && interfaceC21686919u7.getChildCount() > 0 && interfaceC21686919u7.getChildAt(0) != null) {
            LJJ();
        }
    }
}
