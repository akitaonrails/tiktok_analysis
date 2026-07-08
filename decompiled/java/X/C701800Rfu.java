package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Rfu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701800Rfu extends C09AY implements Function2<String, Boolean, Unit> {
    public final /* synthetic */ C701490RfP LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C701800Rfu(C701490RfP c701490RfP) {
        super(2);
        this.LL = c701490RfP;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Boolean bool) {
        String str2 = str;
        boolean zBooleanValue = bool.booleanValue();
        InterfaceC702000RgE interfaceC702000RgE = this.LL.LL;
        if (interfaceC702000RgE != null) {
            interfaceC702000RgE.LIZIZ(str2, zBooleanValue, true);
        }
        return Unit.LIZ;
    }
}
