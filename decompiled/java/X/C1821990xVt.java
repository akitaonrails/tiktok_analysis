package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicesku.assem.PcsServiceSkuContentAssem;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xVt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1821990xVt extends C09AY implements Function1<C788830Uwz, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ PcsServiceSkuContentAssem LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1821990xVt(int i, PcsServiceSkuContentAssem pcsServiceSkuContentAssem, Map<String, String> map) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = pcsServiceSkuContentAssem;
        this.LLILLL = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C788830Uwz c788830Uwz) {
        int iIntValue;
        String str;
        C1822010xVv c1822010xVv;
        C788830Uwz c788830Uwz2 = c788830Uwz;
        Integer numLIZ = c788830Uwz2.LIZ.LIZ();
        if (numLIZ != null) {
            iIntValue = numLIZ.intValue();
        } else {
            iIntValue = this.LL;
        }
        AbstractC788840Ux0 abstractC788840Ux0 = c788830Uwz2.LIZ;
        if (abstractC788840Ux0 instanceof C788850Ux1) {
            InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
            if (interfaceC517590KRpLIZJ != null) {
                C788850Ux1 c788850Ux1 = (C788850Ux1) abstractC788840Ux0;
                String str2 = c788850Ux1.LIZ;
                int i = c788850Ux1.LIZIZ;
                C1555840qac c1555840qacVo = this.LLILLJJLI.Vo();
                if (c1555840qacVo == null || (c1822010xVv = c1555840qacVo.LL) == null || (str = c1822010xVv.LIZIZ) == null) {
                    str = "";
                }
                interfaceC517590KRpLIZJ.LJIIIIZZ(str2, new C517510KRh(iIntValue, i, str, this.LLILLL));
            }
        } else if (abstractC788840Ux0 instanceof C788820Uwy) {
            InterfaceC517590KRp interfaceC517590KRpLIZJ2 = C1826730xdX.LIZJ();
            if (interfaceC517590KRpLIZJ2 != null) {
                interfaceC517590KRpLIZJ2.LJ(new C0KBP(iIntValue, this.LLILLL));
            }
        } else if (abstractC788840Ux0 instanceof C788860Ux2) {
            InterfaceC517590KRp interfaceC517590KRpLIZJ3 = C1826730xdX.LIZJ();
            if (interfaceC517590KRpLIZJ3 != null) {
                C788860Ux2 c788860Ux2 = (C788860Ux2) abstractC788840Ux0;
                interfaceC517590KRpLIZJ3.LJIIIZ(new C0JOM(iIntValue, c788860Ux2.LIZ, c788860Ux2.LIZIZ, this.LLILLL));
            }
        } else if (abstractC788840Ux0 instanceof C788810Uwx) {
            InterfaceC517590KRp interfaceC517590KRpLIZJ4 = C1826730xdX.LIZJ();
            if (interfaceC517590KRpLIZJ4 != null) {
                interfaceC517590KRpLIZJ4.LJIIJJI(new C517520KRi(iIntValue, this.LLILLL));
            }
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }
}
