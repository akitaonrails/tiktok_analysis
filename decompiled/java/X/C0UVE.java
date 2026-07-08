package X;

import android.content.Context;
import android.os.Build;
import com.bytedance.android.live.broadcast.api.FloatWindowEnterBackground;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.livesetting.broadcast.FloatWindowContinueLiveABSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import qo2.w;

/* JADX INFO: renamed from: X.0UVE, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UVE {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static String LJFF = "";

    public static boolean LIZ() {
        return FloatWindowContinueLiveABSetting.INSTANCE.isMatch();
    }

    public static boolean LIZJ() {
        Boolean bool = InterfaceC1106030et7.O8.LIZIZ().get(String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static boolean LIZIZ(DataChannel dataChannel) {
        LiveMode liveModeLIZJ;
        if (!LIZ()) {
            return false;
        }
        ConcurrentHashSet<C0U3Q> concurrentHashSet = C0U3P.LIZ;
        if (C0U3P.LIZIZ(C0U3Q.COMMERCE)) {
            return false;
        }
        if (dataChannel != null) {
            liveModeLIZJ = C751980Tee.LIZJ(dataChannel);
        } else {
            liveModeLIZJ = null;
        }
        if (liveModeLIZJ != LiveMode.VIDEO || Build.VERSION.SDK_INT < 29) {
            return false;
        }
        return true;
    }

    public static void LIZLLL(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_small_window_click");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(String.valueOf(w.LJ()), "anchor_id");
        c474500IjALIZ.LJJII(String.valueOf(w.LJIJJ()), "room_id");
        c474500IjALIZ.LJJII(LJFF, "setting_from");
        c474500IjALIZ.LJJII(str, "setting_status");
        c474500IjALIZ.LIZ();
    }

    public static void LJFF(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_small_window_info_show");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(String.valueOf(w.LJ()), "anchor_id");
        c474500IjALIZ.LJJII(String.valueOf(w.LJIJJ()), "room_id");
        c474500IjALIZ.LJJII(str, "info_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJI(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_small_window_permission_step");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(String.valueOf(w.LJ()), "anchor_id");
        c474500IjALIZ.LJJII(String.valueOf(w.LJIJJ()), "room_id");
        c474500IjALIZ.LJJII(str, "type");
        c474500IjALIZ.LIZ();
    }

    public static void LJII(String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_small_window_popup");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(String.valueOf(w.LJ()), "anchor_id");
        c474500IjALIZ.LJJII(String.valueOf(w.LJIJJ()), "room_id");
        c474500IjALIZ.LJJII(str, "popup_status");
        c474500IjALIZ.LJJII(str2, "click_area");
        c474500IjALIZ.LIZ();
    }

    public static void LJIIIIZZ(Context context, String str) {
        if (context == null) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_small_window_show");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(String.valueOf(w.LJ()), "anchor_id");
        c474500IjALIZ.LJJII(String.valueOf(w.LJIJJ()), "room_id");
        c474500IjALIZ.LJJII(LJFF, "setting_from");
        c474500IjALIZ.LJJII(str, "setting_status");
        c474500IjALIZ.LJJII(Integer.valueOf(C0W78.LJFF(context) ? 1 : 0), "has_permission");
        c474500IjALIZ.LIZ();
    }

    public static boolean LJIIIZ(Context context, DataChannel dataChannel) {
        int iIntValue;
        int iIntValue2;
        boolean z;
        LiveMode liveModeLIZJ;
        Integer num;
        if (context == null) {
            return false;
        }
        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        if (dataChannel != null && (num = (Integer) dataChannel.gg0(FloatWindowEnterBackground.class)) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        Integer num2 = InterfaceC1106030et7.Q8.LIZIZ().get(strValueOf);
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = 0;
        }
        if (LIZJ() && C0W78.LJFF(context)) {
            z = true;
        } else {
            z = false;
        }
        if (iIntValue < 1 || !LIZ() || z || Build.VERSION.SDK_INT < 29) {
            return false;
        }
        if (dataChannel != null) {
            liveModeLIZJ = C751980Tee.LIZJ(dataChannel);
        } else {
            liveModeLIZJ = null;
        }
        if (liveModeLIZJ != LiveMode.VIDEO) {
            return false;
        }
        ConcurrentHashSet<C0U3Q> concurrentHashSet = C0U3P.LIZ;
        if (C0U3P.LIZIZ(C0U3Q.COMMERCE) || LIZ || iIntValue2 >= 3) {
            return false;
        }
        return true;
    }

    public static boolean LJIIJ(Context context, DataChannel dataChannel) {
        LiveMode liveModeLIZJ;
        if (context == null) {
            return false;
        }
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Kz();
        if (!((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).o1() && !((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).k81() && !((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).ib2() && !((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).w9() && FloatWindowContinueLiveABSetting.INSTANCE.isMatch() && C0W78.LJFF(context)) {
            ConcurrentHashSet<C0U3Q> concurrentHashSet = C0U3P.LIZ;
            if (!C0U3P.LIZIZ(C0U3Q.COMMERCE) && LIZJ() && Build.VERSION.SDK_INT >= 29 && LIZLLL && !LJ) {
                if (dataChannel != null) {
                    liveModeLIZJ = C751980Tee.LIZJ(dataChannel);
                } else {
                    liveModeLIZJ = null;
                }
                if (liveModeLIZJ == LiveMode.VIDEO) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean LJIIJJI(Context context, DataChannel dataChannel) {
        boolean z;
        LiveMode liveModeLIZJ;
        if (LIZJ() && C0W78.LJFF(context)) {
            z = true;
        } else {
            z = false;
        }
        if (LIZ()) {
            ConcurrentHashSet<C0U3Q> concurrentHashSet = C0U3P.LIZ;
            if (!C0U3P.LIZIZ(C0U3Q.COMMERCE) && z) {
                if (dataChannel != null) {
                    liveModeLIZJ = C751980Tee.LIZJ(dataChannel);
                } else {
                    liveModeLIZJ = null;
                }
                if (liveModeLIZJ == LiveMode.VIDEO && Build.VERSION.SDK_INT >= 29) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static void LJ(String str, Long l, String str2, C0UGY c0ugy) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_small_window_duration");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(String.valueOf(w.LJ()), "anchor_id");
        c474500IjALIZ.LJJII(String.valueOf(w.LJIJJ()), "room_id");
        c474500IjALIZ.LJJII(str, "background_status");
        c474500IjALIZ.LJJII(l, "duration");
        c474500IjALIZ.LJJII(str2, "type");
        c474500IjALIZ.LJJII(c0ugy, "end_type");
        c474500IjALIZ.LIZ();
    }
}
