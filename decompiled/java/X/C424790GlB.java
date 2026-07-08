package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GlB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C424790GlB extends C0DXR {
    public static final int LLILZIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
    public static final int LLILZLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9));
    public static final int LLIZ = R.attr.a02;
    public int LL = 0;
    public boolean LLILLJJLI = false;
    public Integer LLILLL = null;
    public Paint LLILZ;

    @Override // X.C0DXR
    public final void LIZLLL(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int childCount;
        Paint paint;
        boolean z = this.LLILLJJLI;
        if (this.LLILZ == null) {
            Integer num = this.LLILLL;
            if (num != null) {
                int iIntValue = num.intValue();
                paint = new Paint(1);
                paint.setColor(iIntValue);
            } else {
                paint = null;
            }
            this.LLILZ = paint;
        }
        Paint paint2 = this.LLILZ;
        if (!z || paint2 == null || (childCount = recyclerView.getChildCount()) == 0) {
            return;
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            AbstractC21673619ry adapter = recyclerView.getAdapter();
            if (adapter == null || childAdapterPosition != adapter.getItemCount() - 1) {
                float right = childAt.getRight();
                int i2 = this.LL;
                int i3 = LLILZIL;
                float f = right + ((i2 - i3) / 2);
                float top = childAt.getTop();
                int height = childAt.getHeight();
                float f2 = top + ((height - r1) / 2);
                canvas.drawRect(f, f2, f + i3, f2 + LLILZLL, paint2);
            }
        }
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition != -1 && childAdapterPosition > 0) {
            rect.left = this.LL;
        }
    }
}
