package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0cAq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1001700cAq extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1001700cAq(boolean z, String str, String str2, String str3, String str4) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        String strLIZIZ;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C1042690dEx.LIZ.getClass();
        c1023640ckE2.withParam(C1042690dEx.LJJJJI, "prefetchHTMLRedirect");
        C1002190cBd c1002190cBd = C1042690dEx.LJJJJJL;
        if (this.LL) {
            strLIZIZ = "success";
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fail-");
            sbLIZ.append(this.LLILLJJLI);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        c1023640ckE2.withParam(c1002190cBd, strLIZIZ);
        c1023640ckE2.withParam(C1042690dEx.LJJJJLI, this.LLILLL);
        c1023640ckE2.withParam(C1042690dEx.LJJJZ, "prefetch");
        c1023640ckE2.withParam(C1042690dEx.LJJL, this.LLILZ);
        c1023640ckE2.withParam(C1042690dEx.LJJJLL, this.LLILZIL);
        return Unit.LIZ;
    }
}
