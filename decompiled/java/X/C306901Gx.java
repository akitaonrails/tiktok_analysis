package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import qo2.w;
import webcast.data.multi_guest_play.ShowConfig;
import webcast.data.multi_guest_play.ShowContent;

/* JADX INFO: renamed from: X.01Gx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C306901Gx {
    public static long LIZ;
    public static boolean LIZIZ;
    public static long LIZJ;
    public static boolean LIZLLL;
    public static HashMap<String, Integer> LJ;
    public static Long LJFF;
    public static List<Long> LJI;
    public static int LJII;
    public static long LJIIIIZZ;
    public static long LJIIIZ;
    public static long LJIIJ;
    public static volatile long LJIIJJI;
    public static volatile long LJIIL;
    public static volatile long LJIILIIL;
    public static final C01GW LJIILJJIL;

    public static void LJIILL() {
        ShowContent content;
        ShowConfig showConfig;
        LIZLLL = false;
        Map mapLIZLLL = LIZLLL();
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        Long lValueOf = (interfaceC302601FgLIZ == null || (content = interfaceC302601FgLIZ.getContent()) == null || (showConfig = content.showConfig) == null) ? null : Long.valueOf(showConfig.durationPerGuest);
        long jCurrentTimeMillis = (System.currentTimeMillis() - LIZJ) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        if (lValueOf != null) {
            jCurrentTimeMillis = Math.min(lValueOf.longValue(), jCurrentTimeMillis);
        }
        mapLIZLLL.put("liveshow_guest_duration", String.valueOf(jCurrentTimeMillis));
        LJIL("livesdk_guest_liveshow_onstage_over", mapLIZLLL);
    }

    public static Map LIZJ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Room room = (Room) LJIILJJIL.getValue();
        if (room != null) {
            linkedHashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            linkedHashMap.put("room_id", room.getIdStr());
        }
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        EnumC918970a1P enumC918970a1PLJII = C927600aFK.LJII();
        linkedHashMap.put("window_setting", C917520Zz4.LJII(enumC918970a1PLJII).getSecond());
        linkedHashMap.put("layout_setting", C917520Zz4.LJII(enumC918970a1PLJII).getFirst());
        C924620aAW.LJIIJJI(linkedHashMap);
        return linkedHashMap;
    }

    public static void LJII() {
        if (LJIIJ != 0) {
            LJI();
        }
        LJIIJ = System.currentTimeMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILIIL() {
        /*
            long r1 = X.C306901Gx.LJIIJJI
            r4 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L9
            return
        L9:
            long r1 = X.C306901Gx.LJIIL
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 == 0) goto L14
            long r0 = X.C306901Gx.LJIIL
            LJIIIIZZ(r0)
        L14:
            java.util.Map r2 = LIZJ()
            int r0 = LJ()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "guest_cnt"
            r2.put(r0, r1)
            X.01Fg r0 = X.C01FQ.LIZ()
            java.lang.String r3 = ""
            if (r0 == 0) goto L43
            webcast.data.multi_guest_play.ShowContent r0 = r0.getContent()
            if (r0 == 0) goto L43
            webcast.data.multi_guest_play.ShowConfig r0 = r0.showConfig
            if (r0 == 0) goto L43
            long r0 = r0.durationPerGuest
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = r0.toString()
            if (r1 != 0) goto L44
        L43:
            r1 = r3
        L44:
            java.lang.String r0 = "show_duration_per_guest"
            r2.put(r0, r1)
            X.01Fg r0 = X.C01FQ.LIZ()
            if (r0 == 0) goto L9a
            webcast.data.multi_guest_play.ShowContent r0 = r0.getContent()
            if (r0 == 0) goto L9a
            webcast.data.multi_guest_play.ShowConfig r0 = r0.showConfig
            if (r0 == 0) goto L9a
            boolean r1 = r0.allowOpenMicFreely
            r0 = 1
            if (r1 != r0) goto L9a
        L5e:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "is_guest_mic_open"
            r2.put(r0, r1)
            X.01Fg r0 = X.C01FQ.LIZ()
            if (r0 == 0) goto L80
            webcast.data.multi_guest_play.ShowContent r0 = r0.getContent()
            if (r0 == 0) goto L80
            long r0 = r0.showId
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L80
            r3 = r0
        L80:
            java.lang.String r0 = "multiguest_liveshow_id"
            r2.put(r0, r3)
            long r0 = X.C306901Gx.LJIIIIZZ
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "multiguest_liveshow_duration"
            r2.put(r0, r1)
            X.C306901Gx.LJIIIIZZ = r4
            java.lang.String r0 = "livesdk_anchor_multiguest_liveshow_over"
            LJIL(r0, r2)
            X.C306901Gx.LJIIJJI = r4
            return
        L9a:
            r0 = 0
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C306901Gx.LJIILIIL():void");
    }

    public static void LJIJ() {
        if (LJII != 2) {
            return;
        }
        LJI();
        Map mapLIZLLL = LIZLLL();
        mapLIZLLL.put("duration", String.valueOf(LJIIIZ));
        mapLIZLLL.put("is_in_interval", C01HT.LIZJ() ? "1" : CardStruct.IStatusCode.DEFAULT);
        LJIIJ = 0L;
        LJIIIZ = 0L;
        LJIL("livesdk_multiguest_liveshow_view_duration", mapLIZLLL);
    }

    static {
        System.currentTimeMillis();
        LIZJ = System.currentTimeMillis();
        LJ = new HashMap<>();
        LJI = new ArrayList();
        LJIILJJIL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(332));
    }

    public static Map LIZ() {
        List<LinkUser> listLIZLLL;
        Integer numValueOf;
        Map mapLIZJ = LIZJ();
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        mapLIZJ.put("guest_cnt", String.valueOf((interfaceC954180awCLLJLL == null || (listLIZLLL = interfaceC954180awCLLJLL.LIZLLL()) == null || (numValueOf = Integer.valueOf(listLIZLLL.size())) == null || numValueOf.intValue() < 1) ? 0 : numValueOf.intValue() - 1));
        return mapLIZJ;
    }

    public static Map LIZIZ() {
        String string;
        Long lLJII;
        Map mapLIZ = LIZ();
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ == null || (lLJII = interfaceC302601FgLIZ.LJII()) == null || (string = lLJII.toString()) == null) {
            string = "";
        }
        mapLIZ.put("multiguest_liveshow_id", string);
        return mapLIZ;
    }

    public static Map LIZLLL() {
        String string;
        Long lLJII;
        Map mapLIZJ = LIZJ();
        w.LIZ.getClass();
        mapLIZJ.put("action_type", w.LIZLLL());
        mapLIZJ.put("enter_method", w.LJIIL());
        mapLIZJ.put("enter_from_merge", w.LJIIIZ());
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ == null || (lLJII = interfaceC302601FgLIZ.LJII()) == null || (string = lLJII.toString()) == null) {
            string = "";
        }
        mapLIZJ.put("multiguest_liveshow_id", string);
        return mapLIZJ;
    }

    public static int LJ() {
        List<LinkUser> listLIZLLL;
        Integer numValueOf;
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL == null || (listLIZLLL = interfaceC954180awCLLJLL.LIZLLL()) == null || (numValueOf = Integer.valueOf(listLIZLLL.size())) == null) {
            return 0;
        }
        return numValueOf.intValue() - 1;
    }

    public static String LJFF() {
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        return (interfaceC302601FgLIZ == null || interfaceC302601FgLIZ.LJIIL() != 2) ? CardStruct.IStatusCode.DEFAULT : "1";
    }

    public static void LJI() {
        ShowContent content;
        ShowConfig showConfig;
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        Long lValueOf = (interfaceC302601FgLIZ == null || (content = interfaceC302601FgLIZ.getContent()) == null || (showConfig = content.showConfig) == null) ? null : Long.valueOf(showConfig.durationPerGuest);
        long jCurrentTimeMillis = (System.currentTimeMillis() - LJIIJ) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        if (lValueOf != null) {
            jCurrentTimeMillis = Math.min(lValueOf.longValue(), jCurrentTimeMillis);
        }
        LJIIIZ += jCurrentTimeMillis;
    }

    public static void LJIJI() {
        Long lLJII;
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ != null) {
            long j = LIZ;
            Long lLJII2 = interfaceC302601FgLIZ.LJII();
            if (lLJII2 != null && j == lLJII2.longValue()) {
                return;
            }
        }
        Map mapLIZLLL = LIZLLL();
        mapLIZLLL.put("duration", String.valueOf(LJIIIZ));
        mapLIZLLL.put("is_in_interval", C01HT.LIZJ() ? "1" : CardStruct.IStatusCode.DEFAULT);
        LJIL("livesdk_multiguest_liveshow_view_start", mapLIZLLL);
        InterfaceC302601Fg interfaceC302601FgLIZ2 = C01FQ.LIZ();
        LIZ = (interfaceC302601FgLIZ2 == null || (lLJII = interfaceC302601FgLIZ2.LJII()) == null) ? 0L : lLJII.longValue();
        System.currentTimeMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ(long r4) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C306901Gx.LJIIIIZZ(long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIZ(long r5) {
        /*
            long r3 = X.C306901Gx.LJIIL
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto Ld
            long r0 = X.C306901Gx.LJIIL
            LJIIIIZZ(r0)
        Ld:
            X.C306901Gx.LJIIL = r5
            long r0 = java.lang.System.currentTimeMillis()
            X.C306901Gx.LJIILIIL = r0
            java.util.Map r2 = LIZJ()
            int r0 = LJ()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "guest_cnt"
            r2.put(r0, r1)
            X.01Fg r0 = X.C01FQ.LIZ()
            java.lang.String r3 = ""
            if (r0 == 0) goto L44
            webcast.data.multi_guest_play.ShowContent r0 = r0.getContent()
            if (r0 == 0) goto L44
            webcast.data.multi_guest_play.ShowConfig r0 = r0.showConfig
            if (r0 == 0) goto L44
            long r0 = r0.durationPerGuest
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = r0.toString()
            if (r1 != 0) goto L45
        L44:
            r1 = r3
        L45:
            java.lang.String r0 = "show_duration_per_guest"
            r2.put(r0, r1)
            X.01Fg r0 = X.C01FQ.LIZ()
            if (r0 == 0) goto L95
            webcast.data.multi_guest_play.ShowContent r0 = r0.getContent()
            if (r0 == 0) goto L95
            webcast.data.multi_guest_play.ShowConfig r0 = r0.showConfig
            if (r0 == 0) goto L95
            boolean r1 = r0.allowOpenMicFreely
            r0 = 1
            if (r1 != r0) goto L95
        L5f:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "is_guest_mic_open"
            r2.put(r0, r1)
            X.01Fg r0 = X.C01FQ.LIZ()
            if (r0 == 0) goto L81
            webcast.data.multi_guest_play.ShowContent r0 = r0.getContent()
            if (r0 == 0) goto L81
            long r0 = r0.showId
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L81
            r3 = r0
        L81:
            java.lang.String r0 = "multiguest_liveshow_id"
            r2.put(r0, r3)
            java.lang.String r1 = "onstage_guest_id"
            java.lang.String r0 = java.lang.String.valueOf(r5)
            r2.put(r1, r0)
            java.lang.String r0 = "livesdk_anchor_multiguest_liveshow_guest_onstage_start"
            LJIL(r0, r2)
            return
        L95:
            r0 = 0
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C306901Gx.LJIIIZ(long):void");
    }

    public static void LJIIJ(String str) {
        Map mapLIZ = LIZ();
        mapLIZ.put("show_entrance", str);
        mapLIZ.put("is_liveshow_ongoing", LJFF());
        LJIL("livesdk_anchor_multiguest_liveshow_info_show", mapLIZ);
    }

    public static void LJIIJJI(String str) {
        Map mapLIZJ = LIZJ();
        mapLIZJ.put("guest_cnt", String.valueOf(LJ()));
        if (str.length() > 0) {
            mapLIZJ.put("show_entrance", str);
        }
        LJIL("livesdk_anchor_multiguest_liveshow_icon_click", mapLIZJ);
    }

    public static void LJIIL(String str) {
        Map mapLIZJ = LIZJ();
        mapLIZJ.put("guest_cnt", String.valueOf(LJ()));
        mapLIZJ.put("show_entrance", str);
        mapLIZJ.put("is_liveshow_ongoing", LJFF());
        LJIL("livesdk_anchor_multiguest_liveshow_panel_show", mapLIZJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILLIIL(java.lang.String r8) {
        /*
            java.util.Map r3 = LIZLLL()
            java.lang.String r0 = "show_entrance"
            r3.put(r0, r8)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            X.01Fg r0 = X.C01FQ.LIZ()
            if (r0 == 0) goto L21
            webcast.data.multi_guest_play.ShowContent r0 = r0.getContent()
            if (r0 == 0) goto L21
            java.util.List<webcast.data.multi_guest_play.ShowListUser> r0 = r0.showingAndReadyList
            if (r0 == 0) goto L21
            r1.addAll(r0)
        L21:
            X.01Fg r0 = X.C01FQ.LIZ()
            if (r0 == 0) goto L34
            webcast.data.multi_guest_play.ShowContent r0 = r0.getContent()
            if (r0 == 0) goto L34
            java.util.List<webcast.data.multi_guest_play.ShowListUser> r0 = r0.finishedList
            if (r0 == 0) goto L34
            r1.addAll(r0)
        L34:
            java.util.Iterator r8 = r1.iterator()
        L38:
            boolean r0 = r8.hasNext()
            r7 = 1
            r6 = 0
            if (r0 == 0) goto L5b
            java.lang.Object r6 = r8.next()
            r1 = r6
            webcast.data.multi_guest_play.ShowListUser r1 = (webcast.data.multi_guest_play.ShowListUser) r1
            if (r1 == 0) goto L38
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r0 = r0.user()
            long r4 = r0.getCurrentUserId()
            long r1 = r1.userId
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L38
        L5b:
            webcast.data.multi_guest_play.ShowListUser r6 = (webcast.data.multi_guest_play.ShowListUser) r6
            if (r6 == 0) goto L8b
            int r0 = r6.status
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r2 == 0) goto L8b
            int r0 = r2.intValue()
            if (r0 == r7) goto L8b
            int r1 = r2.intValue()
            r0 = 2
            if (r1 != r0) goto L81
            java.lang.String r1 = "onstage"
        L76:
            java.lang.String r0 = "liveshow_status"
            r3.put(r0, r1)
            java.lang.String r0 = "livesdk_guest_liveshow_panel_show"
            LJIL(r0, r3)
            return
        L81:
            int r1 = r2.intValue()
            r0 = 3
            if (r1 != r0) goto L8b
            java.lang.String r1 = "finished"
            goto L76
        L8b:
            java.lang.String r1 = "prestage"
            goto L76
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C306901Gx.LJIILLIIL(java.lang.String):void");
    }

    public static void LJIJJ(String str) {
        Map mapLIZ = LIZ();
        mapLIZ.put("click_icon", str);
        mapLIZ.put("is_liveshow_ongoing", LJFF());
        LJIL("livesdk_anchor_multiguest_liveshow_setting_duration_click", mapLIZ);
    }

    public static void LJIILJJIL(long j, boolean z) {
        String str;
        Map mapLIZ = LIZ();
        mapLIZ.put("default_duration_per_guest", String.valueOf(j));
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        mapLIZ.put("is_guest_mic_open", str);
        mapLIZ.put("is_liveshow_ongoing", LJFF());
        LJIL("livesdk_anchor_multiguest_liveshow_setting_show", mapLIZ);
    }

    public static void LJIIZILJ(String str, String str2) {
        String string;
        Long lLJII;
        Map mapLIZ = LIZ();
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ == null || (lLJII = interfaceC302601FgLIZ.LJII()) == null || (string = lLJII.toString()) == null) {
            string = "";
        }
        mapLIZ.put("multiguest_liveshow_id", string);
        mapLIZ.put("button_action_type", str);
        if (str2 == null) {
            str2 = "";
        }
        mapLIZ.put("on_mic_uid", str2);
        LJIL("livesdk_mg_liveshow_turn_on_mic_pop", mapLIZ);
    }

    public static void LJIJJLI(long j, boolean z) {
        String str;
        Map mapLIZ = LIZ();
        mapLIZ.put("show_duration_per_guest", String.valueOf(j));
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        mapLIZ.put("is_guest_mic_open", str);
        LJIL("livesdk_anchor_multiguest_liveshow_start_click", mapLIZ);
    }

    public static void LJIL(String str, Map map) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }
}
