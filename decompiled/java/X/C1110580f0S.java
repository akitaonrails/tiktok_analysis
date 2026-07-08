package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: renamed from: X.0f0S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1110580f0S extends C1110620f0W {
    public C1110620f0W LJJLIIIJL;
    public C1110620f0W LJJLIIIJLJLI;

    @Override // X.C1110620f0W
    public final void LJIIZILJ() {
        C1110620f0W c1110620f0W = this.LJJLIIIJL;
        if (c1110620f0W != null) {
            c1110620f0W.LJIIZILJ();
        }
        C1110620f0W c1110620f0W2 = this.LJJLIIIJLJLI;
        if (c1110620f0W2 != null) {
            c1110620f0W2.LJIIZILJ();
        }
    }

    @Override // X.C1113930f5r, X.AbstractC521080Kc6
    public final int LJ(Paint paint) {
        C1110620f0W c1110620f0W = this.LJJLIIIJL;
        if (c1110620f0W == null) {
            return 0;
        }
        if (c1110620f0W.LJJL == 0) {
            C1110620f0W c1110620f0W2 = this.LJJLIIIJLJLI;
            if (c1110620f0W2 == null) {
                return 0;
            }
            return c1110620f0W2.LIZIZ(paint);
        }
        return c1110620f0W.LIZIZ(paint);
    }

    @Override // X.C1110620f0W, X.C1113930f5r, X.AbstractC521080Kc6
    public final void LIZLLL(Canvas canvas, Paint paint) {
        C1110620f0W c1110620f0W = this.LJJLIIIJL;
        if (c1110620f0W != null && c1110620f0W.LJJL > 0) {
            c1110620f0W.LIZ(canvas, paint);
        }
        C1110620f0W c1110620f0W2 = this.LJJLIIIJLJLI;
        if (c1110620f0W2 != null && c1110620f0W2.LJJL > 0) {
            c1110620f0W2.LIZ(canvas, paint);
        }
    }

    public C1110580f0S(Context context, Bitmap bitmap, int i, String str, C521100Kc8 c521100Kc8) {
        super(context, bitmap, i, str, c521100Kc8);
    }
}
