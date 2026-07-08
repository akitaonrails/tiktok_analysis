package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AY7, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AY7 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1AXM LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1AYC LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AY7(C1AXM c1axm, String str, C1AYC c1ayc) {
        super(0);
        this.LL = c1axm;
        this.LLILLJJLI = str;
        this.LLILLL = c1ayc;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LJJJLL().put(this.LLILLJJLI, this.LLILLL);
        return Unit.LIZ;
    }
}
