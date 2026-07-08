package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1A01, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A01 extends C09AY implements Function0<InterfaceC665370Q7z> {
    public final /* synthetic */ C01GW LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1A01(C01GW c01gw) {
        super(0);
        this.LL = c01gw;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ InterfaceC665370Q7z invoke() {
        Function0<InterfaceC665370Q7z> function0 = C451650HnP.LIZJ(this.LL).LJ;
        if (function0 != null) {
            return function0.invoke();
        }
        return null;
    }
}
