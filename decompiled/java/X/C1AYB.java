package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AYB, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AYB extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1AXM LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AYB(C1AXM c1axm, String str) {
        super(0);
        this.LL = c1axm;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LJJJLL().remove(this.LLILLJJLI);
        return Unit.LIZ;
    }
}
