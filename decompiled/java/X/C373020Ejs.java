package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0Ejs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C373020Ejs extends View {
    public float LL;
    public int LLILLJJLI;
    public int LLILLL;
    public Paint LLILZ;
    public Paint LLILZIL;
    public ArrayList<EffectPointModel> LLILZLL;
    public boolean LLIZ;
    public RectF LLIZLLLIL;
    public RectF LLJ;
    public int LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public boolean LLJILJILJ;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.LLJILJILJ) {
            this.LLILZ.setColor(this.LLJILJIL);
            if (this.LLJILJIL != 0) {
                this.LLILZ.setAlpha(230);
            }
            canvas.drawRect(this.LLIZLLLIL, this.LLILZ);
            return;
        }
        this.LLILZ.setColor(this.LLJIJIL);
        RectF rectF = this.LLIZLLLIL;
        int i = this.LLILLL;
        canvas.drawRoundRect(rectF, i / 2, i / 2, this.LLILZ);
        for (int i2 = 0; i2 < this.LLILZLL.size(); i2++) {
            EffectPointModel effectPointModel = (EffectPointModel) ListProtector.get(this.LLILZLL, i2);
            if (effectPointModel.getSelectedColor() != 0) {
                this.LLILZIL.setColor(effectPointModel.getSelectedColor());
                this.LLILZIL.setAlpha(230);
                int uiStartPoint = effectPointModel.getUiStartPoint();
                int uiEndPoint = effectPointModel.getUiEndPoint();
                boolean zIsFromEnd = (effectPointModel.isFromEnd() ^ this.LLIZ) ^ C1388580mEq.LIZIZ(getContext());
                this.LLJ.set((zIsFromEnd ? this.LLJI - uiEndPoint : uiStartPoint) * this.LL, 0.0f, (zIsFromEnd ? this.LLJI - uiStartPoint : uiEndPoint) * this.LL, this.LLILLL);
                if (uiStartPoint == 0 && uiEndPoint == this.LLJI) {
                    RectF rectF2 = this.LLJ;
                    int i3 = this.LLILLL;
                    canvas.drawRoundRect(rectF2, i3 / 2, i3 / 2, this.LLILZIL);
                } else {
                    canvas.drawRect(this.LLJ, this.LLILZIL);
                }
            }
        }
    }

    public void setDuration(int i) {
        this.LLJI = i;
        this.LL = this.LLILLJJLI / i;
    }

    public void setNormalColor(int i) {
        this.LLJIJIL = i;
        if (!this.LLJILJILJ) {
            invalidate();
        }
    }

    public void setOverlayColor(int i) {
        if (this.LLJILJIL != i) {
            this.LLJILJIL = i;
            invalidate();
        }
    }

    public C373020Ejs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = C0EZ3.LIZ;
        this.LLILLL = (int) C12ES.LIZJ(5.0f, getContext());
        Paint paint = new Paint();
        this.LLILZ = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.LLILZIL = paint2;
        paint2.setAntiAlias(true);
        this.LLILZLL = new ArrayList<>();
        this.LLJ = new RectF();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LLILLL = View.MeasureSpec.getSize(i2);
        if (this.LLIZLLLIL == null) {
            this.LLIZLLLIL = new RectF();
        }
        this.LLIZLLLIL.set(0.0f, 0.0f, this.LLILLJJLI, this.LLILLL);
    }
}
