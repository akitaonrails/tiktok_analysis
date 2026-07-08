package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.164d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207149164d extends C09AY implements Function1<C164W<C0S5P, AbstractC207157164l>, Unit> {
    public final /* synthetic */ C207118162y LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207149164d(C207118162y c207118162y) {
        super(1);
        this.LL = c207118162y;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C164W<C0S5P, AbstractC207157164l> c164w) {
        C164W<C0S5P, AbstractC207157164l> c164w2 = c164w;
        c164w2.LIZ = C13LE.LIZ(C0S5K.class);
        c164w2.onEvent(new C207147164b(this.LL));
        c164w2.onEvent(new C207153164h());
        c164w2.onEvent(new C207148164c(this.LL));
        return Unit.LIZ;
    }
}
