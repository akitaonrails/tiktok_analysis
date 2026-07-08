package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Y1L, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y1L extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ C0YEM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y1L(C0YEM c0yem) {
        super(1);
        this.LL = c0yem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        new C0Y1J(this.LL).LJIIL(str);
        return Unit.LIZ;
    }
}
