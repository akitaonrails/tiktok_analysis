package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0GRH, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GRH extends View {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;

    private final Bitmap getAvatar() {
        return (Bitmap) this.LLILZLL.getValue();
    }

    private final Paint getAvatarBgPaint() {
        return (Paint) this.LLILLL.getValue();
    }

    private final RectF getAvatarBgRect() {
        return (RectF) this.LLILZ.getValue();
    }

    private final Paint getAvatarPaint() {
        return (Paint) this.LLILZIL.getValue();
    }

    private final RectF getAvatarRect() {
        return (RectF) this.LLIZ.getValue();
    }

    private final Paint getBgPaint() {
        return (Paint) this.LL.getValue();
    }

    private final Path getBgPath() {
        return (Path) this.LLILLJJLI.getValue();
    }

    private final Paint getDecoDownPaint() {
        return (Paint) this.LLJIJIL.getValue();
    }

    private final Paint getDecoUpPaint() {
        return (Paint) this.LLJI.getValue();
    }

    private final Bitmap getRose() {
        return (Bitmap) this.LLIZLLLIL.getValue();
    }

    private final RectF getRoseRect() {
        return (RectF) this.LLJ.getValue();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(getBgPath(), getBgPaint());
        float f = 14;
        canvas.drawRoundRect(getAvatarBgRect(), C497740JfY.LIZIZ(f), C497740JfY.LIZIZ(f), getAvatarBgPaint());
        Bitmap avatar = getAvatar();
        if (avatar != null) {
            canvas.drawBitmap(avatar, (Rect) null, getAvatarRect(), getAvatarPaint());
        }
        Bitmap rose = getRose();
        if (rose != null) {
            canvas.drawBitmap(rose, (Rect) null, getRoseRect(), (Paint) null);
        }
        float f2 = 31;
        float f3 = 51;
        float f4 = 2;
        canvas.drawRoundRect(C497740JfY.LIZIZ(f2), C497740JfY.LIZIZ(46), C497740JfY.LIZIZ(63), C497740JfY.LIZIZ(f3), C497740JfY.LIZIZ(f4), C497740JfY.LIZIZ(f4), getDecoUpPaint());
        canvas.drawRoundRect(C497740JfY.LIZIZ(f2), C497740JfY.LIZIZ(55), C497740JfY.LIZIZ(f3), C497740JfY.LIZIZ(60), C497740JfY.LIZIZ(f4), C497740JfY.LIZIZ(f4), getDecoUpPaint());
        float f5 = 3;
        canvas.drawRoundRect(C497740JfY.LIZIZ(9), C497740JfY.LIZIZ(75), C497740JfY.LIZIZ(50), C497740JfY.LIZIZ(83), C497740JfY.LIZIZ(f5), C497740JfY.LIZIZ(f5), getDecoDownPaint());
        float f6 = 90;
        float f7 = 5;
        canvas.drawCircle(C497740JfY.LIZIZ(69), C497740JfY.LIZIZ(f6), C497740JfY.LIZIZ(f7), getDecoDownPaint());
        canvas.drawCircle(C497740JfY.LIZIZ(85), C497740JfY.LIZIZ(f6), C497740JfY.LIZIZ(f7), getDecoDownPaint());
        canvas.drawCircle(C497740JfY.LIZIZ(101), C497740JfY.LIZIZ(f6), C497740JfY.LIZIZ(f7), getDecoDownPaint());
    }

    public C0GRH(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(375));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1419));
        this.LLILLL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(374));
        this.LLILZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(539));
        this.LLILZIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(540));
        this.LLILZLL = C452501pT.LIZIZ(new AwS550S0100000_6(context, 1418));
        this.LLIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(541));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1420));
        this.LLJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(544));
        this.LLJI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(543));
        this.LLJIJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(542));
    }
}
