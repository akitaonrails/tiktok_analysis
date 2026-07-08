package X;

import android.graphics.drawable.Animatable;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.android.live.userinfowidget.IUserInfoWidgetService;
import com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveUserInfoAvatarLoadMonitorSampleRateSetting;
import com.bytedance.android.livesdk.microom.MicRoomUserInfoWidget;
import com.bytedance.android.livesdk.subcription.subspaceeditor.SpaceEditorAssem;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.android.livesdk.widget.preload.LivePreloadUserInfoWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.adapter.widget.CoverViewVideoAboveWidget;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: renamed from: X.0KdP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C521890KdP implements InterfaceC1142670fqD {
    public final int $t;
    public Object l0;

    public static final void LIZ$0(C521890KdP c521890KdP) {
    }

    public static final void LIZ$1(C521890KdP c521890KdP) {
    }

    public static final void LIZ$10(C521890KdP c521890KdP) {
    }

    public static final void LIZ$11(C521890KdP c521890KdP) {
    }

    public static final void LIZ$2(C521890KdP c521890KdP) {
    }

    public static final void LIZ$3(C521890KdP c521890KdP) {
    }

    public static final void LIZ$4(C521890KdP c521890KdP) {
    }

    public static final void LIZ$5(C521890KdP c521890KdP) {
    }

    public static final void LIZ$6(C521890KdP c521890KdP) {
    }

    public static final void LIZ$7(C521890KdP c521890KdP) {
    }

    public static final void LIZ$8(C521890KdP c521890KdP) {
    }

    public static final void LIZ$9(C521890KdP c521890KdP) {
    }

    public static final void LIZIZ$0(C521890KdP c521890KdP, Animatable animatable) {
    }

    public static final void LIZIZ$1(C521890KdP c521890KdP, Animatable animatable) {
    }

    public static final void LIZIZ$10(C521890KdP c521890KdP, Animatable animatable) {
    }

    public static final void LIZIZ$11(C521890KdP c521890KdP, Animatable animatable) {
    }

    public static final void LIZIZ$2(C521890KdP c521890KdP, Animatable animatable) {
    }

    public static final void LIZIZ$3(C521890KdP c521890KdP, Animatable animatable) {
    }

    public static final void LIZIZ$4(C521890KdP c521890KdP, Animatable animatable) {
    }

    public static final void LIZIZ$5(C521890KdP c521890KdP, Animatable animatable) {
    }

    public static final void LIZIZ$6(C521890KdP c521890KdP, Animatable animatable) {
    }

    public static final void LIZIZ$7(C521890KdP c521890KdP, Animatable animatable) {
    }

    public static final void LIZIZ$8(C521890KdP c521890KdP, Animatable animatable) {
    }

    public static final void LIZIZ$9(C521890KdP c521890KdP, Animatable animatable) {
    }

    public static final void LIZJ$0(C521890KdP c521890KdP, int i, int i2, String str) {
    }

    public static final void LIZJ$1(C521890KdP c521890KdP, int i, int i2, String str) {
    }

    public static final void LIZJ$11(C521890KdP c521890KdP, int i, int i2, String str) {
    }

    public static final void LIZJ$2(C521890KdP c521890KdP, int i, int i2, String str) {
    }

    public static final void LIZLLL$10(C521890KdP c521890KdP, String str, Exception exc) {
    }

    public static final void LIZLLL$3(C521890KdP c521890KdP, String str, Exception exc) {
    }

    public static final void LIZLLL$4(C521890KdP c521890KdP, String str, Exception exc) {
    }

    public static final void LIZLLL$5(C521890KdP c521890KdP, String str, Exception exc) {
    }

    public static final void LIZLLL$6(C521890KdP c521890KdP, String str, Exception exc) {
    }

    public static final void LIZLLL$7(C521890KdP c521890KdP, String str, Exception exc) {
    }

    @Override // X.InterfaceC1142670fqD
    public final void LIZ() {
        switch (this.$t) {
            case 0:
                LIZ$0(this);
                break;
            case 1:
                LIZ$1(this);
                break;
            case 2:
                LIZ$2(this);
                break;
            case 3:
                LIZ$3(this);
                break;
            case 4:
                LIZ$4(this);
                break;
            case 5:
                LIZ$5(this);
                break;
            case 6:
                LIZ$6(this);
                break;
            case 7:
                LIZ$7(this);
                break;
            case 8:
                LIZ$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this);
                break;
        }
    }

    @Override // X.InterfaceC1142670fqD
    public final void LIZIZ(Animatable animatable) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, animatable);
                break;
            case 1:
                LIZIZ$1(this, animatable);
                break;
            case 2:
                LIZIZ$2(this, animatable);
                break;
            case 3:
                LIZIZ$3(this, animatable);
                break;
            case 4:
                LIZIZ$4(this, animatable);
                break;
            case 5:
                LIZIZ$5(this, animatable);
                break;
            case 6:
                LIZIZ$6(this, animatable);
                break;
            case 7:
                LIZIZ$7(this, animatable);
                break;
            case 8:
                LIZIZ$8(this, animatable);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZIZ$9(this, animatable);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZIZ$10(this, animatable);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZIZ$11(this, animatable);
                break;
        }
    }

    @Override // X.InterfaceC1142670fqD
    public final void LIZJ(int i, int i2, String str) {
        switch (this.$t) {
            case 0:
                LIZJ$0(this, i, i2, str);
                break;
            case 1:
                LIZJ$1(this, i, i2, str);
                break;
            case 2:
                LIZJ$2(this, i, i2, str);
                break;
            case 3:
                LIZJ$3(this, i, i2, str);
                break;
            case 4:
                LIZJ$4(this, i, i2, str);
                break;
            case 5:
                LIZJ$5(this, i, i2, str);
                break;
            case 6:
                LIZJ$6(this, i, i2, str);
                break;
            case 7:
                LIZJ$7(this, i, i2, str);
                break;
            case 8:
                LIZJ$8(this, i, i2, str);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZJ$9(this, i, i2, str);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZJ$10(this, i, i2, str);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZJ$11(this, i, i2, str);
                break;
        }
    }

    @Override // X.InterfaceC1142670fqD
    public final void LIZLLL(String str, Exception exc) {
        switch (this.$t) {
            case 0:
                LIZLLL$0(this, str, exc);
                break;
            case 1:
                LIZLLL$1(this, str, exc);
                break;
            case 2:
                LIZLLL$2(this, str, exc);
                break;
            case 3:
                LIZLLL$3(this, str, exc);
                break;
            case 4:
                LIZLLL$4(this, str, exc);
                break;
            case 5:
                LIZLLL$5(this, str, exc);
                break;
            case 6:
                LIZLLL$6(this, str, exc);
                break;
            case 7:
                LIZLLL$7(this, str, exc);
                break;
            case 8:
                LIZLLL$8(this, str, exc);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZLLL$9(this, str, exc);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZLLL$10(this, str, exc);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZLLL$11(this, str, exc);
                break;
        }
    }

    public C521890KdP(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZLLL$0(C521890KdP c521890KdP, String str, Exception exc) {
        C1CC2.LIZ("SubSpaceAvatarLoad", exc);
        ((C1322110kVd) ((SpaceEditorAssem) c521890KdP.l0).LLJILJIL.getValue()).setActualImageResource(R.drawable.el9);
    }

    public static final void LIZLLL$1(C521890KdP c521890KdP, String str, Exception exc) {
        C1CC2.LIZ("SubSpaceAvatarLoad", exc);
        ((C1324720kZq) c521890KdP.l0).setActualImageResource(R.drawable.el9);
    }

    public static final void LIZLLL$11(C521890KdP c521890KdP, String str, Exception exc) {
        ((AbstractC470040Iby) c521890KdP.l0).LJIL(str);
    }

    public static final void LIZLLL$2(C521890KdP c521890KdP, String str, Exception exc) {
        ((LivePromoteParentWidget) c521890KdP.l0).J1(str);
    }

    public static final void LIZLLL$8(C521890KdP c521890KdP, String str, Exception exc) {
        long id;
        boolean z;
        String message;
        C1CC3 c1cc3MN2;
        Room room = ((LiveRoomUserInfoWidget) c521890KdP.l0).LLLLLJLJLL;
        if (room != null) {
            long id2 = room.getId();
            long j = 0;
            if (((LiveRoomUserInfoWidget) c521890KdP.l0).LLLLLJLJLL.getOwner() != null) {
                id = ((LiveRoomUserInfoWidget) c521890KdP.l0).LLLLLJLJLL.getOwner().getId();
            } else {
                id = 0;
            }
            if (!((LiveRoomUserInfoWidget) c521890KdP.l0).LLLLLL && ((IUserInfoWidgetService) C1161920gLG.LIZJ(IUserInfoWidgetService.class)).YI0(((LiveRoomUserInfoWidget) c521890KdP.l0).LLLLLJLJLL)) {
                z = true;
            } else {
                z = false;
            }
            String str2 = "unknown";
            if (exc == null) {
                message = "unknown";
            } else {
                message = exc.getMessage();
            }
            LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) c521890KdP.l0;
            long j2 = liveRoomUserInfoWidget.LLILLJJLI;
            boolean z2 = liveRoomUserInfoWidget.LLLLLL;
            if (AbstractC19994813Le.Default.nextDouble() < LiveUserInfoAvatarLoadMonitorSampleRateSetting.getValue()) {
                try {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    if (j2 > 0) {
                        j = jElapsedRealtime - j2;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("room_id", id2);
                    jSONObject.put("anchor_id", id);
                    jSONObject.put("is_official_channel", z);
                    jSONObject.put("load_failed", true);
                    jSONObject.put("is_anchor", z2);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("duration_ms", j);
                    if (message != null) {
                        str2 = message;
                    }
                    jSONObject2.put("error_msg", str2);
                    JSONObject jSONObject3 = new JSONObject();
                    ILoggerService iLoggerService = (ILoggerService) C1161920gLG.LIZJ(ILoggerService.class);
                    if (iLoggerService != null && (c1cc3MN2 = iLoggerService.MN2()) != null) {
                        c1cc3MN2.LJIL("notify_component", "ttlive_userinfo_widget_avatar_load_monitor", jSONObject, jSONObject2, jSONObject3);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    public static final void LIZLLL$9(C521890KdP c521890KdP, String str, Exception exc) {
        ((LivePreloadUserInfoWidget) c521890KdP.l0).LLIZLLLIL = true;
    }

    public static final void LIZJ$10(C521890KdP c521890KdP, int i, int i2, String str) {
        Long lValueOf;
        EnterRoomConfig.RoomsData roomsData;
        C784790UqT c784790UqT = (C784790UqT) c521890KdP.l0;
        if (!c784790UqT.LJ) {
            c784790UqT.LJ = true;
            Room room = (Room) c784790UqT.LIZJ.gg0(RoomChannel.class);
            if (room != null) {
                long jLIZ = C0IZP.LIZ();
                if (jLIZ > 0) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - jLIZ;
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_real_audience_avatar_load_duration");
                    c474500IjALIZ.LJJII(Long.valueOf(room.getId()), "room_id");
                    InterfaceC2262081DgM interfaceC2262081DgMAuthor = room.author();
                    String str2 = null;
                    if (interfaceC2262081DgMAuthor != null) {
                        lValueOf = Long.valueOf(interfaceC2262081DgMAuthor.getId());
                    } else {
                        lValueOf = null;
                    }
                    c474500IjALIZ.LJJII(lValueOf, "anchor_id");
                    w.LIZ.getClass();
                    c474500IjALIZ.LJJII(w.LJIIIZ(), "enter_from_merge");
                    c474500IjALIZ.LJJII(w.LJIIL(), "enter_method");
                    EnterRoomConfig enterRoomConfig = C0IZP.LIZ;
                    if (enterRoomConfig != null && (roomsData = enterRoomConfig.mRoomsData) != null) {
                        str2 = roomsData.enterType;
                    }
                    c474500IjALIZ.LJJII(str2, "action_type");
                    c474500IjALIZ.LJJII(C0IZP.LIZIZ(), "room_type");
                    c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis), "duration_icon");
                    if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
                        c474500IjALIZ.LIZ();
                    } else {
                        c474500IjALIZ.LJJIJLIJ();
                        c474500IjALIZ.LJJIJL();
                    }
                }
            }
        }
    }

    public static final void LIZJ$3(C521890KdP c521890KdP, int i, int i2, String str) {
        Long lValueOf;
        EnterRoomConfig.RoomsData roomsData;
        Room room = ((MicRoomUserInfoWidget) c521890KdP.l0).LLILLJJLI;
        if (room != null) {
            long jLIZ = C0IZP.LIZ();
            if (jLIZ > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis() - jLIZ;
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_lineup_official_avatar_load_duration");
                c474500IjALIZ.LJJII(Long.valueOf(room.getId()), "room_id");
                InterfaceC2262081DgM interfaceC2262081DgMAuthor = room.author();
                String str2 = null;
                if (interfaceC2262081DgMAuthor != null) {
                    lValueOf = Long.valueOf(interfaceC2262081DgMAuthor.getId());
                } else {
                    lValueOf = null;
                }
                c474500IjALIZ.LJJII(lValueOf, "anchor_id");
                w.LIZ.getClass();
                c474500IjALIZ.LJJII(w.LJIIIZ(), "enter_from_merge");
                c474500IjALIZ.LJJII(w.LJIIL(), "enter_method");
                EnterRoomConfig enterRoomConfig = C0IZP.LIZ;
                if (enterRoomConfig != null && (roomsData = enterRoomConfig.mRoomsData) != null) {
                    str2 = roomsData.enterType;
                }
                c474500IjALIZ.LJJII(str2, "action_type");
                c474500IjALIZ.LJJII(C0IZP.LIZIZ(), "room_type");
                c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis), "duration_icon");
                c474500IjALIZ.LIZ();
            }
        }
    }

    public static final void LIZJ$4(C521890KdP c521890KdP, int i, int i2, String str) {
        C1ADO c1ado;
        C1ACA c1acaZ1 = ((CoverViewVideoAboveWidget) c521890KdP.l0).z1();
        if (c1acaZ1 != null && (c1ado = c1acaZ1.LJIIJ) != null) {
            c1ado.LJFF = System.currentTimeMillis();
        }
    }

    public static final void LIZJ$5(C521890KdP c521890KdP, int i, int i2, String str) {
        View view = (View) ((AbstractC477250Inb) c521890KdP.l0).LJIILJJIL.getValue();
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    public static final void LIZJ$6(C521890KdP c521890KdP, int i, int i2, String str) {
        View view = (View) ((AbstractC477250Inb) c521890KdP.l0).LJIILL.getValue();
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    public static final void LIZJ$7(C521890KdP c521890KdP, int i, int i2, String str) {
        View view = (View) ((AbstractC477250Inb) c521890KdP.l0).LJIILLIIL.getValue();
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    public static final void LIZJ$8(C521890KdP c521890KdP, int i, int i2, String str) {
        long id;
        boolean z;
        C1CC3 c1cc3MN2;
        Long lValueOf;
        EnterRoomConfig.RoomsData roomsData;
        Room room = ((LiveRoomUserInfoWidget) c521890KdP.l0).LLLLLJLJLL;
        long jLIZ = C0IZP.LIZ();
        long j = 0;
        if (jLIZ > 0 && room != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - jLIZ;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_real_avatar_load_duration");
            c474500IjALIZ.LJJII(Long.valueOf(room.getId()), "room_id");
            InterfaceC2262081DgM interfaceC2262081DgMAuthor = room.author();
            String str2 = null;
            if (interfaceC2262081DgMAuthor != null) {
                lValueOf = Long.valueOf(interfaceC2262081DgMAuthor.getId());
            } else {
                lValueOf = null;
            }
            c474500IjALIZ.LJJII(lValueOf, "anchor_id");
            w.LIZ.getClass();
            c474500IjALIZ.LJJII(w.LJIIIZ(), "enter_from_merge");
            c474500IjALIZ.LJJII(w.LJIIL(), "enter_method");
            EnterRoomConfig enterRoomConfig = C0IZP.LIZ;
            if (enterRoomConfig != null && (roomsData = enterRoomConfig.mRoomsData) != null) {
                str2 = roomsData.enterType;
            }
            c474500IjALIZ.LJJII(str2, "action_type");
            c474500IjALIZ.LJJII(C0IZP.LIZIZ(), "room_type");
            c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis), "duration_icon");
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
                c474500IjALIZ.LIZ();
            } else {
                c474500IjALIZ.LJJIJLIJ();
                c474500IjALIZ.LJJIJL();
            }
        }
        Room room2 = ((LiveRoomUserInfoWidget) c521890KdP.l0).LLLLLJLJLL;
        if (room2 != null) {
            long id2 = room2.getId();
            if (((LiveRoomUserInfoWidget) c521890KdP.l0).LLLLLJLJLL.getOwner() != null) {
                id = ((LiveRoomUserInfoWidget) c521890KdP.l0).LLLLLJLJLL.getOwner().getId();
            } else {
                id = 0;
            }
            boolean z2 = false;
            if (!((LiveRoomUserInfoWidget) c521890KdP.l0).LLLLLL && ((IUserInfoWidgetService) C1161920gLG.LIZJ(IUserInfoWidgetService.class)).YI0(((LiveRoomUserInfoWidget) c521890KdP.l0).LLLLLJLJLL)) {
                z = true;
            } else {
                z = false;
            }
            LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) c521890KdP.l0;
            long j2 = liveRoomUserInfoWidget.LLILLJJLI;
            boolean z3 = liveRoomUserInfoWidget.LLLLLL;
            if (AbstractC19994813Le.Default.nextDouble() < LiveUserInfoAvatarLoadMonitorSampleRateSetting.getValue()) {
                try {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    if (j2 > 0) {
                        j = jElapsedRealtime - j2;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("room_id", id2);
                    jSONObject.put("anchor_id", id);
                    jSONObject.put("is_official_channel", z);
                    jSONObject.put("is_anchor", z3);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("duration_ms", j);
                    if (str == null || str.length() == 0) {
                        z2 = true;
                    }
                    jSONObject2.put("has_image_url", !z2);
                    JSONObject jSONObject3 = new JSONObject();
                    ILoggerService iLoggerService = (ILoggerService) C1161920gLG.LIZJ(ILoggerService.class);
                    if (iLoggerService != null && (c1cc3MN2 = iLoggerService.MN2()) != null) {
                        c1cc3MN2.LJIL("notify_component", "ttlive_userinfo_widget_avatar_load_monitor", jSONObject, jSONObject2, jSONObject3);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    public static final void LIZJ$9(C521890KdP c521890KdP, int i, int i2, String str) {
        ((LivePreloadUserInfoWidget) c521890KdP.l0).LLIZLLLIL = true;
    }
}
