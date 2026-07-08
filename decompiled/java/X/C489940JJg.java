package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JJg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C489940JJg extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC420801kM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C489940JJg(C11JF c11jf) {
        super(0);
        this.LL = c11jf;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.dispose();
        return Unit.LIZ;
    }
}
