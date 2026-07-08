package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DSk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C339440DSk extends C0DXR {
    public final float LL = 0.5f;
    public final int LLILLJJLI = R.attr.a03;

    @Override // X.C0DXR
    public final void LIZJ(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return;
        }
        float f = recyclerView.getResources().getDisplayMetrics().density;
        int i = (int) (16 * f);
        float f2 = this.LL * f;
        Paint paint = new Paint(1);
        Integer numLIZJ = C1308910kAL.LIZJ(this.LLILLJJLI, recyclerView.getContext());
        if (numLIZJ != null) {
            paint.setColor(numLIZJ.intValue());
        }
        paint.setStrokeWidth(f2);
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            if (childAdapterPosition != -1 && childAdapterPosition < adapter.getItemCount() - 1) {
                float bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).bottomMargin + childAt.getTranslationY() + 0.5f;
                float f3 = i;
                canvas.drawLine(childAt.getLeft() + f3, bottom, childAt.getRight() - f3, bottom, paint);
            }
        }
    }
}
