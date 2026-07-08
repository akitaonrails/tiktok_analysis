package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Eaf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C367310Eaf extends View {
    public final ArrayList<Pair<Object, Integer>> LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public final Paint LLILZIL;
    public final Paint LLILZLL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.LLILLJJLI != -1) {
            for (Pair<Object, Integer> pair : this.LL) {
                int iLIZIZ = this.LLILLJJLI - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(pair.getSecond()));
                if (iLIZIZ > 0) {
                    if (pair.getFirst() instanceof Integer) {
                        this.LLILZIL.setColor(((Integer) pair.getFirst()).intValue());
                        if (canvas != null) {
                            canvas.drawCircle(this.LLILLL, this.LLILZ, iLIZIZ, this.LLILZIL);
                        }
                    }
                    if (pair.getFirst() instanceof LinearGradient) {
                        this.LLILZLL.setShader((Shader) pair.getFirst());
                        if (canvas != null) {
                            canvas.drawCircle(this.LLILLL, this.LLILZ, iLIZIZ, this.LLILZLL);
                        }
                    }
                }
            }
        }
    }

    public C367310Eaf(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LIZ(int i, int i2) {
        this.LL.add(new Pair<>(Integer.valueOf(i), Integer.valueOf(i2)));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LLILLJJLI = getMeasuredHeight() / 2;
        this.LLILLL = getMeasuredWidth() / 2;
        this.LLILZ = getMeasuredHeight() / 2;
    }

    public C367310Eaf(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LL = new ArrayList<>();
        this.LLILLJJLI = -1;
        this.LLILLL = -1;
        this.LLILZ = -1;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.LLILZIL = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        this.LLILZLL = paint2;
    }
}
