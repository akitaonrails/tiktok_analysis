package X;

import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.livesetting.performance.LiveAppLogCommonParamsMergeExp;
import com.bytedance.android.livesdk.livesetting.performance.LiveLogThreadPoolOpt;
import com.bytedance.android.livesdk.livesetting.performance.LiveWidgetExitRoomOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.enterroom.LiveSlardarTagSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.share.ShareFromInfo;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS97S1000000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: renamed from: X.0IjG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C474560IjG implements InterfaceC474510IjB, InterfaceC315080CWs {
    public static final C01GW<Handler> LJIILL = C452501pT.LIZIZ(new C474630IjN());
    public static final Map<Class<? extends Object>, InterfaceC467740IVw<? extends Object>> LJIILLIIL = C2097608Jq.LJIIIIZZ(new Pair(C1142370fpj.class, new InterfaceC467740IVw<C1142370fpj>() { // from class: X.0fpk
        @Override // X.InterfaceC467740IVw
        public final void LIZ(Object obj, String str, Map map) {
            String str2;
            String str3;
            String str4;
            String str5;
            C1142370fpj c1142370fpj = (C1142370fpj) obj;
            if (c1142370fpj != null) {
                Gift gift = c1142370fpj.LIZIZ;
                Prop prop = c1142370fpj.LIZLLL;
                if (2 == c1142370fpj.LJ) {
                    str2 = "guest_";
                } else {
                    str2 = "";
                }
                if (gift != null && gift.LJIIIZ()) {
                    str3 = "animation_gift";
                } else if (c1142370fpj.LJI == 1) {
                    str3 = "single_gift";
                } else if (c1142370fpj.LJII > 1) {
                    str3 = "bunching_gift";
                } else {
                    str3 = "running_gift";
                }
                if (!map.containsKey("request_page")) {
                    map.put("request_page", "normal");
                }
                if (c1142370fpj.LIZJ > 0) {
                    str4 = "prop_type";
                    str5 = "prop_id";
                } else {
                    str4 = "gift_type";
                    str5 = "gift_id";
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append(str3);
                map.put(str4, C2188811AlT.LIZIZ(sbLIZ));
                long j = c1142370fpj.LIZJ;
                if (j <= 0) {
                    j = c1142370fpj.LIZ;
                }
                map.put(str5, String.valueOf(j));
                if (c1142370fpj.LIZJ <= 0) {
                    map.put("gift_cnt", String.valueOf(c1142370fpj.LJI));
                } else {
                    map.put("prop_cnt", String.valueOf(c1142370fpj.LJI));
                }
                map.put("group_cnt", String.valueOf(c1142370fpj.LJII));
                map.put("combo_cnt", String.valueOf(c1142370fpj.LJFF));
                if (2 == c1142370fpj.LJ) {
                    map.put("guest_id", String.valueOf(0L));
                }
                if (c1142370fpj.LIZJ <= 0) {
                    if (gift != null) {
                        map.put("money", String.valueOf(c1142370fpj.LJI * gift.diamondCount));
                    }
                } else if (prop != null && gift != null) {
                    map.put("income", String.valueOf(c1142370fpj.LJI * gift.diamondCount));
                    map.put("money", String.valueOf(c1142370fpj.LJI * gift.diamondCount));
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    long j2 = c1142370fpj.LIZJ;
                    if (j2 <= 0) {
                        jSONObject.put(String.valueOf(c1142370fpj.LIZ), String.valueOf(c1142370fpj.LJI));
                        map.put("gift_info", C786410Ut5.J3(jSONObject));
                    } else {
                        jSONObject.put(String.valueOf(j2), String.valueOf(c1142370fpj.LJI));
                        map.put("prop_info", C786410Ut5.J3(jSONObject));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }), new Pair(C474690IjT.class, new InterfaceC467740IVw<C474690IjT>() { // from class: X.0IjQ
        @Override // X.InterfaceC467740IVw
        public final void LIZ(Object obj, String str, Map map) {
            if (obj != null) {
                map.put("prompt", null);
            }
        }
    }), new Pair(C474130IiZ.class, new InterfaceC467740IVw<C474130IiZ>() { // from class: X.0IiY
        @Override // X.InterfaceC467740IVw
        public final void LIZ(Object obj, String str, Map map) {
            C474130IiZ c474130IiZ = (C474130IiZ) obj;
            if (c474130IiZ != null) {
                if (!TextUtils.isEmpty(c474130IiZ.LIZ)) {
                    map.put("request_page", c474130IiZ.LIZ);
                }
                long j = c474130IiZ.LIZIZ;
                if (j > 0) {
                    map.put("to_user_id", String.valueOf(j));
                }
                if (!TextUtils.isEmpty(null)) {
                    map.put("type", null);
                }
            }
        }
    }), new Pair(C497860Jfk.class, new InterfaceC467740IVw<C497860Jfk>() { // from class: X.0Jfj
        @Override // X.InterfaceC467740IVw
        public final void LIZ(Object obj, String str, Map map) {
            C497860Jfk c497860Jfk = (C497860Jfk) obj;
            if (c497860Jfk != null) {
                long j = c497860Jfk.LIZ;
                if (j > 0) {
                    map.put("channel_id", String.valueOf(j));
                }
                long j2 = c497860Jfk.LIZIZ;
                if (j2 > 0) {
                    map.put("right_user_id", String.valueOf(j2));
                }
                map.put("is_oncemore", String.valueOf(c497860Jfk.LJFF));
                int i = c497860Jfk.LIZJ;
                if (i > 0) {
                    map.put("pk_time", String.valueOf(i));
                    map.put("connection_type", c497860Jfk.LIZLLL);
                    map.put("match_type", null);
                    if (C2093608Ic.LJ(c497860Jfk.LJ)) {
                        map.put("title", c497860Jfk.LJ);
                        return;
                    }
                    return;
                }
                map.put("connection_type", c497860Jfk.LIZLLL);
            }
        }
    }), new Pair(C497890Jfn.class, new InterfaceC467740IVw<C497890Jfn>() { // from class: X.0Jfm
        @Override // X.InterfaceC467740IVw
        public final void LIZ(Object obj, String str, Map map) {
            C497890Jfn c497890Jfn = (C497890Jfn) obj;
            if (c497890Jfn != null) {
                long j = c497890Jfn.LIZIZ;
                if (j > 0) {
                    map.put("invitee_id", String.valueOf(j));
                }
                long j2 = c497890Jfn.LIZ;
                if (j2 > 0) {
                    map.put("inviter_id", String.valueOf(j2));
                }
                if (!C2093608Ic.LJ(null)) {
                    map.put("match_type", null);
                }
                if (!C2093608Ic.LJ(null)) {
                    map.put("end_type", null);
                }
                if (!C2093608Ic.LJ(c497890Jfn.LIZJ)) {
                    map.put("connection_time", c497890Jfn.LIZJ);
                }
                if (!C2093608Ic.LJ(null)) {
                    map.put("invitee_list", null);
                }
                if (!C2093608Ic.LJ(null)) {
                    map.put("is_rematch", null);
                }
                map.put("pk_time", String.valueOf(0));
                if (!C2093608Ic.LJ(null)) {
                    map.put("connection_type", null);
                    throw null;
                }
            }
        }
    }), new Pair(C0IXY.class, new InterfaceC467740IVw<C0IXY>() { // from class: X.0IXX
        @Override // X.InterfaceC467740IVw
        public final void LIZ(Object obj, String str, Map map) {
            C0IXY c0ixy = (C0IXY) obj;
            if (c0ixy != null) {
                C0IHL c0ihl = new C0IHL();
                c0ihl.LIZ("is_ad", c0ixy.LIZ);
                c0ihl.LIZ("creative_id", c0ixy.LIZIZ);
                c0ihl.LIZ("log_extra", c0ixy.LIZJ);
                c0ihl.LIZ("ad_id", c0ixy.LJIIIIZZ);
                c0ihl.LIZ("adv_id", c0ixy.LJIIIZ);
                c0ihl.LIZ("feed_id", c0ixy.LIZLLL);
                c0ihl.LIZ("tag", "live_ad");
                c0ihl.LIZ("label", c0ixy.LJIIJ);
                map.putAll(c0ihl.LIZ);
            }
        }
    }), new Pair(ShareFromInfo.class, new InterfaceC467740IVw<ShareFromInfo>() { // from class: X.0IWa
        @Override // X.InterfaceC467740IVw
        public final void LIZ(Object obj, String str, Map map) {
            C0IWT.LIZ(map, (ShareFromInfo) obj);
        }
    }), new Pair(C0IR5.class, new C0IXM()), new Pair(C0IFD.class, new InterfaceC467740IVw<C0IFD>() { // from class: X.0IWb
        @Override // X.InterfaceC467740IVw
        public final void LIZ(Object obj, String str, Map map) {
            Map<String, String> map2 = ((C0IFD) obj).LIZ;
            if (map2 != null && (!map2.isEmpty())) {
                map.putAll(map2);
            }
        }
    }), new Pair(C0IZK.class, new InterfaceC467740IVw<C0IZK>() { // from class: X.0IZM
        @Override // X.InterfaceC467740IVw
        public final void LIZ(Object obj, String str, Map map) {
            String strValueOf = String.valueOf(((C0IZK) obj).LIZ);
            if (strValueOf != null) {
                map.put("is_between_guide_time", strValueOf);
            }
        }
    }));
    public static final C474570IjH LJIIZILJ = new C474570IjH();
    public static final LinkedBlockingQueue<Map<String, String>> LJIJ = new LinkedBlockingQueue<>(128);
    public static boolean LJIJI;
    public static boolean LJIJJ;
    public String LIZIZ;
    public final boolean LIZJ;
    public final Double LIZLLL;
    public boolean LJ;
    public Map<String, String> LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public InterfaceC315080CWs LJIIL;
    public final List<Object> LJFF = new ArrayList();
    public final Map<String, String> LJI = new LinkedHashMap();
    public boolean LJIIJ = true;
    public boolean LJIIJJI = true;
    public final List<String> LJIILIIL = C1697810uHb.LJIIJJI("live_action", "livesdk_live_action", "live_take", "livesdk_live_take", "livesdk_golive_speedtest_monitor", "livesdk_create_room", "livesdk_takepage_age_verify_panel_show", "livesdk_takepage_age_verify_panel_confirm_click", "livesdk_anchor_bubble_call", "livesdk_anchor_bubble_abortion", "livesdk_anchor_bubble_show", "livesdk_anchor_bubble_duration", "livesdk_anchor_enhance_guidetip_show", "livesdk_anchor_enhance_guidetip_duration", "livesdk_update_ttlh_sdk_params_monitor");
    public final C01GW LJIILJJIL = C452501pT.LIZIZ(new C474620IjM());

    @Override // X.InterfaceC474510IjB
    public final InterfaceC474510IjB LIZLLL() {
        this.LJIIIZ = true;
        this.LJIIJ = false;
        this.LJIIJJI = false;
        return this;
    }

    @Override // X.InterfaceC474510IjB
    public final void LJ() {
        this.LJIIIIZZ = true;
        LIZ();
    }

    @Override // X.InterfaceC474510IjB
    public final void LJIILIIL() {
        this.LJ = true;
    }

    @Override // X.InterfaceC474510IjB
    public final InterfaceC474510IjB LJIJI() {
        this.LJIIJ = true;
        return this;
    }

    @Override // X.InterfaceC474510IjB
    public final void LIZ() {
        String strLIZIZ;
        if (!Intrinsics.LJFF(DataChannelGlobal.LLILZ.gg0(C930850aKZ.class), Boolean.TRUE) || this.LJIILIIL.contains(this.LIZIZ)) {
            if (!this.LIZJ || u.LJJIIJZLJL(this.LIZIZ, "livesdk_", false)) {
                strLIZIZ = this.LIZIZ;
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("livesdk_");
                sbLIZ.append(this.LIZIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
        } else if (u.LJJIIJZLJL(this.LIZIZ, "livesdk_trymode_", false)) {
            strLIZIZ = this.LIZIZ;
        } else if (u.LJJIIJZLJL(this.LIZIZ, "livesdk_", false)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("livesdk_trymode_");
            sbLIZ2.append(a0.LJJJJZ("livesdk_", this.LIZIZ));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("livesdk_trymode_");
            sbLIZ3.append(this.LIZIZ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        this.LIZIZ = strLIZIZ;
        if (C473430IhR.LIZ(strLIZIZ, this.LIZLLL)) {
            String str = this.LIZIZ;
            if (LiveSlardarTagSetting.INSTANCE.getCurrentValue().enable) {
                ((C1101510elp) C474750IjZ.LIZJ.getValue()).LIZ(str);
            }
            if (LiveLogThreadPoolOpt.INSTANCE.enable()) {
                C823050WQl.LIZLLL().submit(new Runnable() { // from class: X.0IjI
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("AppLogServiceImpl@fd46.send$1");
                        try {
                            this.LL.LJJI();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("AppLogServiceImpl@fd46.send$1");
                    }
                });
            } else {
                C823050WQl.LIZIZ().submit(new Runnable() { // from class: X.0IjJ
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("AppLogServiceImpl@fd46.send$2");
                        try {
                            this.LL.LJJI();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("AppLogServiceImpl@fd46.send$2");
                    }
                });
            }
        }
    }

    @Override // X.InterfaceC474510IjB
    public final InterfaceC467740IVw<C0IR5> LJFF() {
        return new C0IXM();
    }

    @Override // X.InterfaceC474510IjB
    public final InterfaceC474510IjB LJIIJ() {
        String str = C760080Tri.LIZIZ;
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (str == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LJIJJLI(str, "sticker_id");
        String str3 = C760080Tri.LIZJ;
        if (str3 == null) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        LJIJJLI(str3, "sticker_resource_id");
        String str4 = C760080Tri.LJFF;
        if (str4 == null) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        LJIJJLI(str4, "filter_id");
        String str5 = C760080Tri.LJI;
        if (str5 == null) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        LJIJJLI(str5, "filter_resource_id");
        if (C760080Tri.LJII) {
            str2 = "1";
        }
        LJIJJLI(str2, "beauty_use_status");
        return this;
    }

    @Override // X.InterfaceC474510IjB
    public final InterfaceC467740IVw<Room> LJIIL() {
        return new C0IXR();
    }

    @Override // X.InterfaceC474510IjB
    public final Map<String, String> LJIILL() {
        LJIILJJIL(DataChannelGlobal.LLILZ.gg0(C1148310fzJ.class));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJJ(linkedHashMap);
        return linkedHashMap;
    }

    @Override // X.InterfaceC474510IjB
    public final InterfaceC474510IjB LJIILLIIL() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        boolean z = room != null && room.getOwnerUserId() == UserService.getInstance().user().getCurrentUserId();
        w.LIZ.getClass();
        LJIJJLI(w.LJIIIZ(), "enter_from_merge");
        LJIJJLI(w.LJIIL(), "enter_method");
        LJIJJLI(String.valueOf(w.LJIJJ()), "room_id");
        LJIJJLI(String.valueOf(w.LJ()), "anchor_id");
        LJIJJLI(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        LJIJJLI(z ? "anchor" : "user", "user_type");
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:231:0x03b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.String> LJIL() {
        /*
            Method dump skipped, instruction units count: 1076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C474560IjG.LJIL():java.util.Map");
    }

    public final void LJJI() {
        Map<String, String> mapLJIL;
        String str;
        Map<String, String> map;
        if (LiveWidgetExitRoomOptSetting.INSTANCE.enable() && (map = this.LJII) != null && (!map.isEmpty())) {
            mapLJIL = this.LJII;
            if (mapLJIL == null) {
                return;
            }
        } else {
            mapLJIL = LJIL();
        }
        mapLJIL.put("event_name", this.LIZIZ);
        if (this.LJ && LiveAppLogCommonParamsMergeExp.INSTANCE.enableMergeForKey(this.LIZIZ) && (str = C0IUA.LJJIIZI) != null) {
            mapLJIL.put("__applog_cp_ids", str);
        }
        InterfaceC315080CWs interfaceC315080CWs = this.LJIIL;
        if (interfaceC315080CWs == null) {
            interfaceC315080CWs = this;
        }
        interfaceC315080CWs.LIZJ(mapLJIL);
        this.LJII = null;
        this.LJIIIZ = false;
        this.LJIIJ = true;
        this.LJIIJJI = true;
    }

    @Override // X.InterfaceC474510IjB
    public final String getEventName() {
        if (!this.LIZJ || u.LJJIIJZLJL(this.LIZIZ, "livesdk_", false)) {
            return this.LIZIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("livesdk_");
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC474510IjB
    public final void LJII() {
        LJIL();
    }

    @Override // X.InterfaceC474510IjB
    public final Map<String, String> getParams() {
        return this.LJI;
    }

    @Override // X.InterfaceC474510IjB
    public final InterfaceC474510IjB LIZIZ(Map map) {
        if (map != null) {
            this.LJI.putAll(map);
            Map<String, String> map2 = this.LJII;
            if (map2 != null) {
                map2.putAll(map);
            }
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032 A[LOOP:0: B:10:0x002c->B:12:0x0032, LOOP_END] */
    @Override // X.InterfaceC315080CWs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.util.Map<java.lang.String, java.lang.String> r5) {
        /*
            r4 = this;
            boolean r0 = X.C486790J7d.LIZIZ
            if (r0 == 0) goto L42
            com.bytedance.android.livesdk.livesetting.performance.LiveWatchImportantLogSetting r0 = com.bytedance.android.livesdk.livesetting.performance.LiveWatchImportantLogSetting.INSTANCE
            java.lang.String[] r1 = r0.getValue()
            java.lang.String r0 = "event_name"
            java.lang.Object r0 = r5.get(r0)
            boolean r0 = X.C13LQ.LJIILLIIL(r0, r1)
            if (r0 != 0) goto L1e
            java.util.concurrent.LinkedBlockingQueue<java.util.Map<java.lang.String, java.lang.String>> r0 = X.C474560IjG.LJIJ
            boolean r0 = r0.offer(r5)
            if (r0 != 0) goto L21
        L1e:
            X.C474610IjL.LIZ(r5)
        L21:
            X.0IjC r0 = X.InterfaceC474510IjB.LIZ
            r0.getClass()
            java.util.concurrent.CopyOnWriteArrayList<X.0IjR> r0 = X.C474520IjC.LIZIZ
            java.util.Iterator r3 = r0.iterator()
        L2c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4a
            java.lang.Object r2 = r3.next()
            X.0IjR r2 = (X.InterfaceC474670IjR) r2
            java.lang.String r1 = r4.LIZIZ
            java.util.Map r0 = X.C2097608Jq.LJIIZILJ(r5)
            r2.LIZ(r1, r0)
            goto L2c
        L42:
            boolean r0 = X.C474560IjG.LJIJI
            if (r0 != 0) goto L1e
            X.C474610IjL.LIZIZ()
            goto L1e
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C474560IjG.LIZJ(java.util.Map):void");
    }

    @Override // X.InterfaceC474510IjB
    public final InterfaceC474510IjB LJI(boolean z) {
        String strInvoke;
        String strInvoke2;
        String strInvoke3;
        String strInvoke4;
        String str;
        String strInvoke5;
        String str2;
        String str3 = "";
        if (z) {
            AwS97S1000000_12 awS97S1000000_12 = C474640IjO.LJFF;
            if (awS97S1000000_12 == null || (str2 = awS97S1000000_12.s0) == null) {
                str2 = "";
            }
            LJIJJLI(str2, "guest_event_page");
        }
        Function0<String> function0 = C474640IjO.LIZIZ;
        if (function0 != null && (strInvoke4 = function0.invoke()) != null && strInvoke4.length() > 0) {
            AwS97S1000000_12 awS97S1000000_122 = C474640IjO.LJFF;
            if (awS97S1000000_122 == null || (str = awS97S1000000_122.s0) == null) {
                str = "";
            }
            if (Intrinsics.LJFF(str, "connection_status")) {
                Function0<String> function02 = C474640IjO.LIZIZ;
                if (function02 == null || (strInvoke5 = function02.invoke()) == null) {
                    strInvoke5 = "";
                }
                LJIJJLI(strInvoke5, "guest_invite_type");
            }
        }
        Function0<String> function03 = C474640IjO.LIZJ;
        if (function03 == null || (strInvoke = function03.invoke()) == null) {
            strInvoke = "";
        }
        LJIJJLI(strInvoke, "link_id");
        Function0<String> function04 = C474640IjO.LIZLLL;
        if (function04 == null || (strInvoke2 = function04.invoke()) == null) {
            strInvoke2 = "";
        }
        LJIJJLI(strInvoke2, "window_setting");
        Function0<String> function05 = C474640IjO.LJ;
        if (function05 != null && (strInvoke3 = function05.invoke()) != null) {
            str3 = strInvoke3;
        }
        LJIJJLI(str3, "layout_setting");
        return this;
    }

    @Override // X.InterfaceC474510IjB
    public final InterfaceC474510IjB LJIIJJI(Function1 function1) {
        boolean z;
        String strLJIIZILJ = LJIIZILJ("link_id");
        if (strLJIIZILJ != null && strLJIIZILJ.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        function1.invoke(Boolean.valueOf(z));
        return this;
    }

    @Override // X.InterfaceC474510IjB
    public final void LJIILJJIL(Object obj) {
        if (obj != null) {
            ((ArrayList) this.LJFF).add(obj);
        }
    }

    @Override // X.InterfaceC474510IjB
    public final String LJIIZILJ(String str) {
        return (String) ((LinkedHashMap) this.LJI).get(str);
    }

    @Override // X.InterfaceC474510IjB
    public final void LJIJ(C1304590k3N c1304590k3N) {
        this.LJIIL = c1304590k3N;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d A[PHI: r2
      0x003d: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v5 java.lang.String), (r2v5 java.lang.String) binds: [B:19:0x003a, B:7:0x0016, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC474510IjB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC474510IjB LJIJJ(com.bytedance.ies.sdk.datachannel.DataChannel r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L39
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel> r0 = com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel.class
            java.lang.Object r0 = r4.gg0(r0)
            com.bytedance.android.livesdk.model.Hashtag r0 = (com.bytedance.android.livesdk.model.Hashtag) r0
            if (r0 == 0) goto L39
            java.lang.String r2 = r0.title
        Le:
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel> r0 = com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel.class
            java.lang.Object r0 = r4.gg0(r0)
            com.bytedance.android.livesdk.model.Hashtag r0 = (com.bytedance.android.livesdk.model.Hashtag) r0
            if (r0 == 0) goto L3d
            java.lang.Long r0 = r0.id
            if (r0 == 0) goto L3d
            long r0 = r0.longValue()
        L20:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "choose_hashtag_id"
            r3.LJIJJLI(r1, r0)
            if (r2 == 0) goto L31
            int r0 = r2.length()
            if (r0 != 0) goto L33
        L31:
            java.lang.String r2 = "none"
        L33:
            java.lang.String r0 = "choose_hashtag_name"
            r3.LJIJJLI(r2, r0)
            return r3
        L39:
            r2 = 0
            if (r4 == 0) goto L3d
            goto Le
        L3d:
            r0 = 0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C474560IjG.LJIJJ(com.bytedance.ies.sdk.datachannel.DataChannel):X.0IjB");
    }

    public final void LJJ(Map<String, String> map) {
        InterfaceC467740IVw<? extends Object> interfaceC467740IVw;
        String eventName = getEventName();
        for (Object obj : (ArrayList) this.LJFF) {
            InterfaceC467740IVw<? extends Object> interfaceC467740IVw2 = LJIILLIIL.get(obj.getClass());
            if ((interfaceC467740IVw2 instanceof InterfaceC467740IVw) && (interfaceC467740IVw = interfaceC467740IVw2) != null) {
                interfaceC467740IVw.LIZ(obj, eventName, map);
            }
        }
    }

    @Override // X.InterfaceC474510IjB
    public final /* bridge */ /* synthetic */ InterfaceC474510IjB LJIIIIZZ(Object obj, String str) {
        LJIJJLI(obj, str);
        return this;
    }

    public final void LJIJJLI(Object obj, String str) {
        if (obj != null) {
            this.LJI.put(str, obj.toString());
            Map<String, String> map = this.LJII;
            if (map != null) {
                map.put(str, obj.toString());
            }
        }
    }

    public C474560IjG(String str, boolean z, Double d) {
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = d;
    }

    @Override // X.InterfaceC474510IjB
    public final InterfaceC474510IjB LJIIIZ(Object obj, String str, Function0 function0) {
        if (((Boolean) function0.invoke()).booleanValue()) {
            LJIJJLI(obj, str);
        }
        return this;
    }
}
