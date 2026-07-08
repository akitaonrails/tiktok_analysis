package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.story.userpanel.ui.StoryUserListPanelAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0SwH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C737430SwH implements InterfaceC734870Ss9 {
    public static final C737430SwH LIZ = new C737430SwH();

    @Override // X.InterfaceC734870Ss9
    public final InterfaceC694390RLp LIZJ() {
        return C728270ShV.LIZ;
    }

    @Override // X.InterfaceC734870Ss9
    public final void LIZ(Aweme aweme) {
        String str;
        String groupId;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (C729510SjV.LJJIJIL(aweme)) {
            str = "story";
        } else {
            str = "post";
        }
        c2344009Gk.LJIIIIZZ("story_type", str);
        c2344009Gk.LJIIIIZZ("position", "share_panel");
        if (aweme == null || (groupId = aweme.getGroupId()) == null) {
            groupId = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", groupId);
        C20684815ws.LJIILLIIL("click_story_add_mention_button", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC734870Ss9
    public final int LJ(Context context) {
        return (int) (C418440Gaw.LIZJ(context) * 0.73f);
    }

    @Override // X.InterfaceC734870Ss9
    public final void LJFF(Context context) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//main");
        smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
        smartRouteBuildRoute.addFlags(67108864);
        smartRouteBuildRoute.open();
    }

    @Override // X.InterfaceC734870Ss9
    public final boolean LJI(Aweme aweme) {
        if (aweme == null || AwemeExtKt.isInReviewing(aweme) || AwemeExtKt.isSelfSee(aweme) || C729510SjV.LJIJ(aweme) || C729510SjV.LJJI(aweme) || AwemeExtKt.shouldShowReviewStatus(aweme) || !aweme.getIsTikTokStory() || !C729980SkG.LJIIIIZZ(aweme)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC734870Ss9
    public final void LIZLLL(Context context, Aweme aweme) {
        FragmentManager supportFragmentManager;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            TuxSheet tuxSheetLJII = LJII(context, aweme, "share_panel", "mention", null, null, null, false, AFwS198S0000000_11.get$arr$(439));
            C1440005kM.LIZ(new C453940Hr6(true, false, 6));
            tuxSheetLJII.show(supportFragmentManager, "AfterPublishMentionPanel");
        }
    }

    @Override // X.InterfaceC734870Ss9
    public final void LIZIZ(Context context, String str, boolean z, VideoPublishEditModel videoPublishEditModel, String str2, boolean z2, Function0<Unit> function0) {
        FragmentManager supportFragmentManager;
        String str3;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            if (z) {
                str3 = "dm_primary";
            } else {
                str3 = "dm_followup";
            }
            LJII(context, null, str, "dm", str3, videoPublishEditModel, str2, z2, new AwS555S0100000_11(function0, (Function0<Unit>) 1534)).show(supportFragmentManager, "AudienceFooterDmPanel");
        }
    }

    public final TuxSheet LJII(Context context, Aweme aweme, String str, String str2, String str3, VideoPublishEditModel videoPublishEditModel, String str4, boolean z, Function0<Unit> function0) {
        String aid;
        String groupId;
        StoryUserListPanelAssem storyUserListPanelAssem = new StoryUserListPanelAssem();
        Bundle bundle = new Bundle();
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        C786410Ut5.LJJJI("aweme_id", aid, bundle);
        C786410Ut5.LJJJI("et_enter_position", str, bundle);
        if (aweme == null || (groupId = aweme.getGroupId()) == null) {
            groupId = "";
        }
        C786410Ut5.LJJJI("group_id", groupId, bundle);
        C786410Ut5.LJJJI("panel_type", str2, bundle);
        C786410Ut5.LJJJI("panel_subtype", str3, bundle);
        C786410Ut5.LJJJI("show_way", str4, bundle);
        bundle.putBoolean("use_internal_share_sort_order", z);
        if (videoPublishEditModel != null) {
            C1428470nHB.LLIL(bundle, videoPublishEditModel);
        }
        storyUserListPanelAssem.setArguments(bundle);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = storyUserListPanelAssem;
        tuxSheet.LLJLILLLLZIIL = false;
        c1390920mIc.LJIIIIZZ(1);
        int iLJ = LJ(context);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJJL = iLJ;
        tuxSheet2.LLILLJJLI = new DialogInterfaceOnDismissListenerC738790SyT(function0, 7);
        return tuxSheet2;
    }
}
