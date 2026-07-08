package X;

import Y.ARunnableS107S0100000_7;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestTopLiveIterationPhase1Setting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.LiveOptFluencyRecoExp;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0J6q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C486660J6q {
    public static boolean LIZ;
    public static final boolean LIZIZ;

    static {
        LIZIZ = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).U5() && ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).m3();
    }

    public static String LIZIZ() {
        InterfaceC482440Ivy interfaceC482440IvyUt;
        return (C0J0B.LIZ().enable && (interfaceC482440IvyUt = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().k4().ut()) != null) ? ((C486690J6t) interfaceC482440IvyUt).LIZJ(C0IVO.FOLLOW_SCENE) ? "1" : CardStruct.IStatusCode.DEFAULT : CardStruct.IStatusCode.DEFAULT;
    }

    public static String LIZJ() {
        InterfaceC482440Ivy interfaceC482440IvyUt;
        return (C0J8Q.LIZ() && (interfaceC482440IvyUt = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().k4().ut()) != null) ? ((C486690J6t) interfaceC482440IvyUt).LIZJ(C0IVO.COLD_START) ? "1" : CardStruct.IStatusCode.DEFAULT : CardStruct.IStatusCode.DEFAULT;
    }

    public static String LIZLLL() {
        InterfaceC486670J6r interfaceC486670J6rOt;
        return (!LJI() || (interfaceC486670J6rOt = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().k4().ot()) == null) ? "" : interfaceC486670J6rOt.LIZJ();
    }

    public static String LJ() {
        InterfaceC486670J6r interfaceC486670J6rOt;
        return (!LJI() || (interfaceC486670J6rOt = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().k4().ot()) == null) ? "" : interfaceC486670J6rOt.LIZLLL();
    }

    public static boolean LJI() {
        return C486680J6s.LIZ().getEnableEcomLiveShowListLoadOpt() ? ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).a5() : ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).isInitedLiveSDK();
    }

    public static void LJIIIIZZ() {
        C0J9A c0j9aV3 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).v3();
        c0j9aV3.LJIILLIIL();
        if (c0j9aV3.LJIILL()) {
            return;
        }
        c0j9aV3.LJJI();
        if (c0j9aV3.LJJII(true)) {
            HashMap map = new HashMap();
            map.put("widget_type", "medium");
            C20684815ws.LJIILLIIL("livesdk_launch_widget", map);
        }
        if (c0j9aV3.LJJII(false)) {
            HashMap map2 = new HashMap();
            map2.put("widget_type", "small");
            C20684815ws.LJIILLIIL("livesdk_launch_widget", map2);
        }
    }

    public static void LIZ(Map<String, String> map) {
        InterfaceC486670J6r interfaceC486670J6rOt = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().k4().ot();
        if (interfaceC486670J6rOt != null) {
            interfaceC486670J6rOt.LIZIZ(map);
        }
    }

    public static void LJIIJ(Map<String, String> map) {
        String str;
        if (LIZIZ && !LIZ) {
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).I5("SendLiveLog-livesdk_live_show");
            LIZ = true;
        }
        if (C497740JfY.LJIL()) {
            str = "portrait";
        } else {
            str = "landscape";
        }
        map.put("room_orientation", str);
        C20684815ws.LJIILLIIL("livesdk_live_show", map);
        if (LiveOptFluencyRecoExp.isDisable()) {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS107S0100000_7(map, 271));
        } else {
            LIZ(map);
        }
    }

    public static void LJII(String str, String str2) {
        InterfaceC482440Ivy interfaceC482440IvyUt;
        InterfaceC482440Ivy interfaceC482440IvyUt2;
        String str3;
        HashMap map = new HashMap();
        if (MultiGuestTopLiveIterationPhase1Setting.isEnable()) {
            C0INV c0inv = C0IL2.LIZ;
            if (c0inv.LIZ() != null && c0inv.LIZ().mEnterRoomConfig != null && c0inv.LIZ().mEnterRoomConfig.mLogData != null && (str3 = c0inv.LIZ().mEnterRoomConfig.mLogData.topLiveSource) != null) {
                str = str3;
                str2 = str3;
                map.put("enter_tab_action", "enter_toplive");
            }
        }
        map.put("enter_from_merge", str);
        if (str2 != null) {
            map.put("enter_method", str2);
        }
        map.put("content_type", "live_room");
        map.put("_param_live_platform", "live");
        if (C0J8Q.LIZ() && (interfaceC482440IvyUt2 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().k4().ut()) != null) {
            if (((C486690J6t) interfaceC482440IvyUt2).LIZJ(C0IVO.COLD_START)) {
                map.put("is_following_live_guide", "1");
                map.put("guide_scene", "coldstart");
            } else {
                map.put("is_following_live_guide", CardStruct.IStatusCode.DEFAULT);
            }
        }
        if (C0J0B.LIZ().enable && (interfaceC482440IvyUt = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().k4().ut()) != null) {
            C0IVO c0ivo = C0IVO.FOLLOW_SCENE;
            C486690J6t c486690J6t = (C486690J6t) interfaceC482440IvyUt;
            if (c486690J6t.LIZJ(c0ivo)) {
                C486730J6x c486730J6x = c486690J6t.LIZ().get(c0ivo.getKey());
                map.put("is_new_follow_live_guide", "1");
                map.put("guide_scene", "newfollow");
                if (c486730J6x != null) {
                    map.put("follow_scene", c486730J6x.LIZJ);
                }
            } else {
                map.put("is_new_follow_live_guide", CardStruct.IStatusCode.DEFAULT);
            }
        }
        C20684815ws.LJIILLIIL("livesdk_enter_live_merge", map);
    }

    public static JSONObject LJFF(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("position", str);
            C844470XAv.LIZ.getClass();
            String str4 = C844470XAv.LJ;
            if (str4 == null) {
                str4 = null;
            }
            if (TextUtils.equals(str4, "musical_ly")) {
                if (TextUtils.equals(str, "push")) {
                    str2 = "click_push";
                } else {
                    if (!TextUtils.equals(str, "homepage_follow") || !TextUtils.equals(str2, "head")) {
                        if (!TextUtils.equals(str, "others_homepage") && !TextUtils.equals(str2, "video")) {
                            if (TextUtils.equals(str, "message")) {
                            }
                        } else {
                            str2 = "click_head";
                        }
                    }
                    str2 = "click_watch_button";
                }
                jSONObject.put("enter_method", str2);
            } else {
                jSONObject.put("style", str2);
            }
            jSONObject.put("request_id", str3);
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    public static void LJIIJJI(long j, String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("anchor_id", str);
        c2344009Gk.LJIIIIZZ("anchor_status", str2);
        if (j <= 0) {
            j = 0;
        }
        c2344009Gk.LJIIIIZZ("room_id", String.valueOf(j));
        C20684815ws.LJIILLIIL("livesdk_push_click_lookup_anchor", c2344009Gk.LIZ);
    }

    public static void LJIIL(String str, String str2, String str3) {
        String str4;
        int iLJII = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).X3().LJII();
        HashMap map = new HashMap();
        map.put("room_id", str);
        map.put("anchor_id", str2);
        map.put("action_type", str3);
        if (iLJII > 0) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_guest_connection", str4);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(iLJII);
        sbLIZ.append("");
        map.put("guest_cnt", C2188811AlT.LIZIZ(sbLIZ));
        C20684815ws.LJIILLIIL("livesdk_multi_share_add_to_story", map);
    }

    public static void LJIIIZ(int i, String str, long j, JSONObject jSONObject) {
        if (i == 0) {
            C20684815ws.LJIIJ(j, "impression", "live", str, jSONObject);
        } else {
            if (i != 1) {
                return;
            }
            C20684815ws.LJIIJ(j, "enter_detail", "live_aud", str, jSONObject);
        }
    }

    public static void LJIILIIL(int i, String str, String str2, String str3, String str4, boolean z) {
        Object obj;
        HashMap map = new HashMap();
        map.put("room_id", str);
        map.put("anchor_id", str2);
        map.put("author_id", str3);
        map.put("action_type", str4);
        String str5 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_on_live", obj);
        if (i <= 0) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_guest_connection", str5);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append("");
        map.put("guest_cnt", C2188811AlT.LIZIZ(sbLIZ));
        C20684815ws.LJIILLIIL("livesdk_multi_story_live_page", map);
    }
}
