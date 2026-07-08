package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.164U, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C164U extends C09AY implements Function1<C164W<C0S5P, AbstractC207157164l>, Unit> {
    public final /* synthetic */ C207118162y LL;
    public final /* synthetic */ C164P<C0S5P, AbstractC207157164l> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C164U(C207118162y c207118162y, C164P<C0S5P, AbstractC207157164l> c164p) {
        super(1);
        this.LL = c207118162y;
        this.LLILLJJLI = c164p;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C164W<C0S5P, AbstractC207157164l> c164w) {
        C164W<C0S5P, AbstractC207157164l> c164w2 = c164w;
        c164w2.LIZ = C13LE.LIZ(C709290Rrz.class);
        c164w2.onEvent(new C164V(this.LL, this.LLILLJJLI));
        return Unit.LIZ;
    }
}
