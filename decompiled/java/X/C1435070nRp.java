package X;

import Y.ARunnableS122S0100000_22;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.publish.CompileLevel;
import com.ss.android.ugc.aweme.creative.model.publish.DirectUploadParams;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS16S0000001_18;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0nRp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1435070nRp extends AbstractC1434490nQt {
    public C1404570med LLILZLL;
    public VideoPublishEditModel LLIZ;
    public C1431070nLN LLIZLLLIL;
    public InterfaceC1434300nQa LLJ;
    public SynthetiseResult LLJI;
    public InterfaceC1452170ntP LLJIJIL;
    public C1434270nQX LLJILJIL;

    @Override // X.AbstractC1434490nQt
    public final EnumC1434810nRP LJIIJJI() {
        return EnumC1434810nRP.EXTRA_COMPILE;
    }

    public final void LJIILL(boolean z) {
        InterfaceC1434300nQa interfaceC1434300nQa = this.LLJ;
        SynthetiseResult synthetiseResult = null;
        if (interfaceC1434300nQa == null) {
            interfaceC1434300nQa = null;
        }
        interfaceC1434300nQa.LJFF();
        C1434840nRS.LIZ();
        C05XT.LIZ(new ARunnableS122S0100000_22(this, 111));
        C1431070nLN c1431070nLN = this.LLIZLLLIL;
        if (c1431070nLN == null) {
            c1431070nLN = null;
        }
        c1431070nLN.LIZIZ(new C1404990mfJ(LJIILIIL(), "[direct_upload]extra video compile success"), EnumC2251001D8o.OUTER);
        C1431070nLN c1431070nLN2 = this.LLIZLLLIL;
        if (c1431070nLN2 == null) {
            c1431070nLN2 = null;
        }
        SynthetiseResult synthetiseResult2 = this.LLJI;
        if (synthetiseResult2 != null) {
            synthetiseResult = synthetiseResult2;
        }
        c1431070nLN2.LJ(synthetiseResult, z);
    }

    @Override // X.AbstractC1434490nQt
    public final void LJII(C1404610meh c1404610meh, C1431070nLN c1431070nLN) {
        Object next;
        SynthetiseResult synthetiseResult;
        Map<String, String> map;
        CompileLevel compileLevel;
        this.LLIZLLLIL = c1431070nLN;
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (next2 instanceof InterfaceC1434300nQa) {
                if (next2 != null) {
                    this.LLJ = (InterfaceC1434300nQa) next2;
                    Iterator<Object> it3 = c1404610meh.LIZ.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (next == null || (next instanceof C1434270nQX)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    if (!(next instanceof C1434270nQX)) {
                        next = null;
                    }
                    this.LLJILJIL = (C1434270nQX) next;
                    Iterator<Object> it4 = c1404610meh.LIZ.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        Object next3 = it4.next();
                        if (next3 instanceof C1404570med) {
                            if (next3 != null) {
                                this.LLILZLL = (C1404570med) next3;
                                Iterator<Object> it5 = c1404610meh.LIZ.iterator();
                                while (true) {
                                    if (!it5.hasNext()) {
                                        break;
                                    }
                                    Object next4 = it5.next();
                                    if (next4 instanceof C1434960nRe) {
                                        if (next4 != null) {
                                            this.LLIZ = ((C1434960nRe) next4).LIZ;
                                            Iterator<Object> it6 = c1404610meh.LIZ.iterator();
                                            while (true) {
                                                if (!it6.hasNext()) {
                                                    break;
                                                }
                                                Object next5 = it6.next();
                                                if (next5 instanceof SynthetiseResult) {
                                                    if (next5 != null) {
                                                        this.LLJI = (SynthetiseResult) next5;
                                                        Iterator<Object> it7 = c1404610meh.LIZ.iterator();
                                                        while (true) {
                                                            if (!it7.hasNext()) {
                                                                break;
                                                            }
                                                            Object next6 = it7.next();
                                                            if (next6 instanceof C1434970nRf) {
                                                                if (next6 != null) {
                                                                    if (!((C1434970nRf) next6).LIZ.isEditSave) {
                                                                        SynthetiseResult synthetiseResult2 = this.LLJI;
                                                                        if (synthetiseResult2 == null) {
                                                                            synthetiseResult = null;
                                                                        } else {
                                                                            synthetiseResult = synthetiseResult2;
                                                                        }
                                                                        if (synthetiseResult.isSkip) {
                                                                            VideoPublishEditModel videoPublishEditModel = this.LLIZ;
                                                                            if (videoPublishEditModel == null) {
                                                                                videoPublishEditModel = null;
                                                                            }
                                                                            DirectUploadParams directUploadParams = videoPublishEditModel.creativeModel.prePublishStatusModel.replaceDirectUploadParams;
                                                                            if (directUploadParams == null || (compileLevel = directUploadParams.compileLevel) == null ? synthetiseResult.compileLevel == CompileLevel.CLOUD_PROCESS_WITH_MUSIC : compileLevel == CompileLevel.CLOUD_PROCESS_WITH_MUSIC) {
                                                                                if (synthetiseResult2 == null) {
                                                                                    synthetiseResult2 = null;
                                                                                }
                                                                                synthetiseResult2.watermarkInputFile = "";
                                                                                try {
                                                                                    C1431730nMR c1431730nMRLJJIIZI = C0CHQ.LIZ().getPublishService().LJJIIZI();
                                                                                    new AwS601S0100000_22(this, 743);
                                                                                    c1431730nMRLJJIIZI.getClass();
                                                                                    C1436930nUp.LIZ();
                                                                                    LJIIIZ().LIZLLL();
                                                                                    VideoPublishEditModel videoPublishEditModel2 = this.LLIZ;
                                                                                    if (videoPublishEditModel2 == null) {
                                                                                        videoPublishEditModel2 = null;
                                                                                    }
                                                                                    InterfaceC1452170ntP interfaceC1452170ntPLIZ = C1441820nci.LIZ(videoPublishEditModel2, AFwS261S0000000_22.get$arr$(303));
                                                                                    interfaceC1452170ntPLIZ.setPageMode(2);
                                                                                    interfaceC1452170ntPLIZ.ag();
                                                                                    C1434270nQX c1434270nQX = this.LLJILJIL;
                                                                                    if (c1434270nQX != null && (map = c1434270nQX.LIZLLL) != null) {
                                                                                        for (Map.Entry<String, String> entry : map.entrySet()) {
                                                                                            interfaceC1452170ntPLIZ.addMetadata(entry.getKey(), entry.getValue());
                                                                                        }
                                                                                    }
                                                                                    this.LLJIJIL = interfaceC1452170ntPLIZ;
                                                                                    try {
                                                                                        VideoPublishEditModel videoPublishEditModel3 = this.LLIZ;
                                                                                        if (videoPublishEditModel3 == null) {
                                                                                            videoPublishEditModel3 = null;
                                                                                        }
                                                                                        C1404570med c1404570med = this.LLILZLL;
                                                                                        if (c1404570med == null) {
                                                                                            c1404570med = null;
                                                                                        }
                                                                                        VEVideoEncodeSettings vEVideoEncodeSettingsLIZJ = C1437030nUz.LIZJ(videoPublishEditModel3, null, interfaceC1452170ntPLIZ, c1404570med.LIZ, C1435130nRv.LIZIZ, false, false, false);
                                                                                        VideoPublishEditModel videoPublishEditModel4 = this.LLIZ;
                                                                                        if (videoPublishEditModel4 == null) {
                                                                                            videoPublishEditModel4 = null;
                                                                                        }
                                                                                        interfaceC1452170ntPLIZ.Qe(videoPublishEditModel4.getOutputFile(), null, vEVideoEncodeSettingsLIZJ, new InterfaceC574560MgA() { // from class: X.0nRr
                                                                                            @Override // X.InterfaceC574560MgA
                                                                                            public final void onCompileDone() {
                                                                                                this.LIZ.LJIIIZ().LIZJ();
                                                                                                String strLJIILIIL = this.LIZ.LJIILIIL();
                                                                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                                                                sbLIZ.append("[direct_upload]file=");
                                                                                                VideoPublishEditModel videoPublishEditModel5 = this.LIZ.LLIZ;
                                                                                                if (videoPublishEditModel5 == null) {
                                                                                                    videoPublishEditModel5 = null;
                                                                                                }
                                                                                                sbLIZ.append(videoPublishEditModel5.getOutputFile());
                                                                                                sbLIZ.append(", size=");
                                                                                                VideoPublishEditModel videoPublishEditModel6 = this.LIZ.LLIZ;
                                                                                                if (videoPublishEditModel6 == null) {
                                                                                                    videoPublishEditModel6 = null;
                                                                                                }
                                                                                                sbLIZ.append(new C0VSJ(videoPublishEditModel6.getOutputFile()).length());
                                                                                                C1405310mfp.LIZIZ(strLJIILIIL, C2188811AlT.LIZIZ(sbLIZ));
                                                                                                VideoPublishEditModel videoPublishEditModel7 = this.LIZ.LLIZ;
                                                                                                if (videoPublishEditModel7 == null) {
                                                                                                    videoPublishEditModel7 = null;
                                                                                                }
                                                                                                if (videoPublishEditModel7.isSaveLocalWithoutWaterMark()) {
                                                                                                    C2354709Kn.LJIJJ(C1449640npK.LJII);
                                                                                                    VideoPublishEditModel videoPublishEditModel8 = this.LIZ.LLIZ;
                                                                                                    if (videoPublishEditModel8 == null) {
                                                                                                        videoPublishEditModel8 = null;
                                                                                                    }
                                                                                                    String outputFile = videoPublishEditModel8.getOutputFile();
                                                                                                    VideoPublishEditModel videoPublishEditModel9 = this.LIZ.LLIZ;
                                                                                                    C2354709Kn.LIZLLL(outputFile, (videoPublishEditModel9 != null ? videoPublishEditModel9 : null).getLocalTempPath());
                                                                                                }
                                                                                                this.LIZ.LJIILL(false);
                                                                                            }

                                                                                            @Override // X.InterfaceC574560MgA
                                                                                            public final void onCompileProgress(float f) {
                                                                                                this.LIZ.LJIIIZ().LIZJ();
                                                                                                C1405310mfp.LJ(this.LIZ.LJIILIIL(), new AwS16S0000001_18(f, 1));
                                                                                            }

                                                                                            @Override // X.InterfaceC574560MgA
                                                                                            public final void onCompileError(int i, int i2, float f, String str) {
                                                                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                                                                sbLIZ.append("error: ");
                                                                                                sbLIZ.append(i);
                                                                                                sbLIZ.append(", ext=");
                                                                                                sbLIZ.append(i2);
                                                                                                sbLIZ.append(", f=");
                                                                                                sbLIZ.append(f);
                                                                                                sbLIZ.append(", msg=");
                                                                                                sbLIZ.append(str);
                                                                                                this.LIZ.LJIILJJIL(new C1435100nRs(C2188811AlT.LIZIZ(sbLIZ), null), i2);
                                                                                            }
                                                                                        });
                                                                                        return;
                                                                                    } catch (Throwable th) {
                                                                                        TryCatchGuardChecker.doCheck(th);
                                                                                        LJIIIZ().LIZJ();
                                                                                        C1405310mfp.LIZJ(LJIILIIL(), th);
                                                                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                                                        sbLIZ.append("[direct_upload]getVEEncodeSettings failed, ");
                                                                                        sbLIZ.append(th.getMessage());
                                                                                        LJIILJJIL(new C1435100nRs(C2188811AlT.LIZIZ(sbLIZ), th), 100110);
                                                                                        return;
                                                                                    }
                                                                                } catch (Exception e) {
                                                                                    TryCatchGuardChecker.doCheck(e);
                                                                                    LJIIIZ().LIZJ();
                                                                                    C1405310mfp.LIZJ(LJIILIIL(), e);
                                                                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                                                    sbLIZ2.append("[direct_upload]get_ve_editor_error, ");
                                                                                    sbLIZ2.append(e.getMessage());
                                                                                    LJIILJJIL(new C1435100nRs(C2188811AlT.LIZIZ(sbLIZ2), e), 100110);
                                                                                    return;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    LJIILL(true);
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
                                                    }
                                                }
                                            }
                                            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.SynthetiseResult");
                                        }
                                    }
                                }
                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
                            }
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishId");
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.publisherbuilder.ITaskExternalDependencyFactory");
    }

    public final void LJIILJJIL(C1435100nRs c1435100nRs, int i) {
        C1431070nLN c1431070nLN = this.LLIZLLLIL;
        InterfaceC1434300nQa interfaceC1434300nQa = null;
        if (c1431070nLN == null) {
            c1431070nLN = null;
        }
        SynthetiseResult synthetiseResult = this.LLJI;
        if (synthetiseResult == null) {
            synthetiseResult = null;
        }
        c1431070nLN.LJ(synthetiseResult, false);
        C1431070nLN c1431070nLN2 = this.LLIZLLLIL;
        if (c1431070nLN2 == null) {
            c1431070nLN2 = null;
        }
        String strLJIILIIL = LJIILIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[direct_upload]extra video compile error, reason: ");
        sbLIZ.append(c1435100nRs.getMessage());
        sbLIZ.append(", errCode=");
        sbLIZ.append(i);
        c1431070nLN2.LIZIZ(new C1404990mfJ(strLJIILIIL, C2188811AlT.LIZIZ(sbLIZ)), EnumC2251001D8o.OUTER);
        InterfaceC1434300nQa interfaceC1434300nQa2 = this.LLJ;
        if (interfaceC1434300nQa2 != null) {
            interfaceC1434300nQa = interfaceC1434300nQa2;
        }
        interfaceC1434300nQa.LJFF();
        C1434840nRS.LIZ();
        C05XT.LIZ(new ARunnableS122S0100000_22(this, 111));
    }
}
