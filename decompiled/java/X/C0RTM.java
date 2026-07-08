package X;

import com.bytedance.assem.arch.core.AssemSupervisor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RTM, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RTM extends C09AY implements Function1<AssemSupervisor, C0RTC<?>> {
    public final /* synthetic */ Function1<C0RTH, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0RTM(Function1<? super C0RTH, Unit> function1) {
        super(1);
        this.LL = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0RTC<?> invoke(AssemSupervisor assemSupervisor) {
        C0RTH c0rth = new C0RTH();
        this.LL.invoke(c0rth);
        return c0rth;
    }
}
