package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.164Z, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C164Z extends C09AY implements Function1<C164X<C0S5P, AbstractC207157164l>, Unit> {
    public final /* synthetic */ C207118162y LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C164Z(C207118162y c207118162y) {
        super(1);
        this.LL = c207118162y;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C164X<C0S5P, AbstractC207157164l> c164x) {
        C164X<C0S5P, AbstractC207157164l> c164x2 = c164x;
        c164x2.LIZJ = C207164164s.LIZIZ;
        c164x2.LIZIZ = C13LE.LIZ(C0S5L.class);
        c164x2.LIZ(new AnonymousClass1646(this.LL));
        return Unit.LIZ;
    }
}
