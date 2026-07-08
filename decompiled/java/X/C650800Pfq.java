package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0Pfq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C650800Pfq implements InterfaceC650760Pfm {
    public final int LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1300));
    public final int[] LJFF = new int[2];

    @Override // X.InterfaceC650760Pfm
    public final List<InterfaceC650860Pfw> LIZIZ(EnumC648690PcR enumC648690PcR, RecyclerView recyclerView, List<? extends InterfaceC650860Pfw> list, int i, boolean z) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x004b A[EDGE_INSN: B:64:0x004b->B:15:0x004b BREAK  A[LOOP:0: B:3:0x000e->B:65:0x000e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x000e A[SYNTHETIC] */
    @Override // X.InterfaceC650760Pfm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.InterfaceC650860Pfw> LIZ(androidx.recyclerview.widget.RecyclerView r13, java.util.List<? extends X.InterfaceC650860Pfw> r14) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C650800Pfq.LIZ(androidx.recyclerview.widget.RecyclerView, java.util.List):java.util.List");
    }

    @Override // X.InterfaceC650760Pfm
    public final void LIZJ(Canvas canvas, RecyclerView recyclerView) {
        float width;
        float width2;
        float width3 = 0.0f;
        if (this.LIZLLL) {
            width = 0.0f;
        } else {
            width = recyclerView.getWidth() / 2.0f;
        }
        float f = this.LIZ;
        if (this.LIZLLL) {
            width2 = recyclerView.getWidth() / 2.0f;
        } else {
            width2 = recyclerView.getWidth();
        }
        canvas.drawLine(width, f, width2, this.LIZ, (Paint) this.LJ.getValue());
        if (this.LIZLLL) {
            width3 = recyclerView.getWidth() / 2.0f;
        }
        float f2 = this.LIZIZ;
        boolean z = this.LIZLLL;
        float width4 = recyclerView.getWidth();
        if (!z) {
            width4 /= 2.0f;
        }
        canvas.drawLine(width3, f2, width4, this.LIZIZ, (Paint) this.LJ.getValue());
    }

    public C650800Pfq(int i, int i2, boolean z, boolean z2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = z;
        this.LIZLLL = z2;
    }
}
