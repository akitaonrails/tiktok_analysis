package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qef, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1558350qef extends C09AY implements Function1<C0RUS, Unit> {
    public final /* synthetic */ C13IQ<? extends AbstractC738140SxQ> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1558350qef(C13IQ<? extends AbstractC738140SxQ> c13iq) {
        super(1);
        this.LL = c13iq;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RUS c0rus) {
        c0rus.LL = this.LL;
        return Unit.LIZ;
    }
}
