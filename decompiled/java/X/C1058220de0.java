package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0de0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1058220de0 extends C0DXR {
    public static final /* synthetic */ int LLILZ = 0;
    public final int LL;
    public final float LLILLJJLI;
    public final Paint LLILLL;

    public C1058220de0(int i, int i2, float f) {
        this.LL = i2;
        this.LLILLJJLI = f;
        Paint paint = new Paint();
        this.LLILLL = paint;
        paint.setColor(i);
    }

    @Override // X.C0DXR
    public final void LIZJ(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        Iterator it2 = new C1077420e8y(recyclerView, 33).iterator();
        while (true) {
            C1077410e8x c1077410e8x = (C1077410e8x) it2;
            if (c1077410e8x.hasNext()) {
                View view = (View) c1077410e8x.next();
                if (view.getTag(R.id.egk) != null) {
                    int left = view.getLeft();
                    int right = view.getRight();
                    int bottom = view.getBottom();
                    int bottom2 = view.getBottom() + this.LL;
                    float f = this.LLILLJJLI;
                    canvas.drawRect(left + f, bottom, right - f, bottom2, this.LLILLL);
                }
            } else {
                return;
            }
        }
    }

    public C1058220de0(int i, int i2, float f, int i3) {
        this(i, (i3 & 2) != 0 ? 1 : i2, (i3 & 4) != 0 ? C958103op.LIZJ : f);
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        if (view.getTag(R.id.egk) != null) {
            rect.set(0, 0, 0, this.LL);
        }
    }
}
