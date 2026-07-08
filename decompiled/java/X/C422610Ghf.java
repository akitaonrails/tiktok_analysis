package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0Ghf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C422610Ghf extends C0DXR {
    public static final int[] LLILZ = {R.attr.listDivider};
    public Drawable LL;
    public int LLILLJJLI;
    public final Rect LLILLL = new Rect();

    public final void LJ(Drawable drawable) {
        if (drawable != null) {
            this.LL = drawable;
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }

    public C422610Ghf(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(LLILZ);
        this.LL = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.LLILLJJLI = i;
    }

    @Override // X.C0DXR
    public final void LIZJ(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int height;
        int paddingTop;
        int width;
        int paddingLeft;
        if (recyclerView.getLayoutManager() != null && this.LL != null) {
            int i = 0;
            if (this.LLILLJJLI == 1) {
                canvas.save();
                if (recyclerView.getClipToPadding()) {
                    paddingLeft = recyclerView.getPaddingLeft();
                    width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                } else {
                    width = recyclerView.getWidth();
                    paddingLeft = 0;
                }
                int childCount = recyclerView.getChildCount();
                while (i < childCount) {
                    View childAt = recyclerView.getChildAt(i);
                    recyclerView.getDecoratedBoundsWithMargins(childAt, this.LLILLL);
                    int iRound = this.LLILLL.bottom + Math.round(childAt.getTranslationY());
                    this.LL.setBounds(paddingLeft, iRound - this.LL.getIntrinsicHeight(), width, iRound);
                    this.LL.draw(canvas);
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
            int childCount2 = recyclerView.getChildCount();
            while (i < childCount2) {
                View childAt2 = recyclerView.getChildAt(i);
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt2, this.LLILLL);
                int iRound2 = this.LLILLL.right + Math.round(childAt2.getTranslationX());
                this.LL.setBounds(iRound2 - this.LL.getIntrinsicWidth(), paddingTop, iRound2, height);
                this.LL.draw(canvas);
                i++;
            }
            canvas.restore();
        }
    }

    @Override // X.C0DXR
    public void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        Drawable drawable = this.LL;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.LLILLJJLI == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }
}
