package X;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0kHv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1313610kHv {
    public WeakReference<AbstractC1313520kHm> LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public Rect LJIIZILJ;
    public C1314660kJc LJIJ;
    public C1313990kIX LJIJI;
    public C1314670kJd LJIJJ;
    public final SparseArray<InterfaceC1314830kJt> LJIJJLI = new SparseArray<>(0);
    public float LJIL = -1.0f;
    public boolean LJJ = false;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0kJc] */
    public final AbstractC1313960kIU LIZ() {
        if (this.LJIJ == null) {
            this.LJIJ = new AbstractC1314160kIo() { // from class: X.0kJc
                @Override // X.AbstractC1314160kIo
                public final boolean LIZLLL() {
                    return false;
                }
            };
        }
        return this.LJIJ;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0kJd] */
    public final AbstractC1313960kIU LIZIZ() {
        if (this.LJIJJ == null) {
            this.LJIJJ = new AbstractC1314160kIo() { // from class: X.0kJd
                @Override // X.AbstractC1314160kIo
                public final boolean LIZLLL() {
                    return true;
                }
            };
        }
        return this.LJIJJ;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0kIX] */
    public final AbstractC1313960kIU LIZJ() {
        if (this.LJIJI == null) {
            this.LJIJI = new AbstractC1313960kIU() { // from class: X.0kIX
                @Override // X.AbstractC1313960kIU
                public final Animation LIZIZ(AbstractC1313520kHm abstractC1313520kHm, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, Rect rect, float f) {
                    boolean z;
                    boolean z2 = false;
                    if (abstractC1313520kHm.LJJIII() == i && abstractC1313520kHm.LJJIIJ() == i2) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (abstractC1313520kHm.LJJJJI() != i3 || abstractC1313520kHm.LJIIZILJ() != i4) {
                        z2 = true;
                    }
                    if (!z) {
                        if (!z2) {
                            return null;
                        }
                    } else if (!z2) {
                        return new TranslateAnimation(abstractC1313520kHm.LJJIII() - i, 0.0f, abstractC1313520kHm.LJJIIJ() - i2, 0.0f);
                    }
                    return new C1313850kIJ(abstractC1313520kHm, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, rect);
                }
            };
        }
        return this.LJIJI;
    }
}
