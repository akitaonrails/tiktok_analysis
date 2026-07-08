package X;

import android.text.TextUtils;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0RbM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698980RbM {
    public final InterfaceC699030RbR LIZ;
    public String LIZLLL;
    public final C0S4J LIZIZ = new C0S4J("CallNodeProcessor");
    public final C01GW LIZJ = C452501pT.LIZIZ(new C699010RbP());
    public final RunnableC698990RbN LJ = new RunnableC698990RbN(this);

    public final Set<C699000RbO> LIZIZ() {
        return (Set) this.LIZJ.getValue();
    }

    public C698980RbM(InterfaceC699030RbR interfaceC699030RbR) {
        this.LIZ = interfaceC699030RbR;
    }

    public final void LIZ(C699000RbO c699000RbO) {
        this.LIZLLL = c699000RbO.LLILLJJLI;
        if (c699000RbO.LL > -1 && LIZIZ().add(c699000RbO)) {
            List listLJLLLL = C13LP.LJLLLL(new Comparator() { // from class: X.0RZR
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return C20085613iQ.LIZIZ(Integer.valueOf(((C699000RbO) t).LL), Integer.valueOf(((C699000RbO) t2).LL));
                }
            }, LIZIZ());
            LIZIZ().clear();
            LIZIZ().addAll(listLJLLLL);
            if (LIZIZ().isEmpty()) {
                this.LIZIZ.LJIIJJI(AFwS198S0000000_11.get$arr$(456));
                return;
            }
            C699000RbO c699000RbO2 = (C699000RbO) C13LP.LJJLIIIJILLIZJL(LIZIZ());
            if (1 != c699000RbO2.LL || !TextUtils.equals(this.LIZLLL, c699000RbO2.LLILLJJLI)) {
                return;
            }
            for (C699000RbO c699000RbO3 : LIZIZ()) {
                if (c699000RbO3.LL == 0 && TextUtils.equals(this.LIZLLL, c699000RbO3.LLILLJJLI)) {
                    C799570VYd.LIZJ().removeCallbacks(this.LJ);
                    this.LJ.run();
                    return;
                }
            }
            C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), this.LJ);
        }
    }
}
