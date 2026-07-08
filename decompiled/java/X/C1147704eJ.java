package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04eJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1147704eJ extends C09AY implements Function1<C0RUS, Unit> {
    public final /* synthetic */ C13IQ<? extends AbstractC738140SxQ> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1147704eJ(C13IQ<? extends AbstractC738140SxQ> c13iq) {
        super(1);
        this.LL = c13iq;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RUS c0rus) {
        c0rus.LL = this.LL;
        return Unit.LIZ;
    }
}
