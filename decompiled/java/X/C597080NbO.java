package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NbO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C597080NbO extends C09AY implements Function2<String, Long, Unit> {
    public final /* synthetic */ C238400w2 LL;
    public final /* synthetic */ C238400w2 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C597080NbO(C238400w2 c238400w2, C238400w2 c238400w22) {
        super(2);
        this.LL = c238400w2;
        this.LLILLJJLI = c238400w22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Long l) {
        long jLongValue = l.longValue();
        if (Intrinsics.LJFF(str, "cold_start_action")) {
            this.LL.element = jLongValue;
        } else if (Intrinsics.LJFF(str, "runtime_action")) {
            this.LLILLJJLI.element = jLongValue;
        }
        return Unit.LIZ;
    }
}
