package X;

import com.bytedance.assem.arch.core.AssemSupervisor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RKt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C694170RKt extends C09AY implements Function1<AssemSupervisor, C0RTC<?>> {
    public final /* synthetic */ Function1<C0RTA, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C694170RKt(Function1<? super C0RTA, Unit> function1) {
        super(1);
        this.LL = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0RTC<?> invoke(AssemSupervisor assemSupervisor) {
        C0RTA c0rta = new C0RTA();
        this.LL.invoke(c0rta);
        return c0rta;
    }
}
