package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0GTs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C416220GTs extends View {
    public int LL;
    public boolean LLILLJJLI;
    public final C01GW LLILLL;

    private final Paint getPaint() {
        return (Paint) this.LLILLL.getValue();
    }

    public final int getColor() {
        return this.LL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        getPaint().setColor(this.LL);
        getPaint().setStyle(Paint.Style.FILL);
        float fLIZIZ = (int) C497740JfY.LIZIZ(2.0f);
        float width = getWidth() / 2;
        canvas.drawCircle(width, width, width - fLIZIZ, getPaint());
        if (this.LLILLJJLI) {
            getPaint().setColor(C497740JfY.LJFF(R.color.a4x));
            getPaint().setStyle(Paint.Style.STROKE);
            getPaint().setStrokeWidth(fLIZIZ);
            canvas.drawCircle(width, width, width - (fLIZIZ / 2), getPaint());
        }
    }

    public final void setColor(int i) {
        this.LL = i;
        invalidate();
    }

    public C416220GTs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = -1;
        this.LLILLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(19));
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.DrawGuessPenColorView, 0, 0);
        try {
            this.LL = typedArrayObtainStyledAttributes.getInteger(R$styleable.DrawGuessPenColorView_color, -1);
            this.LLILLJJLI = typedArrayObtainStyledAttributes.getBoolean(R$styleable.DrawGuessPenColorView_is_current_color, false);
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
