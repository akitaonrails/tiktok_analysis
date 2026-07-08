package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DEK, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DEK extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DEK(String str, int i, long j) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        String str;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C0DEL.LIZ.getClass();
        c1023640ckE2.withParam(C0DEL.LIZIZ, this.LL);
        C1002190cBd c1002190cBd = C0DEL.LIZJ;
        int i = this.LLILLJJLI;
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i == 4) {
                    str = "system_back";
                } else {
                    str = "tap_mask";
                }
            } else {
                str = "pulldown";
            }
        } else {
            str = "back_button";
        }
        c1023640ckE2.withParam(c1002190cBd, str);
        c1023640ckE2.withParam(C0DEL.LIZLLL, String.valueOf(this.LLILLL));
        c1023640ckE2.withParam(C0DEL.LJIIJ, 1);
        return Unit.LIZ;
    }
}
