package X;

import Y.AObserverS216S0100000_12;
import Y.AcS495S0100000_12;
import android.os.Looper;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.comp.api.game.GameBroadcastStateChannel;
import com.bytedance.android.livesdk.game.chatroom.ui.GameBroadcastFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.GameFloatTipsOptimize;
import com.bytedance.android.livesdk.livesetting.game.BitrateErrorPromptData;
import com.bytedance.android.livesdk.livesetting.game.BitrateErrorPromptSetting;
import com.bytedance.android.livesdk.model.RoomStats;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.internal.AwS29S0000100_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ufn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C778170Ufn implements InterfaceC776570UdD, InterfaceC777850UfH {
    public final GameBroadcastFragment LL;
    public final Room LLILLJJLI;
    public final InterfaceC778270Ufx LLILLL;
    public int LLILZ;
    public long LLILZIL;
    public final BitrateErrorPromptData LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public LiveDialog LLJI;
    public LiveDialog LLJIJIL;
    public C778570UgR LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public final BPEAHandler LLJJ = new BPEAHandler(Looper.getMainLooper());

    @Override // X.InterfaceC776570UdD
    public final void LIZ() {
    }

    @Override // X.InterfaceC776570UdD
    public final void LIZIZ() {
        this.LLILZ = 0;
        this.LLILZIL = 0L;
        this.LLJILJIL = null;
        LJIIIZ();
        this.LLJJ.removeCallbacksAndMessages(null);
        if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
            C777840UfG.LJI(EnumC777480Ueg.PUSH_STREAM, this);
        }
    }

    @Override // X.InterfaceC776570UdD
    public final void LIZJ() {
        this.LLIZ = false;
    }

    @Override // X.InterfaceC776570UdD
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC776570UdD
    public final void LJ() {
    }

    @Override // X.InterfaceC776570UdD
    public final void onPause() {
    }

    public final void LJIIIZ() {
        if (this.LLJILLL && C0W78.LJFF(this.LL.getActivity())) {
            if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
                C777840UfG.LIZIZ(EnumC777480Ueg.PUSH_STREAM);
            } else {
                EnumC778100Ufg enumC778100UfgLJIIJ = this.LLILLL.LJIIJ();
                if (enumC778100UfgLJIIJ == EnumC778100Ufg.LIVE_TIP_PUSH_STREAM_ERROR_TIPS || enumC778100UfgLJIIJ == EnumC778100Ufg.LIVE_TIP_PUSH_STREAM_RETRY_TIPS) {
                    this.LLILLL.LJIIIZ(enumC778100UfgLJIIJ.ordinal(), null, "", null, false);
                }
            }
        }
        LiveDialog liveDialog = this.LLJI;
        if (liveDialog != null && liveDialog.isShowing()) {
            liveDialog.dismiss();
            C785410UrT.LIZ(liveDialog);
            LJIIJ("popup", "other", null);
        }
        LiveDialog liveDialog2 = this.LLJIJIL;
        if (liveDialog2 == null || !liveDialog2.isShowing()) {
            return;
        }
        liveDialog2.dismiss();
        C785410UrT.LIZ(liveDialog2);
    }

    public final void LJIIJJI() {
        this.LLILLL.LIZIZ().UO0(9);
        this.LL.getDataChannel().zW(GameBroadcastStateChannel.class, C0TD3.STATE_END);
        if (!this.LLJILLL) {
            LJIIL();
            LiveDialog liveDialog = this.LLJI;
            if (liveDialog == null || !liveDialog.isShowing()) {
                return;
            }
            liveDialog.dismiss();
            C785410UrT.LIZ(liveDialog);
            LJIIJ("popup", "other", null);
            return;
        }
        this.LLIZLLLIL = true;
        if (C0W78.LJFF(this.LL.getActivity())) {
            if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
                C777840UfG.LIZJ(EnumC777480Ueg.PUSH_STREAM, "error");
                InterfaceC778270Ufx interfaceC778270Ufx = C777840UfG.LIZ;
                Object objLJII = interfaceC778270Ufx != null ? interfaceC778270Ufx.LJII() : null;
                if ((objLJII instanceof C778240Ufu) && Intrinsics.LJFF(((C778240Ufu) objLJII).LJ, "retry")) {
                    return;
                }
                C777840UfG.LJII(new C778240Ufu("retry"));
                return;
            }
            EnumC778100Ufg enumC778100UfgLJIIJ = this.LLILLL.LJIIJ();
            EnumC778100Ufg enumC778100Ufg = EnumC778100Ufg.LIVE_TIP_PUSH_STREAM_ERROR_TIPS;
            if (enumC778100UfgLJIIJ == enumC778100Ufg) {
                this.LLILLL.LJIIIZ(enumC778100Ufg.ordinal(), null, "", null, false);
            }
            EnumC778100Ufg enumC778100UfgLJIIJ2 = this.LLILLL.LJIIJ();
            EnumC778100Ufg enumC778100Ufg2 = EnumC778100Ufg.LIVE_TIP_PUSH_STREAM_RETRY_TIPS;
            if (enumC778100UfgLJIIJ2 == enumC778100Ufg2) {
                return;
            }
            this.LLILLL.LJIIIZ(enumC778100Ufg2.ordinal(), null, C497740JfY.LJIJI(2131843638), null, true);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_push_stream_fail_reminder_show");
            c474500IjALIZ.LJJII(String.valueOf(this.LLILLJJLI.getOwnerUserId()), "anchor_id");
            c474500IjALIZ.LJJII(this.LLILLJJLI.getIdStr(), "room_id");
            RoomStats stats = this.LLILLJJLI.getStats();
            c474500IjALIZ.LJJII(Integer.valueOf(stats != null ? stats.getTotalUser() : 0), "viewer_cnt");
            c474500IjALIZ.LJJII("float_window", "reminder_type");
            c474500IjALIZ.LJJII("several_attempt_fail", "content_type");
            C778570UgR c778570UgR = this.LLJILJIL;
            c474500IjALIZ.LJJII(c778570UgR != null ? c778570UgR.LIZLLL : null, "error_type");
            c474500IjALIZ.LIZ();
        }
    }

    public final void LJIIL() {
        LiveDialog liveDialog = this.LLJIJIL;
        if (C500260Jjc.LJJJI(liveDialog != null ? Boolean.valueOf(liveDialog.isShowing()) : null)) {
            return;
        }
        if (this.LL.getActivity() != null && this.LLJIJIL == null) {
            C782110Um9 c782110Um9 = new C782110Um9(this.LL.getActivity());
            c782110Um9.LJIIZILJ(2131843645);
            c782110Um9.LJII(2131843637);
            c782110Um9.LJIILIIL(2131843636, new AcS495S0100000_12(this, 70));
            c782110Um9.LJIIJ(2131843635, new AcS495S0100000_12(this, 71));
            c782110Um9.LJIJ = new DialogInterfaceOnDismissListenerC786080UsY(this, 42);
            c782110Um9.LJIILL = false;
            this.LLJIJIL = c782110Um9.LIZ();
        }
        this.LLILLL.LIZIZ().addToShow(49, this.LL, new AObserverS216S0100000_12(this, 111));
        this.LLIZLLLIL = false;
        this.LLJ = false;
    }

    public final void LJIILIIL() {
        LiveDialog liveDialog = this.LLJI;
        if (C500260Jjc.LJJJI(liveDialog != null ? Boolean.valueOf(liveDialog.isShowing()) : null)) {
            return;
        }
        if (this.LL.getActivity() != null && this.LLJI == null) {
            C782110Um9 c782110Um9 = new C782110Um9(this.LL.getActivity());
            c782110Um9.LJIIZILJ(2131843645);
            c782110Um9.LJII(2131843644);
            c782110Um9.LJIILIIL(2131843090, new AcS495S0100000_12(this, 72));
            c782110Um9.LJIJ = new DialogInterfaceOnDismissListenerC786080UsY(this, 43);
            c782110Um9.LJIILL = false;
            this.LLJI = c782110Um9.LIZ();
        }
        this.LLILLL.LIZIZ().addToShow(9, this.LL, new AObserverS216S0100000_12(this, 112));
        this.LLJ = false;
    }

    @Override // X.InterfaceC776570UdD
    public final void onResume() {
        Integer num;
        if (this.LLIZ) {
            return;
        }
        if (!this.LLIZLLLIL) {
            int i = this.LLILZ;
            BitrateErrorPromptData bitrateErrorPromptData = this.LLILZLL;
            if (i < ((bitrateErrorPromptData == null || (num = bitrateErrorPromptData.showTips) == null) ? 3 : num.intValue()) || !this.LLJ) {
                return;
            }
            LJIILIIL();
            return;
        }
        LJIIL();
        LiveDialog liveDialog = this.LLJI;
        if (liveDialog == null || !liveDialog.isShowing()) {
            return;
        }
        liveDialog.dismiss();
        C785410UrT.LIZ(liveDialog);
        LJIIJ("popup", "other", null);
    }

    @Override // X.InterfaceC776570UdD
    public final void LJFF(boolean z) {
        this.LLIZ = true;
        this.LLIZLLLIL = false;
        this.LLJ = false;
        this.LLILZ = 0;
        this.LLILZIL = 0L;
        this.LLJILJIL = null;
        LJIIIZ();
    }

    @Override // X.InterfaceC777850UfH
    public final void LJI(AbstractC777950UfR abstractC777950UfR) {
        String str;
        String str2;
        int totalUser;
        if (abstractC777950UfR instanceof C778240Ufu) {
            if (Intrinsics.LJFF(((C778240Ufu) abstractC777950UfR).LJ, "error")) {
                str2 = "first_fail";
                str = "stream_error";
            } else {
                C778570UgR c778570UgR = this.LLJILJIL;
                if (c778570UgR != null) {
                    str = c778570UgR.LIZLLL;
                } else {
                    str = null;
                }
                str2 = "several_attempt_fail";
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_push_stream_fail_reminder_show");
            c474500IjALIZ.LJJII(String.valueOf(this.LLILLJJLI.getOwnerUserId()), "anchor_id");
            c474500IjALIZ.LJJII(this.LLILLJJLI.getIdStr(), "room_id");
            RoomStats stats = this.LLILLJJLI.getStats();
            if (stats != null) {
                totalUser = stats.getTotalUser();
            } else {
                totalUser = 0;
            }
            c474500IjALIZ.LJJII(Integer.valueOf(totalUser), "viewer_cnt");
            c474500IjALIZ.LJJII("float_window", "reminder_type");
            c474500IjALIZ.LJJII(str2, "content_type");
            c474500IjALIZ.LJJII(str, "error_type");
            c474500IjALIZ.LIZ();
        }
    }

    public final void LJIIIIZZ(long j) {
        String str;
        int iIntValue;
        Integer num;
        Boolean boolValueOf;
        Integer num2;
        if (this.LLIZ) {
            return;
        }
        int totalUser = 0;
        AbstractC777950UfR abstractC777950UfRLJII = null;
        if (j < 1) {
            this.LLILZ++;
            if (this.LLILZIL == 0) {
                this.LLILZIL = System.currentTimeMillis();
            }
        } else {
            if (this.LLJILJILJ) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_push_stream_fail_recover");
                c474500IjALIZ.LJJII(String.valueOf(this.LLILLJJLI.getOwnerUserId()), "anchor_id");
                c474500IjALIZ.LJJII(this.LLILLJJLI.getIdStr(), "room_id");
                c474500IjALIZ.LJJII(Integer.valueOf(this.LLILZ), "fail_cnt");
                C778570UgR c778570UgR = this.LLJILJIL;
                if (c778570UgR != null) {
                    str = c778570UgR.LIZLLL;
                } else {
                    str = null;
                }
                c474500IjALIZ.LJJII(str, "error_type");
                c474500IjALIZ.LIZ();
                this.LLJILJILJ = false;
            }
            this.LLIZLLLIL = false;
            LJIIIZ();
            this.LLILZ = 0;
            this.LLILZIL = 0L;
            this.LLJILJIL = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("push stream bitrate = ");
        sbLIZ.append(j);
        sbLIZ.append(" , bitRateZeroCount = ");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(' ');
        C20441214yg.LIZIZ("PushStreamBitrate", C2188811AlT.LIZIZ(sbLIZ));
        int i = this.LLILZ;
        BitrateErrorPromptData bitrateErrorPromptData = this.LLILZLL;
        int iIntValue2 = 3;
        if (bitrateErrorPromptData != null && (num2 = bitrateErrorPromptData.showTips) != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = 3;
        }
        if (i == iIntValue) {
            if (!this.LLIZLLLIL) {
                LiveDialog liveDialog = this.LLJIJIL;
                if (liveDialog != null) {
                    boolValueOf = Boolean.valueOf(liveDialog.isShowing());
                } else {
                    boolValueOf = null;
                }
                if (!C500260Jjc.LJJJI(boolValueOf)) {
                    if (this.LLJILLL) {
                        this.LLJ = true;
                        if (C0W78.LJFF(this.LL.getActivity())) {
                            if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
                                InterfaceC778270Ufx interfaceC778270Ufx = C777840UfG.LIZ;
                                if (interfaceC778270Ufx != null) {
                                    abstractC777950UfRLJII = interfaceC778270Ufx.LJII();
                                }
                                if ((abstractC777950UfRLJII instanceof C778240Ufu) && Intrinsics.LJFF(((C778240Ufu) abstractC777950UfRLJII).LJ, "error")) {
                                    return;
                                }
                                C777840UfG.LJII(new C778240Ufu("error"));
                                return;
                            }
                            EnumC778100Ufg enumC778100UfgLJIIJ = this.LLILLL.LJIIJ();
                            EnumC778100Ufg enumC778100Ufg = EnumC778100Ufg.LIVE_TIP_PUSH_STREAM_ERROR_TIPS;
                            if (enumC778100UfgLJIIJ == enumC778100Ufg) {
                                return;
                            }
                            this.LLILLL.LJIIIZ(enumC778100Ufg.ordinal(), null, C497740JfY.LJIJI(2131843646), null, true);
                            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_push_stream_fail_reminder_show");
                            c474500IjALIZ2.LJJII(String.valueOf(this.LLILLJJLI.getOwnerUserId()), "anchor_id");
                            c474500IjALIZ2.LJJII(this.LLILLJJLI.getIdStr(), "room_id");
                            RoomStats stats = this.LLILLJJLI.getStats();
                            if (stats != null) {
                                totalUser = stats.getTotalUser();
                            }
                            c474500IjALIZ2.LJJII(Integer.valueOf(totalUser), "viewer_cnt");
                            c474500IjALIZ2.LJJII("float_window", "reminder_type");
                            c474500IjALIZ2.LJJII("first_fail", "content_type");
                            c474500IjALIZ2.LJJII("stream_error", "error_type");
                            c474500IjALIZ2.LIZ();
                            return;
                        }
                        return;
                    }
                    LJIILIIL();
                    return;
                }
                return;
            }
            return;
        }
        BitrateErrorPromptData bitrateErrorPromptData2 = this.LLILZLL;
        if (bitrateErrorPromptData2 != null && (num = bitrateErrorPromptData2.retryStream) != null) {
            iIntValue2 = num.intValue();
        }
        if (i != iIntValue2) {
            return;
        }
        if (this.LLJILJIL == null || this.LLJILJILJ) {
            this.LLJILJIL = new C778570UgR(20001, -1, "push stream bitrate error need retry", "stream_error");
            this.LLJILJILJ = false;
        }
        LJIIJJI();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILZIL;
        C773220UUu c773220UUu = C773220UUu.LIZ;
        AwS29S0000100_12 awS29S0000100_12 = new AwS29S0000100_12(jCurrentTimeMillis, 0);
        c773220UUu.getClass();
        C773220UUu.LJIIL(awS29S0000100_12);
    }

    @Override // X.InterfaceC777850UfH
    public final void LJII(AbstractC777950UfR abstractC777950UfR, EnumC778130Ufj enumC778130Ufj) {
        String str;
        String str2;
        String str3;
        if (abstractC777950UfR instanceof C778240Ufu) {
            int i = C778160Ufm.LIZIZ[enumC778130Ufj.ordinal()];
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
            if (Intrinsics.LJFF(((C778240Ufu) abstractC777950UfR).LJ, "error")) {
                str3 = "first_fail";
                str2 = "stream_error";
            } else {
                C778570UgR c778570UgR = this.LLJILJIL;
                if (c778570UgR != null) {
                    str2 = c778570UgR.LIZLLL;
                } else {
                    str2 = null;
                }
                str3 = "several_attempt_fail";
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_push_stream_fail_reminder_close");
            c474500IjALIZ.LJJII(String.valueOf(this.LLILLJJLI.getOwnerUserId()), "anchor_id");
            c474500IjALIZ.LJJII(this.LLILLJJLI.getIdStr(), "room_id");
            c474500IjALIZ.LJJII("float_window", "reminder_type");
            c474500IjALIZ.LJJII(str, "action_type");
            c474500IjALIZ.LJJII(str3, "content_type");
            c474500IjALIZ.LJJII(str2, "error_type");
            c474500IjALIZ.LIZ();
        }
    }

    public C778170Ufn(GameBroadcastFragment gameBroadcastFragment, Room room, C776870Udh c776870Udh) {
        this.LL = gameBroadcastFragment;
        this.LLILLJJLI = room;
        this.LLILLL = c776870Udh;
        BitrateErrorPromptData data = BitrateErrorPromptSetting.INSTANCE.getData();
        this.LLILZLL = data;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("promptData = ");
        sbLIZ.append(data);
        C20441214yg.LIZIZ("PushStreamBitrate", C2188811AlT.LIZIZ(sbLIZ));
        if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
            C777840UfG.LIZ(EnumC777480Ueg.PUSH_STREAM, this);
        }
    }

    public final void LJIIJ(String str, String str2, EnumC778100Ufg enumC778100Ufg) {
        String str3;
        String str4;
        int i;
        if (enumC778100Ufg != null && (i = C778160Ufm.LIZ[enumC778100Ufg.ordinal()]) != 1 && i == 2) {
            C778570UgR c778570UgR = this.LLJILJIL;
            if (c778570UgR != null) {
                str3 = c778570UgR.LIZLLL;
            } else {
                str3 = null;
            }
            str4 = "several_attempt_fail";
        } else {
            str3 = "stream_error";
            str4 = "first_fail";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_push_stream_fail_reminder_close");
        c474500IjALIZ.LJJII(String.valueOf(this.LLILLJJLI.getOwnerUserId()), "anchor_id");
        c474500IjALIZ.LJJII(this.LLILLJJLI.getIdStr(), "room_id");
        c474500IjALIZ.LJJII(str, "reminder_type");
        c474500IjALIZ.LJJII(str2, "action_type");
        c474500IjALIZ.LJJII(str4, "content_type");
        c474500IjALIZ.LJJII(str3, "error_type");
        c474500IjALIZ.LIZ();
    }
}
