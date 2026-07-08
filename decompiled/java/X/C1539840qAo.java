package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0qAo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1539840qAo extends C09AY implements Function2<C1539820qAm, Throwable, Unit> {
    public final /* synthetic */ Function1<C1539820qAm, Unit> LL;
    public final /* synthetic */ Function1<Throwable, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1539840qAo(C1539590qAP c1539590qAP, C1539750qAf c1539750qAf) {
        super(2);
        this.LL = c1539590qAP;
        this.LLILLJJLI = c1539750qAf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C1539820qAm c1539820qAm, Throwable th) {
        if (c1539820qAm != null) {
            this.LL.invoke(c1539820qAm);
        } else {
            Function1<Throwable, Unit> function1 = this.LLILLJJLI;
            if (th == null) {
                th = new Throwable("RemoteBundleProvider provideTemplate failed");
            }
            function1.invoke(th);
        }
        return Unit.LIZ;
    }
}
