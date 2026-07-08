package X;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS102S0400000_4;

/* JADX INFO: renamed from: X.0du3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class C1068170du3 extends C2217421BqW implements Function1<Boolean, Unit> {
    public final /* synthetic */ AtomicBoolean LL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1068170du3(AtomicBoolean atomicBoolean, AwS102S0400000_4 awS102S0400000_4) {
        super(1, C1449605lu.class, "finish", "getValidPiListResolved$finish(Ljava/util/concurrent/atomic/AtomicBoolean;Lkotlin/jvm/functions/Function1;Z)V", 0);
        this.LL = atomicBoolean;
        this.LLILLJJLI = awS102S0400000_4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        AtomicBoolean atomicBoolean = this.LL;
        Function1<Boolean, Unit> function1 = this.LLILLJJLI;
        C1068720duw c1068720duw = C1068720duw.LIZ;
        if (atomicBoolean.compareAndSet(false, true)) {
            function1.invoke(Boolean.valueOf(zBooleanValue));
        }
        return Unit.LIZ;
    }
}
