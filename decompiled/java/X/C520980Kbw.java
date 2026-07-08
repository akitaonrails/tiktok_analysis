package X;

import Y.ARunnableS76S0200000_7;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import kotlin.jvm.internal.AwS443S0200000_7;

/* JADX INFO: renamed from: X.0Kbw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C520980Kbw extends AbstractC521060Kc4<C520990Kbx> implements InterfaceC1110900f0y {
    public final int LJII;
    public final BadgeStruct LJIIIIZZ;
    public final Context LJIIIZ;
    public final Runnable LJIIJ;

    @Override // X.AbstractC498530Jgp
    public final AbstractC521080Kc6 LJ() {
        final Context context = this.LJIIIZ;
        final Bitmap bitmap = this.LJI;
        if (bitmap == null) {
            bitmap = null;
        }
        AbstractC521080Kc6 abstractC521080Kc6 = new AbstractC521080Kc6(context, bitmap) { // from class: X.0Kbx
            public final Bitmap LJI;
            public final Rect LJII = new Rect();

            @Override // X.AbstractC521080Kc6
            public final int LJ(Paint paint) {
                int width = (this.LIZJ * this.LJI.getWidth()) / this.LJI.getHeight();
                Rect rect = this.LJII;
                rect.right = width;
                rect.bottom = this.LIZJ;
                return width;
            }

            {
                this.LJI = bitmap;
            }

            @Override // X.AbstractC521080Kc6
            public final void LIZLLL(Canvas canvas, Paint paint) {
                if (!this.LJI.isRecycled()) {
                    canvas.drawBitmap(this.LJI, (Rect) null, this.LJII, (Paint) null);
                }
            }
        };
        Runnable runnable = this.LJIIJ;
        if (runnable != null) {
            abstractC521080Kc6.LJ = runnable;
        }
        return abstractC521080Kc6;
    }

    @Override // X.InterfaceC1110900f0y
    public final BadgeStruct LIZIZ() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC498530Jgp
    public final int LIZLLL() {
        return this.LJII;
    }

    public C520980Kbw(int i, Handler handler, ImageModel imageModel, AwS443S0200000_7 awS443S0200000_7, BadgeStruct badgeStruct, Context context, ARunnableS76S0200000_7 aRunnableS76S0200000_7) {
        super(handler, imageModel, awS443S0200000_7);
        this.LJII = i;
        this.LJIIIIZZ = badgeStruct;
        this.LJIIIZ = context;
        this.LJIIJ = aRunnableS76S0200000_7;
    }
}
