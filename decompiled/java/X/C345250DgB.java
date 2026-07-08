package X;

import g3a.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS75S1000000_25;

/* JADX INFO: renamed from: X.0DgB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C345250DgB<T> extends a implements InterfaceC1408530ml1 {
    public final Function0<? extends T> LLIZLLLIL;
    public final Function1<? super T, Unit> LLJ;

    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZIZ() {
        return false;
    }

    @Override // g3a.a, X.AbstractRunnableC21377818lM, java.lang.Runnable, X.InterfaceC1408530ml1
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("EditIOTask@9ac4.run");
        try {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C314000CSo(this, null), 2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditIOTask@9ac4.run");
    }

    @Override // X.InterfaceC1408530ml1
    public final EnumC194317110p LIZJ() {
        return EnumC194317110p.P2;
    }

    public C345250DgB(String str, Function0<? extends T> function0, Function1<? super T, Unit> function1) {
        this.LLIZLLLIL = function0;
        this.LLJ = function1;
        LJ(new AwS75S1000000_25(str, 10));
    }
}
