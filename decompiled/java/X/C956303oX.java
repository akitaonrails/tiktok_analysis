package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03oX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C956303oX extends C819503Ib {
    public final int LLILLL;
    public final int LLILZ;
    public final Function1<String, Unit> LLILZIL;
    public final Paint LLILZLL;

    @Override // X.C0DXR
    public final void LIZJ(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int childCount = recyclerView.getChildCount();
        int bottom = 0;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt.getBottom() > bottom) {
                bottom = childAt.getBottom();
            }
        }
        int i2 = childCount - 1;
        for (int i3 = 0; i3 < i2; i3++) {
            View childAt2 = recyclerView.getChildAt(i3);
            float right = childAt2.getRight() + this.LLILLL;
            float strokeWidth = right + this.LLILZLL.getStrokeWidth();
            int top = childAt2.getTop();
            int i4 = this.LLILZ;
            canvas.drawRect(right, top + i4, strokeWidth, bottom - i4, this.LLILZLL);
        }
    }

    public C956303oX(Context context, int i, int i2, Function1 function1) {
        int iIntValue;
        super(0, i);
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = function1;
        Paint paint = new Paint();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -7829368;
        }
        paint.setColor(iIntValue);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
        this.LLILZLL = paint;
    }
}
