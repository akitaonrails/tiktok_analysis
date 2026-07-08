package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.164V, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C164V extends C09AY implements Function1<C164X<C0S5P, AbstractC207157164l>, Unit> {
    public final /* synthetic */ C207118162y LL;
    public final /* synthetic */ C164P<C0S5P, AbstractC207157164l> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C164V(C207118162y c207118162y, C164P<C0S5P, AbstractC207157164l> c164p) {
        super(1);
        this.LL = c207118162y;
        this.LLILLJJLI = c164p;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C164X<C0S5P, AbstractC207157164l> c164x) {
        C164X<C0S5P, AbstractC207157164l> c164x2 = c164x;
        c164x2.LIZJ = C207163164r.LIZIZ;
        c164x2.LIZIZ = C13LE.LIZ(C0S5K.class);
        c164x2.LIZ(new C207123163d(this.LL, this.LLILLJJLI));
        return Unit.LIZ;
    }
}
