package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0eJa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1084000eJa extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C1103240eoc LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1084000eJa(C1103240eoc c1103240eoc) {
        super(1);
        this.LL = c1103240eoc;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        InterfaceC1083960eJW interfaceC1083960eJWLIZ = this.LL.LIZ();
        if (interfaceC1083960eJWLIZ != null) {
            interfaceC1083960eJWLIZ.LIZIZ(zBooleanValue);
        }
        return Unit.LIZ;
    }
}
