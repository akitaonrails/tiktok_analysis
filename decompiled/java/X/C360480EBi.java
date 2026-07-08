package X;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0EBi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C360480EBi extends C09AY implements Function1<C360990EDh, C360990EDh> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ double LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C360480EBi(int i, int i2, long j, double d) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = j;
        this.LLILZ = d;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C360990EDh invoke(C360990EDh c360990EDh) {
        Pair pair = new Pair(Integer.valueOf(this.LL), Integer.valueOf(this.LLILLJJLI));
        int iLIZIZ = (int) (C352310DrZ.LIZIZ(this.LLILLL) * 10.0f);
        int i = this.LL;
        Integer numValueOf = Integer.valueOf(((int) (this.LLILZ * ((double) 10.0f))) - i);
        Boolean bool = Boolean.TRUE;
        return C360990EDh.LIZ(c360990EDh, null, null, null, null, pair, iLIZIZ - i, numValueOf, bool, bool, null, 527);
    }
}
