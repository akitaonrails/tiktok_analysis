package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.services.external.ui.EditConfig;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: X.0MpV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C580350MpV {
    public static Intent LIZ(EditConfig editConfig, boolean z, Context context) {
        Activity activityLIZ;
        Intent intent;
        Activity activityLIZ2;
        Intent intent2;
        Serializable serializable;
        Intent intent3 = new Intent();
        if (z) {
            C0MUK.LJIIIZ(intent3, C0MUK.LJIIIIZZ());
        }
        String creationId = editConfig.getCreationId();
        if (creationId == null) {
            creationId = C0DMI.LIZ();
        }
        String stringExtra = null;
        C537520L6g.LIZLLL(intent3, new CreativeInfo(creationId, 0, null, 6, null));
        intent3.putExtra("shoot_way", editConfig.getShootway());
        intent3.putExtra("share_id", editConfig.getShareID());
        intent3.putExtra("channel", editConfig.getChannel());
        intent3.putExtra("hashtag", editConfig.getHashtag());
        intent3.putExtra("share_model", editConfig.getShareModel());
        intent3.putExtra("music_id", editConfig.getMusicId());
        intent3.putExtra("music_start_time", editConfig.getMusicStartTime());
        intent3.putExtra("publish_settings_op", editConfig.getPublishSettings());
        AVChallenge challenge = editConfig.getChallenge();
        if (challenge != null) {
            intent3.putExtra("av_challenge", (Serializable) challenge);
        }
        String musicOrigin = editConfig.getMusicOrigin();
        if (musicOrigin != null) {
            intent3.putExtra("music_origin", musicOrigin);
        }
        Integer launchFlag = editConfig.getLaunchFlag();
        if (launchFlag != null) {
            intent3.addFlags(launchFlag.intValue());
        }
        List<AnchorTransData> anchors = editConfig.getAnchors();
        String stringExtra2 = null;
        if (anchors != null) {
            if (anchors instanceof Serializable) {
                serializable = (Serializable) anchors;
            } else {
                serializable = null;
            }
            intent3.putExtra("auto_selected_anchors", serializable);
        }
        List<AVChallenge> challenges = editConfig.getChallenges();
        if (challenges != null) {
            intent3.putExtra("av_challenge_list", (Serializable) challenges);
        }
        CreativeInitialModel initialModel = editConfig.getInitialModel();
        if (initialModel != null) {
            intent3.putExtra("creative_initial_model", initialModel);
        }
        if (editConfig.getStoryStreakParam() != null) {
            intent3.putExtra("is_story_streaks", true);
        }
        if (editConfig.getStorySocialEventStickerParam() != null) {
            intent3.putExtra("is_story_event_sticker", true);
        }
        Boolean startSaaWithSingleTop = editConfig.getStartSaaWithSingleTop();
        if (startSaaWithSingleTop != null) {
            intent3.putExtra("start_saa_with_single_top", startSaaWithSingleTop.booleanValue());
        }
        Boolean startSaaFromLive = editConfig.getStartSaaFromLive();
        if (startSaaFromLive != null) {
            intent3.putExtra("start_saa_from_live", startSaaFromLive.booleanValue());
        }
        String liveShootPage = editConfig.getLiveShootPage();
        if (liveShootPage != null) {
            intent3.putExtra("live_shoot_page", liveShootPage);
        }
        if (context != null && (activityLIZ2 = C1388190mED.LIZ(context)) != null && (intent2 = activityLIZ2.getIntent()) != null) {
            try {
                stringExtra = intent2.getStringExtra("enter_dm");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (stringExtra != null) {
                intent3.putExtra("enter_dm", stringExtra);
            }
        }
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null && (intent = activityLIZ.getIntent()) != null) {
            try {
                stringExtra2 = intent.getStringExtra("launch_method");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            if (stringExtra2 != null) {
                intent3.putExtra("launch_method", stringExtra2);
            }
        }
        return intent3;
    }
}
