package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.015V, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C015V {
    public static Map LIZIZ() {
        return C2097608Jq.LJIIIIZZ(new Pair("btn_name", "icon"), new Pair("user_type", "host"), new Pair("user_id", String.valueOf(UserService.getInstance().user().getCurrentUserId())), new Pair("live_type", "video_live"), new Pair("page_name", "live_start"), new Pair("page_from", "toggle_popup"));
    }

    public static IGamePartnershipService LIZJ() {
        return C015X.LIZIZ.getValue();
    }

    public static boolean LIZ(boolean z) {
        if (z) {
            if (C015X.LIZ == LiveMode.VIDEO) {
                return false;
            }
            return true;
        }
        if (C015X.LIZ != LiveMode.VIDEO) {
            return false;
        }
        return true;
    }

    public static void LJ(InterfaceC1141530foN interfaceC1141530foN) {
        C1548820qPI.LIZLLL("gamePartnershipChangeTaskShowStatus", interfaceC1141530foN);
        C1548820qPI.LIZLLL("gamePartnershipFirstHideTask", interfaceC1141530foN);
        C1548820qPI.LIZLLL("gamePartnershipAgeNotMatch", interfaceC1141530foN);
        C1548820qPI.LIZLLL("gamePartnershipNeedFillAge", interfaceC1141530foN);
    }

    public static void LJFF(InterfaceC1141530foN interfaceC1141530foN) {
        C1548820qPI.LJIIIIZZ("gamePartnershipChangeTaskShowStatus", interfaceC1141530foN);
        C1548820qPI.LJIIIIZZ("gamePartnershipFirstHideTask", interfaceC1141530foN);
        C1548820qPI.LJIIIIZZ("gamePartnershipAgeNotMatch", interfaceC1141530foN);
        C1548820qPI.LJIIIIZZ("gamePartnershipNeedFillAge", interfaceC1141530foN);
        C1548820qPI.LJIIIIZZ("gamePartnershipOpenLiveTopicUpdate", interfaceC1141530foN);
    }

    public static void LIZLLL(boolean z, C262100zr c262100zr, Context context, C015T c015t) {
        WeakReference<Activity> weakReference;
        Activity activity;
        String strLJFF;
        WeakReference<Activity> weakReference2;
        Activity activity2;
        String strLJFF2;
        InterfaceC1107590evd interfaceC1107590evd;
        InterfaceC1871820yoG interfaceC1871820yoG;
        String str = c262100zr.LIZ;
        int iHashCode = str.hashCode();
        Map<String, Object> mapLIZ = null;
        String str2 = "";
        if (iHashCode != -1825482305) {
            if (iHashCode != -1649822732) {
                if (iHashCode == -92014043 && str.equals("gamePartnershipFirstHideTask") && !LIZ(z) && (interfaceC1107590evd = c262100zr.LIZIZ) != null && (interfaceC1871820yoG = interfaceC1107590evd.get("isFromApp")) != null && interfaceC1871820yoG.asInt() == 0 && LIZJ().oK0() != null) {
                    InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd2 != null) {
                        mapLIZ = interfaceC1107590evd2.LIZ();
                    }
                    C01GU.LJIIIIZZ(context, mapLIZ);
                    return;
                }
                return;
            }
            if (str.equals("gamePartnershipNeedFillAge") && !LIZ(z) && c015t != null && (weakReference2 = c015t.LL) != null && (activity2 = weakReference2.get()) != null) {
                IGamePartnershipService iGamePartnershipServiceLIZJ = LIZJ();
                InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
                if (interfaceC1107590evd3 != null && (strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd3, "request_page", "")) != null) {
                    str2 = strLJFF2;
                }
                iGamePartnershipServiceLIZJ.BP0(activity2, "anchor", str2, new C5185020h(c262100zr, 6));
                return;
            }
            return;
        }
        if (str.equals("gamePartnershipAgeNotMatch") && !LIZ(z) && c015t != null && (weakReference = c015t.LL) != null && (activity = weakReference.get()) != null) {
            IGamePartnershipService iGamePartnershipServiceLIZJ2 = LIZJ();
            InterfaceC1107590evd interfaceC1107590evd4 = c262100zr.LIZIZ;
            if (interfaceC1107590evd4 != null && (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd4, "request_page", "")) != null) {
                str2 = strLJFF;
            }
            iGamePartnershipServiceLIZJ2.bO(activity, "anchor", str2);
        }
    }
}
