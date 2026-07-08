package X;

import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveCenterWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.boards.LiveBoardsWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingRevisionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.FestRoundConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import qo2.w;

/* JADX INFO: renamed from: X.0Usu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C786300Usu implements InterfaceC254600ye {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ void onShow$18(C786300Usu c786300Usu) {
        ((Function0) c786300Usu.l0).invoke();
    }

    @Override // X.InterfaceC254600ye
    public final void onShow() {
        switch (this.$t) {
            case 0:
                onShow$0(this);
                break;
            case 1:
                onShow$1(this);
                break;
            case 2:
                onShow$2(this);
                break;
            case 3:
                onShow$3(this);
                break;
            case 4:
                onShow$4(this);
                break;
            case 5:
                onShow$5(this);
                break;
            case 6:
                onShow$6(this);
                break;
            case 7:
                onShow$7(this);
                break;
            case 8:
                onShow$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onShow$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onShow$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onShow$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onShow$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onShow$13(this);
                break;
            case 14:
                onShow$14(this);
                break;
            case 15:
                onShow$15(this);
                break;
            case 16:
                onShow$16(this);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onShow$17(this);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onShow$18(this);
                break;
            case 19:
                onShow$19(this);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onShow$20(this);
                break;
        }
    }

    public static final void onShow$0(C786300Usu c786300Usu) {
        InterfaceC784990Uqn interfaceC784990Uqn = (InterfaceC784990Uqn) c786300Usu.l0;
        if (interfaceC784990Uqn != null) {
            interfaceC784990Uqn.LIZ();
        }
    }

    public static final void onShow$1(C786300Usu c786300Usu) {
        InterfaceC784990Uqn interfaceC784990Uqn = (InterfaceC784990Uqn) c786300Usu.l0;
        if (interfaceC784990Uqn != null) {
            interfaceC784990Uqn.LIZ();
        }
    }

    public static final void onShow$10(C786300Usu c786300Usu) {
        InterfaceC784990Uqn interfaceC784990Uqn;
        IIconSlot.SlotViewModel slotViewModel = ((C784980Uqm) c786300Usu.l0).LLJ;
        if (slotViewModel != null && (interfaceC784990Uqn = slotViewModel.LLL) != null) {
            interfaceC784990Uqn.LIZ();
        }
    }

    public static final void onShow$11(C786300Usu c786300Usu) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_small_window_bubble");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(String.valueOf(w.LJ()), "anchor_id");
        c474500IjALIZ.LJJII(String.valueOf(w.LJIJJ()), "room_id");
        c474500IjALIZ.LIZ();
        C0UXF c0uxf = (C0UXF) c786300Usu.l0;
        c0uxf.LLJILLL = true;
        C473410IhP.LIZJ(c0uxf.LLJJIJIIJIL, Mp4ScreenVideoLoadTimeout.CONTROL);
        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        C20337914i1<Map<String, Boolean>> c20337914i1 = InterfaceC1106030et7.P8;
        Map<String, Boolean> mapLIZIZ = c20337914i1.LIZIZ();
        mapLIZIZ.put(strValueOf, Boolean.TRUE);
        c20337914i1.LJFF(mapLIZIZ);
        C0UVE.LIZ = true;
    }

    public static final void onShow$12(C786300Usu c786300Usu) {
        C0UID.LJIIIIZZ();
        ((C0UF1) c786300Usu.l0).LIZ();
    }

    public static final void onShow$13(C786300Usu c786300Usu) {
        C0UID.LJII();
        ((C0UF0) c786300Usu.l0).LIZ();
    }

    public static final void onShow$14(C786300Usu c786300Usu) {
        C0UID.LJIIIIZZ();
        ((C0UF0) c786300Usu.l0).LIZ();
    }

    public static final void onShow$15(C786300Usu c786300Usu) {
        InterfaceC784990Uqn interfaceC784990Uqn;
        IIconSlot.SlotViewModel slotViewModel = ((C785000Uqo) c786300Usu.l0).LLJI;
        if (slotViewModel != null && (interfaceC784990Uqn = slotViewModel.LLL) != null) {
            interfaceC784990Uqn.LIZ();
        }
    }

    public static final void onShow$16(C786300Usu c786300Usu) {
        InterfaceC784990Uqn interfaceC784990Uqn = (InterfaceC784990Uqn) c786300Usu.l0;
        if (interfaceC784990Uqn != null) {
            interfaceC784990Uqn.LIZ();
        }
    }

    public static final void onShow$17(C786300Usu c786300Usu) {
        C20441214yg.LIZIZ("PreviewSettingWidget", "real show auto post guide tooltip");
        C1834350xpp.LIZ.getClass();
        C0JT6<Boolean> c0jt6 = C1834350xpp.LJIJI;
        Boolean bool = Boolean.TRUE;
        c0jt6.LIZJ(bool);
        PreviewSettingWidget previewSettingWidget = (PreviewSettingWidget) c786300Usu.l0;
        if (previewSettingWidget.LLJILJILJ == null) {
            previewSettingWidget.LLJILJILJ = bool;
        }
        previewSettingWidget.LLJJ = true;
    }

    public static final void onShow$19(C786300Usu c786300Usu) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_board_entrance_bubble_show");
        c474500IjALIZ.LJJII(2, "board_source");
        c474500IjALIZ.LJIJJLI(((LiveBoardsWidget) c786300Usu.l0).dataChannel);
        c474500IjALIZ.LIZ();
        InterfaceC772190UQv.b4.LJFF(Boolean.TRUE);
    }

    public static final void onShow$2(C786300Usu c786300Usu) {
        InterfaceC784990Uqn interfaceC784990Uqn = (InterfaceC784990Uqn) c786300Usu.l0;
        if (interfaceC784990Uqn != null) {
            interfaceC784990Uqn.LIZ();
        }
    }

    public static final void onShow$20(C786300Usu c786300Usu) {
        InterfaceC960800b6s.LLJJJJLIIL.LJFF(Boolean.FALSE);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_cohost_icon_change_guide_show");
        c474500IjALIZ.LJIJJLI(((C0UXA) c786300Usu.l0).LL);
        c474500IjALIZ.LJJII("interact", "position");
        c474500IjALIZ.LIZ();
    }

    public static final void onShow$3(C786300Usu c786300Usu) {
        C0UKZ.LJLLI.LJFF(Boolean.TRUE);
        ((PreviewLiveCenterWidget) c786300Usu.l0).LLIZLLLIL = true;
    }

    public static final void onShow$4(C786300Usu c786300Usu) {
        InterfaceC784990Uqn interfaceC784990Uqn = ((IIconSlot.SlotViewModel) c786300Usu.l0).LLL;
        if (interfaceC784990Uqn != null) {
            interfaceC784990Uqn.LIZ();
        }
    }

    public static final void onShow$5(C786300Usu c786300Usu) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_board_entrance_bubble_show");
        c474500IjALIZ.LJJII(2, "board_source");
        c474500IjALIZ.LJIJJLI(((PreviewSettingRevisionWidget) c786300Usu.l0).dataChannel);
        c474500IjALIZ.LIZ();
        InterfaceC772190UQv.b4.LJFF(Boolean.TRUE);
    }

    public static final void onShow$6(C786300Usu c786300Usu) {
        ((PreviewSettingWidget) c786300Usu.l0).LLIZ = true;
        C0UKZ.LJLJL.LJFF(Boolean.FALSE);
    }

    public static final void onShow$7(C786300Usu c786300Usu) {
        String str = ((FestRoundConfig) c786300Usu.l0).key;
        C0JT6<ArrayList<String>> c0jt6 = InterfaceC1106030et7.x8;
        ArrayList<String> arrayListLIZ = c0jt6.LIZ();
        if (arrayListLIZ == null) {
            arrayListLIZ = new ArrayList<>();
        }
        arrayListLIZ.add(str);
        c0jt6.LIZJ(arrayListLIZ);
    }

    public static final void onShow$8(C786300Usu c786300Usu) {
        C0UID.LJII();
        ((C0UF1) c786300Usu.l0).LIZ();
    }

    public static final void onShow$9(C786300Usu c786300Usu) {
        InterfaceC960800b6s.LLJJJJLIIL.LJFF(Boolean.FALSE);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_cohost_icon_change_guide_show");
        c474500IjALIZ.LJIJJLI(((C0UXF) c786300Usu.l0).LLJ);
        c474500IjALIZ.LJJII("more", "position");
        c474500IjALIZ.LIZ();
    }

    public C786300Usu(InterfaceC784990Uqn interfaceC784990Uqn, int i) {
        this.$t = i;
        switch (i) {
            case 0:
            case 1:
                this.l0 = interfaceC784990Uqn;
                break;
            default:
                this.l0 = interfaceC784990Uqn;
                break;
        }
    }

    public C786300Usu(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
