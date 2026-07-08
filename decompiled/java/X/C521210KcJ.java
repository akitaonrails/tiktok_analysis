package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: renamed from: X.0KcJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C521210KcJ extends C1113930f5r {
    public String LJJJLZIJ;
    public int LJJJZ;
    public int LJJL;
    public int LJJLI;
    public String LJJLIIIIJ;
    public C521020Kc0 LJJLIIIJ;
    public final C01GW LJJLIIIJILLIZJL;
    public final C01GW LJJLIIIJJI;
    public final C01GW LJJLIIIJJIZ;
    public final C01GW LJJLIIIJL;

    @Override // X.C1113930f5r
    public final int LJIIIIZZ() {
        return this.LJJLI;
    }

    @Override // X.C1113930f5r
    public final int LJIIIZ() {
        return this.LJJL;
    }

    @Override // X.C1113930f5r
    public final String LJIIL() {
        return this.LJJLIIIIJ;
    }

    @Override // X.C1113930f5r
    public final String LJIILIIL() {
        return this.LJJJLZIJ;
    }

    @Override // X.C1113930f5r, X.AbstractC521080Kc6
    public final void LIZLLL(Canvas canvas, Paint paint) {
        int i = this.LJJJZ;
        boolean z = true;
        if (i >= 0 && i < 256) {
            canvas.saveLayerAlpha(0.0f, 0.0f, this.LIZIZ, this.LIZJ, i, 31);
        } else {
            z = false;
        }
        super.LIZLLL(canvas, paint);
        if (z) {
            canvas.restore();
        }
    }

    public C521210KcJ(Context context, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, String str, C521100Kc8 c521100Kc8) {
        super(context, bitmap, bitmap2, bitmap3, str, c521100Kc8);
        this.LJJJLZIJ = str;
        this.LJJJZ = 255;
        this.LJJL = 255;
        this.LJJLIIIJILLIZJL = C292401Bi.LIZ(new AwS551S0100000_7(this, 800));
        this.LJJLIIIJJI = C292401Bi.LIZ(new AwS551S0100000_7(this, 797));
        this.LJJLIIIJJIZ = C292401Bi.LIZ(new AwS551S0100000_7(this, 798));
        this.LJJLIIIJL = C292401Bi.LIZ(new AwS551S0100000_7(this, 799));
    }
}
