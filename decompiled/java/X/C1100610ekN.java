package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ekN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1100610ekN extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1100630ekP LLILLL;
    public final /* synthetic */ Function1<Throwable, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1100610ekN(long j, String str, C1100630ekP c1100630ekP, Function1<? super Throwable, Unit> function1) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = c1100630ekP;
        this.LLILZ = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        Throwable th2 = th;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LL;
        C1106750euH c1106750euH = C1106750euH.LIZ;
        C1106750euH.LJIILIIL(this.LLILLJJLI, jCurrentTimeMillis, this.LLILLL.LIZJ, C1106750euH.LJ().LIZJ(), false, Integer.valueOf(C512240K7a.LIZ(th2)));
        this.LLILZ.invoke(th2);
        return Unit.LIZ;
    }
}
