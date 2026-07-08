package X;

import com.google.gson.n;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ekO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1100620ekO extends C09AY implements Function1<n, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1100630ekP LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Function1<Object, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1100620ekO(long j, String str, C1100630ekP c1100630ekP, String str2, Function1<Object, Unit> function1) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = c1100630ekP;
        this.LLILZ = str2;
        this.LLILZIL = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(n nVar) {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LL;
        C1106750euH c1106750euH = C1106750euH.LIZ;
        C1106750euH.LJ().LJFF(this.LLILLJJLI, nVar, this.LLILLL.LIZIZ);
        C1106750euH.LJIILIIL(this.LLILZ, jCurrentTimeMillis, this.LLILLL.LIZJ, C1106750euH.LJ().LIZJ(), true, null);
        this.LLILZIL.invoke(nVar);
        return Unit.LIZ;
    }
}
