package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0jPh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1279990jPh extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1276910jKj LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1279990jPh(C1276910jKj c1276910jKj, String str, long j) {
        super(0);
        this.LL = c1276910jKj;
        this.LLILLJJLI = str;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC1279800jPO interfaceC1279800jPO = this.LL.LLJJJ;
        if (interfaceC1279800jPO != null) {
            interfaceC1279800jPO.LJJIZ(this.LLILLJJLI, this.LLILLL);
        }
        return Unit.LIZ;
    }
}
