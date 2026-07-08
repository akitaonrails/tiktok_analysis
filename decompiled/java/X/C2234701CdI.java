package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1CdI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2234701CdI extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C2234651CdD LL;
    public final /* synthetic */ List<String> LLILLJJLI;
    public final /* synthetic */ InterfaceC967450bHb LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234701CdI(C2234651CdD c2234651CdD, List<String> list, InterfaceC967450bHb interfaceC967450bHb) {
        super(0);
        this.LL = c2234651CdD;
        this.LLILLJJLI = list;
        this.LLILLL = interfaceC967450bHb;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LIZ.LLJILJILJ(this.LLILLJJLI);
        InterfaceC967450bHb interfaceC967450bHb = this.LLILLL;
        if (interfaceC967450bHb != null) {
            interfaceC967450bHb.LJJL();
        }
        return Unit.LIZ;
    }
}
