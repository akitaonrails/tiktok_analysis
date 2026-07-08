package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AY3, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AY3 extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C1AXM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AY3(C1AXM c1axm) {
        super(1);
        this.LL = c1axm;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        this.LL.LLJ(bool.booleanValue());
        return Unit.LIZ;
    }
}
