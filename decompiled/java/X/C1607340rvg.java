package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: renamed from: X.0rvg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1607340rvg implements InterfaceC1609270ryn {
    public final Function1<Integer, Integer> LIZ;
    public final Function1<Integer, Integer> LIZIZ;
    public final AwS603S0100000_24 LIZJ;
    public final boolean LIZLLL;

    @Override // X.InterfaceC1609270ryn
    public final int LJIL() {
        return 8388693;
    }

    @Override // X.InterfaceC1609270ryn
    public final Function1<C1608740rxw, C1609310ryr> LJIJJ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1609270ryn
    public final boolean LJIJJLI() {
        return this.LIZLLL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1607340rvg(AnonymousClass0207 anonymousClass0207, int i) {
        AFwS229S0000000_2 aFwS229S0000000_2;
        Function1 function1 = (i & 1) != 0 ? AFwS264S0000000_24.get$arr$(566) : anonymousClass0207;
        if ((i & 2) != 0) {
            aFwS229S0000000_2 = AFwS229S0000000_2.get$arr$(574);
        } else {
            aFwS229S0000000_2 = null;
        }
        this((Function1<? super Integer, Integer>) function1, aFwS229S0000000_2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1607340rvg(Function1<? super Integer, Integer> function1, Function1<? super Integer, Integer> function12) {
        this.LIZ = function1;
        this.LIZIZ = function12;
        this.LIZJ = new AwS603S0100000_24(this, 428);
        this.LIZLLL = true;
    }
}
