package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1D2O, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D2O extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Long LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1D2O(String str, Long l, String str2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = l;
        this.LLILLL = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        C1023640ckE c1023640ckE2 = c1023640ckE;
        String str = this.LL;
        if (str != null) {
            C1D2Q.LIZ.getClass();
            c1023640ckE2.withParam(C1D2Q.LJI, str);
        }
        Long l = this.LLILLJJLI;
        if (l != null) {
            long jLongValue = l.longValue();
            C1D2Q.LIZ.getClass();
            c1023640ckE2.withParam(C1D2Q.LJII, Long.valueOf(jLongValue));
        }
        String str2 = this.LLILLL;
        if (str2 != null) {
            C1D2Q.LIZ.getClass();
            c1023640ckE2.withParam(C1D2Q.LJIIIIZZ, str2);
        }
        return Unit.LIZ;
    }
}
