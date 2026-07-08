package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DKz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C337510DKz extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ Integer LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C337510DKz(String str, String str2, boolean z, long j, Integer num, String str3, String str4) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = z;
        this.LLILZ = j;
        this.LLILZIL = num;
        this.LLILZLL = str3;
        this.LLIZ = str4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        String string;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C0DL1.LIZ.getClass();
        c1023640ckE2.withParam(C0DL1.LIZIZ, this.LL);
        c1023640ckE2.withParam(C0DL1.LIZJ, this.LLILLJJLI);
        c1023640ckE2.withParam(C0DL1.LIZLLL, String.valueOf(this.LLILLL));
        c1023640ckE2.withParam(C0DL1.LJ, String.valueOf(this.LLILZ));
        C1002190cBd c1002190cBd = C0DL1.LJFF;
        Integer num = this.LLILZIL;
        String str = "";
        if (num == null || (string = num.toString()) == null) {
            string = "";
        }
        c1023640ckE2.withParam(c1002190cBd, string);
        C1002190cBd c1002190cBd2 = C0DL1.LJI;
        String str2 = this.LLILZLL;
        if (str2 != null) {
            str = str2;
        }
        c1023640ckE2.withParam(c1002190cBd2, str);
        c1023640ckE2.withParam(C0DL1.LJII, this.LLIZ);
        return Unit.LIZ;
    }
}
