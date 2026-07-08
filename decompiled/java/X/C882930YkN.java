package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.utils.IIMMsgUtilService;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import com.ss.android.ugc.tools.IAiChatFeatureService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YkN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C882930YkN {
    public static IIMMsgUtilService LIZ() {
        return C876800YaU.LIZJ.getValue();
    }

    public static String LIZIZ(C879180YeK c879180YeK) {
        String scene;
        IAiChatFeatureService iAiChatFeatureService;
        InterfaceC876790YaT interfaceC876790YaTLJII;
        String strLIZLLL;
        if (c879180YeK.LIZIZ()) {
            return "im_message_request";
        }
        if (LIZ().LJIIIZ(c879180YeK.LIZLLL)) {
            return "tag_video";
        }
        if (LIZ().LJII(c879180YeK.LIZLLL)) {
            return "mention_video";
        }
        if (LIZ().LJIILIIL(c879180YeK.LIZLLL)) {
            return "tag_mention_video";
        }
        if (LIZ().LJIIJ(c879180YeK.LIZLLL)) {
            return "mention_story";
        }
        if (LIZ().LJIIL(c879180YeK.LIZLLL)) {
            return "add_story_to_story";
        }
        if (LIZ().LJIIJJI(c879180YeK.LIZLLL)) {
            return "click_add_post_to_story";
        }
        C869590Y9l c869590Y9l = c879180YeK.LIZLLL;
        if (c869590Y9l != null) {
            IStreakService.LJJIIZ.getClass();
            if (C06LY.LIZ().m(c869590Y9l)) {
                return "inner_streak_restore_reminder";
            }
        }
        C869590Y9l c869590Y9l2 = c879180YeK.LIZLLL;
        String scene2 = null;
        if (c869590Y9l2 != null) {
            scene = c869590Y9l2.getScene();
        } else {
            scene = null;
        }
        if (Intrinsics.LJFF(scene, "streak_pet_waiting_remind")) {
            return "inner_streak_waiting_reminder";
        }
        C869590Y9l c869590Y9l3 = c879180YeK.LIZLLL;
        if (c869590Y9l3 != null) {
            scene2 = c869590Y9l3.getScene();
        }
        if (Intrinsics.LJFF(scene2, "streak_pet_unlock_remind")) {
            return "inner_streak_unlocking_reminder";
        }
        C869590Y9l c869590Y9l4 = c879180YeK.LIZLLL;
        if (c869590Y9l4 != null && C0ZTJ.LIZJ(c869590Y9l4)) {
            return "group_shot_invite";
        }
        C869590Y9l c869590Y9l5 = c879180YeK.LIZLLL;
        if (c869590Y9l5 != null && C0ZTJ.LIZLLL(c869590Y9l5)) {
            return "game_battle";
        }
        C869590Y9l c869590Y9l6 = c879180YeK.LIZLLL;
        if (c869590Y9l6 != null && C876780YaS.LIZ(c869590Y9l6) && (iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null)) != null && (interfaceC876790YaTLJII = iAiChatFeatureService.LJII()) != null && (strLIZLLL = interfaceC876790YaTLJII.LIZLLL(c879180YeK.LIZLLL)) != null) {
            return strLIZLLL;
        }
        return "click_push_im";
    }
}
