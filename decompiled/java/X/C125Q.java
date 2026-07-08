package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.InteractTextStructWrap;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerString;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerTextWrap;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.125Q, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C125Q {
    public Context LIZ;
    public Bitmap LJI;
    public Paint LJII;
    public List<TextStickerTextWrap> LJIIIZ;
    public TextStickerString[] LJIIJ;
    public float LJIILJJIL;
    public float LJIILL;
    public int LJIJ;
    public float LJIJI;
    public Path LJJ;
    public C125R LJJI;
    public float LJJIFFI;
    public float LJJII;
    public float LJJIIJ;
    public float LJJIIZI;
    public RectF LIZIZ = new RectF();
    public final RectF LIZJ = new RectF();
    public final Rect LIZLLL = new Rect();
    public final RectF LJ = new RectF();
    public final RectF LJFF = new RectF();
    public int LJIIIIZZ = 0;
    public float LJIIJJI = 60.0f;
    public float LJIIL = 20.0f;
    public float LJIILIIL = 20.0f;
    public int LJIILLIIL = 20;
    public int LJIIZILJ = 10;
    public final TextPaint LJIJJ = new TextPaint();
    public final Paint LJIJJLI = new Paint();
    public final Paint LJIL = new Paint(2);
    public boolean LJJIII = false;
    public final List<PointF> LJJIIJZLJL = new ArrayList();
    public boolean LJJIIZ = false;
    public final Paint.FontMetrics LJJIJ = new Paint.FontMetrics();
    public float LJJIJIIJI = 0.0f;
    public float LJJIJIIJIL = 0.0f;

    public final void LIZIZ(Canvas canvas, List<InteractTextStructWrap> list, String str, float f, float f2) {
        char c;
        float fLIZJ = f;
        if (!AnonymousClass1258.LIZLLL(str.length(), list)) {
            LIZ(canvas, str, 0, str.length(), fLIZJ, f2, this.LJIJJ);
            canvas.drawText(str, fLIZJ, f2, this.LJIJJ);
            return;
        }
        int end = 0;
        for (int i = 0; i < list.size(); i++) {
            InteractTextStructWrap interactTextStructWrap = (InteractTextStructWrap) ListProtector.get(list, i);
            if (interactTextStructWrap.getRange().isValid(str.length())) {
                if (end < interactTextStructWrap.getRange().getStart()) {
                    LIZ(canvas, str, end, interactTextStructWrap.getRange().getStart(), fLIZJ, f2, this.LJIJJ);
                    canvas.drawText(str, end, interactTextStructWrap.getRange().getStart(), fLIZJ, f2, (Paint) this.LJIJJ);
                    fLIZJ += AnonymousClass1258.LIZJ(this.LJIJJ, str, end, interactTextStructWrap.getRange().getStart());
                }
                int start = interactTextStructWrap.getRange().getStart();
                int end2 = interactTextStructWrap.getRange().getEnd();
                if (start < str.length() && str.charAt(start) == ' ') {
                    int i2 = start + 1;
                    c = ' ';
                    canvas.drawText(str, start, i2, fLIZJ, f2, (Paint) this.LJIJJ);
                    fLIZJ += AnonymousClass1258.LIZJ(this.LJIJJ, str, start, i2);
                    start = i2;
                } else {
                    c = ' ';
                }
                if (start < str.length() && str.charAt(start) == '_') {
                    this.LJFF.offsetTo(fLIZJ, ((((this.LJIJJ.getFontMetricsInt().descent + f2) + f2) + this.LJIJJ.getFontMetricsInt().ascent) / 2.0f) - (this.LJFF.height() / 2.0f));
                    canvas.drawBitmap(this.LJI, this.LIZLLL, this.LJFF, this.LJIL);
                    fLIZJ += this.LJFF.width() + this.LJIJI;
                    start++;
                }
                int i3 = end2 - 1;
                if (str.charAt(i3) == c) {
                    end2 = i3;
                }
                if (start < end2) {
                    LIZ(canvas, str, start, end2, fLIZJ, f2, this.LJIJJ);
                    this.LJIJJ.setUnderlineText(true);
                    canvas.drawText(str, start, end2, fLIZJ, f2, (Paint) this.LJIJJ);
                    this.LJIJJ.setUnderlineText(false);
                    fLIZJ += AnonymousClass1258.LIZJ(this.LJIJJ, str, start, end2);
                }
                if (end2 < interactTextStructWrap.getRange().getEnd()) {
                    canvas.drawText(str, end2, end2 + 1, fLIZJ, f2, (Paint) this.LJIJJ);
                    fLIZJ += AnonymousClass1258.LIZJ(this.LJIJJ, str, end2, r4);
                }
                end = interactTextStructWrap.getRange().getEnd();
            }
        }
        if (end < str.length()) {
            LIZ(canvas, str, end, str.length(), fLIZJ, f2, this.LJIJJ);
            canvas.drawText(str, end, str.length(), fLIZJ, f2, (Paint) this.LJIJJ);
        }
    }

    public final void LIZ(Canvas canvas, String str, int i, int i2, float f, float f2, Paint paint) {
        if (this.LJJIIZ) {
            for (TextStickerTextWrap textStickerTextWrap : this.LJJI.getTextWrapList()) {
                if (textStickerTextWrap != null && !TextUtils.isEmpty(textStickerTextWrap.getText())) {
                    int color = paint.getColor();
                    paint.setColor(AnonymousClass1256.LIZ(color));
                    Paint.Style style = paint.getStyle();
                    paint.setStyle(Paint.Style.FILL_AND_STROKE);
                    Paint.Cap strokeCap = paint.getStrokeCap();
                    paint.setStrokeCap(Paint.Cap.ROUND);
                    Paint.Join strokeJoin = paint.getStrokeJoin();
                    paint.setStrokeJoin(Paint.Join.ROUND);
                    float strokeWidth = paint.getStrokeWidth();
                    paint.setStrokeWidth(this.LJJIIZI);
                    canvas.drawText(str, i, i2, f, f2, (Paint) this.LJIJJ);
                    paint.setColor(color);
                    paint.setStyle(style);
                    paint.setStrokeCap(strokeCap);
                    paint.setStrokeJoin(strokeJoin);
                    paint.setStrokeWidth(strokeWidth);
                    return;
                }
            }
        }
    }
}
