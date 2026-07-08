package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.thirdpartylink.view.PcsThirdPartyLinkWebviewAssem;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xVf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1821850xVf extends C09AY implements Function1<SparkThirdContext, Unit> {
    public final /* synthetic */ PcsThirdPartyLinkWebviewAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1821850xVf(PcsThirdPartyLinkWebviewAssem pcsThirdPartyLinkWebviewAssem) {
        super(1);
        this.LL = pcsThirdPartyLinkWebviewAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SparkThirdContext sparkThirdContext) {
        SparkThirdContext sparkThirdContext2 = sparkThirdContext;
        final PcsThirdPartyLinkWebviewAssem pcsThirdPartyLinkWebviewAssem = this.LL;
        sparkThirdContext2.callback = new C2202311BHh() { // from class: X.0xVG
            @Override // X.C2202311BHh, X.InterfaceC2202301BHg
            public final void LIZIZ(String str) {
                pcsThirdPartyLinkWebviewAssem.ip();
                PcsThirdPartyLinkWebviewAssem pcsThirdPartyLinkWebviewAssem2 = pcsThirdPartyLinkWebviewAssem;
                if (!pcsThirdPartyLinkWebviewAssem2.LLJJJ) {
                    pcsThirdPartyLinkWebviewAssem2.LLJJJ = true;
                    C786410Ut5.LJLIIL(500L, pcsThirdPartyLinkWebviewAssem2.LLJJIJIL, pcsThirdPartyLinkWebviewAssem2.LLJJJIL);
                }
                C1821550xVB c1821550xVB = pcsThirdPartyLinkWebviewAssem.hp().LLILZ;
                if (c1821550xVB != null) {
                    String str2 = pcsThirdPartyLinkWebviewAssem.hp().wQ2().LJ;
                    c1821550xVB.LJI = false;
                    if (c1821550xVB.LJII) {
                        c1821550xVB.LJII = false;
                        InterfaceC517590KRp interfaceC517590KRp = c1821550xVB.LIZLLL;
                        if (interfaceC517590KRp != null) {
                            int i = c1821550xVB.LIZ;
                            Map<String, String> mapLIZ = c1821550xVB.LIZ(str2);
                            mapLIZ.put("load_attempt_count", String.valueOf(c1821550xVB.LJ));
                            interfaceC517590KRp.LJ(new C0KBP(i, mapLIZ));
                        }
                        if (!c1821550xVB.LJFF) {
                            c1821550xVB.LJ = 0;
                            c1821550xVB.LJFF = true;
                        }
                    }
                }
            }

            @Override // X.C2202311BHh, X.InterfaceC2202301BHg
            public final void LIZJ(String str) {
                C1821550xVB c1821550xVB = pcsThirdPartyLinkWebviewAssem.hp().LLILZ;
                if (c1821550xVB != null) {
                    pcsThirdPartyLinkWebviewAssem.hp().wQ2();
                    c1821550xVB.LJI = true;
                }
            }

            @Override // X.C2202311BHh, X.InterfaceC2202301BHg
            public final void LIZ(int i, String str) {
                C1821550xVB c1821550xVB = pcsThirdPartyLinkWebviewAssem.hp().LLILZ;
                if (c1821550xVB != null) {
                    String str2 = pcsThirdPartyLinkWebviewAssem.hp().wQ2().LJ;
                    c1821550xVB.LJI = false;
                    if (c1821550xVB.LJII) {
                        c1821550xVB.LJII = false;
                        InterfaceC517590KRp interfaceC517590KRp = c1821550xVB.LIZLLL;
                        if (interfaceC517590KRp != null) {
                            int i2 = c1821550xVB.LIZ;
                            String strValueOf = String.valueOf(i);
                            if (str == null) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("WebView load failed (code=");
                                sbLIZ.append(i);
                                sbLIZ.append(')');
                                str = C2188811AlT.LIZIZ(sbLIZ);
                            }
                            interfaceC517590KRp.LJIIIZ(new C0JOM(i2, strValueOf, new Throwable(str), c1821550xVB.LIZ(str2)));
                        }
                    }
                }
            }
        };
        this.LL.LLJJIJIIJIL = sparkThirdContext2;
        return Unit.LIZ;
    }
}
