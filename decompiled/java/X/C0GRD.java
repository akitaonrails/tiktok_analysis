package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0GRD, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GRD extends View {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final int LLIZ;

    private final Paint getFillPaint() {
        return (Paint) this.LLILLJJLI.getValue();
    }

    private final float getInRadius() {
        return ((Number) this.LLILZIL.getValue()).floatValue();
    }

    private final Paint getMainPaint() {
        return (Paint) this.LL.getValue();
    }

    private final float getOutRadius() {
        return ((Number) this.LLILZ.getValue()).floatValue();
    }

    private final Path getPath() {
        return (Path) this.LLILLL.getValue();
    }

    private final Paint getTrianglePaint() {
        return (Paint) this.LLILZLL.getValue();
    }

    public C0GRD(Context context) {
        super(context);
        this.LL = C452501pT.LIZIZ(new AwS550S0100000_6(context, 1539));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS550S0100000_6(context, 1538));
        this.LLILLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(574));
        this.LLILZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(573));
        this.LLILZIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(572));
        this.LLILZLL = C452501pT.LIZIZ(new AwS550S0100000_6(context, 1540));
        setWillNotDraw(false);
        this.LLIZ = 1;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = 2;
        float width = getWidth() / f;
        float height = getHeight() / f;
        canvas.drawCircle(width, width, width, getMainPaint());
        canvas.drawCircle(width, width, getWidth() / 3, getFillPaint());
        getPath().reset();
        if (this.LLIZ == 0) {
            getPath().moveTo(width, height - getOutRadius());
            getPath().lineTo(width - getOutRadius(), getInRadius() + height);
            getPath().lineTo(width + getOutRadius(), height + getInRadius());
        } else {
            getPath().moveTo(width, getOutRadius() + height);
            getPath().lineTo(width - getOutRadius(), height - getInRadius());
            getPath().lineTo(width + getOutRadius(), height - getInRadius());
        }
        getPath().close();
        canvas.drawPath(getPath(), getTrianglePaint());
    }
}
