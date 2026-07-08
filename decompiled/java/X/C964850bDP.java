package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bDP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C964850bDP extends C09AY implements Function1<Long, Unit> {
    public final /* synthetic */ C965340bEC LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C964850bDP(C965340bEC c965340bEC) {
        super(1);
        this.LL = c965340bEC;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        this.LL.LLJLILLLLZIIL().LJII(l.longValue());
        C964760bDG c964760bDG = this.LL.LJIJI;
        c964760bDG.getClass();
        C965900bF6.LIZ(new C964780bDI(c964760bDG));
        return Unit.LIZ;
    }
}
