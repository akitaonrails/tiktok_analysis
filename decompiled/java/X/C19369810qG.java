package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.10qG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19369810qG extends AbstractC20055413dY implements InterfaceC19369910qH {
    public Function1<? super C00BA, Boolean> LLJJ;
    public Function1<? super C00BA, Boolean> LLJJI;

    @Override // X.InterfaceC19369910qH
    public final boolean LJJIL(C00BA c00ba) {
        Function1<? super C00BA, Boolean> function1 = this.LLJJ;
        if (function1 != null) {
            return function1.invoke(c00ba).booleanValue();
        }
        return false;
    }

    @Override // X.InterfaceC19369910qH
    public final boolean LJJJJL(C00BA c00ba) {
        Function1<? super C00BA, Boolean> function1 = this.LLJJI;
        if (function1 != null) {
            return function1.invoke(c00ba).booleanValue();
        }
        return false;
    }

    public C19369810qG(Function1<? super C00BA, Boolean> function1, Function1<? super C00BA, Boolean> function12) {
        this.LLJJ = function1;
        this.LLJJI = function12;
    }
}
