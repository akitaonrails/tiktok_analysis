package X;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0NOQ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NOQ extends C09AY implements Function1<C0NOP, C0NOP> {
    public final /* synthetic */ Function1<C0NOP, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0NOQ(Function1<? super C0NOP, Unit> function1) {
        super(1);
        this.LL = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0NOP invoke(C0NOP c0nop) {
        if (c0nop == null) {
            c0nop = new C0NOP(new LinkedHashMap());
        }
        this.LL.invoke(c0nop);
        return c0nop;
    }
}
