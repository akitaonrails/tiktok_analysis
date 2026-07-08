package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.context.AdSparkHybridContext;
import com.ss.android.ugc.aweme.web.business.special.AdWebSpecialService;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0dEQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1042360dEQ extends AbstractC1539010q9T {
    public final SparkContext LLILLJJLI;
    public final EnumC1042380dES LLILLL;
    public C1042520dEg LLILZ;

    @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
    public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
        if (!(interfaceC1531560pxS instanceof C1541480qDS)) {
            return;
        }
        C1541480qDS c1541480qDS = (C1541480qDS) interfaceC1531560pxS;
        c1541480qDS.LJIIZILJ = false;
        c1541480qDS.LJIIJJI = new InterfaceC1047700dN2() { // from class: X.0dBm
            @Override // X.InterfaceC1047700dN2
            public final C1040730dBn LIZ(C1040730dBn c1040730dBn) {
                C1042360dEQ c1042360dEQ = this.LIZ;
                c1040730dBn.LIZ = c1040730dBn.LIZ;
                c1040730dBn.LIZIZ = AdWebSpecialService.LIZIZ().LIZ(c1040730dBn.LIZ, c1040730dBn.LIZIZ, (C1035880d3y) c1042360dEQ.LLILLJJLI.LJFF(C1035880d3y.class));
                return c1040730dBn;
            }
        };
        int i = C1042370dER.LIZ[this.LLILLL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    c1541480qDS.LJII(C2206091BVv.class, AFwS252S0000000_16.get$arr$(747));
                } else {
                    throw new C1954807lC();
                }
            } else {
                c1541480qDS.LJII(C2206091BVv.class, AFwS252S0000000_16.get$arr$(746));
            }
        } else {
            c1541480qDS.LJII(C1042520dEg.class, new AwS595S0100000_16(this, 479));
        }
        c1541480qDS.LJIILLIIL = true;
        this.LLILLJJLI.LJJ(InterfaceC1035500d3M.class, new C1042340dEO(this.LLILLJJLI));
    }

    public C1042360dEQ(AdSparkHybridContext adSparkHybridContext, EnumC1042380dES enumC1042380dES) {
        this.LLILLJJLI = adSparkHybridContext;
        this.LLILLL = enumC1042380dES;
    }
}
