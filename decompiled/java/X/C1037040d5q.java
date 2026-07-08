package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0d5q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1037040d5q extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1037040d5q(String str, long j, boolean z) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C1023640ckE c1023640ckE) {
        String str;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C1042690dEx.LIZ.getClass();
        c1023640ckE2.withParam(C1042690dEx.LJJJJI, "prewarm");
        c1023640ckE2.withParam(C1042690dEx.LJJJJJL, this.LL);
        C1002190cBd c1002190cBd = C1042690dEx.LJJJJIZL;
        C1037010d5n.LIZ.getClass();
        c1023640ckE2.withParam(c1002190cBd, C1037010d5n.LIZJ());
        c1023640ckE2.withParam(C1042690dEx.LJJJJJ, Long.valueOf(this.LLILLJJLI));
        C1002190cBd c1002190cBd2 = C1042690dEx.LJJJJL;
        if (this.LLILLL) {
            str = "third";
        } else {
            str = "first";
        }
        c1023640ckE2.withParam(c1002190cBd2, str);
        return Unit.LIZ;
    }
}
