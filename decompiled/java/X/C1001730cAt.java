package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0cAt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1001730cAt extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C259800zU<String> LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1001730cAt(boolean z, String str, C259800zU<String> c259800zU, long j) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = c259800zU;
        this.LLILZ = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        String str;
        String str2;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C1042690dEx.LIZ.getClass();
        c1023640ckE2.withParam(C1042690dEx.LJJJJI, "prefetchHTML");
        C1002190cBd c1002190cBd = C1042690dEx.LJJJJJL;
        if (this.LL) {
            str = "prefetch_done";
        } else {
            str = "prefetch_done_but_fail";
        }
        c1023640ckE2.withParam(c1002190cBd, str);
        c1023640ckE2.withParam(C1042690dEx.LJJJJLI, this.LLILLJJLI);
        C1002190cBd c1002190cBd2 = C1042690dEx.LJJJZ;
        if (this.LLILLL.element != null) {
            str2 = "redirect";
        } else {
            str2 = "normal";
        }
        c1023640ckE2.withParam(c1002190cBd2, str2);
        c1023640ckE2.withParam(C1042690dEx.LJJJJJ, Long.valueOf(System.currentTimeMillis() - this.LLILZ));
        return Unit.LIZ;
    }
}
