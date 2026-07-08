package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ZBP, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZBP extends C09AY implements Function1<C062P<InterfaceC111300bX>, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZBP(String str, String str2, boolean z) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C062P<InterfaceC111300bX> c062p) {
        c062p.LIZ = new C0ZBR(this.LL, this.LLILLJJLI, this.LLILLL);
        return Unit.LIZ;
    }
}
