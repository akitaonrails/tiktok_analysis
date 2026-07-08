package Y;

import X.C189200o6;
import X.C2188811AlT;
import X.C2239221Cka;
import X.C2252611DEt;
import X.EnumC1779550wPR;
import X.InterfaceC20236714Gf;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public class AObjectS92S1100000_3 implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS92S1100000_3 aObjectS92S1100000_3) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) aObjectS92S1100000_3.l1;
        C2239221Cka c2239221Cka = new C2239221Cka(true, 2, "", aObjectS92S1100000_3.s0);
        C189200o6.m2constructorimpl(c2239221Cka);
        interfaceC20236714Gf.resumeWith(c2239221Cka);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS92S1100000_3 aObjectS92S1100000_3) {
        EnumC1779550wPR enumC1779550wPR = (EnumC1779550wPR) aObjectS92S1100000_3.l1;
        String str = aObjectS92S1100000_3.s0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAppLaunch(");
        sbLIZ.append(enumC1779550wPR);
        sbLIZ.append("), new day start: ");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AObjectS92S1100000_3(EnumC1779550wPR enumC1779550wPR, String str, int i) {
        this.$t = i;
        this.l1 = enumC1779550wPR;
        this.s0 = str;
    }

    public AObjectS92S1100000_3(String str, String str2, C2252611DEt c2252611DEt, int i) {
        this.$t = i;
        this.l1 = c2252611DEt;
        this.s0 = str2;
    }
}
