package X;

import Y.ARunnableS39S0300000_6;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoTag;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetailCommonModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mOS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1394540mOS implements InterfaceC1399020mVg {
    public static final int LIZIZ = VideoTag.MDP_SQUARE_TEMPLATE.getVideoTag();
    public final Function0<Fragment> LIZ;

    @Override // X.InterfaceC1399020mVg
    public final int LIZIZ() {
        return 2131857993;
    }

    public C1394540mOS(AwS565S0100000_21 awS565S0100000_21) {
        this.LIZ = awS565S0100000_21;
    }

    @Override // X.InterfaceC1399020mVg
    public final void LIZ(ViewGroup viewGroup) {
        View viewFindViewById;
        TextView textView;
        if (viewGroup == null || (viewFindViewById = viewGroup.findViewById(R.id.cbx)) == null || (textView = (TextView) viewFindViewById.findViewById(R.id.szn)) == null) {
            return;
        }
        HandlerHook.viewPost(viewFindViewById, new ARunnableS39S0300000_6(viewFindViewById, textView, this, 19));
    }

    @Override // X.InterfaceC1399020mVg
    public final void LIZJ(Context context, Aweme aweme, Integer num) {
        Bundle arguments;
        Intent intent;
        Intent intent2;
        Intent intent3;
        String aid;
        String strCarryMetaSongId;
        String idStr;
        String strCarryTemplateId;
        String strCarryTemplateId2;
        String aid2;
        Music music;
        Music music2;
        Music music3;
        Music music4;
        C19EG activity;
        C19EG activity2;
        Fragment fragmentInvoke = this.LIZ.invoke();
        if (fragmentInvoke != null && (arguments = fragmentInvoke.getArguments()) != null) {
            String string = arguments.getString(FollowStatusChangeMethod.PARAM_UID, "");
            MusicDetailCommonModel musicDetailCommonModel = MusicDetailCommonModel.INSTANCE;
            Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ != null) {
                intent = activityLIZ.getIntent();
            } else {
                intent = null;
            }
            String strSquareRecTypeInnerFeed = musicDetailCommonModel.squareRecTypeInnerFeed(aweme, intent);
            String strSquareRecReasonInnerFeed = musicDetailCommonModel.squareRecReasonInnerFeed(aweme, C1388190mED.LIZ(context));
            Fragment fragmentInvoke2 = this.LIZ.invoke();
            if (fragmentInvoke2 != null && (activity2 = fragmentInvoke2.getActivity()) != null) {
                intent2 = activity2.getIntent();
            } else {
                intent2 = null;
            }
            String strCurSquareActionPositionOnInnerFeed = musicDetailCommonModel.curSquareActionPositionOnInnerFeed(aweme, intent2);
            Fragment fragmentInvoke3 = this.LIZ.invoke();
            if (fragmentInvoke3 != null && (activity = fragmentInvoke3.getActivity()) != null) {
                intent3 = activity.getIntent();
            } else {
                intent3 = null;
            }
            boolean z = true;
            int iIsFromFollowupSquareOriginalVideoInnerFeed = musicDetailCommonModel.isFromFollowupSquareOriginalVideoInnerFeed(aweme, intent3, true);
            String string2 = arguments.getString("shoot_way");
            String str = "single_song";
            if (string2 == null) {
                string2 = "single_song";
            }
            String string3 = arguments.getString("music_selected_from");
            if (string3 == null) {
                string3 = "single_song";
            }
            if (strCurSquareActionPositionOnInnerFeed == null || !C123100dR.LIZ(strCurSquareActionPositionOnInnerFeed)) {
                z = false;
            }
            if (z) {
                string2 = "followup_square";
                str = "followup_square";
            } else if (Intrinsics.LJFF(string2, "followup_square")) {
                string2 = "single_song";
            } else {
                str = string3;
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJFF("followup_square_action_position", strCurSquareActionPositionOnInnerFeed);
            c2344009Gk.LIZJ(iIsFromFollowupSquareOriginalVideoInnerFeed, "is_from_followup_square_original_video");
            c2344009Gk.LJFF("followup_square_recommend_type", strSquareRecTypeInnerFeed);
            c2344009Gk.LJFF("followup_square_recommend_reason", strSquareRecReasonInnerFeed);
            c2344009Gk.LJFF("group_id", string);
            c2344009Gk.LJFF("from_group_id", string);
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            c2344009Gk.LJFF("last_group_id", aid);
            if (aweme != null && (music4 = aweme.getMusic()) != null) {
                strCarryMetaSongId = music4.carryMetaSongId();
            } else {
                strCarryMetaSongId = null;
            }
            c2344009Gk.LJFF("meta_song_id", strCarryMetaSongId);
            if (aweme != null && (music3 = aweme.getMusic()) != null) {
                idStr = music3.getIdStr();
            } else {
                idStr = null;
            }
            c2344009Gk.LJFF("music_id", idStr);
            if (aweme != null && (music2 = aweme.getMusic()) != null) {
                strCarryTemplateId = music2.carryTemplateId();
            } else {
                strCarryTemplateId = null;
            }
            c2344009Gk.LJFF("tt_template_id", strCarryTemplateId);
            c2344009Gk.LJFF("enter_from", "music_detail");
            c2344009Gk.LJFF("shoot_way", string2);
            c2344009Gk.LJFF("music_selected_from", str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (num != null) {
                c2344009Gk.LIZJ(num.intValue(), "followup_square_video_rank");
            }
            linkedHashMap.put("shoot", c2344009Gk.LIZ);
            ShootExtraData shootExtraData = new ShootExtraData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777215, null);
            shootExtraData.setMobParams(linkedHashMap);
            shootExtraData.setFollowupSquareActionPosition(strCurSquareActionPositionOnInnerFeed);
            shootExtraData.setFromFollowupSquareOriginalVideo(String.valueOf(iIsFromFollowupSquareOriginalVideoInnerFeed));
            shootExtraData.setFollowupSquareRecommendType(strSquareRecTypeInnerFeed);
            shootExtraData.setFollowupSquareRecommendReason(strSquareRecReasonInnerFeed);
            shootExtraData.setFollowupSquareVideoRank(num);
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//startUseTemplate");
            if (aweme != null && (music = aweme.getMusic()) != null) {
                strCarryTemplateId2 = music.carryTemplateId();
            } else {
                strCarryTemplateId2 = null;
            }
            smartRouteBuildRoute.withParam("template_id", strCarryTemplateId2);
            smartRouteBuildRoute.withParam("shoot_way", string2);
            smartRouteBuildRoute.withParam("schema_tag", "template_schema");
            if (aweme != null) {
                aid2 = aweme.getAid();
            } else {
                aid2 = null;
            }
            smartRouteBuildRoute.withParam("group_id", aid2);
            smartRouteBuildRoute.withParam("enter_from", "music_detail");
            smartRouteBuildRoute.withParam("shoot_extra_data", (Serializable) shootExtraData);
            smartRouteBuildRoute.open();
        }
    }
}
