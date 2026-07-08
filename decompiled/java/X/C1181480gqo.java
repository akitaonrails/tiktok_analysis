package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0gqo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1181480gqo extends AbstractC1585810rMx {
    public final C1181490gqp LL;
    public final C1181630gr3 LLILLJJLI;
    public final C1174000gek LLILLL;
    public final C1181390gqf LLILZ;
    public final CopyOnWriteArraySet<InterfaceC1181660gr6> LLILZIL = new CopyOnWriteArraySet<>();

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        for (InterfaceC1181660gr6 interfaceC1181660gr6 : this.LLILZIL) {
            if (interfaceC1181660gr6 instanceof InterfaceC1181650gr5) {
                ((InterfaceC1181650gr5) interfaceC1181660gr6).LLF(recyclerView, i);
            }
        }
    }

    public final void LJJIJIIJIL(InterfaceC1181660gr6 interfaceC1181660gr6, InterfaceC1181010gq3 interfaceC1181010gq3) {
        this.LLILZIL.add(interfaceC1181660gr6);
        interfaceC1181660gr6.LJIJJLI(interfaceC1181010gq3);
        if (interfaceC1181660gr6 instanceof InterfaceC1181500gqq) {
            this.LL.LL.add(interfaceC1181660gr6);
        }
        if (interfaceC1181660gr6 instanceof InterfaceC1181690gr9) {
            this.LLILLJJLI.LIZ.add(interfaceC1181660gr6);
        }
        if (interfaceC1181660gr6 instanceof InterfaceC1174010gel) {
            this.LLILLL.LL.add(interfaceC1181660gr6);
        }
        if (interfaceC1181660gr6 instanceof InterfaceC1181380gqe) {
            this.LLILZ.LL.add(interfaceC1181660gr6);
        }
    }

    public final void LJJIL(InterfaceC1181660gr6 interfaceC1181660gr6, InterfaceC1181010gq3 interfaceC1181010gq3) {
        if (interfaceC1181660gr6 instanceof InterfaceC1181500gqq) {
            this.LL.LL.remove(interfaceC1181660gr6);
        }
        if (interfaceC1181660gr6 instanceof InterfaceC1181690gr9) {
            this.LLILLJJLI.LIZ.remove(interfaceC1181660gr6);
        }
        if (interfaceC1181660gr6 instanceof InterfaceC1174010gel) {
            this.LLILLL.LL.remove(interfaceC1181660gr6);
        }
        if (interfaceC1181660gr6 instanceof InterfaceC1181380gqe) {
            this.LLILZ.LL.remove(interfaceC1181660gr6);
        }
        this.LLILZIL.remove(interfaceC1181660gr6);
        interfaceC1181660gr6.LJIIJ();
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        for (InterfaceC1181660gr6 interfaceC1181660gr6 : this.LLILZIL) {
            if (interfaceC1181660gr6 instanceof InterfaceC1181650gr5) {
                ((InterfaceC1181650gr5) interfaceC1181660gr6).LLFF(recyclerView, i, i2);
            }
        }
    }

    public C1181480gqo(C1181490gqp c1181490gqp, C1181630gr3 c1181630gr3, C1174000gek c1174000gek, C1181390gqf c1181390gqf) {
        this.LL = c1181490gqp;
        this.LLILLJJLI = c1181630gr3;
        this.LLILLL = c1174000gek;
        this.LLILZ = c1181390gqf;
    }
}
