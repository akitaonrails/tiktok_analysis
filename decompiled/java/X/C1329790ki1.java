package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ki1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1329790ki1 {
    public final InterfaceC1329780ki0 LIZ;
    public final InterfaceC1329880kiA LIZIZ;
    public final Paint LIZJ;

    public final boolean LIZIZ(C1329890kiB c1329890kiB) {
        if (c1329890kiB.LIZ == 0 && c1329890kiB.LIZIZ == 0 && c1329890kiB.LIZJ == this.LIZ.LIZLLL() && c1329890kiB.LIZLLL == this.LIZ.LJI()) {
            return true;
        }
        return false;
    }

    public final boolean LIZJ(int i) {
        if (i == 0) {
            return true;
        }
        C1329890kiB frameInfo = this.LIZ.getFrameInfo(i);
        C1329890kiB frameInfo2 = this.LIZ.getFrameInfo(i - 1);
        if (frameInfo.LJ == EnumC1329870ki9.NO_BLEND && LIZIZ(frameInfo)) {
            return true;
        }
        if (frameInfo2.LJFF == EnumC1329860ki8.DISPOSE_TO_BACKGROUND && LIZIZ(frameInfo2)) {
            return true;
        }
        return false;
    }

    public C1329790ki1(InterfaceC1329780ki0 interfaceC1329780ki0, InterfaceC1329880kiA interfaceC1329880kiA) {
        this.LIZ = interfaceC1329780ki0;
        this.LIZIZ = interfaceC1329880kiA;
        Paint paint = new Paint();
        this.LIZJ = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final void LIZ(Canvas canvas, C1329890kiB c1329890kiB) {
        canvas.drawRect(c1329890kiB.LIZ, c1329890kiB.LIZIZ, r2 + c1329890kiB.LIZJ, r1 + c1329890kiB.LIZLLL, this.LIZJ);
    }

    public final void LIZLLL(int i, Bitmap bitmap) {
        EnumC1329820ki4 enumC1329820ki4;
        Canvas canvas = new Canvas(bitmap);
        int i2 = 0;
        canvas.drawColor(0, PorterDuff.Mode.SRC);
        if (!LIZJ(i)) {
            int i3 = i - 1;
            while (true) {
                if (i3 < 0) {
                    break;
                }
                C1329890kiB frameInfo = this.LIZ.getFrameInfo(i3);
                EnumC1329860ki8 enumC1329860ki8 = frameInfo.LJFF;
                if (enumC1329860ki8 == EnumC1329860ki8.DISPOSE_DO_NOT) {
                    enumC1329820ki4 = EnumC1329820ki4.REQUIRED;
                } else if (enumC1329860ki8 == EnumC1329860ki8.DISPOSE_TO_BACKGROUND) {
                    if (LIZIZ(frameInfo)) {
                        enumC1329820ki4 = EnumC1329820ki4.NOT_REQUIRED;
                    } else {
                        enumC1329820ki4 = EnumC1329820ki4.REQUIRED;
                    }
                } else if (enumC1329860ki8 == EnumC1329860ki8.DISPOSE_TO_PREVIOUS) {
                    enumC1329820ki4 = EnumC1329820ki4.SKIP;
                } else {
                    enumC1329820ki4 = EnumC1329820ki4.ABORT;
                }
                int iOrdinal = enumC1329820ki4.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 3) {
                            break;
                        } else {
                            i3--;
                        }
                    } else {
                        i2 = i3 + 1;
                        break;
                    }
                } else {
                    C1329890kiB frameInfo2 = this.LIZ.getFrameInfo(i3);
                    C1323050kX9<Bitmap> c1323050kX9LIZ = this.LIZIZ.LIZ(i3, this.LIZ.LIZJ().LIZ.getImageFormat(), this.LIZ.LIZ());
                    if (c1323050kX9LIZ != null) {
                        try {
                            canvas.drawBitmap(c1323050kX9LIZ.get(), 0.0f, 0.0f, (Paint) null);
                            if (frameInfo2.LJFF == EnumC1329860ki8.DISPOSE_TO_BACKGROUND) {
                                LIZ(canvas, frameInfo2);
                            }
                            i2 = i3 + 1;
                            c1323050kX9LIZ.close();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c1323050kX9LIZ.close();
                            throw th;
                        }
                    } else if (LIZJ(i3)) {
                        break;
                    } else {
                        i3--;
                    }
                }
            }
            i2 = i3;
        } else {
            i2 = i;
        }
        while (i2 < i) {
            C1329890kiB frameInfo3 = this.LIZ.getFrameInfo(i2);
            EnumC1329860ki8 enumC1329860ki82 = frameInfo3.LJFF;
            if (enumC1329860ki82 != EnumC1329860ki8.DISPOSE_TO_PREVIOUS) {
                if (frameInfo3.LJ == EnumC1329870ki9.NO_BLEND) {
                    LIZ(canvas, frameInfo3);
                }
                this.LIZ.LJFF(canvas, i2);
                this.LIZIZ.LIZIZ();
                if (enumC1329860ki82 == EnumC1329860ki8.DISPOSE_TO_BACKGROUND) {
                    LIZ(canvas, frameInfo3);
                }
            }
            i2++;
        }
        C1329890kiB frameInfo4 = this.LIZ.getFrameInfo(i);
        if (frameInfo4.LJ == EnumC1329870ki9.NO_BLEND) {
            LIZ(canvas, frameInfo4);
        }
        this.LIZ.LJFF(canvas, i);
    }
}
