package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0EaK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C367100EaK extends C0DXR {
    public TuxIconDrawable LLILZIL;
    public int LL = -1;
    public final Paint LLILLJJLI = new Paint();
    public final String LLILLL = C555520LqY.LIZIZ(2131835505);
    public final Rect LLILZ = new Rect();
    public final float LLILZLL = 1.0f;

    public final void LJ(int i, Context context) {
        this.LL = i;
        this.LLILLJJLI.setColor(-9276814);
        this.LLILLJJLI.setTextSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZ = R.raw.icon_arrow_triangle_right_fill_ltr;
        c419910GdJ.LIZLLL = -9276814;
        this.LLILZIL = c419910GdJ.LIZ(context);
    }

    @Override // X.C0DXR
    public final void LIZLLL(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        LinearLayoutManager linearLayoutManager;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null || linearLayoutManager.findFirstVisibleItemPosition() == -1) {
            return;
        }
        int i = this.LL;
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            if (recyclerView.getChildAdapterPosition(childAt) == i) {
                if (childAt != null) {
                    float left = childAt.getLeft() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
                    float paddingTop = recyclerView.getPaddingTop() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
                    float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    float f = this.LLILZLL * 255.0f;
                    Paint paint = this.LLILLJJLI;
                    String str = this.LLILLL;
                    paint.getTextBounds(str, 0, str.length(), this.LLILZ);
                    Rect rect = this.LLILZ;
                    int i3 = (int) f;
                    this.LLILLJJLI.setAlpha(i3);
                    canvas.drawText(this.LLILLL, left, (((fLIZIZ + paddingTop) + paddingTop) / 2) - ((rect.top + rect.bottom) / 2), this.LLILLJJLI);
                    float fMeasureText = this.LLILLJJLI.measureText(this.LLILLL);
                    TuxIconDrawable tuxIconDrawable = this.LLILZIL;
                    if (tuxIconDrawable != null) {
                        tuxIconDrawable.setAlpha(i3);
                        float f2 = left + fMeasureText;
                        float fLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                        tuxIconDrawable.setBounds((int) f2, (int) paddingTop, (int) (f2 + fLIZIZ2), (int) (paddingTop + fLIZIZ2));
                        tuxIconDrawable.draw(canvas);
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }
}
