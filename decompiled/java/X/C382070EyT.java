package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0EyT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C382070EyT extends C09AY implements Function1<C382080EyU, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ C381810Ey3 LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ Function1<List<C378700Et2>, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C382070EyT(long j, C381810Ey3 c381810Ey3, List list, AwS584S0100000_5 awS584S0100000_5) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = c381810Ey3;
        this.LLILLL = list;
        this.LLILZ = awS584S0100000_5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C382080EyU c382080EyU) {
        Integer num;
        String str;
        C382080EyU c382080EyU2 = c382080EyU;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LL;
        boolean z = c382080EyU2.LIZJ;
        if (z) {
            num = null;
        } else {
            num = c382080EyU2.LIZLLL;
        }
        if (z || (str = c382080EyU2.LJ) == null) {
            str = "";
        }
        C380450Evr c380450Evr = C380450Evr.LIZ;
        long j = c382080EyU2.LJFF;
        c380450Evr.getClass();
        C380450Evr.LIZ(z, num, str, jCurrentTimeMillis, j);
        this.LLILLJJLI.LJFF.put(this.LLILLL, c382080EyU2.LIZ);
        this.LLILZ.invoke(c382080EyU2.LIZ);
        return Unit.LIZ;
    }
}
