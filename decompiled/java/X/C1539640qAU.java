package X;

import android.content.Context;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.lynx.tasm.LynxView;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qAU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1539640qAU extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1539580qAO LL;
    public final /* synthetic */ LynxView LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1539640qAU(C1539580qAO c1539580qAO, String str, LynxView lynxView, Function0<Unit> function0) {
        super(0);
        this.LL = c1539580qAO;
        this.LLILLJJLI = lynxView;
        this.LLILLL = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        HybridSchemaParam hybridSchemaParamLIZJ;
        C1539580qAO c1539580qAO = this.LL;
        C1539770qAh c1539770qAh = new C1539770qAh(this.LLILLJJLI, this.LLILLL);
        LynxView lynxView = c1539580qAO.LIZIZ;
        if (lynxView != null) {
            C1539760qAg c1539760qAg = new C1539760qAg(c1539580qAO, lynxView, c1539770qAh);
            InterfaceC1531560pxS interfaceC1531560pxS = c1539580qAO.LIZ.hybridParams;
            if (interfaceC1531560pxS == null || (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) == null) {
                c1539760qAg.invoke(new C1539910qAv(EnumC1539700qAa.OTHER_NO_REQUEST_REASON, "schemaParam is null"));
            } else {
                Pair pairLIZ = C1539630qAT.LIZ(c1539580qAO.LIZ, hybridSchemaParamLIZJ);
                if (((Boolean) pairLIZ.getFirst()).booleanValue()) {
                    LynxView lynxView2 = c1539580qAO.LIZIZ;
                    if (lynxView2 != null) {
                        C1539730qAd c1539730qAd = new C1539730qAd();
                        Context context = lynxView2.getContext();
                        C1537480q70 c1537480q70 = c1539580qAO.LIZ;
                        InterfaceC1531560pxS interfaceC1531560pxS2 = c1537480q70.hybridParams;
                        C1154850g9r c1154850g9rLIZ = c1539730qAd.LIZ(context, c1537480q70, interfaceC1531560pxS2 != null ? interfaceC1531560pxS2.LIZJ() : null, new C1539590qAP(c1539580qAO, c1539760qAg), new C1539750qAf(c1539580qAO, c1539760qAg));
                        if (c1154850g9rLIZ == null) {
                            EnumC1539690qAZ enumC1539690qAZ = EnumC1539690qAZ.DOWNGRADED;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Bundle info is null, baseUrl: ");
                            sbLIZ.append(c1539580qAO.LIZ.LJIJI());
                            c1539580qAO.LJI(enumC1539690qAZ, 224, C2188811AlT.LIZIZ(sbLIZ));
                            c1539760qAg.invoke(new C1539910qAv(EnumC1539700qAa.API_DOWNGRADE, "provide bundle info failed"));
                        } else {
                            c1539580qAO.LJIIZILJ = c1154850g9rLIZ.LIZIZ;
                        }
                    }
                } else {
                    c1539580qAO.LJI = EnumC1539690qAZ.DOWNGRADED;
                    c1539580qAO.LJFF = ((C1539910qAv) pairLIZ.getSecond()).LIZIZ;
                    c1539760qAg.invoke(pairLIZ.getSecond());
                }
            }
        }
        return Unit.LIZ;
    }
}
