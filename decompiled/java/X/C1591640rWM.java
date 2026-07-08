package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rWM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1591640rWM extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1592450rXf LL;
    public final /* synthetic */ InterfaceC1583870rJp LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1591640rWM(C1592450rXf c1592450rXf, InterfaceC1583870rJp interfaceC1583870rJp) {
        super(0);
        this.LL = c1592450rXf;
        this.LLILLJJLI = interfaceC1583870rJp;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LJIJI(this.LLILLJJLI.tag());
        return Unit.LIZ;
    }
}
