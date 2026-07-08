package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0jPW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1279880jPW extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1276910jKj LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1279880jPW(C1276910jKj c1276910jKj) {
        super(0);
        this.LL = c1276910jKj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC1279800jPO interfaceC1279800jPO = this.LL.LLJJJ;
        if (interfaceC1279800jPO != null) {
            interfaceC1279800jPO.LJLJJL(true, null);
        }
        InterfaceC1279800jPO interfaceC1279800jPO2 = this.LL.LLJJJ;
        if (interfaceC1279800jPO2 != null) {
            interfaceC1279800jPO2.LJJLIIIJJIZ("EndSuccess");
        }
        return Unit.LIZ;
    }
}
