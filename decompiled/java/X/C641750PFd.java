package X;

import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0PFd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C641750PFd implements InterfaceC641760PFe {
    public final List<Pair<Class<? extends InterfaceC494301wD>, InterfaceC494301wD>> LIZIZ;
    public boolean LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C641750PFd(List<? extends Pair<? extends Class<? extends InterfaceC494301wD>, ? extends InterfaceC494301wD>> list) {
        this.LIZIZ = list;
    }

    @Override // X.InterfaceC641760PFe
    public final void LIZ(InterfaceC665370Q7z interfaceC665370Q7z, InterfaceC594520NTm interfaceC594520NTm, InterfaceC655050Pmh interfaceC655050Pmh) {
        InterfaceC641770PFf interfaceC641770PFf;
        for (Pair<Class<? extends InterfaceC494301wD>, InterfaceC494301wD> pair : this.LIZIZ) {
            if (!this.LIZJ) {
                C1558520qew.LJII(interfaceC665370Q7z, pair.getSecond(), pair.getFirst(), null, null);
            }
            InterfaceC494301wD second = pair.getSecond();
            if ((second instanceof InterfaceC641770PFf) && (interfaceC641770PFf = (InterfaceC641770PFf) second) != null) {
                interfaceC641770PFf.LIZ(interfaceC594520NTm, interfaceC655050Pmh);
            }
        }
        this.LIZJ = true;
    }
}
