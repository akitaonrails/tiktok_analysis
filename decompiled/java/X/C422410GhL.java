package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GhL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C422410GhL extends C0DXR {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final Paint LLILZ;
    public int LLILZIL;
    public int LLILZLL;

    public static C422410GhL LJ(Context context) {
        C422410GhL c422410GhL = new C422410GhL(1, 1, context.getResources().getColor(R.color.c2));
        int iLIZ = C341940Daq.LIZ(16.0d);
        int iLIZ2 = C341940Daq.LIZ(16.0d);
        c422410GhL.LLILZIL = iLIZ;
        c422410GhL.LLILZLL = iLIZ2;
        return c422410GhL;
    }

    public C422410GhL(int i, int i2, int i3) {
        Paint paint = new Paint();
        this.LLILZ = paint;
        paint.setAntiAlias(true);
        paint.setColor(i3);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i2;
    }

    @Override // X.C0DXR
    public final void LIZJ(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int i = 0;
        if (this.LL == 1) {
            int childCount = recyclerView.getChildCount();
            int paddingLeft = recyclerView.getPaddingLeft() + this.LLILZIL;
            int width = (recyclerView.getWidth() - recyclerView.getPaddingRight()) - this.LLILZLL;
            while (i < childCount) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt != null) {
                    canvas.drawRect(paddingLeft, childAt.getBottom() + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).bottomMargin, width, this.LLILLL + r1, this.LLILZ);
                    i++;
                } else {
                    return;
                }
            }
            return;
        }
        int childCount2 = recyclerView.getChildCount();
        int paddingTop = recyclerView.getPaddingTop();
        while (i < childCount2) {
            View childAt2 = recyclerView.getChildAt(i);
            if (childAt2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt2.getLayoutParams();
                int height = childAt2.getHeight() - recyclerView.getPaddingBottom();
                canvas.drawRect(childAt2.getRight() + marginLayoutParams.rightMargin, paddingTop, this.LLILLL + r1, height, this.LLILZ);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        int iLIZIZ = c21673919s1.LIZIZ();
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        if (childLayoutPosition != -1 && (layoutManager instanceof LinearLayoutManager) && !(layoutManager instanceof GridLayoutManager)) {
            if (this.LL == 1) {
                if (childLayoutPosition == iLIZIZ) {
                    rect.set(0, 0, 0, 0);
                    return;
                } else {
                    rect.set(0, 0, 0, this.LLILLJJLI);
                    return;
                }
            }
            if (childLayoutPosition == iLIZIZ) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(0, 0, this.LLILLJJLI, 0);
            }
        }
    }
}
