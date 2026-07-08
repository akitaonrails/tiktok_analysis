package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0C41, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C41 extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ C259800zU<String> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0C41(C259800zU<String> c259800zU) {
        super(1);
        this.LL = c259800zU;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        this.LL.element = str;
        return Unit.LIZ;
    }
}
