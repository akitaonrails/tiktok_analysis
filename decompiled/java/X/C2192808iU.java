package X;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.08iU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2192808iU implements C01GW<InterfaceC497601wk> {
    public final Executor LL;
    public C2192608iS LLILLJJLI;

    @Override // X.C01GW
    public final boolean isInitialized() {
        return true;
    }

    @Override // X.C01GW
    public final InterfaceC497601wk getValue() {
        C2192608iS c2192608iS = this.LLILLJJLI;
        if (c2192608iS != null) {
            return c2192608iS;
        }
        C2192608iS c2192608iS2 = new C2192608iS(C09A1.LIZLLL(C2296908zH.LIZ(), C2182901Abw.LIZIZ(this.LL)));
        this.LLILLJJLI = c2192608iS2;
        return c2192608iS2;
    }

    public C2192808iU(Executor executor) {
        this.LL = executor;
    }
}
