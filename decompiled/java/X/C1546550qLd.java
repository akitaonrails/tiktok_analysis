package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS308S0000000_23;

/* JADX INFO: renamed from: X.0qLd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546550qLd extends C09AY implements Function2<String, InterfaceC1105930esx, Unit> {
    public final /* synthetic */ C1546510qLZ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1546550qLd(C1546510qLZ c1546510qLZ) {
        super(2);
        this.LL = c1546510qLZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, InterfaceC1105930esx interfaceC1105930esx) {
        InterfaceC1105930esx interfaceC1105930esx2 = interfaceC1105930esx;
        interfaceC1105930esx2.release();
        AFwS308S0000000_23 aFwS308S0000000_23 = this.LL.LJIIJJI;
        if (aFwS308S0000000_23 != null) {
            aFwS308S0000000_23.invoke(interfaceC1105930esx2, EnumC1154190g8n.REMOVE_BY_OVERLOAD);
        }
        return Unit.LIZ;
    }
}
