package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0EYy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C366620EYy extends C0DXR {
    public final Paint LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ = -1;

    public C366620EYy(int i, int i2, int i3) {
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        Paint paint = new Paint(1);
        this.LL = paint;
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // X.C0DXR
    public final void LIZLLL(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        if (this.LLILLL == 1) {
            int measuredWidth = recyclerView.getMeasuredWidth();
            int childCount = recyclerView.getChildCount();
            int itemCount = recyclerView.getAdapter().getItemCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                if (childAdapterPosition > 0 && childAdapterPosition < itemCount - 1 && childAdapterPosition != this.LLILZ + 1) {
                    int top = childAt.getTop() + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin;
                    float f = top;
                    float f2 = top + 1;
                    canvas.drawRect(0.0f, f, 0.0f, f2, this.LL);
                    float f3 = measuredWidth;
                    canvas.drawRect(f3 - 0.0f, f, f3, f2, this.LL);
                }
            }
            return;
        }
        int measuredHeight = recyclerView.getMeasuredHeight();
        int childCount2 = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount2; i2++) {
            View childAt2 = recyclerView.getChildAt(i2);
            int childAdapterPosition2 = recyclerView.getChildAdapterPosition(childAt2);
            if (childAdapterPosition2 > 0 && childAdapterPosition2 < childCount2 - 1 && childAdapterPosition2 != this.LLILZ + 1) {
                int left = childAt2.getLeft() + ((ViewGroup.MarginLayoutParams) childAt2.getLayoutParams()).leftMargin;
                float f4 = left - this.LLILLJJLI;
                float f5 = 0;
                canvas.drawRect(f4, f5, f4, f5 + 0.0f, this.LL);
                float f6 = left;
                float f7 = measuredHeight;
                canvas.drawRect(f6, f7 - 0.0f, f6, f7, this.LL);
            }
        }
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int i;
        int i2;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (this.LLILLL == 1) {
            if (childAdapterPosition == this.LLILZ) {
                i2 = 0;
            } else {
                i2 = this.LLILLJJLI;
            }
            rect.set(0, 0, 0, i2);
            return;
        }
        if (childAdapterPosition == this.LLILZ) {
            i = 0;
        } else {
            i = this.LLILLJJLI;
        }
        rect.set(0, 0, i, 0);
    }
}
