package X;

import Y.ARunnableS122S0100000_22;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.wavepublish.experiment.EnableParallelPublishSchedulerV2Exp;
import java.util.Iterator;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0nRw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1435140nRw extends AbstractC1434490nQt {
    public C1404570med LLILZLL;
    public VideoPublishEditModel LLIZ;
    public PublishModel LLIZLLLIL;
    public C1431070nLN LLJ;
    public InterfaceC1434300nQa LLJI;
    public SynthetiseResult LLJIJIL;
    public AnonymousClass0956 LLJILJIL;
    public C1463670oBx LLJILJILJ;

    public final void LJIILJJIL() {
        InterfaceC1434300nQa interfaceC1434300nQa = this.LLJI;
        if (interfaceC1434300nQa == null) {
            interfaceC1434300nQa = null;
        }
        interfaceC1434300nQa.LJFF();
        C1434840nRS.LIZ();
        C05XT.LIZ(new ARunnableS122S0100000_22(this, 112));
    }

    public final void LJIILLIIL() throws Throwable {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[IndependentWatermarkVideoCompileTask] onTaskSuccess publishId=");
        C1404570med c1404570med = this.LLILZLL;
        if (c1404570med == null) {
            c1404570med = null;
        }
        sbLIZ.append(c1404570med.LIZ);
        C201955140j.LIZIZ("DetachWaterMark", C2188811AlT.LIZIZ(sbLIZ));
        LJIILJJIL();
        C23250099c.LJ(C23271099x.INSTANCE, new C537590L6n(this, null));
        C1431070nLN c1431070nLN = this.LLJ;
        if (c1431070nLN == null) {
            c1431070nLN = null;
        }
        c1431070nLN.LIZIZ(new C1404990mfJ(LJIILIIL(), "watermark video compile success"), EnumC2251001D8o.OUTER);
        C1431070nLN c1431070nLN2 = this.LLJ;
        if (c1431070nLN2 == null) {
            c1431070nLN2 = null;
        }
        c1431070nLN2.LJ(null, false);
    }

    @Override // X.AbstractC1434490nQt
    public final EnumC1434810nRP LJIIJJI() {
        return EnumC1434810nRP.INDEPENDENT_WATERMARK_VIDEO_COMPILE;
    }

    public final void LJIILL(C1435160nRy c1435160nRy) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[IndependentWatermarkVideoCompileTask] onTaskFailed publishId=");
        C1404570med c1404570med = this.LLILZLL;
        if (c1404570med == null) {
            c1404570med = null;
        }
        sbLIZ.append(c1404570med.LIZ);
        sbLIZ.append(" reason=");
        sbLIZ.append(C1431180nLY.optMessage$default(c1435160nRy, null, 1, null));
        C201955140j.LIZIZ("DetachWaterMark", C2188811AlT.LIZIZ(sbLIZ));
        C1431070nLN c1431070nLN = this.LLJ;
        if (c1431070nLN == null) {
            c1431070nLN = null;
        }
        c1431070nLN.LJ(null, false);
        C1431070nLN c1431070nLN2 = this.LLJ;
        if (c1431070nLN2 == null) {
            c1431070nLN2 = null;
        }
        String strLJIILIIL = LJIILIIL();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("watermark video compile error, reason: ");
        sbLIZ2.append(C1431180nLY.optMessage$default(c1435160nRy, null, 1, null));
        c1431070nLN2.LIZIZ(new C1404990mfJ(strLJIILIIL, C2188811AlT.LIZIZ(sbLIZ2)), EnumC2251001D8o.OUTER);
        LJIILJJIL();
    }

    @Override // X.AbstractC1434490nQt, X.C1D8B
    public final boolean LIZIZ(AbstractC1404540mea abstractC1404540mea, InterfaceC1434410nQl interfaceC1434410nQl) {
        boolean z;
        boolean z2;
        AnonymousClass0956 anonymousClass0956;
        super.LIZIZ(abstractC1404540mea, interfaceC1434410nQl);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[IndependentWatermarkVideoCompileTask] cancel publishId=");
        C1404570med c1404570med = this.LLILZLL;
        if (c1404570med == null) {
            c1404570med = null;
        }
        sbLIZ.append(c1404570med.LIZ);
        sbLIZ.append(" cause=");
        sbLIZ.append(abstractC1404540mea);
        sbLIZ.append(" hasJob=");
        if (this.LLJILJIL != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(" hasEditor=");
        if (this.LLJILJILJ != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sbLIZ.append(z2);
        C201955140j.LIZIZ("DetachWaterMark", C2188811AlT.LIZIZ(sbLIZ));
        AnonymousClass0956 anonymousClass09562 = this.LLJILJIL;
        if (anonymousClass09562 != null && !anonymousClass09562.isCancelled() && (anonymousClass0956 = this.LLJILJIL) != null) {
            anonymousClass0956.LIZIZ(null);
        }
        LJIILJJIL();
        return true;
    }

    @Override // X.AbstractC1434490nQt
    public final void LJII(C1404610meh c1404610meh, C1431070nLN c1431070nLN) throws Throwable {
        boolean z;
        SynthetiseResult synthetiseResult;
        boolean z2;
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            C1404570med c1404570med = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (next instanceof C1434960nRe) {
                if (next != null) {
                    this.LLIZ = ((C1434960nRe) next).LIZ;
                    this.LLJ = c1431070nLN;
                    Iterator<Object> it3 = c1404610meh.LIZ.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next2 = it3.next();
                        if (next2 instanceof InterfaceC1434300nQa) {
                            if (next2 != null) {
                                this.LLJI = (InterfaceC1434300nQa) next2;
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
                                                if (next4 instanceof SynthetiseResult) {
                                                    if (next4 != null) {
                                                        this.LLJIJIL = (SynthetiseResult) next4;
                                                        Iterator<Object> it6 = c1404610meh.LIZ.iterator();
                                                        while (true) {
                                                            if (!it6.hasNext()) {
                                                                break;
                                                            }
                                                            Object next5 = it6.next();
                                                            if (next5 instanceof C1434970nRf) {
                                                                if (next5 != null) {
                                                                    this.LLIZLLLIL = ((C1434970nRf) next5).LIZ;
                                                                    EnableParallelPublishSchedulerV2Exp.Config configLIZ = EnableParallelPublishSchedulerV2Exp.LIZ();
                                                                    if (configLIZ.enable && configLIZ.watermarkDetachEnable) {
                                                                        z = true;
                                                                    } else {
                                                                        z = false;
                                                                    }
                                                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                                    sbLIZ.append("[IndependentWatermarkVideoCompileTask] execute start publishId=");
                                                                    C1404570med c1404570med2 = this.LLILZLL;
                                                                    if (c1404570med2 == null) {
                                                                        c1404570med2 = null;
                                                                    }
                                                                    sbLIZ.append(c1404570med2.LIZ);
                                                                    sbLIZ.append(" detachEnable=");
                                                                    sbLIZ.append(z);
                                                                    sbLIZ.append(" isSkip=");
                                                                    SynthetiseResult synthetiseResult2 = this.LLJIJIL;
                                                                    if (synthetiseResult2 == null) {
                                                                        synthetiseResult2 = null;
                                                                    }
                                                                    sbLIZ.append(synthetiseResult2.isSkip);
                                                                    sbLIZ.append(" watermarkInputFile=");
                                                                    SynthetiseResult synthetiseResult3 = this.LLJIJIL;
                                                                    if (synthetiseResult3 == null) {
                                                                        synthetiseResult3 = null;
                                                                    }
                                                                    sbLIZ.append(synthetiseResult3.watermarkInputFile);
                                                                    sbLIZ.append(" outputFile=");
                                                                    VideoPublishEditModel videoPublishEditModel = this.LLIZ;
                                                                    if (videoPublishEditModel == null) {
                                                                        videoPublishEditModel = null;
                                                                    }
                                                                    String outputFile = videoPublishEditModel.getOutputFile();
                                                                    if (outputFile == null) {
                                                                        outputFile = "";
                                                                    }
                                                                    sbLIZ.append(outputFile);
                                                                    C201955140j.LIZIZ("DetachWaterMark", C2188811AlT.LIZIZ(sbLIZ));
                                                                    if (z) {
                                                                        SynthetiseResult synthetiseResult4 = this.LLJIJIL;
                                                                        if (synthetiseResult4 == null) {
                                                                            synthetiseResult = null;
                                                                        } else {
                                                                            synthetiseResult = synthetiseResult4;
                                                                        }
                                                                        if (synthetiseResult.isSkip) {
                                                                            if (synthetiseResult4 == null) {
                                                                                synthetiseResult4 = null;
                                                                            }
                                                                            String str = synthetiseResult4.watermarkInputFile;
                                                                            if (str != null && str.length() != 0) {
                                                                                z2 = false;
                                                                            } else {
                                                                                z2 = true;
                                                                            }
                                                                            if (z2 || !C2286708xd.LIZJ(str) || C2286708xd.LJIIL(str) <= 0) {
                                                                                VideoPublishEditModel videoPublishEditModel2 = this.LLIZ;
                                                                                if (videoPublishEditModel2 == null) {
                                                                                    videoPublishEditModel2 = null;
                                                                                }
                                                                                String outputFile2 = videoPublishEditModel2.getOutputFile();
                                                                                if (outputFile2 == null || outputFile2.length() == 0 || !C2286708xd.LIZJ(outputFile2) || C2286708xd.LJIIL(outputFile2) <= 0) {
                                                                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                                                    sbLIZ2.append("[IndependentWatermarkVideoCompileTask] skip: detachEnable=true & isSkip=true & no valid input file, publishId=");
                                                                                    C1404570med c1404570med3 = this.LLILZLL;
                                                                                    if (c1404570med3 != null) {
                                                                                        c1404570med = c1404570med3;
                                                                                    }
                                                                                    sbLIZ2.append(c1404570med.LIZ);
                                                                                    C201955140j.LIZIZ("DetachWaterMark", C2188811AlT.LIZIZ(sbLIZ2));
                                                                                    LJIILLIIL();
                                                                                    return;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    this.LLJILJIL = C23250099c.LIZLLL(C2296808zG.LIZ(C576120Mig.LIZIZ.plus(new C1466930oHD(CoroutineExceptionHandler.LJJLIL, this, 1))), null, null, new C1435590nSf(this, null), 3);
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
                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishId");
                            }
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.publisherbuilder.ITaskExternalDependencyFactory");
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
    }
}
