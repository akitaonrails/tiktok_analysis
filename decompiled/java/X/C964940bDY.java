package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bDY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C964940bDY extends C09AY implements Function0<C964950bDZ> {
    public final /* synthetic */ C965340bEC LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C964940bDY(C965340bEC c965340bEC) {
        super(0);
        this.LL = c965340bEC;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C964950bDZ invoke() {
        int i = this.LL.LIZIZ;
        if (i != 2 && i != 0) {
            return null;
        }
        C965340bEC c965340bEC = this.LL;
        return new C964950bDZ(c965340bEC, new C964850bDP(c965340bEC), new C964820bDM(this.LL));
    }
}
