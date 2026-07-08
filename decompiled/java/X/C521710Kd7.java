package X;

import android.widget.CompoundButton;
import com.bytedance.android.live.aireply.IAIReplyAnchorManagerService;
import com.bytedance.android.livesdk.broadcast.OptOutGiftGalleryChannel;
import com.bytedance.android.livesdk.broadcast.aireply.LiveAIReplySettingFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer;
import com.bytedance.android.livesdk.ultralitemode.LiveAdaptiveLiteModeDialog;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livestrategy.ILiveFeatureCenterService;
import com.bytedance.android.performanhtune.IPTFService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.ui.SubUpdowngradePackageFragment;
import com.ss.android.ugc.aweme.tools.draft.DraftSettingFragment;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0Kd7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C521710Kd7 implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                break;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                break;
            case 2:
                onCheckedChanged$2(this, compoundButton, z);
                break;
            case 3:
                onCheckedChanged$3(this, compoundButton, z);
                break;
            case 4:
                onCheckedChanged$4(this, compoundButton, z);
                break;
            case 5:
                onCheckedChanged$5(this, compoundButton, z);
                break;
        }
    }

    public C521710Kd7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCheckedChanged$0(C521710Kd7 c521710Kd7, CompoundButton compoundButton, boolean z) {
        String str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_ai_reply_switch");
        c474500IjALIZ.LJIIIIZZ();
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        c474500IjALIZ.LJJII(str, "to_status");
        c474500IjALIZ.LIZ();
        IAIReplyAnchorManagerService.Companion.getClass();
        if (C445870He5.LIZ().updateSwitchState(C475510Ikn.LJ((LiveAIReplySettingFragment) c521710Kd7.l0), z)) {
            if (z) {
                C500260Jjc.LLFFF(((LiveAIReplySettingFragment) c521710Kd7.l0).wS());
            } else {
                C500260Jjc.LJIILIIL(((LiveAIReplySettingFragment) c521710Kd7.l0).wS());
            }
        }
    }

    public static final void onCheckedChanged$1(C521710Kd7 c521710Kd7, CompoundButton compoundButton, boolean z) {
        Object obj;
        String str;
        EnumC480200IsM enumC480200IsM;
        LiveAdaptiveLiteModeDialog liveAdaptiveLiteModeDialog = (LiveAdaptiveLiteModeDialog) c521710Kd7.l0;
        liveAdaptiveLiteModeDialog.getClass();
        String str2 = liveAdaptiveLiteModeDialog.LLILLJJLI;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_lite_mode_event");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str3 = "on";
        if (z) {
            obj = "on";
        } else {
            obj = "off";
        }
        linkedHashMap.put("panel_click", obj);
        linkedHashMap.put("panel_show_from", str2);
        if (!z) {
            str3 = "off";
        }
        linkedHashMap.put("toggle_status", str3);
        linkedHashMap.put("status_change_source", "manual");
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
        ILiveFeatureCenterService iLiveFeatureCenterService = (ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class);
        C0J0Q c0j0q = C0J0Q.APP;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        iLiveFeatureCenterService.bg(c0j0q, "ultra_lite_mode", str, "live_mode_setting", true);
        IPTFService iPTFService = (IPTFService) C1161920gLG.LIZJ(IPTFService.class);
        if (z) {
            enumC480200IsM = EnumC480200IsM.ULTRA_FAST_MODE_ON;
        } else {
            enumC480200IsM = EnumC480200IsM.ULTRA_FAST_MODE_OFF;
        }
        iPTFService.S5(enumC480200IsM);
    }

    public static final void onCheckedChanged$2(C521710Kd7 c521710Kd7, CompoundButton compoundButton, boolean z) {
        String str;
        long jLongValue;
        C0IR5 c0ir5;
        Long l;
        C20743716Ff c20743716FfUR = ((BasePreviewSettingMainFragment) c521710Kd7.l0).UR();
        if (c20743716FfUR != null) {
            c20743716FfUR.setChecked(z);
        }
        InterfaceC772190UQv.O3.LIZJ(Boolean.valueOf(z));
        BasePreviewSettingMainFragment basePreviewSettingMainFragment = (BasePreviewSettingMainFragment) c521710Kd7.l0;
        basePreviewSettingMainFragment.getClass();
        String strCurrentRegionCode = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).currentRegionCode();
        DataChannel dataChannelLJ = C475510Ikn.LJ(basePreviewSettingMainFragment);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("live_aigc_toggle");
        c474500IjALIZ.LJIJJLI(dataChannelLJ);
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis()), "timestamp");
        c474500IjALIZ.LJJII("before", "enter_type");
        c474500IjALIZ.LJJII(strCurrentRegionCode, "country_code");
        if (dataChannelLJ != null && (c0ir5 = (C0IR5) dataChannelLJ.gg0(C1087000eOQ.class)) != null && (l = c0ir5.LIZLLL) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(jLongValue), "user_id");
        c474500IjALIZ.LIZ();
    }

    public static final void onCheckedChanged$3(C521710Kd7 c521710Kd7, CompoundButton compoundButton, boolean z) {
        String str;
        DataChannel dataChannel = ((BasePreviewSettingMainFragmentSheetInitializer) c521710Kd7.l0).LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zW(OptOutGiftGalleryChannel.class, Boolean.valueOf(!z));
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_gallery_setting_toggle");
        c474500IjALIZ.LJJII(((BasePreviewSettingMainFragmentSheetInitializer) c521710Kd7.l0).LJ(), "anchor_id");
        if (z) {
            str = "toggle_on";
        } else {
            str = "toggle_off";
        }
        c474500IjALIZ.LJJII(str, "toggle_status");
        c474500IjALIZ.LIZ();
    }

    public static final void onCheckedChanged$4(C521710Kd7 c521710Kd7, CompoundButton compoundButton, boolean z) {
        ((SubUpdowngradePackageFragment) c521710Kd7.l0).LLJL = z;
    }

    public static final void onCheckedChanged$5(C521710Kd7 c521710Kd7, CompoundButton compoundButton, boolean z) {
        String str;
        C499180Jhs.LIZJ.storeBoolean("posted_draft_status", z);
        C497720JfW c497720JfW = C497720JfW.LIZ;
        DraftSettingFragment draftSettingFragment = (DraftSettingFragment) c521710Kd7.l0;
        String str2 = draftSettingFragment.LL;
        String str3 = null;
        if (str2 == null) {
            str2 = null;
        }
        String str4 = draftSettingFragment.LLILLJJLI;
        if (str4 != null) {
            str3 = str4;
        }
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        c497720JfW.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C497720JfW.LIZ(str2, str3, linkedHashMap);
        linkedHashMap.put("to_status", str);
        C20684815ws.LJIILLIIL("change_posted_draft_toggle", linkedHashMap);
    }
}
