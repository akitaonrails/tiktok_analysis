package X;

import X.AbstractC1384320m7y;
import android.graphics.Canvas;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0mRy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1396720mRy<T extends AbstractC1384320m7y> implements InterfaceC1396460mRY {
    public T LL;
    public float LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public int LLIZ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(468));
    public long LLJ;
    public long LLJI;
    public long LLJIJIL;
    public boolean LLJILJIL;
    public volatile C1396750mS1 LLJILJILJ;

    @Override // X.InterfaceC1396460mRY
    public int LIZ(float f, float f2) {
        return 0;
    }

    public abstract int LJFF();

    public abstract void LJIJI(T t, C1384750m8f c1384750m8f);

    public abstract void LJIJJ(Canvas canvas, C1384750m8f c1384750m8f);

    public void LJIJJLI(float f, float f2) {
    }

    public abstract void LJIL(C1384750m8f c1384750m8f);

    public void LJJ(C1384750m8f c1384750m8f) {
    }

    public void LJJI(C1384750m8f c1384750m8f) {
    }

    public void LJJIFFI(C1384750m8f c1384750m8f) {
    }

    public void LJJIIJ() {
        this.LLILZLL = 0.0f;
    }

    public void LJJIIZI() {
        this.LLILZ = 0.0f;
    }

    public void LJJIJIL() {
        this.LLILZIL = 0.0f;
    }

    public void LJJII() {
        LJJIJIL();
        LJJIIJ();
        LJJIJL(0.0f);
        LJJIJLIJ(0.0f);
        LJ();
        LJJIII(null);
        LJJIIZI();
        LJJIIJZLJL(0);
        LJJIJIIJI(0L);
        LJJIJ(0L);
        LJJIIZ(false);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("x: ");
        sbLIZ.append(LJIILIIL());
        sbLIZ.append(", y: ");
        sbLIZ.append(LJIILJJIL());
        sbLIZ.append(", data: ");
        sbLIZ.append(LJ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public T LJ() {
        return this.LL;
    }

    public float LJI() {
        return this.LLILZLL;
    }

    public int LJII() {
        return this.LLIZ;
    }

    public float LJIIIIZZ() {
        return this.LLILZ;
    }

    public long LJIIIZ() {
        return this.LLJI;
    }

    public long LJIIJ() {
        return this.LLJ;
    }

    public long LJIIJJI() {
        return this.LLJIJIL;
    }

    public float LJIIL() {
        return this.LLILZIL;
    }

    public float LJIILIIL() {
        return this.LLILLJJLI;
    }

    public float LJIILJJIL() {
        return this.LLILLL;
    }

    public boolean LJIILL() {
        return this.LLJILJIL;
    }

    public final void LJIIZILJ(C1384750m8f c1384750m8f) {
        LJIL(c1384750m8f);
    }

    public final void LJIJ(float f) {
        if (f != 0.0f) {
            LJIILLIIL(LJIILIIL() + f, LJIILJJIL() + 0.0f);
        }
    }

    public void LJJIII(T t) {
        this.LL = t;
    }

    public void LJJIIJZLJL(int i) {
        this.LLIZ = i;
    }

    public void LJJIIZ(boolean z) {
        this.LLJILJIL = z;
    }

    public void LJJIJ(long j) {
        this.LLJI = j;
    }

    public void LJJIJIIJI(long j) {
        this.LLJ = j;
    }

    public void LJJIJIIJIL(long j) {
        this.LLJIJIL = j;
    }

    public void LJJIJL(float f) {
        this.LLILLJJLI = f;
    }

    public void LJJIJLIJ(float f) {
        this.LLILLL = f;
    }

    public final void LIZJ(T t, C1384750m8f c1384750m8f) {
        LJJIII(t);
        LJIJI(t, c1384750m8f);
    }

    public void LIZLLL(Canvas canvas, C1384750m8f c1384750m8f) {
        if (!C1384750m8f.LJIILL) {
            canvas.save();
            canvas.rotate(LJIIIIZZ(), LJIILIIL(), LJIILJJIL());
        }
        LJIJJ(canvas, c1384750m8f);
        if (!C1384750m8f.LJIILL) {
            canvas.restore();
        }
    }

    public final void LJIILLIIL(float f, float f2) {
        LJJIJL(f);
        LJJIJLIJ(f2);
        LJIJJLI(f, f2);
    }
}
