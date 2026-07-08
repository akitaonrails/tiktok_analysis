package X;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AwS133S0101000_27;

/* JADX INFO: renamed from: X.0xsp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1836210xsp extends AbstractC1585810rMx {
    public int LLILLJJLI;
    public final AwS133S0101000_27 LLILLL;
    public final C1836130xsh<Boolean> LL = new C1836130xsh<>(Boolean.FALSE);
    public final C1836130xsh<Integer> LLILZ = new C1836130xsh<>(0);

    public C1836210xsp(int i) {
        this.LLILLL = new AwS133S0101000_27(this, i, 0);
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        if (i != 0) {
            if (i == 1 && !this.LL.LIZIZ.booleanValue()) {
                this.LL.LIZJ(Boolean.TRUE);
                return;
            }
            return;
        }
        if (!this.LL.LIZIZ.booleanValue()) {
            return;
        }
        this.LL.LIZJ(Boolean.FALSE);
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        this.LLILLJJLI = iComputeHorizontalScrollOffset;
        this.LLILZ.LIZJ(Integer.valueOf(iComputeHorizontalScrollOffset));
    }
}
