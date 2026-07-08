package X;

import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.InitialFilterConfig;
import com.ss.android.ugc.aweme.creative.model.stickers.MentionStickerParam;
import com.ss.android.ugc.aweme.secretreplies.model.SecretRepliesRecordParam;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerGroupInfo;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0MiH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C575870MiH {
    public final C575860MiG LIZ = new C575860MiG();

    public final void LIZ(RecordConfig recordConfig) {
        String shootway = recordConfig.getShootway();
        if (shootway != null) {
            this.LIZ.setShootWay(shootway);
        }
        String enterMethod = recordConfig.getEnterMethod();
        if (enterMethod != null) {
            this.LIZ.setEnterMethod(enterMethod);
        }
        String relationEnterMethod = recordConfig.getRelationEnterMethod();
        if (relationEnterMethod != null) {
            this.LIZ.setRelationEnterMethod(relationEnterMethod);
        }
        String shootFrom = recordConfig.getShootFrom();
        if (shootFrom != null) {
            this.LIZ.setShootFrom(shootFrom);
        }
        String enterFrom = recordConfig.getEnterFrom();
        if (enterFrom != null) {
            this.LIZ.setEnterFrom(enterFrom);
        }
        String creationId = recordConfig.getCreationId();
        if (creationId != null) {
            this.LIZ.setCreationId(creationId);
        }
        String musicOrigin = recordConfig.getMusicOrigin();
        if (musicOrigin != null) {
            this.LIZ.setMusicOrigin(musicOrigin);
        }
        String musicId = recordConfig.getMusicId();
        if (musicId != null) {
            this.LIZ.setMusicId(musicId);
        }
        CreativeInitialModel initialModel = recordConfig.getInitialModel();
        if (initialModel != null) {
            this.LIZ.setInitialModel(initialModel);
        }
        AddYourRecordParam addYourRecordParam = recordConfig.getAddYourRecordParam();
        if (addYourRecordParam != null) {
            this.LIZ.setAddYourRecordParam(addYourRecordParam);
        }
        MentionStickerParam mentionStickerParam = recordConfig.getMentionStickerParam();
        if (mentionStickerParam != null) {
            this.LIZ.setMentionStickerParam(mentionStickerParam);
        }
        DMGroupChatStickerGroupInfo dmGroupChatStickerGroupInfo = recordConfig.getDmGroupChatStickerGroupInfo();
        if (dmGroupChatStickerGroupInfo != null) {
            this.LIZ.setDmGroupChatStickerGroupInfo(dmGroupChatStickerGroupInfo);
        }
        SecretRepliesRecordParam secretRepliesStickerParam = recordConfig.getSecretRepliesStickerParam();
        if (secretRepliesStickerParam != null) {
            this.LIZ.setSecretRepliesStickerParam(secretRepliesStickerParam);
        }
        this.LIZ.setLandingBack(Boolean.valueOf(recordConfig.getLandingBack()));
        String musicPath = recordConfig.getMusicPath();
        if (musicPath != null) {
            this.LIZ.setMusicPath(musicPath);
        }
        MusicModel musicModel = recordConfig.getMusicModel();
        if (musicModel != null) {
            this.LIZ.setMusicModel(musicModel);
        }
        Pair<String, String> mentionUser = recordConfig.getMentionUser();
        if (mentionUser != null) {
            this.LIZ.setMentionUser(mentionUser);
        }
        InitialFilterConfig initialFilterConfig = recordConfig.getInitialFilterConfig();
        if (initialFilterConfig != null) {
            this.LIZ.setInitialFilterConfig(initialFilterConfig);
        }
        this.LIZ.setRecordFromFeed(recordConfig.getRecordFromFeed());
    }
}
