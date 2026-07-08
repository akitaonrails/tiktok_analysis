package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0O6U, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O6U extends C09AY implements Function1<C0O6W, Unit> {
    public final /* synthetic */ C0O6T LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O6U(C0O6T c0o6t) {
        super(1);
        this.LL = c0o6t;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0O6W c0o6w) {
        C0O6W c0o6w2 = c0o6w;
        c0o6w2.LIZ = c0o6w2.LIZ.LIZJ(new C0O8J(this.LL.LIZ().LIZIZ()));
        return Unit.LIZ;
    }
}
