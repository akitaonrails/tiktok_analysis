package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JXA, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JXA extends C09AY implements Function0<C0RTY> {
    public final /* synthetic */ C01GW LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JXA(C01GW c01gw) {
        super(0);
        this.LL = c01gw;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C0RTY invoke() {
        Function0<C0RTY> function0 = C451650HnP.LIZJ(this.LL).LIZJ;
        if (function0 != null) {
            return function0.invoke();
        }
        return null;
    }
}
