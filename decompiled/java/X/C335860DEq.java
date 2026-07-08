package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DEq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C335860DEq extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C335860DEq(int i, int i2, String str, boolean z) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = z;
        this.LLILLL = i2;
        this.LLILZ = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        long j;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C2265331Dlb.LIZ.getClass();
        c1023640ckE2.withParam(C2265331Dlb.LJIJJ, Long.valueOf(this.LL));
        C1002190cBd c1002190cBd = C2265331Dlb.LJIJJLI;
        if (this.LLILLJJLI) {
            j = 1;
        } else {
            j = 0;
        }
        c1023640ckE2.withParam(c1002190cBd, Long.valueOf(j));
        c1023640ckE2.withParam(C2265331Dlb.LJIL, Long.valueOf(this.LLILLL));
        String str = this.LLILZ;
        if (str != null) {
            c1023640ckE2.withParam(C2265331Dlb.LJIJ, str);
        }
        return Unit.LIZ;
    }
}
