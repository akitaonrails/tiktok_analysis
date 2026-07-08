package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.List;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.11nQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19607011nQ {
    public final String LIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public float LJFF;
    public float LJI;
    public float LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public List<? extends InterfaceC19606511nL> LJIILIIL;
    public final Paint LIZIZ = new Paint();
    public float LJIIJ = 1.5f;
    public float LJIIJJI = 1.0f;
    public float LJIIL = 1.0f;
    public final C01GW LJIILJJIL = C452501pT.LIZ(EnumC452301pR.NONE, AFwS218S0000000_29.get$arr$(369));

    public C19607011nQ(String str) {
        this.LIZ = str;
    }

    public void LIZIZ(Canvas canvas) {
        this.LIZIZ.setAlpha((int) (this.LJIIL * 255));
        this.LIZIZ.setTextSize(this.LJIIJ * ((Number) this.LJIILJJIL.getValue()).floatValue());
        float f = 2;
        canvas.drawText(this.LIZ, this.LJIIIIZZ - ((((Number) this.LJIILJJIL.getValue()).floatValue() * this.LJIIJ) / f), this.LJIIIZ - ((((Number) this.LJIILJJIL.getValue()).floatValue() * this.LJIIJ) / f), this.LIZIZ);
    }

    public final void LIZ(int i, long j) {
        this.LIZJ = j + (((long) i) * 50);
        long jLJIIJJI = C13LZ.LJIIJJI(AbstractC19994813Le.Default, new C354710DvR(1000L, 1250L));
        this.LIZLLL = jLJIIJJI;
        this.LJ = this.LIZJ + jLJIIJJI;
    }
}
