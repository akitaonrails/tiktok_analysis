package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0P2H, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public class C0P2H extends C0DXR {
    public static final int[] LLILLL = {R.attr.listDivider};
    public Drawable LL;
    public int LLILLJJLI;

    public C0P2H(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(LLILLL);
        this.LL = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        this.LLILLJJLI = 3;
    }

    public final void LJ(Drawable drawable) {
        if (drawable != null) {
            this.LL = drawable;
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }

    @Override // X.C0DXR
    public final void LIZJ(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        boolean z;
        int left;
        int intrinsicWidth;
        int iMax;
        int bottom;
        int i;
        int iMin;
        int top;
        int intrinsicHeight;
        int left2;
        int right;
        int i2;
        int iMin2;
        if ((this.LLILLJJLI & 1) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
            int i3 = flexboxLayoutManager.LL;
            int left3 = recyclerView.getLeft() - recyclerView.getPaddingLeft();
            int right2 = recyclerView.getRight() + recyclerView.getPaddingRight();
            int childCount = recyclerView.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = recyclerView.getChildAt(i4);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                if (i3 == 3) {
                    intrinsicHeight = childAt.getBottom() + marginLayoutParams.bottomMargin;
                    top = this.LL.getIntrinsicHeight() + intrinsicHeight;
                } else {
                    top = childAt.getTop() - marginLayoutParams.topMargin;
                    intrinsicHeight = top - this.LL.getIntrinsicHeight();
                }
                if (flexboxLayoutManager.LJIIJJI()) {
                    if (flexboxLayoutManager.LLILZLL) {
                        iMin2 = Math.min(childAt.getRight() + marginLayoutParams.rightMargin + this.LL.getIntrinsicWidth(), right2);
                        left2 = childAt.getLeft() - marginLayoutParams.leftMargin;
                        this.LL.setBounds(left2, intrinsicHeight, iMin2, top);
                        this.LL.draw(canvas);
                    } else {
                        left2 = Math.max((childAt.getLeft() - marginLayoutParams.leftMargin) - this.LL.getIntrinsicWidth(), left3);
                        right = childAt.getRight();
                        i2 = marginLayoutParams.rightMargin;
                    }
                } else {
                    left2 = childAt.getLeft() - marginLayoutParams.leftMargin;
                    right = childAt.getRight();
                    i2 = marginLayoutParams.rightMargin;
                }
                iMin2 = right + i2;
                this.LL.setBounds(left2, intrinsicHeight, iMin2, top);
                this.LL.draw(canvas);
            }
        }
        if ((this.LLILLJJLI & 2) > 0) {
            FlexboxLayoutManager flexboxLayoutManager2 = (FlexboxLayoutManager) recyclerView.getLayoutManager();
            int top2 = recyclerView.getTop() - recyclerView.getPaddingTop();
            int bottom2 = recyclerView.getBottom() + recyclerView.getPaddingBottom();
            int childCount2 = recyclerView.getChildCount();
            int i5 = flexboxLayoutManager2.LL;
            for (int i6 = 0; i6 < childCount2; i6++) {
                View childAt2 = recyclerView.getChildAt(i6);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) childAt2.getLayoutParams();
                if (flexboxLayoutManager2.LLILZLL) {
                    intrinsicWidth = childAt2.getRight() + marginLayoutParams2.rightMargin;
                    left = this.LL.getIntrinsicWidth() + intrinsicWidth;
                } else {
                    left = childAt2.getLeft() - marginLayoutParams2.leftMargin;
                    intrinsicWidth = left - this.LL.getIntrinsicWidth();
                }
                if (flexboxLayoutManager2.LJIIJJI()) {
                    iMax = childAt2.getTop() - marginLayoutParams2.topMargin;
                    bottom = childAt2.getBottom();
                    i = marginLayoutParams2.bottomMargin;
                } else if (i5 == 3) {
                    iMin = Math.min(childAt2.getBottom() + marginLayoutParams2.bottomMargin + this.LL.getIntrinsicHeight(), bottom2);
                    iMax = childAt2.getTop() - marginLayoutParams2.topMargin;
                    this.LL.setBounds(intrinsicWidth, iMax, left, iMin);
                    this.LL.draw(canvas);
                } else {
                    iMax = Math.max((childAt2.getTop() - marginLayoutParams2.topMargin) - this.LL.getIntrinsicHeight(), top2);
                    bottom = childAt2.getBottom();
                    i = marginLayoutParams2.bottomMargin;
                }
                iMin = bottom + i;
                this.LL.setBounds(intrinsicWidth, iMax, left, iMin);
                this.LL.draw(canvas);
            }
        }
    }

    @Override // X.C0DXR
    public void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            return;
        }
        int i = this.LLILLJJLI;
        if ((i & 1) <= 0 && (i & 2) <= 0) {
            rect.set(0, 0, 0, 0);
            return;
        }
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
        flexboxLayoutManager.getClass();
        ArrayList arrayList = new ArrayList(flexboxLayoutManager.LLIZLLLIL.size());
        int size = flexboxLayoutManager.LLIZLLLIL.size();
        for (int i2 = 0; i2 < size; i2++) {
            C21532719Or c21532719Or = (C21532719Or) ListProtector.get(flexboxLayoutManager.LLIZLLLIL, i2);
            if (c21532719Or.LJII != 0) {
                arrayList.add(c21532719Or);
            }
        }
        int i3 = flexboxLayoutManager.LL;
        int i4 = flexboxLayoutManager.LLJ.LIZJ[childAdapterPosition];
        if ((i4 == -1 || i4 >= flexboxLayoutManager.LLIZLLLIL.size() || ((C21532719Or) ListProtector.get(flexboxLayoutManager.LLIZLLLIL, i4)).LJIILJJIL != childAdapterPosition) && (arrayList.size() == 0 || ((C21532719Or) ListProtector.get(arrayList, arrayList.size() - 1)).LJIILL != childAdapterPosition - 1)) {
            if (flexboxLayoutManager.LJIIJJI()) {
                if ((this.LLILLJJLI & 2) > 0) {
                    if (flexboxLayoutManager.LLILZLL) {
                        rect.right = this.LL.getIntrinsicWidth();
                        rect.left = 0;
                    } else {
                        rect.left = this.LL.getIntrinsicWidth();
                        rect.right = 0;
                    }
                } else {
                    rect.left = 0;
                    rect.right = 0;
                }
            } else if ((this.LLILLJJLI & 1) > 0) {
                if (i3 == 3) {
                    rect.bottom = this.LL.getIntrinsicHeight();
                    rect.top = 0;
                } else {
                    rect.top = this.LL.getIntrinsicHeight();
                    rect.bottom = 0;
                }
            } else {
                rect.top = 0;
                rect.bottom = 0;
            }
        }
        if (arrayList.size() != 0 && flexboxLayoutManager.LLJ.LIZJ[childAdapterPosition] != 0) {
            if (flexboxLayoutManager.LJIIJJI()) {
                if ((this.LLILLJJLI & 1) > 0) {
                    rect.top = this.LL.getIntrinsicHeight();
                    rect.bottom = 0;
                    return;
                } else {
                    rect.top = 0;
                    rect.bottom = 0;
                    return;
                }
            }
            if ((this.LLILLJJLI & 2) <= 0) {
                return;
            }
            if (flexboxLayoutManager.LLILZLL) {
                rect.right = this.LL.getIntrinsicWidth();
                rect.left = 0;
            } else {
                rect.left = this.LL.getIntrinsicWidth();
                rect.right = 0;
            }
        }
    }
}
