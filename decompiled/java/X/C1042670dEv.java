package X;

import Y.ARunnableS21S1100000_16;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0dEv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1042670dEv extends C09AY implements InterfaceC1685420txc<Boolean, String, Integer, Integer, Long, Unit> {
    public final /* synthetic */ C1042650dEt LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1042670dEv(C1042650dEt c1042650dEt, String str) {
        super(5);
        this.LL = c1042650dEt;
        this.LLILLJJLI = str;
    }

    @Override // X.InterfaceC1685420txc
    public final Unit invoke(Boolean bool, String str, Integer num, Integer num2, Long l) {
        String str2;
        boolean zBooleanValue = bool.booleanValue();
        String str3 = str;
        Integer num3 = num;
        int iIntValue = num2.intValue();
        long jLongValue = l.longValue();
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IPreloadEventListener success=");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(". url:");
        sbLIZ.append(str3);
        sbLIZ.append(", errorCode:");
        sbLIZ.append(num3);
        sbLIZ.append(", httpCode:");
        sbLIZ.append(iIntValue);
        sbLIZ.append(", duration:");
        sbLIZ.append(jLongValue);
        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "CommerceLandPageSSPContext_", 2);
        if (!zBooleanValue) {
            C1042650dEt c1042650dEt = this.LL;
            if (str3 == null) {
                str2 = this.LLILLJJLI;
            } else {
                str2 = str3;
            }
            c1042650dEt.getClass();
            C1043040dFW.LIZ(new ARunnableS21S1100000_16(c1042650dEt, str2, 3));
            C1042650dEt c1042650dEt2 = this.LL;
            String str4 = c1042650dEt2.LIZIZ;
            String str5 = c1042650dEt2.LIZLLL;
            if (str3 == null) {
                str3 = this.LLILLJJLI;
            }
            String value = C1042580dEm.LJIILIIL.getValue();
            C1035880d3y c1035880d3y = this.LL.LJIIIZ;
            C1001830cB3 c1001830cB3 = new C1001830cB3(new Object[0]);
            C1042680dEw.LIZ.getClass();
            c1001830cB3.log(C1042680dEw.LJ, new C1042720dF0(iIntValue, jLongValue, c1035880d3y, num3, value, str4, str5, str3));
        }
        return Unit.LIZ;
    }
}
