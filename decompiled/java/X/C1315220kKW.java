package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.textra.BBufferInputStream;
import com.lynx.textra.JavaCanvasHelper;
import com.lynx.textra.TTText;
import com.lynx.textra.TTTextDefinition;
import com.lynx.textra.TTTextUtils;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0kKW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1315220kKW extends JavaCanvasHelper {
    public final C1315240kKY LIZ;
    public final ArrayList<PointF> LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public final InterfaceC1315370kKl LJ;
    public Path LJFF;

    @Override // com.lynx.textra.JavaCanvasHelper
    public final void restore() {
        super.restore();
        PointF pointF = (PointF) ListProtector.get(this.LIZIZ, r1.size() - 1);
        this.LIZJ = pointF.x;
        this.LIZLLL = pointF.y;
        ListProtector.remove(this.LIZIZ, r1.size() - 1);
    }

    @Override // com.lynx.textra.JavaCanvasHelper
    public final void save() {
        super.save();
        this.LIZIZ.add(new PointF(this.LIZJ, this.LIZLLL));
    }

    public final void LIZ(byte[] bArr) {
        BBufferInputStream bBufferInputStream = new BBufferInputStream(bArr);
        while (bBufferInputStream.available() > 0) {
            try {
                byte b = bBufferInputStream.readByte();
                if (b == -1) {
                    LIZIZ(bBufferInputStream);
                } else {
                    drawOp(TTTextDefinition.GetCanvasOp(b), bBufferInputStream);
                }
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
    }

    public final void LIZIZ(BBufferInputStream bBufferInputStream) {
        byte b = bBufferInputStream.readByte();
        if (b == 0) {
            this.canvas_.clipPath(LJ(bBufferInputStream));
            return;
        }
        if (b == 1) {
            Path pathLJ = LJ(bBufferInputStream);
            Paint paint = this.paint_;
            LIZLLL(bBufferInputStream, paint);
            this.canvas_.drawPath(pathLJ, paint);
            return;
        }
        if (b != 2) {
            return;
        }
        int i = bBufferInputStream.readInt();
        Path pathLJ2 = LJ(bBufferInputStream);
        Paint paint2 = this.paint_;
        LIZLLL(bBufferInputStream, paint2);
        if (this.LJ == null) {
            return;
        }
        paint2.setColor(this.color_);
        int i2 = this.color_;
        if (i2 != 0) {
            if (this.stroke_color_ == i2) {
                paint2.setStyle(Paint.Style.FILL_AND_STROKE);
                LIZJ(this.canvas_, this.LIZ.LIZIZ(i), pathLJ2, paint2);
                return;
            } else {
                paint2.setStyle(Paint.Style.FILL);
                LIZJ(this.canvas_, this.LIZ.LIZIZ(i), pathLJ2, paint2);
            }
        }
        if (this.stroke_color_ == 0) {
            return;
        }
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(this.stroke_color_);
        LIZJ(this.canvas_, this.LIZ.LIZIZ(i), pathLJ2, paint2);
    }

    public final Path LJ(BBufferInputStream bBufferInputStream) {
        Path path = this.LJFF;
        if (path == null) {
            this.LJFF = new Path();
        } else {
            path.rewind();
        }
        Path path2 = this.LJFF;
        int i = bBufferInputStream.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            byte b = bBufferInputStream.readByte();
            if (b == 0) {
                float fDp2Px = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
                float fDp2Px2 = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
                float fDp2Px3 = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
                float f = bBufferInputStream.readFloat();
                path2.addArc(fDp2Px - fDp2Px3, fDp2Px2 - fDp2Px3, fDp2Px + fDp2Px3, fDp2Px2 + fDp2Px3, f, bBufferInputStream.readFloat() - f);
            } else if (b == 1) {
                path2.addOval(TTTextUtils.Dp2Px(bBufferInputStream.readFloat()), TTTextUtils.Dp2Px(bBufferInputStream.readFloat()), TTTextUtils.Dp2Px(bBufferInputStream.readFloat()), TTTextUtils.Dp2Px(bBufferInputStream.readFloat()), Path.Direction.CW);
            } else if (b == 2) {
                path2.addRect(TTTextUtils.Dp2Px(bBufferInputStream.readFloat()), TTTextUtils.Dp2Px(bBufferInputStream.readFloat()), TTTextUtils.Dp2Px(bBufferInputStream.readFloat()), TTTextUtils.Dp2Px(bBufferInputStream.readFloat()), Path.Direction.CW);
            } else if (b == 3) {
                path2.addRoundRect(TTTextUtils.Dp2Px(bBufferInputStream.readFloat()), TTTextUtils.Dp2Px(bBufferInputStream.readFloat()), TTTextUtils.Dp2Px(bBufferInputStream.readFloat()), TTTextUtils.Dp2Px(bBufferInputStream.readFloat()), TTTextUtils.Dp2Px(bBufferInputStream.readFloat()), TTTextUtils.Dp2Px(bBufferInputStream.readFloat()), Path.Direction.CW);
            } else if (b == 4) {
                path2.moveTo(TTTextUtils.Dp2Px(bBufferInputStream.readFloat()), TTTextUtils.Dp2Px(bBufferInputStream.readFloat()));
            } else if (b == 5) {
                path2.lineTo(TTTextUtils.Dp2Px(bBufferInputStream.readFloat()), TTTextUtils.Dp2Px(bBufferInputStream.readFloat()));
            } else if (b == 6) {
                path2.cubicTo(TTTextUtils.Dp2Px(bBufferInputStream.readFloat()), TTTextUtils.Dp2Px(bBufferInputStream.readFloat()), TTTextUtils.Dp2Px(bBufferInputStream.readFloat()), TTTextUtils.Dp2Px(bBufferInputStream.readFloat()), TTTextUtils.Dp2Px(bBufferInputStream.readFloat()), TTTextUtils.Dp2Px(bBufferInputStream.readFloat()));
            } else if (b == 7) {
                path2.quadTo(TTTextUtils.Dp2Px(bBufferInputStream.readFloat()), TTTextUtils.Dp2Px(bBufferInputStream.readFloat()), TTTextUtils.Dp2Px(bBufferInputStream.readFloat()), TTTextUtils.Dp2Px(bBufferInputStream.readFloat()));
            }
        }
        return path2;
    }

    @Override // com.lynx.textra.JavaCanvasHelper
    public final void drawRunDelegate(BBufferInputStream bBufferInputStream) {
        int i = bBufferInputStream.readInt();
        float fDp2Px = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        float fDp2Px2 = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        float fDp2Px3 = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        float fDp2Px4 = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        float fDp2Px5 = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        if (this.LJ == null) {
            return;
        }
        if (fDp2Px5 > 0.0f) {
            this.canvas_.save();
            Path path = new Path();
            path.addRoundRect(fDp2Px, fDp2Px2, fDp2Px3, fDp2Px4, fDp2Px5, fDp2Px5, Path.Direction.CW);
            this.canvas_.clipPath(path);
        }
        Canvas canvas = this.canvas_;
        InterfaceC1315360kKk interfaceC1315360kKkLIZIZ = this.LIZ.LIZIZ(i);
        Rect rect = new Rect((int) fDp2Px, (int) fDp2Px2, (int) fDp2Px3, (int) fDp2Px4);
        C1315350kKj c1315350kKj = (C1315350kKj) interfaceC1315360kKkLIZIZ;
        if (c1315350kKj instanceof C1315320kKg) {
            int i2 = rect.left;
            int i3 = (int) this.LIZJ;
            rect.left = i2 + i3;
            rect.right += i3;
            int i4 = rect.top;
            int i5 = (int) this.LIZLLL;
            rect.top = i4 + i5;
            rect.bottom += i5;
            this.LJ.LIZ((C1315320kKg) c1315350kKj, rect);
        } else if (c1315350kKj instanceof C1315270kKb) {
            ((C1315270kKb) c1315350kKj).LIZLLL(canvas, rect);
        } else if (c1315350kKj instanceof C1315340kKi) {
            C1315340kKi c1315340kKi = (C1315340kKi) c1315350kKj;
            c1315340kKi.LIZJ.setBounds(rect.left, rect.top, rect.right, rect.bottom);
            c1315340kKi.LIZJ.draw(canvas);
        }
        if (fDp2Px5 > 0.0f) {
            this.canvas_.restore();
        }
    }

    @Override // com.lynx.textra.JavaCanvasHelper
    public final void translate(BBufferInputStream bBufferInputStream) {
        float fDp2Px = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        float fDp2Px2 = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        this.canvas_.translate(fDp2Px, fDp2Px2);
        this.LIZJ += fDp2Px;
        this.LIZLLL += fDp2Px2;
    }

    public final void LIZLLL(BBufferInputStream bBufferInputStream, Paint paint) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        paint.setAntiAlias(true);
        paint.setStrokeWidth(TTTextUtils.Dp2Px(bBufferInputStream.readFloat()));
        this.color_ = bBufferInputStream.readInt();
        this.stroke_color_ = bBufferInputStream.readInt();
        float fDp2Px = TTTextUtils.Dp2Px(bBufferInputStream.readFloat());
        this.text_size_ = fDp2Px;
        paint.setTextSize(fDp2Px);
        byte b = bBufferInputStream.readByte();
        if ((b & 4) > 0) {
            z = true;
        } else {
            z = false;
        }
        this.is_bold_ = z;
        if ((b & 8) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.is_italic_ = z2;
        if ((b & 16) <= 0) {
            z3 = false;
        }
        this.is_underline_ = z3;
    }

    public C1315220kKW(Canvas canvas, C1315240kKY c1315240kKY, InterfaceC1315370kKl interfaceC1315370kKl) {
        super(TTText.mFontManager);
        this.LIZIZ = new ArrayList<>();
        this.canvas_ = canvas;
        this.LIZ = c1315240kKY;
        this.LJ = interfaceC1315370kKl;
    }

    public static void LIZJ(Canvas canvas, InterfaceC1315360kKk interfaceC1315360kKk, Path path, Paint paint) {
        C1315350kKj c1315350kKj = (C1315350kKj) interfaceC1315360kKk;
        RectF rectF = new RectF();
        path.computeBounds(rectF, false);
        if (c1315350kKj instanceof C1315270kKb) {
            canvas.clipPath(path);
            ((C1315270kKb) c1315350kKj).LIZLLL(canvas, new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom));
        } else {
            if (!(c1315350kKj instanceof C1315340kKi)) {
                return;
            }
            C1315340kKi c1315340kKi = (C1315340kKi) c1315350kKj;
            c1315340kKi.LIZJ.setBounds(new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom));
            paint.setShader(c1315340kKi.LIZJ.LLILLJJLI);
            canvas.drawPath(path, paint);
            paint.setShader(null);
        }
    }
}
