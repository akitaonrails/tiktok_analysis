package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.StoryUploadPageEntranceType;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.search.CreationSearchModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IAILiveService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.task.RecordTaskManager;
import com.ss.android.ugc.aweme.social.creation.api.edit.IJatoBoostService;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.StoryNavigationService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS167S0400000_8;
import kotlin.jvm.internal.AwS252S0300000_8;
import kotlin.jvm.internal.AwS286S0300000_8;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS409S0200000_8;

/* JADX INFO: renamed from: X.0M9f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C563770M9f implements StoryNavigationService {
    public final C0L6N LIZ = new C0L6N();
    public final C563760M9e LIZIZ = new C563760M9e();
    public final C563780M9g LIZJ = new C563780M9g();
    public final C540820LIy LIZLLL = new C540820LIy();
    public final C01GW LJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(400));

    @Override // com.ss.android.ugc.aweme.social.creation.api.mediapicker.StoryNavigationService
    public final C0L6P getDebugService() {
        return (C0L6P) this.LJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.social.creation.api.mediapicker.StoryNavigationService
    public final void trimLowMemoryTask() {
        this.LIZJ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.social.creation.api.mediapicker.StoryNavigationService
    public final void warmUpMediaResources() {
        C540820LIy c540820LIy = this.LIZLLL;
        c540820LIy.getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1418405gs(c540820LIy, null), 3);
    }

    public static void LIZIZ(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("shoot_way", "story");
        c2344009Gk.LJIIIIZZ("type", "photo");
        C20684815ws.LJIILLIIL("go_to_setting_show", c2344009Gk.LIZ);
    }

    public static void LIZJ(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("shoot_way", "story");
        c2344009Gk.LJIIIIZZ("type", "photo");
        c2344009Gk.LJ(Boolean.TRUE, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        C20684815ws.LJIILLIIL("go_to_settings_action", c2344009Gk.LIZ);
    }

    public final void LIZ(EnterStoryParam enterStoryParam, Function1<? super Bundle, Unit> function1) {
        int i;
        IAILiveService aILiveService;
        C563760M9e c563760M9e = this.LIZIZ;
        AwS286S0300000_8 awS286S0300000_8 = new AwS286S0300000_8((Function1) function1, (Function1<? super Bundle, Unit>) c563760M9e, (C563760M9e) enterStoryParam, (EnterStoryParam) 6);
        c563760M9e.getClass();
        String strLIZ = C563760M9e.LIZ(enterStoryParam);
        String strLIZIZ = C563760M9e.LIZIZ(enterStoryParam);
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("shoot_way", enterStoryParam.getShootWay(), bundle);
        C786410Ut5.LJJJI("enter_from", enterStoryParam.getEnterFrom(), bundle);
        C786410Ut5.LJJJI("enter_method", enterStoryParam.getEnterMethod(), bundle);
        C786410Ut5.LJJJI("shoot_enter_from", strLIZ, bundle);
        C786410Ut5.LJJJI("shoot_enter_method", strLIZIZ, bundle);
        bundle.putBoolean("is_story_entrance", true);
        C786410Ut5.LJJJI("story_shoot_enter_position", enterStoryParam.getStoryShootEnterPosition(), bundle);
        C786410Ut5.LJJJI("story_creative_enter_from_passthrough", enterStoryParam.getEnterFrom(), bundle);
        C786410Ut5.LJJJI("shoot_from_group_id", enterStoryParam.getFromGroupId(), bundle);
        C786410Ut5.LJJJI("story_archive_tab_name", enterStoryParam.getStoryArchiveTabName(), bundle);
        C786410Ut5.LJJIJL(bundle, "extra_shoot_data", enterStoryParam.getShootExtraData());
        ShortVideoContext shortVideoContextLIZIZ = C1443540nfU.LIZIZ(bundle);
        CreationSearchModel creationSearchModel = enterStoryParam.getCreationSearchModel();
        if (creationSearchModel != null) {
            shortVideoContextLIZIZ.creativeModel.creationSearchModel = creationSearchModel;
        }
        MusicBuzModel preselectedMusic = enterStoryParam.getPreselectedMusic();
        if (preselectedMusic != null) {
            shortVideoContextLIZIZ.creativeModel.musicBuzModel = preselectedMusic;
        }
        Bundle bundle2 = new Bundle();
        C786410Ut5.LJJJI("shoot_way", enterStoryParam.getShootWay(), bundle2);
        C786410Ut5.LJJJI("enter_from", enterStoryParam.getEnterFrom(), bundle2);
        C786410Ut5.LJJJI("enter_method", enterStoryParam.getEnterMethod(), bundle2);
        C786410Ut5.LJJJI("shoot_enter_from", strLIZ, bundle2);
        C786410Ut5.LJJJI("shoot_enter_method", strLIZIZ, bundle2);
        bundle2.putInt("key_photo_select_min_count", 1);
        bundle2.putInt("key_photo_select_max_count", 35);
        bundle2.putInt("key_video_select_min_count", 1);
        bundle2.putInt("key_video_select_max_count", 35);
        bundle2.putBoolean("Key_enable_multi_video", true);
        C786410Ut5.LJJIJL(bundle2, "key_short_video_context", shortVideoContextLIZIZ);
        bundle2.putBoolean("key_upload_direct_enter", true);
        String shootWay = enterStoryParam.getShootWay();
        String enterMethod = enterStoryParam.getEnterMethod();
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService != null && (aILiveService = iExternalService.getAILiveService()) != null && aILiveService.isAILiveShootWay(shootWay, enterMethod)) {
            i = 2;
        } else {
            i = 6;
        }
        bundle2.putInt("key_support_flag", i);
        bundle2.putInt("key_choose_scene", 0);
        awS286S0300000_8.invoke(shortVideoContextLIZIZ, bundle2);
    }

    @Override // com.ss.android.ugc.aweme.social.creation.api.mediapicker.StoryNavigationService
    public final TokenCert chooseBPEAToken(String str, String str2, String str3) {
        this.LIZ.getClass();
        C523800KgU c523800KgU = new C523800KgU();
        c523800KgU.LIZ = str;
        c523800KgU.LIZIZ = str2;
        c523800KgU.LIZJ = str3;
        return c523800KgU.LIZ().LIZ();
    }

    @Override // com.ss.android.ugc.aweme.social.creation.api.mediapicker.StoryNavigationService
    public final void customizeStartStoryPublish(Activity activity, EnterStoryParam enterStoryParam, InterfaceC1631620sYq<? super Activity, ? super Bundle, ? super Integer, Unit> interfaceC1631620sYq) {
        C563780M9g c563780M9g = this.LIZJ;
        c563780M9g.getClass();
        if (C522620Kea.LIZ()) {
            RecordTaskManager.LIZ(new C536780L3k(), true);
        }
        c563780M9g.LIZ();
        LIZ(enterStoryParam, new AwS374S0200000_8(activity, interfaceC1631620sYq, 155));
    }

    @Override // com.ss.android.ugc.aweme.social.creation.api.mediapicker.StoryNavigationService
    public final boolean openStoryRecordingPageDirectly(Context context, EnterStoryParam enterStoryParam, Bundle bundle) {
        int i;
        String value;
        if (!C536380L1w.LIZ(context)) {
            return false;
        }
        this.LIZIZ.getClass();
        Bundle bundle2 = new Bundle();
        C786410Ut5.LJJJI("shoot_way", enterStoryParam.getShootWay(), bundle2);
        C786410Ut5.LJJJI("enter_method", enterStoryParam.getEnterMethod(), bundle2);
        C786410Ut5.LJJJI("creation_id", enterStoryParam.getCreationId(), bundle2);
        C786410Ut5.LJJJI("enter_from", enterStoryParam.getEnterFrom(), bundle2);
        C786410Ut5.LJJJI("shoot_enter_from", C563760M9e.LIZ(enterStoryParam), bundle2);
        C786410Ut5.LJJJI("shoot_enter_method", C563760M9e.LIZIZ(enterStoryParam), bundle2);
        C786410Ut5.LJJIJL(bundle2, "extra_shoot_data", enterStoryParam.getShootExtraData());
        bundle2.putBoolean("is_story_entrance", true);
        C786410Ut5.LJJJI("story_shoot_enter_position", enterStoryParam.getStoryShootEnterPosition(), bundle2);
        C786410Ut5.LJJJI("shoot_from_group_id", enterStoryParam.getFromGroupId(), bundle2);
        C786410Ut5.LJJJI("story_creative_enter_from_passthrough", enterStoryParam.getShootExtraData().getShootEnterFrom(), bundle2);
        C786410Ut5.LJJJI("story_archive_tab_name", enterStoryParam.getStoryArchiveTabName(), bundle2);
        bundle2.putBoolean("is_story_enhanced_entrance", enterStoryParam.isStoryEnhancedEntrance());
        bundle2.putBoolean("enable_story_swipe_up_exit_gesture", enterStoryParam.getEnableSwipeUpExit());
        bundle2.putInt("enable_story_shared_element_transition_mode", enterStoryParam.getSharedElementTransitionMode());
        bundle2.putFloat("story_shared_element_rounded_mask_initial_translation_y", enterStoryParam.getSharedElementRoundedMaskInitialY());
        int storyTransType = enterStoryParam.getStoryTransType();
        if (storyTransType != 1) {
            i = 6;
            if (storyTransType != 6) {
                i = 9;
                if (storyTransType != 9) {
                    i = 18;
                    if (storyTransType != 18) {
                        i = 20;
                        if (storyTransType != 20) {
                            i = 22;
                            if (storyTransType != 22) {
                                i = 0;
                            }
                        }
                    }
                }
            }
        } else {
            i = 1;
        }
        bundle2.putInt("translation_type", i);
        C786410Ut5.LJJIJL(bundle2, "secret_replies_sticker_param", enterStoryParam.getBaseSecretReplyData());
        StoryUploadPageEntranceType entranceType = enterStoryParam.getEntranceType();
        if (entranceType == null || (value = entranceType.getValue()) == null) {
            value = "";
        }
        C786410Ut5.LJJJI("upload_page_entrance_type", value, bundle2);
        bundle2.putBoolean("is_upload_direct_enter", enterStoryParam.isUploadDirectEnter());
        if (C298680BnG.LIZ()) {
            bundle2.putBoolean("is_sub_only_video", enterStoryParam.isSubOnlyStory());
        }
        bundle2.putInt("after_publish_landing_mode", enterStoryParam.getAfterPublishLandingMode().ordinal());
        if (C298680BnG.LIZ()) {
            bundle2.putBoolean("is_sub_only_story", enterStoryParam.isSubOnlyStory());
            if (enterStoryParam.isSubOnlyStory()) {
                bundle2.putInt("is_private", 4);
            }
        }
        bundle2.putBoolean("is_social_camera", true);
        C786410Ut5.LJJIIZI(bundle2, bundle, "story_transition_bundle");
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "story_camera_enable_new_record_scene", true) == 1) {
            C786410Ut5.LJJJI("social_record_model", "SocialVideoRecordScene", bundle2);
        }
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            IJatoBoostService iJatoBoostService = (IJatoBoostService) PluggableExtentionKt.pluggableSpi$default(IJatoBoostService.class, false, false, false, 14, null);
            if (iJatoBoostService != null) {
                iJatoBoostService.LIZ();
            }
            Intent intent = new Intent();
            intent.putExtras(bundle2);
            intent.putExtra("shoot_way", "story");
            C563820M9k.LIZ.getClass();
            if (!intent.hasExtra("creation_id")) {
                C537520L6g.LIZLLL(intent, new CreativeInfo(null, 0, null, 7, null));
            }
            C1452640nuA.LJI(null);
            C1443030nef.LJII().LJIIIZ();
            if (intent.getLongExtra("extra_start_record_time", 0L) == 0) {
                intent.putExtra("extra_start_record_time", System.currentTimeMillis());
            }
            if (C1660680tJi.LIZ().LJII(activityLIZ, intent)) {
                C1660680tJi.LIZ().LJIILLIIL(activityLIZ, intent);
                return true;
            }
            if (C564020MAe.LIZ()) {
                intent.removeExtra("story_transition_bundle");
                C1660680tJi.LIZ().LJIIJJI(activityLIZ, intent);
                C1660680tJi.LIZ().LJJIFFI(activityLIZ, intent);
                return false;
            }
            C1688680u2s.LJIJJ(activityLIZ, intent);
            return true;
        }
        throw new IllegalArgumentException("use activity as context to launch record page please");
    }

    @Override // com.ss.android.ugc.aweme.social.creation.api.mediapicker.StoryNavigationService
    public final void startStoryPublish(Activity activity, EnterStoryParam enterStoryParam, TokenCert tokenCert) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C563780M9g c563780M9g = this.LIZJ;
        c563780M9g.getClass();
        if (C522620Kea.LIZ()) {
            RecordTaskManager.LIZ(new C536780L3k(), true);
        }
        c563780M9g.LIZ();
        this.LIZ.LIZ(activity, tokenCert, new AwS409S0200000_8(this, enterStoryParam, 113), new AwS409S0200000_8(this, enterStoryParam, 114), null, false, new C0L6L(this, activity, enterStoryParam, jElapsedRealtime, new AwS252S0300000_8(enterStoryParam, this, activity, 34)));
    }

    @Override // com.ss.android.ugc.aweme.social.creation.api.mediapicker.StoryNavigationService
    public final void requestPermission(Activity activity, EnterStoryParam enterStoryParam, TokenCert tokenCert, Function1<? super Boolean, Unit> function1, Function0<Unit> function0) {
        this.LIZ.LIZ(activity, tokenCert, new AwS409S0200000_8(this, enterStoryParam, 111), new AwS409S0200000_8(this, enterStoryParam, 112), function0, false, new AwS167S0400000_8(enterStoryParam, (EnterStoryParam) this, (C563770M9f) activity, (Activity) function1, (Function1<? super Boolean, Unit>) 4));
    }
}
