package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0Ghb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C422570Ghb extends C0DXR {
    public final int LL;
    public final int LLILLJJLI;
    public final Drawable LLILZ;
    public final int LLILLL = 1;
    public final Rect LLILZLL = new Rect();
    public int LLILZIL = 1;

    public C422570Ghb(int i, int i2, int i3) {
        this.LL = i2;
        this.LLILLJJLI = i3;
        this.LLILZ = new ColorDrawable(i);
    }

    @Override // X.C0DXR
    public final void LIZJ(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int height;
        int paddingTop;
        int width;
        int paddingLeft;
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        int i = 0;
        if (this.LLILZIL == 1) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                paddingLeft = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                paddingLeft = 0;
            }
            int childCount = recyclerView.getChildCount() - 1;
            while (i < childCount) {
                View childAt = recyclerView.getChildAt(i);
                recyclerView.getDecoratedBoundsWithMargins(childAt, this.LLILZLL);
                int iRound = this.LLILZLL.bottom + Math.round(childAt.getTranslationY());
                this.LLILZ.setBounds(this.LL + paddingLeft, iRound - this.LLILLL, width - this.LLILLJJLI, iRound);
                this.LLILZ.draw(canvas);
                i++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int childCount2 = recyclerView.getChildCount() - 1;
        while (i < childCount2) {
            View childAt2 = recyclerView.getChildAt(i);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.getDecoratedBoundsWithMargins(childAt2, this.LLILZLL);
            }
            int iRound2 = this.LLILZLL.right + Math.round(childAt2.getTranslationX());
            this.LLILZ.setBounds(iRound2 - this.LLILZ.getIntrinsicWidth(), paddingTop, iRound2, height);
            this.LLILZ.draw(canvas);
            i++;
        }
        canvas.restore();
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        if (this.LLILZIL == 1) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(0, 0, this.LLILLL, 0);
        }
    }
}
