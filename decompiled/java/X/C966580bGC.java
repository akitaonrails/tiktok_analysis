package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bGC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966580bGC extends C09AY implements Function0<C968900bJw> {
    public final /* synthetic */ C965340bEC LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966580bGC(C965340bEC c965340bEC) {
        super(0);
        this.LL = c965340bEC;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C968900bJw invoke() {
        C965340bEC c965340bEC = this.LL;
        C968900bJw c968900bJw = new C968900bJw(c965340bEC.LJFF, c965340bEC.LJIILL, c965340bEC.LJIJI);
        this.LL.LJIILLIIL = c968900bJw;
        return c968900bJw;
    }
}
