package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.live.publicscreen.impl.widget.NewCreatorOnboardingInfoSheetFragment;
import com.bytedance.android.livesdk.adminsetting.LiveAdminSettingDialog;
import com.bytedance.android.livesdk.adminsetting.LiveBlockKeywordsPopUpFragmentSheet;
import com.bytedance.android.livesdk.adminsetting.LiveFilterCommentPopUpFragmentSheet;
import com.bytedance.android.livesdk.adminsetting.LiveMuteRulesQuestionFragmentSheet;
import com.bytedance.android.livesdk.broadcast.preview.EcommerceBlockSheetFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.LiveHighLightRecordGuideSheet;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveCommentBlockUrlSetting;
import com.bytedance.android.livesdk.locationservice.LocationServiceNotionSheet;
import com.bytedance.android.livesdkapi.host.IHostCommerce;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KdM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C521860KdM implements C092O {
    public final int $t;
    public Object l0;

    public static final void accept$11(C521860KdM c521860KdM, Object obj) {
        super/*X.19Dn*/.onNewIntent((Intent) obj);
    }

    public static final void accept$12(C521860KdM c521860KdM, Object obj) {
        super/*com.bytedance.ies.foundation.activity.BaseActivity*/.onSaveInstanceState((Bundle) obj);
    }

    @Override // X.C092O
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                accept$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                accept$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                accept$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                accept$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                accept$13(this, obj);
                break;
        }
    }

    public C521860KdM(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void accept$0(C521860KdM c521860KdM, Object obj) {
        FragmentManager childFragmentManager;
        long jLongValue;
        C0IR5 c0ir5;
        Long l;
        Fragment fragment = ((NewCreatorOnboardingInfoSheetFragment) c521860KdM.l0).LLJLLL;
        if (fragment != null) {
            childFragmentManager = fragment.getChildFragmentManager();
        } else {
            childFragmentManager = null;
        }
        LiveAdminSettingDialog liveAdminSettingDialogVU1 = ((IAdminSettingService) C1161920gLG.LIZJ(IAdminSettingService.class)).vU1(EnumC748580TYa.COMMENT_SETTING);
        if (childFragmentManager != null && liveAdminSettingDialogVU1 != null) {
            liveAdminSettingDialogVU1.show(childFragmentManager, "NewCreatorOnboardingInfoSheetFragment#COMMENT_SETTING");
            C473410IhP.LIZJ(new Runnable() { // from class: X.00kU
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("NewCreatorOnboardingInfoSheetFragment@91b7.onCreateBottomFunction$1$1$1$1");
                    try {
                        C766270U4b.LIZLLL(2131855010);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("NewCreatorOnboardingInfoSheetFragment@91b7.onCreateBottomFunction$1$1$1$1");
                }
            }, 16L);
        }
        NewCreatorOnboardingInfoSheetFragment newCreatorOnboardingInfoSheetFragment = (NewCreatorOnboardingInfoSheetFragment) c521860KdM.l0;
        newCreatorOnboardingInfoSheetFragment.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_onboarding_click");
        DataChannel dataChannel = newCreatorOnboardingInfoSheetFragment.LLJZ;
        if (dataChannel != null && (c0ir5 = (C0IR5) dataChannel.gg0(C1087000eOQ.class)) != null && (l = c0ir5.LIZLLL) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(jLongValue), "user_id");
        c474500IjALIZ.LIZ();
        ((NewCreatorOnboardingInfoSheetFragment) c521860KdM.l0).close(1);
    }

    public static final void accept$1(C521860KdM c521860KdM, Object obj) {
        ((LiveBlockKeywordsPopUpFragmentSheet) c521860KdM.l0).uS("livesdk_comment_keywords_blocking_popup_click_got_it");
        ((LiveBlockKeywordsPopUpFragmentSheet) c521860KdM.l0).close(1);
    }

    public static final void accept$10(C521860KdM c521860KdM, Object obj) {
        super/*androidx.fragment.app.SAFTikTokFragment*/.onSaveInstanceState((Bundle) obj);
    }

    public static final void accept$13(C521860KdM c521860KdM, Object obj) {
        C479740Irc c479740Irc = (C479740Irc) c521860KdM.l0;
        C480030Is5 c480030Is5 = (C480030Is5) obj;
        if (c480030Is5 != null) {
            C0IEG c0ieg = c479740Irc.LJFF;
            if (c0ieg != null) {
                c0ieg.n0(c480030Is5.LIZ);
                return;
            }
            return;
        }
        c479740Irc.getClass();
    }

    public static final void accept$2(C521860KdM c521860KdM, Object obj) {
        ((LiveBlockKeywordsPopUpFragmentSheet) c521860KdM.l0).uS("livesdk_comment_keywords_blocking_popup_click_learn_more");
        IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
        Context context = ((LiveBlockKeywordsPopUpFragmentSheet) c521860KdM.l0).getContext();
        if (context != null) {
            iActionHandlerService.handle(context, LiveCommentBlockUrlSetting.INSTANCE.getValue());
        }
    }

    public static final void accept$3(C521860KdM c521860KdM, Object obj) {
        ((LiveFilterCommentPopUpFragmentSheet) c521860KdM.l0).close(1);
        ((LiveFilterCommentPopUpFragmentSheet) c521860KdM.l0).uS("livesdk_comment_filter_setting_popup_click_got_it");
    }

    public static final void accept$4(C521860KdM c521860KdM, Object obj) {
        ((LiveMuteRulesQuestionFragmentSheet) c521860KdM.l0).close(1);
    }

    public static final void accept$5(C521860KdM c521860KdM, Object obj) {
        ((IHostCommerce) C1161920gLG.LIZJ(IHostCommerce.class)).Gi("Probation", null);
        EcommerceBlockSheetFragment ecommerceBlockSheetFragment = (EcommerceBlockSheetFragment) c521860KdM.l0;
        ecommerceBlockSheetFragment.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_probation_mode_banner_click");
        c474500IjALIZ.LJIJJLI(ecommerceBlockSheetFragment.LLJLLL);
        c474500IjALIZ.LJJII(C0UQX.LIZJ(ecommerceBlockSheetFragment.LLJLLL), "live_entrance_name");
        c474500IjALIZ.LIZ();
        ((EcommerceBlockSheetFragment) c521860KdM.l0).close(1);
    }

    public static final void accept$6(C521860KdM c521860KdM, Object obj) {
        LiveHighLightRecordGuideSheet.uS(((LiveHighLightRecordGuideSheet) c521860KdM.l0).LLJZ, "click", "confirm");
        Function0<Unit> function0 = ((LiveHighLightRecordGuideSheet) c521860KdM.l0).LLJZIJLIL;
        if (function0 != null) {
            function0.invoke();
        }
        ((LiveHighLightRecordGuideSheet) c521860KdM.l0).close(1);
    }

    public static final void accept$7(C521860KdM c521860KdM, Object obj) {
        ((LocationServiceNotionSheet) c521860KdM.l0).close(1);
    }

    public static final void accept$8(C521860KdM c521860KdM, Object obj) {
        super/*androidx.fragment.app.SAFTikTokFragment*/.LLLLIILLL((Bundle) obj);
    }

    public static final void accept$9(C521860KdM c521860KdM, Object obj) {
        super/*androidx.fragment.app.SAFTikTokFragment*/.onRestoreInstanceState((Bundle) obj);
    }
}
