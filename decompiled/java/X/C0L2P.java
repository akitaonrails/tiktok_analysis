package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.adaptation.ab.SocialVideoEditPushInSAFTikTokActivityConfig;
import com.ss.android.ugc.aweme.adaptation.ab.SocialVideoEditPushInSAFTikTokActivityRule;
import com.ss.android.ugc.aweme.adaptation.ab.SocialVideoEditPushLaunchParams;
import com.ss.android.ugc.aweme.creative.model.CommonMobParamModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: X.0L2P, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L2P {
    public static final C0L2P LIZ = new C0L2P();
    public static final SocialVideoEditPushInSAFTikTokActivityConfig LIZIZ = new SocialVideoEditPushInSAFTikTokActivityConfig(false, null, 3, null);

    public static final boolean LIZ(Bundle bundle) {
        String str;
        CreativeModel creativeModel;
        CommonMobParamModel commonMobParamModel;
        ShortVideoContext shortVideoContext;
        String string = bundle.getString("shoot_way");
        String string2 = bundle.getString("enter_method");
        String shootEnterFrom = null;
        if (string2 == null && (((shortVideoContext = (ShortVideoContext) bundle.getParcelable("key_short_video_context")) == null || (string2 = shortVideoContext.enterMethod) == null) && (string2 = C0MUK.LIZJ(bundle).commonMobModel.shootEnterMethod) == null && (string2 = C0MUK.LIZJ(bundle).eventData.shootEnterMethod) == null)) {
            string2 = bundle.getString("enter_edit_page_method");
        }
        String string3 = bundle.getString("shoot_enter_from");
        if (string3 == null) {
            ShortVideoContext shortVideoContext2 = (ShortVideoContext) bundle.getParcelable("key_short_video_context");
            if ((shortVideoContext2 == null || (creativeModel = shortVideoContext2.creativeModel) == null || (commonMobParamModel = creativeModel.commonMobModel) == null || (str = commonMobParamModel.shootEnterFrom) == null) && (str = C0MUK.LIZJ(bundle).commonMobModel.shootEnterFrom) == null) {
                ShootExtraData shootExtraData = C0MUK.LIZJ(bundle).creativeFlowData.getShootExtraData();
                if (shootExtraData != null) {
                    shootEnterFrom = shootExtraData.getShootEnterFrom();
                }
            } else {
                shootEnterFrom = str;
            }
        } else {
            shootEnterFrom = string3;
        }
        return LIZIZ(new SocialVideoEditPushLaunchParams(string, string2, shootEnterFrom));
    }

    public static final boolean LIZIZ(SocialVideoEditPushLaunchParams socialVideoEditPushLaunchParams) {
        LIZ.getClass();
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        SocialVideoEditPushInSAFTikTokActivityConfig socialVideoEditPushInSAFTikTokActivityConfig = LIZIZ;
        SocialVideoEditPushInSAFTikTokActivityConfig socialVideoEditPushInSAFTikTokActivityConfig2 = (SocialVideoEditPushInSAFTikTokActivityConfig) c0c64LJIILLIIL.LJJII(SocialVideoEditPushInSAFTikTokActivityConfig.class, socialVideoEditPushInSAFTikTokActivityConfig, "social_video_edit_push_in_saf_tiktok_activity", true);
        if (socialVideoEditPushInSAFTikTokActivityConfig2 != null) {
            socialVideoEditPushInSAFTikTokActivityConfig = socialVideoEditPushInSAFTikTokActivityConfig2;
        }
        if (socialVideoEditPushInSAFTikTokActivityConfig.enable && !socialVideoEditPushInSAFTikTokActivityConfig.rules.isEmpty()) {
            List<SocialVideoEditPushInSAFTikTokActivityRule> list = socialVideoEditPushInSAFTikTokActivityConfig.rules;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            for (SocialVideoEditPushInSAFTikTokActivityRule socialVideoEditPushInSAFTikTokActivityRule : list) {
                if (C1237204sk.LIZ(socialVideoEditPushInSAFTikTokActivityRule.shootWay, socialVideoEditPushLaunchParams.shootWay) && C1237204sk.LIZ(socialVideoEditPushInSAFTikTokActivityRule.enterMethod, socialVideoEditPushLaunchParams.enterMethod) && C1237204sk.LIZ(socialVideoEditPushInSAFTikTokActivityRule.shootEnterFrom, socialVideoEditPushLaunchParams.shootEnterFrom)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
