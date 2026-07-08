package X;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.flexbox.FlexItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.19Ou, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21533019Ou {
    public final InterfaceC21533119Ov LIZ;
    public boolean[] LIZIZ;
    public int[] LIZJ;
    public long[] LIZLLL;
    public long[] LJ;

    public C21533019Ou(InterfaceC21533119Ov interfaceC21533119Ov) {
        this.LIZ = interfaceC21533119Ov;
    }

    public final List<C21532819Os> LJFF(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            FlexItem flexItem = (FlexItem) this.LIZ.LIZJ(i2).getLayoutParams();
            C21532819Os c21532819Os = new C21532819Os();
            c21532819Os.LLILLJJLI = flexItem.getOrder();
            c21532819Os.LL = i2;
            arrayList.add(c21532819Os);
        }
        return arrayList;
    }

    public final void LJIIIIZZ(int i) {
        int[] iArr = this.LIZJ;
        if (iArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.LIZJ = new int[i];
        } else {
            if (iArr.length >= i) {
                return;
            }
            int length = iArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.LIZJ = Arrays.copyOf(iArr, i);
        }
    }

    public final void LJIIIZ(int i) {
        long[] jArr = this.LIZLLL;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.LIZLLL = new long[i];
        } else {
            if (jArr.length >= i) {
                return;
            }
            int length = jArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.LIZLLL = Arrays.copyOf(jArr, i);
        }
    }

    public final void LJIIJ(int i) {
        long[] jArr = this.LJ;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.LJ = new long[i];
        } else {
            if (jArr.length >= i) {
                return;
            }
            int length = jArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.LJ = Arrays.copyOf(jArr, i);
        }
    }

    public final void LJIJJ(int i) {
        int i2;
        View viewLJIIIIZZ;
        if (i >= this.LIZ.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.LIZ.getFlexDirection();
        if (this.LIZ.getAlignItems() == 4) {
            int[] iArr = this.LIZJ;
            if (iArr != null) {
                i2 = iArr[i];
            } else {
                i2 = 0;
            }
            List<C21532719Or> flexLinesInternal = this.LIZ.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            while (i2 < size) {
                C21532719Or c21532719Or = (C21532719Or) ListProtector.get(flexLinesInternal, i2);
                int i3 = c21532719Or.LJII;
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = c21532719Or.LJIILJJIL + i4;
                    if (i4 < this.LIZ.getFlexItemCount() && (viewLJIIIIZZ = this.LIZ.LJIIIIZZ(i5)) != null && viewLJIIIIZZ.getVisibility() != 8) {
                        FlexItem flexItem = (FlexItem) viewLJIIIIZZ.getLayoutParams();
                        if (flexItem.GM() == -1 || flexItem.GM() == 4) {
                            if (flexDirection != 0 && flexDirection != 1) {
                                if (flexDirection != 2 && flexDirection != 3) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("Invalid flex direction: ");
                                    sbLIZ.append(flexDirection);
                                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                                }
                                LJIJ(c21532719Or.LJI, i5, viewLJIIIIZZ);
                            } else {
                                LJIJI(c21532719Or.LJI, i5, viewLJIIIIZZ);
                            }
                        }
                    }
                }
                i2++;
            }
            return;
        }
        for (C21532719Or c21532719Or2 : this.LIZ.getFlexLinesInternal()) {
            for (Integer num : (ArrayList) c21532719Or2.LJIILIIL) {
                View viewLJIIIIZZ2 = this.LIZ.LJIIIIZZ(num.intValue());
                if (flexDirection != 0 && flexDirection != 1) {
                    if (flexDirection != 2 && flexDirection != 3) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Invalid flex direction: ");
                        sbLIZ2.append(flexDirection);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    LJIJ(c21532719Or2.LJI, num.intValue(), viewLJIIIIZZ2);
                } else {
                    LJIJI(c21532719Or2.LJI, num.intValue(), viewLJIIIIZZ2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(int r6, android.view.View r7) {
        /*
            r5 = this;
            android.view.ViewGroup$LayoutParams r4 = r7.getLayoutParams()
            com.google.android.flexbox.FlexItem r4 = (com.google.android.flexbox.FlexItem) r4
            int r3 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r0 = r4.getMinWidth()
            if (r3 >= r0) goto L47
            int r3 = r4.getMinWidth()
        L18:
            r1 = 1
        L19:
            int r0 = r4.getMinHeight()
            if (r2 >= r0) goto L39
            int r2 = r4.getMinHeight()
        L23:
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r5.LJIJJLI(r7, r6, r1, r0)
            X.19Ov r0 = r5.LIZ
            r0.LJIIJ(r6, r7)
        L38:
            return
        L39:
            int r0 = r4.getMaxHeight()
            if (r2 <= r0) goto L44
            int r2 = r4.getMaxHeight()
            goto L23
        L44:
            if (r1 == 0) goto L38
            goto L23
        L47:
            int r0 = r4.getMaxWidth()
            if (r3 <= r0) goto L52
            int r3 = r4.getMaxWidth()
            goto L18
        L52:
            r1 = 0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21533019Ou.LIZJ(int, android.view.View):void");
    }

    public final void LIZLLL(int i, List list) {
        int i2 = this.LIZJ[i];
        if (i2 == -1) {
            i2 = 0;
        }
        for (int size = list.size() - 1; size >= i2; size--) {
            ListProtector.remove(list, size);
        }
        int[] iArr = this.LIZJ;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.LIZLLL;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    public static List LJ(int i, int i2, List list) {
        int i3 = (i - i2) / 2;
        ArrayList arrayList = new ArrayList();
        C21532719Or c21532719Or = new C21532719Or();
        c21532719Or.LJI = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(c21532719Or);
            }
            arrayList.add(ListProtector.get(list, i4));
            if (i4 == list.size() - 1) {
                arrayList.add(c21532719Or);
            }
        }
        return arrayList;
    }

    public static int[] LJIIZILJ(int i, List list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i2 = 0;
        for (C21532819Os c21532819Os : (ArrayList) list) {
            int i3 = c21532819Os.LL;
            iArr[i2] = i3;
            sparseIntArray.append(i3, c21532819Os.LLILLJJLI);
            i2++;
        }
        return iArr;
    }

    public final void LJI(int i, int i2, int i3) {
        int mode;
        int size;
        int flexDirection = this.LIZ.getFlexDirection();
        if (flexDirection != 0 && flexDirection != 1) {
            if (flexDirection != 2 && flexDirection != 3) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Invalid flex direction: ");
                sbLIZ.append(flexDirection);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
        } else {
            mode = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
        }
        List<C21532719Or> flexLinesInternal = this.LIZ.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = this.LIZ.getSumOfCrossSize() + i3;
            int i4 = 0;
            if (flexLinesInternal.size() == 1) {
                ((C21532719Or) ListProtector.get(flexLinesInternal, 0)).LJI = size - i3;
                return;
            }
            if (flexLinesInternal.size() < 2) {
                return;
            }
            int alignContent = this.LIZ.getAlignContent();
            if (alignContent != 1) {
                if (alignContent != 2) {
                    if (alignContent != 3) {
                        if (alignContent != 4) {
                            if (alignContent != 5 || sumOfCrossSize >= size) {
                                return;
                            }
                            float size2 = (size - sumOfCrossSize) / flexLinesInternal.size();
                            int size3 = flexLinesInternal.size();
                            float f = 0.0f;
                            while (i4 < size3) {
                                C21532719Or c21532719Or = (C21532719Or) ListProtector.get(flexLinesInternal, i4);
                                float f2 = c21532719Or.LJI + size2;
                                if (i4 == flexLinesInternal.size() - 1) {
                                    f2 += f;
                                    f = 0.0f;
                                }
                                int iRound = Math.round(f2);
                                f += f2 - iRound;
                                if (f > 1.0f) {
                                    iRound++;
                                    f -= 1.0f;
                                } else if (f < -1.0f) {
                                    iRound--;
                                    f += 1.0f;
                                }
                                c21532719Or.LJI = iRound;
                                i4++;
                            }
                            return;
                        }
                        if (sumOfCrossSize >= size) {
                            this.LIZ.setFlexLines(LJ(size, sumOfCrossSize, flexLinesInternal));
                            return;
                        }
                        int size4 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                        ArrayList arrayList = new ArrayList();
                        C21532719Or c21532719Or2 = new C21532719Or();
                        c21532719Or2.LJI = size4;
                        for (C21532719Or c21532719Or3 : flexLinesInternal) {
                            arrayList.add(c21532719Or2);
                            arrayList.add(c21532719Or3);
                            arrayList.add(c21532719Or2);
                        }
                        this.LIZ.setFlexLines(arrayList);
                        return;
                    }
                    if (sumOfCrossSize >= size) {
                        return;
                    }
                    float size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList2 = new ArrayList();
                    int size6 = flexLinesInternal.size();
                    float f3 = 0.0f;
                    while (i4 < size6) {
                        arrayList2.add(ListProtector.get(flexLinesInternal, i4));
                        if (i4 != flexLinesInternal.size() - 1) {
                            C21532719Or c21532719Or4 = new C21532719Or();
                            if (i4 == flexLinesInternal.size() - 2) {
                                c21532719Or4.LJI = Math.round(f3 + size5);
                                f3 = 0.0f;
                            } else {
                                c21532719Or4.LJI = Math.round(size5);
                            }
                            int i5 = c21532719Or4.LJI;
                            f3 += size5 - i5;
                            if (f3 > 1.0f) {
                                c21532719Or4.LJI = i5 + 1;
                                f3 -= 1.0f;
                            } else if (f3 < -1.0f) {
                                c21532719Or4.LJI = i5 - 1;
                                f3 += 1.0f;
                            }
                            arrayList2.add(c21532719Or4);
                        }
                        i4++;
                    }
                    this.LIZ.setFlexLines(arrayList2);
                    return;
                }
                this.LIZ.setFlexLines(LJ(size, sumOfCrossSize, flexLinesInternal));
                return;
            }
            C21532719Or c21532719Or5 = new C21532719Or();
            c21532719Or5.LJI = size - sumOfCrossSize;
            ListProtector.add(flexLinesInternal, 0, c21532719Or5);
        }
    }

    public final void LJII(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        int flexItemCount = this.LIZ.getFlexItemCount();
        boolean[] zArr = this.LIZIZ;
        int i4 = 0;
        if (zArr == null) {
            if (flexItemCount < 10) {
                flexItemCount = 10;
            }
            this.LIZIZ = new boolean[flexItemCount];
        } else if (zArr.length < flexItemCount) {
            int length = zArr.length * 2;
            if (length >= flexItemCount) {
                flexItemCount = length;
            }
            this.LIZIZ = new boolean[flexItemCount];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i3 >= this.LIZ.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.LIZ.getFlexDirection();
        int flexDirection2 = this.LIZ.getFlexDirection();
        if (flexDirection2 != 0 && flexDirection2 != 1) {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Invalid flex direction: ");
                sbLIZ.append(flexDirection);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            int mode = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode != 1073741824) {
                size = this.LIZ.getLargestMainSize();
            }
            paddingLeft = this.LIZ.getPaddingTop();
            paddingRight = this.LIZ.getPaddingBottom();
        } else {
            int mode2 = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = this.LIZ.getLargestMainSize();
            if (mode2 != 1073741824 && largestMainSize <= size) {
                size = largestMainSize;
            }
            paddingLeft = this.LIZ.getPaddingLeft();
            paddingRight = this.LIZ.getPaddingRight();
        }
        int i5 = paddingLeft + paddingRight;
        int[] iArr = this.LIZJ;
        if (iArr != null) {
            i4 = iArr[i3];
        }
        List<C21532719Or> flexLinesInternal = this.LIZ.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i4 < size2) {
            C21532719Or c21532719Or = (C21532719Or) ListProtector.get(flexLinesInternal, i4);
            int i6 = c21532719Or.LJ;
            if (i6 < size && c21532719Or.LJIILLIIL) {
                LJIIJJI(i, i2, c21532719Or, size, i5, false);
            } else if (i6 > size && c21532719Or.LJIIZILJ) {
                LJIILLIIL(i, i2, c21532719Or, size, i5, false);
            }
            i4++;
        }
    }

    public final int LJIIL(int i, FlexItem flexItem, int i2) {
        InterfaceC21533119Ov interfaceC21533119Ov = this.LIZ;
        int iLJII = interfaceC21533119Ov.LJII(i, interfaceC21533119Ov.getPaddingTop() + this.LIZ.getPaddingBottom() + flexItem.getMarginTop() + flexItem.getMarginBottom() + i2, flexItem.getHeight());
        int size = View.MeasureSpec.getSize(iLJII);
        if (size > flexItem.getMaxHeight()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.getMaxHeight(), View.MeasureSpec.getMode(iLJII));
        }
        if (size >= flexItem.getMinHeight()) {
            return iLJII;
        }
        return View.MeasureSpec.makeMeasureSpec(flexItem.getMinHeight(), View.MeasureSpec.getMode(iLJII));
    }

    public final int LJIILIIL(int i, FlexItem flexItem, int i2) {
        InterfaceC21533119Ov interfaceC21533119Ov = this.LIZ;
        int iLJIIIZ = interfaceC21533119Ov.LJIIIZ(i, interfaceC21533119Ov.getPaddingLeft() + this.LIZ.getPaddingRight() + flexItem.getMarginLeft() + flexItem.getMarginRight() + i2, flexItem.getWidth());
        int size = View.MeasureSpec.getSize(iLJIIIZ);
        if (size > flexItem.getMaxWidth()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.getMaxWidth(), View.MeasureSpec.getMode(iLJIIIZ));
        }
        if (size >= flexItem.getMinWidth()) {
            return iLJIIIZ;
        }
        return View.MeasureSpec.makeMeasureSpec(flexItem.getMinWidth(), View.MeasureSpec.getMode(iLJIIIZ));
    }

    public final void LJIJ(int i, int i2, View view) {
        int measuredHeight;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i - flexItem.getMarginLeft()) - flexItem.getMarginRight()) - this.LIZ.LJFF(view), flexItem.getMinWidth()), flexItem.getMaxWidth());
        long[] jArr = this.LJ;
        if (jArr != null) {
            measuredHeight = (int) (jArr[i2] >> 32);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        LJIJJLI(view, i2, iMakeMeasureSpec2, iMakeMeasureSpec);
        this.LIZ.LJIIJ(i2, view);
    }

    public final void LJIJI(int i, int i2, View view) {
        int measuredWidth;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i - flexItem.getMarginTop()) - flexItem.getMarginBottom()) - this.LIZ.LJFF(view), flexItem.getMinHeight()), flexItem.getMaxHeight());
        long[] jArr = this.LJ;
        if (jArr != null) {
            measuredWidth = (int) jArr[i2];
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        LJIJJLI(view, i2, iMakeMeasureSpec, iMakeMeasureSpec2);
        this.LIZ.LJIIJ(i2, view);
    }

    public final void LIZ(List<C21532719Or> list, C21532719Or c21532719Or, int i, int i2) {
        c21532719Or.LJIIL = i2;
        this.LIZ.LIZ(c21532719Or);
        c21532719Or.LJIILL = i;
        list.add(c21532719Or);
    }

    public final void LJIJJLI(View view, int i, int i2, int i3) {
        long[] jArr = this.LIZLLL;
        if (jArr != null) {
            jArr[i] = (((long) i2) & 4294967295L) | (((long) i3) << 32);
        }
        long[] jArr2 = this.LJ;
        if (jArr2 != null) {
            int measuredWidth = view.getMeasuredWidth();
            jArr2[i] = (((long) measuredWidth) & 4294967295L) | (((long) view.getMeasuredHeight()) << 32);
        }
    }

    public final void LJIIJJI(int i, int i2, C21532719Or c21532719Or, int i3, int i4, boolean z) {
        int i5;
        double d;
        double d2;
        float f = c21532719Or.LJIIIZ;
        float f2 = 0.0f;
        if (f > 0.0f && i3 >= (i5 = c21532719Or.LJ)) {
            float f3 = (i3 - i5) / f;
            c21532719Or.LJ = i4 + c21532719Or.LJFF;
            if (!z) {
                c21532719Or.LJI = Integer.MIN_VALUE;
            }
            int i6 = 0;
            boolean z2 = false;
            int iMax = 0;
            float f4 = 0.0f;
            while (i6 < c21532719Or.LJII) {
                int i7 = c21532719Or.LJIILJJIL + i6;
                View viewLJIIIIZZ = this.LIZ.LJIIIIZZ(i7);
                if (viewLJIIIIZZ != null && viewLJIIIIZZ.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) viewLJIIIIZZ.getLayoutParams();
                    int flexDirection = this.LIZ.getFlexDirection();
                    if (flexDirection != 0 && flexDirection != 1) {
                        int measuredHeight = viewLJIIIIZZ.getMeasuredHeight();
                        long[] jArr = this.LJ;
                        if (jArr != null) {
                            measuredHeight = (int) (jArr[i7] >> 32);
                        }
                        int measuredWidth = viewLJIIIIZZ.getMeasuredWidth();
                        long[] jArr2 = this.LJ;
                        if (jArr2 != null) {
                            measuredWidth = (int) jArr2[i7];
                        }
                        if (!this.LIZIZ[i7] && flexItem.tB() > f2) {
                            float fTB = measuredHeight + (flexItem.tB() * f3);
                            if (i6 == c21532719Or.LJII - 1) {
                                fTB += f4;
                                f4 = 0.0f;
                            }
                            int iRound = Math.round(fTB);
                            if (iRound > flexItem.getMaxHeight()) {
                                iRound = flexItem.getMaxHeight();
                                this.LIZIZ[i7] = true;
                                c21532719Or.LJIIIZ -= flexItem.tB();
                                z2 = true;
                            } else {
                                f4 += fTB - iRound;
                                double d3 = f4;
                                if (d3 > 1.0d) {
                                    iRound++;
                                    d2 = d3 - 1.0d;
                                } else if (d3 < -1.0d) {
                                    iRound--;
                                    d2 = d3 + 1.0d;
                                }
                                f4 = (float) d2;
                            }
                            int iLJIILIIL = LJIILIIL(i, flexItem, c21532719Or.LJIIL);
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                            viewLJIIIIZZ.measure(iLJIILIIL, iMakeMeasureSpec);
                            measuredWidth = viewLJIIIIZZ.getMeasuredWidth();
                            measuredHeight = viewLJIIIIZZ.getMeasuredHeight();
                            LJIJJLI(viewLJIIIIZZ, i7, iLJIILIIL, iMakeMeasureSpec);
                            this.LIZ.LJIIJ(i7, viewLJIIIIZZ);
                        }
                        iMax = Math.max(iMax, measuredWidth + flexItem.getMarginLeft() + flexItem.getMarginRight() + this.LIZ.LJFF(viewLJIIIIZZ));
                        c21532719Or.LJ += measuredHeight + flexItem.getMarginTop() + flexItem.getMarginBottom();
                    } else {
                        int measuredWidth2 = viewLJIIIIZZ.getMeasuredWidth();
                        long[] jArr3 = this.LJ;
                        if (jArr3 != null) {
                            measuredWidth2 = (int) jArr3[i7];
                        }
                        int measuredHeight2 = viewLJIIIIZZ.getMeasuredHeight();
                        long[] jArr4 = this.LJ;
                        if (jArr4 != null) {
                            measuredHeight2 = (int) (jArr4[i7] >> 32);
                        }
                        if (!this.LIZIZ[i7] && flexItem.tB() > 0.0f) {
                            float fTB2 = measuredWidth2 + (flexItem.tB() * f3);
                            if (i6 == c21532719Or.LJII - 1) {
                                fTB2 += f4;
                                f4 = 0.0f;
                            }
                            int iRound2 = Math.round(fTB2);
                            if (iRound2 > flexItem.getMaxWidth()) {
                                iRound2 = flexItem.getMaxWidth();
                                this.LIZIZ[i7] = true;
                                c21532719Or.LJIIIZ -= flexItem.tB();
                                z2 = true;
                            } else {
                                f4 += fTB2 - iRound2;
                                double d4 = f4;
                                if (d4 > 1.0d) {
                                    iRound2++;
                                    d = d4 - 1.0d;
                                } else if (d4 < -1.0d) {
                                    iRound2--;
                                    d = d4 + 1.0d;
                                }
                                f4 = (float) d;
                            }
                            int iLJIIL = LJIIL(i2, flexItem, c21532719Or.LJIIL);
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                            viewLJIIIIZZ.measure(iMakeMeasureSpec2, iLJIIL);
                            measuredWidth2 = viewLJIIIIZZ.getMeasuredWidth();
                            measuredHeight2 = viewLJIIIIZZ.getMeasuredHeight();
                            LJIJJLI(viewLJIIIIZZ, i7, iMakeMeasureSpec2, iLJIIL);
                            this.LIZ.LJIIJ(i7, viewLJIIIIZZ);
                        }
                        iMax = Math.max(iMax, measuredHeight2 + flexItem.getMarginTop() + flexItem.getMarginBottom() + this.LIZ.LJFF(viewLJIIIIZZ));
                        c21532719Or.LJ += measuredWidth2 + flexItem.getMarginLeft() + flexItem.getMarginRight();
                    }
                    c21532719Or.LJI = Math.max(c21532719Or.LJI, iMax);
                }
                i6++;
                f2 = 0.0f;
            }
            if (z2 && i5 != c21532719Or.LJ) {
                LJIIJJI(i, i2, c21532719Or, i3, i4, true);
            }
        }
    }

    public final void LJIILJJIL(View view, C21532719Or c21532719Or, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.LIZ.getAlignItems();
        if (flexItem.GM() != -1) {
            alignItems = flexItem.GM();
        }
        int i5 = c21532719Or.LJI;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems != 2) {
                    if (alignItems != 3) {
                        if (alignItems != 4) {
                            return;
                        }
                    } else if (this.LIZ.getFlexWrap() != 2) {
                        int iMax = Math.max(c21532719Or.LJIIJJI - view.getBaseline(), flexItem.getMarginTop());
                        view.layout(i, i2 + iMax, i3, i4 + iMax);
                        return;
                    } else {
                        int iMax2 = Math.max((c21532719Or.LJIIJJI - view.getMeasuredHeight()) + view.getBaseline(), flexItem.getMarginBottom());
                        view.layout(i, i2 - iMax2, i3, i4 - iMax2);
                        return;
                    }
                } else {
                    int measuredHeight = (((i5 - view.getMeasuredHeight()) + flexItem.getMarginTop()) - flexItem.getMarginBottom()) / 2;
                    if (this.LIZ.getFlexWrap() != 2) {
                        int i6 = i2 + measuredHeight;
                        view.layout(i, i6, i3, view.getMeasuredHeight() + i6);
                        return;
                    } else {
                        int i7 = i2 - measuredHeight;
                        view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                        return;
                    }
                }
            } else if (this.LIZ.getFlexWrap() != 2) {
                int i8 = i2 + i5;
                view.layout(i, (i8 - view.getMeasuredHeight()) - flexItem.getMarginBottom(), i3, i8 - flexItem.getMarginBottom());
                return;
            } else {
                view.layout(i, (i2 - i5) + view.getMeasuredHeight() + flexItem.getMarginTop(), i3, (i4 - i5) + view.getMeasuredHeight() + flexItem.getMarginTop());
                return;
            }
        }
        if (this.LIZ.getFlexWrap() != 2) {
            view.layout(i, i2 + flexItem.getMarginTop(), i3, i4 + flexItem.getMarginTop());
        } else {
            view.layout(i, i2 - flexItem.getMarginBottom(), i3, i4 - flexItem.getMarginBottom());
        }
    }

    public final void LJIILLIIL(int i, int i2, C21532719Or c21532719Or, int i3, int i4, boolean z) {
        int i5 = c21532719Or.LJ;
        float f = c21532719Or.LJIIJ;
        float f2 = 0.0f;
        if (f > 0.0f && i3 <= i5) {
            float f3 = (i5 - i3) / f;
            c21532719Or.LJ = i4 + c21532719Or.LJFF;
            if (!z) {
                c21532719Or.LJI = Integer.MIN_VALUE;
            }
            int i6 = 0;
            boolean z2 = false;
            int iMax = 0;
            float f4 = 0.0f;
            while (i6 < c21532719Or.LJII) {
                int i7 = c21532719Or.LJIILJJIL + i6;
                View viewLJIIIIZZ = this.LIZ.LJIIIIZZ(i7);
                if (viewLJIIIIZZ != null && viewLJIIIIZZ.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) viewLJIIIIZZ.getLayoutParams();
                    int flexDirection = this.LIZ.getFlexDirection();
                    if (flexDirection != 0 && flexDirection != 1) {
                        int measuredHeight = viewLJIIIIZZ.getMeasuredHeight();
                        long[] jArr = this.LJ;
                        if (jArr != null) {
                            measuredHeight = (int) (jArr[i7] >> 32);
                        }
                        int measuredWidth = viewLJIIIIZZ.getMeasuredWidth();
                        long[] jArr2 = this.LJ;
                        if (jArr2 != null) {
                            measuredWidth = (int) jArr2[i7];
                        }
                        if (!this.LIZIZ[i7] && flexItem.Ca() > f2) {
                            float fCa = measuredHeight - (flexItem.Ca() * f3);
                            if (i6 == c21532719Or.LJII - 1) {
                                fCa += f4;
                                f4 = 0.0f;
                            }
                            int iRound = Math.round(fCa);
                            if (iRound < flexItem.getMinHeight()) {
                                iRound = flexItem.getMinHeight();
                                this.LIZIZ[i7] = true;
                                c21532719Or.LJIIJ -= flexItem.Ca();
                                z2 = true;
                            } else {
                                f4 += fCa - iRound;
                                double d = f4;
                                if (d > 1.0d) {
                                    iRound++;
                                    f4 -= 1.0f;
                                } else if (d < -1.0d) {
                                    iRound--;
                                    f4 += 1.0f;
                                }
                            }
                            int iLJIILIIL = LJIILIIL(i, flexItem, c21532719Or.LJIIL);
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                            viewLJIIIIZZ.measure(iLJIILIIL, iMakeMeasureSpec);
                            measuredWidth = viewLJIIIIZZ.getMeasuredWidth();
                            measuredHeight = viewLJIIIIZZ.getMeasuredHeight();
                            LJIJJLI(viewLJIIIIZZ, i7, iLJIILIIL, iMakeMeasureSpec);
                            this.LIZ.LJIIJ(i7, viewLJIIIIZZ);
                        }
                        iMax = Math.max(iMax, measuredWidth + flexItem.getMarginLeft() + flexItem.getMarginRight() + this.LIZ.LJFF(viewLJIIIIZZ));
                        c21532719Or.LJ += measuredHeight + flexItem.getMarginTop() + flexItem.getMarginBottom();
                    } else {
                        int measuredWidth2 = viewLJIIIIZZ.getMeasuredWidth();
                        long[] jArr3 = this.LJ;
                        if (jArr3 != null) {
                            measuredWidth2 = (int) jArr3[i7];
                        }
                        int measuredHeight2 = viewLJIIIIZZ.getMeasuredHeight();
                        long[] jArr4 = this.LJ;
                        if (jArr4 != null) {
                            measuredHeight2 = (int) (jArr4[i7] >> 32);
                        }
                        if (!this.LIZIZ[i7] && flexItem.Ca() > 0.0f) {
                            float fCa2 = measuredWidth2 - (flexItem.Ca() * f3);
                            if (i6 == c21532719Or.LJII - 1) {
                                fCa2 += f4;
                                f4 = 0.0f;
                            }
                            int iRound2 = Math.round(fCa2);
                            if (iRound2 < flexItem.getMinWidth()) {
                                iRound2 = flexItem.getMinWidth();
                                this.LIZIZ[i7] = true;
                                c21532719Or.LJIIJ -= flexItem.Ca();
                                z2 = true;
                            } else {
                                f4 += fCa2 - iRound2;
                                double d2 = f4;
                                if (d2 > 1.0d) {
                                    iRound2++;
                                    f4 -= 1.0f;
                                } else if (d2 < -1.0d) {
                                    iRound2--;
                                    f4 += 1.0f;
                                }
                            }
                            int iLJIIL = LJIIL(i2, flexItem, c21532719Or.LJIIL);
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                            viewLJIIIIZZ.measure(iMakeMeasureSpec2, iLJIIL);
                            measuredWidth2 = viewLJIIIIZZ.getMeasuredWidth();
                            measuredHeight2 = viewLJIIIIZZ.getMeasuredHeight();
                            LJIJJLI(viewLJIIIIZZ, i7, iMakeMeasureSpec2, iLJIIL);
                            this.LIZ.LJIIJ(i7, viewLJIIIIZZ);
                        }
                        iMax = Math.max(iMax, measuredHeight2 + flexItem.getMarginTop() + flexItem.getMarginBottom() + this.LIZ.LJFF(viewLJIIIIZZ));
                        c21532719Or.LJ += measuredWidth2 + flexItem.getMarginLeft() + flexItem.getMarginRight();
                    }
                    c21532719Or.LJI = Math.max(c21532719Or.LJI, iMax);
                }
                i6++;
                f2 = 0.0f;
            }
            if (z2 && i5 != c21532719Or.LJ) {
                LJIILLIIL(i, i2, c21532719Or, i3, i4, true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x025b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0073 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0222  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C21532919Ot r29, int r30, int r31, int r32, int r33, int r34, java.util.List<X.C21532719Or> r35) {
        /*
            Method dump skipped, instruction units count: 941
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21533019Ou.LIZIZ(X.19Ot, int, int, int, int, int, java.util.List):void");
    }

    public final void LJIILL(View view, C21532719Or c21532719Or, boolean z, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.LIZ.getAlignItems();
        if (flexItem.GM() != -1) {
            alignItems = flexItem.GM();
        }
        int i5 = c21532719Or.LJI;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems != 2) {
                    if (alignItems != 3 && alignItems != 4) {
                        return;
                    }
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int measuredWidth = (((i5 - view.getMeasuredWidth()) + marginLayoutParams.getMarginStart()) - marginLayoutParams.getMarginEnd()) / 2;
                    if (!z) {
                        view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
                        return;
                    } else {
                        view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
                        return;
                    }
                }
            } else if (!z) {
                view.layout(((i + i5) - view.getMeasuredWidth()) - flexItem.getMarginRight(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.getMarginRight(), i4);
                return;
            } else {
                view.layout((i - i5) + view.getMeasuredWidth() + flexItem.getMarginLeft(), i2, (i3 - i5) + view.getMeasuredWidth() + flexItem.getMarginLeft(), i4);
                return;
            }
        }
        if (!z) {
            view.layout(i + flexItem.getMarginLeft(), i2, i3 + flexItem.getMarginLeft(), i4);
        } else {
            view.layout(i - flexItem.getMarginRight(), i2, i3 - flexItem.getMarginRight(), i4);
        }
    }
}
