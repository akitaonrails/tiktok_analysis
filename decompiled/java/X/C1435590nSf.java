package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.wavepublish.experiment.EnableParallelPublishSchedulerV2Exp;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.VEWatermarkParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS16S0000001_18;
import njp.a;

/* JADX INFO: renamed from: X.0nSf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.wavepublish.normal.IndependentWatermarkVideoCompileTask$addWatermarkWithSourceVideo$1", f = "IndependentWatermarkVideoCompileTask.kt", l = {225}, m = "invokeSuspend")
public final class C1435590nSf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1435140nRw LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1435590nSf(C1435140nRw c1435140nRw, InterfaceC1364105Vn<? super C1435590nSf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1435140nRw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1435590nSf(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String outputFile;
        boolean zLJIIIIZZ;
        String parent;
        C1C7U.LIZ("IndependentWatermarkVideoCompileTask@2c38.addWatermarkWithSourceVideo$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            EnableParallelPublishSchedulerV2Exp.Config configLIZ = EnableParallelPublishSchedulerV2Exp.LIZ();
            if (configLIZ.enable && configLIZ.watermarkDetachEnable && configLIZ.watermarkWaitClickPublish) {
                long jLJFF = C13LZ.LJFF(configLIZ.watermarkWaitClickPublishDelayMs, 0L, 10000L);
                if (jLJFF > 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[IndependentWatermarkVideoCompileTask] post-click delay ");
                    sbLIZ.append(jLJFF);
                    sbLIZ.append("ms publishId=");
                    C1404570med c1404570med = this.LLILLJJLI.LLILZLL;
                    if (c1404570med == null) {
                        c1404570med = null;
                    }
                    sbLIZ.append(c1404570med.LIZ);
                    C201955140j.LIZIZ("DetachWaterMark", C2188811AlT.LIZIZ(sbLIZ));
                    this.LL = 1;
                    if (AnonymousClass0958.LIZIZ(jLJFF, this) == objLJFF) {
                        C1C7U.LIZIZ("IndependentWatermarkVideoCompileTask@2c38.addWatermarkWithSourceVideo$1");
                        return objLJFF;
                    }
                }
            }
        }
        this.LLILLJJLI.getClass();
        C0CHQ.LIZ().LJIIJJI();
        C1435140nRw c1435140nRw = this.LLILLJJLI;
        SynthetiseResult synthetiseResult = c1435140nRw.LLJIJIL;
        if (synthetiseResult == null) {
            synthetiseResult = null;
        }
        if (C2286708xd.LIZJ(synthetiseResult.watermarkInputFile)) {
            SynthetiseResult synthetiseResult2 = c1435140nRw.LLJIJIL;
            if (synthetiseResult2 == null) {
                synthetiseResult2 = null;
            }
            outputFile = synthetiseResult2.watermarkInputFile;
        } else {
            VideoPublishEditModel videoPublishEditModel = c1435140nRw.LLIZ;
            if (videoPublishEditModel == null) {
                videoPublishEditModel = null;
            }
            outputFile = videoPublishEditModel.getOutputFile();
            if (outputFile == null) {
                outputFile = "";
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[IndependentWatermarkVideoCompileTask] addWatermark publishId=");
        C1404570med c1404570med2 = this.LLILLJJLI.LLILZLL;
        if (c1404570med2 == null) {
            c1404570med2 = null;
        }
        sbLIZ2.append(c1404570med2.LIZ);
        sbLIZ2.append(" inputPath=");
        sbLIZ2.append(outputFile);
        C201955140j.LIZIZ("DetachWaterMark", C2188811AlT.LIZIZ(sbLIZ2));
        if (C2286708xd.LIZJ(outputFile) && C2286708xd.LJIIL(outputFile) > 0) {
            VideoPublishEditModel videoPublishEditModel2 = this.LLILLJJLI.LLIZ;
            if (videoPublishEditModel2 == null) {
                videoPublishEditModel2 = null;
            }
            String localTempPath = videoPublishEditModel2.getLocalTempPath();
            if (((Boolean) C0BNH.LIZ.getValue()).booleanValue() && localTempPath != null && (parent = new C0VSJ(localTempPath).getParent()) != null) {
                C2301108zx.LIZ(parent);
            }
            VideoPublishEditModel videoPublishEditModel3 = this.LLILLJJLI.LLIZ;
            if (videoPublishEditModel3 == null) {
                videoPublishEditModel3 = null;
            }
            InterfaceC570310MYj pathService = C0CHQ.LIZ().LJJIIJZLJL().getPathService();
            CreativeInfo creativeInfo = videoPublishEditModel3.getCreativeInfo();
            EnumC20228014Cw enumC20228014Cw = EnumC20228014Cw.INDEPENDENT_WATERMARK;
            String strLJIJ = pathService.LJIJ(creativeInfo, enumC20228014Cw, "add_effect_watermark", true);
            C1464020oCW c1464020oCW = EnumC1464030oCX.Companion;
            int value = C1435860nT6.LIZIZ.getValue();
            c1464020oCW.getClass();
            EnumC1464030oCX enumC1464030oCXLIZ = C1464020oCW.LIZ(value);
            C1442030nd3 c1442030nd3 = EnumC1442010nd1.Companion;
            int value2 = C1435860nT6.LIZLLL.getValue();
            c1442030nd3.getClass();
            C1463670oBx c1463670oBx = new C1463670oBx(strLJIJ, enumC1464030oCXLIZ, C1442030nd3.LIZ(value2), false, null, null, 1016);
            c1463670oBx.setLoopPlay(false);
            c1463670oBx.setPageMode(2);
            if (!C1435860nT6.LIZJ) {
                VideoPublishEditModel videoPublishEditModel4 = this.LLILLJJLI.LLIZ;
                if (videoPublishEditModel4 == null) {
                    videoPublishEditModel4 = null;
                }
                String strLJIJ2 = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIJ(videoPublishEditModel4.getCreativeInfo(), enumC20228014Cw, "add_effect_watermark", true);
                VideoPublishEditModel videoPublishEditModel5 = this.LLILLJJLI.LLIZ;
                if (videoPublishEditModel5 == null) {
                    videoPublishEditModel5 = null;
                }
                EnumC1464030oCX enumC1464030oCXLIZ2 = C1464020oCW.LIZ(C1428520nHG.LJJZZIII(videoPublishEditModel5).getValue());
                VideoPublishEditModel videoPublishEditModel6 = this.LLILLJJLI.LLIZ;
                if (videoPublishEditModel6 == null) {
                    videoPublishEditModel6 = null;
                }
                c1463670oBx = new C1463670oBx(strLJIJ2, enumC1464030oCXLIZ2, C1442030nd3.LIZ(C1428520nHG.LJJZZI(videoPublishEditModel6).getValue()), false, null, null, 1016);
                c1463670oBx.setLoopPlay(false);
                c1463670oBx.setPageMode(2);
            }
            C1DOU c1dou = new C1DOU(new String[]{outputFile});
            c1dou.LJIIJ = EnumC1464490oDH.VIDEO_OUT_RATIO_ORIGINAL;
            C348100Dkm c348100DkmLIZLLL = c1463670oBx.LIZLLL();
            if (c348100DkmLIZLLL != null) {
                C571670MbV.LIZ(c1dou, c348100DkmLIZLLL.LIZ);
                VideoPublishEditModel videoPublishEditModel7 = this.LLILLJJLI.LLIZ;
                if (videoPublishEditModel7 == null) {
                    videoPublishEditModel7 = null;
                }
                c1463670oBx.addMetadata("com.apple.quicktime.information", C1403720mdG.LIZ(videoPublishEditModel7));
                c1463670oBx.setBackgroundColor(-1);
                C1435140nRw c1435140nRw2 = this.LLILLJJLI;
                c1435140nRw2.getClass();
                C1433290nOx c1433290nOx = C1433290nOx.LIZ;
                VideoPublishEditModel videoPublishEditModel8 = c1435140nRw2.LLIZ;
                if (videoPublishEditModel8 == null) {
                    videoPublishEditModel8 = null;
                }
                c1433290nOx.getClass();
                VEWatermarkParam vEWatermarkParamLIZJ = C1433290nOx.LIZJ(videoPublishEditModel8, true, false);
                if (vEWatermarkParamLIZJ == null) {
                    "watermark parameter should not be null in independent watermark compile task".toString();
                    throw new IllegalArgumentException("watermark parameter should not be null in independent watermark compile task");
                }
                vEWatermarkParamLIZJ.needExtFile = false;
                VideoPublishEditModel videoPublishEditModel9 = c1435140nRw2.LLIZ;
                if (videoPublishEditModel9 == null) {
                    videoPublishEditModel9 = null;
                }
                C1404570med c1404570med3 = c1435140nRw2.LLILZLL;
                if (c1404570med3 == null) {
                    c1404570med3 = null;
                }
                VEVideoEncodeSettings vEVideoEncodeSettingsLIZJ = C1437030nUz.LIZJ(videoPublishEditModel9, vEWatermarkParamLIZJ, c1463670oBx, c1404570med3.LIZ, C1435130nRv.LIZIZ, true, false, false);
                boolean zIsEnableRemuxVideo = vEVideoEncodeSettingsLIZJ.isEnableRemuxVideo();
                Integer numValueOf = Integer.valueOf(c1463670oBx.kf(vEVideoEncodeSettingsLIZJ));
                vEVideoEncodeSettingsLIZJ.setEnableRemuxVideo(zIsEnableRemuxVideo);
                c1435140nRw2.LJIIIZ().LIZJ();
                String strLJIILIIL = c1435140nRw2.LJIILIIL();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("remuxErrorCode: ");
                sbLIZ3.append(numValueOf);
                C1405310mfp.LIZLLL(strLJIILIIL, C2188811AlT.LIZIZ(sbLIZ3));
                if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_fingerprint_opt_v2_kill_switch", true, false) && C1429580nIy.LIZ()) {
                    VideoPublishEditModel videoPublishEditModel10 = this.LLILLJJLI.LLIZ;
                    if (videoPublishEditModel10 == null) {
                        videoPublishEditModel10 = null;
                    }
                    NLEModel nleModel = videoPublishEditModel10.getNleModel();
                    if (nleModel != null) {
                        zLJIIIIZZ = C1429320nIY.LJIIIIZZ(nleModel);
                    } else {
                        zLJIIIIZZ = false;
                    }
                    C1435570nSd c1435570nSd = C1435570nSd.LIZ;
                    VideoPublishEditModel videoPublishEditModel11 = this.LLILLJJLI.LLIZ;
                    if (videoPublishEditModel11 == null) {
                        videoPublishEditModel11 = null;
                    }
                    c1435570nSd.getClass();
                    if (C1435570nSd.LIZLLL(videoPublishEditModel11, zLJIIIIZZ) && (C290500Ba4.LIZ() || C290490Ba3.LIZ())) {
                        PublishModel publishModel = this.LLILLJJLI.LLIZLLLIL;
                        if (publishModel != null && publishModel.isEditSave) {
                            if (C290500Ba4.LIZ()) {
                                VideoPublishEditModel videoPublishEditModel12 = this.LLILLJJLI.LLIZ;
                                if (videoPublishEditModel12 == null) {
                                    videoPublishEditModel12 = null;
                                }
                                vEVideoEncodeSettingsLIZJ.setVideoInvisibleWatermarkSettings(C1435570nSd.LIZ(videoPublishEditModel12));
                            }
                        } else if (C290490Ba3.LIZ()) {
                            VideoPublishEditModel videoPublishEditModel13 = this.LLILLJJLI.LLIZ;
                            if (videoPublishEditModel13 == null) {
                                videoPublishEditModel13 = null;
                            }
                            vEVideoEncodeSettingsLIZJ.setVideoInvisibleWatermarkSettings(C1435570nSd.LIZ(videoPublishEditModel13));
                        }
                    }
                }
                final C1435140nRw c1435140nRw3 = this.LLILLJJLI;
                c1463670oBx.Qe(localTempPath, null, vEVideoEncodeSettingsLIZJ, new InterfaceC574560MgA() { // from class: X.0nRx
                    @Override // X.InterfaceC574560MgA
                    public final void onCompileDone() throws Throwable {
                        c1435140nRw3.LJIILLIIL();
                    }

                    @Override // X.InterfaceC574560MgA
                    public final void onCompileProgress(float f) {
                        c1435140nRw3.LJIIIZ().LIZJ();
                        C1405310mfp.LJ(c1435140nRw3.LJIILIIL(), new AwS16S0000001_18(f, 2));
                    }

                    @Override // X.InterfaceC574560MgA
                    public final void onCompileError(int i2, int i3, float f, String str) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("error: ");
                        sbLIZ4.append(i2);
                        sbLIZ4.append(", ext=");
                        sbLIZ4.append(i3);
                        sbLIZ4.append(", f=");
                        sbLIZ4.append(f);
                        sbLIZ4.append(", msg=");
                        sbLIZ4.append(str);
                        c1435140nRw3.LJIILL(new C1435160nRy(C2188811AlT.LIZIZ(sbLIZ4)));
                    }
                });
                this.LLILLJJLI.LLJILJILJ = c1463670oBx;
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("IndependentWatermarkVideoCompileTask@2c38.addWatermarkWithSourceVideo$1");
                return unit;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        C1435140nRw c1435140nRw4 = this.LLILLJJLI;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("file not exists: ");
        sbLIZ4.append(outputFile);
        c1435140nRw4.LJIILL(new C1435160nRy(C2188811AlT.LIZIZ(sbLIZ4)));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("IndependentWatermarkVideoCompileTask@2c38.addWatermarkWithSourceVideo$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
