package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.chatroom.viewmodule.NewTopRightBannerWidget;
import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveBannerDegradeSettings;
import com.bytedance.android.livesdk.livesetting.roomfunction.mainframework.TextDisplayHybirdReportSetting;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.android.livesdk.model.message.InRoomBannerMessage;
import com.bytedance.android.livesdk.model.message.MgActivityInRoomBannerMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: renamed from: X.0egY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1098240egY extends AbstractC1098270egb implements InterfaceC1141530foN {
    public final String LLIZLLLIL;
    public InterfaceC1105930esx LLJ;

    public abstract void LJJIIJ();

    @Override // X.AbstractC1098270egb
    public void LIZJ() throws JSONException {
        InterfaceC1105930esx interfaceC1105930esx = this.LLJ;
        if (interfaceC1105930esx != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exposure_end_type", "slide");
            interfaceC1105930esx.LIZ("live_banner_exposure_end_event", jSONObject);
        }
        C1548820qPI.LJIIIIZZ("js_event_banner_ready_live", this);
        C1548820qPI.LJIIIIZZ("js_event_banner_ready_live_v2", this);
        C1548820qPI.LJIIIIZZ("banner_lynx_container_client_event", this);
        C1548820qPI.LJIIIIZZ("live_effect_notify_ready_event", this);
        C1548820qPI.LJIIIIZZ("live_effect_notify_consumed_event", this);
        C1548820qPI.LJIIIIZZ("live_report_text_display_recv_event", this);
        this.LL = null;
    }

    @Override // X.AbstractC1098270egb
    public final View LJFF() {
        InterfaceC1105930esx interfaceC1105930esx = this.LLJ;
        if (interfaceC1105930esx != null) {
            return interfaceC1105930esx.LJII();
        }
        return null;
    }

    @Override // X.AbstractC1098270egb
    public final long LJI() {
        if (this.LLILLL) {
            return 0L;
        }
        return LiveBannerDegradeSettings.INSTANCE.delayMillis();
    }

    @Override // X.AbstractC1098270egb
    public final void LJIIIIZZ() {
        String str = this.LLIZLLLIL;
        if (str == null || str.length() == 0) {
            return;
        }
        C1548820qPI.LIZLLL("js_event_banner_ready_live", this);
        C1548820qPI.LIZLLL("js_event_banner_ready_live_v2", this);
        C1548820qPI.LIZLLL("banner_lynx_container_client_event", this);
        C1548820qPI.LIZLLL("live_effect_notify_ready_event", this);
        C1548820qPI.LIZLLL("live_effect_notify_consumed_event", this);
        C1548820qPI.LIZLLL("live_report_text_display_recv_event", this);
        NewTopRightBannerWidget newTopRightBannerWidget = this.LLILZIL;
        if (newTopRightBannerWidget != null) {
            newTopRightBannerWidget.M1();
        }
        try {
            LJJIIJ();
            View viewLJFF = LJFF();
            if (viewLJFF != null) {
                viewLJFF.setBackgroundColor(0);
            }
            NewTopRightBannerWidget newTopRightBannerWidget2 = this.LLILZIL;
            if (newTopRightBannerWidget2 != null) {
                InterfaceC1105930esx interfaceC1105930esx = this.LLJ;
                newTopRightBannerWidget2.N1(interfaceC1105930esx != null ? interfaceC1105930esx.getOptimization() : -1, this.LLILLJJLI);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            NewTopRightBannerWidget newTopRightBannerWidget3 = this.LLILZIL;
            if (newTopRightBannerWidget3 != null) {
                newTopRightBannerWidget3.L1(e.getMessage(), this.LLILLJJLI);
            }
        }
    }

    @Override // X.AbstractC1098270egb
    public final void LJIILL() throws JSONException {
        InterfaceC1105930esx interfaceC1105930esx = this.LLJ;
        if (interfaceC1105930esx != null) {
            interfaceC1105930esx.LJIIJJI();
        }
        InterfaceC1105930esx interfaceC1105930esx2 = this.LLJ;
        if (interfaceC1105930esx2 != null) {
            interfaceC1105930esx2.LIZ("container_disappear", new JSONObject());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "app");
            jSONObject.put("args", new JSONObject().put("foreground", false));
            interfaceC1105930esx2.LIZ("H5_appStateChange", jSONObject);
        }
    }

    @Override // X.AbstractC1098270egb
    public final void LJIJ() {
        InterfaceC1105930esx interfaceC1105930esx = this.LLJ;
        if (interfaceC1105930esx != null) {
            interfaceC1105930esx.LIZ("live_report_text_display_send_event", new JSONObject());
        }
    }

    public final JSONObject LJJIFFI() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        w.LIZ.getClass();
        JSONObject jSONObjectPut = jSONObject.put("enter_from_merge", w.LJIIIZ()).put("enter_method", w.LJIIL()).put("event_page", this.LLILLL ? "live_take_detail" : "live_detail");
        Room room = this.LLILZ;
        JSONObject jSONObjectPut2 = jSONObjectPut.put("room_id", room != null ? Long.valueOf(room.getId()).toString() : null);
        Room room2 = this.LLILZ;
        JSONObject jSONObjectPut3 = jSONObjectPut2.put("anchor_id", String.valueOf(room2 != null ? Long.valueOf(room2.getOwnerUserId()) : null));
        Room room3 = this.LLILZ;
        JSONObject jSONObjectPut4 = jSONObjectPut3.put("request_id", room3 != null ? room3.getRequestId() : null);
        Room room4 = this.LLILZ;
        jSONObjectPut4.put("log_pb", room4 != null ? room4.getLog_pb() : null);
        return jSONObject;
    }

    public final void LJJIII() throws JSONException {
        InterfaceC1105930esx interfaceC1105930esx = this.LLJ;
        if (interfaceC1105930esx != null) {
            interfaceC1105930esx.LJIIL();
        }
        InterfaceC1105930esx interfaceC1105930esx2 = this.LLJ;
        if (interfaceC1105930esx2 != null) {
            interfaceC1105930esx2.LIZ("container_appear", new JSONObject());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "app");
            jSONObject.put("args", new JSONObject().put("foreground", true));
            interfaceC1105930esx2.LIZ("H5_appStateChange", jSONObject);
        }
    }

    @Override // X.AbstractC1098270egb
    public final boolean LJII() {
        return this.LLILLL;
    }

    @Override // X.AbstractC1098270egb
    public final void LJIILLIIL() throws JSONException {
        LJJIII();
    }

    public static final void LJJ(String str) {
        InterfaceC499240Jhy interfaceC499240JhyHi = ((IDebugService) C1161920gLG.LIZJ(IDebugService.class)).Hi();
        if (interfaceC499240JhyHi != null) {
            ((C1098510egz) interfaceC499240JhyHi).LIZ("BannerHybrid", str);
        }
    }

    public static C1098290egd LJJI(C262100zr c262100zr) {
        String strLJFF;
        int iLIZLLL;
        String strLJFF2;
        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
        Integer numValueOf = null;
        if (interfaceC1107590evd != null) {
            int iLIZLLL2 = C1871910yoP.LIZLLL(interfaceC1107590evd, "biz", 0);
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            if (interfaceC1107590evd2 != null) {
                int iLIZLLL3 = C1871910yoP.LIZLLL(interfaceC1107590evd2, Scene.SCENE_SERVICE, 0);
                InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
                if (interfaceC1107590evd3 != null && (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd3, FollowStatusChangeMethod.PARAM_UID, "")) != null) {
                    InterfaceC1107590evd interfaceC1107590evd4 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd4 != null) {
                        iLIZLLL = C1871910yoP.LIZLLL(interfaceC1107590evd4, "duration", 0);
                    } else {
                        iLIZLLL = 0;
                    }
                    long j = iLIZLLL;
                    InterfaceC1107590evd interfaceC1107590evd5 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd5 != null) {
                        strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd5, "container_id", "");
                    } else {
                        strLJFF2 = null;
                    }
                    InterfaceC1107590evd interfaceC1107590evd6 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd6 != null) {
                        numValueOf = Integer.valueOf(C1871910yoP.LIZLLL(interfaceC1107590evd6, "consume_method", 0));
                    }
                    return new C1098290egd(strLJFF, 3, iLIZLLL2, iLIZLLL3, j, strLJFF2, numValueOf);
                }
            }
        }
        return null;
    }

    @Override // X.AbstractC1098270egb
    public final void LIZIZ(IMessage iMessage) throws JSONException {
        if (iMessage instanceof InRoomBannerMessage) {
            String json = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, (k) ((InRoomBannerMessage) iMessage).extra);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "refresh");
            jSONObject.put("data", json);
            jSONObject.put("log", LJJIFFI());
            InterfaceC1105930esx interfaceC1105930esx = this.LLJ;
            if (interfaceC1105930esx != null) {
                interfaceC1105930esx.LIZ("H5_roomStatusChange", jSONObject);
                return;
            }
            return;
        }
        if (!(iMessage instanceof MgActivityInRoomBannerMessage)) {
            return;
        }
        String json2 = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, iMessage);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "refresh");
        jSONObject2.put("data", json2);
        jSONObject2.put("log", LJJIFFI());
        InterfaceC1105930esx interfaceC1105930esx2 = this.LLJ;
        if (interfaceC1105930esx2 == null) {
            return;
        }
        interfaceC1105930esx2.LIZ("webcast_mg_activity_room_message", jSONObject2);
    }

    @Override // X.AbstractC1098270egb
    public final void LJ(C1098290egd c1098290egd) throws JSONException {
        String string;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("force shrink banner, banner: ");
        sbLIZ.append(c1098290egd);
        LJJ(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1105930esx interfaceC1105930esx = this.LLJ;
        if (interfaceC1105930esx != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FollowStatusChangeMethod.PARAM_UID, c1098290egd.LIZ);
            jSONObject.put("effect_notify_id", c1098290egd.LIZ);
            jSONObject.put(Scene.SCENE_SERVICE, c1098290egd.LIZLLL);
            jSONObject.put("biz", c1098290egd.LIZJ);
            Room room = this.LLILZ;
            if (room != null) {
                string = Long.valueOf(room.getId()).toString();
            } else {
                string = null;
            }
            jSONObject.put("room_id", string);
            jSONObject.put("container_id", c1098290egd.LJFF);
            jSONObject.put("action", "force_shrink");
            interfaceC1105930esx.LIZ("banner_lynx_client_force_shrink", jSONObject);
        }
    }

    @Override // X.AbstractC1098270egb
    public final void LJIIJJI(boolean z) {
        View viewLJFF = LJFF();
        if (viewLJFF != null) {
            viewLJFF.setFocusable(!z);
        }
    }

    @Override // X.AbstractC1098270egb
    public final void LJIIL(C782680Un4 c782680Un4) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, c782680Un4.LIZ);
        InterfaceC1105930esx interfaceC1105930esx = this.LLJ;
        if (interfaceC1105930esx != null) {
            interfaceC1105930esx.LIZ("H5_linkMicStatusChanged", jSONObject);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    @Override // X.AbstractC1098270egb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(X.C784060UpI r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            X.0esx r2 = r5.LLJ
            if (r2 == 0) goto L39
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            X.0ehK r0 = r6.LIZ
            if (r0 == 0) goto L40
            int[] r1 = X.C1098710ehJ.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L3d
            r0 = 2
            if (r1 == r0) goto L3a
            r0 = 3
            if (r1 != r0) goto L40
            java.lang.String r1 = "3"
        L28:
            java.lang.String r0 = "code"
            org.json.JSONObject r1 = r3.put(r0, r1)
            java.lang.String r0 = "args"
            org.json.JSONObject r1 = r4.put(r0, r1)
            java.lang.String r0 = "H5_loginStatus"
            r2.LIZ(r0, r1)
        L39:
            return
        L3a:
            java.lang.String r1 = "2"
            goto L28
        L3d:
            java.lang.String r1 = "1"
            goto L28
        L40:
            java.lang.String r1 = "0"
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1098240egY.LJIILIIL(X.0UpI):void");
    }

    @Override // X.AbstractC1098270egb
    public final void LJIILJJIL(boolean z) {
        InterfaceC1105930esx interfaceC1105930esx;
        if (z && (interfaceC1105930esx = this.LLJ) != null) {
            interfaceC1105930esx.LIZ("H5_micRoomStateChanged", new JSONObject());
        }
    }

    @Override // X.AbstractC1098270egb
    public final void LJIIZILJ(List<? extends BannerInRoom> list) throws JSONException {
        this.LLILLJJLI = list;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("data", C2348809Ig.LJIIIIZZ(list));
        jSONObject.put("type", "init");
        InterfaceC1105930esx interfaceC1105930esx = this.LLJ;
        if (interfaceC1105930esx != null) {
            interfaceC1105930esx.LIZ("H5_roomStatusChange", jSONObject);
        }
    }

    @Override // X.AbstractC1098270egb
    public final boolean LJIJI(IMessage iMessage) {
        if (iMessage instanceof InRoomBannerMessage) {
            int i = ((InRoomBannerMessage) iMessage).position;
            if (i != 2 && i != 5 && i != 1) {
                return false;
            }
            return true;
        }
        if (!(iMessage instanceof MgActivityInRoomBannerMessage)) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC1098270egb
    public final void LJIJJ(C1098290egd c1098290egd) throws JSONException {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start marquee banner, banner: ");
        sbLIZ.append(c1098290egd);
        LJJ(C2188811AlT.LIZIZ(sbLIZ));
        LJJII("live_effect_notify_activate_event", c1098290egd, null);
    }

    @Override // X.AbstractC1098270egb
    public final void LJIL(C1098290egd c1098290egd) throws JSONException {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stop marquee banner, banner: ");
        sbLIZ.append(c1098290egd);
        LJJ(C2188811AlT.LIZIZ(sbLIZ));
        LJJII("live_effect_notify_inactivate_event", c1098290egd, null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String str;
        String strLJFF;
        InterfaceC1107590evd interfaceC1107590evd;
        Integer numValueOf;
        C1098290egd c1098290egdLJJI;
        InterfaceC1107590evd interfaceC1107590evd2;
        Integer numValueOf2;
        C1098290egd c1098290egdLJJI2;
        InterfaceC1107590evd interfaceC1107590evd3;
        String strLJFF2;
        C1098290egd c1098290egdLJJI3;
        String strLJFF3;
        String strLJFF4;
        String strLJFF5;
        Integer numValueOf3;
        String strLJFF6;
        String strLJFF7;
        Integer numValueOf4;
        Integer numValueOf5;
        String str2;
        Long lValueOf;
        Long lValueOf2;
        String str3;
        String str4;
        int width;
        View view;
        LiveMode streamType;
        String str5 = "hide";
        String str6 = c262100zr.LIZ;
        String str7 = "";
        switch (str6.hashCode()) {
            case -2128891488:
                if (str6.equals("js_event_banner_ready_live")) {
                    try {
                        InterfaceC1107590evd interfaceC1107590evd4 = c262100zr.LIZIZ;
                        if (interfaceC1107590evd4 == null || (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd4, "banner_state", "hide")) == null) {
                            strLJFF = "hide";
                        }
                        InterfaceC1107590evd interfaceC1107590evd5 = c262100zr.LIZIZ;
                        str = "empty_value";
                        if (interfaceC1107590evd5 != null) {
                            String strLJFF8 = C1871910yoP.LJFF(interfaceC1107590evd5, "fail_reason", "empty_value");
                            if (strLJFF8 != null) {
                                str = strLJFF8;
                            }
                        }
                        str5 = strLJFF;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        str = "exception";
                    }
                    if (Intrinsics.LJFF(str5, "show")) {
                        NewTopRightBannerWidget newTopRightBannerWidget = this.LLILZIL;
                        if (newTopRightBannerWidget != null) {
                            newTopRightBannerWidget.O1();
                        }
                    } else if (this.LLILZIL != null) {
                        C1097990eg9 c1097990eg9 = C1097990eg9.LIZ;
                        C1097990eg9.LIZIZ().LJIIJJI = System.currentTimeMillis();
                        C1098010egB c1098010egBLIZIZ = C1097990eg9.LIZIZ();
                        long jLIZ = C1097990eg9.LIZ(c1098010egBLIZIZ.LJII, c1098010egBLIZIZ.LJIIJJI);
                        long jLIZ2 = C1097990eg9.LIZ(c1098010egBLIZIZ.LJFF, c1098010egBLIZIZ.LJIIJJI);
                        long jLIZ3 = C1097990eg9.LIZ(c1098010egBLIZIZ.LJII, c1098010egBLIZIZ.LJIIJ);
                        HashMap map = new HashMap(c1098010egBLIZIZ.LIZIZ());
                        map.put("duration", Long.valueOf(jLIZ));
                        map.put("duration_from_network", Long.valueOf(jLIZ2));
                        map.put("duration_from_create", Long.valueOf(jLIZ3));
                        map.put("error_message", str);
                        C1097990eg9.LIZJ(c1097990eg9, "container_show", 0, map);
                    }
                }
                break;
            case -1224973954:
                if (str6.equals("live_effect_notify_consumed_event") && (interfaceC1107590evd = c262100zr.LIZIZ) != null && (numValueOf = Integer.valueOf(C1871910yoP.LIZLLL(interfaceC1107590evd, "component", 0))) != null && numValueOf.intValue() == 3 && (c1098290egdLJJI = LJJI(c262100zr)) != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("requestStopMarquee, banner: ");
                    sbLIZ.append(c1098290egdLJJI);
                    LJJ(C2188811AlT.LIZIZ(sbLIZ));
                    NewTopRightBannerWidget newTopRightBannerWidget2 = this.LLILZLL;
                    if (newTopRightBannerWidget2 != null) {
                        newTopRightBannerWidget2.U1(c1098290egdLJJI);
                    }
                    break;
                }
                break;
            case 277957859:
                if (str6.equals("live_effect_notify_ready_event") && (interfaceC1107590evd2 = c262100zr.LIZIZ) != null && (numValueOf2 = Integer.valueOf(C1871910yoP.LIZLLL(interfaceC1107590evd2, "component", 0))) != null && numValueOf2.intValue() == 3 && (c1098290egdLJJI2 = LJJI(c262100zr)) != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("requestStartMarquee, banner: ");
                    sbLIZ2.append(c1098290egdLJJI2);
                    LJJ(C2188811AlT.LIZIZ(sbLIZ2));
                    NewTopRightBannerWidget newTopRightBannerWidget3 = this.LLILZLL;
                    if (newTopRightBannerWidget3 != null) {
                        newTopRightBannerWidget3.T1(c1098290egdLJJI2);
                    }
                    break;
                }
                break;
            case 475924153:
                if (str6.equals("banner_lynx_container_client_event") && (interfaceC1107590evd3 = c262100zr.LIZIZ) != null && (strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd3, "action", "")) != null && (c1098290egdLJJI3 = LJJI(c262100zr)) != null) {
                    if (Intrinsics.LJFF(strLJFF2, "expand")) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("requestExpand, banner: ");
                        sbLIZ3.append(c1098290egdLJJI3);
                        LJJ(C2188811AlT.LIZIZ(sbLIZ3));
                        NewTopRightBannerWidget newTopRightBannerWidget4 = this.LLILZLL;
                        if (newTopRightBannerWidget4 != null) {
                            newTopRightBannerWidget4.S1(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)), c1098290egdLJJI3, new C1098260ega(this));
                        }
                    } else if (Intrinsics.LJFF(strLJFF2, "shrink")) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("requestShrink, banner: ");
                        sbLIZ4.append(c1098290egdLJJI3);
                        LJJ(C2188811AlT.LIZIZ(sbLIZ4));
                        NewTopRightBannerWidget newTopRightBannerWidget5 = this.LLILZLL;
                        if (newTopRightBannerWidget5 != null) {
                            newTopRightBannerWidget5.R1(c1098290egdLJJI3);
                        }
                    }
                    break;
                }
                break;
            case 1863862936:
                if (str6.equals("live_report_text_display_recv_event") && TextDisplayHybirdReportSetting.INSTANCE.enable() && this.LLILZ != null) {
                    InterfaceC1107590evd interfaceC1107590evd6 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd6 != null) {
                        strLJFF3 = C1871910yoP.LJFF(interfaceC1107590evd6, "component_type", "");
                    } else {
                        strLJFF3 = null;
                    }
                    if (Intrinsics.LJFF(strLJFF3, "banner") || strLJFF3 == null || strLJFF3.length() == 0) {
                        InterfaceC1107590evd interfaceC1107590evd7 = c262100zr.LIZIZ;
                        if (interfaceC1107590evd7 != null) {
                            strLJFF4 = C1871910yoP.LJFF(interfaceC1107590evd7, "text", "");
                        } else {
                            strLJFF4 = null;
                        }
                        InterfaceC1107590evd interfaceC1107590evd8 = c262100zr.LIZIZ;
                        if (interfaceC1107590evd8 != null) {
                            strLJFF5 = C1871910yoP.LJFF(interfaceC1107590evd8, "content_type", "");
                        } else {
                            strLJFF5 = null;
                        }
                        InterfaceC1107590evd interfaceC1107590evd9 = c262100zr.LIZIZ;
                        if (interfaceC1107590evd9 != null) {
                            numValueOf3 = Integer.valueOf(C1871910yoP.LIZLLL(interfaceC1107590evd9, "is_complete_show", 0));
                        } else {
                            numValueOf3 = null;
                        }
                        InterfaceC1107590evd interfaceC1107590evd10 = c262100zr.LIZIZ;
                        if (interfaceC1107590evd10 != null) {
                            strLJFF6 = C1871910yoP.LJFF(interfaceC1107590evd10, "incomplete_show_type", "");
                        } else {
                            strLJFF6 = null;
                        }
                        InterfaceC1107590evd interfaceC1107590evd11 = c262100zr.LIZIZ;
                        if (interfaceC1107590evd11 != null) {
                            strLJFF7 = C1871910yoP.LJFF(interfaceC1107590evd11, "sub_business_type", "");
                        } else {
                            strLJFF7 = null;
                        }
                        InterfaceC1107590evd interfaceC1107590evd12 = c262100zr.LIZIZ;
                        if (interfaceC1107590evd12 != null) {
                            numValueOf4 = Integer.valueOf(C1871910yoP.LIZLLL(interfaceC1107590evd12, "character_total_number", 0));
                        } else {
                            numValueOf4 = null;
                        }
                        InterfaceC1107590evd interfaceC1107590evd13 = c262100zr.LIZIZ;
                        if (interfaceC1107590evd13 != null) {
                            numValueOf5 = Integer.valueOf(C1871910yoP.LIZLLL(interfaceC1107590evd13, "character_show_number", 0));
                        } else {
                            numValueOf5 = null;
                        }
                        InterfaceC2262081DgM currentUser = UserService.getInstance().user().getCurrentUser();
                        if (this.LLILLL) {
                            str2 = "anchor";
                        } else if (currentUser.getUserAttr() != null && currentUser.getUserAttr().isAdmin) {
                            str2 = "admin";
                        } else {
                            str2 = "viewer";
                        }
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_container_content_show");
                        Room room = this.LLILZ;
                        if (room != null) {
                            lValueOf = Long.valueOf(room.getOwnerUserId());
                        } else {
                            lValueOf = null;
                        }
                        c474500IjALIZ.LJJII(lValueOf, "anchor_id");
                        Room room2 = this.LLILZ;
                        if (room2 != null) {
                            lValueOf2 = Long.valueOf(room2.getId());
                        } else {
                            lValueOf2 = null;
                        }
                        c474500IjALIZ.LJJII(lValueOf2, "room_id");
                        Room room3 = this.LLILZ;
                        if (room3 != null && (streamType = room3.getStreamType()) != null) {
                            str3 = streamType.logStreamingType;
                        } else {
                            str3 = null;
                        }
                        c474500IjALIZ.LJJII(str3, "live_type");
                        if (this.LLILLL) {
                            str4 = "live_take_detail";
                        } else {
                            str4 = "live_detail";
                        }
                        c474500IjALIZ.LJJII(str4, "event_page");
                        c474500IjALIZ.LJJII(str2, "user_type");
                        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
                        c474500IjALIZ.LJJII("banner", "component_type");
                        c474500IjALIZ.LJJII(strLJFF5, "content_type");
                        c474500IjALIZ.LJJII(C1843330y4J.LIZ(String.valueOf(strLJFF4)).getTypeName(), "language_type");
                        c474500IjALIZ.LJJII(numValueOf4, "character_total_number");
                        c474500IjALIZ.LJJII(numValueOf5, "character_show_number");
                        if (!Intrinsics.LJFF(numValueOf4, numValueOf5)) {
                            str7 = strLJFF6;
                        }
                        c474500IjALIZ.LJJII(str7, "incomplete_show_type");
                        c474500IjALIZ.LJJII(numValueOf3, "is_complete_show");
                        c474500IjALIZ.LJJII(strLJFF7, "sub_business_type");
                        c474500IjALIZ.LJJIFFI(Float.valueOf(C497740JfY.LJJI(C497740JfY.LJIIZILJ())), "device_width");
                        Object obj = this.LLJ;
                        if ((obj instanceof View) && (view = (View) obj) != null) {
                            width = view.getWidth();
                        } else {
                            width = 0;
                        }
                        c474500IjALIZ.LJJIFFI(Float.valueOf(C497740JfY.LJJI(width)), "component_width");
                        c474500IjALIZ.LIZ();
                    }
                    break;
                }
                break;
        }
    }

    @Override // X.AbstractC1098270egb
    public final void LJIJJLI(String str, C1098290egd c1098290egd) throws JSONException {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start marquee banner failed, reason: ");
        sbLIZ.append(str);
        sbLIZ.append(",  banner: ");
        sbLIZ.append(c1098290egd);
        LJJ(C2188811AlT.LIZIZ(sbLIZ));
        LJJII("live_effect_notify_frequency_controlled_event", c1098290egd, str);
    }

    @Override // X.AbstractC1098270egb
    public final void LIZ(int i, int i2, C1098290egd c1098290egd) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shrink banner, banner: ");
        sbLIZ.append(c1098290egd);
        LJJ(C2188811AlT.LIZIZ(sbLIZ));
        NewTopRightBannerWidget newTopRightBannerWidget = this.LLIZ;
        if (newTopRightBannerWidget != null) {
            newTopRightBannerWidget.P1(EnumC1098600eh8.COLLAPSE);
        }
        View viewLJFF = LJFF();
        if (viewLJFF != null) {
            ViewGroup.LayoutParams layoutParams = viewLJFF.getLayoutParams();
            layoutParams.height = i2;
            layoutParams.width = i;
            C786410Ut5.W5(viewLJFF, layoutParams);
        }
        NewTopRightBannerWidget newTopRightBannerWidget2 = this.LLIZ;
        if (newTopRightBannerWidget2 != null) {
            newTopRightBannerWidget2.P1(EnumC1098600eh8.COLLAPSING);
        }
    }

    @Override // X.AbstractC1098270egb
    public final void LIZLLL(int i, int i2, C1098290egd c1098290egd) throws JSONException {
        String string;
        View viewLJFF = LJFF();
        if (viewLJFF != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("expand success: banner: ");
            sbLIZ.append(c1098290egd);
            LJJ(C2188811AlT.LIZIZ(sbLIZ));
            ViewGroup.LayoutParams layoutParams = viewLJFF.getLayoutParams();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FollowStatusChangeMethod.PARAM_UID, c1098290egd.LIZ);
            jSONObject.put("effect_notify_id", c1098290egd.LIZ);
            jSONObject.put(Scene.SCENE_SERVICE, c1098290egd.LIZLLL);
            jSONObject.put("biz", c1098290egd.LIZJ);
            jSONObject.put("container_id", c1098290egd.LJFF);
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 0);
            Room room = this.LLILZ;
            if (room != null) {
                string = Long.valueOf(room.getId()).toString();
            } else {
                string = null;
            }
            jSONObject.put("room_id", string);
            if (layoutParams.height == i2 && layoutParams.width == i) {
                InterfaceC1105930esx interfaceC1105930esx = this.LLJ;
                if (interfaceC1105930esx != null) {
                    interfaceC1105930esx.LIZ("banner_lynx_client_expanded", jSONObject);
                    return;
                }
                return;
            }
            NewTopRightBannerWidget newTopRightBannerWidget = this.LLIZ;
            if (newTopRightBannerWidget != null) {
                newTopRightBannerWidget.P1(EnumC1098600eh8.EXPAND);
            }
            layoutParams.height = i2;
            layoutParams.width = i;
            C786410Ut5.W5(viewLJFF, layoutParams);
            C20441214yg.LJ("main_update", "expand banner ,post banner_lynx_client_expanded");
            InterfaceC1105930esx interfaceC1105930esx2 = this.LLJ;
            if (interfaceC1105930esx2 != null) {
                interfaceC1105930esx2.LIZ("banner_lynx_client_expanded", jSONObject);
            }
            NewTopRightBannerWidget newTopRightBannerWidget2 = this.LLIZ;
            if (newTopRightBannerWidget2 != null) {
                newTopRightBannerWidget2.P1(EnumC1098600eh8.EXPANDING);
            }
        }
    }

    public final void LJJII(String str, C1098290egd c1098290egd, String str2) throws JSONException {
        String string;
        InterfaceC1105930esx interfaceC1105930esx = this.LLJ;
        if (interfaceC1105930esx != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FollowStatusChangeMethod.PARAM_UID, c1098290egd.LIZ);
            jSONObject.put("effect_notify_id", c1098290egd.LIZ);
            jSONObject.put(Scene.SCENE_SERVICE, c1098290egd.LIZLLL);
            jSONObject.put("biz", c1098290egd.LIZJ);
            Room room = this.LLILZ;
            if (room != null) {
                string = Long.valueOf(room.getId()).toString();
            } else {
                string = null;
            }
            jSONObject.put("room_id", string);
            jSONObject.put("container_id", c1098290egd.LJFF);
            jSONObject.put("component", 3);
            if (str2 != null) {
                jSONObject.put("reason", str2);
            }
            interfaceC1105930esx.LIZ(str, jSONObject);
        }
    }

    public AbstractC1098240egY(Context context, String str, List<? extends BannerInRoom> list, boolean z, Room room) {
        super(context, list, z, room);
        this.LLIZLLLIL = str;
    }
}
