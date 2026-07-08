package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1D2w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2249521D2w extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2249521D2w(String str, String str2, Integer num, String str3) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = num;
        this.LLILZ = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        String string;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C2249541D2y.LIZ.getClass();
        c1023640ckE2.withParam(C2249541D2y.LIZIZ, this.LL);
        c1023640ckE2.withParam(C2249541D2y.LIZJ, this.LLILLJJLI);
        C1002190cBd c1002190cBd = C2249541D2y.LIZLLL;
        Integer num = this.LLILLL;
        String str = "";
        if (num == null || (string = num.toString()) == null) {
            string = "";
        }
        c1023640ckE2.withParam(c1002190cBd, string);
        C1002190cBd c1002190cBd2 = C2249541D2y.LJ;
        String str2 = this.LLILZ;
        if (str2 != null) {
            str = str2;
        }
        c1023640ckE2.withParam(c1002190cBd2, str);
        return Unit.LIZ;
    }
}
