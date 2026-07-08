package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.120y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C196874120y implements Cloneable, C121I<AnonymousClass1218> {
    public static final float LLJILLL = C12ES.LIZJ(44.0f, C0CHQ.LIZ);
    public static final int LLJJ = (int) C12ES.LIZJ(12.0f, C0CHQ.LIZ);
    public float LL = 0.15f;
    public float LLILLJJLI = 3.0f;
    public final StickerItemModel LLILLL;
    public final C196870120u LLILZ;
    public boolean LLILZIL;
    public final Paint LLILZLL;
    public final PointF[] LLIZ;
    public RectF LLIZLLLIL;
    public RectF LLJ;
    public final Matrix LLJI;
    public final PointF[] LLJIJIL;
    public float LLJILJIL;
    public boolean LLJILJILJ;

    @Override // X.C121I
    public final InterfaceC384940F7k LIZJ() {
        StickerItemModel stickerItemModel = this.LLILLL;
        return new AnonymousClass1218(stickerItemModel.startTime, stickerItemModel.endTime, stickerItemModel.rotateAngle, stickerItemModel.scale, stickerItemModel.currentOffsetX, stickerItemModel.currentOffsetY);
    }

    @Override // X.C121I
    public final int LJFF() {
        return this.LLILLL.uiStartTime;
    }

    public final int hashCode() {
        return this.LLILLL.hashCode();
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.C121I
    public final int LIZ(int i) {
        return this.LLILLL.uiEndTime;
    }

    @Override // X.C121I
    public final int LIZIZ(int i) {
        return this.LLILLL.endTime;
    }

    @Override // X.C121I
    public final int LIZLLL(int i) {
        return this.LLILLL.startTime;
    }

    public final PointF[] LJI(float f) {
        RectF rectF = this.LLIZLLLIL;
        if (rectF == null) {
            return null;
        }
        PointF[] pointFArr = this.LLIZ;
        PointF pointF = pointFArr[0];
        float f2 = rectF.left;
        pointF.x = f2;
        float f3 = rectF.top;
        pointF.y = f3;
        PointF pointF2 = pointFArr[1];
        float f4 = rectF.right;
        pointF2.x = f4;
        pointF2.y = f3;
        PointF pointF3 = pointFArr[2];
        pointF3.x = f4;
        float f5 = rectF.bottom;
        pointF3.y = f5;
        PointF pointF4 = pointFArr[3];
        pointF4.x = f2;
        pointF4.y = f5;
        for (PointF pointF5 : pointFArr) {
            C121Q.LIZIZ(this.LLIZLLLIL.centerX(), this.LLIZLLLIL.centerY(), (float) Math.toRadians(this.LLILLL.rotateAngle), pointF5);
        }
        PointF[] pointFArr2 = this.LLIZ;
        pointFArr2[0].x -= f;
        pointFArr2[1].x -= f;
        pointFArr2[2].x -= f;
        pointFArr2[3].x -= f;
        return pointFArr2;
    }

    public final void LJIIIZ(float f) {
        RectF rectF = this.LLIZLLLIL;
        if (rectF == null) {
            return;
        }
        this.LLJILJIL *= f;
        this.LLJI.postScale(f, f, rectF.centerX(), this.LLIZLLLIL.centerY());
        C121Q.LJ(this.LLIZLLLIL, f);
        RectF rectF2 = this.LLJ;
        if (rectF2 != null) {
            rectF2.set(this.LLIZLLLIL);
            RectF rectF3 = this.LLJ;
            float f2 = rectF3.left;
            float f3 = LLJJ;
            rectF3.left = f2 - f3;
            rectF3.right += f3;
            rectF3.top -= f3;
            rectF3.bottom += f3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C196874120y)) {
            return false;
        }
        return this.LLILLL.equals(((C196874120y) obj).LLILLL);
    }

    @Override // X.C121T
    public final void setAlpha(boolean z) {
        if (z) {
            this.LLILZ.LJIIJ(this);
            return;
        }
        C196870120u c196870120u = this.LLILZ;
        c196870120u.LJFF.getClass();
        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(c196870120u.LJ);
        C348440DlK c348440DlKLJJIIJZLJL = c348100DkmLIZIZ.LJIIIZ().LJJIIJZLJL(this.LLILLL.uuid);
        if (c348440DlKLJJIIJZLJL == null) {
            return;
        }
        c348440DlKLJJIIJZLJL.LJIIIIZZ = 0.3137255f;
        c348100DkmLIZIZ.LJIIIZ().LIZLLL(c348440DlKLJJIIJZLJL);
    }

    @Override // X.C121T
    public final void setHighlightState(EnumC390580FTc enumC390580FTc) {
        C196870120u c196870120u = this.LLILZ;
        c196870120u.LJFF.getClass();
        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(c196870120u.LJ);
        C348440DlK c348440DlKLJJIIJZLJL = c348100DkmLIZIZ.LJIIIZ().LJJIIJZLJL(this.LLILLL.uuid);
        if (c348440DlKLJJIIJZLJL != null) {
            c348440DlKLJJIIJZLJL.LJIIIZ = enumC390580FTc.ordinal();
            c348100DkmLIZIZ.LJIIIZ().LIZLLL(c348440DlKLJJIIJZLJL);
        }
    }

    public final void LJIIIIZZ(float f, float f2) {
        this.LLJI.postTranslate(f, f2);
        this.LLIZLLLIL.offset(f, f2);
        this.LLJ.offset(f, f2);
    }

    public C196874120y(Context context, StickerItemModel stickerItemModel, C196870120u c196870120u) {
        Paint paint = new Paint();
        this.LLILZLL = paint;
        this.LLIZ = new PointF[]{new PointF(), new PointF(), new PointF(), new PointF()};
        this.LLJI = new Matrix();
        this.LLJIJIL = new PointF[4];
        this.LLJILJIL = 1.0f;
        this.LLJILJILJ = false;
        this.LLILLL = stickerItemModel;
        this.LLILZ = c196870120u;
        paint.setColor(C960203pA.LIZ(R.attr.ee, context));
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(2.0f);
    }

    @Override // X.C121I
    public final void LJ(InterfaceC384940F7k interfaceC384940F7k, int i, int i2) {
        AnonymousClass1218 anonymousClass1218 = (AnonymousClass1218) interfaceC384940F7k;
        C196870120u c196870120u = this.LLILZ;
        c196870120u.LJIIZILJ(this, anonymousClass1218.LL, anonymousClass1218.LLILLJJLI);
        StickerItemModel stickerItemModel = this.LLILLL;
        float f = stickerItemModel.rotateAngle;
        float f2 = stickerItemModel.scale;
        c196870120u.LJI(this, (anonymousClass1218.LLILZIL - stickerItemModel.currentOffsetX) * i, (anonymousClass1218.LLILZLL - stickerItemModel.currentOffsetY) * i2);
        c196870120u.LJII(this, anonymousClass1218.LLILLL - f);
        c196870120u.LJIIIIZZ(this, anonymousClass1218.LLILZ / f2);
    }

    public final void LJII(float f, float f2, int i, int i2, int i3, int i4) {
        float f3 = i;
        StickerItemModel stickerItemModel = this.LLILLL;
        float f4 = stickerItemModel.initWidth;
        float f5 = ((f * f3) - (f4 / 2.0f)) + i3;
        float f6 = stickerItemModel.initHeight;
        float f7 = ((i2 * f2) - (f6 / 2.0f)) + i4;
        this.LLIZLLLIL = new RectF(f5, f7, f4 + f5, f6 + f7);
        float f8 = LLJILLL;
        StickerItemModel stickerItemModel2 = this.LLILLL;
        this.LL = Math.max(f8 / stickerItemModel2.initWidth, f8 / stickerItemModel2.initHeight);
        if (this.LLILLL.isMagnifier()) {
            StickerItemModel stickerItemModel3 = this.LLILLL;
            this.LL = Math.max(f8 / stickerItemModel3.initWidth, f8 / stickerItemModel3.initHeight);
            this.LLILLJJLI = f3 / this.LLILLL.initWidth;
        } else {
            StickerItemModel stickerItemModel4 = this.LLILLL;
            this.LL = Math.max(f8 / stickerItemModel4.initWidth, f8 / stickerItemModel4.initHeight);
        }
        RectF rectF = new RectF(this.LLIZLLLIL);
        this.LLJ = rectF;
        float f9 = rectF.left;
        float f10 = LLJJ;
        rectF.left = f9 - f10;
        rectF.right += f10;
        rectF.top -= f10;
        rectF.bottom += f10;
        int i5 = 0;
        do {
            this.LLJIJIL[i5] = new PointF();
            i5++;
        } while (i5 < 4);
    }
}
