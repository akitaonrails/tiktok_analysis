package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.ss.android.ugc.aweme.audiorecord.Point;
import com.zhiliaoapp.musically.R;
import java.util.Stack;

/* JADX INFO: renamed from: X.12UB, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12UB extends View {
    public final Stack<Point> LL;
    public final Paint LLILLJJLI;
    public int LLILLL;
    public float LLILZ;

    public final int getMMax() {
        return this.LLILLL;
    }

    public final Stack<Point> getMStack() {
        return this.LL;
    }

    public final float getPadding() {
        return this.LLILZ;
    }

    public C12UB(C19EG c19eg) {
        super(c19eg);
        this.LL = new Stack<>();
        this.LLILLJJLI = new Paint();
        this.LLILLL = 1;
        this.LLILZ = 1.0f;
        setBackgroundResource(R.drawable.alv);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (Point point : this.LL) {
            float x = (float) ((((double) point.getX()) / ((double) this.LLILLL)) * ((double) getWidth()));
            float y = (float) ((((double) point.getY()) / ((double) this.LLILLL)) * ((double) getWidth()));
            if (canvas != null) {
                canvas.drawRect(x, 0.0f, y, getHeight(), this.LLILLJJLI);
            }
        }
    }

    public final void setMMax(int i) {
        this.LLILLL = i;
    }

    public final void setPadding(float f) {
        this.LLILZ = f;
    }
}
