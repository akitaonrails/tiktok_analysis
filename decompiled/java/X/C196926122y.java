package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.editSticker.text.bean.InteractTextStructWrap;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerString;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.122y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C196926122y {
    public Context LIZ;
    public Bitmap LJI;
    public Path LJII;
    public Bitmap LJIIIIZZ;
    public Paint LJIIJJI;
    public Paint LJIJI;
    public List<TextStickerTextWrap> LJIJJLI;
    public TextStickerString[] LJIL;
    public float LJJII;
    public float LJJIII;
    public int LJJIIZ;
    public float LJJIIZI;
    public Path LJJIJIL;
    public C196925122x LJJIJL;
    public float LJJIJLIJ;
    public float LJJIL;
    public float LJJJ;
    public float LJJJJI;
    public RectF LIZIZ = new RectF();
    public final RectF LIZJ = new RectF();
    public final Rect LIZLLL = new Rect();
    public final RectF LJ = new RectF();
    public final RectF LJFF = new RectF();
    public final Rect LJIIIZ = new Rect();
    public final RectF LJIIJ = new RectF();
    public int LJIIL = 0;
    public int LJIILIIL = 0;
    public float LJIILJJIL = 0.0f;
    public float LJIILL = 0.0f;
    public boolean LJIILLIIL = false;
    public boolean LJIIZILJ = false;
    public boolean LJIJ = true;
    public int LJIJJ = 0;
    public float LJJ = 60.0f;
    public float LJJI = 20.0f;
    public float LJJIFFI = 20.0f;
    public int LJJIIJ = 20;
    public int LJJIIJZLJL = 10;
    public final TextPaint LJJIJ = new TextPaint();
    public final Paint LJJIJIIJI = new Paint();
    public final Paint LJJIJIIJIL = new Paint(2);
    public boolean LJJIZ = false;
    public final List<PointF> LJJJI = new ArrayList();
    public boolean LJJJIL = false;
    public int LJJJJ = -1;
    public final Paint.FontMetrics LJJJJIZL = new Paint.FontMetrics();
    public float LJJJJJ = 0.0f;
    public float LJJJJJL = 0.0f;

    public float LIZ(float f, TextStickerString[] textStickerStringArr) {
        return f;
    }

    public int LIZIZ(int i) {
        return i;
    }

    public TextStickerString[] LIZJ(TextStickerString[] textStickerStringArr) {
        return textStickerStringArr;
    }

    public float LIZLLL() {
        return 28.0f;
    }

    public int LJIIIIZZ() {
        return 0;
    }

    public final RectF LJII() {
        RectF rectF = new RectF();
        rectF.set(this.LIZIZ);
        float f = rectF.left;
        int i = this.LJJIIJ;
        rectF.set(f - i, rectF.top - i, rectF.right + i, rectF.bottom + i);
        return rectF;
    }

    public int LJIIIZ() {
        Paint.FontMetrics fontMetrics = this.LJJIJ.getFontMetrics();
        return (int) (fontMetrics.descent - fontMetrics.ascent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (r1 != null) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(java.util.List<com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap> r8) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196926122y.LJIIL(java.util.List):void");
    }

    public void LJIIJJI(C196925122x c196925122x, Context context) {
        this.LIZ = context;
        this.LJJIJL = c196925122x;
        if (!C297910Bm1.LIZ()) {
            this.LJJIJL.setLayerType(2, null);
        }
        this.LJJ = C0JAI.LJI(28.0f, context);
        this.LJJI = C0JAI.LIZ(12.0f, context);
        float fLIZ = C0JAI.LIZ(8.0f, context);
        this.LJJIFFI = fLIZ;
        this.LJJII = this.LJJI;
        this.LJJIII = fLIZ;
        this.LJJIIJ = (int) C0JAI.LIZ(2.0f, context);
        C0JAI.LIZ(14.0f, context);
        this.LJJIIJZLJL = (int) C0JAI.LIZ(2.0f, context);
        this.LJJIIZ = (int) C0JAI.LIZ(5.0f, context);
        this.LJIIL = (int) C0JAI.LIZ(12.0f, context);
        this.LJIILIIL = (int) C0JAI.LIZ(9.0f, context);
        this.LJIILJJIL = C0JAI.LIZ(6.0f, context);
        this.LJIILL = C0JAI.LIZ(1.0f, context);
        this.LJJIIZI = C11VU.LIZIZ(4.0f, context);
        this.LJI = BitmapFactory.decodeResource(context.getResources(), R.drawable.c3i);
        this.LJIIIIZZ = BitmapFactory.decodeResource(context.getResources(), R.drawable.c3e);
        this.LIZLLL.set(0, 0, this.LJI.getWidth(), this.LJI.getHeight());
        this.LJIIIZ.set(0, 0, this.LJIIIIZZ.getWidth(), this.LJIIIIZZ.getHeight());
        this.LJJIJ.setColor(-1);
        this.LJJIJ.setTypeface(Typeface.DEFAULT_BOLD);
        this.LJJIJ.setTextSize(this.LJJ);
        this.LJJIJ.setAntiAlias(true);
        new Paint(this.LJJIJ).setColor(-16737912);
        this.LJJIJIIJI.setColor(-2130706433);
        this.LJJIJIIJI.setStyle(Paint.Style.STROKE);
        this.LJJIJIIJI.setAntiAlias(true);
        this.LJJIJIIJI.setStrokeWidth(2.0f);
        Paint paint = new Paint();
        this.LJIJI = paint;
        paint.setStyle(Paint.Style.FILL);
        this.LJIJI.setAntiAlias(true);
        this.LJIJI.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        this.LJIJI.setPathEffect(new CornerPathEffect(this.LJJIIZ));
        this.LJJIJIL = new Path();
        Paint paint2 = new Paint();
        this.LJIIJJI = paint2;
        float f = this.LJIILJJIL;
        paint2.setPathEffect(new DashPathEffect(new float[]{f, f}, 0.0f));
        this.LJIIJJI.setStyle(Paint.Style.STROKE);
        this.LJIIJJI.setColor(-1);
        this.LJIIJJI.setStrokeWidth(this.LJIILL);
        this.LJIIJJI.setAntiAlias(true);
        this.LJII = new Path();
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x021c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(android.graphics.Canvas r28, X.C123K r29, java.util.ArrayList<android.graphics.PointF[]> r30) {
        /*
            Method dump skipped, instruction units count: 1943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196926122y.LJ(android.graphics.Canvas, X.123K, java.util.ArrayList):void");
    }

    public float LJIIJ(float f, float f2, int i) {
        return f + f2 + (this.LJJIFFI * i);
    }

    public final void LJI(Canvas canvas, List<InteractTextStructWrap> list, String str, float f, float f2) {
        char c;
        float fLJIIIZ = f;
        if (!C123P.LJIIL(str.length(), list)) {
            LJFF(canvas, str, 0, str.length(), fLJIIIZ, f2, this.LJJIJ);
            canvas.drawText(str, fLJIIIZ, f2, this.LJJIJ);
            return;
        }
        int end = 0;
        for (int i = 0; i < list.size(); i++) {
            InteractTextStructWrap interactTextStructWrap = (InteractTextStructWrap) ListProtector.get(list, i);
            if (interactTextStructWrap.getRange().isValid(str.length())) {
                if (end < interactTextStructWrap.getRange().getStart()) {
                    LJFF(canvas, str, end, interactTextStructWrap.getRange().getStart(), fLJIIIZ, f2, this.LJJIJ);
                    canvas.drawText(str, end, interactTextStructWrap.getRange().getStart(), fLJIIIZ, f2, (Paint) this.LJJIJ);
                    fLJIIIZ += C123P.LJIIIZ(this.LJJIJ, str, end, interactTextStructWrap.getRange().getStart());
                }
                int start = interactTextStructWrap.getRange().getStart();
                int end2 = interactTextStructWrap.getRange().getEnd();
                if (start < str.length() && str.charAt(start) == ' ') {
                    int i2 = start + 1;
                    c = ' ';
                    canvas.drawText(str, start, i2, fLJIIIZ, f2, (Paint) this.LJJIJ);
                    fLJIIIZ += C123P.LJIIIZ(this.LJJIJ, str, start, i2);
                    start = i2;
                } else {
                    c = ' ';
                }
                if (start < str.length() && str.charAt(start) == '_') {
                    this.LJFF.offsetTo(fLJIIIZ, ((((this.LJJIJ.getFontMetricsInt().descent + f2) + f2) + this.LJJIJ.getFontMetricsInt().ascent) / 2.0f) - (this.LJFF.height() / 2.0f));
                    canvas.drawBitmap(this.LJI, this.LIZLLL, this.LJFF, this.LJJIJIIJIL);
                    fLJIIIZ += this.LJFF.width() + this.LJJIIZI;
                    start++;
                }
                int i3 = end2 - 1;
                if (str.charAt(i3) == c) {
                    end2 = i3;
                }
                if (start < end2) {
                    LJFF(canvas, str, start, end2, fLJIIIZ, f2, this.LJJIJ);
                    this.LJJIJ.setUnderlineText(true);
                    canvas.drawText(str, start, end2, fLJIIIZ, f2, (Paint) this.LJJIJ);
                    this.LJJIJ.setUnderlineText(false);
                    fLJIIIZ += C123P.LJIIIZ(this.LJJIJ, str, start, end2);
                }
                if (end2 < interactTextStructWrap.getRange().getEnd()) {
                    canvas.drawText(str, end2, end2 + 1, fLJIIIZ, f2, (Paint) this.LJJIJ);
                    fLJIIIZ += C123P.LJIIIZ(this.LJJIJ, str, end2, r4);
                }
                end = interactTextStructWrap.getRange().getEnd();
            }
        }
        if (end < str.length()) {
            LJFF(canvas, str, end, str.length(), fLJIIIZ, f2, this.LJJIJ);
            canvas.drawText(str, end, str.length(), fLJIIIZ, f2, (Paint) this.LJJIJ);
        }
    }

    public final void LJFF(Canvas canvas, String str, int i, int i2, float f, float f2, Paint paint) {
        if (this.LJJJIL) {
            for (TextStickerTextWrap textStickerTextWrap : this.LJJIJL.getTextWrapList()) {
                if (textStickerTextWrap != null && !TextUtils.isEmpty(textStickerTextWrap.getText())) {
                    int color = paint.getColor();
                    paint.setColor(this.LJJJJ);
                    Paint.Style style = paint.getStyle();
                    paint.setStyle(Paint.Style.FILL_AND_STROKE);
                    Paint.Cap strokeCap = paint.getStrokeCap();
                    paint.setStrokeCap(Paint.Cap.ROUND);
                    Paint.Join strokeJoin = paint.getStrokeJoin();
                    paint.setStrokeJoin(Paint.Join.ROUND);
                    float strokeWidth = paint.getStrokeWidth();
                    paint.setStrokeWidth(this.LJJJJI);
                    canvas.drawText(str, i, i2, f, f2, (Paint) this.LJJIJ);
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
