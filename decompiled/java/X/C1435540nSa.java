package X;

import Y.ACallableS419S0100000_12;
import Y.ACallableS427S0100000_22;
import Y.ARunnableS0S0311100_22;
import android.net.Uri;
import com.bytedance.crash.Npth;
import com.bytedance.ies.nle.editor_jni.INLEExporter;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.MapStrStr;
import com.bytedance.ies.nle.editor_jni.NLECompileResult;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEUploadParams;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.canvas.CanvasBackground;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.AIGCInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.creative.model.publish.CompileLevel;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.aweme.wavepublish.utils.UploadResumeInfo;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.VEWatermarkParam;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS231S0300000_22;
import kotlin.jvm.internal.AwS388S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import v7.o;

/* JADX INFO: renamed from: X.0nSa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1435540nSa extends AbstractC1431200nLa {
    public static final C01GW<ExecutorService> LLLFFI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(540));
    public final boolean LLIZ;
    public final VEWatermarkParam LLIZLLLIL;
    public final boolean LLJ;
    public final Function0<Unit> LLJI;
    public final C01GW LLJIJIL;
    public final ExecutorService LLJILJIL;
    public C1434960nRe LLJILJILJ;
    public PublishModel LLJILLL;
    public C1404570med LLJJ;
    public InterfaceC1434170nQN LLJJI;
    public boolean LLJJIII;
    public C1931707hT LLJJIJI;
    public C2221281Bwk LLJJIJIIJIL;
    public C1431070nLN LLJJIJIL;
    public C1435350nSH LLJJJ;
    public C1435640nSk LLJJJIL;
    public volatile boolean LLJJJJ;
    public volatile boolean LLJJJJJIL;
    public SynthetiseResult LLJJJJLIIL;
    public final C138P LLJJL;
    public final List<String> LLJJLIIIJLLLLLLLZ;
    public volatile C918190a09 LLJL;
    public DMMediaModel LLJLIL;
    public C1435240nS6 LLJLILLLLZIIL;
    public AIGCInfo LLJLL;
    public CompileLevel LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public C1435620nSi LLL;
    public C1431990nMr LLLF;
    public final C1435730nSt LLLFF;

    public final void LJIILJJIL() throws IOException {
        C1435260nS8 c1435260nS8;
        CanvasBackground canvasBackground;
        CoverPublishModel coverPublishModel;
        C2221281Bwk c2221281Bwk;
        this.LLJJJJJIL = false;
        this.LLJJJIL = new C1435640nSk();
        this.LLJJJJLIIL = null;
        this.LLJJJJ = false;
        ((ArrayList) this.LLJJLIIIJLLLLLLLZ).clear();
        this.LLJJL.LIZJ();
        this.LLJJL.LIZLLL();
        C1434960nRe c1434960nRe = this.LLJILJILJ;
        if (C297790Blp.LIZ() && this.LLJLIL == null) {
            C1434960nRe c1434960nRe2 = this.LLJILJILJ;
            if (c1434960nRe2 == null) {
                c1434960nRe2 = null;
            }
            VideoPublishEditModel videoPublishEditModel = c1434960nRe2.LIZ;
            if (C297790Blp.LIZ() && videoPublishEditModel.creativeModel.dmMediaModel == null) {
                videoPublishEditModel.setCompileFinished(false);
                videoPublishEditModel.setSynthesisFileHash("");
                C1435600nSg.LIZJ(C1435600nSg.LJI(videoPublishEditModel));
                if (!C1435600nSg.LIZJ) {
                    C1435600nSg.LIZJ = true;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    for (Map.Entry<String, ?> entry : ((Keva) C1435600nSg.LIZIZ.getValue()).getAll().entrySet()) {
                        UploadResumeInfo uploadResumeInfoLJFF = C1435600nSg.LJFF(entry.getKey(), true);
                        if (uploadResumeInfoLJFF != null) {
                            if (!uploadResumeInfoLJFF.isCompileFinished()) {
                                C1435600nSg.LIZLLL(entry.getKey(), uploadResumeInfoLJFF);
                            } else if (!C1435600nSg.LIZ(uploadResumeInfoLJFF)) {
                                C1435600nSg.LIZLLL(entry.getKey(), uploadResumeInfoLJFF);
                            } else if (jCurrentTimeMillis - new C0VSJ(uploadResumeInfoLJFF.getRealSynthesisFilePath()).lastModified() > ((Number) C0AT1.LIZ.getValue()).longValue()) {
                                if (C297810Blr.LIZ()) {
                                    C1435600nSg.LIZJ(entry.getKey());
                                } else {
                                    C1435600nSg.LIZLLL(entry.getKey(), uploadResumeInfoLJFF);
                                }
                            }
                        }
                    }
                }
            }
        }
        try {
            C2221281Bwk c2221281Bwk2 = this.LLJJIJIIJIL;
            if (c2221281Bwk2 != null) {
                c2221281Bwk2.LJFF();
            }
            if (this.LLJLIL == null) {
                PublishModel publishModel = this.LLJILLL;
                if (publishModel == null) {
                    publishModel = null;
                }
                if (!publishModel.isEditSave && (c2221281Bwk = this.LLJJIJIIJIL) != null) {
                    C823190WQz c823190WQz = C823190WQz.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    C1434960nRe c1434960nRe3 = this.LLJILJILJ;
                    if (c1434960nRe3 == null) {
                        c1434960nRe3 = null;
                    }
                    sbLIZ.append(c1434960nRe3.LIZ.getCreationId());
                    sbLIZ.append("_compile");
                    c823190WQz.LIZ(C2188811AlT.LIZIZ(sbLIZ), c2221281Bwk.LJIILIIL);
                }
            }
            C2221281Bwk c2221281Bwk3 = this.LLJJIJIIJIL;
            if (c2221281Bwk3 != null) {
                c2221281Bwk3.LJIJI = false;
            }
            C0CHQ.LIZ().LJJ();
            C1440470naX c1440470naX = C1440470naX.LIZ;
            C1434960nRe c1434960nRe4 = this.LLJILJILJ;
            if (c1434960nRe4 == null) {
                c1434960nRe4 = null;
            }
            VideoPublishEditModel videoPublishEditModel2 = c1434960nRe4.LIZ;
            c1440470naX.getClass();
            C1440470naX.LIZIZ(videoPublishEditModel2, null);
            C1434960nRe c1434960nRe5 = this.LLJILJILJ;
            if (c1434960nRe5 == null) {
                c1434960nRe5 = null;
            }
            VideoPublishEditModel videoPublishEditModel3 = c1434960nRe5.LIZ;
            CanvasVideoData canvasVideoData = videoPublishEditModel3.getCanvasVideoData();
            if (canvasVideoData != null && (canvasBackground = canvasVideoData.background) != null) {
                CanvasBackground.Companion.getClass();
                if (!Intrinsics.LJFF(canvasBackground, CanvasBackground.DEFAULT_BACKGROUND) && (coverPublishModel = videoPublishEditModel3.getCoverPublishModel()) != null) {
                    coverPublishModel.setNeedExpandCompiledSize(true);
                }
            }
            try {
                C1435640nSk c1435640nSk = this.LLJJJIL;
                AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22(this, 1118);
                if (c1435640nSk.LIZIZ) {
                    synchronized (c1435640nSk) {
                        try {
                            c1435640nSk.LIZ = (InterfaceC1452170ntP) awS566S0100000_22.invoke();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                } else {
                    c1435640nSk.LIZ = (InterfaceC1452170ntP) awS566S0100000_22.invoke();
                }
                PublishModel publishModel2 = this.LLJILLL;
                if (publishModel2 == null) {
                    publishModel2 = null;
                }
                if (!publishModel2.isEditSave && this.LLJLIL == null) {
                    C0FG9.LIZ.getClass();
                    if (C0FG9.LIZ()) {
                        C0FFA c0ffa = C0FFA.LIZ;
                        C1434960nRe c1434960nRe6 = this.LLJILJILJ;
                        CreativeModel creativeModel = (c1434960nRe6 == null ? null : c1434960nRe6).LIZ.creativeModel;
                        if (c1434960nRe6 == null) {
                            c1434960nRe6 = null;
                        }
                        NLEModel nLEModel = c1434960nRe6.LIZ.creativeModel.nleInfoModel.nleModel;
                        c0ffa.getClass();
                        C0FFA.LJI(nLEModel, creativeModel);
                    }
                }
                this.LLJJJIL.LIZ(new AwS601S0100000_22(this, 912));
                this.LLJJJIL.LIZ(AFwS261S0000000_22.get$arr$(371));
                C1434960nRe c1434960nRe7 = this.LLJILJILJ;
                if (c1434960nRe7 == null) {
                    c1434960nRe7 = null;
                }
                VideoPublishEditModel videoPublishEditModel4 = c1434960nRe7.LIZ;
                C1435240nS6 c1435240nS6 = this.LLJLILLLLZIIL;
                SynthetiseResult synthetiseResultLIZ = C1431220nLc.LIZ(videoPublishEditModel4, (c1435240nS6 == null || (c1435260nS8 = c1435240nS6.LIZLLL) == null) ? null : c1435260nS8.LIZJ);
                this.LLJJJJLIIL = synthetiseResultLIZ;
                C1431730nMR c1431730nMRLJJIIZI = C0CHQ.LIZ().getPublishService().LJJIIZI();
                new AwS601S0100000_22(this, 913);
                c1431730nMRLJJIIZI.getClass();
                C1436930nUp.LIZ();
                this.LLJJJIL.LIZ(new AwS601S0100000_22(this, 919));
                if (this.LLJJJJ && C0C64.LJIILLIIL().LJIIIZ(31744, "studio_fix_publisher_cancelled_editor_crash", true, false)) {
                    Pair[] pairArr = new Pair[2];
                    C1434960nRe c1434960nRe8 = this.LLJILJILJ;
                    if (c1434960nRe8 == null) {
                        c1434960nRe8 = null;
                    }
                    pairArr[0] = new Pair("shoot_way", c1434960nRe8.LIZ.mShootWay);
                    PublishModel publishModel3 = this.LLJILLL;
                    pairArr[1] = new Pair("pre_publish_type", String.valueOf((publishModel3 != null ? publishModel3 : null).publishType));
                    Npth.reportBizException("publisher", new Throwable("already done while compile single video"), "already done while compile single video", C2097608Jq.LJIIIIZZ(pairArr));
                    return;
                }
                Object objLIZ = this.LLJJJIL.LIZ(new AwS231S0300000_22(this, synthetiseResultLIZ, this.LLIZLLLIL, 42));
                this.LLJJJIL.LIZ(new AwS388S0200000_22(this, synthetiseResultLIZ, 297));
                C2207291BaB.LIZIZ(C1ET4.TT_CONCURRENT_UPLOAD_COMPILE, 10000);
                C1435530nSZ c1435530nSZ = (C1435530nSZ) this.LLJJJIL.LIZ(new AwS388S0200000_22(this, this.LLIZLLLIL, 296));
                if (c1435530nSZ == null) {
                    c1435530nSZ = new C1435530nSZ(null, new NullPointerException("VEEditor is null"), 1);
                }
                VEVideoEncodeSettings vEVideoEncodeSettings = c1435530nSZ.LIZ;
                boolean z = vEVideoEncodeSettings != null;
                Throwable th2 = c1435530nSZ.LIZIZ;
                if (!(z ^ (th2 != null))) {
                    SynthetiseResult synthetiseResultM316clone = synthetiseResultLIZ.m316clone();
                    synthetiseResultM316clone.ret = 100107;
                    C1433680nPa c1433680nPa = new C1433680nPa();
                    c1433680nPa.LIZJ = "compile settings is invalid, plz check business logic first, there must be something wrong";
                    c1433680nPa.LIZ = synthetiseResultM316clone;
                    LJIJI(c1433680nPa.LIZ(), true);
                    return;
                }
                if (vEVideoEncodeSettings == null) {
                    SynthetiseResult synthetiseResultM316clone2 = synthetiseResultLIZ.m316clone();
                    synthetiseResultM316clone2.ret = 100108;
                    C1433680nPa c1433680nPa2 = new C1433680nPa();
                    if (th2 != null) {
                        c1433680nPa2.LIZLLL = th2;
                    }
                    c1433680nPa2.LIZ = synthetiseResultM316clone2;
                    LJIJI(c1433680nPa2.LIZ(), true);
                    return;
                }
                boolean zIsEnableRemuxVideo = vEVideoEncodeSettings.isEnableRemuxVideo();
                Integer num = (Integer) this.LLJJJIL.LIZ(new AwS601S0100000_22(vEVideoEncodeSettings, 915));
                int iIntValue = num != null ? num.intValue() : -2;
                vEVideoEncodeSettings.setEnableRemuxVideo(zIsEnableRemuxVideo);
                C1431070nLN c1431070nLN = this.LLJJIJIL;
                if (c1431070nLN == null) {
                    c1431070nLN = null;
                }
                c1431070nLN.LIZIZ(new C1404690mep(iIntValue), EnumC2251001D8o.OUTER);
                C1431070nLN c1431070nLN2 = this.LLJJIJIL;
                if (c1431070nLN2 == null) {
                    c1431070nLN2 = null;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("PublishDurationMonitor SynthetiseStart ");
                sbLIZ2.append(vEVideoEncodeSettings);
                c1431070nLN2.LIZIZ(new C1404990mfJ("CompileTask", C2188811AlT.LIZIZ(sbLIZ2)), EnumC2251001D8o.OUTER);
                C1431070nLN c1431070nLN3 = this.LLJJIJIL;
                if (c1431070nLN3 == null) {
                    c1431070nLN3 = null;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("mVEEditor.compile source.getOutputFile() : ");
                sbLIZ3.append(synthetiseResultLIZ.outputFile);
                c1431070nLN3.LIZIZ(new C1404990mfJ("CompileTask", C2188811AlT.LIZIZ(sbLIZ3)), EnumC2251001D8o.OUTER);
                this.LLJJJIL.LIZ(new AwS601S0100000_22(this, 914));
                C1434960nRe c1434960nRe9 = this.LLJILJILJ;
                C1442180ndI.LIZJ((c1434960nRe9 != null ? c1434960nRe9 : null).LIZ, vEVideoEncodeSettings, synthetiseResultLIZ.needRecode, iIntValue, this.LLIZLLLIL != null);
                if (objLIZ != null) {
                    C1931607hS.LIZ.getClass();
                    C0CHQ.LIZ().getPublishService().LJJIIZI().getClass();
                    C1436930nUp.LIZ();
                }
                this.LLJJJIL.LIZ(new AwS388S0200000_22(this, vEVideoEncodeSettings, 294));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1433680nPa c1433680nPa3 = new C1433680nPa();
                SynthetiseResult synthetiseResult = new SynthetiseResult();
                synthetiseResult.ret = 100104;
                c1433680nPa3.LIZ = synthetiseResult;
                c1433680nPa3.LIZLLL = e;
                LJIJI(c1433680nPa3.LIZ(), true);
            }
        } catch (C1431180nLY e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1433680nPa c1433680nPa4 = new C1433680nPa();
            c1433680nPa4.LIZLLL = e2;
            int errorCode = e2.getErrorCode();
            SynthetiseResult synthetiseResult2 = new SynthetiseResult();
            synthetiseResult2.ret = errorCode;
            c1433680nPa4.LIZ = synthetiseResult2;
            LJIJI(c1433680nPa4.LIZ(), true);
        }
    }

    public final void LJIILL() {
        C15O7.LIZJ(new ACallableS427S0100000_22(this, 20));
    }

    @Override // X.AbstractC1434490nQt
    public final int LJIIJ() {
        LJIIIZ().LJIIIIZZ().getClass();
        new C1404950mfF();
        return C1404950mfF.LIZ();
    }

    public final void LJJIFFI() {
        C1431990nMr c1431990nMr;
        if (!C0BXJ.LIZ() || (c1431990nMr = this.LLLF) == null) {
            return;
        }
        c1431990nMr.LIZ.remove(this.LLLFF);
    }

    public static final void LJIILLIIL(Function0<Unit> function0) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_enable_synthesis_callback_async", true, false)) {
            C15O7.LIZJ(new ACallableS419S0100000_12(function0, 6));
        } else {
            function0.invoke();
        }
    }

    public static Map LJJ(MapStrStr mapStrStr) {
        Set<Map.Entry<String, String>> setEntrySet;
        HashMap map = new HashMap();
        if (mapStrStr != null && (setEntrySet = mapStrStr.entrySet()) != null) {
            for (Map.Entry<String, String> entry : setEntrySet) {
                map.put(entry.getKey(), entry.getValue());
            }
            return map;
        }
        return C2097608Jq.LJ();
    }

    @Override // X.AbstractC1434490nQt, X.C1D8B
    public final boolean LIZLLL(Object obj) {
        super.LIZLLL(obj);
        if (this.LLJJJJ || this.LLJJJJJIL || this.LLJJJIL.LIZ(new AwS601S0100000_22(this, 917)) == null) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC1434490nQt, X.C1D8B
    public final void LJ(Object obj) {
        super.LJ(obj);
        if (this.LLJJJJJIL) {
            this.LLJJJIL.LIZ(new AwS601S0100000_22(this, 918));
        }
    }

    public final void LJIIZILJ(C1434270nQX c1434270nQX) {
        C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[direct_upload] notifyUploadTaskStart: ");
        sbLIZ.append(c1434270nQX);
        c1437510nVlLJJLIIIJ.LIZ("compile", C2188811AlT.LIZIZ(sbLIZ));
        if (c1434270nQX == null) {
            c1434270nQX = new C1434270nQX(CompileLevel.UNKNOWN);
        }
        C1431070nLN c1431070nLN = this.LLJJIJIL;
        if (c1431070nLN == null) {
            c1431070nLN = null;
        }
        c1431070nLN.LIZIZ(c1434270nQX, EnumC2251001D8o.ALL);
    }

    public final boolean LJJI(SynthetiseResult synthetiseResult) {
        try {
            C0CHQ.LIZ().getPublishService().LJJIIZI().getClass();
            C1436930nUp.LIZ();
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            SynthetiseResult synthetiseResultM316clone = synthetiseResult.m316clone();
            if (C1431420nLw.LIZ(e)) {
                synthetiseResultM316clone.ret = 100101;
            }
            LJIJI(new C1433670nPZ(e, synthetiseResultM316clone), !C1431420nLw.LIZ(e));
            LJIILL();
            return true;
        }
    }

    @Override // X.AbstractC1434490nQt, X.C1D8B
    public final boolean LIZIZ(AbstractC1404540mea abstractC1404540mea, InterfaceC1434410nQl interfaceC1434410nQl) {
        super.LIZIZ(abstractC1404540mea, interfaceC1434410nQl);
        C1431070nLN c1431070nLN = this.LLJJIJIL;
        C1435620nSi c1435620nSi = null;
        if (c1431070nLN == null) {
            c1431070nLN = null;
        }
        c1431070nLN.LIZIZ(new C1404990mfJ("CompileTask", "cancelUpload"), EnumC2251001D8o.OUTER);
        this.LLJJJJ = true;
        if (this.LLJLIL == null) {
            PublishModel publishModel = this.LLJILLL;
            if (publishModel == null) {
                publishModel = null;
            }
            if (!publishModel.isEditSave) {
                C823190WQz c823190WQz = C823190WQz.LIZ;
                C1434960nRe c1434960nRe = this.LLJILJILJ;
                if (c1434960nRe == null) {
                    c1434960nRe = null;
                }
                c823190WQz.LIZJ(c1434960nRe.LIZ.getCreationId());
            }
        }
        if (this.LLIZ) {
            ((o) ((RunnableC1435990nTJ) this.LLJIJIL.getValue()).LLILLJJLI.getValue()).LJ(Unit.LIZ);
        }
        C2221281Bwk c2221281Bwk = this.LLJJIJIIJIL;
        if (c2221281Bwk != null) {
            c2221281Bwk.LJIJI = false;
            c2221281Bwk.cancelUpload();
        }
        LJJIFFI();
        SynthetiseResult synthetiseResult = this.LLJJJJLIIL;
        if (synthetiseResult != null && synthetiseResult.outputFile != null) {
            C0VSJ c0vsj = new C0VSJ(synthetiseResult.outputFile);
            if (c0vsj.exists()) {
                c0vsj.delete();
                C1431070nLN c1431070nLN2 = this.LLJJIJIL;
                if (c1431070nLN2 == null) {
                    c1431070nLN2 = null;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("incompleteFile delete incompleteFile : ");
                sbLIZ.append(c0vsj);
                c1431070nLN2.LIZIZ(new C1404990mfJ("CompileTask", C2188811AlT.LIZIZ(sbLIZ)), EnumC2251001D8o.OUTER);
            }
            VEWatermarkParam vEWatermarkParam = this.LLIZLLLIL;
            if (vEWatermarkParam != null && vEWatermarkParam.extFile != null) {
                C0VSJ c0vsj2 = new C0VSJ(this.LLIZLLLIL.extFile);
                if (c0vsj2.exists()) {
                    c0vsj2.delete();
                    C1431070nLN c1431070nLN3 = this.LLJJIJIL;
                    if (c1431070nLN3 == null) {
                        c1431070nLN3 = null;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("incompleteWatermarkFile delete incompleteWatermarkFile : ");
                    sbLIZ2.append(c0vsj2);
                    c1431070nLN3.LIZIZ(new C1404990mfJ("CompileTask", C2188811AlT.LIZIZ(sbLIZ2)), EnumC2251001D8o.OUTER);
                }
            }
        }
        C918190a09 c918190a09 = this.LLJL;
        if (c918190a09 != null) {
            c918190a09.LIZ();
        }
        this.LLJL = null;
        LJIILL();
        ((C1D8A) interfaceC1434410nQl).LIZ(null);
        C1435620nSi c1435620nSi2 = this.LLL;
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
        Object next5;
        Object next6;
        Object next7;
        Object next8;
        C1431990nMr c1431990nMr;
        C201955140j.LIZ("SaveLocalWithWatermark -> CompileTask -> can't skip ");
        super.LJII(c1404610meh, c1431070nLN);
        C0CH0.LIZ(1);
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next9 = it2.next();
            if (next9 instanceof C1434960nRe) {
                if (next9 != null) {
                    C1434960nRe c1434960nRe = (C1434960nRe) next9;
                    this.LLJILJILJ = c1434960nRe;
                    this.LLJLIL = c1434960nRe.LIZ.creativeModel.dmMediaModel;
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
                    this.LLJLILLLLZIIL = (C1435240nS6) next;
                    Iterator<Object> it4 = c1404610meh.LIZ.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        Object next10 = it4.next();
                        if (next10 instanceof C1404570med) {
                            if (next10 != null) {
                                this.LLJJ = (C1404570med) next10;
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
                                this.LLJJI = (InterfaceC1434170nQN) next2;
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
                                this.LLJJIJI = (C1931707hT) next3;
                                this.LLJJIJIL = c1431070nLN;
                                Iterator<Object> it7 = c1404610meh.LIZ.iterator();
                                while (true) {
                                    if (it7.hasNext()) {
                                        next4 = it7.next();
                                        if (next4 == null || (next4 instanceof C2221281Bwk)) {
                                            break;
                                        }
                                    } else {
                                        next4 = null;
                                        break;
                                    }
                                }
                                C2221281Bwk c2221281Bwk = (C2221281Bwk) next4;
                                this.LLJJIJIIJIL = c2221281Bwk;
                                if (c2221281Bwk != null) {
                                    c2221281Bwk.LJIJJLI = true;
                                }
                                Iterator<Object> it8 = c1404610meh.LIZ.iterator();
                                while (true) {
                                    if (it8.hasNext()) {
                                        next5 = it8.next();
                                        if (next5 == null || (next5 instanceof C1435350nSH)) {
                                            break;
                                        }
                                    } else {
                                        next5 = null;
                                        break;
                                    }
                                }
                                if (!(next5 instanceof C1435350nSH)) {
                                    next5 = null;
                                }
                                C1435350nSH c1435350nSH = (C1435350nSH) next5;
                                if (c1435350nSH == null) {
                                    c1435350nSH = new C1435350nSH(false);
                                }
                                this.LLJJJ = c1435350nSH;
                                if (C0L1C.LIZ()) {
                                    C1434960nRe c1434960nRe2 = this.LLJILJILJ;
                                    if (c1434960nRe2 == null) {
                                        c1434960nRe2 = null;
                                    }
                                    AIGCInfo aIGCInfo = c1434960nRe2.LIZ.creativeModel.privacySettingModel.aigcInfo;
                                    aIGCInfo.AIGCSwitchStatusWhenCompile = aIGCInfo.AIGCLabelType;
                                    this.LLJLL = aIGCInfo;
                                }
                                DMMediaModel dMMediaModel = this.LLJLIL;
                                if (dMMediaModel != null) {
                                    C1435510nSX c1435510nSX = (C1435510nSX) this.LLJZIJLIL.getValue();
                                    if (c1435510nSX != null) {
                                        c1435510nSX.LIZIZ();
                                    }
                                    if (dMMediaModel.isSynthesised) {
                                        LJIJJ(new SynthetiseResult(), true);
                                        return;
                                    }
                                }
                                Iterator<Object> it9 = c1404610meh.LIZ.iterator();
                                while (true) {
                                    if (it9.hasNext()) {
                                        next6 = it9.next();
                                        if (next6 instanceof C1434970nRf) {
                                            break;
                                        }
                                    } else {
                                        next6 = null;
                                        break;
                                    }
                                }
                                if (next6 != null) {
                                    this.LLJILLL = ((C1434970nRf) next6).LIZ;
                                    Iterator<Object> it10 = c1404610meh.LIZ.iterator();
                                    while (true) {
                                        if (it10.hasNext()) {
                                            next7 = it10.next();
                                            if (next7 == null || (next7 instanceof C1431990nMr)) {
                                                break;
                                            }
                                        } else {
                                            next7 = null;
                                            break;
                                        }
                                    }
                                    if (!(next7 instanceof C1431990nMr)) {
                                        next7 = null;
                                    }
                                    this.LLLF = (C1431990nMr) next7;
                                    if (C0BXJ.LIZ() && (c1431990nMr = this.LLLF) != null) {
                                        c1431990nMr.LIZ.add(this.LLLFF);
                                    }
                                    int iLJIIJ = LJIIJ();
                                    C1431070nLN c1431070nLN2 = this.LLJJIJIL;
                                    if (c1431070nLN2 == null) {
                                        c1431070nLN2 = null;
                                    }
                                    this.LLL = new C1435620nSi(c1431070nLN2, iLJIIJ);
                                    Iterator<Object> it11 = c1404610meh.LIZ.iterator();
                                    while (true) {
                                        if (it11.hasNext()) {
                                            next8 = it11.next();
                                            if (next8 instanceof AbstractC1405090mfT) {
                                                break;
                                            }
                                        } else {
                                            next8 = null;
                                            break;
                                        }
                                    }
                                    if ((next8 instanceof AbstractC1405090mfT) && next8 != null && (next8 instanceof C1405100mfU)) {
                                        LJIJJ(new SynthetiseResult(), true);
                                        LJJIFFI();
                                        return;
                                    }
                                    C1434960nRe c1434960nRe3 = this.LLJILJILJ;
                                    if (c1434960nRe3 == null) {
                                        c1434960nRe3 = null;
                                    }
                                    VideoPublishEditModel videoPublishEditModel = c1434960nRe3.LIZ;
                                    PublishModel publishModel = this.LLJILLL;
                                    if (publishModel == null) {
                                        publishModel = null;
                                    }
                                    if (C1435600nSg.LJIIJ(videoPublishEditModel, publishModel.LIZJ(), false) && this.LLJLIL == null) {
                                        C1434960nRe c1434960nRe4 = this.LLJILJILJ;
                                        if (c1434960nRe4 == null) {
                                            c1434960nRe4 = null;
                                        }
                                        SynthetiseResult synthetiseResultLIZ = C1431220nLc.LIZ(c1434960nRe4.LIZ, null);
                                        this.LLJJJJLIIL = synthetiseResultLIZ;
                                        LJIJJ(synthetiseResultLIZ, true);
                                        LJJIFFI();
                                        return;
                                    }
                                    Iterator<Object> it12 = c1404610meh.LIZ.iterator();
                                    while (true) {
                                        if (!it12.hasNext()) {
                                            break;
                                        }
                                        Object next11 = it12.next();
                                        if (next11 instanceof C1434970nRf) {
                                            if (next11 != null) {
                                                if (((C1434970nRf) next11).LIZ.isEditSave) {
                                                    C1436310nTp.LIZ.getClass();
                                                }
                                                if (this.LLIZ) {
                                                    LLLFFI.getValue().execute((RunnableC1435990nTJ) this.LLJIJIL.getValue());
                                                    return;
                                                } else {
                                                    LJIILJJIL();
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
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

    public final void LJIJI(C1433670nPZ c1433670nPZ, boolean z) {
        boolean z2;
        int iLJFF = C1431420nLw.LJFF(c1433670nPZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SaveLocalWithWatermark -> CompileTask -> onTaskFailed, errorCode = ");
        sbLIZ.append(iLJFF);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        Integer numValueOf = Integer.valueOf(iLJFF);
        C1431070nLN c1431070nLN = this.LLJJIJIL;
        if (c1431070nLN != null && !this.LLJJIII && c1431070nLN.LIZJ < C291160Bb8.LIZ() && C0C2U.LIZ(numValueOf)) {
            z2 = true;
        } else {
            z2 = false;
        }
        C1435620nSi c1435620nSi = null;
        C1431070nLN c1431070nLN2 = null;
        if (z2 && z && !C1431420nLw.LIZJ(c1433670nPZ)) {
            this.LLJJIII = true;
            C2221281Bwk c2221281Bwk = this.LLJJIJIIJIL;
            if (c2221281Bwk != null) {
                c2221281Bwk.LIZLLL();
            }
            LJJIFFI();
            C1431070nLN c1431070nLN3 = this.LLJJIJIL;
            if (c1431070nLN3 != null) {
                c1431070nLN2 = c1431070nLN3;
            }
            C1431070nLN.LIZ(c1431070nLN2);
            return;
        }
        if (this.LLJLIL == null) {
            PublishModel publishModel = this.LLJILLL;
            if (publishModel == null) {
                publishModel = null;
            }
            if (!publishModel.isEditSave) {
                C823190WQz c823190WQz = C823190WQz.LIZ;
                C1434960nRe c1434960nRe = this.LLJILJILJ;
                if (c1434960nRe == null) {
                    c1434960nRe = null;
                }
                c823190WQz.LIZJ(c1434960nRe.LIZ.getCreationId());
            }
        }
        LJIIZILJ(null);
        C1435510nSX c1435510nSX = (C1435510nSX) this.LLJZIJLIL.getValue();
        if (c1435510nSX != null) {
            c1435510nSX.LIZ();
        }
        this.LLJJJJ = true;
        C1431070nLN c1431070nLN4 = this.LLJJIJIL;
        if (c1431070nLN4 == null) {
            c1431070nLN4 = null;
        }
        c1431070nLN4.LIZIZ(new C1404990mfJ("CompileTask", "PublishDurationMonitor Synthetise end failed"), EnumC2251001D8o.OUTER);
        if (this.LLIZ) {
            ((o) ((RunnableC1435990nTJ) this.LLJIJIL.getValue()).LLILLJJLI.getValue()).LJ(Unit.LIZ);
        }
        if (!C1431420nLw.LIZJ(c1433670nPZ)) {
            C1431070nLN c1431070nLN5 = this.LLJJIJIL;
            if (c1431070nLN5 == null) {
                c1431070nLN5 = null;
            }
            c1431070nLN5.LIZLLL(iLJFF, c1433670nPZ);
        }
        C918190a09 c918190a09 = this.LLJL;
        if (c918190a09 != null) {
            c918190a09.LIZ();
        }
        this.LLJL = null;
        LJJIFFI();
        C1435620nSi c1435620nSi2 = this.LLL;
        if (c1435620nSi2 != null) {
            c1435620nSi = c1435620nSi2;
        }
        c1435620nSi.LIZ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0252, code lost:
    
        r1.setCompileFinished(true);
        r1.setSynthesisFileHash(X.C1435600nSg.LJ(new X.C0VSJ(r1.getRealSynthesisFile())));
        r7 = r1.isCompileFinished();
        r8 = r1.getOutputFile();
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x026f, code lost:
    
        if (r8 == null) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0271, code lost:
    
        r9 = r1.getParallelUploadOutputFile();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0275, code lost:
    
        if (r9 != null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0277, code lost:
    
        r9 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0279, code lost:
    
        r10 = r1.getSynthesisFileHash();
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x027d, code lost:
    
        if (r10 != null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x027f, code lost:
    
        r10 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0281, code lost:
    
        r6 = new com.ss.android.ugc.aweme.wavepublish.utils.UploadResumeInfo(r7, r8, r9, r10, X.C297810Blr.LIZ());
        r5 = X.C1435600nSg.LJI(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0290, code lost:
    
        if (r5.length() == 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0292, code lost:
    
        r4 = X.C2292508yZ.LIZJ(r6);
        r3 = X.C1435600nSg.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0298, code lost:
    
        monitor-enter(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0299, code lost:
    
        ((com.bytedance.keva.Keva) X.C1435600nSg.LIZIZ.getValue()).storeString(r5, r4);
        X.C1435600nSg.LIZLLL.put(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02a9, code lost:
    
        monitor-exit(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02aa, code lost:
    
        r3 = X.C2188811AlT.LIZ();
        r3.append("compile done, output: ");
        r3.append(r1.getOutputFile());
        r3.append(", synthesis: ");
        r3.append(r1.getParallelUploadOutputFile());
        X.C2188811AlT.LIZIZ(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0315, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0316, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x031a, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x031b, code lost:
    
        "Required value was null.".toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0325, code lost:
    
        throw new java.lang.IllegalArgumentException("Required value was null.");
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0306  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(com.ss.android.ugc.aweme.shortvideo.SynthetiseResult r13, boolean r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1435540nSa.LJIJJ(com.ss.android.ugc.aweme.shortvideo.SynthetiseResult, boolean):void");
    }

    public final boolean LJIL(int i, InterfaceC1452170ntP interfaceC1452170ntP) {
        C1463670oBx c1463670oBx;
        C348100Dkm c348100DkmLIZLLL;
        INLEMediaSession iNLEMediaSession;
        INLEExporter exporterApi;
        NLECompileResult compileResult;
        Object c098200Yq;
        if (!C13LQ.LJLIIL(new Integer[]{-555, -557}).contains(Integer.valueOf(i))) {
            return false;
        }
        C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[direct_upload] handle ");
        sbLIZ.append(i);
        sbLIZ.append(" error");
        c1437510nVlLJJLIIIJ.LIZ("compile", C2188811AlT.LIZIZ(sbLIZ));
        String str = null;
        if ((interfaceC1452170ntP instanceof C1463670oBx) && (c1463670oBx = (C1463670oBx) interfaceC1452170ntP) != null && (c348100DkmLIZLLL = c1463670oBx.LIZLLL()) != null && (iNLEMediaSession = c348100DkmLIZLLL.LIZIZ) != null && (exporterApi = iNLEMediaSession.getExporterApi()) != null && (compileResult = exporterApi.getCompileResult()) != null) {
            NLEUploadParams uploadParams = compileResult.getUploadParams();
            if (uploadParams == null) {
                C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("compile", "[direct_upload] null nleCompileParams");
                return false;
            }
            String strLIZ = (String) C13LP.LJJJLL(uploadParams.getSourceFilePaths());
            if (strLIZ != null && C2286708xd.LIZJ(strLIZ)) {
                if (C2471909mP.LJJIIZI(strLIZ)) {
                    try {
                        c098200Yq = UriProtector.parse(strLIZ);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    strLIZ = C09N5.LIZ(C786410Ut5.M3(C1BWL.LIZ()), (Uri) c098200Yq);
                }
                CompileLevel compileLevelLIZ = C1435840nT4.LIZ(compileResult.getCompileLevel().swigValue());
                this.LLJLLIL = compileLevelLIZ;
                SynthetiseResult synthetiseResult = this.LLJJJJLIIL;
                if (synthetiseResult != null) {
                    synthetiseResult.compileLevel = compileLevelLIZ;
                }
                if (i == -557) {
                    Object objLIZ = this.LLJJJIL.LIZ(AFwS261S0000000_22.get$arr$(374));
                    if (objLIZ != null) {
                        str = (String) objLIZ;
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                C1434270nQX c1434270nQX = new C1434270nQX(this.LLJLLIL, strLIZ, uploadParams.getRemoveSourceMetadata(), LJJ(uploadParams.getMetadata()), str);
                LJIIZILJ(c1434270nQX);
                SynthetiseResult synthetiseResult2 = this.LLJJJJLIIL;
                if (synthetiseResult2 != null) {
                    synthetiseResult2.watermarkInputFile = strLIZ;
                }
                C1437510nVl c1437510nVlLJJLIIIJ2 = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[direct_upload] send ");
                sbLIZ2.append(c1434270nQX);
                c1437510nVlLJJLIIIJ2.LIZ("compile", C2188811AlT.LIZIZ(sbLIZ2));
                return true;
            }
            C1437510nVl c1437510nVlLJJLIIIJ3 = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("[direct_upload] file not exists: ");
            sbLIZ3.append(strLIZ);
            c1437510nVlLJJLIIIJ3.LIZ("compile", C2188811AlT.LIZIZ(sbLIZ3));
            return false;
        }
        C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("compile", "[direct_upload] null nleCompileResult");
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [X.0nSt] */
    public C1435540nSa(VEWatermarkParam vEWatermarkParam, boolean z, Function0 function0) {
        super(vEWatermarkParam);
        this.LLIZ = false;
        this.LLIZLLLIL = vEWatermarkParam;
        this.LLJ = z;
        this.LLJI = function0;
        this.LLJIJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1125));
        C2123408To c2123408To = new C2123408To(C0WQX.SERIAL);
        c2123408To.LIZIZ = "produce executor";
        this.LLJILJIL = C823050WQl.LIZ(new C2123508Tp(c2123408To));
        this.LLJJJIL = new C1435640nSk();
        this.LLJJL = new C138P();
        this.LLJJLIIIJLLLLLLLZ = new ArrayList();
        this.LLJLLIL = CompileLevel.UNKNOWN;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null) {
            creativeToolsPluginService.LIZ();
        }
        this.LLJLLL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(530));
        this.LLJZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1122));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1121));
        this.LLLFF = new InterfaceC1432000nMs() { // from class: X.0nSt
            @Override // X.InterfaceC1432000nMs
            public final String LIZIZ() {
                try {
                    String str = (String) this.LIZ.LLJJJIL.LIZ(AFwS261S0000000_22.get$arr$(372));
                    return str != null ? str : "";
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return "";
                }
            }

            @Override // X.InterfaceC1432000nMs
            public final EnumC1434770nRL LIZ() {
                return EnumC1434770nRL.COMPILE;
            }
        };
    }

    public final void LJIJ(InterfaceC2221271Bwj interfaceC2221271Bwj, long j, int i, boolean z, SynthetiseResult synthetiseResult) throws ExecutionException, InterruptedException {
        boolean zLIZJ;
        C1435720nSs c1435720nSs;
        if (C0BXI.LIZ() && this.LLJLLIL == CompileLevel.REMUX) {
            if (j == 0 || z) {
                C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[direct_upload] skip onEncoderDataAvailable for REMUX, offset=");
                sbLIZ.append(j);
                sbLIZ.append(", size=");
                sbLIZ.append(i);
                sbLIZ.append(", isFinish=");
                sbLIZ.append(z);
                c1437510nVlLJJLIIIJ.LIZ("compile", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            return;
        }
        C2221281Bwk c2221281Bwk = this.LLJJIJIIJIL;
        if (c2221281Bwk != null && (c1435720nSs = c2221281Bwk.LJJ) != null && c1435720nSs.LIZ.invoke().booleanValue()) {
            c1435720nSs.LIZIZ.add(new C443120HZe<>(Long.valueOf(j), Integer.valueOf(i), Boolean.valueOf(z)));
            c1435720nSs.LIZ("ve_produce_data_after_finish");
        }
        if (((Boolean) C280580AzA.LIZ.getValue()).booleanValue() && (interfaceC2221271Bwj instanceof C199555136b)) {
            C2221281Bwk c2221281Bwk2 = this.LLJJIJIIJIL;
            if (c2221281Bwk2 != null) {
                zLIZJ = c2221281Bwk2.LIZJ(i, j, z);
            } else {
                zLIZJ = false;
            }
            Future<?> futureSubmit = this.LLJILJIL.submit(new ARunnableS0S0311100_22(this, interfaceC2221271Bwj, j, i, z, synthetiseResult, 0));
            if (zLIZJ) {
                futureSubmit.get();
                return;
            }
            return;
        }
        LJIJJLI(interfaceC2221271Bwj, j, i, z, synthetiseResult);
    }

    public final void LJIJJLI(InterfaceC2221271Bwj interfaceC2221271Bwj, long j, int i, boolean z, SynthetiseResult synthetiseResult) {
        try {
            C0CHQ.LIZ().getPublishService().LJJIIZI().getClass();
            C1436930nUp.LIZ();
            C2221281Bwk c2221281Bwk = this.LLJJIJIIJIL;
            if (c2221281Bwk != null) {
                c2221281Bwk.LIZ(interfaceC2221271Bwj, j, i, z);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            SynthetiseResult synthetiseResultM316clone = synthetiseResult.m316clone();
            if (C1431420nLw.LIZ(e)) {
                synthetiseResultM316clone.ret = 100101;
            } else {
                synthetiseResultM316clone.ret = 1001;
            }
            LJIJI(new C1433670nPZ(e, synthetiseResultM316clone), !C1431420nLw.LIZ(e));
            LJIILL();
        }
    }
}
