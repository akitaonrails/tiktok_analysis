package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.publish.CompileLevel;
import com.ss.android.ugc.aweme.creative.model.publish.DirectUploadParams;
import com.ss.android.ugc.aweme.creative.model.publish.PrePublishStatusModel;
import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import dtj.u7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS171S1100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nTh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1436230nTh {
    public static final C1436230nTh LIZ = new C1436230nTh();
    public static final Set<CompileLevel> LIZIZ = C13LQ.LJLIIL(new CompileLevel[]{CompileLevel.COPY_WITH_METADATA, CompileLevel.UPLOAD_DIRECTLY, CompileLevel.CLOUD_PROCESS_WITH_MUSIC});
    public static final boolean LIZJ = C304950BxN.LIZ();
    public static NLENode LIZLLL;
    public static volatile String LJ;
    public static volatile boolean LJFF;
    public static C11JF LJI;

    public static String LJI() {
        return LJ;
    }

    public static long LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        int iIntValue;
        if (C1444940nhk.LJII(videoPublishEditModel.getCanvasVideoData())) {
            return ((Number) C258200A9y.LIZ.getValue()).intValue();
        }
        if (videoPublishEditModel.getOriginal() == 0) {
            iIntValue = ((Number) C258210A9z.LIZ.getValue()).intValue();
        } else {
            iIntValue = ((Number) C258190A9x.LIZ.getValue()).intValue();
        }
        long j = iIntValue;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start delay: ");
        sbLIZ.append(j);
        C859300XnM.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        return j;
    }

    public static Pair LJII(VideoPublishEditModel videoPublishEditModel) {
        Integer numValueOf;
        if (videoPublishEditModel == null) {
            return new Pair(Boolean.FALSE, "data_null");
        }
        if (C1428470nHB.LLIIIJ(videoPublishEditModel)) {
            return new Pair(Boolean.FALSE, "text_mode");
        }
        if (videoPublishEditModel.creativeModel.onThisDayData.isFromOnThisDay()) {
            return new Pair(Boolean.valueOf(((Boolean) C0ARV.LIZ.getValue()).booleanValue()), "on_this_day");
        }
        if (videoPublishEditModel.creativeModel.draftInfoModel.isDraft && videoPublishEditModel.getAILivePhotoModel().LJII()) {
            return new Pair(Boolean.FALSE, "ai_live_photo");
        }
        if (!C1436220nTg.LJ(videoPublishEditModel) && !C1444940nhk.LJII(videoPublishEditModel.getCanvasVideoData())) {
            if (videoPublishEditModel.isLivePhotoEdit()) {
                return new Pair(Boolean.FALSE, "live_photo");
            }
            boolean z = true;
            if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
                if (u4.LJIIZILJ(videoPublishEditModel) || !((Boolean) C286990BMr.LIZ.getValue()).booleanValue()) {
                    z = false;
                }
                return new Pair(Boolean.valueOf(z), "image_mode");
            }
            if (u4.LJLL(videoPublishEditModel)) {
                return new Pair(Boolean.valueOf(((Boolean) C0BN2.LIZ.getValue()).booleanValue()), "story");
            }
            NowsShootModel nowsShootModel = videoPublishEditModel.creativeModel.nowsShootModel;
            if (nowsShootModel != null && (numValueOf = Integer.valueOf(nowsShootModel.type)) != null && (numValueOf.intValue() == 0 || numValueOf.intValue() == 3)) {
                return new Pair(Boolean.FALSE, "now_photo");
            }
            return new Pair(Boolean.valueOf(LIZJ), "default");
        }
        return new Pair(Boolean.valueOf(C297670Bld.LIZ()), "photo_canvas");
    }

    public static final synchronized boolean LJIIIIZZ(VideoPublishEditModel videoPublishEditModel) {
        LIZ.getClass();
        if (!((Boolean) LJII(videoPublishEditModel).getFirst()).booleanValue() || videoPublishEditModel == null) {
            return false;
        }
        if (videoPublishEditModel.getEditPagePrePublishId() != null) {
            if (C1433730nPf.LJIIZILJ(null)) {
                return true;
            }
        }
        return false;
    }

    public static void LJIILIIL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("publishId from:");
        sbLIZ.append(LJ);
        sbLIZ.append(" to:");
        sbLIZ.append(str);
        C859300XnM.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        LJ = str;
    }

    public static void LIZ(String str, AwS171S1100000_22 awS171S1100000_22) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" start");
        C859300XnM.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        long jCurrentTimeMillis = System.currentTimeMillis();
        awS171S1100000_22.invoke();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append(" end dur:");
        sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
        C859300XnM.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static final synchronized void LIZJ(VideoPublishEditModel videoPublishEditModel, String str) {
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        LIZ.getClass();
        Pair pairLJII = LJII(videoPublishEditModel);
        boolean zBooleanValue = ((Boolean) pairLJII.getFirst()).booleanValue();
        String str2 = (String) pairLJII.getSecond();
        if (!zBooleanValue) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ab close: ");
            sbLIZ.append(str2);
            LJIIJ(videoPublishEditModel, "fail", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (((Boolean) C281030Azt.LIZ.getValue()).booleanValue()) {
            C201955140j.LIZIZ("EditPrePublishComponent", "no memory leak, have canceled pre publish request");
            C11JF c11jf = LJI;
            if (c11jf != null) {
                c11jf.dispose();
            }
            LJI = null;
        }
        if (videoPublishEditModel != null) {
            PrePublishStatusModel prePublishStatusModel = videoPublishEditModel.creativeModel.prePublishStatusModel;
            prePublishStatusModel.compileLevel = CompileLevel.UNKNOWN;
            prePublishStatusModel.replaceDirectUploadParams = null;
            prePublishStatusModel.originalStickerData = null;
            if (C1428470nHB.LJJZZI(videoPublishEditModel) && !C1436220nTg.LJ(videoPublishEditModel) && (imageAlbumData = videoPublishEditModel.getImageAlbumData()) != null && (imageList = imageAlbumData.getImageList()) != null) {
                Iterator<SingleImageData> it2 = imageList.iterator();
                while (it2.hasNext()) {
                    it2.next().setSynthesisData(null);
                }
            }
            if (C1436220nTg.LJ(videoPublishEditModel)) {
                C1436270nTl.LIZ.getClass();
                ImageAlbumData imageAlbumData2 = videoPublishEditModel.getImageAlbumData();
                if (imageAlbumData2 != null && imageAlbumData2.isTempImageMode()) {
                    C1432260nNI.LIZ(videoPublishEditModel);
                }
            }
        }
        LJFF = false;
        C1436230nTh c1436230nTh = LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("cancelEditPagePrePublish_");
        sbLIZ2.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        AwS171S1100000_22 awS171S1100000_22 = new AwS171S1100000_22(videoPublishEditModel, str, 4);
        c1436230nTh.getClass();
        LIZ(strLIZIZ, awS171S1100000_22);
        if (str == null) {
            str = "cancelDetail is null";
        }
        LJIIJ(videoPublishEditModel, "success", str);
    }

    public static boolean LIZLLL(InterfaceC1452170ntP interfaceC1452170ntP, VideoPublishEditModel videoPublishEditModel) {
        NLEModel nLEModel;
        if (C1440380naO.LIZ(videoPublishEditModel) && (nLEModel = videoPublishEditModel.creativeModel.nleInfoModel.nleModel) != null && C348750Dlp.LIZ(nLEModel)) {
            LJIIIZ(videoPublishEditModel, "streaming entry not downloaded (http in NLE)");
            return false;
        }
        if (videoPublishEditModel.isMusic() != 0) {
            C859300XnM.LIZ("with music: true");
            return true;
        }
        if (Intrinsics.LJFF(C1428470nHB.LJIILIIL(videoPublishEditModel), "upload") && videoPublishEditModel.getVideoCount() == 1) {
            C859300XnM.LIZ("upload single video: true");
            return true;
        }
        if (((Boolean) C262710ARh.LIZ.getValue()).booleanValue() && u4.LJLL(videoPublishEditModel)) {
            C859300XnM.LIZ("new story style: true");
            return true;
        }
        if (((Boolean) C280750AzR.LIZ.getValue()).booleanValue() && videoPublishEditModel.isMusic() == 0 && interfaceC1452170ntP != null && !C1428470nHB.LJJZZI(videoPublishEditModel) && !C1436220nTg.LJ(videoPublishEditModel) && !C1444940nhk.LJII(videoPublishEditModel.getCanvasVideoData())) {
            return LIZIZ.contains(C1436220nTg.LIZJ(interfaceC1452170ntP, videoPublishEditModel));
        }
        if (Intrinsics.LJFF(C1403540mcy.LJI(videoPublishEditModel, ""), "share_to_story") && C0C64.LJIILLIIL().LJIIIZ(31744, "share_to_story_pre_publish_exp", true, false) && videoPublishEditModel.isMusic() == 0) {
            C859300XnM.LIZ("share to story");
            return true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("no_music: ContentSource:");
        sbLIZ.append(C1428470nHB.LJIILIIL(videoPublishEditModel));
        sbLIZ.append(" videoCount:");
        sbLIZ.append(videoPublishEditModel.getVideoCount());
        sbLIZ.append(" photoCount:");
        sbLIZ.append(videoPublishEditModel.getPhotoCount());
        LJIIIZ(videoPublishEditModel, C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }

    public static void LJ(InterfaceC1452170ntP interfaceC1452170ntP, VideoPublishEditModel videoPublishEditModel) {
        CompileLevel compileLevel = null;
        if (C280740AzQ.LIZ() && !(!C1435080nRq.LIZ(C1435080nRq.LIZIZ(videoPublishEditModel, false)))) {
            CompileLevel compileLevel2 = videoPublishEditModel.creativeModel.prePublishStatusModel.compileLevel;
            if (!LIZIZ.contains(compileLevel2)) {
                videoPublishEditModel.creativeModel.prePublishStatusModel.replaceDirectUploadParams = null;
                return;
            }
            if (videoPublishEditModel.hasMusic()) {
                if (C1436220nTg.LIZLLL(videoPublishEditModel)) {
                    LIZJ(videoPublishEditModel, "has_local_music");
                } else {
                    CompileLevel compileLevel3 = CompileLevel.CLOUD_PROCESS_WITH_MUSIC;
                    if (compileLevel2 == compileLevel3) {
                        PrePublishStatusModel prePublishStatusModel = videoPublishEditModel.creativeModel.prePublishStatusModel;
                        String strZf = interfaceC1452170ntP.Zf();
                        if (strZf != null) {
                            prePublishStatusModel.replaceDirectUploadParams = new DirectUploadParams(compileLevel3, strZf);
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } else if (C1436220nTg.LIZJ(interfaceC1452170ntP, videoPublishEditModel) == compileLevel3) {
                        PrePublishStatusModel prePublishStatusModel2 = videoPublishEditModel.creativeModel.prePublishStatusModel;
                        String strZf2 = interfaceC1452170ntP.Zf();
                        if (strZf2 != null) {
                            prePublishStatusModel2.replaceDirectUploadParams = new DirectUploadParams(compileLevel3, strZf2);
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } else {
                        LIZJ(videoPublishEditModel, "upgrade_to_vecloud_failed");
                    }
                }
            } else if (compileLevel2 == CompileLevel.CLOUD_PROCESS_WITH_MUSIC) {
                CompileLevel compileLevelLIZJ = C1436220nTg.LIZJ(interfaceC1452170ntP, videoPublishEditModel);
                if (compileLevelLIZJ != CompileLevel.COPY_WITH_METADATA && compileLevelLIZJ != CompileLevel.UPLOAD_DIRECTLY) {
                    LIZJ(videoPublishEditModel, "downgrade_to_direct_upload_failed");
                } else {
                    videoPublishEditModel.creativeModel.prePublishStatusModel.replaceDirectUploadParams = new DirectUploadParams(compileLevelLIZJ, null);
                }
            } else {
                videoPublishEditModel.creativeModel.prePublishStatusModel.replaceDirectUploadParams = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("checkCompileLevelUpgrade: old=");
            sbLIZ.append(compileLevel2);
            sbLIZ.append(", new=");
            DirectUploadParams directUploadParams = videoPublishEditModel.creativeModel.prePublishStatusModel.replaceDirectUploadParams;
            if (directUploadParams != null) {
                compileLevel = directUploadParams.compileLevel;
            }
            sbLIZ.append(compileLevel);
            sbLIZ.append(", hasMusic=");
            sbLIZ.append(videoPublishEditModel.hasMusic());
            C859300XnM.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        videoPublishEditModel.creativeModel.prePublishStatusModel.replaceDirectUploadParams = null;
    }

    public static void LJIIIZ(VideoPublishEditModel videoPublishEditModel, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TryStart Failed, Reason:");
        sbLIZ.append(str);
        C859300XnM.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        LJFF = false;
        LJIIL(videoPublishEditModel, "fail", str);
    }

    public static void LJIIJ(VideoPublishEditModel videoPublishEditModel, String str, String str2) {
        String strLJIILL;
        String strLJIILIIL;
        if (u7.LIZ() && !u7.LIZIZ()) {
            return;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ(Scene.SCENE_SERVICE, "cancel_publish");
        c0lab.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        c0lab.LJ("msg", str2);
        String str3 = null;
        if (videoPublishEditModel != null) {
            strLJIILL = C1428470nHB.LJIILL(videoPublishEditModel);
        } else {
            strLJIILL = null;
        }
        c0lab.LJ("content_type", strLJIILL);
        if (videoPublishEditModel != null) {
            strLJIILIIL = C1428470nHB.LJIILIIL(videoPublishEditModel);
        } else {
            strLJIILIIL = null;
        }
        c0lab.LJ("content_source", strLJIILIIL);
        if (videoPublishEditModel != null) {
            str3 = videoPublishEditModel.mShootWay;
        }
        c0lab.LJ("shoot_way", str3);
        C20684815ws.LJIILLIIL("tool_performance_edit_pre_publish", c0lab.LIZ);
    }

    public static void LJIIJJI(VideoPublishEditModel videoPublishEditModel, String str, String str2) {
        String strLJIILL;
        String strLJIILIIL;
        if (u7.LIZ() && !u7.LIZIZ()) {
            return;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ(Scene.SCENE_SERVICE, "go_publish_page");
        c0lab.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        c0lab.LJ("msg", str2);
        String str3 = null;
        if (videoPublishEditModel != null) {
            strLJIILL = C1428470nHB.LJIILL(videoPublishEditModel);
        } else {
            strLJIILL = null;
        }
        c0lab.LJ("content_type", strLJIILL);
        if (videoPublishEditModel != null) {
            strLJIILIIL = C1428470nHB.LJIILIIL(videoPublishEditModel);
        } else {
            strLJIILIIL = null;
        }
        c0lab.LJ("content_source", strLJIILIIL);
        if (videoPublishEditModel != null) {
            str3 = videoPublishEditModel.mShootWay;
        }
        c0lab.LJ("shoot_way", str3);
        C20684815ws.LJIILLIIL("tool_performance_edit_pre_publish", c0lab.LIZ);
    }

    public static void LJIIL(VideoPublishEditModel videoPublishEditModel, String str, String str2) {
        String strLJIILL;
        String strLJIILIIL;
        if (u7.LIZ() && !u7.LIZIZ()) {
            return;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ(Scene.SCENE_SERVICE, "start_publish");
        c0lab.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        c0lab.LJ("msg", str2);
        String str3 = null;
        if (videoPublishEditModel != null) {
            strLJIILL = C1428470nHB.LJIILL(videoPublishEditModel);
        } else {
            strLJIILL = null;
        }
        c0lab.LJ("content_type", strLJIILL);
        if (videoPublishEditModel != null) {
            strLJIILIIL = C1428470nHB.LJIILIIL(videoPublishEditModel);
        } else {
            strLJIILIIL = null;
        }
        c0lab.LJ("content_source", strLJIILIIL);
        if (videoPublishEditModel != null) {
            str3 = videoPublishEditModel.mShootWay;
        }
        c0lab.LJ("shoot_way", str3);
        C20684815ws.LJIILLIIL("tool_performance_edit_pre_publish", c0lab.LIZ);
    }

    public static boolean LJFF(VideoPublishEditModel videoPublishEditModel, InterfaceC1452170ntP interfaceC1452170ntP, boolean z, boolean z2) {
        NLENode nLENodeDeepClone;
        boolean zUnorderEquals;
        boolean z3;
        CompileLevel compileLevel;
        boolean z4;
        NLENode nLENodeDeepClone2;
        C1463670oBx c1463670oBx;
        if (C1428470nHB.LJJZZI(videoPublishEditModel) && !C1436220nTg.LJ(videoPublishEditModel)) {
            if (!z && !C1436220nTg.LIZ(videoPublishEditModel, false)) {
                return false;
            }
            return true;
        }
        StickerNewEngineModel stickerNewEngineModel = null;
        if ((interfaceC1452170ntP instanceof C1463670oBx) && (c1463670oBx = (C1463670oBx) interfaceC1452170ntP) != null) {
            nLENodeDeepClone = c1463670oBx.LIZJ().deepClone();
        } else {
            nLENodeDeepClone = null;
        }
        if (z2) {
            DirectUploadParams directUploadParams = videoPublishEditModel.creativeModel.prePublishStatusModel.replaceDirectUploadParams;
            if (directUploadParams != null) {
                compileLevel = directUploadParams.compileLevel;
            } else {
                compileLevel = null;
            }
            if (compileLevel == CompileLevel.CLOUD_PROCESS_WITH_MUSIC) {
                z4 = true;
            } else {
                z4 = false;
            }
            NLENode nLENode = LIZLLL;
            if (nLENode != null && nLENodeDeepClone != null) {
                C859300XnM.LIZ("delete current nleNode bgm");
                NLENode nLENodeLIZIZ = C1436220nTg.LIZIZ(nLENodeDeepClone, z4);
                C859300XnM.LIZ("delete origin nleNode bgm");
                NLENode nLENodeLIZIZ2 = C1436220nTg.LIZIZ(nLENode, z4);
                if (nLENodeLIZIZ != null && nLENodeLIZIZ2 != null && (nLENodeDeepClone2 = nLENodeLIZIZ.deepClone()) != null) {
                    zUnorderEquals = nLENodeLIZIZ2.unorderEquals(nLENodeDeepClone2);
                    z3 = !zUnorderEquals;
                }
            }
            z3 = true;
        } else {
            NLENode nLENode2 = LIZLLL;
            if (nLENode2 != null && nLENodeDeepClone != null) {
                zUnorderEquals = nLENode2.unorderEquals(nLENodeDeepClone);
                z3 = !zUnorderEquals;
            }
            z3 = true;
        }
        if (((Boolean) C287000BMs.LIZ.getValue()).booleanValue()) {
            if (!z3) {
                StickerNewEngineModel stickerNewEngineModel2 = (StickerNewEngineModel) C571330Max.LIZ(videoPublishEditModel.creativeModel.stickerModel);
                List<TextStickerModel> list = stickerNewEngineModel2.textStickerModels;
                ArrayList arrayList = new ArrayList();
                for (TextStickerModel textStickerModel : list) {
                    if (!C0F8Y.LJIIJ(textStickerModel)) {
                        arrayList.add(textStickerModel);
                    }
                }
                stickerNewEngineModel2.textStickerModels = arrayList;
                Iterator it2 = ((ArrayList) C1466090oFr.LJFF(stickerNewEngineModel2)).iterator();
                while (it2.hasNext()) {
                    ((StickerModel) it2.next()).getBaseModel().setCompilePath("");
                }
                StickerNewEngineModel stickerNewEngineModel3 = videoPublishEditModel.creativeModel.prePublishStatusModel.originalStickerData;
                if (stickerNewEngineModel3 != null) {
                    List<TextStickerModel> list2 = stickerNewEngineModel3.textStickerModels;
                    ArrayList arrayList2 = new ArrayList();
                    for (TextStickerModel textStickerModel2 : list2) {
                        if (!C0F8Y.LJIIJ(textStickerModel2)) {
                            arrayList2.add(textStickerModel2);
                        }
                    }
                    stickerNewEngineModel3.textStickerModels = arrayList2;
                    Iterator it3 = ((ArrayList) C1466090oFr.LJFF(stickerNewEngineModel3)).iterator();
                    while (it3.hasNext()) {
                        ((StickerModel) it3.next()).getBaseModel().setCompilePath("");
                    }
                    stickerNewEngineModel = stickerNewEngineModel3;
                }
                if (!(!Intrinsics.LJFF(stickerNewEngineModel, stickerNewEngineModel2))) {
                    return false;
                }
            }
        } else if (!z3 && !C1436220nTg.LIZ(videoPublishEditModel, z2) && !z) {
            return false;
        }
        return true;
    }
}
