package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01eV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C384501eV extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ InterfaceC420801kM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C384501eV(C11JF c11jf) {
        super(1);
        this.LL = c11jf;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        this.LL.dispose();
        return Unit.LIZ;
    }
}
