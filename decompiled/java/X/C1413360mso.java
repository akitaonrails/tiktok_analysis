package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.creative.model.StoryNoteInfoModel;
import com.ss.android.ugc.aweme.creative.model.WWAModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.creative.model.declaration.DeclarationInfoStruct;
import com.ss.android.ugc.aweme.creative.model.declaration.DeclarationModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SrcLiveVideoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SubOnlyPhotoPreviewInfo;
import com.ss.android.ugc.aweme.creative.model.landscape.FakeLandscapeInfo;
import com.ss.android.ugc.aweme.creative.model.landscape.LandscapeVideoModel;
import com.ss.android.ugc.aweme.creative.model.record.CameraLayoutModel;
import com.ss.android.ugc.aweme.creative.model.record.LayoutApplyFrom;
import com.ss.android.ugc.aweme.creative.model.story.StreaksData;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StoryStreakModel;
import com.ss.android.ugc.aweme.feed.model.AnimatedImageInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LayoutInfo;
import com.ss.android.ugc.aweme.feed.model.StreaksMeta;
import com.ss.android.ugc.aweme.feed.model.story.AvatarThoughtInfo;
import com.ss.android.ugc.aweme.feed.model.story.AvatarThoughtType;
import com.ss.android.ugc.aweme.lancet.PlayerGroupIdRecorderData;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.ImagePostData;
import com.ss.android.ugc.aweme.shortvideo.model.PhotoPostContent;
import com.ss.android.ugc.aweme.shortvideo.model.PublishImageLivePhotoModel;
import com.ss.android.ugc.aweme.shortvideo.model.PublishImageModel;
import com.ss.android.ugc.aweme.shortvideo.model.SubscriptionInfo;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import lth.o;

/* JADX INFO: renamed from: X.0mso, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@InterfaceC1294060jmO
public final class C1413360mso {
    public final VideoPublishEditModel LIZ;
    public final PublishModel LIZIZ;
    public final VideoCreation LIZJ;
    public final SynthetiseResult LIZLLL;

    public final void LIZ(LinkedHashMap<String, String> linkedHashMap) {
        List<DeclarationInfoStruct> list;
        DeclarationModel declarationModel = this.LIZ.creativeModel.declarationModel;
        if (declarationModel != null && (list = declarationModel.infoList) != null && (!list.isEmpty())) {
            linkedHashMap.put("declaration_info_list", GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), list));
        }
    }

    public final void LIZIZ(LinkedHashMap<String, String> linkedHashMap) {
        synchronized (this.LIZ.creativeModel.landscapeVideoModel) {
            try {
                LandscapeVideoModel landscapeVideoModel = this.LIZ.creativeModel.landscapeVideoModel;
                if (landscapeVideoModel.isFakeLandscapeVideo) {
                    C0FG9.LIZ.getClass();
                    if (C0FG9.LIZ() && landscapeVideoModel.isLandscapeVideo) {
                        linkedHashMap.put("fake_landscape_info", o.LIZIZ.LJIILL(new FakeLandscapeInfo(Integer.valueOf(landscapeVideoModel.blackLevel), Float.valueOf(landscapeVideoModel.borderTop), Float.valueOf(landscapeVideoModel.borderBottom), Float.valueOf(landscapeVideoModel.borderLeft), Float.valueOf(landscapeVideoModel.borderRight))));
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZJ(LinkedHashMap<String, String> linkedHashMap) {
        String str;
        if (C1416310mxZ.LJJJJJ(this.LIZ)) {
            Gson gson = C0CHQ.LIZ().getGson();
            CameraLayoutModel cameraLayoutModel = this.LIZ.creativeModel.cameraLayoutModel;
            String value = null;
            if (cameraLayoutModel != null) {
                str = cameraLayoutModel.layoutMode;
                LayoutApplyFrom layoutApplyFrom = cameraLayoutModel.layoutApplyFrom;
                if (layoutApplyFrom != null) {
                    value = layoutApplyFrom.getValue();
                }
            } else {
                str = null;
            }
            linkedHashMap.put("layout_info", GsonProtectorUtils.toJson(gson, new LayoutInfo(str, value)));
        }
    }

    public final void LIZLLL(LinkedHashMap<String, String> linkedHashMap) {
        Object c098200Yq;
        if (!C279010Awd.LIZ()) {
            return;
        }
        C0CHQ.LIZ().LJIIJJI();
        try {
            LJ(linkedHashMap);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m1boximpl(c098200Yq);
    }

    public final void LJ(LinkedHashMap<String, String> linkedHashMap) {
        String creationId = this.LIZ.getCreationId();
        C1449490np5.LIZ.getClass();
        PlayerGroupIdRecorderData playerGroupIdRecorderDataLJIIIIZZ = C1449490np5.LJIIIIZZ(creationId);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        String str = playerGroupIdRecorderDataLJIIIIZZ.lastPlayGid;
        if (str != null && C123100dR.LIZ(str)) {
            linkedHashMap2.put("last_play_gid", str);
        }
        String str2 = playerGroupIdRecorderDataLJIIIIZZ.lastPagePlayGid;
        if (str2 != null && C123100dR.LIZ(str2)) {
            linkedHashMap2.put("lastpage_play_gid", str2);
        }
        String str3 = playerGroupIdRecorderDataLJIIIIZZ.lastPageName;
        if (str3 != null && C123100dR.LIZ(str3)) {
            linkedHashMap2.put("lastpage_name", str3);
        }
        String str4 = playerGroupIdRecorderDataLJIIIIZZ.prePagePlayGid;
        if (str4 != null && C123100dR.LIZ(str4)) {
            linkedHashMap2.put("prepage_play_gid", str4);
        }
        String str5 = playerGroupIdRecorderDataLJIIIIZZ.prePageName;
        if (str5 != null && C123100dR.LIZ(str5)) {
            linkedHashMap2.put("prepage_name", str5);
        }
        linkedHashMap.put("publish_attribution_params", GsonProtectorUtils.toJson(o.LIZIZ, linkedHashMap2));
    }

    public final SubscriptionInfo LJFF(int i) {
        List<SingleImageData> imageList;
        SingleImageData singleImageData;
        SubOnlyPhotoPreviewInfo subOnlyPhotoPreviewInfo;
        if (!C298640BnC.LIZ()) {
            return null;
        }
        ImageAlbumData imageAlbumData = this.LIZ.getImageAlbumData();
        boolean z = true;
        if (imageAlbumData == null || (imageList = imageAlbumData.getImageList()) == null || (singleImageData = (SingleImageData) C13LP.LJJJLZIJ(i, imageList)) == null || (subOnlyPhotoPreviewInfo = singleImageData.getSubOnlyPhotoPreviewInfo()) == null || !subOnlyPhotoPreviewInfo.isPreview() || !C1413370msp.LIZ.getBoolean("IS_PHOTO_PREVIEW_ON", true)) {
            z = false;
        }
        return new SubscriptionInfo(z);
    }

    public final void LJI(LinkedHashMap<String, String> linkedHashMap) {
        AnimatedImageInfo animatedImageInfo;
        LivePhotoPreviewMode livePhotoPreviewMode;
        PublishImageModel publishImageModel;
        PublishImageLivePhotoModel publishImageLivePhotoModel;
        String str;
        List<SingleImageData> imageList;
        SingleImageData singleImageData;
        SrcLiveVideoInfo srcLiveInfo;
        CameraLayoutModel cameraLayoutModel;
        if (this.LIZ.isCurrentAutoCutMode()) {
            return;
        }
        if (!this.LIZ.isLivePhotoEdit() && !C1428470nHB.LJJZZI(this.LIZ)) {
            return;
        }
        if (C1428470nHB.LJJZZI(this.LIZ) && !this.LIZ.isImageLivePhotoEdit()) {
            return;
        }
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "camera_layout_livephoto_pic_tag_enable", true, false) && C1416310mxZ.LJJJJJ(this.LIZ) && (cameraLayoutModel = this.LIZ.creativeModel.cameraLayoutModel) != null && C0L5H.LJFF(cameraLayoutModel) == 0 && C0L5H.LIZLLL(cameraLayoutModel) > 0 && C0L5H.LIZJ(cameraLayoutModel) > 0) {
            return;
        }
        if (C295850Bih.LIZ() && C1428470nHB.LLI(this.LIZ) && C1428470nHB.LJJZZI(this.LIZ)) {
            ImageAlbumData imageAlbumData = this.LIZ.getImageAlbumData();
            if (imageAlbumData == null || (imageList = imageAlbumData.getImageList()) == null || (singleImageData = (SingleImageData) C13LP.LJJJLL(imageList)) == null || (srcLiveInfo = singleImageData.getSrcLiveInfo()) == null || (livePhotoPreviewMode = srcLiveInfo.getLivePhotoPreviewMode()) == null) {
                livePhotoPreviewMode = this.LIZ.getLivePhotoPreviewMode();
            }
            if (livePhotoPreviewMode != LivePhotoPreviewMode.STATIC) {
                List<PublishImageModel> imageGroup = this.LIZJ.getImageGroup();
                if (imageGroup != null && (publishImageModel = (PublishImageModel) C13LP.LJJJJZI(imageGroup)) != null && (publishImageLivePhotoModel = publishImageModel.publishImageLivePhotoModel) != null && (str = publishImageLivePhotoModel.vid) != null) {
                    linkedHashMap.put("aweme_type", CardStruct.IStatusCode.DEFAULT);
                    linkedHashMap.put("content_type", "live");
                    linkedHashMap.put("video_id", str);
                    if (linkedHashMap.remove("image_post_content") == null) {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        LivePhotoPreviewMode livePhotoPreviewMode2 = this.LIZ.getLivePhotoPreviewMode();
        if (livePhotoPreviewMode2 != null) {
            int i = C534380KxY.LIZ[livePhotoPreviewMode2.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        animatedImageInfo = new AnimatedImageInfo(1, 2);
                    } else {
                        return;
                    }
                } else {
                    animatedImageInfo = new AnimatedImageInfo(1, 1);
                }
            } else {
                animatedImageInfo = new AnimatedImageInfo(0, 0);
            }
            linkedHashMap.put("animated_image_info", GsonProtectorUtils.toJson(o.LIZIZ, animatedImageInfo));
        }
    }

    public final void LJII(LinkedHashMap<String, String> linkedHashMap) {
        String str;
        AvatarThoughtInfo avatarThoughtInfo;
        String str2;
        String str3;
        String str4;
        String altText;
        SingleImageData singleImageData;
        SrcImageInfo srcImageInfo;
        Integer numLJJIII = C1428520nHG.LJJIII(this.LIZ);
        if (numLJJIII == null || numLJJIII.intValue() != 0) {
            linkedHashMap.put("celebration_type", String.valueOf(numLJJIII));
        }
        if (C1428470nHB.LLFZ(this.LIZ)) {
            linkedHashMap.put("story_note_info", GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), this.LIZ.creativeModel.storyModel.getStoryNoteInfoModel()));
            linkedHashMap.put("aweme_type", "45");
            linkedHashMap.remove("video_id");
            ArrayList arrayList = new ArrayList();
            StoryNoteInfoModel storyNoteInfoModel = this.LIZ.creativeModel.storyModel.getStoryNoteInfoModel();
            String str5 = "";
            if (storyNoteInfoModel == null || (str = storyNoteInfoModel.coverImageUri) == null) {
                str = "";
            }
            List<SingleImageData> imageList = null;
            List listSingletonList = null;
            arrayList.add(new ImagePostData(str, 500, 500, null, null, null));
            ImageAlbumData imageAlbumData = this.LIZ.creativeModel.imageAlbumModel;
            if (imageAlbumData != null) {
                imageList = imageAlbumData.getImageList();
            }
            int i = 0;
            for (PublishImageModel publishImageModel : this.LIZJ.getImageGroup()) {
                int i2 = i + 1;
                if (i >= 0) {
                    PublishImageModel publishImageModel2 = publishImageModel;
                    String str6 = publishImageModel2.uri;
                    if (str6 != null) {
                        int i3 = publishImageModel2.width;
                        int i4 = publishImageModel2.height;
                        if (imageList != null && (singleImageData = (SingleImageData) C13LP.LJJJLZIJ(i, imageList)) != null && (srcImageInfo = singleImageData.getSrcImageInfo()) != null) {
                            altText = srcImageInfo.getAltText();
                        } else {
                            altText = null;
                        }
                        arrayList.add(new ImagePostData(str6, i4, i3, altText, null, null));
                        i = i2;
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            StoryNoteInfoModel storyNoteInfoModel2 = this.LIZ.creativeModel.storyModel.getStoryNoteInfoModel();
            if (storyNoteInfoModel2 != null && (str3 = storyNoteInfoModel2.animatedAvatarUri) != null && C123100dR.LIZ(str3)) {
                StoryNoteInfoModel storyNoteInfoModel3 = this.LIZ.creativeModel.storyModel.getStoryNoteInfoModel();
                if (storyNoteInfoModel3 != null && (str4 = storyNoteInfoModel3.animatedAvatarUri) != null) {
                    str5 = str4;
                }
                listSingletonList = Collections.singletonList(new ImagePostData(str5, 480, 480, null, null, null));
            } else {
                StoryNoteInfoModel storyNoteInfoModel4 = this.LIZ.creativeModel.storyModel.getStoryNoteInfoModel();
                if (storyNoteInfoModel4 != null && (avatarThoughtInfo = storyNoteInfoModel4.avatarInfo) != null) {
                    Integer num = avatarThoughtInfo.avatarType;
                    int value = AvatarThoughtType.AVATARTYPE_AVATAR_THOUGHT.getValue();
                    if (num != null && num.intValue() == value) {
                        StoryNoteInfoModel storyNoteInfoModel5 = this.LIZ.creativeModel.storyModel.getStoryNoteInfoModel();
                        if (storyNoteInfoModel5 != null && (str2 = storyNoteInfoModel5.animatedAvatarUri) != null) {
                            str5 = str2;
                        }
                        listSingletonList = Collections.singletonList(new ImagePostData(str5, 480, 480, null, null, null));
                    }
                }
            }
            linkedHashMap.put("image_post_content", GsonProtectorUtils.toJson(o.LIZIZ, new PhotoPostContent(arrayList, (ImagePostData) C13LP.LJJJJZI(arrayList), 0.5f, "", listSingletonList)));
        }
    }

    public final void LJIIIIZZ(LinkedHashMap<String, String> linkedHashMap) {
        boolean z;
        int streakLevel;
        StreaksData streaksData = this.LIZ.creativeModel.streaksData;
        boolean zIsStreaksPost = streaksData.isStreaksPost();
        StoryStreakModel storyStreakModel = this.LIZ.creativeModel.storyEventStickerData.getStoryStreakModel();
        if (!zIsStreaksPost && storyStreakModel == null) {
            z = false;
        } else {
            z = true;
        }
        if (streaksData.isStreaksPost()) {
            streakLevel = streaksData.streaksLevel;
        } else if (storyStreakModel != null) {
            streakLevel = storyStreakModel.getStreakLevel();
        } else {
            streakLevel = -1;
        }
        linkedHashMap.put("is_streaks_post", String.valueOf(z));
        linkedHashMap.put("streaks_meta", GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), new StreaksMeta(streakLevel)));
    }

    public final void LJIIIZ(LinkedHashMap<String, String> linkedHashMap) {
        WWAModel wWAModel;
        String str;
        if ((C857680Xkk.LIZIZ(this.LIZ) || this.LIZ.isPrivate != 1) && (wWAModel = this.LIZ.creativeModel.initialModel.wwaModel) != null && (str = wWAModel.campaignId) != null && str.length() != 0) {
            linkedHashMap.put("wwa_campaign_id", str);
            String str2 = wWAModel.sourcePlatformChannel;
            if (str2 != null) {
                linkedHashMap.put("wwa_video_source_channel", str2);
            }
        }
    }

    public C1413360mso(VideoPublishEditModel videoPublishEditModel, PublishModel publishModel, VideoCreation videoCreation, SynthetiseResult synthetiseResult) {
        this.LIZ = videoPublishEditModel;
        this.LIZIZ = publishModel;
        this.LIZJ = videoCreation;
        this.LIZLLL = synthetiseResult;
    }
}
