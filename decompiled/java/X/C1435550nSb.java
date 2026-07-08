package X;

import Y.ACallableS0S0102001_22;
import Y.ACallableS427S0100000_22;
import Y.ARunnableS0S0311100_22;
import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.INLEExporter;
import com.bytedance.ies.nle.editor_jni.INLEListenerCompileTargetFileInfoPredict;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.MapStrStr;
import com.bytedance.ies.nle.editor_jni.NLECompileResult;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEVQScoreResult;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService;
import com.ss.android.ugc.aweme.creative.model.AIGCInfo;
import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.creative.model.publish.CompileLevel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;
import com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover.MvChooseCoverBitmapCreator;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.settings.VEVideoCompileEncodeSettings;
import com.ss.android.vesdk.settings.VEVideoHWEncodeSettings;
import com.ss.android.vesdk.settings.VideoInvisibleWatermarkSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS32S0100001_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0nSb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1435550nSb extends AbstractC1431200nLa {
    public final C01GW LLIZ;
    public final ExecutorService LLIZLLLIL;
    public C1434960nRe LLJ;
    public C1404570med LLJI;
    public InterfaceC1434170nQN LLJIJIL;
    public boolean LLJILJIL;
    public C1931707hT LLJILJILJ;
    public InterfaceC1435810nT1 LLJILLL;
    public C1431070nLN LLJJ;
    public InterfaceC1452170ntP LLJJI;
    public volatile boolean LLJJIII;
    public volatile boolean LLJJIJI;
    public SynthetiseResult LLJJIJIIJIL;
    public final C138P LLJJIJIL;
    public long LLJJJ;
    public final List<String> LLJJJIL;
    public volatile C918190a09 LLJJJJ;
    public DMMediaModel LLJJJJJIL;
    public C1435240nS6 LLJJJJLIIL;
    public AIGCInfo LLJJL;
    public final CompileLevel LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public C1435620nSi LLJLL;

    public C1435550nSb() {
        super(null);
        this.LLIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(539));
        C2123408To c2123408ToLIZ = C2123508Tp.LIZ(C0WQX.SERIAL);
        c2123408ToLIZ.LIZIZ = "produce executor";
        this.LLIZLLLIL = C823050WQl.LIZ(c2123408ToLIZ.LIZ());
        this.LLJJIJIL = new C138P();
        this.LLJJJIL = new ArrayList();
        this.LLJJLIIIJLLLLLLLZ = CompileLevel.UNKNOWN;
        this.LLJL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(540));
        this.LLJLIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1131));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1130));
    }

    public final ICreativeSocialBridgeService LJIILJJIL() {
        return (ICreativeSocialBridgeService) this.LLIZ.getValue();
    }

    @Override // X.AbstractC1434490nQt
    public final int LJIIJ() {
        LJIIIZ().LJIIIIZZ().getClass();
        new C1404950mfF();
        return C1404950mfF.LIZ();
    }

    @Override // X.AbstractC1434490nQt, X.C1D8B
    public final boolean LIZLLL(Object obj) {
        super.LIZLLL(obj);
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLJJI;
        boolean z = false;
        if (interfaceC1452170ntP == null) {
            return false;
        }
        if (!this.LLJJIII && !this.LLJJIJI) {
            z = true;
            this.LLJJIJI = true;
            C1431070nLN c1431070nLN = this.LLJJ;
            C1431070nLN c1431070nLN2 = null;
            if (c1431070nLN == null) {
                c1431070nLN = null;
            }
            c1431070nLN.LIZIZ(new C1404990mfJ("DMVideoCompileTask", "CompileTask pause"), EnumC2251001D8o.OUTER);
            interfaceC1452170ntP.pauseCompile();
            C1431070nLN c1431070nLN3 = this.LLJJ;
            if (c1431070nLN3 != null) {
                c1431070nLN2 = c1431070nLN3;
            }
            c1431070nLN2.LIZIZ(C1431170nLX.LIZ, EnumC2251001D8o.OUTER);
        }
        return z;
    }

    @Override // X.AbstractC1434490nQt, X.C1D8B
    public final void LJ(Object obj) {
        super.LJ(obj);
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLJJI;
        if (interfaceC1452170ntP != null && this.LLJJIJI) {
            C1431070nLN c1431070nLN = this.LLJJ;
            C1431070nLN c1431070nLN2 = null;
            if (c1431070nLN == null) {
                c1431070nLN = null;
            }
            c1431070nLN.LIZIZ(new C1404990mfJ("DMVideoCompileTask", "CompileTask resume"), EnumC2251001D8o.OUTER);
            interfaceC1452170ntP.resumeCompile();
            C1431070nLN c1431070nLN3 = this.LLJJ;
            if (c1431070nLN3 != null) {
                c1431070nLN2 = c1431070nLN3;
            }
            c1431070nLN2.LIZIZ(C1431160nLW.LIZ, EnumC2251001D8o.OUTER);
            this.LLJJIJI = false;
        }
    }

    public final void LJIILL(C1434270nQX c1434270nQX) {
        C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[direct_upload] notifyUploadTaskStart: ");
        sbLIZ.append(c1434270nQX);
        c1437510nVlLJJLIIIJ.LIZ("compile", C2188811AlT.LIZIZ(sbLIZ));
        if (c1434270nQX == null) {
            c1434270nQX = new C1434270nQX(CompileLevel.UNKNOWN);
        }
        C1431070nLN c1431070nLN = this.LLJJ;
        if (c1431070nLN == null) {
            c1431070nLN = null;
        }
        c1431070nLN.LIZIZ(c1434270nQX, EnumC2251001D8o.ALL);
    }

    @Override // X.AbstractC1434490nQt, X.C1D8B
    public final boolean LIZIZ(AbstractC1404540mea abstractC1404540mea, InterfaceC1434410nQl interfaceC1434410nQl) {
        super.LIZIZ(abstractC1404540mea, interfaceC1434410nQl);
        C1431070nLN c1431070nLN = this.LLJJ;
        C1435620nSi c1435620nSi = null;
        if (c1431070nLN == null) {
            c1431070nLN = null;
        }
        c1431070nLN.LIZIZ(new C1404990mfJ("DMVideoCompileTask", "cancelUpload"), EnumC2251001D8o.OUTER);
        this.LLJJIII = true;
        InterfaceC1435810nT1 interfaceC1435810nT1 = this.LLJILLL;
        if (interfaceC1435810nT1 != null) {
            interfaceC1435810nT1.disableDeleteCacheWhenEnd(false);
        }
        InterfaceC1435810nT1 interfaceC1435810nT12 = this.LLJILLL;
        if (interfaceC1435810nT12 != null) {
            interfaceC1435810nT12.cancelUpload();
        }
        SynthetiseResult synthetiseResult = this.LLJJIJIIJIL;
        if (synthetiseResult != null && synthetiseResult.outputFile != null) {
            C0VSJ c0vsj = new C0VSJ(synthetiseResult.outputFile);
            if (c0vsj.exists()) {
                c0vsj.delete();
                C1431070nLN c1431070nLN2 = this.LLJJ;
                if (c1431070nLN2 == null) {
                    c1431070nLN2 = null;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("incompleteFile delete incompleteFile : ");
                sbLIZ.append(c0vsj);
                c1431070nLN2.LIZIZ(new C1404990mfJ("DMVideoCompileTask", C2188811AlT.LIZIZ(sbLIZ)), EnumC2251001D8o.OUTER);
            }
        }
        C918190a09 c918190a09 = this.LLJJJJ;
        if (c918190a09 != null) {
            c918190a09.LIZ();
        }
        this.LLJJJJ = null;
        C15O7.LIZJ(new ACallableS427S0100000_22(this, 22));
        ((C1D8A) interfaceC1434410nQl).LIZ(null);
        C1435620nSi c1435620nSi2 = this.LLJLL;
        if (c1435620nSi2 != null) {
            c1435620nSi = c1435620nSi2;
        }
        c1435620nSi.LIZ();
        return true;
    }

    @Override // X.AbstractC1431200nLa, X.AbstractC1434490nQt
    public final void LJII(C1404610meh c1404610meh, C1431070nLN c1431070nLN) throws Throwable {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        String str;
        C1435950nTF c1435950nTF;
        VEVideoEncodeSettings vEVideoEncodeSettingsLJJI;
        boolean z;
        boolean z2;
        int iKf;
        Long lValueOf;
        String str2;
        boolean z3;
        boolean z4;
        C348100Dkm c348100DkmLIZIZ;
        ICreativeSocialBridgeService iCreativeSocialBridgeServiceLJIILJJIL;
        VEVideoHWEncodeSettings vEVideoHWEncodeSettings;
        String str3;
        AIGCInfo aIGCInfo;
        String strLJJII;
        String str4;
        String str5;
        C1435260nS8 c1435260nS8;
        InterfaceC1452170ntP interfaceC1452170ntP;
        DMMediaModel dMMediaModel;
        final String str6;
        int[] iArrLJJIJL;
        int iIntValue;
        Integer numLJJIIJ;
        super.LJII(c1404610meh, c1431070nLN);
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            C1431070nLN c1431070nLN2 = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next5 = it2.next();
            if (next5 instanceof C1434960nRe) {
                if (next5 != null) {
                    C1434960nRe c1434960nRe = (C1434960nRe) next5;
                    this.LLJ = c1434960nRe;
                    DMMediaModel dMMediaModel2 = c1434960nRe.LIZ.creativeModel.dmMediaModel;
                    this.LLJJJJJIL = dMMediaModel2;
                    if (dMMediaModel2 == null) {
                        C1433680nPa c1433680nPa = new C1433680nPa();
                        c1433680nPa.LIZJ = "no dm media model";
                        LJIILLIIL(c1433680nPa.LIZ(), false);
                        return;
                    }
                    Iterator<Object> it3 = c1404610meh.LIZ.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (next == null || (next instanceof C1435240nS6)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    if (!(next instanceof C1435240nS6)) {
                        next = null;
                    }
                    this.LLJJJJLIIL = (C1435240nS6) next;
                    Iterator<Object> it4 = c1404610meh.LIZ.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        Object next6 = it4.next();
                        if (next6 instanceof C1404570med) {
                            if (next6 != null) {
                                this.LLJI = (C1404570med) next6;
                                Iterator<Object> it5 = c1404610meh.LIZ.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        next2 = it5.next();
                                        if (next2 == null || (next2 instanceof InterfaceC1434170nQN)) {
                                            break;
                                        }
                                    } else {
                                        next2 = null;
                                        break;
                                    }
                                }
                                if (!(next2 instanceof InterfaceC1434170nQN)) {
                                    next2 = null;
                                }
                                this.LLJIJIL = (InterfaceC1434170nQN) next2;
                                Iterator<Object> it6 = c1404610meh.LIZ.iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        next3 = it6.next();
                                        if (next3 == null || (next3 instanceof C1931707hT)) {
                                            break;
                                        }
                                    } else {
                                        next3 = null;
                                        break;
                                    }
                                }
                                if (!(next3 instanceof C1931707hT)) {
                                    next3 = null;
                                }
                                this.LLJILJILJ = (C1931707hT) next3;
                                this.LLJJ = c1431070nLN;
                                Iterator<Object> it7 = c1404610meh.LIZ.iterator();
                                while (true) {
                                    if (it7.hasNext()) {
                                        next4 = it7.next();
                                        if (next4 == null || (next4 instanceof InterfaceC1435810nT1)) {
                                            break;
                                        }
                                    } else {
                                        next4 = null;
                                        break;
                                    }
                                }
                                InterfaceC1435810nT1 interfaceC1435810nT1 = (InterfaceC1435810nT1) next4;
                                this.LLJILLL = interfaceC1435810nT1;
                                if (interfaceC1435810nT1 != null) {
                                    interfaceC1435810nT1.LJ();
                                }
                                if (C0L1C.LIZ()) {
                                    C1434960nRe c1434960nRe2 = this.LLJ;
                                    if (c1434960nRe2 == null) {
                                        c1434960nRe2 = null;
                                    }
                                    AIGCInfo aIGCInfo2 = c1434960nRe2.LIZ.creativeModel.privacySettingModel.aigcInfo;
                                    aIGCInfo2.AIGCSwitchStatusWhenCompile = aIGCInfo2.AIGCLabelType;
                                    this.LLJJL = aIGCInfo2;
                                }
                                DMMediaModel dMMediaModel3 = this.LLJJJJJIL;
                                if (dMMediaModel3 != null) {
                                    C1435510nSX c1435510nSX = (C1435510nSX) this.LLJLILLLLZIIL.getValue();
                                    if (c1435510nSX != null) {
                                        c1435510nSX.LIZIZ();
                                    }
                                    if (dMMediaModel3.isSynthesised) {
                                        LJIIZILJ(new SynthetiseResult(), true);
                                        return;
                                    }
                                }
                                Iterator<Object> it8 = c1404610meh.LIZ.iterator();
                                while (true) {
                                    if (!it8.hasNext()) {
                                        break;
                                    }
                                    Object next7 = it8.next();
                                    if (next7 instanceof C1434970nRf) {
                                        if (next7 != null) {
                                            int iLJIIJ = LJIIJ();
                                            C1431070nLN c1431070nLN3 = this.LLJJ;
                                            if (c1431070nLN3 == null) {
                                                c1431070nLN3 = null;
                                            }
                                            this.LLJLL = new C1435620nSi(c1431070nLN3, iLJIIJ);
                                            this.LLJJIJI = false;
                                            this.LLJJI = null;
                                            this.LLJJIJIIJIL = null;
                                            this.LLJJIII = false;
                                            ((ArrayList) this.LLJJJIL).clear();
                                            this.LLJJIJIL.LIZJ();
                                            this.LLJJIJIL.LIZLLL();
                                            C1434960nRe c1434960nRe3 = this.LLJ;
                                            try {
                                                InterfaceC1435810nT1 interfaceC1435810nT12 = this.LLJILLL;
                                                if (interfaceC1435810nT12 != null) {
                                                    interfaceC1435810nT12.LJFF();
                                                }
                                                InterfaceC1435810nT1 interfaceC1435810nT13 = this.LLJILLL;
                                                if (interfaceC1435810nT13 != null) {
                                                    interfaceC1435810nT13.disableDeleteCacheWhenEnd(false);
                                                }
                                                C0CHQ.LIZ().LJJ();
                                                ICreativeSocialBridgeService iCreativeSocialBridgeServiceLJIILJJIL2 = LJIILJJIL();
                                                if (iCreativeSocialBridgeServiceLJIILJJIL2 != null) {
                                                    C1434960nRe c1434960nRe4 = this.LLJ;
                                                    if (c1434960nRe4 == null) {
                                                        c1434960nRe4 = null;
                                                    }
                                                    iCreativeSocialBridgeServiceLJIILJJIL2.LJIJJ(c1434960nRe4.LIZ, null);
                                                }
                                                try {
                                                    LJIIIZ().LIZLLL();
                                                    C1434960nRe c1434960nRe5 = this.LLJ;
                                                    if (c1434960nRe5 == null) {
                                                        c1434960nRe5 = null;
                                                    }
                                                    this.LLJJI = C1441820nci.LIZ(c1434960nRe5.LIZ, new AwS601S0100000_22(this, 923));
                                                    if (!C283380B8u.LIZIZ && (interfaceC1452170ntP = this.LLJJI) != null && (dMMediaModel = this.LLJJJJJIL) != null && !dMMediaModel.isFromMainPost) {
                                                        Integer numValueOf = Integer.valueOf(dMMediaModel.type);
                                                        DMMediaModel dMMediaModel4 = this.LLJJJJJIL;
                                                        if (dMMediaModel4 != null) {
                                                            str6 = dMMediaModel4.outputCoverFile;
                                                        } else {
                                                            str6 = null;
                                                        }
                                                        if (numValueOf != null && numValueOf.intValue() == 3 && str6 != null && str6.length() != 0) {
                                                            C1435510nSX c1435510nSX2 = (C1435510nSX) this.LLJLIL.getValue();
                                                            if (c1435510nSX2 != null) {
                                                                c1435510nSX2.LIZIZ();
                                                            }
                                                            ICreativeSocialBridgeService iCreativeSocialBridgeServiceLJIILJJIL3 = LJIILJJIL();
                                                            if (iCreativeSocialBridgeServiceLJIILJJIL3 != null) {
                                                                C1434960nRe c1434960nRe6 = this.LLJ;
                                                                if (c1434960nRe6 == null) {
                                                                    c1434960nRe6 = null;
                                                                }
                                                                iArrLJJIJL = iCreativeSocialBridgeServiceLJIILJJIL3.LJJIJL(c1434960nRe6.LIZ);
                                                            } else {
                                                                iArrLJJIJL = null;
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
                                                                new MvChooseCoverBitmapCreator(interfaceC1452170ntP, str6, 0, null, new InterfaceC1457180o1U() { // from class: X.0nSo
                                                                    @Override // X.InterfaceC1457180o1U
                                                                    public final void onError(int i, String str7) {
                                                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                                        sbLIZ.append("extract thumbnail fail: ");
                                                                        sbLIZ.append(str7);
                                                                        C0YS1.LIZ("DMVideoCompileTask", C2188811AlT.LIZIZ(sbLIZ));
                                                                        C1435510nSX c1435510nSX3 = (C1435510nSX) this.LIZ.LLJLIL.getValue();
                                                                        if (c1435510nSX3 != null) {
                                                                            c1435510nSX3.LIZ();
                                                                        }
                                                                    }
                                                                }, new C0MBV() { // from class: X.0nSp
                                                                    @Override // X.C0MBV
                                                                    public final void LIZLLL() {
                                                                        C1431070nLN c1431070nLN4 = this.LIZ.LLJJ;
                                                                        if (c1431070nLN4 == null) {
                                                                            c1431070nLN4 = null;
                                                                        }
                                                                        c1431070nLN4.LIZIZ(new C1436050nTP(str6), EnumC2251001D8o.OUTER);
                                                                        C0YS1.LIZJ("DMVideoCompileTask", "extract thumbnail success");
                                                                        C1435510nSX c1435510nSX3 = (C1435510nSX) this.LIZ.LLJLIL.getValue();
                                                                        if (c1435510nSX3 != null) {
                                                                            c1435510nSX3.LIZ();
                                                                        }
                                                                    }
                                                                }, true, false, false);
                                                            }
                                                            Integer numLJJIIJ2 = C13LQ.LJJIIJ(1, iArrLJJIJL);
                                                            if (numLJJIIJ2 != null) {
                                                                iIntValue2 = numLJJIIJ2.intValue();
                                                            }
                                                            interfaceC1452170ntP.Vf(iIntValue, iIntValue2);
                                                            interfaceC1452170ntP.prepare();
                                                            new MvChooseCoverBitmapCreator(interfaceC1452170ntP, str6, 0, null, new InterfaceC1457180o1U() { // from class: X.0nSo
                                                                @Override // X.InterfaceC1457180o1U
                                                                public final void onError(int i, String str7) {
                                                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                                    sbLIZ.append("extract thumbnail fail: ");
                                                                    sbLIZ.append(str7);
                                                                    C0YS1.LIZ("DMVideoCompileTask", C2188811AlT.LIZIZ(sbLIZ));
                                                                    C1435510nSX c1435510nSX3 = (C1435510nSX) this.LIZ.LLJLIL.getValue();
                                                                    if (c1435510nSX3 != null) {
                                                                        c1435510nSX3.LIZ();
                                                                    }
                                                                }
                                                            }, new C0MBV() { // from class: X.0nSp
                                                                @Override // X.C0MBV
                                                                public final void LIZLLL() {
                                                                    C1431070nLN c1431070nLN4 = this.LIZ.LLJJ;
                                                                    if (c1431070nLN4 == null) {
                                                                        c1431070nLN4 = null;
                                                                    }
                                                                    c1431070nLN4.LIZIZ(new C1436050nTP(str6), EnumC2251001D8o.OUTER);
                                                                    C0YS1.LIZJ("DMVideoCompileTask", "extract thumbnail success");
                                                                    C1435510nSX c1435510nSX3 = (C1435510nSX) this.LIZ.LLJLIL.getValue();
                                                                    if (c1435510nSX3 != null) {
                                                                        c1435510nSX3.LIZ();
                                                                    }
                                                                }
                                                            }, true, false, false);
                                                        }
                                                    }
                                                    ICreativeSocialBridgeService iCreativeSocialBridgeServiceLJIILJJIL4 = LJIILJJIL();
                                                    if (iCreativeSocialBridgeServiceLJIILJJIL4 != null) {
                                                        C1434960nRe c1434960nRe7 = this.LLJ;
                                                        if (c1434960nRe7 == null) {
                                                            c1434960nRe7 = null;
                                                        }
                                                        VideoPublishEditModel videoPublishEditModel = c1434960nRe7.LIZ;
                                                        C1435240nS6 c1435240nS6 = this.LLJJJJLIIL;
                                                        if (c1435240nS6 != null && (c1435260nS8 = c1435240nS6.LIZLLL) != null) {
                                                            str = c1435260nS8.LIZJ;
                                                        } else {
                                                            str = null;
                                                        }
                                                        final SynthetiseResult synthetiseResultLJJIII = iCreativeSocialBridgeServiceLJIILJJIL4.LJJIII(videoPublishEditModel, str);
                                                        if (synthetiseResultLJJIII != null) {
                                                            this.LLJJIJIIJIL = synthetiseResultLJJIII;
                                                            C1434960nRe c1434960nRe8 = this.LLJ;
                                                            if (c1434960nRe8 == null) {
                                                                c1434960nRe8 = null;
                                                            }
                                                            VideoPublishEditModel videoPublishEditModel2 = c1434960nRe8.LIZ;
                                                            InterfaceC1452170ntP interfaceC1452170ntP2 = this.LLJJI;
                                                            if (interfaceC1452170ntP2 != null) {
                                                                if (videoPublishEditModel2.isFastImport()) {
                                                                    C571620MbQ.LIZ(interfaceC1452170ntP2, videoPublishEditModel2.getPreviewInfo().getVideoList());
                                                                }
                                                                ((ICommerceToolsStickerService) ServiceManager.get().getService(ICommerceToolsStickerService.class)).LJII(interfaceC1452170ntP2, videoPublishEditModel2);
                                                                interfaceC1452170ntP2.setPageMode(0);
                                                                if (videoPublishEditModel2.isFastImport()) {
                                                                    str3 = "1";
                                                                } else {
                                                                    str3 = CardStruct.IStatusCode.DEFAULT;
                                                                }
                                                                interfaceC1452170ntP2.addMetadata("te_is_fast_import", str3);
                                                                String str7 = "";
                                                                if (videoPublishEditModel2.isMultiVideoEdit()) {
                                                                    MultiEditVideoStatusRecordData multiEditVideoRecordData = videoPublishEditModel2.getMultiEditVideoRecordData();
                                                                    if (multiEditVideoRecordData != null) {
                                                                        str4 = multiEditVideoRecordData.videoMetaData;
                                                                    } else {
                                                                        str4 = null;
                                                                    }
                                                                    if (!TextUtils.isEmpty(str4)) {
                                                                        MultiEditVideoStatusRecordData multiEditVideoRecordData2 = videoPublishEditModel2.getMultiEditVideoRecordData();
                                                                        if (multiEditVideoRecordData2 == null || (str5 = multiEditVideoRecordData2.videoMetaData) == null) {
                                                                            str5 = "";
                                                                        }
                                                                        interfaceC1452170ntP2.addMetadata("description", str5);
                                                                    }
                                                                }
                                                                ICreativeSocialBridgeService iCreativeSocialBridgeServiceLJIILJJIL5 = LJIILJJIL();
                                                                if (iCreativeSocialBridgeServiceLJIILJJIL5 != null && (strLJJII = iCreativeSocialBridgeServiceLJIILJJIL5.LJJII(videoPublishEditModel2)) != null) {
                                                                    str7 = strLJJII;
                                                                }
                                                                interfaceC1452170ntP2.addMetadata("com.apple.quicktime.information", str7);
                                                                if (C0L1C.LIZ() && (aIGCInfo = this.LLJJL) != null && aIGCInfo.AIGCLabelType == 2) {
                                                                    interfaceC1452170ntP2.addMetadata("aigc_info", C786410Ut5.J3(new JSONObject().put("aigc_label_type", 2)));
                                                                }
                                                            }
                                                            C1434960nRe c1434960nRe9 = this.LLJ;
                                                            if (c1434960nRe9 == null) {
                                                                c1434960nRe9 = null;
                                                            }
                                                            final VideoPublishEditModel videoPublishEditModel3 = c1434960nRe9.LIZ;
                                                            final InterfaceC1452170ntP interfaceC1452170ntP3 = this.LLJJI;
                                                            if (interfaceC1452170ntP3 != null) {
                                                                ((Keva) C1434500nQu.LIZ.getValue()).erase("upload_param_key");
                                                                C348100Dkm c348100DkmLIZIZ2 = C352130DrH.LIZIZ(interfaceC1452170ntP3);
                                                                if (c348100DkmLIZIZ2 != null) {
                                                                    c348100DkmLIZIZ2.LIZIZ.getMediaRuntimeApi().setCompileTargetFileInfoPredictListener(new INLEListenerCompileTargetFileInfoPredict() { // from class: X.0nSw
                                                                        @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompileTargetFileInfoPredict
                                                                        public final void onCompileTargetFileInfoPredict(long j, long j2, boolean z5, boolean z6) {
                                                                            C1436170nTb c1436170nTb = new C1436170nTb(j, j2, z5, z6, 16);
                                                                            C1431070nLN c1431070nLN4 = this.LIZ.LLJJ;
                                                                            if (c1431070nLN4 == null) {
                                                                                c1431070nLN4 = null;
                                                                            }
                                                                            c1431070nLN4.LIZIZ(c1436170nTb, EnumC2251001D8o.ALL);
                                                                            C1434500nQu.LIZIZ(c1436170nTb);
                                                                        }
                                                                    });
                                                                }
                                                                interfaceC1452170ntP3.hf(new InterfaceC1464200oCo() { // from class: X.0nR5
                                                                    @Override // X.InterfaceC1464200oCo
                                                                    public final void onCallback(int i, int i2, float f, String str8) {
                                                                        if (i2 == -214) {
                                                                            AVSettingsWrapper.setIsHardCodeFallback(true);
                                                                        }
                                                                        C1931607hS c1931607hS = C1931607hS.LIZ;
                                                                        C1931707hT c1931707hT = this.LL.LLJILJILJ;
                                                                        c1931607hS.getClass();
                                                                        C1434960nRe c1434960nRe10 = null;
                                                                        C1431070nLN c1431070nLN4 = null;
                                                                        if (C1931607hS.LIZ(i2, c1931707hT)) {
                                                                            AVSettingsWrapper.setIsHardCodeFallback(true);
                                                                            C1435550nSb c1435550nSb = this.LL;
                                                                            C1434960nRe c1434960nRe11 = c1435550nSb.LLJ;
                                                                            if (c1434960nRe11 == null) {
                                                                                c1434960nRe11 = null;
                                                                            }
                                                                            c1434960nRe11.LIZ.creativeModel.transientPostPageModel.LIZJ = true;
                                                                            InterfaceC1434170nQN interfaceC1434170nQN = c1435550nSb.LLJIJIL;
                                                                            if (interfaceC1434170nQN != null) {
                                                                                interfaceC1434170nQN.LIZIZ();
                                                                            }
                                                                            C1435550nSb c1435550nSb2 = this.LL;
                                                                            c1435550nSb2.getClass();
                                                                            C15O7.LIZJ(new ACallableS427S0100000_22(c1435550nSb2, 22));
                                                                            C1431070nLN c1431070nLN5 = this.LL.LLJJ;
                                                                            if (c1431070nLN5 != null) {
                                                                                c1431070nLN4 = c1431070nLN5;
                                                                            }
                                                                            c1431070nLN4.LIZIZ(new C1434420nQm(), EnumC2251001D8o.OUTER);
                                                                            this.LL.LLJILJIL = true;
                                                                            return;
                                                                        }
                                                                        C1434960nRe c1434960nRe12 = this.LL.LLJ;
                                                                        if (c1434960nRe12 != null) {
                                                                            c1434960nRe10 = c1434960nRe12;
                                                                        }
                                                                        c1434960nRe10.LIZ.creativeModel.transientPostPageModel.LIZJ = false;
                                                                        SynthetiseResult synthetiseResultM316clone = synthetiseResultLJJIII.m316clone();
                                                                        synthetiseResultM316clone.ret = i2;
                                                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                                        sbLIZ.append(i);
                                                                        sbLIZ.append('#');
                                                                        sbLIZ.append(i2);
                                                                        sbLIZ.append('#');
                                                                        sbLIZ.append(f);
                                                                        synthetiseResultM316clone.setVESDKErrorCode(C2188811AlT.LIZIZ(sbLIZ));
                                                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                                        sbLIZ2.append("VE compile failed with message(type=");
                                                                        sbLIZ2.append(i);
                                                                        sbLIZ2.append(", ext=");
                                                                        sbLIZ2.append(i2);
                                                                        sbLIZ2.append(", float=");
                                                                        sbLIZ2.append(f);
                                                                        sbLIZ2.append(", msg=");
                                                                        sbLIZ2.append(str8);
                                                                        sbLIZ2.append(')');
                                                                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                                                        C1433680nPa c1433680nPa2 = new C1433680nPa();
                                                                        c1433680nPa2.LIZ = synthetiseResultM316clone;
                                                                        if (strLIZIZ != null) {
                                                                            c1433680nPa2.LIZJ = strLIZIZ;
                                                                        }
                                                                        this.LL.LJIILLIIL(c1433680nPa2.LIZ(), true);
                                                                        C1435550nSb c1435550nSb3 = this.LL;
                                                                        c1435550nSb3.getClass();
                                                                        C15O7.LIZJ(new ACallableS427S0100000_22(c1435550nSb3, 22));
                                                                    }
                                                                });
                                                                interfaceC1452170ntP3.df(new InterfaceC1464200oCo() { // from class: X.0nSe
                                                                    @Override // X.InterfaceC1464200oCo
                                                                    public final void onCallback(int i, int i2, float f, String str8) throws Throwable {
                                                                        String str9;
                                                                        String str10;
                                                                        float averageScore;
                                                                        int processedFrames;
                                                                        NLEVQScoreResult vqscoreResult;
                                                                        NLEVQScoreResult vqscoreResult2;
                                                                        C1463670oBx c1463670oBx;
                                                                        C348100Dkm c348100DkmLIZLLL;
                                                                        INLEMediaSession iNLEMediaSession;
                                                                        INLEExporter exporterApi;
                                                                        C1463670oBx c1463670oBx2;
                                                                        C348100Dkm c348100DkmLIZLLL2;
                                                                        INLEMediaSession iNLEMediaSession2;
                                                                        INLEExporter exporterApi2;
                                                                        NLECompileResult compileResult;
                                                                        MapStrStr riskyVideoInfo;
                                                                        C1435620nSi c1435620nSi = this.LL.LLJLL;
                                                                        C1431070nLN c1431070nLN4 = null;
                                                                        compileResult = null;
                                                                        compileResult = null;
                                                                        compileResult = null;
                                                                        compileResult = null;
                                                                        NLECompileResult compileResult2 = null;
                                                                        C1431070nLN c1431070nLN5 = null;
                                                                        C1431070nLN c1431070nLN6 = null;
                                                                        if (c1435620nSi == null) {
                                                                            c1435620nSi = null;
                                                                        }
                                                                        c1435620nSi.onCallback(i, i2, f, str8);
                                                                        if (i != 4103) {
                                                                            if (i == 4118) {
                                                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                                                sbLIZ.append("TE_INFO_HW_FAILED_TRY_SW_COMPILE ext:");
                                                                                sbLIZ.append(i2);
                                                                                sbLIZ.append(" videoExt:");
                                                                                sbLIZ.append(0);
                                                                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                                                                C1431070nLN c1431070nLN7 = this.LL.LLJJ;
                                                                                if (c1431070nLN7 == null) {
                                                                                    c1431070nLN7 = null;
                                                                                }
                                                                                c1431070nLN7.LIZIZ(new C1404990mfJ("DMVideoCompileTask", strLIZIZ), EnumC2251001D8o.OUTER);
                                                                            }
                                                                        } else {
                                                                            C1431070nLN c1431070nLN8 = this.LL.LLJJ;
                                                                            if (c1431070nLN8 == null) {
                                                                                c1431070nLN8 = null;
                                                                            }
                                                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                                            sbLIZ2.append("TE_INFO_COMPILE_DONE ext:");
                                                                            sbLIZ2.append(i2);
                                                                            sbLIZ2.append(" videoExt:");
                                                                            sbLIZ2.append(0);
                                                                            sbLIZ2.append(" isDone():");
                                                                            sbLIZ2.append(this.LL.LLJJIII);
                                                                            c1431070nLN8.LIZIZ(new C1404990mfJ("DMVideoCompileTask", C2188811AlT.LIZIZ(sbLIZ2)), EnumC2251001D8o.OUTER);
                                                                        }
                                                                        if (!this.LL.LLJJIII) {
                                                                            boolean z5 = true;
                                                                            if (i == 4103) {
                                                                                C1435550nSb c1435550nSb = this.LL;
                                                                                InterfaceC1452170ntP interfaceC1452170ntP4 = interfaceC1452170ntP3;
                                                                                VideoPublishEditModel videoPublishEditModel4 = videoPublishEditModel3;
                                                                                c1435550nSb.getClass();
                                                                                if ((interfaceC1452170ntP4 instanceof C1463670oBx) && (c1463670oBx2 = (C1463670oBx) interfaceC1452170ntP4) != null && (c348100DkmLIZLLL2 = c1463670oBx2.LIZLLL()) != null && (iNLEMediaSession2 = c348100DkmLIZLLL2.LIZIZ) != null && (exporterApi2 = iNLEMediaSession2.getExporterApi()) != null && (compileResult = exporterApi2.getCompileResult()) != null && (riskyVideoInfo = compileResult.getRiskyVideoInfo()) != null && !riskyVideoInfo.isEmpty()) {
                                                                                    String strLIZLLL = C08JS.LIZLLL(riskyVideoInfo);
                                                                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                                                    sbLIZ3.append("DMVideoCompileTask riskyVideoInfo: ");
                                                                                    sbLIZ3.append(strLIZLLL);
                                                                                    C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ3));
                                                                                    videoPublishEditModel4.creativeModel.videoDetectionRiskInfo = strLIZLLL;
                                                                                }
                                                                                if (i2 == 0) {
                                                                                    synthetiseResultLJJIII.videoLength = f;
                                                                                }
                                                                                C1435550nSb c1435550nSb2 = this.LL;
                                                                                AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22(synthetiseResultLJJIII, 1132);
                                                                                c1435550nSb2.getClass();
                                                                                awS566S0100000_22.invoke();
                                                                                InterfaceC1452170ntP interfaceC1452170ntP5 = interfaceC1452170ntP3;
                                                                                if ((interfaceC1452170ntP5 instanceof C1463670oBx) && (c1463670oBx = (C1463670oBx) interfaceC1452170ntP5) != null && (c348100DkmLIZLLL = c1463670oBx.LIZLLL()) != null && (iNLEMediaSession = c348100DkmLIZLLL.LIZIZ) != null && (exporterApi = iNLEMediaSession.getExporterApi()) != null) {
                                                                                    compileResult2 = exporterApi.getCompileResult();
                                                                                }
                                                                                SynthetiseResult synthetiseResult = synthetiseResultLJJIII;
                                                                                if (compileResult2 != null && (vqscoreResult2 = compileResult2.getVqscoreResult()) != null) {
                                                                                    averageScore = vqscoreResult2.getAverageScore();
                                                                                } else {
                                                                                    averageScore = -2.0f;
                                                                                }
                                                                                synthetiseResult.avgVqScore = averageScore;
                                                                                SynthetiseResult synthetiseResult2 = synthetiseResultLJJIII;
                                                                                if (compileResult2 != null && (vqscoreResult = compileResult2.getVqscoreResult()) != null) {
                                                                                    processedFrames = vqscoreResult.getProcessedFrames();
                                                                                } else {
                                                                                    processedFrames = -2;
                                                                                }
                                                                                synthetiseResult2.processedFrames = processedFrames;
                                                                                long jCurrentTimeMillis = System.currentTimeMillis() - this.LL.LLJJJ;
                                                                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                                                sbLIZ4.append("[dm_compile_time] compile done | durationMs=");
                                                                                sbLIZ4.append(jCurrentTimeMillis);
                                                                                sbLIZ4.append(" | isHwEncode=");
                                                                                if (synthetiseResultLJJIII.synthetiseCPUEncode != 0) {
                                                                                    z5 = false;
                                                                                }
                                                                                sbLIZ4.append(z5);
                                                                                sbLIZ4.append(" | expEnabled=");
                                                                                sbLIZ4.append(((Boolean) C0BL8.LIZ.getValue()).booleanValue());
                                                                                C0YS1.LIZJ("DMVideoCompileTask", C2188811AlT.LIZIZ(sbLIZ4));
                                                                                this.LL.LJIIZILJ(synthetiseResultLJJIII, false);
                                                                                C1435550nSb c1435550nSb3 = this.LL;
                                                                                AwS566S0100000_22 awS566S0100000_222 = new AwS566S0100000_22(interfaceC1452170ntP3, 1133);
                                                                                c1435550nSb3.getClass();
                                                                                awS566S0100000_222.invoke();
                                                                                return;
                                                                            }
                                                                            if (i == 4105) {
                                                                                if (i2 != 0) {
                                                                                    return;
                                                                                }
                                                                                C1435550nSb c1435550nSb4 = this.LL;
                                                                                AwS32S0100001_22 awS32S0100001_22 = new AwS32S0100001_22(c1435550nSb4, f, 3);
                                                                                c1435550nSb4.getClass();
                                                                                awS32S0100001_22.invoke();
                                                                                return;
                                                                            }
                                                                            if (i == 4112) {
                                                                                int i3 = i2 ^ 1;
                                                                                synthetiseResultLJJIII.synthetiseCPUEncode = i3;
                                                                                C1431070nLN c1431070nLN9 = this.LL.LLJJ;
                                                                                if (c1431070nLN9 == null) {
                                                                                    c1431070nLN9 = null;
                                                                                }
                                                                                c1431070nLN9.LIZIZ(new C1404700meq(0, i3, 1), EnumC2251001D8o.OUTER);
                                                                                C1431070nLN c1431070nLN10 = this.LL.LLJJ;
                                                                                if (c1431070nLN10 != null) {
                                                                                    c1431070nLN5 = c1431070nLN10;
                                                                                }
                                                                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                                                                sbLIZ5.append("SynthesisMode NotSkip: ");
                                                                                if (i2 == 1) {
                                                                                    str10 = "Hw";
                                                                                } else {
                                                                                    str10 = "Sw";
                                                                                }
                                                                                sbLIZ5.append(str10);
                                                                                c1431070nLN5.LIZIZ(new C1404990mfJ("DMVideoCompileTask", C2188811AlT.LIZIZ(sbLIZ5)), EnumC2251001D8o.OUTER);
                                                                                return;
                                                                            }
                                                                            if (i == 4113) {
                                                                                synthetiseResultLJJIII.audioLength = f;
                                                                                return;
                                                                            }
                                                                            if (i == 4114) {
                                                                                C15O7.LIZIZ(new ACallableS0S0102001_22(this.LL, i, i2, f, 1), C15O7.LJIIIIZZ, null);
                                                                                return;
                                                                            }
                                                                            if (i == 4116) {
                                                                                if (C0C64.LJIILLIIL().LJIIIZ(31744, "upload_metadata", true, false)) {
                                                                                    if (videoPublishEditModel3.getMetadataMap() == null) {
                                                                                        videoPublishEditModel3.setMetadataMap(C1A66.LIZ());
                                                                                    } else {
                                                                                        Map<String, Object> metadataMap = videoPublishEditModel3.getMetadataMap();
                                                                                        if (metadataMap != null) {
                                                                                            metadataMap.putAll(C1A66.LIZ());
                                                                                        }
                                                                                    }
                                                                                }
                                                                                C1431070nLN c1431070nLN11 = this.LL.LLJJ;
                                                                                if (c1431070nLN11 != null) {
                                                                                    c1431070nLN6 = c1431070nLN11;
                                                                                }
                                                                                c1431070nLN6.LIZIZ(new C1404990mfJ("DMVideoCompileTask", "receive prepare done event in compiler"), EnumC2251001D8o.OUTER);
                                                                                return;
                                                                            }
                                                                            if (i != 4130) {
                                                                                return;
                                                                            }
                                                                            synthetiseResultLJJIII.unableRemuxCode = i2;
                                                                            C1431070nLN c1431070nLN12 = this.LL.LLJJ;
                                                                            if (c1431070nLN12 == null) {
                                                                                c1431070nLN12 = null;
                                                                            }
                                                                            c1431070nLN12.LIZIZ(new C1404700meq(i2, 0, 2), EnumC2251001D8o.OUTER);
                                                                            C1431070nLN c1431070nLN13 = this.LL.LLJJ;
                                                                            if (c1431070nLN13 != null) {
                                                                                c1431070nLN4 = c1431070nLN13;
                                                                            }
                                                                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                                                            sbLIZ6.append("SynthesisMode IsSkipReEncode: ");
                                                                            if (i2 == 0) {
                                                                                str9 = "true";
                                                                            } else {
                                                                                str9 = "false";
                                                                            }
                                                                            sbLIZ6.append(str9);
                                                                            c1431070nLN4.LIZIZ(new C1404990mfJ("DMVideoCompileTask", C2188811AlT.LIZIZ(sbLIZ6)), EnumC2251001D8o.OUTER);
                                                                        }
                                                                    }
                                                                });
                                                            }
                                                            InterfaceC1452170ntP interfaceC1452170ntP4 = this.LLJJI;
                                                            if (interfaceC1452170ntP4 != null) {
                                                                interfaceC1452170ntP4.sf(new InterfaceC1464170oCl() { // from class: X.0nSj
                                                                    @Override // X.InterfaceC1464170oCl
                                                                    public final void onEncoderDataAvailable(byte[] bArr, long j, int i, boolean z5) throws ExecutionException, InterruptedException {
                                                                        boolean zLIZJ;
                                                                        C1435620nSi c1435620nSi = this.LL.LLJLL;
                                                                        if (c1435620nSi == null) {
                                                                            c1435620nSi = null;
                                                                        }
                                                                        c1435620nSi.onEncoderDataAvailable(bArr, j, i, z5);
                                                                        if (((Boolean) C280580AzA.LIZ.getValue()).booleanValue()) {
                                                                            InterfaceC1435810nT1 interfaceC1435810nT14 = this.LL.LLJILLL;
                                                                            if (interfaceC1435810nT14 != null) {
                                                                                zLIZJ = interfaceC1435810nT14.LIZJ(i, j, z5);
                                                                            } else {
                                                                                zLIZJ = false;
                                                                            }
                                                                            C1435550nSb c1435550nSb = this.LL;
                                                                            Future<?> futureSubmit = c1435550nSb.LLIZLLLIL.submit(new ARunnableS0S0311100_22(c1435550nSb, bArr, j, i, z5, synthetiseResultLJJIII, 1));
                                                                            if (zLIZJ) {
                                                                                futureSubmit.get();
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        this.LL.LJIJ(new C199555136b(bArr), j, i, z5, synthetiseResultLJJIII);
                                                                    }
                                                                });
                                                            }
                                                            C2207291BaB.LIZIZ(C1ET4.TT_CONCURRENT_UPLOAD_COMPILE, 10000);
                                                            C1434960nRe c1434960nRe10 = this.LLJ;
                                                            if (c1434960nRe10 == null) {
                                                                c1434960nRe10 = null;
                                                            }
                                                            VideoPublishEditModel videoPublishEditModel4 = c1434960nRe10.LIZ;
                                                            InterfaceC1452170ntP interfaceC1452170ntP5 = this.LLJJI;
                                                            if (interfaceC1452170ntP5 == null) {
                                                                c1435950nTF = new C1435950nTF(null, new NullPointerException("VEEditor is null"), 1);
                                                            } else {
                                                                try {
                                                                    ICreativeSocialBridgeService iCreativeSocialBridgeServiceLJIILJJIL6 = LJIILJJIL();
                                                                    if (iCreativeSocialBridgeServiceLJIILJJIL6 != null) {
                                                                        C1404570med c1404570med = this.LLJI;
                                                                        if (c1404570med == null) {
                                                                            c1404570med = null;
                                                                        }
                                                                        vEVideoEncodeSettingsLJJI = iCreativeSocialBridgeServiceLJIILJJIL6.LJJI(videoPublishEditModel4, interfaceC1452170ntP5, c1404570med.LIZ, C1435130nRv.LIZIZ, false, false, true);
                                                                    } else {
                                                                        vEVideoEncodeSettingsLJJI = null;
                                                                    }
                                                                    c1435950nTF = new C1435950nTF(vEVideoEncodeSettingsLJJI, null, 2);
                                                                } catch (Exception e) {
                                                                    TryCatchGuardChecker.doCheck(e);
                                                                    LJIIIZ().LIZJ();
                                                                    C1405310mfp.LIZJ("DMVideoCompileTask", e);
                                                                    c1435950nTF = new C1435950nTF(null, e, 1);
                                                                }
                                                            }
                                                            VEVideoEncodeSettings vEVideoEncodeSettings = c1435950nTF.LIZ;
                                                            if (vEVideoEncodeSettings != null) {
                                                                z = true;
                                                            } else {
                                                                z = false;
                                                            }
                                                            Throwable th = c1435950nTF.LIZIZ;
                                                            if (th != null) {
                                                                z2 = true;
                                                            } else {
                                                                z2 = false;
                                                            }
                                                            if (!(z ^ z2)) {
                                                                SynthetiseResult synthetiseResultM316clone = synthetiseResultLJJIII.m316clone();
                                                                synthetiseResultM316clone.ret = 100107;
                                                                C1433680nPa c1433680nPa2 = new C1433680nPa();
                                                                c1433680nPa2.LIZJ = "compile settings is invalid, plz check business logic first, there must be something wrong";
                                                                c1433680nPa2.LIZ = synthetiseResultM316clone;
                                                                LJIILLIIL(c1433680nPa2.LIZ(), true);
                                                                return;
                                                            }
                                                            if (vEVideoEncodeSettings == null) {
                                                                SynthetiseResult synthetiseResultM316clone2 = synthetiseResultLJJIII.m316clone();
                                                                synthetiseResultM316clone2.ret = 100108;
                                                                C1433680nPa c1433680nPa3 = new C1433680nPa();
                                                                if (th != null) {
                                                                    c1433680nPa3.LIZLLL = th;
                                                                }
                                                                c1433680nPa3.LIZ = synthetiseResultM316clone2;
                                                                LJIILLIIL(c1433680nPa3.LIZ(), true);
                                                                return;
                                                            }
                                                            boolean zIsEnableRemuxVideo = vEVideoEncodeSettings.isEnableRemuxVideo();
                                                            InterfaceC1452170ntP interfaceC1452170ntP6 = this.LLJJI;
                                                            if (interfaceC1452170ntP6 != null) {
                                                                iKf = interfaceC1452170ntP6.kf(vEVideoEncodeSettings);
                                                            } else {
                                                                iKf = -2;
                                                            }
                                                            vEVideoEncodeSettings.setEnableRemuxVideo(zIsEnableRemuxVideo);
                                                            C1431070nLN c1431070nLN4 = this.LLJJ;
                                                            if (c1431070nLN4 == null) {
                                                                c1431070nLN4 = null;
                                                            }
                                                            c1431070nLN4.LIZIZ(new C1404690mep(iKf), EnumC2251001D8o.OUTER);
                                                            C1431070nLN c1431070nLN5 = this.LLJJ;
                                                            if (c1431070nLN5 == null) {
                                                                c1431070nLN5 = null;
                                                            }
                                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                            sbLIZ.append("PublishDurationMonitor SynthetiseStart ");
                                                            sbLIZ.append(vEVideoEncodeSettings);
                                                            c1431070nLN5.LIZIZ(new C1404990mfJ("DMVideoCompileTask", C2188811AlT.LIZIZ(sbLIZ)), EnumC2251001D8o.OUTER);
                                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                            sbLIZ2.append("[dm_compile_time] encode settings: ");
                                                            sbLIZ2.append(vEVideoEncodeSettings);
                                                            C0YS1.LIZJ("DMVideoCompileTask", C2188811AlT.LIZIZ(sbLIZ2));
                                                            this.LLJJJ = System.currentTimeMillis();
                                                            VEVideoCompileEncodeSettings videoCompileEncodeSetting = vEVideoEncodeSettings.getVideoCompileEncodeSetting();
                                                            if (videoCompileEncodeSetting != null && (vEVideoHWEncodeSettings = videoCompileEncodeSetting.mHWEncodeSetting) != null) {
                                                                lValueOf = Long.valueOf(vEVideoHWEncodeSettings.mBitrate);
                                                            } else {
                                                                lValueOf = null;
                                                            }
                                                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                            sbLIZ3.append("[dm_compile_time] compile start | isRemux=");
                                                            sbLIZ3.append(vEVideoEncodeSettings.isEnableRemuxVideo());
                                                            sbLIZ3.append(" | outputSize=");
                                                            sbLIZ3.append(vEVideoEncodeSettings.getVideoRes().width);
                                                            sbLIZ3.append('x');
                                                            sbLIZ3.append(vEVideoEncodeSettings.getVideoRes().height);
                                                            sbLIZ3.append(" | hwBitrate=");
                                                            sbLIZ3.append(lValueOf);
                                                            sbLIZ3.append(" | fps=");
                                                            sbLIZ3.append(vEVideoEncodeSettings.getFps());
                                                            sbLIZ3.append(" | expEnabled=");
                                                            sbLIZ3.append(((Boolean) C0BL8.LIZ.getValue()).booleanValue());
                                                            C0YS1.LIZJ("DMVideoCompileTask", C2188811AlT.LIZIZ(sbLIZ3));
                                                            C1431070nLN c1431070nLN6 = this.LLJJ;
                                                            if (c1431070nLN6 == null) {
                                                                c1431070nLN6 = null;
                                                            }
                                                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                            sbLIZ4.append("mVEEditor.compile source.getOutputFile() : ");
                                                            sbLIZ4.append(synthetiseResultLJJIII.outputFile);
                                                            c1431070nLN6.LIZIZ(new C1404990mfJ("DMVideoCompileTask", C2188811AlT.LIZIZ(sbLIZ4)), EnumC2251001D8o.OUTER);
                                                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                                            sbLIZ5.append("[dm_compile_time] mVEEditor.compile source.getOutputFile() : ");
                                                            sbLIZ5.append(synthetiseResultLJJIII.outputFile);
                                                            C0YS1.LIZJ("DMVideoCompileTask", C2188811AlT.LIZIZ(sbLIZ5));
                                                            InterfaceC1452170ntP interfaceC1452170ntP7 = this.LLJJI;
                                                            if (interfaceC1452170ntP7 != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP7)) != null && (iCreativeSocialBridgeServiceLJIILJJIL = LJIILJJIL()) != null) {
                                                                NLEEditor nLEEditor = c348100DkmLIZIZ.LIZ;
                                                                C1434960nRe c1434960nRe11 = this.LLJ;
                                                                if (c1434960nRe11 == null) {
                                                                    c1434960nRe11 = null;
                                                                }
                                                                iCreativeSocialBridgeServiceLJIILJJIL.LJI(nLEEditor, c1434960nRe11.LIZ);
                                                            }
                                                            ICreativeSocialBridgeService iCreativeSocialBridgeServiceLJIILJJIL7 = LJIILJJIL();
                                                            if (iCreativeSocialBridgeServiceLJIILJJIL7 != null) {
                                                                C1434960nRe c1434960nRe12 = this.LLJ;
                                                                if (c1434960nRe12 == null) {
                                                                    c1434960nRe12 = null;
                                                                }
                                                                iCreativeSocialBridgeServiceLJIILJJIL7.LJJIFFI(c1434960nRe12.LIZ, vEVideoEncodeSettings, synthetiseResultLJJIII.needRecode, iKf);
                                                            }
                                                            C1434960nRe c1434960nRe13 = this.LLJ;
                                                            if (c1434960nRe13 == null) {
                                                                c1434960nRe13 = null;
                                                            }
                                                            VideoPublishEditModel videoPublishEditModel5 = c1434960nRe13.LIZ;
                                                            InterfaceC1452170ntP interfaceC1452170ntP8 = this.LLJJI;
                                                            if (interfaceC1452170ntP8 != null) {
                                                                C1431070nLN c1431070nLN7 = this.LLJJ;
                                                                if (c1431070nLN7 == null) {
                                                                    c1431070nLN7 = null;
                                                                }
                                                                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                                                sbLIZ6.append("isSupportHwEnc: ");
                                                                sbLIZ6.append(vEVideoEncodeSettings.isSupportHwEnc());
                                                                sbLIZ6.append(", isEnableHwBufferEncode: ");
                                                                sbLIZ6.append(vEVideoEncodeSettings.isEnableHwBufferEncode());
                                                                c1431070nLN7.LIZIZ(new C1404990mfJ("DMVideoCompileTask", C2188811AlT.LIZIZ(sbLIZ6)), EnumC2251001D8o.OUTER);
                                                                if (C1171720gb4.LIZ()) {
                                                                    C1435570nSd.LIZ.getClass();
                                                                    C1435570nSd.LIZIZ();
                                                                }
                                                                try {
                                                                    ICreativeSocialBridgeService iCreativeSocialBridgeServiceLJIILJJIL8 = LJIILJJIL();
                                                                    if (iCreativeSocialBridgeServiceLJIILJJIL8 != null) {
                                                                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                                                        sbLIZ7.append("editor = ");
                                                                        sbLIZ7.append(interfaceC1452170ntP8);
                                                                        sbLIZ7.append(", compile begin");
                                                                        iCreativeSocialBridgeServiceLJIILJJIL8.LJIIIZ("DMVideoCompileTask", C2188811AlT.LIZIZ(sbLIZ7));
                                                                    }
                                                                    ICreativeSocialBridgeService iCreativeSocialBridgeServiceLJIILJJIL9 = LJIILJJIL();
                                                                    if (iCreativeSocialBridgeServiceLJIILJJIL9 != null) {
                                                                        iCreativeSocialBridgeServiceLJIILJJIL9.LJJIIJZLJL(videoPublishEditModel5, vEVideoEncodeSettings);
                                                                    }
                                                                    if (!C1429580nIy.LIZ()) {
                                                                        if (videoPublishEditModel5.creativeModel.privacySettingModel.aigcInfo.AIGCLabelType == 2) {
                                                                            z3 = true;
                                                                        } else {
                                                                            z3 = false;
                                                                        }
                                                                        boolean zLJI = C1436990nUv.LJI(videoPublishEditModel5);
                                                                        if (!z3 && !zLJI) {
                                                                            z4 = false;
                                                                        } else {
                                                                            z4 = true;
                                                                        }
                                                                        C1435570nSd.LIZ.getClass();
                                                                        boolean zLIZJ = C2286708xd.LIZJ(C1435570nSd.LIZIZ);
                                                                        if (videoPublishEditModel5.getCreationMode() == 1 && C1171720gb4.LIZ() && z4 && zLIZJ) {
                                                                            VideoInvisibleWatermarkSettings videoInvisibleWatermarkSettings = new VideoInvisibleWatermarkSettings();
                                                                            String str8 = C1435570nSd.LIZIZ;
                                                                            String strLIZJ = C1435570nSd.LIZJ();
                                                                            videoPublishEditModel5.creativeModel.privacySettingModel.fingerprintId = strLIZJ;
                                                                            videoInvisibleWatermarkSettings.watermarkStr = strLIZJ;
                                                                            videoInvisibleWatermarkSettings.algorithmName = C1435830nT3.LIZ().algorithmName;
                                                                            videoInvisibleWatermarkSettings.watermarkInterval = C306480Bzq.LIZ();
                                                                            videoInvisibleWatermarkSettings.algoVersion = C1435830nT3.LIZ().algoVersion;
                                                                            videoInvisibleWatermarkSettings.modelPath = str8;
                                                                            videoInvisibleWatermarkSettings.pFlag = C1435830nT3.LIZ().pFlag;
                                                                            videoInvisibleWatermarkSettings.enableDelayInit = C1435830nT3.LIZ().enableDelayInit;
                                                                            vEVideoEncodeSettings.setVideoInvisibleWatermarkSettings(videoInvisibleWatermarkSettings);
                                                                            ICreativeSocialBridgeService iCreativeSocialBridgeServiceLJIILJJIL10 = LJIILJJIL();
                                                                            if (iCreativeSocialBridgeServiceLJIILJJIL10 != null) {
                                                                                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                                                                sbLIZ8.append("model path is: ");
                                                                                sbLIZ8.append(str8);
                                                                                sbLIZ8.append(", param set");
                                                                                iCreativeSocialBridgeServiceLJIILJJIL10.LJIIIZ("invisible_watermark", C2188811AlT.LIZIZ(sbLIZ8));
                                                                            }
                                                                        }
                                                                    } else {
                                                                        C1435570nSd.LIZ.getClass();
                                                                        if (C1435570nSd.LIZLLL(videoPublishEditModel5, false)) {
                                                                            VideoInvisibleWatermarkSettings videoInvisibleWatermarkSettings2 = new VideoInvisibleWatermarkSettings();
                                                                            String str9 = C1435570nSd.LIZIZ;
                                                                            String strLIZJ2 = C1435570nSd.LIZJ();
                                                                            videoPublishEditModel5.creativeModel.privacySettingModel.fingerprintId = strLIZJ2;
                                                                            videoInvisibleWatermarkSettings2.watermarkStr = strLIZJ2;
                                                                            videoInvisibleWatermarkSettings2.algorithmName = C1435830nT3.LIZ().algorithmName;
                                                                            videoInvisibleWatermarkSettings2.watermarkInterval = C306480Bzq.LIZ();
                                                                            videoInvisibleWatermarkSettings2.algoVersion = C1435830nT3.LIZ().algoVersion;
                                                                            videoInvisibleWatermarkSettings2.modelPath = str9;
                                                                            videoInvisibleWatermarkSettings2.pFlag = C1435830nT3.LIZ().pFlag;
                                                                            videoInvisibleWatermarkSettings2.enableDelayInit = C1435830nT3.LIZ().enableDelayInit;
                                                                            vEVideoEncodeSettings.setVideoInvisibleWatermarkSettings(videoInvisibleWatermarkSettings2);
                                                                            ICreativeSocialBridgeService iCreativeSocialBridgeServiceLJIILJJIL11 = LJIILJJIL();
                                                                            if (iCreativeSocialBridgeServiceLJIILJJIL11 != null) {
                                                                                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                                                                sbLIZ9.append("model path is: ");
                                                                                sbLIZ9.append(str9);
                                                                                sbLIZ9.append(", param set");
                                                                                iCreativeSocialBridgeServiceLJIILJJIL11.LJIIIZ("invisible_watermark", C2188811AlT.LIZIZ(sbLIZ9));
                                                                            }
                                                                        }
                                                                    }
                                                                    SynthetiseResult synthetiseResult = this.LLJJIJIIJIL;
                                                                    if (synthetiseResult != null) {
                                                                        str2 = synthetiseResult.outputFile;
                                                                    } else {
                                                                        str2 = null;
                                                                    }
                                                                    interfaceC1452170ntP8.Mf(str2, vEVideoEncodeSettings);
                                                                    ICreativeSocialBridgeService iCreativeSocialBridgeServiceLJIILJJIL12 = LJIILJJIL();
                                                                    if (iCreativeSocialBridgeServiceLJIILJJIL12 != null) {
                                                                        iCreativeSocialBridgeServiceLJIILJJIL12.LJIIIZ("zxz", "compile end");
                                                                        return;
                                                                    }
                                                                    return;
                                                                } catch (Exception e2) {
                                                                    TryCatchGuardChecker.doCheck(e2);
                                                                    C1433680nPa c1433680nPa4 = new C1433680nPa();
                                                                    SynthetiseResult synthetiseResult2 = new SynthetiseResult();
                                                                    synthetiseResult2.ret = 100105;
                                                                    c1433680nPa4.LIZ = synthetiseResult2;
                                                                    c1433680nPa4.LIZLLL = e2;
                                                                    LJIILLIIL(c1433680nPa4.LIZ(), true);
                                                                    C1431070nLN c1431070nLN8 = this.LLJJ;
                                                                    if (c1431070nLN8 != null) {
                                                                        c1431070nLN2 = c1431070nLN8;
                                                                    }
                                                                    StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                                                                    sbLIZ10.append("Compile Failed ");
                                                                    sbLIZ10.append(e2.getMessage());
                                                                    c1431070nLN2.LIZIZ(new C1404990mfJ("DMVideoCompileTask", C2188811AlT.LIZIZ(sbLIZ10)), EnumC2251001D8o.OUTER);
                                                                    return;
                                                                }
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                } catch (Exception e3) {
                                                    TryCatchGuardChecker.doCheck(e3);
                                                    C1433680nPa c1433680nPa5 = new C1433680nPa();
                                                    SynthetiseResult synthetiseResult3 = new SynthetiseResult();
                                                    synthetiseResult3.ret = 100104;
                                                    c1433680nPa5.LIZ = synthetiseResult3;
                                                    c1433680nPa5.LIZLLL = e3;
                                                    LJIILLIIL(c1433680nPa5.LIZ(), true);
                                                    return;
                                                }
                                            } catch (C1431180nLY e4) {
                                                TryCatchGuardChecker.doCheck(e4);
                                                C1433680nPa c1433680nPa6 = new C1433680nPa();
                                                c1433680nPa6.LIZLLL = e4;
                                                SynthetiseResult synthetiseResult4 = new SynthetiseResult();
                                                synthetiseResult4.ret = e4.getErrorCode();
                                                c1433680nPa6.LIZ = synthetiseResult4;
                                                LJIILLIIL(c1433680nPa6.LIZ(), true);
                                                return;
                                            }
                                        }
                                    }
                                }
                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
                            }
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishId");
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
    }

    public final void LJIILLIIL(C1433670nPZ c1433670nPZ, boolean z) {
        boolean z2;
        C201955140j.LIZ("DMVideoCompileTask -> onTaskFailed");
        int iLJFF = C1431420nLw.LJFF(c1433670nPZ);
        Integer numValueOf = Integer.valueOf(iLJFF);
        C1431070nLN c1431070nLN = this.LLJJ;
        if (c1431070nLN != null && !this.LLJILJIL && c1431070nLN.LIZJ < C291160Bb8.LIZ() && C0C2U.LIZ(numValueOf)) {
            z2 = true;
        } else {
            z2 = false;
        }
        C1435620nSi c1435620nSi = null;
        C1431070nLN c1431070nLN2 = null;
        if (z2 && z && !C1431420nLw.LIZJ(c1433670nPZ)) {
            this.LLJILJIL = true;
            InterfaceC1435810nT1 interfaceC1435810nT1 = this.LLJILLL;
            if (interfaceC1435810nT1 != null) {
                interfaceC1435810nT1.LIZLLL();
            }
            C1431070nLN c1431070nLN3 = this.LLJJ;
            if (c1431070nLN3 != null) {
                c1431070nLN2 = c1431070nLN3;
            }
            C1431070nLN.LIZ(c1431070nLN2);
            return;
        }
        LJIILL(null);
        C1435510nSX c1435510nSX = (C1435510nSX) this.LLJLILLLLZIIL.getValue();
        if (c1435510nSX != null) {
            c1435510nSX.LIZ();
        }
        this.LLJJIII = true;
        C1431070nLN c1431070nLN4 = this.LLJJ;
        if (c1431070nLN4 == null) {
            c1431070nLN4 = null;
        }
        c1431070nLN4.LIZIZ(new C1404990mfJ("DMVideoCompileTask", "PublishDurationMonitor Synthetise end failed"), EnumC2251001D8o.OUTER);
        if (!C1431420nLw.LIZJ(c1433670nPZ)) {
            C1431070nLN c1431070nLN5 = this.LLJJ;
            if (c1431070nLN5 == null) {
                c1431070nLN5 = null;
            }
            c1431070nLN5.LIZLLL(iLJFF, c1433670nPZ);
        }
        C918190a09 c918190a09 = this.LLJJJJ;
        if (c918190a09 != null) {
            c918190a09.LIZ();
        }
        this.LLJJJJ = null;
        C1435620nSi c1435620nSi2 = this.LLJLL;
        if (c1435620nSi2 != null) {
            c1435620nSi = c1435620nSi2;
        }
        c1435620nSi.LIZ();
    }

    public final void LJIIZILJ(SynthetiseResult synthetiseResult, boolean z) throws Throwable {
        InterfaceC1452170ntP interfaceC1452170ntP;
        C348100Dkm c348100DkmLIZIZ;
        String strLJIJJLI;
        InterfaceC1435810nT1 interfaceC1435810nT1;
        C1435260nS8 c1435260nS8;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DMVideoCompileTask -> onTaskSuccess, isSkip=");
        sbLIZ.append(z);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C1431070nLN c1431070nLN = this.LLJJ;
        C1435620nSi c1435620nSi = null;
        str = null;
        String str = null;
        SynthetiseResult synthetiseResultLJJIII = null;
        if (c1431070nLN != null && c1431070nLN.LIZJ != C291160Bb8.LIZ()) {
            C1431140nLU.LIZ();
            Integer num = Integer.MAX_VALUE;
            if (num.intValue() != Integer.MAX_VALUE) {
                int iIntValue = num.intValue();
                ICreativeSocialBridgeService iCreativeSocialBridgeServiceLJIILJJIL = LJIILJJIL();
                if (iCreativeSocialBridgeServiceLJIILJJIL != null) {
                    C1434960nRe c1434960nRe = this.LLJ;
                    if (c1434960nRe == null) {
                        c1434960nRe = null;
                    }
                    VideoPublishEditModel videoPublishEditModel = c1434960nRe.LIZ;
                    C1435240nS6 c1435240nS6 = this.LLJJJJLIIL;
                    if (c1435240nS6 != null && (c1435260nS8 = c1435240nS6.LIZLLL) != null) {
                        str = c1435260nS8.LIZJ;
                    }
                    synthetiseResultLJJIII = iCreativeSocialBridgeServiceLJIILJJIL.LJJIII(videoPublishEditModel, str);
                    if (synthetiseResultLJJIII != null) {
                        synthetiseResultLJJIII.ret = iIntValue;
                    }
                }
                C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("mock error code: ");
                sbLIZ2.append(iIntValue);
                c1437510nVlLJJLIIIJ.LIZ("compile", C2188811AlT.LIZIZ(sbLIZ2));
                C1433680nPa c1433680nPa = new C1433680nPa();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("mock compile failed: ");
                sbLIZ3.append(iIntValue);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                if (strLIZIZ != null) {
                    c1433680nPa.LIZJ = strLIZIZ;
                }
                if (synthetiseResultLJJIII != null) {
                    c1433680nPa.LIZ = synthetiseResultLJJIII;
                }
                LJIILLIIL(c1433680nPa.LIZ(), true);
                return;
            }
        }
        C1435510nSX c1435510nSX = (C1435510nSX) this.LLJLILLLLZIIL.getValue();
        if (c1435510nSX != null) {
            c1435510nSX.LIZ();
        }
        this.LLJJIII = true;
        CompileLevel compileLevel = this.LLJJLIIIJLLLLLLLZ;
        CompileLevel compileLevel2 = CompileLevel.COPY_WITH_METADATA;
        if (compileLevel == compileLevel2) {
            LJIILL(new C1434270nQX(compileLevel2));
        } else if (!C1435800nT0.LIZ.contains(compileLevel)) {
            LJIILL(null);
        }
        long jLIZIZ = this.LLJJIJIL.LIZIZ(TimeUnit.MILLISECONDS);
        C1431070nLN c1431070nLN2 = this.LLJJ;
        if (c1431070nLN2 == null) {
            c1431070nLN2 = null;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("PublishDurationMonitor Synthetise end success durationMs:");
        sbLIZ4.append(jLIZIZ);
        c1431070nLN2.LIZIZ(new C1404990mfJ("DMVideoCompileTask", C2188811AlT.LIZIZ(sbLIZ4)), EnumC2251001D8o.OUTER);
        if (z) {
            C1431070nLN c1431070nLN3 = this.LLJJ;
            if (c1431070nLN3 == null) {
                c1431070nLN3 = null;
            }
            C1436170nTb c1436170nTbLIZ = C1434500nQu.LIZ();
            if (c1436170nTbLIZ == null) {
                c1436170nTbLIZ = new C1436170nTb(0L, 0L, false, false, 31);
            }
            c1431070nLN3.LIZIZ(c1436170nTbLIZ, EnumC2251001D8o.ALL);
        }
        synthetiseResult.setSyntheticEndTime(new C1404680meo(0));
        synthetiseResult.setSkipFrameLogList(this.LLJJJIL);
        if (C297810Blr.LIZ() && (interfaceC1435810nT1 = this.LLJILLL) != null) {
            interfaceC1435810nT1.disableDeleteCacheWhenEnd(true);
        }
        if (!z && (interfaceC1452170ntP = this.LLJJI) != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP)) != null) {
            ICreativeSocialBridgeService iCreativeSocialBridgeServiceLJIILJJIL2 = LJIILJJIL();
            if (iCreativeSocialBridgeServiceLJIILJJIL2 != null) {
                INLEMediaSession iNLEMediaSession = c348100DkmLIZIZ.LIZIZ;
                C1434960nRe c1434960nRe2 = this.LLJ;
                if (c1434960nRe2 == null) {
                    c1434960nRe2 = null;
                }
                strLJIJJLI = iCreativeSocialBridgeServiceLJIILJJIL2.LJIJJLI(iNLEMediaSession, c1434960nRe2.LIZ);
            } else {
                strLJIJJLI = null;
            }
            C1431070nLN c1431070nLN4 = this.LLJJ;
            if (c1431070nLN4 == null) {
                c1431070nLN4 = null;
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("audio_metrics result = ");
            sbLIZ5.append(strLJIJJLI);
            c1431070nLN4.LIZIZ(new C1404990mfJ("DMVideoCompileTask", C2188811AlT.LIZIZ(sbLIZ5)), EnumC2251001D8o.OUTER);
        }
        C23250099c.LJ(C23271099x.INSTANCE, new C1407910mk1(this, null));
        synthetiseResult.isSkip = z;
        C1431070nLN c1431070nLN5 = this.LLJJ;
        if (c1431070nLN5 == null) {
            c1431070nLN5 = null;
        }
        c1431070nLN5.LJ(synthetiseResult, z);
        String str2 = synthetiseResult.outputFile;
        if (this.LLJJJJJIL != null) {
            C1431070nLN c1431070nLN6 = this.LLJJ;
            if (c1431070nLN6 == null) {
                c1431070nLN6 = null;
            }
            c1431070nLN6.LIZIZ(new C1435310nSD(str2, synthetiseResult.videoWidth, synthetiseResult.videoHeight), EnumC2251001D8o.ALL);
        } else {
            C1431070nLN c1431070nLN7 = this.LLJJ;
            if (c1431070nLN7 == null) {
                c1431070nLN7 = null;
            }
            c1431070nLN7.LIZIZ(new C1431030nLJ(str2), EnumC2251001D8o.ALL);
        }
        C918190a09 c918190a09 = this.LLJJJJ;
        if (c918190a09 != null) {
            c918190a09.LIZ();
        }
        this.LLJJJJ = null;
        C1435620nSi c1435620nSi2 = this.LLJLL;
        if (c1435620nSi2 != null) {
            c1435620nSi = c1435620nSi2;
        }
        c1435620nSi.LIZ();
    }

    public final void LJIJ(InterfaceC2221271Bwj interfaceC2221271Bwj, long j, int i, boolean z, SynthetiseResult synthetiseResult) {
        try {
            C0CHQ.LIZ().getPublishService().LJJIIZI().getClass();
            C1436930nUp.LIZ();
            InterfaceC1435810nT1 interfaceC1435810nT1 = this.LLJILLL;
            if (interfaceC1435810nT1 != null) {
                interfaceC1435810nT1.LIZ(interfaceC2221271Bwj, j, i, z);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            SynthetiseResult synthetiseResultM316clone = synthetiseResult.m316clone();
            if (C1431420nLw.LIZ(e)) {
                synthetiseResultM316clone.ret = 100101;
            } else {
                synthetiseResultM316clone.ret = 1001;
            }
            LJIILLIIL(new C1433670nPZ(e, synthetiseResultM316clone), !C1431420nLw.LIZ(e));
            C15O7.LIZJ(new ACallableS427S0100000_22(this, 22));
        }
    }
}
