package X;

import Y.ARunnableS39S0400000_31;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.14le, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20360414le extends C09AY implements Function2<Boolean, String, Unit> {
    public final /* synthetic */ AtomicInteger LL;
    public final /* synthetic */ AtomicBoolean LLILLJJLI;
    public final /* synthetic */ Runnable LLILLL;
    public final /* synthetic */ C20359714lX LLILZ;
    public final /* synthetic */ List<C20361214lm> LLILZIL;
    public final /* synthetic */ C20359414lU LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20360414le(AtomicInteger atomicInteger, AtomicBoolean atomicBoolean, ARunnableS39S0400000_31 aRunnableS39S0400000_31, C20359714lX c20359714lX, List list, C20359414lU c20359414lU) {
        super(2);
        this.LL = atomicInteger;
        this.LLILLJJLI = atomicBoolean;
        this.LLILLL = aRunnableS39S0400000_31;
        this.LLILZ = c20359714lX;
        this.LLILZIL = list;
        this.LLILZLL = c20359414lU;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, String str) {
        boolean zBooleanValue = bool.booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unDoDecoration, isSuccess: ");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(", message: ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("PlaybookDirector", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LL.decrementAndGet() == 0) {
            AtomicBoolean atomicBoolean = this.LLILLJJLI;
            Runnable runnable = this.LLILLL;
            C20359714lX c20359714lX = this.LLILZ;
            List<C20361214lm> list = this.LLILZIL;
            C20359414lU c20359414lU = this.LLILZLL;
            if (atomicBoolean.compareAndSet(false, true)) {
                C473410IhP.LJ(runnable);
                c20359714lX.LJIILLIIL(c20359414lU, list);
            }
        }
        return Unit.LIZ;
    }
}
