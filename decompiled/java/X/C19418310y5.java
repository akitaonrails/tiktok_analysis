package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.10y5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19418310y5 extends View {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public final C01GW LLILZLL;

    private final Paint getPaint() {
        return (Paint) this.LLILZLL.getValue();
    }

    public final int getColor() {
        return this.LLILZIL;
    }

    public final int getMax() {
        return this.LLILLJJLI;
    }

    public final int getMin() {
        return this.LL;
    }

    public final int getProgress() {
        return this.LLILLL;
    }

    public C19418310y5(Context context) {
        super(context, null, 0);
        this.LLILLJJLI = 100;
        this.LLILLL = this.LL;
        this.LLILZ = getLayoutDirection() == 1;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.eh, context);
        this.LLILZIL = numLIZJ != null ? numLIZJ.intValue() : 0;
        this.LLILZLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1105));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.LLILZ) {
            canvas.drawRect(getWidth() - (getWidth() * (this.LLILLL / (this.LLILLJJLI - this.LL))), 0.0f, getWidth(), getHeight(), getPaint());
        } else {
            canvas.drawRect(0.0f, 0.0f, getWidth() * (this.LLILLL / (this.LLILLJJLI - this.LL)), getHeight(), getPaint());
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.LLILZ = z;
    }

    public final void setColor(int i) {
        this.LLILZIL = i;
        getPaint().setColor(i);
        postInvalidate();
    }

    public final void setMax(int i) {
        this.LLILLJJLI = i;
        postInvalidate();
    }

    public final void setMin(int i) {
        this.LL = i;
        postInvalidate();
    }

    public final void setProgress(int i) {
        this.LLILLL = i;
        postInvalidate();
    }
}
