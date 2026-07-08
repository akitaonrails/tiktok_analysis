package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AYA, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AYA extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ C2180891AWx LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AYA(C2180891AWx c2180891AWx) {
        super(1);
        this.LL = c2180891AWx;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        C20441214yg.LJIIIZ(this.LL.getTAG(), str);
        return Unit.LIZ;
    }
}
