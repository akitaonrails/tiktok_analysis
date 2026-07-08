package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EaE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C367040EaE extends ConstraintLayout {
    public final Paint LL;
    public final Paint LLILLJJLI;
    public final Rect LLILLL;
    public final Rect LLILZ;
    public final C01GW LLILZIL;

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRect(this.LLILZ, this.LLILLJJLI);
        super.dispatchDraw(canvas);
        canvas.drawRect(this.LLILLL, this.LL);
    }

    public C367040EaE(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C367040EaE(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.LL = paint;
        Paint paint2 = new Paint();
        this.LLILLJJLI = paint2;
        this.LLILLL = new Rect(0, 0, 0, 0);
        this.LLILZ = new Rect(0, 0, 0, 0);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.bzn, this, true);
        LinearGradient linearGradient = new LinearGradient(C0FU0.LIZJ(context) / 2.0f, 0.0f, C0FU0.LIZJ(context) / 2.0f, C0FU0.LIZIZ(context).y / 2.0f, C960203pA.LIZ(R.attr.a1a, context), C960203pA.LIZ(R.attr.oh, context), Shader.TileMode.CLAMP);
        this.LLILZIL = C452501pT.LIZIZ(new AwS549S0100000_5(context, 759));
        viewTd.findViewById(R.id.jd_);
        setLayerType(1, null);
        paint.setAntiAlias(true);
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint2.setAntiAlias(true);
        paint2.setShader(linearGradient);
    }
}
