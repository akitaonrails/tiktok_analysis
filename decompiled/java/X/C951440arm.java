package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0arm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C951440arm extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C948340amm LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C951440arm(C948340amm c948340amm, int i) {
        super(2);
        this.LL = c948340amm;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        this.LL.LIZ(interfaceC1680500tpg, C341440Da2.LIZ(this.LLILLJJLI | 1));
        return Unit.LIZ;
    }
}
