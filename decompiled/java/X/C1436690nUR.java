package X;

import Y.ACallableS250S0200000_22;
import android.util.Log;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.internal.IShareService;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.ui.savelocal.SaveLocalHelper;
import com.ss.android.ugc.aweme.shortvideo.ui.savelocal.WatermarkMetadata;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.ss.android.vesdk.VEUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.text.Charsets;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0nUR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1436690nUR extends AbstractC1434490nQt {
    public PublishModel LLILZLL;
    public VideoPublishEditModel LLIZ;
    public UploadAuthKeyConfig LLIZLLLIL;
    public C1431070nLN LLJ;
    public SynthetiseResult LLJI;
    public C1441520ncE LLJIJIL;

    @Override // X.AbstractC1434490nQt
    public final EnumC1434810nRP LJIIJJI() {
        return EnumC1434810nRP.ORIGINAL_FRAME_UPLOAD;
    }

    public final void LJIILJJIL(int i) {
        PublishModel publishModel = this.LLILZLL;
        C1431070nLN c1431070nLN = null;
        if (publishModel == null) {
            publishModel = null;
        }
        if (!publishModel.isEditSave) {
            return;
        }
        C1431070nLN c1431070nLN2 = this.LLJ;
        if (c1431070nLN2 != null) {
            c1431070nLN = c1431070nLN2;
        }
        c1431070nLN.LIZIZ(new C1411860mqO(i / 98.0f), EnumC2251001D8o.OUTER);
    }

    public final void LJIILL(C1436770nUZ c1436770nUZ) {
        LJIIIZ().LIZJ();
        EnumC1434810nRP enumC1434810nRP = EnumC1434810nRP.ORIGINAL_FRAME_UPLOAD;
        String desc = enumC1434810nRP.getDesc();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("original frame upload failed, code=");
        sbLIZ.append(c1436770nUZ.getCode());
        sbLIZ.append(", message=");
        sbLIZ.append(c1436770nUZ.getErrorMessage());
        C1405310mfp.LIZIZ(desc, C2188811AlT.LIZIZ(sbLIZ));
        LJIIIZ().LIZJ();
        C1405310mfp.LIZLLL(enumC1434810nRP.getDesc(), Log.getStackTraceString(c1436770nUZ));
        PublishModel publishModel = this.LLILZLL;
        if (publishModel == null) {
            publishModel = null;
        }
        if (publishModel.isEditSave) {
            C201955140j.LIZ("SaveLocalWithWatermark -> OriginalFrameUploadWaveTask -> onTaskFailed");
            PublishModel publishModel2 = this.LLILZLL;
            if (publishModel2 == null) {
                publishModel2 = null;
            }
            if (publishModel2.isEditSave) {
                VideoPublishEditModel videoPublishEditModel = this.LLIZ;
                if (videoPublishEditModel == null) {
                    videoPublishEditModel = null;
                }
                if (C1428520nHG.LJIJJLI(videoPublishEditModel)) {
                    LJIIIIZZ().LIZLLL(-1, new C1900607cS(null, null));
                    return;
                }
            }
            LJIIIIZZ().LJ(new C1431250nLf(-1), false);
        }
    }

    public final void LJIILLIIL(BaseResponse baseResponse) {
        String str;
        String str2;
        String str3;
        LJIIIZ().LIZJ();
        String desc = EnumC1434810nRP.ORIGINAL_FRAME_UPLOAD.getDesc();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("logid: ");
        sbLIZ.append(baseResponse.extra.logid);
        C1405310mfp.LIZIZ(desc, C2188811AlT.LIZIZ(sbLIZ));
        SaveLocalHelper.LIZ.getClass();
        C2354709Kn.LJIJJ(SaveLocalHelper.LJFF("backup_fake_uri").toString());
        VideoPublishEditModel videoPublishEditModel = this.LLIZ;
        InterfaceC1436810nUd interfaceC1436810nUd = null;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        C1441520ncE c1441520ncE = this.LLJIJIL;
        if (c1441520ncE != null) {
            str = c1441520ncE.LJ;
        } else {
            str = null;
        }
        LJIJ(videoPublishEditModel, str);
        PublishModel publishModel = this.LLILZLL;
        if (publishModel == null) {
            publishModel = null;
        }
        String str4 = "";
        if (!publishModel.isEditSave) {
            Keva keva = C1436760nUY.LIZ;
            VideoPublishEditModel videoPublishEditModel2 = this.LLIZ;
            if (videoPublishEditModel2 == null) {
                videoPublishEditModel2 = null;
            }
            String creationId = videoPublishEditModel2.getCreationId();
            C1441520ncE c1441520ncE2 = this.LLJIJIL;
            if (c1441520ncE2 == null || (str3 = c1441520ncE2.LJ) == null) {
                str3 = "";
            }
            C1436760nUY.LIZ(creationId, str3);
        }
        InterfaceC1436810nUd interfaceC1436810nUd2 = new InterfaceC1436810nUd() { // from class: X.0nUS
            @Override // X.InterfaceC1436810nUd
            public final void LIZ(String str5) {
                ConcurrentHashSet<String> concurrentHashSet = C1436750nUX.LIZ;
                if (concurrentHashSet.contains(str5)) {
                    return;
                }
                concurrentHashSet.add(str5);
                C201955140j.LIZ("SaveLocalWithWatermark -> queryModerationCallback -> onMsgTimeOut");
                C1436690nUR c1436690nUR = this.LIZ;
                PublishModel publishModel2 = c1436690nUR.LLILZLL;
                if (publishModel2 == null) {
                    publishModel2 = null;
                }
                if (publishModel2.isEditSave) {
                    VideoPublishEditModel videoPublishEditModel3 = c1436690nUR.LLIZ;
                    if (videoPublishEditModel3 == null) {
                        videoPublishEditModel3 = null;
                    }
                    if (C1428520nHG.LJIJJLI(videoPublishEditModel3)) {
                        this.LIZ.LJIIIIZZ().LIZLLL(-1, new C1900607cS(null, null));
                        return;
                    }
                }
                this.LIZ.LJIIIIZZ().LJ(new C1431250nLf(1), false);
            }

            @Override // X.InterfaceC1436810nUd
            public final void LIZIZ(String str5) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("SaveLocalWithWatermark -> queryModerationCallback -> publishID = ");
                PublishModel publishModel2 = this.LIZ.LLILZLL;
                if (publishModel2 == null) {
                    publishModel2 = null;
                }
                sbLIZ2.append(publishModel2.publishId);
                sbLIZ2.append(" -> onMsgTransmission");
                C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                SaveLocalHelper.LIZ.getClass();
                Pair pairLJ = SaveLocalHelper.LJ(str5);
                String str6 = (String) pairLJ.getFirst();
                int iIntValue = ((Number) pairLJ.getSecond()).intValue();
                if (str6 != null) {
                    ConcurrentHashSet<String> concurrentHashSet = C1436750nUX.LIZ;
                    if (concurrentHashSet.contains(str6)) {
                        return;
                    } else {
                        concurrentHashSet.add(str6);
                    }
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("SaveLocalWithWatermark -> queryModerationCallback -> vframeId = ");
                sbLIZ3.append(str6);
                sbLIZ3.append("; moderationResult = ");
                sbLIZ3.append(iIntValue);
                C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                if (!C123100dR.LIZ(str6) || (iIntValue == 3 && C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_edit_block_download_casm_video", true) == 1)) {
                    C1436690nUR c1436690nUR = this.LIZ;
                    PublishModel publishModel3 = c1436690nUR.LLILZLL;
                    if (publishModel3 == null) {
                        publishModel3 = null;
                    }
                    if (publishModel3.isEditSave) {
                        VideoPublishEditModel videoPublishEditModel3 = c1436690nUR.LLIZ;
                        if (videoPublishEditModel3 == null) {
                            videoPublishEditModel3 = null;
                        }
                        if (C1428520nHG.LJIJJLI(videoPublishEditModel3) || iIntValue == 3) {
                            this.LIZ.LJIIIIZZ().LIZLLL(-1, new C1900607cS(null, null));
                            return;
                        }
                    }
                    this.LIZ.LJIIIIZZ().LJ(new C1431250nLf(0), false);
                    return;
                }
                this.LIZ.LJIIIIZZ().LJ(new C1431250nLf(iIntValue), false);
            }
        };
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "mock_moderation_save_stuck", true) > 0) {
            Thread.sleep(C0C64.LJIILLIIL().LJIJ(31744, 0, "mock_moderation_save_stuck", true));
        }
        C1436710nUT c1436710nUT = C1436710nUT.LIZ;
        C1441520ncE c1441520ncE3 = this.LLJIJIL;
        if (c1441520ncE3 != null && (str2 = c1441520ncE3.LJ) != null) {
            str4 = str2;
        }
        VideoPublishEditModel videoPublishEditModel3 = this.LLIZ;
        if (videoPublishEditModel3 == null) {
            videoPublishEditModel3 = null;
        }
        String creationId2 = videoPublishEditModel3.getCreationId();
        PublishModel publishModel2 = this.LLILZLL;
        if (publishModel2 == null) {
            publishModel2 = null;
        }
        if (publishModel2.isEditSave) {
            interfaceC1436810nUd = interfaceC1436810nUd2;
        }
        c1436710nUT.getClass();
        C1436710nUT.LJ("start moderation result listening process,");
        Map<String, C1436790nUb> map = C1436710nUT.LIZIZ;
        if (!map.containsKey(str4)) {
            C1436710nUT.LJ("add frameUri record");
            map.put(str4, new C1436790nUb(creationId2));
            if (interfaceC1436810nUd != null) {
                C1436710nUT.LJFF.put(str4, interfaceC1436810nUd);
            }
            if (!((LinkedHashMap) map).keySet().isEmpty()) {
                if (C1436710nUT.LIZJ == null) {
                    C1436710nUT.LJ("init timer");
                    final C1436780nUa c1436780nUa = new C1436780nUa();
                    C1436710nUT.LIZJ = c1436780nUa;
                    long j = C1436710nUT.LIZLLL;
                    final C0XRY c0xry = new C0XRY();
                    C11NZ.LJJJJLI(j, TimeUnit.MILLISECONDS).LIZIZ(new InterfaceC626120Oh8<Long>() { // from class: X.0nUW
                        @Override // X.InterfaceC626120Oh8
                        public final void onComplete() {
                        }

                        @Override // X.InterfaceC626120Oh8
                        public final void onError(Throwable th) {
                        }

                        @Override // X.InterfaceC626120Oh8
                        public final void onNext(Long l) {
                            c0xry.invoke(Long.valueOf(l.longValue()));
                        }

                        @Override // X.InterfaceC626120Oh8
                        public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                            c1436780nUa.LIZ = interfaceC420801kM;
                        }
                    });
                }
                if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_save_local_watermark_mock_forbid_push", true, false)) {
                    C1436710nUT.LJ("bindVideoAuditPushListener");
                    ((IMainService) ServiceManager.get().getService(IMainService.class)).registerModerationResultPush(AFwS261S0000000_22.get$arr$(16));
                }
            }
        }
    }

    @Override // X.AbstractC1434490nQt
    public final void LJII(C1404610meh c1404610meh, C1431070nLN c1431070nLN) {
        Object next;
        ExtractFramesModel extractFramesModelCopy;
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (next2 instanceof C1434970nRf) {
                if (next2 != null) {
                    this.LLILZLL = ((C1434970nRf) next2).LIZ;
                    Iterator<Object> it3 = c1404610meh.LIZ.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next3 = it3.next();
                        if (next3 instanceof C1434960nRe) {
                            if (next3 != null) {
                                this.LLIZ = ((C1434960nRe) next3).LIZ;
                                Iterator<Object> it4 = c1404610meh.LIZ.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        break;
                                    }
                                    Object next4 = it4.next();
                                    if (next4 instanceof C1404770mex) {
                                        if (next4 != null) {
                                            this.LLIZLLLIL = (UploadAuthKeyConfig) ((C1404770mex) next4).LIZ;
                                            this.LLJ = c1431070nLN;
                                            Iterator<Object> it5 = c1404610meh.LIZ.iterator();
                                            while (true) {
                                                if (it5.hasNext()) {
                                                    next = it5.next();
                                                    if (next instanceof SynthetiseResult) {
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
                                            VideoPublishEditModel videoPublishEditModel = this.LLIZ;
                                            if (videoPublishEditModel == null) {
                                                videoPublishEditModel = null;
                                            }
                                            if (C1428470nHB.LJJLIIJ(videoPublishEditModel)) {
                                                VideoPublishEditModel videoPublishEditModel2 = this.LLIZ;
                                                if (videoPublishEditModel2 == null) {
                                                    videoPublishEditModel2 = null;
                                                }
                                                if (C1428470nHB.LJJJJZ(videoPublishEditModel2)) {
                                                    VideoPublishEditModel videoPublishEditModel3 = this.LLIZ;
                                                    if (videoPublishEditModel3 == null) {
                                                        videoPublishEditModel3 = null;
                                                    }
                                                    videoPublishEditModel3.setExtractFramesModel(null);
                                                }
                                            }
                                            VideoPublishEditModel videoPublishEditModel4 = this.LLIZ;
                                            if (videoPublishEditModel4 == null) {
                                                videoPublishEditModel4 = null;
                                            }
                                            ExtractFramesModel extractFramesModel = videoPublishEditModel4.getExtractFramesModel();
                                            if (extractFramesModel != null && (extractFramesModelCopy = extractFramesModel.copy(true)) != null) {
                                                extractFramesModelCopy.setExtractFramesDir(C2298208zU.LIZIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), new CreativeInfo(null, 0, null, 7, null), EnumC20228014Cw.WATERMARK_MODERATION, "frames", 8));
                                                C570490MZb.LJFF(new C0VSJ(extractFramesModelCopy.getExtractFramesDir()));
                                            } else {
                                                extractFramesModelCopy = null;
                                            }
                                            C15O7.LIZJ(new ACallableS250S0200000_22(this, extractFramesModelCopy, 14));
                                            PublishModel publishModel = this.LLILZLL;
                                            if (publishModel == null) {
                                                publishModel = null;
                                            }
                                            if (!publishModel.isEditSave) {
                                                c1431070nLN.LJ(null, false);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                }
                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.story.AuthKeyResult");
                            }
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
    }

    public final void LJIJ(VideoPublishEditModel videoPublishEditModel, String str) {
        String str2;
        String outputFile;
        if (str == null) {
            LJIIIZ().LIZJ();
            C1405310mfp.LIZIZ(EnumC1434810nRP.ORIGINAL_FRAME_UPLOAD.getDesc(), "uri is null");
            return;
        }
        AVUploadSaveModel saveModel = videoPublishEditModel.getSaveModel();
        if (saveModel == null) {
            LJIIIZ().LIZJ();
            C1405310mfp.LIZIZ(EnumC1434810nRP.ORIGINAL_FRAME_UPLOAD.getDesc(), "save model is null");
            return;
        }
        C0CHQ.LIZ().getPublishService().LJJJLL();
        if (!C1431870nMf.LIZJ(videoPublishEditModel)) {
            LJIIIZ().LIZJ();
            C1405310mfp.LIZIZ(EnumC1434810nRP.ORIGINAL_FRAME_UPLOAD.getDesc(), "save local disabled");
            return;
        }
        String localTempPath = videoPublishEditModel.getLocalTempPath();
        SynthetiseResult synthetiseResult = this.LLJI;
        VideoPublishEditModel videoPublishEditModel2 = null;
        if (synthetiseResult != null) {
            str2 = synthetiseResult.watermarkInputFile;
        } else {
            str2 = null;
        }
        if (C2286708xd.LIZJ(str2)) {
            SynthetiseResult synthetiseResult2 = this.LLJI;
            if (synthetiseResult2 == null || (outputFile = synthetiseResult2.watermarkInputFile) == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            VideoPublishEditModel videoPublishEditModel3 = this.LLIZ;
            if (videoPublishEditModel3 != null) {
                videoPublishEditModel2 = videoPublishEditModel3;
            }
            outputFile = videoPublishEditModel2.getOutputFile();
            if (outputFile == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        SaveLocalHelper saveLocalHelper = SaveLocalHelper.LIZ;
        saveLocalHelper.getClass();
        StringBuilder sbLJFF = SaveLocalHelper.LJFF(str);
        String str3 = File.separator;
        if (!a0.LJJIJIL(sbLJFF, str3)) {
            sbLJFF.append(str3);
        }
        String string = sbLJFF.toString();
        ConcurrentHashSet<String> concurrentHashSet = C1436750nUX.LIZ;
        saveLocalHelper.getClass();
        StringBuilder sbLJFF2 = SaveLocalHelper.LJFF(str);
        sbLJFF2.append(str3);
        sbLJFF2.append("metadata.json");
        C0VSJ c0vsj = new C0VSJ(sbLJFF2.toString());
        if (c0vsj.exists()) {
            C2354709Kn.LJIJJLI(c0vsj.getAbsolutePath());
        }
        C2354709Kn.LJFF(c0vsj.getAbsolutePath(), true);
        C09BH.LJIIIZ(c0vsj, GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), new WatermarkMetadata(C1428470nHB.LJJZZI(videoPublishEditModel), videoPublishEditModel.getCreationId())), Charsets.UTF_8);
        LJIIZILJ(videoPublishEditModel, string, localTempPath, saveModel, true);
        if (C0C1L.LIZ()) {
            LJIIZILJ(videoPublishEditModel, string, outputFile, saveModel, false);
        }
        LJIIIZ().LIZJ();
        String desc = EnumC1434810nRP.ORIGINAL_FRAME_UPLOAD.getDesc();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("save watermark file to private path succeeded, rootPath=");
        sbLIZ.append(string);
        sbLIZ.append(", vframeId=");
        sbLIZ.append(str);
        C1405310mfp.LIZIZ(desc, C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List] */
    public static void LJIIZILJ(VideoPublishEditModel videoPublishEditModel, String str, String str2, AVUploadSaveModel aVUploadSaveModel, boolean z) {
        AVUploadSaveModel saveModel;
        boolean z2;
        List<SingleImageData> imageList;
        ?? arrayList;
        String path;
        if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
            C1431110nLR.LIZ.getClass();
            C1431110nLR.LIZ(videoPublishEditModel);
            if (videoPublishEditModel.isSaveLocal()) {
                boolean zIsSaveToLocalPathInsteadOfAlbum = videoPublishEditModel.isSaveToLocalPathInsteadOfAlbum();
                boolean zIsSilentShare = videoPublishEditModel.isSilentShare();
                if (!videoPublishEditModel.isSaveToAlbum() && zIsSaveToLocalPathInsteadOfAlbum) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z) {
                    AVUploadSaveModel saveModel2 = videoPublishEditModel.getSaveModel();
                    if (saveModel2 == null || (arrayList = saveModel2.getImageModeLocalPaths()) == 0) {
                        return;
                    }
                } else {
                    ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
                    if (imageAlbumData == null || (imageList = imageAlbumData.getImageList()) == null) {
                        return;
                    }
                    arrayList = new ArrayList(C15438062q.LJIJJ(imageList, 10));
                    Iterator<SingleImageData> it2 = imageList.iterator();
                    while (it2.hasNext()) {
                        ImageSynthesisResult synthesisData = it2.next().getSynthesisData();
                        if (synthesisData != null) {
                            path = synthesisData.getPath();
                        } else {
                            path = null;
                        }
                        arrayList.add(path);
                    }
                }
                if (!arrayList.isEmpty()) {
                    if (zIsSilentShare && !z2) {
                        return;
                    }
                    for (String str3 : arrayList) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str);
                        SaveLocalHelper.LIZ.getClass();
                        sbLIZ.append(SaveLocalHelper.LIZLLL(str3, z));
                        C2354709Kn.LIZLLL(str3, C2188811AlT.LIZIZ(sbLIZ));
                    }
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        SaveLocalHelper.LIZ.getClass();
        String strLIZLLL = SaveLocalHelper.LIZLLL(str2, z);
        if (!u.LJIIZILJ(strLIZLLL, ".mp4", false)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZLLL);
            sbLIZ3.append(".mp4");
            strLIZLLL = C2188811AlT.LIZIZ(sbLIZ3);
        }
        sbLIZ2.append(strLIZLLL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        if (C1447960nmc.LIZIZ(videoPublishEditModel, ((IShareService) ServiceManager.get().getService(IShareService.class)).LIZIZ(aVUploadSaveModel.getSaveType()))) {
            if (str2 != null) {
                VEUtils.extractVideo(str2, strLIZIZ);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            C2354709Kn.LIZLLL(str2, strLIZIZ);
        }
        if (!videoPublishEditModel.isSilentShare() || (saveModel = videoPublishEditModel.getSaveModel()) == null) {
            return;
        }
        saveModel.setLocalSilentSharePath(strLIZIZ);
    }
}
