package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.emojianim.EmojiAnimPlayground;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.11mX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19601511mX extends C19606111nH {
    public Bitmap LJIIJJI;
    public int LJIIL;

    public C19601511mX(EmojiAnimPlayground emojiAnimPlayground) {
        super(emojiAnimPlayground);
    }

    public final ArrayList LJI(long j, final Bitmap bitmap, int i, boolean z) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            C19607011nQ c19607011nQ = new C19607011nQ(bitmap) { // from class: X.11nP
                public final Bitmap LJIILL;

                {
                    super("");
                    this.LJIILL = bitmap;
                }

                @Override // X.C19607011nQ
                public final void LIZIZ(Canvas canvas) {
                    this.LIZIZ.setAlpha((int) (this.LJIIL * 255));
                    float f = 28;
                    float fLIZ = C339190DRl.LIZ(f) * this.LJIIJ;
                    float fLIZ2 = C339190DRl.LIZ(f) * this.LJIIJ;
                    float f2 = 2;
                    float f3 = this.LJIIIIZZ - (fLIZ / f2);
                    float f4 = this.LJIIIZ - (fLIZ2 / f2);
                    canvas.drawBitmap(this.LJIILL, (Rect) null, new RectF(f3, f4, fLIZ + f3, fLIZ2 + f4), this.LIZIZ);
                }
            };
            c19607011nQ.LJIILIIL = this.LIZIZ;
            c19607011nQ.LIZ(i2, j);
            arrayList.add(c19607011nQ);
        }
        LJ(i, z, arrayList);
        return arrayList;
    }
}
