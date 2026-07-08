package X;

import android.view.View;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.dataChannel.AccessRecallVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.BasePreviewWidgetVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.BlockVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.BroadcastPreviewBannerChannel;
import com.bytedance.android.livesdk.dataChannel.ECommerceGrowthTaskChannel;
import com.bytedance.android.livesdk.dataChannel.EffectDialogShowChannel;
import com.bytedance.android.livesdk.dataChannel.GiftDisableVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.GuessEnableChannel;
import com.bytedance.android.livesdk.dataChannel.IncentiveCampaignBannerChannel;
import com.bytedance.android.livesdk.dataChannel.LOPAgeAssuranceNotifyBannerChannel;
import com.bytedance.android.livesdk.dataChannel.LeaveVideoModeVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.LevelupNotifyBannerChannel;
import com.bytedance.android.livesdk.dataChannel.LiveCenterGrowthBannerChannel;
import com.bytedance.android.livesdk.dataChannel.LiveGoalDialogShowChannel;
import com.bytedance.android.livesdk.dataChannel.LiveGoalVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.LiveGrowthMVPBannerChannel;
import com.bytedance.android.livesdk.dataChannel.LiveJourney2BannerChannel;
import com.bytedance.android.livesdk.dataChannel.LiveProNotifyBannerChannel;
import com.bytedance.android.livesdk.dataChannel.LiveSimplifiedVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.LiveStudioTagShowChannel;
import com.bytedance.android.livesdk.dataChannel.MultiCoHostOffliveBannerVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.NewAnchorIncentiveChannel;
import com.bytedance.android.livesdk.dataChannel.PlayTogetherEnableChannel;
import com.bytedance.android.livesdk.dataChannel.PlaybookBannerOthersCanShowChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewMoreLessVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewNonSimpleModeComponentChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewShoppingManageShowChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewTryModeShowChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewViolationVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.ProbationBannerChannel;
import com.bytedance.android.livesdk.dataChannel.ReplayEnableChannel;
import com.bytedance.android.livesdk.dataChannel.ReplayInfluenceBannerChannel;
import com.bytedance.android.livesdk.dataChannel.StickerDialogShowChannel;
import com.bytedance.android.livesdk.dataChannel.StickerHintShowChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0UJg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C770220UJg {
    public static DataChannel LIZIZ;
    public static final C770220UJg LIZ = new C770220UJg();
    public static final Set<C13IQ<? extends BasePreviewWidgetVisibilityChannel>> LIZJ = C13LQ.LJLIIL(new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(ReplayInfluenceBannerChannel.class), C13LE.LIZ(LiveStudioTagShowChannel.class), C13LE.LIZ(AccessRecallVisibilityChannel.class), C13LE.LIZ(ReplayEnableChannel.class), C13LE.LIZ(PlayTogetherEnableChannel.class), C13LE.LIZ(GuessEnableChannel.class), C13LE.LIZ(StickerHintShowChannel.class), C13LE.LIZ(LiveSimplifiedVisibilityChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(LevelupNotifyBannerChannel.class), C13LE.LIZ(LiveGrowthMVPBannerChannel.class), C13LE.LIZ(LiveProNotifyBannerChannel.class), C13LE.LIZ(BroadcastPreviewBannerChannel.class), C13LE.LIZ(PreviewViolationVisibilityChannel.class), C13LE.LIZ(PreviewMoreLessVisibilityChannel.class), C13LE.LIZ(LOPAgeAssuranceNotifyBannerChannel.class), C13LE.LIZ(IncentiveCampaignBannerChannel.class), C13LE.LIZ(LiveCenterGrowthBannerChannel.class), C13LE.LIZ(MultiCoHostOffliveBannerVisibilityChannel.class), C13LE.LIZ(ProbationBannerChannel.class), C13LE.LIZ(NewAnchorIncentiveChannel.class), C13LE.LIZ(LiveJourney2BannerChannel.class), C13LE.LIZ(ECommerceGrowthTaskChannel.class), C13LE.LIZ(LeaveVideoModeVisibilityChannel.class), C13LE.LIZ(PlaybookBannerOthersCanShowChannel.class), C13LE.LIZ(PreviewNonSimpleModeComponentChannel.class), C13LE.LIZ(PreviewShoppingManageShowChannel.class), C13LE.LIZ(PreviewTryModeShowChannel.class), C13LE.LIZ(LiveGoalVisibilityChannel.class), C13LE.LIZ(GiftDisableVisibilityChannel.class)});
    public static final Map<C13IQ<? extends PreviewWidget>, Set<C13IQ<? extends BasePreviewWidgetVisibilityChannel>>> LIZLLL = new LinkedHashMap();
    public static final Map<C13IQ<? extends PreviewWidget>, Boolean> LJ = new LinkedHashMap();

    public static boolean LIZ(C13IQ c13iq) {
        if (C500260Jjc.LJJJI((Boolean) ((LinkedHashMap) LJ).get(c13iq)) && LIZJ(c13iq)) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(C13IQ c13iq) {
        View view;
        PreviewWidget previewWidgetLJFF = C0UKC.LJFF(c13iq);
        if (previewWidgetLJFF != null && (view = previewWidgetLJFF.getView()) != null) {
            C500260Jjc.LJLJLJ(view, LIZ(c13iq));
        }
    }

    public static boolean LIZJ(C13IQ c13iq) {
        Boolean bool;
        boolean z;
        Set<C13IQ> set = (Set) ((LinkedHashMap) LIZLLL).get(c13iq);
        Boolean boolValueOf = null;
        if (set != null) {
            if ((set instanceof Collection) && set.isEmpty()) {
                z = true;
                boolValueOf = Boolean.valueOf(z);
            } else {
                for (C13IQ c13iq2 : set) {
                    DataChannel dataChannel = LIZIZ;
                    if (dataChannel != null) {
                        bool = (Boolean) dataChannel.gg0(C09R7.LIZ(c13iq2));
                    } else {
                        bool = null;
                    }
                    if (!C500260Jjc.LJJJI(bool)) {
                        z = false;
                        break;
                    }
                }
                z = true;
                boolValueOf = Boolean.valueOf(z);
            }
        }
        return C500260Jjc.LJJIJIL(boolValueOf);
    }

    public static void LIZLLL(C19719912Dl c19719912Dl) {
        DataChannel dataChannel = LIZIZ;
        if (dataChannel != null) {
            dataChannel.zW(C09R7.LIZ(c19719912Dl), Boolean.FALSE);
        }
    }

    public static void LJ(C19719912Dl c19719912Dl) {
        DataChannel dataChannel = LIZIZ;
        if (dataChannel != null) {
            dataChannel.zW(C09R7.LIZ(c19719912Dl), Boolean.TRUE);
        }
    }

    public static void LJFF(C13IQ c13iq) {
        View view;
        Boolean boolValueOf;
        PreviewWidget previewWidgetLJFF = C0UKC.LJFF(c13iq);
        if (previewWidgetLJFF != null && (view = previewWidgetLJFF.getView()) != null) {
            C500260Jjc.LJIILIIL(view);
            PreviewWidget previewWidgetLJFF2 = C0UKC.LJFF(c13iq);
            if (previewWidgetLJFF2 != null) {
                boolValueOf = Boolean.valueOf(previewWidgetLJFF2.LLILLJJLI);
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJIFFI(boolValueOf)) {
                return;
            }
            PreviewWidget previewWidgetLJFF3 = C0UKC.LJFF(c13iq);
            if (previewWidgetLJFF3 != null) {
                previewWidgetLJFF3.LLILLJJLI = false;
            }
            PreviewWidget previewWidgetLJFF4 = C0UKC.LJFF(c13iq);
            if (previewWidgetLJFF4 != null) {
                previewWidgetLJFF4.onHide();
            }
        }
    }

    public static boolean LJI(C13IQ c13iq) {
        PreviewWidget previewWidgetLJFF;
        View view;
        PreviewWidget previewWidgetLJFF2 = C0UKC.LJFF(c13iq);
        Boolean boolValueOf = null;
        if (previewWidgetLJFF2 != null && previewWidgetLJFF2.getView() != null && LIZ(c13iq) && (previewWidgetLJFF = C0UKC.LJFF(c13iq)) != null && (view = previewWidgetLJFF.getView()) != null) {
            C500260Jjc.LLFFF(view);
            PreviewWidget previewWidgetLJFF3 = C0UKC.LJFF(c13iq);
            if (previewWidgetLJFF3 != null) {
                boolValueOf = Boolean.valueOf(previewWidgetLJFF3.LLILLJJLI);
            }
            if (!C500260Jjc.LJJJI(boolValueOf)) {
                PreviewWidget previewWidgetLJFF4 = C0UKC.LJFF(c13iq);
                if (previewWidgetLJFF4 != null) {
                    previewWidgetLJFF4.LLILLJJLI = true;
                }
                PreviewWidget previewWidgetLJFF5 = C0UKC.LJFF(c13iq);
                if (previewWidgetLJFF5 != null) {
                    previewWidgetLJFF5.onShow();
                }
            }
        }
        return LIZ(c13iq);
    }
}
