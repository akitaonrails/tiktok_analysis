package X;

import com.ss.android.ugc.aweme.analytics.IMediaUploadPerformanceMonitor;
import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.model.PublishImageModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nSh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1435610nSh extends AbstractC1434490nQt {
    public C1431070nLN LLILZLL;
    public C1434960nRe LLIZ;
    public C1434970nRf LLIZLLLIL;
    public C1435240nS6 LLJ;
    public SynthetiseResult LLJI;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(497));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1101));

    public final void LJIILL() {
        ((C1435510nSX) this.LLJILJIL.getValue()).LIZ();
        C1431070nLN c1431070nLN = this.LLILZLL;
        if (c1431070nLN == null) {
            c1431070nLN = null;
        }
        C1435240nS6 c1435240nS6 = this.LLJ;
        c1431070nLN.LJ(c1435240nS6 != null ? c1435240nS6 : null, false);
    }

    @Override // X.AbstractC1434490nQt
    public final EnumC1434810nRP LJIIJJI() {
        return EnumC1434810nRP.COMPILE;
    }

    @Override // X.AbstractC1434490nQt
    public final void LJII(C1404610meh c1404610meh, C1431070nLN c1431070nLN) {
        Object next;
        String str;
        String str2;
        List<PublishImageModel> list;
        PublishImageModel publishImageModel;
        this.LLILZLL = c1431070nLN;
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            C1431070nLN c1431070nLN2 = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (next2 instanceof C1435240nS6) {
                if (next2 != null) {
                    this.LLJ = (C1435240nS6) next2;
                    Iterator<Object> it3 = c1404610meh.LIZ.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next3 = it3.next();
                        if (next3 instanceof C1434960nRe) {
                            if (next3 != null) {
                                this.LLIZ = (C1434960nRe) next3;
                                Iterator<Object> it4 = c1404610meh.LIZ.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        break;
                                    }
                                    Object next4 = it4.next();
                                    if (next4 instanceof C1434970nRf) {
                                        if (next4 != null) {
                                            this.LLIZLLLIL = (C1434970nRf) next4;
                                            Iterator<Object> it5 = c1404610meh.LIZ.iterator();
                                            while (true) {
                                                if (it5.hasNext()) {
                                                    next = it5.next();
                                                    if (next == null || (next instanceof SynthetiseResult)) {
                                                        break;
                                                    }
                                                } else {
                                                    next = null;
                                                    break;
                                                }
                                            }
                                            if (!(next instanceof SynthetiseResult)) {
                                                next = null;
                                            }
                                            this.LLJI = (SynthetiseResult) next;
                                            ((C1435510nSX) this.LLJILJIL.getValue()).LIZIZ();
                                            C1435240nS6 c1435240nS6 = this.LLJ;
                                            if (c1435240nS6 == null) {
                                                c1435240nS6 = null;
                                            }
                                            C0YVK c0yvk = c1435240nS6.LIZJ;
                                            if (c0yvk != null && (str = c0yvk.LIZ) != null) {
                                                SynthetiseResult synthetiseResult = this.LLJI;
                                                if (synthetiseResult == null || (list = synthetiseResult.imageSynthesisResult) == null || (publishImageModel = (PublishImageModel) C13LP.LJJJLL(list)) == null || (str2 = publishImageModel.path) == null) {
                                                    C1434960nRe c1434960nRe = this.LLIZ;
                                                    if (c1434960nRe == null) {
                                                        c1434960nRe = null;
                                                    }
                                                    DMMediaModel dMMediaModel = c1434960nRe.LIZ.creativeModel.dmMediaModel;
                                                    if (dMMediaModel == null || (str2 = dMMediaModel.photoFile) == null) {
                                                        LJIILJJIL(10012, new C1436670nUP("file path is empty"));
                                                        return;
                                                    }
                                                }
                                                long fileSize = ((InterfaceC1383710m6z) this.LLJIJIL.getValue()).getFileSize(str2);
                                                IMediaUploadPerformanceMonitor iMediaUploadPerformanceMonitorLJII = C912070ZqH.LIZIZ.LJIILLIIL().LJII();
                                                C1434970nRf c1434970nRf = this.LLIZLLLIL;
                                                if (c1434970nRf == null) {
                                                    c1434970nRf = null;
                                                }
                                                InterfaceC1435230nS5 interfaceC1435230nS5LIZ = iMediaUploadPerformanceMonitorLJII.LIZ(c1434970nRf.LIZ.creationId);
                                                interfaceC1435230nS5LIZ.LJIJI(fileSize);
                                                C1434960nRe c1434960nRe2 = this.LLIZ;
                                                if (c1434960nRe2 == null) {
                                                    c1434960nRe2 = null;
                                                }
                                                DMMediaModel dMMediaModel2 = c1434960nRe2.LIZ.creativeModel.dmMediaModel;
                                                if (dMMediaModel2 != null && dMMediaModel2.isSynthesised) {
                                                    interfaceC1435230nS5LIZ.LJIILIIL(fileSize);
                                                }
                                                C1434960nRe c1434960nRe3 = this.LLIZ;
                                                if (c1434960nRe3 == null) {
                                                    c1434960nRe3 = null;
                                                }
                                                DMMediaModel dMMediaModel3 = c1434960nRe3.LIZ.creativeModel.dmMediaModel;
                                                if (dMMediaModel3 != null && dMMediaModel3.isSynthesised) {
                                                    LJIILL();
                                                    return;
                                                }
                                                AbstractC1435870nT7 abstractC1435870nT7LIZIZ = C1437020nUy.LIZIZ(str, str2);
                                                if (abstractC1435870nT7LIZIZ instanceof C1435970nTH) {
                                                    C1431070nLN c1431070nLN3 = this.LLILZLL;
                                                    if (c1431070nLN3 != null) {
                                                        c1431070nLN2 = c1431070nLN3;
                                                    }
                                                    C1435970nTH c1435970nTH = (C1435970nTH) abstractC1435870nT7LIZIZ;
                                                    c1431070nLN2.LIZIZ(new C1435310nSD(str, c1435970nTH.LIZ, c1435970nTH.LIZIZ), EnumC2251001D8o.OUTER);
                                                    LJIILL();
                                                    return;
                                                }
                                                if (abstractC1435870nT7LIZIZ instanceof C1435960nTG) {
                                                    if (((InterfaceC1383710m6z) this.LLJIJIL.getValue()).LJ(str2, str)) {
                                                        C1431070nLN c1431070nLN4 = this.LLILZLL;
                                                        if (c1431070nLN4 != null) {
                                                            c1431070nLN2 = c1431070nLN4;
                                                        }
                                                        C1435960nTG c1435960nTG = (C1435960nTG) abstractC1435870nT7LIZIZ;
                                                        c1431070nLN2.LIZIZ(new C1435310nSD(str, c1435960nTG.LIZ, c1435960nTG.LIZIZ), EnumC2251001D8o.OUTER);
                                                        LJIILL();
                                                        return;
                                                    }
                                                    LJIILJJIL(10007, new C1436670nUP("copy file to synthetise path failed"));
                                                    return;
                                                }
                                                if (abstractC1435870nT7LIZIZ instanceof C1435880nT8) {
                                                    C1435880nT8 c1435880nT8 = (C1435880nT8) abstractC1435870nT7LIZIZ;
                                                    LJIILJJIL(c1435880nT8.LIZIZ, c1435880nT8.LIZ);
                                                    return;
                                                }
                                                throw new C1954807lC();
                                            }
                                            LJIILJJIL(10011, new C1436670nUP("synthesise path is empty"));
                                            return;
                                        }
                                    }
                                }
                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
                            }
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.creation.config.DMMediaPublishResult");
    }

    public final void LJIILJJIL(int i, C1436670nUP c1436670nUP) {
        ((C1435510nSX) this.LLJILJIL.getValue()).LIZ();
        C1431070nLN c1431070nLN = this.LLILZLL;
        if (c1431070nLN == null) {
            c1431070nLN = null;
        }
        c1431070nLN.LIZLLL(i, c1436670nUP);
    }
}
