package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.adminsetting.LiveCommercialContentToggleFragmentSheet;
import com.bytedance.android.livesdk.broadcast.PerceptionDialogDismissedChannel;
import com.bytedance.android.livesdk.broadcast.interaction.function.perception.LivePerceptionLiveSheetFragment;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterViolationNumFinallyOptSetting;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Um0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C782020Um0 implements InterfaceC1141530foN {
    public static final /* synthetic */ int LLJIJIL = 0;
    public final Context LL;
    public final DataChannel LLILLJJLI;
    public final LifecycleOwner LLILLL;
    public final Queue<PerceptionMessage> LLILZ;
    public LiveDialog LLILZIL;
    public boolean LLILZLL;
    public C0THQ LLIZ;
    public InterfaceC775230Ub3 LLIZLLLIL;
    public C782120UmA LLJ;
    public boolean LLJI;

    public final void LIZIZ() {
        if (this.LLILZ.isEmpty() || this.LLJI) {
            return;
        }
        PerceptionMessage perceptionMessage = (PerceptionMessage) ((LinkedList) this.LLILZ).poll();
        if (perceptionMessage.sheet != null) {
            DataChannel dataChannel = this.LLILLJJLI;
            if (dataChannel != null) {
                try {
                    dataChannel.SX0(C782100Um8.class, perceptionMessage);
                    FragmentManager fragmentManager = (FragmentManager) this.LLILLJJLI.gg0(C748880TZe.class);
                    SheetOptions sheetOptions = new SheetOptions();
                    sheetOptions.LIZ(2, null);
                    sheetOptions.cornerRadius = 50;
                    sheetOptions.draggable = false;
                    C19322110iZ.LIZLLL(fragmentManager, LivePerceptionLiveSheetFragment.class, "perception_sheet", sheetOptions, null);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        } else {
            LJII(perceptionMessage);
        }
        if (this.LLILZLL) {
            C389001fE.LIZ("violation_record_change", null, System.currentTimeMillis(), false);
        }
    }

    public final void LJIIIIZZ() {
        boolean zLIZ = C758680TpS.LIZ(this.LLILLJJLI);
        boolean zLIZIZ = C758680TpS.LIZIZ(this.LLILLJJLI);
        IAdminSettingService iAdminSettingService = (IAdminSettingService) C1161920gLG.LIZJ(IAdminSettingService.class);
        DataChannel dataChannel = this.LLILLJJLI;
        LiveCommercialContentToggleFragmentSheet liveCommercialContentToggleFragmentSheetP80 = iAdminSettingService.p80(false, true, dataChannel != null ? (LiveMode) dataChannel.gg0(LiveModeChannel.class) : null, zLIZ, zLIZIZ, false);
        if (liveCommercialContentToggleFragmentSheetP80 != null) {
            DataChannel dataChannel2 = this.LLILLJJLI;
            C19322110iZ.LJFF(dataChannel2 != null ? (FragmentManager) dataChannel2.gg0(C748880TZe.class) : null, liveCommercialContentToggleFragmentSheetP80, "live_commercial_content_toggle", null, 0);
        }
    }

    public C782020Um0(Context context) {
        this.LLILZ = new LinkedList();
        this.LL = C1834150xpV.LJIIJJI(context);
        this.LLILLJJLI = null;
        this.LLILLL = null;
    }

    public static boolean LIZ(PerceptionMessage perceptionMessage) {
        PerceptionDialogInfo perceptionDialogInfo = perceptionMessage.dialog;
        if (perceptionDialogInfo != null) {
            if (perceptionDialogInfo.scene == 26) {
                return true;
            }
            if (perceptionDialogInfo.scene == 11 && perceptionDialogInfo.appealPopup == 1) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZJ(PerceptionMessage perceptionMessage) {
        if (perceptionMessage == null || !LiveCenterViolationNumFinallyOptSetting.INSTANCE.isEnable()) {
            return false;
        }
        PerceptionDialogInfo perceptionDialogInfo = perceptionMessage.dialog;
        if ((perceptionDialogInfo == null || 21 != perceptionDialogInfo.scene) && !Intrinsics.LJFF(perceptionMessage.showViolation, Boolean.TRUE)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(com.bytedance.android.livesdk.model.message.PerceptionMessage r8) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C782020Um0.LIZLLL(com.bytedance.android.livesdk.model.message.PerceptionMessage):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:230:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(final com.bytedance.android.livesdk.model.message.PerceptionMessage r29) {
        /*
            Method dump skipped, instruction units count: 1081
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C782020Um0.LJII(com.bytedance.android.livesdk.model.message.PerceptionMessage):void");
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        if (Intrinsics.LJFF(c262100zr.LIZ, "live_anchor_center_mask_will_appear")) {
            this.LLILZLL = true;
        } else {
            if (!Intrinsics.LJFF(c262100zr.LIZ, "live_anchor_center_mask_will_disappear")) {
                return;
            }
            this.LLILZLL = false;
        }
    }

    public final void LJFF(String str, PunishEventInfo punishEventInfo) {
        if (this.LLILLJJLI != null && punishEventInfo != null) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_violation_popup_feedback");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJ(str);
            c474500IjALIZ.LJJII(punishEventInfo.punishType, "violation_type");
            c474500IjALIZ.LJJII(punishEventInfo.punishId, "record_id");
            c474500IjALIZ.LIZ();
        }
    }

    public C782020Um0(Context context, BaseFragment baseFragment, DataChannel dataChannel) {
        this.LLILZ = new LinkedList();
        this.LL = C1834150xpV.LJIIJJI(context);
        this.LLILLJJLI = dataChannel;
        this.LLILLL = baseFragment;
        C1548820qPI.LIZLLL("live_anchor_center_mask_will_appear", this);
        C1548820qPI.LIZLLL("live_anchor_center_mask_will_disappear", this);
        if (dataChannel != null) {
            dataChannel.BQ2(baseFragment, PerceptionDialogDismissedChannel.class, new AwS591S0100000_12(this, 177));
        }
    }

    public final void LJ(PerceptionMessage perceptionMessage, String str, String str2) {
        PunishEventInfo punishEventInfo;
        Room room;
        String str3;
        String str4;
        Long lValueOf;
        String str5;
        PerceptionDialogInfo perceptionDialogInfo;
        User owner;
        Long lValueOf2 = null;
        if (perceptionMessage != null) {
            punishEventInfo = perceptionMessage.publicEventInfo;
        } else {
            punishEventInfo = null;
        }
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_appeal_popup");
        if (punishEventInfo != null) {
            str3 = punishEventInfo.punishType;
        } else {
            str3 = null;
        }
        c474500IjALIZ.LJJII(str3, "violation_type");
        if (punishEventInfo != null) {
            str4 = punishEventInfo.punishId;
        } else {
            str4 = null;
        }
        c474500IjALIZ.LJJII(str4, "record_id");
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "room_id");
        if (room != null && (owner = room.getOwner()) != null) {
            lValueOf2 = Long.valueOf(owner.getId());
        }
        c474500IjALIZ.LJJII(lValueOf2, "anchor_id");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(str2, "click_tab");
        if (perceptionMessage != null && (perceptionDialogInfo = perceptionMessage.dialog) != null && perceptionDialogInfo.scene == 12) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str5, "appeal_result");
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(java.lang.String r12, java.lang.String r13, com.bytedance.android.livesdk.model.message.PunishEventInfo r14, com.bytedance.android.livesdk.model.message.PerceptionDialogInfo r15) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C782020Um0.LJI(java.lang.String, java.lang.String, com.bytedance.android.livesdk.model.message.PunishEventInfo, com.bytedance.android.livesdk.model.message.PerceptionDialogInfo):void");
    }
}
