package X;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0SRv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C721490SRv {
    public final C16GX LIZ;
    public final RecyclerView LIZIZ;
    public ValueAnimator LIZJ;
    public int LIZLLL;
    public final C0SS6 LJ;

    public final void LIZ() {
        ValueAnimator valueAnimator = this.LIZJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LIZJ = null;
        LIZIZ();
    }

    public final void LIZIZ() {
        this.LIZIZ.stopNestedScroll(1);
        this.LIZIZ.stopNestedScroll(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0SS6, X.0kZH] */
    public C721490SRv(C0SSD c0ssd, C0SU0 c0su0) {
        this.LIZ = c0ssd;
        this.LIZIZ = c0su0;
        ?? r0 = new InterfaceC1324370kZH() { // from class: X.0SS6
            @Override // X.InterfaceC1324380kZI
            public final void LLZZJLIL(C16GX c16gx, int i) {
                this.LL.LIZLLL = i;
            }
        };
        this.LJ = r0;
        c0ssd.LIZ(r0);
    }
}
