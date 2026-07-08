package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.ss.android.ugc.aweme.audiorecord.Point;
import com.zhiliaoapp.musically.R;
import java.util.Stack;

/* JADX INFO: renamed from: X.12Ri, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19756012Ri extends View {
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

    public C19756012Ri(Context context) {
        super(context);
        this.LL = new Stack<>();
        this.LLILLJJLI = new Paint();
        this.LLILLL = 1;
        this.LLILZ = 1.0f;
        setBackgroundResource(R.drawable.alv);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (C1388580mEq.LIZIZ(getContext())) {
            for (Point point : this.LL) {
                double d = 1;
                float x = (float) ((d - (((double) point.getX()) / ((double) this.LLILLL))) * ((double) getWidth()));
                float y = (float) ((d - (((double) point.getY()) / ((double) this.LLILLL))) * ((double) getWidth()));
                if (canvas != null) {
                    canvas.drawRect(y, 0.0f, x, getHeight(), this.LLILLJJLI);
                }
            }
            return;
        }
        for (Point point2 : this.LL) {
            float x2 = (float) ((((double) point2.getX()) / ((double) this.LLILLL)) * ((double) getWidth()));
            float y2 = (float) ((((double) point2.getY()) / ((double) this.LLILLL)) * ((double) getWidth()));
            if (canvas != null) {
                canvas.drawRect(x2, 0.0f, y2, getHeight(), this.LLILLJJLI);
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
