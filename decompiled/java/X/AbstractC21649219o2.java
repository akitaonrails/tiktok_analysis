package X;

import android.graphics.Matrix;
import android.graphics.RectF;

/* JADX INFO: renamed from: X.19o2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC21649219o2 implements InterfaceC21650219oC<C21649319o3> {
    public final C21649319o3 LL;
    public InterfaceC21650719oH LLILLJJLI;
    public boolean LLILLL;
    public float LLILZLL;
    public float LLIZ;
    public boolean LLILZ = true;
    public boolean LLILZIL = true;
    public final RectF LLIZLLLIL = new RectF();
    public final RectF LLJ = new RectF();
    public final RectF LLJI = new RectF();
    public final Matrix LLJIJIL = new Matrix();
    public final Matrix LLJILJIL = new Matrix();
    public final float[] LLJILJILJ = new float[9];

    public final void LJFF() {
        this.LLJIJIL.mapRect(this.LLJI, this.LLJ);
        InterfaceC21650719oH interfaceC21650719oH = this.LLILLJJLI;
        if (interfaceC21650719oH == null || !this.LLILLL) {
            return;
        }
        interfaceC21650719oH.LIZ();
    }

    public final void LJII() {
        RectF rectF = this.LLIZLLLIL;
        RectF rectF2 = this.LLJ;
        if (rectF2.width() > rectF.width() || rectF2.height() > rectF.height()) {
            this.LLIZ = Math.max(rectF2.width() / rectF.width(), rectF2.height() / rectF.height());
        } else {
            this.LLIZ = Math.max(rectF.width() / rectF2.width(), rectF.height() / rectF2.height());
        }
    }

    public AbstractC21649219o2(C21649319o3 c21649319o3) {
        this.LL = c21649319o3;
        c21649319o3.LL = this;
    }

    public final void LJI(boolean z) {
        this.LLILLL = z;
        if (!z) {
            C21649019o0 c21649019o0 = (C21649019o0) this;
            c21649019o0.LJIJ();
            if (c21649019o0.LLJJL.computeScrollOffset()) {
                c21649019o0.LLJJL.forceFinished(true);
            }
            c21649019o0.LLJJIJI.reset();
            c21649019o0.LLJJIII.reset();
            c21649019o0.LLJIJIL.reset();
            c21649019o0.LJFF();
        }
    }
}
