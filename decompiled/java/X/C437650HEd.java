package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.socialavatar.experiment.SAEffectSettingResponse;

/* JADX INFO: renamed from: X.0HEd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C437650HEd {
    public static final SAEffectSettingResponse LIZ = new SAEffectSettingResponse("https://sf16-va.tiktokcdn.com/obj/eden-va2/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/social_avatar_intro_sheet/effect_hero_header_image_dark.webp", "https://sf16-va.tiktokcdn.com/obj/eden-va2/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/social_avatar_intro_sheet/effect_hero_header_image_light.webp", "https://sf16-va.tiktokcdn.com/obj/eden-va2/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/social_avatar_intro_sheet/avatar_effect_placeholder.webp", "https://sf16-va.tiktokcdn.com/obj/eden-va2/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/social_avatar_intro_sheet/effect_hexagon_background_dark.webp", "https://sf16-va.tiktokcdn.com/obj/eden-va2/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/social_avatar_intro_sheet/effect_hexagon_background_light.webp", "https://sf16-va.tiktokcdn.com/obj/eden-va2/zalzzh_yhahch_shpjvz/ljhwZthlaukjlkulzlp/social_avatar_intro_sheet/effect_hexagon_mask.webp", 1, "3840318771", "7605722708004835857");

    public static SAEffectSettingResponse LIZ() {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            SAEffectSettingResponse sAEffectSettingResponse = LIZ;
            SAEffectSettingResponse sAEffectSettingResponse2 = (SAEffectSettingResponse) settingsManagerLIZLLL.LJIIIIZZ("social_avatar_effect_generation_settings", SAEffectSettingResponse.class, sAEffectSettingResponse);
            return sAEffectSettingResponse2 != null ? sAEffectSettingResponse2 : sAEffectSettingResponse;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return LIZ;
        }
    }
}
