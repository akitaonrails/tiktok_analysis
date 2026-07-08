package X;

import Y.ACallableS427S0100000_22;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover.MvChooseCoverBitmapCreator;
import com.ss.android.ugc.aweme.wavepublish.dm.service.DMPhotoExportJob;
import com.ss.android.ugc.aweme.wavepublish.dm.service.IDMPhotoExportService;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nT9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1435890nT9 extends AbstractC1434490nQt {
    public C1434960nRe LLILZLL;
    public InterfaceC1452170ntP LLIZ;
    public C1431070nLN LLIZLLLIL;
    public volatile C918190a09 LLJ;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1102));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(499));

    public final void LJIILL() {
        ((C1435510nSX) this.LLJI.getValue()).LIZ();
        C1431070nLN c1431070nLN = this.LLIZLLLIL;
        if (c1431070nLN == null) {
            c1431070nLN = null;
        }
        c1431070nLN.LJ(null, false);
        C918190a09 c918190a09 = this.LLJ;
        if (c918190a09 != null) {
            c918190a09.LIZ();
        }
        this.LLJ = null;
        C15O7.LIZJ(new ACallableS427S0100000_22(this, 18));
    }

    @Override // X.AbstractC1434490nQt
    public final EnumC1434810nRP LJIIJJI() {
        return EnumC1434810nRP.EXTRACT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.Object, java.lang.String] */
    @Override // X.AbstractC1434490nQt
    public final void LJII(C1404610meh c1404610meh, C1431070nLN c1431070nLN) {
        int iIntValue;
        Integer numLJJIIJ;
        ICreativeSocialBridgeService iCreativeSocialBridgeService;
        List<String> list;
        String str;
        DMPhotoExportJob dMPhotoExportJobLIZ;
        this.LLIZLLLIL = c1431070nLN;
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            int[] iArrLJJIJL = null;
            C1434960nRe c1434960nRe = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (next instanceof C1434960nRe) {
                if (next != null) {
                    this.LLILZLL = (C1434960nRe) next;
                    ((C1435510nSX) this.LLJI.getValue()).LIZIZ();
                    final C259800zU c259800zU = new C259800zU();
                    c259800zU.element = "";
                    C1434960nRe c1434960nRe2 = this.LLILZLL;
                    if (c1434960nRe2 == null) {
                        c1434960nRe2 = null;
                    }
                    DMMediaModel dMMediaModel = c1434960nRe2.LIZ.creativeModel.dmMediaModel;
                    if (dMMediaModel != null) {
                        if (dMMediaModel.type != 2) {
                            LJIILJJIL(10008, new C1436670nUP("type is not TYPE_EDITED_PHOTO"));
                            return;
                        }
                        if (dMMediaModel.photoFile.length() == 0) {
                            LJIILJJIL(10008, new C1436670nUP("photo path is empty"));
                            return;
                        }
                        ?? r4 = dMMediaModel.photoFile;
                        c259800zU.element = r4;
                        C1434960nRe c1434960nRe3 = this.LLILZLL;
                        if (c1434960nRe3 == null) {
                            c1434960nRe3 = null;
                        }
                        String creationId = c1434960nRe3.LIZ.getCreationId();
                        IDMPhotoExportService.LIZ.getClass();
                        IDMPhotoExportService value = C1435940nTE.LIZIZ.getValue();
                        if (value != null && (dMPhotoExportJobLIZ = value.LIZ(creationId)) != null && r4 != 0 && r4.length() != 0) {
                            boolean zAwait = dMPhotoExportJobLIZ.await(10000L);
                            String resultPath = dMPhotoExportJobLIZ.getResultPath();
                            value.LIZJ(creationId);
                            if (zAwait && resultPath != null && resultPath.length() != 0) {
                                C912070ZqH c912070ZqH = C912070ZqH.LIZIZ;
                                if (c912070ZqH.LJ().LJFF(resultPath) && (Intrinsics.LJFF(resultPath, r4) || c912070ZqH.LJ().LJ(resultPath, r4))) {
                                    C1431070nLN c1431070nLN2 = this.LLIZLLLIL;
                                    if (c1431070nLN2 == null) {
                                        c1431070nLN2 = null;
                                    }
                                    c1431070nLN2.LIZIZ(new C1436050nTP(r4), EnumC2251001D8o.OUTER);
                                    LJIILL();
                                    return;
                                }
                            }
                        }
                        C0CHQ.LIZ().LJJ();
                        ICreativeSocialBridgeService iCreativeSocialBridgeService2 = (ICreativeSocialBridgeService) this.LLJIJIL.getValue();
                        if (iCreativeSocialBridgeService2 != null) {
                            C1434960nRe c1434960nRe4 = this.LLILZLL;
                            if (c1434960nRe4 == null) {
                                c1434960nRe4 = null;
                            }
                            iCreativeSocialBridgeService2.LJIJJ(c1434960nRe4.LIZ, null);
                        }
                        try {
                            LJIIIZ().LIZLLL();
                            C1434960nRe c1434960nRe5 = this.LLILZLL;
                            if (c1434960nRe5 == null) {
                                c1434960nRe5 = null;
                            }
                            this.LLIZ = C1441820nci.LIZ(c1434960nRe5.LIZ, new AwS601S0100000_22(this, 903));
                            InterfaceC1452170ntP interfaceC1452170ntP = this.LLIZ;
                            if (interfaceC1452170ntP != null) {
                                String str2 = (String) c259800zU.element;
                                if (C0C64.LJIILLIIL().LJIIIZ(31744, "im_camera_avoid_photo_extraction", true, false) && (iCreativeSocialBridgeService = (ICreativeSocialBridgeService) this.LLJIJIL.getValue()) != null && !iCreativeSocialBridgeService.LIZJ(interfaceC1452170ntP)) {
                                    C1434960nRe c1434960nRe6 = this.LLILZLL;
                                    if (c1434960nRe6 == null) {
                                        c1434960nRe6 = null;
                                    }
                                    CanvasVideoData canvasVideoData = c1434960nRe6.LIZ.creativeModel.canvasVideoData;
                                    if (canvasVideoData != null && (list = canvasVideoData.sourceInfo) != null && (str = (String) C13LP.LJJJLL(list)) != null && str.length() != 0) {
                                        C912070ZqH c912070ZqH2 = C912070ZqH.LIZIZ;
                                        if (c912070ZqH2.LJ().LJFF(str) && (Intrinsics.LJFF(str, str2) || c912070ZqH2.LJ().LJ(str, str2))) {
                                            C1431070nLN c1431070nLN3 = this.LLIZLLLIL;
                                            if (c1431070nLN3 == null) {
                                                c1431070nLN3 = null;
                                            }
                                            c1431070nLN3.LIZIZ(new C1436050nTP(str2), EnumC2251001D8o.OUTER);
                                            LJIILL();
                                            return;
                                        }
                                    }
                                }
                                ICreativeSocialBridgeService iCreativeSocialBridgeService3 = (ICreativeSocialBridgeService) this.LLJIJIL.getValue();
                                if (iCreativeSocialBridgeService3 != null) {
                                    C1434960nRe c1434960nRe7 = this.LLILZLL;
                                    if (c1434960nRe7 != null) {
                                        c1434960nRe = c1434960nRe7;
                                    }
                                    iArrLJJIJL = iCreativeSocialBridgeService3.LJJIJL(c1434960nRe.LIZ);
                                }
                                int iIntValue2 = -1;
                                if (iArrLJJIJL != null && (numLJJIIJ = C13LQ.LJJIIJ(0, iArrLJJIJL)) != null) {
                                    iIntValue = numLJJIIJ.intValue();
                                } else {
                                    iIntValue = -1;
                                    if (iArrLJJIJL != null) {
                                    }
                                    interfaceC1452170ntP.Vf(iIntValue, iIntValue2);
                                    interfaceC1452170ntP.prepare();
                                    new MvChooseCoverBitmapCreator(interfaceC1452170ntP, (String) c259800zU.element, 0, null, new InterfaceC1457180o1U() { // from class: X.0nTD
                                        @Override // X.InterfaceC1457180o1U
                                        public final void onError(int i, String str3) {
                                            C1435890nT9 c1435890nT9 = this.LIZ;
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("photo: gen cover failed: ");
                                            sbLIZ.append(str3);
                                            c1435890nT9.LJIILJJIL(10009, new C1436670nUP(C2188811AlT.LIZIZ(sbLIZ)));
                                        }
                                    }, new C0MBV() { // from class: X.0nTB
                                        @Override // X.C0MBV
                                        public final void LIZLLL() {
                                            C1431070nLN c1431070nLN4 = this.LIZ.LLIZLLLIL;
                                            if (c1431070nLN4 == null) {
                                                c1431070nLN4 = null;
                                            }
                                            c1431070nLN4.LIZIZ(new C1436050nTP(c259800zU.element), EnumC2251001D8o.OUTER);
                                            this.LIZ.LJIILL();
                                        }
                                    }, true, false, false);
                                    return;
                                }
                                Integer numLJJIIJ2 = C13LQ.LJJIIJ(1, iArrLJJIJL);
                                if (numLJJIIJ2 != null) {
                                    iIntValue2 = numLJJIIJ2.intValue();
                                }
                                interfaceC1452170ntP.Vf(iIntValue, iIntValue2);
                                interfaceC1452170ntP.prepare();
                                new MvChooseCoverBitmapCreator(interfaceC1452170ntP, (String) c259800zU.element, 0, null, new InterfaceC1457180o1U() { // from class: X.0nTD
                                    @Override // X.InterfaceC1457180o1U
                                    public final void onError(int i, String str3) {
                                        C1435890nT9 c1435890nT9 = this.LIZ;
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("photo: gen cover failed: ");
                                        sbLIZ.append(str3);
                                        c1435890nT9.LJIILJJIL(10009, new C1436670nUP(C2188811AlT.LIZIZ(sbLIZ)));
                                    }
                                }, new C0MBV() { // from class: X.0nTB
                                    @Override // X.C0MBV
                                    public final void LIZLLL() {
                                        C1431070nLN c1431070nLN4 = this.LIZ.LLIZLLLIL;
                                        if (c1431070nLN4 == null) {
                                            c1431070nLN4 = null;
                                        }
                                        c1431070nLN4.LIZIZ(new C1436050nTP(c259800zU.element), EnumC2251001D8o.OUTER);
                                        this.LIZ.LJIILL();
                                    }
                                }, true, false, false);
                                return;
                            }
                            return;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            LJIILJJIL(10010, new C1436670nUP("VEEditor create error"));
                            return;
                        }
                    }
                    LJIILJJIL(10008, new C1436670nUP("DMMediaModel is null"));
                    return;
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
    }

    public final void LJIILJJIL(int i, C1436670nUP c1436670nUP) {
        ((C1435510nSX) this.LLJI.getValue()).LIZ();
        C1431070nLN c1431070nLN = this.LLIZLLLIL;
        if (c1431070nLN == null) {
            c1431070nLN = null;
        }
        c1431070nLN.LIZLLL(i, c1436670nUP);
        C918190a09 c918190a09 = this.LLJ;
        if (c918190a09 != null) {
            c918190a09.LIZ();
        }
        this.LLJ = null;
        C15O7.LIZJ(new ACallableS427S0100000_22(this, 18));
    }
}
