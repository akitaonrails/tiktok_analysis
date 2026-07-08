package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0k13, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1303150k13 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1303170k15 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ InterfaceC1303160k14 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1303150k13(InterfaceC1303160k14 interfaceC1303160k14, C1303170k15 c1303170k15, String str) {
        super(0);
        this.LL = c1303170k15;
        this.LLILLJJLI = str;
        this.LLILLL = interfaceC1303160k14;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.LL.LIZJ.get(this.LLILLJJLI) == null) {
            this.LLILLL.LIZ(null);
        } else {
            this.LLILLL.LIZ(this.LL.LIZJ.get(this.LLILLJJLI));
        }
        return Unit.LIZ;
    }
}
