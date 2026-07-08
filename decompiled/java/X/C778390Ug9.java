package X;

import Y.ACListenerS147S0100000_12;
import Y.AObserverS216S0100000_12;
import Y.ARunnableS112S0100000_12;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.StateListDrawable;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.broadcast.utils.LiveAudioDevicesDetector;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.MuteMicChannel;
import com.bytedance.android.livesdk.game.chatroom.ui.GameBroadcastFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.GameFloatTipsOptimize;
import com.bytedance.android.livesdk.livesetting.broadcast.OptGoLiveBluetoothPermissionRequestSetting;
import com.bytedance.android.livesdk.model.RoomStats;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ug9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C778390Ug9 implements InterfaceC777850UfH {
    public final Fragment LL;
    public final Room LLILLJJLI;
    public final InterfaceC778270Ufx LLILLL;
    public final DataChannel LLILZ;
    public final Context LLILZIL;
    public DialogC778400UgA LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public long LLJILLL;
    public long LLJJ;
    public final BPEAHandler LLILZLL = new BPEAHandler(Looper.getMainLooper());
    public boolean LLJ = true;
    public boolean LLJI = true;
    public C776680UdO LLJILJILJ = new InterfaceC775040Uak() { // from class: X.0UdO
        @Override // X.InterfaceC775040Uak
        public final void LIZ() {
            C778390Ug9 c778390Ug9 = this.LIZ;
            c778390Ug9.LLJ = true;
            Map<String, Object> map = C1338270kvh.LIZ;
            C786410Ut5.LJJZZIII(c778390Ug9.LLILZLL, new ARunnableS112S0100000_12(c778390Ug9, 439));
            C778390Ug9 c778390Ug92 = this.LIZ;
            if (c778390Ug92.LLJILLL > 0) {
                c778390Ug92.LLJJ += System.currentTimeMillis() - c778390Ug92.LLJILLL;
                c778390Ug92.LLJILLL = 0L;
            }
            C778390Ug9 c778390Ug93 = this.LIZ;
            c778390Ug93.getClass();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_no_sound_recover");
            c474500IjALIZ.LJJII(String.valueOf(c778390Ug93.LLILLJJLI.getOwnerUserId()), "anchor_id");
            c474500IjALIZ.LJJII(c778390Ug93.LLILLJJLI.getIdStr(), "room_id");
            c474500IjALIZ.LIZ();
        }

        @Override // X.InterfaceC775040Uak
        public final void LIZIZ() {
            Map<String, Object> map = C1338270kvh.LIZ;
            this.LIZ.LLJILLL = System.currentTimeMillis();
            C778390Ug9 c778390Ug9 = this.LIZ;
            c778390Ug9.LLJ = false;
            C786410Ut5.LJJZZIII(c778390Ug9.LLILZLL, new ARunnableS112S0100000_12(c778390Ug9, 440));
            ((IGameService) C1161920gLG.LIZJ(IGameService.class)).ae1();
        }
    };

    public final void LJFF() {
        this.LLIZLLLIL = true;
        if (this.LLIZ == null) {
            C778430UgD c778430UgD = new C778430UgD(this.LLILZIL);
            c778430UgD.LIZ.LIZJ = R.layout.ga9;
            c778430UgD.LIZIZ(2131843089);
            c778430UgD.LIZ(2131843088);
            String strLJIJI = C497740JfY.LJIJI(2131843090);
            DialogInterfaceOnClickListenerC778640UgY dialogInterfaceOnClickListenerC778640UgY = new DialogInterface.OnClickListener() { // from class: X.0UgY
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            };
            C778420UgC c778420UgC = c778430UgD.LIZ;
            c778420UgC.LJFF = strLJIJI;
            c778420UgC.LJII = dialogInterfaceOnClickListenerC778640UgY;
            StateListDrawable stateListDrawableLIZ = C424070Gk1.LIZ(C418440Gaw.LIZIZ(8), C418440Gaw.LIZIZ(8), C497740JfY.LJFF(R.color.ao), C497740JfY.LJFF(R.color.aj));
            C778420UgC c778420UgC2 = c778430UgD.LIZ;
            c778420UgC2.LJI = stateListDrawableLIZ;
            c778420UgC2.LJIIIZ = false;
            c778420UgC2.LJIIIIZZ = false;
            C778420UgC c778420UgC3 = c778430UgD.LIZ;
            DialogC778400UgA dialogC778400UgA = new DialogC778400UgA(c778420UgC3.LIZ, c778420UgC3);
            dialogC778400UgA.LJJZZI(new ACListenerS147S0100000_12(this, 424));
            dialogC778400UgA.setOnDismissListener(new DialogInterfaceOnDismissListenerC786080UsY(this, 41));
            this.LLIZ = dialogC778400UgA;
        }
        this.LLILLL.LIZIZ().addToShow(8, this.LL, new AObserverS216S0100000_12(this, 108));
        LJ("popup");
    }

    public final void LIZ() {
        DialogC778400UgA dialogC778400UgA;
        DialogC778400UgA dialogC778400UgA2 = this.LLIZ;
        if (dialogC778400UgA2 != null && dialogC778400UgA2.isShowing() && (dialogC778400UgA = this.LLIZ) != null) {
            dialogC778400UgA.dismiss();
            C785410UrT.LIZ(dialogC778400UgA);
        }
        this.LLILLL.LIZIZ().UO0(8);
    }

    public final void LIZIZ(boolean z) {
        Map<String, Object> map = C1338270kvh.LIZ;
        if (!this.LLJILJIL && !this.LLJIJIL && C774950Uab.LIZJ) {
            if (z) {
                if (!this.LLJI && !this.LLIZLLLIL) {
                    LJFF();
                    return;
                }
            } else if (!this.LLIZLLLIL) {
                LJFF();
                return;
            }
            if (this.LLJI) {
                LIZ();
            }
        }
    }

    public final void LIZJ(boolean z) {
        Map<String, Object> map = C1338270kvh.LIZ;
        if (!this.LLJILJIL) {
            return;
        }
        this.LLJI = z;
        if (!this.LLJIJIL && C774950Uab.LIZJ) {
            if (!z) {
                LJIIIIZZ(true);
                return;
            }
            LJIIIIZZ(false);
            if (!Intrinsics.LJFF(this.LLILZ.gg0(MuteMicChannel.class), Boolean.TRUE)) {
                if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
                    C777840UfG.LJII(new C778410UgB("get"));
                } else {
                    this.LLILLL.LJIIIZ(EnumC778100Ufg.LIVE_TIP_AUDIO_FOCUS_GET_TIP.ordinal(), null, C497740JfY.LJIJI(2131843080), null, true);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJ(String str) {
        int iLIZIZ;
        int totalUser;
        if (OptGoLiveBluetoothPermissionRequestSetting.INSTANCE.enable()) {
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getLiveAudioDevicesDetector().getClass();
            iLIZIZ = LiveAudioDevicesDetector.LIZLLL;
        } else {
            iLIZIZ = C779660UiC.LIZ.LIZIZ();
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_no_sound_reminder_show");
        c474500IjALIZ.LJJII(String.valueOf(this.LLILLJJLI.getOwnerUserId()), "anchor_id");
        c474500IjALIZ.LJJII(this.LLILLJJLI.getIdStr(), "room_id");
        c474500IjALIZ.LJJII(str, "reminder_type");
        RoomStats stats = this.LLILLJJLI.getStats();
        if (stats != null) {
            totalUser = stats.getTotalUser();
        } else {
            totalUser = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(totalUser), "viewer_cnt");
        c474500IjALIZ.LJJII(Integer.valueOf(iLIZIZ), "userHeadPhones");
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC777850UfH
    public final void LJI(AbstractC777950UfR abstractC777950UfR) {
        if ((abstractC777950UfR instanceof C778410UgB) && Intrinsics.LJFF(((C778410UgB) abstractC777950UfR).LJ, "lost")) {
            LJ("float_window");
        }
    }

    public final void LJIIIIZZ(boolean z) {
        if (z && Intrinsics.LJFF(this.LLILZ.gg0(MuteMicChannel.class), Boolean.TRUE)) {
            return;
        }
        if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
            if (z) {
                C777840UfG.LJII(new C778410UgB("lost"));
                return;
            } else {
                C777840UfG.LIZJ(EnumC777480Ueg.AUDIO_FOCUS, "lost");
                return;
            }
        }
        C1124870fNV.LIZJ().getClass();
        String strLIZIZ = C1124870fNV.LIZIZ("pm_mt_ls_microphoneConflict_modal_body");
        if (strLIZIZ == null || strLIZIZ.length() == 0) {
            strLIZIZ = C497740JfY.LJIJI(2131842973);
        }
        this.LLILLL.LJIIIZ(EnumC778100Ufg.LIVE_TIP_AUDIO_FOCUS_LOST_TIP.ordinal(), null, strLIZIZ, null, z);
        if (!z) {
            return;
        }
        LJ("float_window");
    }

    public final void LIZLLL(String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_no_sound_reminder_close");
        c474500IjALIZ.LJJII(String.valueOf(this.LLILLJJLI.getOwnerUserId()), "anchor_id");
        c474500IjALIZ.LJJII(this.LLILLJJLI.getIdStr(), "room_id");
        c474500IjALIZ.LJJII(str, "reminder_type");
        c474500IjALIZ.LJJII(str2, "action_type");
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC777850UfH
    public final void LJII(AbstractC777950UfR abstractC777950UfR, EnumC778130Ufj enumC778130Ufj) {
        String str;
        if ((abstractC777950UfR instanceof C778410UgB) && Intrinsics.LJFF(((C778410UgB) abstractC777950UfR).LJ, "lost")) {
            int i = C778280Ufy.LIZ[enumC778130Ufj.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        str = "other";
                    } else {
                        str = "enter_app";
                    }
                } else {
                    str = "auto";
                }
            } else {
                str = "click_close";
            }
            LIZLLL("float_window", str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0UdO] */
    public C778390Ug9(GameBroadcastFragment gameBroadcastFragment, Room room, C776870Udh c776870Udh, DataChannel dataChannel) {
        this.LL = gameBroadcastFragment;
        this.LLILLJJLI = room;
        this.LLILLL = c776870Udh;
        this.LLILZ = dataChannel;
        this.LLILZIL = gameBroadcastFragment.requireContext();
        dataChannel.CQ2(MuteMicChannel.class, this, new AwS591S0100000_12(this, 1139));
        C776680UdO c776680UdO = this.LLJILJILJ;
        if (c776680UdO != null) {
            ArrayList<InterfaceC775040Uak> arrayList = C774950Uab.LJII;
            if (!arrayList.contains(c776680UdO)) {
                arrayList.add(c776680UdO);
            }
        }
        if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
            C777840UfG.LIZ(EnumC777480Ueg.AUDIO_FOCUS, this);
        }
    }
}
