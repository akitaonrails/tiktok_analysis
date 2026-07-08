package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0gKL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1161350gKL extends AbstractC1585810rMx {
    public final C1161340gKK LL;
    public final C1161440gKU LLILLJJLI;
    public final C1161870gLB LLILLL;
    public final C1160780gJQ LLILZ;
    public final CopyOnWriteArraySet<InterfaceC1161460gKW> LLILZIL = new CopyOnWriteArraySet<>();

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        for (InterfaceC1161460gKW interfaceC1161460gKW : this.LLILZIL) {
            if (interfaceC1161460gKW instanceof InterfaceC1161450gKV) {
                ((InterfaceC1161450gKV) interfaceC1161460gKW).LLF(recyclerView, i);
            }
        }
    }

    public final void LJJIJIIJIL(InterfaceC1161460gKW interfaceC1161460gKW, InterfaceC1161620gKm interfaceC1161620gKm) {
        this.LLILZIL.add(interfaceC1161460gKW);
        interfaceC1161460gKW.LJI(interfaceC1161620gKm);
        if (interfaceC1161460gKW instanceof InterfaceC1161360gKM) {
            this.LL.LIZ.add(interfaceC1161460gKW);
        }
        if (interfaceC1161460gKW instanceof InterfaceC1161520gKc) {
            this.LLILLJJLI.LIZ.add(interfaceC1161460gKW);
        }
        if (interfaceC1161460gKW instanceof InterfaceC1161880gLC) {
            this.LLILLL.LIZ.add(interfaceC1161460gKW);
        }
        if (interfaceC1161460gKW instanceof InterfaceC1160790gJR) {
            this.LLILZ.LL.add(interfaceC1161460gKW);
        }
    }

    public final void LJJIL(InterfaceC1161460gKW interfaceC1161460gKW, InterfaceC1161620gKm interfaceC1161620gKm) {
        if (interfaceC1161460gKW instanceof InterfaceC1161360gKM) {
            this.LL.LIZ.remove(interfaceC1161460gKW);
        }
        if (interfaceC1161460gKW instanceof InterfaceC1161520gKc) {
            this.LLILLJJLI.LIZ.remove(interfaceC1161460gKW);
        }
        if (interfaceC1161460gKW instanceof InterfaceC1161880gLC) {
            this.LLILLL.LIZ.remove(interfaceC1161460gKW);
        }
        if (interfaceC1161460gKW instanceof InterfaceC1160790gJR) {
            this.LLILZ.LL.remove(interfaceC1161460gKW);
        }
        this.LLILZIL.remove(interfaceC1161460gKW);
        interfaceC1161460gKW.LJII();
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        for (InterfaceC1161460gKW interfaceC1161460gKW : this.LLILZIL) {
            if (interfaceC1161460gKW instanceof InterfaceC1161450gKV) {
                ((InterfaceC1161450gKV) interfaceC1161460gKW).LIZIZ(i, i2);
            }
        }
    }

    public C1161350gKL(C1161340gKK c1161340gKK, C1161440gKU c1161440gKU, C1161870gLB c1161870gLB, C1160780gJQ c1160780gJQ) {
        this.LL = c1161340gKK;
        this.LLILLJJLI = c1161440gKU;
        this.LLILLL = c1161870gLB;
        this.LLILZ = c1160780gJQ;
    }
}
