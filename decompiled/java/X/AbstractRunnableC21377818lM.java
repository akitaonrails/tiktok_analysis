package X;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18lM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractRunnableC21377818lM implements Runnable {
    public boolean LLILZ;
    public volatile EnumC1779780wPo LL = EnumC1779780wPo.PENDING;
    public long LLILLJJLI = -1;
    public C1661770tLT LLILLL = new C1661770tLT(0);
    public final ArrayList<InterfaceC21377918lN> LLILZIL = new ArrayList<>();

    public void LJII() {
    }

    public final synchronized void LJIIIIZZ() {
        for (InterfaceC21377918lN interfaceC21377918lN : this.LLILZIL) {
            interfaceC21377918lN.onComplete();
            LJFF(interfaceC21377918lN);
        }
        C21377618lK.LIZIZ(this);
        this.LL = EnumC1779780wPo.DONE;
    }

    @Override // java.lang.Runnable, X.InterfaceC1408530ml1
    public void run() {
        boolean zLIZ;
        C1C7U.LIZ("SchedulableTask@520.run");
        try {
            LJII();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SchedulableTask@520.run");
    }

    public final String toString() {
        if (this.LLILLL.LIZ.length() == 0) {
            return super.toString();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILLL.LIZ);
        sbLIZ.append('@');
        sbLIZ.append(hashCode());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final synchronized void LIZLLL(InterfaceC21377918lN interfaceC21377918lN) {
        this.LLILZIL.add(interfaceC21377918lN);
    }

    public final void LJ(Function1<? super C1661770tLT, Unit> function1) {
        if (this.LLILZ) {
            return;
        }
        C1661770tLT c1661770tLT = new C1661770tLT(0);
        function1.invoke(c1661770tLT);
        this.LLILLL = c1661770tLT;
        this.LLILZ = true;
    }

    public final synchronized void LJFF(InterfaceC21377918lN interfaceC21377918lN) {
        this.LLILZIL.remove(interfaceC21377918lN);
    }
}
