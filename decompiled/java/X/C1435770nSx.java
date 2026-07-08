package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover.MvChooseCoverBitmapCreator;
import java.util.Iterator;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0nSx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1435770nSx extends AbstractC1434490nQt {
    public C1434960nRe LLILZLL;
    public C1431070nLN LLIZ;
    public InterfaceC1452170ntP LLIZLLLIL;
    public volatile C918190a09 LLJ;
    public volatile DMMediaModel LLJI;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1134));

    public final C1434960nRe LJIILJJIL() {
        C1434960nRe c1434960nRe = this.LLILZLL;
        if (c1434960nRe != null) {
            return c1434960nRe;
        }
        throw new IllegalArgumentException("null editModelContainer");
    }

    public final void LJIILL() {
        C1435510nSX c1435510nSX = (C1435510nSX) this.LLJIJIL.getValue();
        if (c1435510nSX != null) {
            c1435510nSX.LIZ();
        }
        C1431070nLN c1431070nLN = this.LLIZ;
        if (c1431070nLN != null) {
            c1431070nLN.LJ(null, false);
        }
        C918190a09 c918190a09 = this.LLJ;
        if (c918190a09 != null) {
            c918190a09.LIZ();
        }
    }

    @Override // X.AbstractC1434490nQt
    public final EnumC1434810nRP LJIIJJI() {
        return EnumC1434810nRP.EXTRACT;
    }

    @Override // X.AbstractC1434490nQt
    public final void LJII(C1404610meh c1404610meh, C1431070nLN c1431070nLN) {
        int[] iArrLJJIJL;
        Object next;
        Integer numValueOf;
        final String str;
        int iIntValue;
        Integer numLJJIIJ;
        this.LLIZ = c1431070nLN;
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            iArrLJJIJL = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (next == null || (next instanceof C1434960nRe)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        this.LLILZLL = (C1434960nRe) next;
        this.LLJI = LJIILJJIL().LIZ.creativeModel.dmMediaModel;
        DMMediaModel dMMediaModel = this.LLJI;
        if (dMMediaModel != null) {
            numValueOf = Integer.valueOf(dMMediaModel.type);
        } else {
            numValueOf = null;
        }
        DMMediaModel dMMediaModel2 = this.LLJI;
        if (dMMediaModel2 != null) {
            str = dMMediaModel2.outputCoverFile;
        } else {
            str = null;
        }
        DMMediaModel dMMediaModel3 = this.LLJI;
        if (dMMediaModel3 != null && !dMMediaModel3.isFromMainPost && numValueOf != null && numValueOf.intValue() == 3 && str != null && str.length() != 0) {
            try {
                LJIIIZ().LIZLLL();
                this.LLIZLLLIL = C1441820nci.LIZ(LJIILJJIL().LIZ, new AwS601S0100000_22(this, 924));
                C1435510nSX c1435510nSX = (C1435510nSX) this.LLJIJIL.getValue();
                if (c1435510nSX != null) {
                    c1435510nSX.LIZIZ();
                }
                ICreativeSocialBridgeService iCreativeSocialBridgeService = (ICreativeSocialBridgeService) PluggableExtentionKt.pluggableSpi$default(ICreativeSocialBridgeService.class, false, false, false, 14, null);
                if (iCreativeSocialBridgeService != null) {
                    iArrLJJIJL = iCreativeSocialBridgeService.LJJIJL(LJIILJJIL().LIZ);
                }
                InterfaceC1452170ntP interfaceC1452170ntP = this.LLIZLLLIL;
                if (interfaceC1452170ntP != null) {
                    int iIntValue2 = -1;
                    if (iArrLJJIJL != null && (numLJJIIJ = C13LQ.LJJIIJ(0, iArrLJJIJL)) != null) {
                        iIntValue = numLJJIIJ.intValue();
                    } else {
                        iIntValue = -1;
                        if (iArrLJJIJL != null) {
                        }
                        interfaceC1452170ntP.Vf(iIntValue, iIntValue2);
                    }
                    Integer numLJJIIJ2 = C13LQ.LJJIIJ(1, iArrLJJIJL);
                    if (numLJJIIJ2 != null) {
                        iIntValue2 = numLJJIIJ2.intValue();
                    }
                    interfaceC1452170ntP.Vf(iIntValue, iIntValue2);
                }
                InterfaceC1452170ntP interfaceC1452170ntP2 = this.LLIZLLLIL;
                if (interfaceC1452170ntP2 != null) {
                    interfaceC1452170ntP2.prepare();
                }
                new MvChooseCoverBitmapCreator(this.LLIZLLLIL, str, 0, null, new InterfaceC1457180o1U() { // from class: X.0nSy
                    @Override // X.InterfaceC1457180o1U
                    public final void onError(int i, String str2) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("extract thumbnail fail: ");
                        sbLIZ.append(str2);
                        C0YS1.LIZ("DMVideoExtractCoverTask", C2188811AlT.LIZIZ(sbLIZ));
                        this.LIZ.LJIILL();
                    }
                }, new C0MBV() { // from class: X.0nSz
                    @Override // X.C0MBV
                    public final void LIZLLL() {
                        C1431070nLN c1431070nLN2 = this.LIZ.LLIZ;
                        if (c1431070nLN2 != null) {
                            c1431070nLN2.LIZIZ(new C1436050nTP(str), EnumC2251001D8o.OUTER);
                        }
                        C0YS1.LIZJ("DMVideoExtractCoverTask", "extract thumbnail success");
                        this.LIZ.LJIILL();
                    }
                }, true, false, false);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        LJIILL();
    }
}
