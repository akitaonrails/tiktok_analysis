package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.gift.IGiftReminderService;
import com.bytedance.android.livesdk.adminsetting.LiveAISummaryFragment;
import com.bytedance.android.livesdk.adminsetting.LiveCommentAddBlockKeywordsOptFragment;
import com.bytedance.android.livesdk.adminsetting.LiveCommentBlockKeywordsOptFragment;
import com.bytedance.android.livesdk.adminsetting.LiveManageListFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.LiveLocationScopeSettingFragment;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.markviewer.AddMarkedViewerFragmentSheet;
import com.bytedance.android.livesdk.markviewer.MarkedViewerListFragmentSheet;
import com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0TYU, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TYU {
    public final String LIZ;
    public final DataChannel LIZIZ;
    public final Function0<Unit> LIZJ;
    public final C01GW LIZLLL = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(3));
    public final C01GW LJ = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(4));
    public final C01GW LJFF = C292401Bi.LIZ(new AwS556S0100000_12(this, 3));
    public final C01GW LJI = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(2));
    public final C01GW LJII = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(1));
    public final C01GW LJIIIIZZ = C292401Bi.LIZ(new AwS556S0100000_12(this, 4));
    public final C01GW LJIIIZ = C292401Bi.LIZ(new AwS556S0100000_12(this, 1));
    public final C01GW LJIIJ = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(5));
    public final C01GW LJIIJJI = C292401Bi.LIZ(AFwS193S0000000_7.get$arr$(0));
    public final Fragment LJIIL = ((IGiftReminderService) C1161920gLG.LIZJ(IGiftReminderService.class)).WD1(1);
    public final C01GW LJIILIIL = C292401Bi.LIZ(new AwS556S0100000_12(this, 5));

    public final Fragment LIZ(EnumC748580TYa enumC748580TYa) {
        switch (C0TYZ.LIZ[enumC748580TYa.ordinal()]) {
            case 1:
                return (Fragment) this.LIZLLL.getValue();
            case 2:
                return (Fragment) this.LJIIIIZZ.getValue();
            case 3:
                return (Fragment) this.LJFF.getValue();
            case 4:
                return (Fragment) this.LJI.getValue();
            case 5:
                return ((IAdminSettingService) C1161920gLG.LIZJ(IAdminSettingService.class)).eu2();
            case 6:
                return (Fragment) this.LJII.getValue();
            case 7:
                return new LiveCommentBlockKeywordsOptFragment(null);
            case 8:
                return new LiveCommentAddBlockKeywordsOptFragment(null);
            case BdTuring.TYPE_ECAF /* 9 */:
                return (Fragment) this.LJIIJ.getValue();
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return (Fragment) this.LJIIIZ.getValue();
            case BdTuring.TYPE_EMAIL /* 11 */:
                LiveManageListFragment liveManageListFragment = (LiveManageListFragment) this.LJ.getValue();
                liveManageListFragment.LLJ = 2;
                return liveManageListFragment;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LiveManageListFragment liveManageListFragment2 = (LiveManageListFragment) this.LJ.getValue();
                liveManageListFragment2.LLJ = 3;
                return liveManageListFragment2;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return (Fragment) this.LJIILIIL.getValue();
            case 14:
                return this.LJIIL;
            case 15:
                return (Fragment) this.LJIIJJI.getValue();
            case 16:
                return new ModeratorPermissionEditFragment();
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return new LiveAISummaryFragment();
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).createAIReplySettingFragment("");
            case 19:
                MarkedViewerListFragmentSheet markedViewerListFragmentSheet = new MarkedViewerListFragmentSheet();
                Bundle bundle = new Bundle();
                bundle.putBoolean("com.bytedance.android.live.design.view.sheet.SHOWS_SHEET", false);
                markedViewerListFragmentSheet.setArguments(bundle);
                return markedViewerListFragmentSheet;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                AddMarkedViewerFragmentSheet addMarkedViewerFragmentSheet = new AddMarkedViewerFragmentSheet();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("com.bytedance.android.live.design.view.sheet.SHOWS_SHEET", false);
                addMarkedViewerFragmentSheet.setArguments(bundle2);
                return addMarkedViewerFragmentSheet;
            case 21:
                return new LiveLocationScopeSettingFragment();
            case 22:
                this.LIZJ.invoke();
                return null;
            default:
                return null;
        }
    }

    public C0TYU(DataChannel dataChannel, String str, Function0 function0) {
        this.LIZ = str;
        this.LIZIZ = dataChannel;
        this.LIZJ = function0;
    }
}
