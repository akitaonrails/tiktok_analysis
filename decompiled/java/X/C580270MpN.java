package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.ForwardCanvasExtra;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.imagecollage.CollageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.imagecollage.CollageInnerImageInfo;
import com.ss.android.ugc.aweme.creative.model.photomode.VoiceInputMobModel;
import com.ss.android.ugc.aweme.creative.model.photomode.airewrite.AIRewriteModel;
import com.ss.android.ugc.aweme.creative.model.record.CameraLayoutModel;
import com.ss.android.ugc.aweme.creative.model.record.LayoutMediaType;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS249S0300000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0MpN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C580270MpN {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("click_text_entrance", "click_sticker_entrance", "click_crop_icon", "click_modify_entrance", "click_photo_template_entrance", "edit_page_function_click");

    public static final String LJIIIIZZ(String str) {
        Integer numLJIIJJI;
        if (str == null) {
            return "";
        }
        Set setLLIIJI = C13LP.LLIIJI(a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6));
        if (setLLIIJI.size() > 1) {
            return "mix";
        }
        String str2 = (String) C13LP.LJJJLIIL(setLLIIJI);
        if (str2 == null || (numLJIIJJI = C2095008Iq.LJIIJJI(str2)) == null) {
            return "";
        }
        int iIntValue = numLJIIJJI.intValue();
        if (iIntValue != 0) {
            if (iIntValue != 1) {
                return "";
            }
            return "front";
        }
        return "back";
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int LJIIIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4) {
        /*
            r1 = 1
            r3 = 0
            if (r4 == 0) goto L49
            X.0Mmd r0 = X.C578570Mmd.LIZ
            r0.getClass()
            boolean r0 = X.C578570Mmd.LIZ()
            if (r0 == 0) goto L49
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r4.creativeModel
            if (r0 == 0) goto L49
            com.ss.android.ugc.aweme.creative.model.album.LivePhotoModel r0 = r0.livePhotoModel
            if (r0 == 0) goto L49
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r4.creativeModel
            com.ss.android.ugc.aweme.creative.model.album.LivePhotoModel r0 = r0.livePhotoModel
            if (r0 == 0) goto L49
            java.util.List<? extends com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> r0 = r0.importedLivePhotoList
            if (r0 == 0) goto L49
            int r2 = r0.size()
            if (r2 == 0) goto L4a
            if (r4 == 0) goto L48
        L29:
            boolean r0 = X.C1416310mxZ.LJJJJJ(r4)
            if (r0 != r1) goto L48
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r4.creativeModel
            com.ss.android.ugc.aweme.creative.model.record.CameraLayoutModel r0 = r0.cameraLayoutModel
            if (r0 == 0) goto L39
            int r3 = X.C0L5H.LIZJ(r0)
        L39:
            int r2 = r2 + r3
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r4.creativeModel
            com.ss.android.ugc.aweme.creative.model.record.CameraLayoutModel r0 = r0.cameraLayoutModel
            if (r0 == 0) goto L48
            com.ss.android.ugc.aweme.creative.model.record.LayoutMediaType r1 = r0.compileResultType
            com.ss.android.ugc.aweme.creative.model.record.LayoutMediaType r0 = com.ss.android.ugc.aweme.creative.model.record.LayoutMediaType.LIVE_PHOTO
            if (r1 != r0) goto L48
            int r2 = r2 + (-1)
        L48:
            return r2
        L49:
            r2 = 0
        L4a:
            if (r4 == 0) goto L48
            com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoModel r0 = r4.getAILivePhotoModel()
            if (r0 == 0) goto L29
            boolean r0 = r0.LJII()
            if (r0 != r1) goto L29
            com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoModel r0 = r4.getAILivePhotoModel()
            com.ss.android.ugc.aweme.creative.model.ailive.AIAliveRestoreData r0 = r0.restoreData
            com.ss.android.ugc.aweme.creative.model.album.LivePhotoModel r0 = r0.livePhotoModel
            if (r0 == 0) goto L6b
            java.util.List<? extends com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> r0 = r0.importedLivePhotoList
            if (r0 == 0) goto L6b
            int r2 = r0.size()
            goto L29
        L6b:
            r2 = 0
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C580270MpN.LJIIIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C443120HZe<Double, Integer, String> LJIIJ(VideoPublishEditModel videoPublishEditModel) {
        double d;
        long duration;
        NLETrack mainTrack;
        C259800zU c259800zU = new C259800zU();
        Integer num = null;
        T tLJJLIIIJ = 0;
        num = null;
        num = null;
        if (C123100dR.LIZ(videoPublishEditModel.getNleData())) {
            C0FGC.LIZ(2);
            NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
            nLEEditorLIZ.restore(videoPublishEditModel.getNleData());
            NLEModel model = nLEEditorLIZ.getModel();
            if (model != null) {
                duration = model.getDuration();
            } else {
                duration = 0;
            }
            d = duration / 1000000.0d;
            NLEModel model2 = nLEEditorLIZ.getModel();
            if (model2 != null && (mainTrack = model2.getMainTrack()) != null) {
                Integer numValueOf = Integer.valueOf(mainTrack.getSlots().size());
                VecNLETrackSlotSPtr slots = mainTrack.getSlots();
                if (slots != null) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(slots, 10));
                    Iterator<NLETrackSlot> it2 = slots.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(C786410Ut5.k4(Locale.ENGLISH, "%.3f", Arrays.copyOf(new Object[]{Double.valueOf(it2.next().getDuration() / 1000000.0d)}, 1)));
                    }
                    tLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
                }
                c259800zU.element = tLJJLIIIJ;
                num = numValueOf;
            }
        } else {
            d = 0.0d;
        }
        return new C443120HZe<>(Double.valueOf(d), num, c259800zU.element);
    }

    public static final Pair<Integer, Integer> LJIIJJI(VideoPublishEditModel videoPublishEditModel) {
        List<SingleImageData> imageList;
        int size;
        List<CollageInnerImageInfo> collageImageList;
        CameraLayoutModel cameraLayoutModel;
        Pair<Integer, Integer> pairLJIIL = LJIIL(videoPublishEditModel);
        int iIntValue = pairLJIIL.getFirst().intValue();
        int iIntValue2 = pairLJIIL.getSecond().intValue();
        if (C1416310mxZ.LJJJJJ(videoPublishEditModel) && (cameraLayoutModel = videoPublishEditModel.creativeModel.cameraLayoutModel) != null) {
            iIntValue2 += C0L5H.LIZJ(cameraLayoutModel) + C0L5H.LIZLLL(cameraLayoutModel);
            iIntValue += C0L5H.LJFF(cameraLayoutModel);
            if (cameraLayoutModel.compileResultType == LayoutMediaType.VIDEO) {
                iIntValue--;
            } else {
                iIntValue2--;
            }
        }
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            int i = 0;
            for (SingleImageData singleImageData : imageList) {
                if (singleImageData.getCollageInfo() != null) {
                    CollageInfo collageInfo = singleImageData.getCollageInfo();
                    if (collageInfo != null && (collageImageList = collageInfo.getCollageImageList()) != null) {
                        size = collageImageList.size();
                    } else {
                        size = 0;
                    }
                    i += size;
                }
            }
            if (i > 0) {
                iIntValue2 += i - 1;
            }
        }
        return new Pair<>(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
    }

    public static final Pair<Integer, Integer> LJIIL(VideoPublishEditModel videoPublishEditModel) {
        CanvasVideoData canvasVideoData;
        List<EditVideoSegment> videoList;
        boolean zBooleanValue;
        int iLIZJ;
        CanvasExtra canvasExtra;
        ForwardCanvasExtra forwardCanvasExtra;
        int photoCount = videoPublishEditModel.getPhotoCount();
        int videoCount = videoPublishEditModel.getVideoCount();
        int i = 1;
        int size = 0;
        if (!C1428470nHB.LJJZZI(videoPublishEditModel) && videoPublishEditModel.isLivePhotoEdit()) {
            return new Pair<>(0, 1);
        }
        if (videoPublishEditModel.isCutSameVideoType()) {
            return new Pair<>(Integer.valueOf(videoCount), Integer.valueOf(photoCount));
        }
        if (C1444940nhk.LJIIJ(videoPublishEditModel.getCanvasVideoData()) || ((canvasVideoData = videoPublishEditModel.getCanvasVideoData()) != null && (canvasExtra = canvasVideoData.extra) != null && (forwardCanvasExtra = canvasExtra.forwardCanvasExtra) != null && forwardCanvasExtra.forwardType == 10)) {
            return new Pair<>(0, 1);
        }
        if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
            return new Pair<>(0, Integer.valueOf(C1428470nHB.LJIJJ(videoPublishEditModel)));
        }
        if (C1444940nhk.LJII(videoPublishEditModel.getCanvasVideoData())) {
            CanvasVideoData canvasVideoData2 = videoPublishEditModel.getCanvasVideoData();
            if (canvasVideoData2 != null) {
                iLIZJ = C1444940nhk.LIZJ(canvasVideoData2);
            } else {
                iLIZJ = 1;
            }
            if (iLIZJ >= 1) {
                i = iLIZJ;
            }
            return new Pair<>(0, Integer.valueOf(i));
        }
        ArrayList<ImportVideoInfo> importInfoList = videoPublishEditModel.getImportInfoList();
        if (importInfoList != null) {
            List listLLIIII = C13LP.LLIIII(importInfoList);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = listLLIIII.iterator();
            while (it2.hasNext()) {
                String originImportPath = ((ImportVideoInfo) it2.next()).getOriginImportPath();
                if (originImportPath != null) {
                    arrayList.add(originImportPath);
                }
            }
            Set setLLIIJI = C13LP.LLIIJI(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : setLLIIJI) {
                String str = (String) obj;
                if (!C297420BlE.LIZ() && !C298040BmE.LIZ()) {
                    zBooleanValue = C2471909mP.LJJIII(str, true, 4);
                } else {
                    Boolean mediaTypeCache = C0CHQ.LIZ().LJIILL().getMediaTypeCache(str);
                    if (!Intrinsics.LJFF(mediaTypeCache, Boolean.TRUE) && !Intrinsics.LJFF(mediaTypeCache, Boolean.FALSE)) {
                        zBooleanValue = C2471909mP.LJJIII(str, true, 4);
                        C0CHQ.LIZ().LJIILL().updateMediaTypeCache(str);
                    } else {
                        zBooleanValue = mediaTypeCache.booleanValue();
                    }
                }
                if (zBooleanValue) {
                    arrayList2.add(obj);
                }
            }
            Set setLLIIJI2 = C13LP.LLIIJI(arrayList2);
            Set setLJII = C15442062u.LJII(setLLIIJI, setLLIIJI2);
            int size2 = setLLIIJI2.size();
            int size3 = setLJII.size();
            if (size3 > 0 || size2 > 0) {
                return new Pair<>(Integer.valueOf(size3), Integer.valueOf(size2));
            }
        }
        if (C123100dR.LIZ(videoPublishEditModel.getNleData())) {
            C118300cf c118300cf = new C118300cf();
            C118300cf c118300cf2 = new C118300cf();
            AnonymousClass0941.LIZ(new AwS249S0300000_5(videoPublishEditModel, c118300cf2, c118300cf, 37));
            if (videoPublishEditModel.isStitchMode() && C2548609ym.LIZ) {
                int i2 = c118300cf2.element;
                ArrayList<String> arrayList3 = videoPublishEditModel.creativeModel.recordData.recordTypeList;
                if (arrayList3 != null) {
                    size = arrayList3.size();
                }
                c118300cf2.element = (i2 + size) - 2;
            }
            return new Pair<>(Integer.valueOf(c118300cf2.element), Integer.valueOf(c118300cf.element));
        }
        if (videoPublishEditModel.isStitchMode()) {
            if (C2548609ym.LIZ) {
                ArrayList<String> arrayList4 = videoPublishEditModel.creativeModel.recordData.recordTypeList;
                if (arrayList4 != null) {
                    size = arrayList4.size();
                }
            } else {
                EditPreviewInfo editPreviewInfo = videoPublishEditModel.creativeModel.editModel.editPreviewInfo;
                if (editPreviewInfo != null && (videoList = editPreviewInfo.getVideoList()) != null) {
                    size = videoList.size();
                }
            }
            return new Pair<>(Integer.valueOf(size), 0);
        }
        NowsShootModel nowsShootModel = videoPublishEditModel.creativeModel.nowsShootModel;
        if (nowsShootModel != null && nowsShootModel.type == 0) {
            return new Pair<>(0, 1);
        }
        if (C1428470nHB.LLIIIJ(videoPublishEditModel)) {
            return new Pair<>(0, 1);
        }
        return new Pair<>(Integer.valueOf(videoCount), Integer.valueOf(photoCount));
    }

    public static final void LJFF(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        Pair<Integer, Integer> pairLJIIL = LJIIL(videoPublishEditModel);
        pairLJIIL.getFirst().intValue();
        c0lab.LIZ(pairLJIIL.getSecond().intValue(), "image_cnt");
    }

    public static final void LJI(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        int i;
        AIRewriteModel aIRewriteModel = videoPublishEditModel.creativeModel.imagePublishBackSaveModel.aiRewriteModel;
        if (!aIRewriteModel.isLastUsedAIRewrite && !aIRewriteModel.isCurUsedAIRewrite) {
            i = 0;
        } else {
            i = 1;
        }
        c0lab.LIZ(i, "is_used_ai_rewrite");
    }

    public static final void LJII(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        VoiceInputMobModel voiceInputMobModel = videoPublishEditModel.creativeModel.imagePublishBackSaveModel.voiceInputModel;
        c0lab.LIZ(voiceInputMobModel.isUsedVoiceInput ? 1 : 0, "is_used_voice_input");
        c0lab.LIZ(voiceInputMobModel.voiceInputCount, "voice_input_count");
        c0lab.LIZIZ(voiceInputMobModel.voiceTotalDurationMs, "voice_total_duration");
        c0lab.LIZ(voiceInputMobModel.voiceTranscribedLength, "voice_transcribed_length");
    }

    public static final void LIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab, String str) {
        Pair<Integer, Integer> pairLJIIJJI = LJIIJJI(videoPublishEditModel);
        int iIntValue = pairLJIIJJI.getFirst().intValue();
        int iIntValue2 = pairLJIIJJI.getSecond().intValue();
        c0lab.LJ("shoot_tab_name", C1428470nHB.LJJIIZI(videoPublishEditModel));
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LIZ(iIntValue, "video_cnt");
        c0lab.LIZ(iIntValue2, "pic_cnt");
        c0lab.LJ("enter_from", str);
    }

    public static final void LIZIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab, boolean z) {
        Pair<Integer, Integer> pairLJIIJJI = LJIIJJI(videoPublishEditModel);
        int iIntValue = pairLJIIJJI.getFirst().intValue();
        int iIntValue2 = pairLJIIJJI.getSecond().intValue();
        c0lab.LJ("shoot_tab_name", C1428470nHB.LJJIIZI(videoPublishEditModel));
        c0lab.LIZ(iIntValue, "video_cnt");
        int previewVideoLength = 0;
        boolean z2 = true;
        if (iIntValue + iIntValue2 <= 1) {
            z2 = false;
        }
        c0lab.LIZ(C308560C7q.LIZ(Boolean.valueOf(z2)), "is_multi_content");
        c0lab.LIZ(iIntValue2, "pic_cnt");
        EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
        if (previewInfo != null) {
            previewVideoLength = previewInfo.getPreviewVideoLength();
        }
        c0lab.LIZ(previewVideoLength, "creation_duration");
        c0lab.LIZ(C308560C7q.LIZ(Boolean.valueOf(z)), "after_post");
    }

    public static final void LIZJ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab, String str) {
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("enter_from", str);
        LIZIZ(videoPublishEditModel, c0lab, Intrinsics.LJFF(str, "edit_post_page"));
    }

    public static final C0LAB LJIILIIL(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab, String str) {
        int i;
        if (LIZ.contains(str)) {
            if (C1428470nHB.LJJZZI(videoPublishEditModel) && videoPublishEditModel.creativeModel.editPostModel != null) {
                i = 1;
            } else {
                i = 0;
            }
            c0lab.LIZ(i, "is_edit_post");
        }
        return c0lab;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r16, X.C0LAB r17, java.lang.String r18, java.util.List r19) {
        /*
            Method dump skipped, instruction units count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C580270MpN.LIZLLL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.0LAB, java.lang.String, java.util.List):void");
    }
}
