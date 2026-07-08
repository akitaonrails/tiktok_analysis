package X;

import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.LiveInnerDowngradeAdaptExp;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCommentComboTraySetting;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.message.CommentTrayMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.performanhtune.IPTFService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0eTK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1090040eTK implements OnMessageListener {
    public static InterfaceC1090070eTN LLILLJJLI;
    public static InterfaceC1090070eTN LLILLL;
    public static int LLILZ;
    public static C1090090eTP LLILZIL;
    public static boolean LLILZLL;
    public static Room LLJI;
    public static DataChannel LLJIJIL;
    public static C11JF LLJILJIL;
    public static long LLJILJILJ;
    public static InterfaceC1090080eTO LLJILLL;
    public static Fragment LLJJ;
    public static final C1090040eTK LL = new C1090040eTK();
    public static long LLIZ = -1;
    public static long LLIZLLLIL = -1;
    public static long LLJ = -1;

    public static final void LIZLLL() {
        String str;
        User owner;
        InterfaceC1090070eTN interfaceC1090070eTN = LLILLJJLI;
        if (interfaceC1090070eTN != null) {
            interfaceC1090070eTN.LJJLIIJ();
        }
        InterfaceC1090070eTN interfaceC1090070eTN2 = LLILLL;
        if (interfaceC1090070eTN2 != null) {
            interfaceC1090070eTN2.LJJLIIJ();
        }
        LLIZLLLIL = SystemClock.elapsedRealtime();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_comment_tray_fadeout");
        c474500IjALIZ.LJIJJLI(LLJIJIL);
        c474500IjALIZ.LJJII("live_take_detail", "event_page");
        C1090090eTP c1090090eTP = LLILZIL;
        c474500IjALIZ.LJJII(c1090090eTP != null ? Long.valueOf(c1090090eTP.LIZ) : null, "comment_tray_id");
        Room room = LLJI;
        if (room == null || (owner = room.getOwner()) == null || UserService.getInstance().user().getCurrentUser().getId() != owner.getId()) {
            UserAttr userAttr = UserService.getInstance().user().getCurrentUser().getUserAttr();
            str = (userAttr == null || !userAttr.isAdmin) ? "user" : "admin";
        } else {
            str = "anchor";
        }
        c474500IjALIZ.LJJII(str, "admin_type");
        c474500IjALIZ.LJJII(Long.valueOf(LLIZLLLIL - LLIZ), "duration");
        C1090090eTP c1090090eTP2 = LLILZIL;
        c474500IjALIZ.LJJII(c1090090eTP2 != null ? Long.valueOf(c1090090eTP2.LIZLLL) : null, "comment_num");
        DataChannel dataChannel = LLJIJIL;
        if (C500260Jjc.LJJIFFI(dataChannel != null ? (Boolean) dataChannel.gg0(C0TZM.class) : null)) {
            c474500IjALIZ.LJJII(InterfaceC465670INx.LJLILLLLZI.LIZIZ().booleanValue() ? "close" : "right_panel", "public_area_status");
        }
        c474500IjALIZ.LIZ();
        LLILZIL = null;
        LLILZLL = false;
        LLIZ = -1L;
        LLIZLLLIL = -1L;
        LLJ = C963140bAe.LIZIZ();
    }

    public static final void LJ() {
        C1090090eTP c1090090eTP = LLILZIL;
        if (c1090090eTP != null) {
            C1090040eTK c1090040eTK = LL;
            if (LIZ(c1090090eTP.LJ)) {
                if (!LLILZLL) {
                    c1090040eTK.LIZIZ(c1090090eTP);
                    return;
                }
                InterfaceC1090070eTN interfaceC1090070eTN = LLILLJJLI;
                if (interfaceC1090070eTN != null) {
                    interfaceC1090070eTN.LLZILL(c1090090eTP);
                }
                InterfaceC1090070eTN interfaceC1090070eTN2 = LLILLL;
                if (interfaceC1090070eTN2 != null) {
                    interfaceC1090070eTN2.LLZILL(c1090090eTP);
                }
            }
        }
    }

    public static final void LJFF() {
        InterfaceC1090070eTN interfaceC1090070eTN = LLILLJJLI;
        if (interfaceC1090070eTN != null) {
            interfaceC1090070eTN.LLLLL();
        }
        InterfaceC1090070eTN interfaceC1090070eTN2 = LLILLL;
        if (interfaceC1090070eTN2 != null) {
            interfaceC1090070eTN2.LLLLL();
        }
    }

    public static final void LJI() {
        C11JF c11jf = LLJILJIL;
        if (c11jf != null && !c11jf.isDisposed()) {
            c11jf.dispose();
        }
        LLJILJIL = (C11JF) C11NZ.LJLJJLL(LiveCommentComboTraySetting.INSTANCE.getCommentComboTrayDuration(), TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0eTL
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("CommentComboTrayPresenter@b20e.startTimer$2");
                C1090040eTK.LIZLLL();
                C1C7U.LIZIZ("CommentComboTrayPresenter@b20e.startTimer$2");
            }
        }, new C09JN() { // from class: X.0eTM
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("CommentComboTrayPresenter@b20e.startTimer$3");
                C1C7U.LIZIZ("CommentComboTrayPresenter@b20e.startTimer$3");
            }
        });
    }

    public static boolean LIZ(long j) {
        boolean z;
        User owner;
        Room room = LLJI;
        if (room != null && (owner = room.getOwner()) != null && UserService.getInstance().user().getCurrentUser().getId() == owner.getId()) {
            z = true;
        } else {
            z = false;
        }
        if (LLILZ == 0 && j > LLJ && LLILLJJLI != null) {
            if (!z || LLILLL != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void LIZIZ(C1090090eTP c1090090eTP) {
        Long lValueOf;
        String str;
        String str2;
        String str3;
        User owner;
        if (!LIZ(c1090090eTP.LJ)) {
            long j = LLJILJILJ;
            long j2 = c1090090eTP.LIZ;
            if (j != j2) {
                LLJILJILJ = j2;
                InterfaceC1090080eTO interfaceC1090080eTO = LLJILLL;
                if (interfaceC1090080eTO != null) {
                    interfaceC1090080eTO.T51(EnumC325470CpN.COMMENT_TRAY);
                    return;
                }
                return;
            }
            return;
        }
        if (LLILZLL) {
            C1090090eTP c1090090eTP2 = LLILZIL;
            if (c1090090eTP2 != null) {
                long j3 = c1090090eTP.LIZ;
                if (j3 == c1090090eTP2.LIZ) {
                    long j4 = c1090090eTP.LIZLLL;
                    if (j4 > c1090090eTP2.LIZLLL) {
                        c1090090eTP2.LIZLLL = j4;
                        c1090090eTP2.LIZIZ = c1090090eTP.LIZIZ;
                        c1090090eTP2.LIZJ = c1090090eTP.LIZJ;
                        c1090090eTP2.LIZ = j3;
                        c1090090eTP2.LJ = c1090090eTP.LJ;
                        InterfaceC1090070eTN interfaceC1090070eTN = LLILLJJLI;
                        if (interfaceC1090070eTN != null) {
                            interfaceC1090070eTN.LJLI(c1090090eTP.LIZLLL);
                        }
                        InterfaceC1090070eTN interfaceC1090070eTN2 = LLILLL;
                        if (interfaceC1090070eTN2 != null) {
                            interfaceC1090070eTN2.LJLI(c1090090eTP.LIZLLL);
                        }
                        LJI();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        LLILZIL = c1090090eTP;
        InterfaceC1090070eTN interfaceC1090070eTN3 = LLILLJJLI;
        if (interfaceC1090070eTN3 == null) {
            if (LLILLL == null) {
                return;
            }
        } else {
            interfaceC1090070eTN3.LLZILL(c1090090eTP);
        }
        InterfaceC1090070eTN interfaceC1090070eTN4 = LLILLL;
        if (interfaceC1090070eTN4 != null) {
            interfaceC1090070eTN4.LLZILL(c1090090eTP);
        }
        LJI();
        LLILZLL = true;
        LLIZ = SystemClock.elapsedRealtime();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_comment_tray_show");
        c474500IjALIZ.LJIJJLI(LLJIJIL);
        c474500IjALIZ.LJJII("live_take_detail", "event_page");
        C1090090eTP c1090090eTP3 = LLILZIL;
        Boolean bool = null;
        if (c1090090eTP3 != null) {
            lValueOf = Long.valueOf(c1090090eTP3.LIZ);
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "comment_tray_id");
        Room room = LLJI;
        if (room != null && (owner = room.getOwner()) != null && UserService.getInstance().user().getCurrentUser().getId() == owner.getId()) {
            str = "anchor";
        } else {
            UserAttr userAttr = UserService.getInstance().user().getCurrentUser().getUserAttr();
            if (userAttr != null && userAttr.isAdmin) {
                str = "admin";
            } else {
                str = "user";
            }
        }
        c474500IjALIZ.LJJII(str, "admin_type");
        C1090090eTP c1090090eTP4 = LLILZIL;
        if (c1090090eTP4 != null && c1090090eTP4.LJIIL != null) {
            if (c1090090eTP4 != null) {
                str3 = c1090090eTP4.LJIIL;
            } else {
                str3 = null;
            }
            c474500IjALIZ.LJJII(str3, "reason_id");
        }
        DataChannel dataChannel = LLJIJIL;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.gg0(C0TZM.class);
        }
        if (C500260Jjc.LJJIFFI(bool)) {
            if (InterfaceC465670INx.LJLILLLLZI.LIZIZ().booleanValue()) {
                str2 = "close";
            } else {
                str2 = "right_panel";
            }
            c474500IjALIZ.LJJII(str2, "public_area_status");
        }
        c474500IjALIZ.LIZ();
    }

    public final void LIZJ(int i) {
        LLILZ = i | LLILZ;
        if (LLILZLL) {
            C11JF c11jf = LLJILJIL;
            if (c11jf != null && !c11jf.isDisposed()) {
                c11jf.dispose();
            }
            LIZLLL();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        IPTFService iPTFService;
        C0IKU c0ikuP71;
        if (iMessage instanceof CommentTrayMessage) {
            if (LiveInnerDowngradeAdaptExp.INSTANCE.getExpValue().getEnableCommentComboTrayAnim() && !C500260Jjc.LJIIZILJ(LLJIJIL) && (iPTFService = (IPTFService) C1161920gLG.LIZJ(IPTFService.class)) != null && (c0ikuP71 = iPTFService.P71("inner_room_downgrade_scene", EnumC1101430elh.COMMENT_COMBO_TRAY_DISABLE, null, Integer.class)) != null && ((Number) c0ikuP71.LIZ).intValue() > 0) {
                return;
            }
            CommentTrayMessage commentTrayMessage = (CommentTrayMessage) iMessage;
            LIZIZ(new C1090090eTP(commentTrayMessage.trayId, commentTrayMessage.content, commentTrayMessage.contentType, commentTrayMessage.count, commentTrayMessage.chatTime, commentTrayMessage.LL, commentTrayMessage.LLILLJJLI, commentTrayMessage.LLILLL, commentTrayMessage.LLILZ, commentTrayMessage.LLILZIL, 224));
        }
    }
}
