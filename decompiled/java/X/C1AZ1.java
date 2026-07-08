package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AZ1, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AZ1 extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ C1AXM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AZ1(C1AXM c1axm) {
        super(1);
        this.LL = c1axm;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        C20441214yg.LJIIIZ(this.LL.LJLLL(), str);
        return Unit.LIZ;
    }
}
