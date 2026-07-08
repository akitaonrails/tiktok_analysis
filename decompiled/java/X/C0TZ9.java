package X;

import Y.ACListenerS116S0200000_12;
import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWord;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TZ9, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TZ9 extends ViewGroup {
    public final View LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final List<List<View>> LLILZ;
    public final ArrayList<Integer> LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public int LLJ;
    public final boolean LLJI;
    public int LLJIJIL;
    public Function1<? super BlockWord, Unit> LLJILJIL;

    public final int getSize() {
        return getChildCount() - 1;
    }

    public final int getMaxLinesInFoldStatus() {
        return this.LLJIJIL;
    }

    public final void setDeleteListener(Function1<? super BlockWord, Unit> function1) {
        this.LLJILJIL = function1;
    }

    public final void setMaxLinesInFoldStatus(int i) {
        this.LLJIJIL = i;
    }

    public C0TZ9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View viewLJIILL = C500260Jjc.LJIILL(R.layout.g0l, this, false);
        this.LL = viewLJIILL;
        C439101nJ.LJ(R.drawable.ete, (ImageView) viewLJIILL.findViewById(R.id.jxe));
        C786410Ut5.I7(new ACListenerS147S0100000_12((Object) this, 44), viewLJIILL);
        addView(viewLJIILL);
        this.LLILLJJLI = (int) C497740JfY.LIZIZ(8.0f);
        this.LLILLL = (int) C497740JfY.LIZIZ(8.0f);
        this.LLILZ = new ArrayList();
        this.LLILZIL = new ArrayList<>();
        this.LLILZLL = true;
        this.LLJI = C497740JfY.LJJ();
        this.LLJIJIL = 1;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = 8;
        if (this.LLJIJIL == 1) {
            ((ArrayList) this.LLILZ).clear();
            this.LLILZIL.clear();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            ArrayList arrayList = new ArrayList();
            this.LLIZ = false;
            int childCount = getChildCount();
            int i4 = 0;
            int iMax = 0;
            int i5 = 0;
            int iMax2 = 0;
            int i6 = 0;
            while (true) {
                if (i4 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i4);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (childAt.getVisibility() != i3) {
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, paddingLeft + paddingRight, layoutParams.width), ViewGroup.getChildMeasureSpec(i2, paddingTop + paddingBottom, layoutParams.height));
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (this.LLILZLL) {
                        if (this.LLIZ) {
                            break;
                        }
                        if (measuredWidth + i5 + this.LLILLJJLI > size) {
                            this.LLIZ = true;
                            int measuredWidth2 = 0;
                            int iMax3 = Math.max(i4 - 1, 0);
                            while (true) {
                                if (-1 >= iMax3) {
                                    break;
                                }
                                measuredWidth2 += getChildAt(iMax3).getMeasuredWidth() + this.LLILLJJLI;
                                if (measuredWidth2 > ((int) C497740JfY.LIZIZ(31.0f)) + this.LLILLJJLI) {
                                    this.LLJ = iMax3;
                                    ((ArrayList) this.LLILZ).add(arrayList);
                                    break;
                                }
                                iMax3--;
                            }
                            i6 += iMax2 + this.LLILLL;
                        }
                    }
                    if (measuredWidth + i5 + this.LLILLJJLI > size) {
                        ((ArrayList) this.LLILZ).add(arrayList);
                        this.LLILZIL.add(Integer.valueOf(iMax2));
                        i6 += iMax2 + this.LLILLL;
                        iMax = Math.max(iMax, i5 + this.LLILLJJLI);
                        arrayList = new ArrayList();
                        iMax2 = 0;
                        i5 = 0;
                    }
                    if (!this.LLILZLL || !Intrinsics.LJFF(childAt, this.LL)) {
                        arrayList.add(childAt);
                    }
                    i5 += measuredWidth + this.LLILLJJLI;
                    iMax2 = Math.max(iMax2, measuredHeight);
                    if (i4 == getChildCount() - 1) {
                        ((ArrayList) this.LLILZ).add(arrayList);
                        this.LLILZIL.add(Integer.valueOf(iMax2));
                        i6 += this.LLILLL + iMax2;
                        iMax = Math.max(iMax, this.LLILLJJLI + i5);
                    }
                }
                i4++;
                i3 = 8;
            }
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode != 1073741824) {
                size = iMax;
            }
            if (mode2 != 1073741824) {
                size2 = i6;
            }
            int iMax4 = Math.max(size2, 102);
            if (getChildCount() == 1 && Intrinsics.LJFF(getChildAt(0), this.LL)) {
                iMax4 = 0;
            }
            setMeasuredDimension(size, iMax4);
            return;
        }
        ((ArrayList) this.LLILZ).clear();
        this.LLILZIL.clear();
        int paddingLeft2 = getPaddingLeft();
        int paddingRight2 = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom2 = getPaddingBottom();
        int size3 = View.MeasureSpec.getSize(i);
        int size4 = View.MeasureSpec.getSize(i2);
        ArrayList arrayList2 = new ArrayList();
        this.LLIZ = false;
        int childCount2 = getChildCount();
        int i7 = 0;
        int iMax5 = 0;
        int i8 = 0;
        int iMax6 = 0;
        int i9 = 0;
        while (true) {
            if (i7 >= childCount2) {
                break;
            }
            View childAt2 = getChildAt(i7);
            ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(ViewGroup.getChildMeasureSpec(i, paddingLeft2 + paddingRight2, layoutParams2.width), ViewGroup.getChildMeasureSpec(i2, paddingTop2 + paddingBottom2, layoutParams2.height));
                int measuredWidth3 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                if (this.LLILZLL && this.LLIZ) {
                    break;
                }
                if (measuredWidth3 + i8 + this.LLILLJJLI > size3) {
                    ((ArrayList) this.LLILZ).add(arrayList2);
                    this.LLILZIL.add(Integer.valueOf(iMax6));
                    i9 += iMax6 + this.LLILLL;
                    iMax5 = Math.max(iMax5, i8 + this.LLILLJJLI);
                    arrayList2 = new ArrayList();
                    if (this.LLILZLL && ((ArrayList) this.LLILZ).size() >= this.LLJIJIL && !Intrinsics.LJFF(childAt2, this.LL)) {
                        int i10 = i7 - 1;
                        int measuredWidth4 = 0;
                        int iMax7 = Math.max(i10, 0);
                        while (true) {
                            if (-1 >= iMax7) {
                                break;
                            }
                            measuredWidth4 += getChildAt(iMax7).getMeasuredWidth() + this.LLILLJJLI;
                            if (measuredWidth4 > ((int) C497740JfY.LIZIZ(31.0f)) + this.LLILLJJLI) {
                                this.LLJ = iMax7;
                                break;
                            }
                            iMax7--;
                        }
                        this.LLIZ = true;
                    } else {
                        i8 = 0;
                        iMax6 = 0;
                    }
                }
                if (!this.LLILZLL || !Intrinsics.LJFF(childAt2, this.LL)) {
                    arrayList2.add(childAt2);
                }
                i8 += measuredWidth3 + this.LLILLJJLI;
                iMax6 = Math.max(iMax6, measuredHeight2);
                if (i7 == getChildCount() - 1) {
                    ((ArrayList) this.LLILZ).add(arrayList2);
                    this.LLILZIL.add(Integer.valueOf(iMax6));
                    i9 += this.LLILLL + iMax6;
                    iMax5 = Math.max(iMax5, this.LLILLJJLI + i8);
                }
            }
            i7++;
        }
        int mode3 = View.MeasureSpec.getMode(i);
        int mode4 = View.MeasureSpec.getMode(i2);
        if (mode3 != 1073741824) {
            size3 = iMax5;
        }
        if (mode4 != 1073741824) {
            size4 = i9;
        }
        int iMax8 = Math.max(size4, 102);
        if (getChildCount() == 1 && Intrinsics.LJFF(getChildAt(0), this.LL)) {
            iMax8 = 0;
        }
        setMeasuredDimension(size3, iMax8);
    }

    public final void LIZ(BlockWord blockWord, View view, int i) {
        this.LLIZLLLIL = false;
        C786410Ut5.R7((LinearLayout) view.findViewById(R.id.c42), new ACListenerS116S0200000_12(this, blockWord, 9));
        ((TextView) view.findViewById(R.id.c41)).setText(blockWord.content);
        addView(view, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.LLILZLL && this.LLIZ) {
            if (this.LLJIJIL == 1) {
                if (this.LLJI) {
                    int measuredWidth = getMeasuredWidth() - getPaddingRight();
                    int paddingTop = getPaddingTop();
                    if (getChildCount() != 1) {
                        int childCount = getChildCount();
                        for (int i5 = 0; i5 < childCount; i5++) {
                            View childAt = getChildAt(i5);
                            if (i5 < this.LLJ) {
                                int measuredWidth2 = measuredWidth - childAt.getMeasuredWidth();
                                childAt.layout(measuredWidth2, paddingTop, measuredWidth, childAt.getMeasuredHeight() + paddingTop);
                                measuredWidth = measuredWidth2 - this.LLILLJJLI;
                            } else if (!Intrinsics.LJFF(childAt, this.LL)) {
                                childAt.layout(0, 0, 0, 0);
                            }
                        }
                        if (this.LLJ == getChildCount() - 1 && this.LLJ != 0) {
                            this.LL.layout(0, 0, 0, 0);
                            return;
                        }
                        this.LL.layout(measuredWidth - this.LL.getMeasuredWidth(), paddingTop, measuredWidth, this.LL.getMeasuredHeight() + paddingTop);
                        return;
                    }
                    return;
                }
                int paddingLeft = getPaddingLeft();
                int paddingTop2 = getPaddingTop();
                if (getChildCount() != 1) {
                    int childCount2 = getChildCount();
                    for (int i6 = 0; i6 < childCount2; i6++) {
                        View childAt2 = getChildAt(i6);
                        if (i6 < this.LLJ) {
                            int measuredWidth3 = childAt2.getMeasuredWidth() + paddingLeft;
                            childAt2.layout(paddingLeft, paddingTop2, measuredWidth3, childAt2.getMeasuredHeight() + paddingTop2);
                            paddingLeft = measuredWidth3 + this.LLILLJJLI;
                        } else if (!Intrinsics.LJFF(childAt2, this.LL)) {
                            childAt2.layout(0, 0, 0, 0);
                        }
                    }
                    if (this.LLJ == getChildCount() - 1 && this.LLJ != 0) {
                        this.LL.layout(0, 0, 0, 0);
                        return;
                    }
                    this.LL.layout(paddingLeft, paddingTop2, this.LL.getMeasuredWidth() + paddingLeft, this.LL.getMeasuredHeight() + paddingTop2);
                    return;
                }
                return;
            }
            if (this.LLJI) {
                int measuredWidth4 = getMeasuredWidth() - getPaddingRight();
                int paddingTop3 = getPaddingTop();
                if (getChildCount() != 1 && ((ArrayList) this.LLILZ).size() >= 1) {
                    int size = ((ArrayList) this.LLILZ).size();
                    int i7 = 0;
                    for (int i8 = 0; i8 < size; i8++) {
                        List<View> list = (List) ListProtector.get(this.LLILZ, i8);
                        int iIntValue = ((Number) ListProtector.get(this.LLILZIL, i8)).intValue();
                        for (View view : list) {
                            int measuredWidth5 = measuredWidth4 - view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight() + paddingTop3;
                            if (i7 < this.LLJ) {
                                view.layout(measuredWidth5, paddingTop3, measuredWidth4, measuredHeight);
                                measuredWidth4 = measuredWidth5 - this.LLILLJJLI;
                            } else if (!Intrinsics.LJFF(view, this.LL)) {
                                view.layout(0, 0, 0, 0);
                            }
                            i7++;
                        }
                        if (i8 != size - 1) {
                            measuredWidth4 = getMeasuredWidth() - getPaddingRight();
                            paddingTop3 += iIntValue + this.LLILLL;
                        }
                    }
                    int childCount3 = getChildCount();
                    while (i7 < childCount3) {
                        View childAt3 = getChildAt(i7);
                        if (!Intrinsics.LJFF(childAt3, this.LL)) {
                            childAt3.layout(0, 0, 0, 0);
                        }
                        i7++;
                    }
                    if (this.LLJ == getChildCount() - 1 && this.LLJ != 0) {
                        this.LL.layout(0, 0, 0, 0);
                        return;
                    }
                    this.LL.layout(measuredWidth4 - this.LL.getMeasuredWidth(), paddingTop3, measuredWidth4, this.LL.getMeasuredHeight() + paddingTop3);
                    return;
                }
                return;
            }
            int paddingLeft2 = getPaddingLeft();
            int paddingTop4 = getPaddingTop();
            if (getChildCount() != 1 && ((ArrayList) this.LLILZ).size() >= 1) {
                int size2 = ((ArrayList) this.LLILZ).size();
                int i9 = 0;
                for (int i10 = 0; i10 < size2; i10++) {
                    List<View> list2 = (List) ListProtector.get(this.LLILZ, i10);
                    int iIntValue2 = ((Number) ListProtector.get(this.LLILZIL, i10)).intValue();
                    for (View view2 : list2) {
                        int measuredWidth6 = view2.getMeasuredWidth() + paddingLeft2;
                        int measuredHeight2 = view2.getMeasuredHeight() + paddingTop4;
                        if (i9 < this.LLJ) {
                            view2.layout(paddingLeft2, paddingTop4, measuredWidth6, measuredHeight2);
                            paddingLeft2 = measuredWidth6 + this.LLILLJJLI;
                        } else if (!Intrinsics.LJFF(view2, this.LL)) {
                            view2.layout(0, 0, 0, 0);
                        }
                        i9++;
                    }
                    if (i10 != size2 - 1) {
                        paddingTop4 += iIntValue2 + this.LLILLL;
                        paddingLeft2 = getPaddingLeft();
                    }
                }
                int childCount4 = getChildCount();
                while (i9 < childCount4) {
                    View childAt4 = getChildAt(i9);
                    if (!Intrinsics.LJFF(childAt4, this.LL)) {
                        childAt4.layout(0, 0, 0, 0);
                    }
                    i9++;
                }
                if (this.LLJ == getChildCount() - 1 && this.LLJ != 0) {
                    this.LL.layout(0, 0, 0, 0);
                    return;
                }
                this.LL.layout(paddingLeft2, paddingTop4, this.LL.getMeasuredWidth() + paddingLeft2, this.LL.getMeasuredHeight() + paddingTop4);
                return;
            }
            return;
        }
        if (this.LLJI) {
            int size3 = ((ArrayList) this.LLILZ).size();
            int measuredWidth7 = getMeasuredWidth() - getPaddingRight();
            int paddingTop5 = getPaddingTop();
            for (int i11 = 0; i11 < size3; i11++) {
                List<View> list3 = (List) ListProtector.get(this.LLILZ, i11);
                int iIntValue3 = ((Number) ListProtector.get(this.LLILZIL, i11)).intValue();
                for (View view3 : list3) {
                    int measuredWidth8 = measuredWidth7 - view3.getMeasuredWidth();
                    view3.layout(measuredWidth8, paddingTop5, measuredWidth7, view3.getMeasuredHeight() + paddingTop5);
                    measuredWidth7 = measuredWidth8 - this.LLILLJJLI;
                }
                paddingTop5 += iIntValue3 + this.LLILLL;
                measuredWidth7 = getMeasuredWidth() - getPaddingRight();
            }
            if (size3 <= this.LLJIJIL && this.LLIZLLLIL) {
                this.LL.layout(0, 0, 0, 0);
                return;
            }
            return;
        }
        int size4 = ((ArrayList) this.LLILZ).size();
        int paddingLeft3 = getPaddingLeft();
        int paddingTop6 = getPaddingTop();
        for (int i12 = 0; i12 < size4; i12++) {
            List<View> list4 = (List) ListProtector.get(this.LLILZ, i12);
            int iIntValue4 = ((Number) ListProtector.get(this.LLILZIL, i12)).intValue();
            for (View view4 : list4) {
                int measuredWidth9 = view4.getMeasuredWidth() + paddingLeft3;
                view4.layout(paddingLeft3, paddingTop6, measuredWidth9, view4.getMeasuredHeight() + paddingTop6);
                paddingLeft3 = this.LLILLJJLI + measuredWidth9;
            }
            paddingTop6 += iIntValue4 + this.LLILLL;
            paddingLeft3 = getPaddingLeft();
        }
        if (size4 <= this.LLJIJIL && this.LLIZLLLIL) {
            this.LL.layout(0, 0, 0, 0);
        }
    }
}
