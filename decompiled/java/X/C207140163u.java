package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.163u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207140163u extends C09AY implements Function1<C164P<C0S5P, AbstractC207157164l>, Unit> {
    public final /* synthetic */ C207118162y LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207140163u(C207118162y c207118162y) {
        super(1);
        this.LL = c207118162y;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C164P<C0S5P, AbstractC207157164l> c164p) {
        C164P<C0S5P, AbstractC207157164l> c164p2 = c164p;
        C164S.LIZ(c164p2, new C164U(this.LL, c164p2));
        C164S.LIZ(c164p2, new C207149164d(this.LL));
        C164S.LIZ(c164p2, new C207151164f(this.LL));
        C164S.LIZ(c164p2, new C207146164a(this.LL));
        c164p2.LJIILL(new AnonymousClass1642(c164p2));
        return Unit.LIZ;
    }
}
