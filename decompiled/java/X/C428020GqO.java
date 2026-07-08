package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: renamed from: X.0GqO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C428020GqO extends FrameLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final Paint LLILLL;
    public final Paint LLILZ;
    public boolean LLILZIL;
    public float LLILZLL;
    public final Path LLIZ;
    public final Path LLIZLLLIL;
    public final Path LLJ;

    private final SmartImageView getImageView() {
        return (SmartImageView) this.LL.getValue();
    }

    private final TuxTextView getTextView() {
        return (TuxTextView) this.LLILLJJLI.getValue();
    }

    public final void LIZLLL() {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        this.LLIZ.reset();
        this.LLIZLLLIL.reset();
        this.LLJ.reset();
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        this.LLIZLLLIL.addCircle(width, height, (Math.min(getWidth(), getHeight()) - this.LLILZ.getStrokeWidth()) / 2.0f, Path.Direction.CW);
        if (!this.LLILZIL || this.LLILZLL <= 0.0f) {
            this.LLIZ.set(this.LLIZLLLIL);
            return;
        }
        this.LLJ.addCircle(width - (getWidth() - this.LLILZLL), height, getWidth() / 2.0f, Path.Direction.CW);
        this.LLIZ.op(this.LLIZLLLIL, this.LLJ, Path.Op.DIFFERENCE);
    }

    public C428020GqO(Context context) {
        super(context, null, 0);
        this.LL = C452501pT.LIZIZ(new AwS545S0100000_1(context, 1706));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS545S0100000_1(context, 1703));
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.LLILLL = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        this.LLILZ = paint2;
        this.LLIZ = new Path();
        this.LLIZLLLIL = new Path();
        this.LLJ = new Path();
        setWillNotDraw(false);
        addView(getImageView());
        addView(getTextView());
    }

    public final void LIZ(C428030GqP c428030GqP) {
        boolean z = true;
        if (this.LLILZIL == c428030GqP.LIZ && this.LLILZLL == c428030GqP.LIZIZ && this.LLILZ.getStrokeWidth() == c428030GqP.LJ) {
            z = false;
        }
        this.LLILZIL = c428030GqP.LIZ;
        this.LLILZLL = c428030GqP.LIZIZ;
        this.LLILLL.setColor(c428030GqP.LIZJ);
        this.LLILZ.setColor(c428030GqP.LIZLLL);
        this.LLILZ.setStrokeWidth(c428030GqP.LJ);
        if (z) {
            LIZLLL();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.LLIZ);
        canvas.drawPath(this.LLIZ, this.LLILLL);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (this.LLILZ.getStrokeWidth() > 0.0f) {
            canvas.drawPath(this.LLIZ, this.LLILZ);
        }
    }

    public final void LIZIZ(Image image, C428030GqP c428030GqP) {
        LIZ(c428030GqP);
        C03DZ.LIZJ(getImageView());
        C03DZ.LIZ(getTextView());
        C1326790kdB.LIZ.getClass();
        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(image);
        c1331670kl3LIZLLL.LJJ(getImageView());
        C786410Ut5.h3(c1331670kl3LIZLLL);
        invalidate();
    }

    public final void LIZJ(String str, C428030GqP c428030GqP) {
        LIZ(c428030GqP);
        C03DZ.LIZJ(getTextView());
        C03DZ.LIZ(getImageView());
        getTextView().setText(str);
        invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LIZLLL();
    }
}
