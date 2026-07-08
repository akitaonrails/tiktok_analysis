package X;

import android.content.Context;
import com.bytedance.android.livesdk.replay.proto.HashtagStickerConfig;
import com.bytedance.android.livesdk.replay.proto.InfoStickerConfig;
import com.bytedance.android.livesdk.replay.proto.Mention;
import com.bytedance.android.livesdk.replay.proto.PublishPageParams;
import com.bytedance.android.livesdk.replay.proto.SpecialEffectConfig;
import com.bytedance.android.livesdk.replay.proto.TextStickerConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.tangram.dsl.basic.BasicModelCompat;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveBusinessGiftHighlight;
import com.ss.android.ugc.aweme.services.external.ITangramService;
import com.ss.android.ugc.aweme.services.external.ui.EditConfig;
import com.ss.android.ugc.aweme.services.external.ui.MediaInfo;
import com.ss.android.ugc.aweme.services.external.ui.VideoMedia;
import com.ss.ugc.aweme.CreationConfigModel;
import com.ss.ugc.aweme.creation.base.BasicModel;
import com.ss.ugc.aweme.creation.base.CanvasComposer;
import com.ss.ugc.aweme.creation.base.EditConfigModel;
import com.ss.ugc.aweme.creation.base.EditResourceModel;
import com.ss.ugc.aweme.creation.base.EffectStickerExtraModel;
import com.ss.ugc.aweme.creation.base.HashtagStickerExtraModel;
import com.ss.ugc.aweme.creation.base.ImportItemModel;
import com.ss.ugc.aweme.creation.base.MentionModel;
import com.ss.ugc.aweme.creation.base.MusicResModel;
import com.ss.ugc.aweme.creation.base.PhotoModeComposer;
import com.ss.ugc.aweme.creation.base.PointLengthInfo;
import com.ss.ugc.aweme.creation.base.SpecialEffectResModel;
import com.ss.ugc.aweme.creation.base.StickerResModel;
import com.ss.ugc.aweme.creation.base.TextStickerExtraModel;
import com.ss.ugc.aweme.creation.base.UserModel;
import com.ss.ugc.aweme.creation.base.VideoGroupComposer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS286S0300000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0MhP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C575330MhP {
    public static final C575330MhP LIZ = new C575330MhP();

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ(Context context, EditConfig editConfig, LiveBusinessGiftHighlight liveBusinessGiftHighlight) {
        VideoMedia videoMedia;
        String filePath;
        VideoMedia videoMedia2;
        String filePath2;
        List<SpecialEffectConfig> list;
        String str;
        List<InfoStickerConfig> list2;
        List<HashtagStickerConfig> list3;
        List<TextStickerConfig> list4;
        VideoMedia videoMedia3;
        String filePath3;
        List<String> list5;
        List<Mention> list6;
        List<UserModel> atUsers;
        ITangramService iTangramService = (ITangramService) ServiceManager.get().getService(ITangramService.class);
        String str2 = null;
        CreationConfigModel creationConfigModel = new CreationConfigModel("", null, null, null, null);
        BasicModel basicModelCompat = new BasicModelCompat();
        basicModelCompat.getExtraDict().put("videoType", "1");
        Map<String, String> createAwemeDict = basicModelCompat.getCreateAwemeDict();
        try {
            JSONObject jSONObject = new JSONObject(liveBusinessGiftHighlight.getBusinessExtra());
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                createAwemeDict.put(next, (String) jSONObject.get(next));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        PublishPageParams publishPageParams = liveBusinessGiftHighlight.getPublishPageParams();
        if (publishPageParams != null) {
            str2 = publishPageParams.defaultText;
        }
        basicModelCompat.setPublishTitle(str2);
        basicModelCompat.setMention(new MentionModel(new ArrayList()));
        PublishPageParams publishPageParams2 = liveBusinessGiftHighlight.getPublishPageParams();
        if (publishPageParams2 != null && (list6 = publishPageParams2.mentions) != null) {
            for (Mention mention : list6) {
                MentionModel mention2 = basicModelCompat.getMention();
                if (mention2 != null && (atUsers = mention2.getAtUsers()) != null) {
                    atUsers.add(new UserModel(mention.userId, mention.nickname));
                }
            }
        }
        PublishPageParams publishPageParams3 = liveBusinessGiftHighlight.getPublishPageParams();
        if (publishPageParams3 != null && (list5 = publishPageParams3.challenges) != null) {
            Iterator<String> it2 = list5.iterator();
            while (it2.hasNext()) {
                basicModelCompat.getChallenges().add(it2.next());
            }
        }
        creationConfigModel.setBasic(basicModelCompat);
        EditConfigModel editConfigModel = new EditConfigModel(null, null, null, null, null, null, null, null);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoGroupComposer.class);
        String str3 = "";
        if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(VideoGroupComposer.class))) {
            VideoGroupComposer videoGroupComposer = new VideoGroupComposer(new ArrayList(), null);
            List<ImportItemModel> videos = videoGroupComposer.getVideos();
            ImportItemModel importItemModel = new ImportItemModel("", EnumC568840MSs.ImportItemType_UNDEFINED, null, null);
            MediaInfo mediaInfo = editConfig.getMediaInfo();
            if ((mediaInfo instanceof VideoMedia) && (videoMedia3 = (VideoMedia) mediaInfo) != null && (filePath3 = videoMedia3.getFilePath()) != null) {
                str3 = filePath3;
            }
            importItemModel.setPath(str3);
            videos.add(importItemModel);
            editConfigModel.setVideoGroupComposer(videoGroupComposer);
        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(CanvasComposer.class))) {
            CanvasComposer canvasComposer = new CanvasComposer(null);
            List<ImportItemModel> videos2 = ((VideoGroupComposer) canvasComposer).getVideos();
            ImportItemModel importItemModel2 = new ImportItemModel("", EnumC568840MSs.ImportItemType_UNDEFINED, null, null);
            MediaInfo mediaInfo2 = editConfig.getMediaInfo();
            if ((mediaInfo2 instanceof VideoMedia) && (videoMedia2 = (VideoMedia) mediaInfo2) != null && (filePath2 = videoMedia2.getFilePath()) != null) {
                str3 = filePath2;
            }
            importItemModel2.setPath(str3);
            videos2.add(importItemModel2);
            editConfigModel.setCanvasComposer(canvasComposer);
        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(PhotoModeComposer.class))) {
            PhotoModeComposer photoModeComposer = new PhotoModeComposer(null, new ArrayList());
            List<ImportItemModel> videos3 = ((VideoGroupComposer) photoModeComposer).getVideos();
            ImportItemModel importItemModel3 = new ImportItemModel("", EnumC568840MSs.ImportItemType_UNDEFINED, null, null);
            MediaInfo mediaInfo3 = editConfig.getMediaInfo();
            if ((mediaInfo3 instanceof VideoMedia) && (videoMedia = (VideoMedia) mediaInfo3) != null && (filePath = videoMedia.getFilePath()) != null) {
                str3 = filePath;
            }
            importItemModel3.setPath(str3);
            videos3.add(importItemModel3);
            editConfigModel.setPhotomodeComposer(photoModeComposer);
        }
        EditResourceModel editResourceModel = new EditResourceModel(new ArrayList(), null, new ArrayList(), null);
        PublishPageParams publishPageParams4 = liveBusinessGiftHighlight.getPublishPageParams();
        if (publishPageParams4 != null && (list4 = publishPageParams4.textStickerConfig) != null) {
            for (TextStickerConfig textStickerConfig : list4) {
                PointLengthInfo pointLengthInfoLIZ = C575400MhW.LIZ();
                PointLengthInfo pointLengthInfoLIZ2 = C575400MhW.LIZ();
                List<StickerResModel> stickerConfig = editResourceModel.getStickerConfig();
                StickerResModel stickerResModel = new StickerResModel(null, null, null, null, null, null, null, null, pointLengthInfoLIZ, pointLengthInfoLIZ2, null, null, null, null, null);
                EnumC575380MhU enumC575380MhU = EnumC575380MhU.PointLengthType_PERCENTAGE;
                stickerResModel.setCenterX(new PointLengthInfo(enumC575380MhU, (float) textStickerConfig.centerX));
                stickerResModel.setCenterY(new PointLengthInfo(enumC575380MhU, (float) textStickerConfig.centerY));
                stickerResModel.setTextStickerConfig(new TextStickerExtraModel(textStickerConfig.text, Integer.valueOf(textStickerConfig.textStyle), textStickerConfig.colorHex, textStickerConfig.borderColorHex, textStickerConfig.canvasColorHex));
                stickerConfig.add(stickerResModel);
            }
        }
        PublishPageParams publishPageParams5 = liveBusinessGiftHighlight.getPublishPageParams();
        if (publishPageParams5 != null && (list3 = publishPageParams5.hashtagStickerConfig) != null) {
            for (HashtagStickerConfig hashtagStickerConfig : list3) {
                PointLengthInfo pointLengthInfoLIZ3 = C575400MhW.LIZ();
                PointLengthInfo pointLengthInfoLIZ4 = C575400MhW.LIZ();
                List<StickerResModel> stickerConfig2 = editResourceModel.getStickerConfig();
                StickerResModel stickerResModel2 = new StickerResModel(null, null, null, null, null, null, null, null, pointLengthInfoLIZ3, pointLengthInfoLIZ4, null, null, null, null, null);
                EnumC575380MhU enumC575380MhU2 = EnumC575380MhU.PointLengthType_PERCENTAGE;
                stickerResModel2.setCenterX(new PointLengthInfo(enumC575380MhU2, (float) hashtagStickerConfig.centerX));
                stickerResModel2.setCenterY(new PointLengthInfo(enumC575380MhU2, (float) hashtagStickerConfig.centerY));
                stickerResModel2.setHashtagStickerConfig(new HashtagStickerExtraModel(hashtagStickerConfig.text));
                stickerConfig2.add(stickerResModel2);
            }
        }
        PublishPageParams publishPageParams6 = liveBusinessGiftHighlight.getPublishPageParams();
        if (publishPageParams6 != null && (list2 = publishPageParams6.infoStickerConfig) != null) {
            for (InfoStickerConfig infoStickerConfig : list2) {
                PointLengthInfo pointLengthInfoLIZ5 = C575400MhW.LIZ();
                PointLengthInfo pointLengthInfoLIZ6 = C575400MhW.LIZ();
                List<StickerResModel> stickerConfig3 = editResourceModel.getStickerConfig();
                StickerResModel stickerResModel3 = new StickerResModel(null, null, null, null, null, null, null, null, pointLengthInfoLIZ5, pointLengthInfoLIZ6, null, null, null, null, null);
                EnumC575380MhU enumC575380MhU3 = EnumC575380MhU.PointLengthType_PERCENTAGE;
                stickerResModel3.setCenterX(new PointLengthInfo(enumC575380MhU3, ((float) infoStickerConfig.centerX) - 0.5f));
                stickerResModel3.setCenterY(new PointLengthInfo(enumC575380MhU3, ((float) infoStickerConfig.centerY) - 0.5f));
                stickerResModel3.setEffectStickerConfig(new EffectStickerExtraModel(infoStickerConfig.stickerId, null, null));
                stickerConfig3.add(stickerResModel3);
            }
        }
        PublishPageParams publishPageParams7 = liveBusinessGiftHighlight.getPublishPageParams();
        if (publishPageParams7 != null && (str = publishPageParams7.musicId) != null) {
            MusicResModel musicResModel = new MusicResModel(null, "");
            musicResModel.setMusicId(str);
            editResourceModel.setMusicConfig(musicResModel);
        }
        String musicId = editConfig.getMusicId();
        if (musicId != null) {
            MusicResModel musicResModel2 = new MusicResModel(null, "");
            musicResModel2.setMusicId(musicId);
            editResourceModel.setMusicConfig(musicResModel2);
        }
        PublishPageParams publishPageParams8 = liveBusinessGiftHighlight.getPublishPageParams();
        if (publishPageParams8 != null && (list = publishPageParams8.specialEffectConfig) != null) {
            for (SpecialEffectConfig specialEffectConfig : list) {
                List<SpecialEffectResModel> specialEffectConfig2 = editResourceModel.getSpecialEffectConfig();
                SpecialEffectResModel specialEffectResModel = new SpecialEffectResModel(null, "");
                specialEffectResModel.setEffectId(specialEffectConfig.effectId);
                specialEffectConfig2.add(specialEffectResModel);
            }
        }
        editConfigModel.setEditResources(editResourceModel);
        creationConfigModel.setEdit(editConfigModel);
        iTangramService.start(context, creationConfigModel, new AwS587S0100000_8(editConfig, 728), new AwS286S0300000_8(context, editConfig, liveBusinessGiftHighlight, 11));
    }
}
