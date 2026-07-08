package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dLY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1046780dLY extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1046780dLY(String str, long j, String str2, String str3) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = str2;
        this.LLILZ = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        String strLJZL;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C1046830dLd.LIZ.getClass();
        c1023640ckE2.withParam(C1046830dLd.LJIIJJI, this.LL);
        c1023640ckE2.withParam(C1046830dLd.LIZLLL, Long.valueOf(this.LLILLJJLI));
        c1023640ckE2.withParam(C1046830dLd.LJI, this.LLILLL);
        C1002190cBd c1002190cBd = C1046830dLd.LJFF;
        String str = this.LLILZ;
        if (str == null || (strLJZL = C13LN.LJZL(256, str)) == null) {
            strLJZL = "";
        }
        c1023640ckE2.withParam(c1002190cBd, strLJZL);
        return Unit.LIZ;
    }
}
