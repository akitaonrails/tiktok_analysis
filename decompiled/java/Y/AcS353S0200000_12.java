package Y;

import X.C0IJT;
import X.C0UNN;
import X.C0UOS;
import X.C0UQ2;
import X.C0UQX;
import X.C0URD;
import X.C1161920gLG;
import X.C189200o6;
import X.C19322110iZ;
import X.C20743716Ff;
import X.C474500IjA;
import X.C475510Ikn;
import X.C500840JkY;
import X.C748880TZe;
import X.C752880Tg6;
import X.C758060ToS;
import X.C758680TpS;
import X.C772170UQt;
import X.InterfaceC1106030et7;
import X.InterfaceC1364105Vn;
import X.InterfaceC743640TFa;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.model.PopMsgContainer;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.adminsetting.LiveCommercialContentToggleFragmentSheet;
import com.bytedance.android.livesdk.broadcast.ShouldDoubleCheckSafetyEducationStatus;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSafetyEducationSchema;
import com.bytedance.android.livesdk.moderator.removeself.ModeratorHostIModeratorListFragment;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public class AcS353S0200000_12 implements InterfaceC743640TFa {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC743640TFa
    public final void LIZ(LiveDialog liveDialog) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, liveDialog);
                break;
            case 1:
                LIZ$1(this, liveDialog);
                break;
            case 2:
                LIZ$2(this, liveDialog);
                break;
            case 3:
                LIZ$3(this, liveDialog);
                break;
            case 4:
                LIZ$4(this, liveDialog);
                break;
            case 5:
                LIZ$5(this, liveDialog);
                break;
            case 6:
                LIZ$6(this, liveDialog);
                break;
            case 7:
                LIZ$7(this, liveDialog);
                break;
            case 8:
                LIZ$8(this, liveDialog);
                break;
        }
    }

    public static final void LIZ$0(AcS353S0200000_12 acS353S0200000_12, LiveDialog liveDialog) {
        ACListenerS116S0200000_12.LIZ$0((C752880Tg6) acS353S0200000_12.l1, (User) acS353S0200000_12.l0, "click_remove");
        C752880Tg6.I5((User) acS353S0200000_12.l0, (C752880Tg6) acS353S0200000_12.l1);
        liveDialog.dismiss();
    }

    public static final void LIZ$1(AcS353S0200000_12 acS353S0200000_12, LiveDialog liveDialog) {
        ACListenerS116S0200000_12.LIZ$0((C752880Tg6) acS353S0200000_12.l0, (User) acS353S0200000_12.l1, "click_cancel");
        liveDialog.dismiss();
    }

    public static final void LIZ$2(AcS353S0200000_12 acS353S0200000_12, LiveDialog liveDialog) {
        long id;
        Room room;
        ((ModeratorHostIModeratorListFragment) acS353S0200000_12.l0).OR("confirm");
        ModeratorHostIModeratorListFragment moderatorHostIModeratorListFragment = (ModeratorHostIModeratorListFragment) acS353S0200000_12.l0;
        User user = (User) acS353S0200000_12.l1;
        moderatorHostIModeratorListFragment.getClass();
        DataChannel dataChannelLJ = C475510Ikn.LJ(moderatorHostIModeratorListFragment);
        if (dataChannelLJ != null && (room = (Room) dataChannelLJ.gg0(RoomChannel.class)) != null) {
            id = room.getId();
        } else {
            id = -1;
        }
        ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).Ag2(user.getId(), id, moderatorHostIModeratorListFragment.LLIZ);
        liveDialog.dismiss();
    }

    public static final void LIZ$3(AcS353S0200000_12 acS353S0200000_12, LiveDialog liveDialog) {
        String str;
        liveDialog.dismiss();
        boolean z = C0URD.LJ;
        C0UQ2.LIZ().LIZJ();
        C0UOS c0uos = C0UOS.LIZ;
        DataChannel dataChannel = (DataChannel) acS353S0200000_12.l0;
        List<String> list = ((PopMsgContainer) acS353S0200000_12.l1).buttonContent;
        if (list != null) {
            str = (String) ListProtector.get(list, 0);
        } else {
            str = null;
        }
        c0uos.getClass();
        C0UOS.LIZIZ(dataChannel, str);
    }

    public static final void LIZ$4(AcS353S0200000_12 acS353S0200000_12, LiveDialog liveDialog) {
        String str;
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle((Context) acS353S0200000_12.l0, LiveSafetyEducationSchema.INSTANCE.getValue());
        ((DataChannel) acS353S0200000_12.l1).zW(ShouldDoubleCheckSafetyEducationStatus.class, Boolean.TRUE);
        DataChannel dataChannel = (DataChannel) acS353S0200000_12.l1;
        LiveMode liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class);
        if (liveMode == null || (str = liveMode.logStreamingType) == null) {
            str = LiveMode.VIDEO.logStreamingType;
        }
        C0UQX.LJJIIZ(dataChannel, "verify", str);
        liveDialog.dismiss();
    }

    public static final void LIZ$5(AcS353S0200000_12 acS353S0200000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        C772170UQt.LIZ.getClass();
        C772170UQt.LIZ();
        ((Function0) acS353S0200000_12.l0).invoke();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_takepage_exit_event_popup_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII("cancel", "click_area");
        c474500IjALIZ.LJJII(((DataChannel) acS353S0200000_12.l1).gg0(C0UNN.class), "enter_from");
        c474500IjALIZ.LIZ();
    }

    public static final void LIZ$6(AcS353S0200000_12 acS353S0200000_12, LiveDialog liveDialog) {
        ((BasePreviewSettingMainFragmentSheetInitializer) acS353S0200000_12.l0).LLJ = true;
        C20743716Ff c20743716Ff = (C20743716Ff) acS353S0200000_12.l1;
        if (c20743716Ff != null) {
            c20743716Ff.setChecked(InterfaceC1106030et7.v6.LIZIZ().booleanValue());
        }
        liveDialog.dismiss();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_caption_off_popup");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(((BasePreviewSettingMainFragmentSheetInitializer) acS353S0200000_12.l0).LIZIZ());
        c474500IjALIZ.LJ("cancel");
        c474500IjALIZ.LIZ();
    }

    public static final void LIZ$7(AcS353S0200000_12 acS353S0200000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) acS353S0200000_12.l0;
        Boolean bool = Boolean.FALSE;
        C189200o6.m2constructorimpl(bool);
        interfaceC1364105Vn.resumeWith(bool);
        C758060ToS.LIZIZ(((C500840JkY) acS353S0200000_12.l1).LIZIZ, "click_go_live");
    }

    public static final void LIZ$8(AcS353S0200000_12 acS353S0200000_12, LiveDialog liveDialog) {
        LiveMode liveMode;
        FragmentManager fragmentManager;
        liveDialog.dismiss();
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) acS353S0200000_12.l0;
        Boolean bool = Boolean.TRUE;
        C189200o6.m2constructorimpl(bool);
        interfaceC1364105Vn.resumeWith(bool);
        C758060ToS.LIZIZ(((C500840JkY) acS353S0200000_12.l1).LIZIZ, "click_remove");
        IAdminSettingService iAdminSettingService = (IAdminSettingService) C1161920gLG.LIZJ(IAdminSettingService.class);
        DataChannel dataChannel = ((C500840JkY) acS353S0200000_12.l1).LIZIZ;
        if (dataChannel != null) {
            liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class);
        } else {
            liveMode = null;
        }
        LiveCommercialContentToggleFragmentSheet liveCommercialContentToggleFragmentSheetP80 = iAdminSettingService.p80(true, false, liveMode, C758680TpS.LIZ(((C500840JkY) acS353S0200000_12.l1).LIZIZ), C758680TpS.LIZIZ(((C500840JkY) acS353S0200000_12.l1).LIZIZ), false);
        if (liveCommercialContentToggleFragmentSheetP80 != null) {
            DataChannel dataChannel2 = ((C500840JkY) acS353S0200000_12.l1).LIZIZ;
            if (dataChannel2 != null) {
                fragmentManager = (FragmentManager) dataChannel2.gg0(C748880TZe.class);
            } else {
                fragmentManager = null;
            }
            C19322110iZ.LJFF(fragmentManager, liveCommercialContentToggleFragmentSheetP80, "live_commercial_content_toggle", null, 0);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AcS353S0200000_12(com.bytedance.android.live.base.model.user.User r2, X.C752880Tg6 r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            if (r4 == 0) goto Ld
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        L9:
            r0.<init>()
            return
        Ld:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AcS353S0200000_12.<init>(com.bytedance.android.live.base.model.user.User, X.0Tg6, int):void");
    }

    public AcS353S0200000_12(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
