package X;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.LiveBaseFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.MultiGuestLiveSettingDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.guestinvite.MultiGuestApplySheetForGuestInvite;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.apply.guest.MultiGuestFollowAndApplyDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.guest.MultiGuestV3GuestBeInvitedDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.guest.MultiGuestV3OuterSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.linkmicmatch.fragment.BaseMultiGuestLinkMicMatchFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.guest.MultiLiveGuestUserInfoDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.ui.DismissListenerProxy;
import com.bytedance.android.live.liveinteract.multiguestv3.util.MultiGuestDialogManager;
import com.bytedance.android.live.uikit.setting.LiveSheetMigrationMultiWatchLinkedMicSetting;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS129S1100000_15;

/* JADX INFO: renamed from: X.0aIy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C929860aIy {
    public static final C929860aIy LIZ = new C929860aIy();
    public static final HashMap<String, Long> LIZIZ = new HashMap<>();

    public static void LIZIZ() {
        HashMap<String, Long> map = LIZIZ;
        Long l = map.get("multi_guest_apply_preview");
        long jLongValue = l != null ? l.longValue() : -1L;
        if (C464790IKn.LIZ.LIZIZ(jLongValue)) {
            C19322110iZ.LIZ(jLongValue);
            map.remove("multi_guest_apply_preview");
        }
    }

    public static boolean LJII() {
        if (!C925790aCP.LIZ()) {
            return false;
        }
        Long l = LIZIZ.get("multi_guest_apply_preview");
        return C464790IKn.LIZ.LIZIZ(l != null ? l.longValue() : 0L);
    }

    public static boolean LJIIIIZZ() {
        return C781520UlC.LJFF(PlaybookUtilKt.LJJIII());
    }

    public static boolean LJI(MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog) {
        long jLongValue;
        if (LJII()) {
            return true;
        }
        if (multiLiveGuestUserInfoDialog == null) {
            return false;
        }
        if (LiveSheetMigrationMultiWatchLinkedMicSetting.INSTANCE.enable(LJIIIIZZ())) {
            Long l = LIZIZ.get("multi_guest_apply_preview");
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            return C464790IKn.LIZ.LIZIZ(jLongValue);
        }
        return multiLiveGuestUserInfoDialog.isShowing();
    }

    public final void LIZ(MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog) {
        if (LJII()) {
            LIZIZ();
        }
        if (multiLiveGuestUserInfoDialog == null) {
            return;
        }
        if (LiveSheetMigrationMultiWatchLinkedMicSetting.INSTANCE.enable(LJIIIIZZ())) {
            LIZIZ();
        } else {
            multiLiveGuestUserInfoDialog.dismiss();
            LJIIIZ(this, "multi_watch_linkedmic", true);
        }
    }

    public final void LIZJ(MultiGuestV3GuestBeInvitedDialog multiGuestV3GuestBeInvitedDialog) {
        long jLongValue;
        if (LiveSheetMigrationMultiWatchLinkedMicSetting.INSTANCE.enable(LJIIIIZZ())) {
            HashMap<String, Long> map = LIZIZ;
            Long l = map.get("multi_guest_be_invited");
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = -1;
            }
            C19322110iZ.LIZ(jLongValue);
            map.remove("multi_guest_be_invited");
            if (multiGuestV3GuestBeInvitedDialog != null) {
                multiGuestV3GuestBeInvitedDialog.MR();
                return;
            }
            return;
        }
        if (multiGuestV3GuestBeInvitedDialog != null) {
            multiGuestV3GuestBeInvitedDialog.dismiss();
        }
        LJIIIZ(this, "multi_guest_be_invited", false);
    }

    public final void LIZLLL(MultiGuestLiveSettingDialog multiGuestLiveSettingDialog) {
        long jLongValue;
        if (LiveSheetMigrationMultiWatchLinkedMicSetting.INSTANCE.enable(LJIIIIZZ())) {
            HashMap<String, Long> map = LIZIZ;
            Long l = map.get("multi_guest_distribute");
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = -1;
            }
            if (C464790IKn.LIZ.LIZIZ(jLongValue)) {
                C19322110iZ.LIZ(jLongValue);
                map.remove("multi_guest_distribute");
                return;
            }
            return;
        }
        MultiGuestDialogManager multiGuestDialogManagerLIZ = C922410a6x.LIZ();
        if (multiGuestDialogManagerLIZ != null) {
            multiGuestDialogManagerLIZ.Ll1(this);
        }
        multiGuestLiveSettingDialog.dismissAllowingStateLoss();
        LJIIIZ(this, "multi_guest_distribute", true);
    }

    public final void LJ(BaseMultiGuestLinkMicMatchFragment baseMultiGuestLinkMicMatchFragment) {
        long jLongValue;
        if (baseMultiGuestLinkMicMatchFragment == null) {
            return;
        }
        if (LiveSheetMigrationMultiWatchLinkedMicSetting.INSTANCE.enable(LJIIIIZZ())) {
            HashMap<String, Long> map = LIZIZ;
            Long l = map.get("multi_guest_link_mic_match");
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = -1;
            }
            if (C464790IKn.LIZ.LIZIZ(jLongValue)) {
                C19322110iZ.LIZ(jLongValue);
                map.remove("multi_guest_link_mic_match");
                return;
            }
            return;
        }
        baseMultiGuestLinkMicMatchFragment.dismissAllowingStateLoss();
        LJIIIZ(this, "multi_guest_link_mic_match", true);
    }

    public final void LJFF(LiveDialogFragment liveDialogFragment) {
        if (liveDialogFragment == null) {
            return;
        }
        liveDialogFragment.dismiss();
        LJIIIZ(this, "multi_guest_linked_preview", true);
    }

    public static void LJIIJJI(FragmentManager fragmentManager, C927010aEN c927010aEN) {
        long jLongValue;
        if (MultiGuestFollowAndApplyDialog.LLILLL) {
            C20441214yg.LIZIZ("MultiGuestV3SheetHelper", "showApplyDialogForGuestInvite return. MultiGuestFollowAndApplyDialog is displaying");
            return;
        }
        HashMap<String, Long> map = LIZIZ;
        Long l = map.get("multi_guest_apply_preview");
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = -1;
        }
        if (!C464790IKn.LIZ.LIZIZ(jLongValue)) {
            map.put("multi_guest_apply_preview", Long.valueOf(C19322110iZ.LJFF(fragmentManager, new MultiGuestApplySheetForGuestInvite(c927010aEN), "multi_guest_apply_preview", null, 0)));
        }
    }

    public final void LJIILJJIL(FragmentManager fragmentManager, BaseMultiGuestLinkMicMatchFragment baseMultiGuestLinkMicMatchFragment) {
        long jLongValue;
        if (baseMultiGuestLinkMicMatchFragment == null) {
            return;
        }
        LiveSheetMigrationMultiWatchLinkedMicSetting liveSheetMigrationMultiWatchLinkedMicSetting = LiveSheetMigrationMultiWatchLinkedMicSetting.INSTANCE;
        if (liveSheetMigrationMultiWatchLinkedMicSetting.enable(LJIIIIZZ())) {
            HashMap<String, Long> map = LIZIZ;
            Long l = map.get("multi_guest_link_mic_match");
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = -1;
            }
            if (!C464790IKn.LIZ.LIZIZ(jLongValue)) {
                Bundle bundle = new Bundle();
                C786410Ut5.LJJIJL(bundle, "multi_guest_link_mic_match", baseMultiGuestLinkMicMatchFragment);
                SheetOptions sheetOptions = new SheetOptions();
                LIZ.getClass();
                sheetOptions.draggable = liveSheetMigrationMultiWatchLinkedMicSetting.enableDraggableClose(LJIIIIZZ());
                map.put("multi_guest_link_mic_match", Long.valueOf(C19322110iZ.LIZLLL(fragmentManager, MultiGuestV3OuterSheetFragment.class, "multi_guest_link_mic_match", sheetOptions, bundle)));
                return;
            }
            return;
        }
        baseMultiGuestLinkMicMatchFragment.show(fragmentManager, "");
        LJIIJ(this, "multi_guest_link_mic_match", true);
    }

    public static void LJIIIZ(C929860aIy c929860aIy, String str, boolean z) {
        c929860aIy.getClass();
        Room roomLJIIIZ = C930540aK4.LJIIIZ();
        if (roomLJIIIZ != null) {
            long id = roomLJIIIZ.getId();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_panel_frame_exit_click");
            c474500IjALIZ.LJJII(String.valueOf(id), "room_id");
            String str2 = CardStruct.IStatusCode.DEFAULT;
            c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "is_anchor");
            c474500IjALIZ.LJJII("", "event_page");
            c474500IjALIZ.LJJII("multi_watch_linkedmic", "start_panel_page");
            c474500IjALIZ.LJJII(str, "current_panel_page");
            c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "has_slide_close");
            if (z) {
                str2 = "1";
            }
            c474500IjALIZ.LJJII(str2, "has_return");
            c474500IjALIZ.LJJII("max_6", "height_ratio");
            c474500IjALIZ.LJJII("", "action_type");
            c474500IjALIZ.LIZ();
        }
    }

    public static void LJIIJ(C929860aIy c929860aIy, String str, boolean z) {
        c929860aIy.getClass();
        Room roomLJIIIZ = C930540aK4.LJIIIZ();
        if (roomLJIIIZ != null) {
            long id = roomLJIIIZ.getId();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_panel_frame_show");
            c474500IjALIZ.LJJII(String.valueOf(id), "room_id");
            String str2 = CardStruct.IStatusCode.DEFAULT;
            c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "is_anchor");
            c474500IjALIZ.LJJII("", "event_page");
            c474500IjALIZ.LJJII("multi_watch_linkedmic", "start_panel_page");
            c474500IjALIZ.LJJII(str, "current_panel_page");
            c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "has_slide_close");
            if (z) {
                str2 = "1";
            }
            c474500IjALIZ.LJJII(str2, "has_return");
            c474500IjALIZ.LJJII("max_6", "height_ratio");
            c474500IjALIZ.LIZ();
        }
    }

    public final void LJIIL(FragmentManager fragmentManager, MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog, final Function1 function1) {
        long jLongValue;
        if (multiLiveGuestUserInfoDialog == null) {
            return;
        }
        LiveSheetMigrationMultiWatchLinkedMicSetting liveSheetMigrationMultiWatchLinkedMicSetting = LiveSheetMigrationMultiWatchLinkedMicSetting.INSTANCE;
        if (liveSheetMigrationMultiWatchLinkedMicSetting.enable(LJIIIIZZ())) {
            HashMap<String, Long> map = LIZIZ;
            Long l = map.get("multi_guest_apply_preview");
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = -1;
            }
            if (!C464790IKn.LIZ.LIZIZ(jLongValue)) {
                Bundle bundle = new Bundle();
                C786410Ut5.LJJIJL(bundle, "multi_guest_apply_preview", multiLiveGuestUserInfoDialog);
                C786410Ut5.LJJIJL(bundle, "DismissListenerProxy", new DismissListenerProxy(function1));
                SheetOptions sheetOptions = new SheetOptions();
                LIZ.getClass();
                sheetOptions.draggable = liveSheetMigrationMultiWatchLinkedMicSetting.enableDraggableClose(LJIIIIZZ());
                sheetOptions.canceledOnTouchOutside = !multiLiveGuestUserInfoDialog.RR();
                sheetOptions.LIZ(5, null);
                map.put("multi_guest_apply_preview", Long.valueOf(C19322110iZ.LIZLLL(fragmentManager, MultiGuestV3OuterSheetFragment.class, "multi_guest_apply_preview", sheetOptions, bundle)));
                return;
            }
            return;
        }
        multiLiveGuestUserInfoDialog.onDialogGoneListener = new InterfaceC930060aJI() { // from class: X.0aJ6
            @Override // X.InterfaceC930060aJI
            public final void LIZ() {
                Function1<Integer, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(0);
                }
            }
        };
        multiLiveGuestUserInfoDialog.show(fragmentManager, "MultiLiveGuestUserInfoDialog");
        LJIIJ(this, "multi_watch_linkedmic", true);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(androidx.fragment.app.FragmentManager r15, com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.guest.MultiGuestV3GuestBeInvitedDialog r16, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r17, java.lang.String r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C929860aIy.LJIILIIL(androidx.fragment.app.FragmentManager, com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.guest.MultiGuestV3GuestBeInvitedDialog, kotlin.jvm.functions.Function1, java.lang.String, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIILL(FragmentManager fragmentManager, LiveBaseFragment liveBaseFragment, String str, String str2, Function1 function1) {
        long jLongValue;
        if (liveBaseFragment == 0 || str == null || !(liveBaseFragment instanceof Parcelable)) {
            return;
        }
        LiveSheetMigrationMultiWatchLinkedMicSetting liveSheetMigrationMultiWatchLinkedMicSetting = LiveSheetMigrationMultiWatchLinkedMicSetting.INSTANCE;
        if (liveSheetMigrationMultiWatchLinkedMicSetting.enable(LJIIIIZZ())) {
            long jLongValue2 = -1;
            if (str2 != null) {
                HashMap<String, Long> map = LIZIZ;
                Long l = map.get(str2);
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = -1;
                }
                map.remove(str2);
                C19322110iZ.LIZ(jLongValue);
            }
            HashMap<String, Long> map2 = LIZIZ;
            Long l2 = map2.get(str);
            if (l2 != null) {
                jLongValue2 = l2.longValue();
            }
            if (!C464790IKn.LIZ.LIZIZ(jLongValue2)) {
                Bundle bundle = new Bundle();
                C786410Ut5.LJJIJL(bundle, str, (Parcelable) liveBaseFragment);
                C786410Ut5.LJJIJL(bundle, "DismissListenerProxy", new DismissListenerProxy(new AwS129S1100000_15(str, function1, 15)));
                SheetOptions sheetOptions = new SheetOptions();
                LIZ.getClass();
                sheetOptions.draggable = liveSheetMigrationMultiWatchLinkedMicSetting.enableDraggableClose(LJIIIIZZ());
                sheetOptions.LIZ(5, null);
                map2.put(str, Long.valueOf(C19322110iZ.LIZLLL(fragmentManager, MultiGuestV3OuterSheetFragment.class, str, sheetOptions, bundle)));
                return;
            }
            return;
        }
        C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
        LIZ.getClass();
        if (!liveSheetMigrationMultiWatchLinkedMicSetting.enable(LJIIIIZZ())) {
            c19ehLJIIJ.LJIJJ(R.anim.h9, R.anim.hd);
        }
        c19ehLJIIJ.LJIJ(R.id.iiv, liveBaseFragment, null);
        c19ehLJIIJ.LJIIJ();
        LJIIJ(this, "multi_guest_apply_preview_sub", true);
    }
}
