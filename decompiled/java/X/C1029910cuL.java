package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0cuL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1029910cuL extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Integer LLILZ;
    public final /* synthetic */ C1029890cuJ LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1029910cuL(int i, int i2, int i3, Integer num, C1029890cuJ c1029890cuJ) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = num;
        this.LLILZIL = c1029890cuJ;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        String str;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C1029920cuM.LIZ.getClass();
        c1023640ckE2.withParam(C1029920cuM.LIZIZ, Integer.valueOf(this.LL));
        c1023640ckE2.withParam(C1029920cuM.LIZJ, Integer.valueOf(this.LLILLJJLI));
        c1023640ckE2.withParam(C1029920cuM.LIZLLL, Integer.valueOf(this.LLILLL));
        Integer num = this.LLILZ;
        C1029890cuJ c1029890cuJ = this.LLILZIL;
        if (num != null) {
            int iIntValue = num.intValue();
            C1002190cBd c1002190cBd = C1029920cuM.LJ;
            c1029890cuJ.getClass();
            if (iIntValue != 0) {
                if (iIntValue != 1) {
                    str = "";
                } else {
                    str = "h5";
                }
            } else {
                str = "lynx";
            }
            c1023640ckE2.withParam(c1002190cBd, str);
        }
        return Unit.LIZ;
    }
}
