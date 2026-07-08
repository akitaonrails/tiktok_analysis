package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.09Zt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2394309Zt extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ C0X9S LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2394309Zt(C0X9S c0x9s) {
        super(1);
        this.LL = c0x9s;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        this.LL.cancel();
        return Unit.LIZ;
    }
}
