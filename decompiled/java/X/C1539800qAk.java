package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0qAk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1539800qAk extends C09AY implements Function2<C1539820qAm, Throwable, Unit> {
    public final /* synthetic */ Function1<C1539820qAm, Unit> LL;
    public final /* synthetic */ Function1<Throwable, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1539800qAk(C1539590qAP c1539590qAP, C1539750qAf c1539750qAf) {
        super(2);
        this.LL = c1539590qAP;
        this.LLILLJJLI = c1539750qAf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C1539820qAm c1539820qAm, Throwable th) {
        C1539820qAm c1539820qAm2 = c1539820qAm;
        if (c1539820qAm2 != null) {
            Function1<C1539820qAm, Unit> function1 = this.LL;
            c1539820qAm2.LIZIZ.put("cacheStatus", 1);
            function1.invoke(c1539820qAm2);
        } else {
            Function1<Throwable, Unit> function12 = this.LLILLJJLI;
            if (th == null) {
                th = new Throwable("getCachedBundle failed");
            }
            function12.invoke(th);
        }
        return Unit.LIZ;
    }
}
