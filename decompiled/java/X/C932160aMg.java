package X;

import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0aMg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C932160aMg {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZLLL(String str) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("connection_type", "guest");
        map.put("way_of_open", "icon");
        map.put("auto_accept_request_initiate_type", String.valueOf(C925650aCB.LIZ()));
        if (str != null && str.length() != 0) {
            map.put("enter_from", str);
        }
        C0KX4.LIZ("livesdk_layoutsettings_open", map, null, true);
    }

    public static void LJIIIIZZ(String str) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("way_of_switch", str);
        C0KX4.LIZ("livesdk_anchor_guest_connection_click_flip_cammera", map, null, true);
    }

    public static void LIZIZ(String str, String str2) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("action_type", str);
        map.put("camera_control_status", str2);
        C0KX4.LIZ("livesdk_multi_anchor_guest_control_setting", map, null, true);
    }

    public static void LIZJ(String str, String str2) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("action_type", str);
        map.put("icon_type", str2);
        C0KX4.LIZ("livesdk_multi_anchor_guest_cut_icon", map, null, true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(java.lang.String r7, java.lang.String r8, X.EnumC937290aUx r9) {
        /*
            r6 = 0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0 = 0
            X.C01Z4.LIZ(r0, r1)
            java.lang.String r0 = "action_type"
            r4 = r8
            r1.put(r0, r4)
            java.lang.String r2 = r9.getValue()
            java.lang.String r0 = "position"
            r1.put(r0, r2)
            java.lang.String r0 = "is_multi_guest_moderator"
            java.lang.String r2 = "0"
            r1.put(r0, r2)
            java.lang.String r0 = "is_grey"
            r1.put(r0, r2)
            java.lang.String r2 = X.C917520Zz4.LIZJ()
            java.lang.String r0 = "layout_id"
            r1.put(r0, r2)
            r3 = r7
            int r0 = r3.hashCode()
            switch(r0) {
                case -1929069240: goto L84;
                case -983286850: goto L79;
                case 1008965232: goto L6e;
                case 1886539686: goto L63;
                default: goto L36;
            }
        L36:
            java.lang.String r2 = ""
        L38:
            X.0ZvJ r0 = X.C978360bZC.LIZJ
            java.lang.String r5 = r9.getValue()
            r7 = 0
            r9 = 16
            r8 = r6
            X.C978360bZC.LJIIL(r3, r4, r5, r6, r7, r8, r9)
            int r0 = r2.length()
            if (r0 == 0) goto L62
            java.lang.Class<com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService> r0 = com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService r0 = (com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService) r0
            X.0UXu r0 = r0.G20(r2)
            if (r0 == 0) goto L62
            X.0bZD r0 = r0.LIZIZ(r1)
            if (r0 == 0) goto L62
            r0.LIZ()
        L62:
            return
        L63:
            java.lang.String r0 = "guest_showdown"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L36
            java.lang.String r2 = "livesdk_multi_anchor_guest_showdown_entrance"
            goto L38
        L6e:
            java.lang.String r0 = "live_show"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L36
            java.lang.String r2 = "livesdk_multi_anchor_live_show_entrance"
            goto L38
        L79:
            java.lang.String r0 = "count_down_for_all"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L36
            java.lang.String r2 = "livesdk_multi_anchor_countdown_all_entrance"
            goto L38
        L84:
            java.lang.String r0 = "shared_background"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L36
            java.lang.String r2 = "livesdk_multi_anchor_shared_background_entrance"
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C932160aMg.LJI(java.lang.String, java.lang.String, X.0aUx):void");
    }

    public static void LIZ(int i, String str, String str2, String str3) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("popup_scene", str);
        map.put("guest_cnt", String.valueOf(i));
        map.put("action_type", str2);
        map.put("click_type", str3);
        C0KX4.LIZ("livesdk_anchor_expand_seat_guidance_popup", map, null, true);
    }

    public static void LJFF(EnumC936960aUQ enumC936960aUQ, String str, EnumC937290aUx enumC937290aUx, boolean z, int i) {
        String str2;
        InterfaceC774000UXu interfaceC774000UXuG20;
        C978370bZD c978370bZDLIZIZ;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("action_type", str);
        map.put("position", enumC937290aUx.getValue());
        String str3 = CardStruct.IStatusCode.DEFAULT;
        map.put("is_multi_guest_moderator", CardStruct.IStatusCode.DEFAULT);
        if (z) {
            str3 = "1";
        }
        map.put("is_grey", str3);
        map.put("layout_id", C917520Zz4.LIZJ());
        int i2 = C936940aUO.LIZ[enumC936960aUQ.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        str2 = "";
                    } else {
                        str2 = "livesdk_multi_anchor_guest_showdown_entrance";
                    }
                } else {
                    str2 = "livesdk_multi_anchor_countdown_all_entrance";
                }
            } else {
                str2 = "livesdk_multi_anchor_live_show_entrance";
            }
        } else {
            str2 = "livesdk_multi_anchor_shared_background_entrance";
        }
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        C978360bZC.LJIIL(enumC936960aUQ.getToolName(), str, enumC937290aUx.getValue(), z, null, i, 16);
        if (str2.length() != 0 && (interfaceC774000UXuG20 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).G20(str2)) != null && (c978370bZDLIZIZ = interfaceC774000UXuG20.LIZIZ((Map) map)) != null) {
            c978370bZDLIZIZ.LIZ();
        }
    }

    public static void LJ(boolean z, boolean z2, Integer num, int i, Integer num2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        String str2;
        Object obj5;
        Object obj6;
        Object obj7;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        if (num != null) {
            map.put("max_guest_num", num.toString());
        }
        String str3 = "1";
        if (C925150aBN.LJJIII()) {
            if (z5) {
                obj5 = "1";
            } else {
                obj5 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("allow_request_from_view", obj5);
            if (z4) {
                obj6 = "1";
            } else {
                obj6 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("allow_requests_from_followers", obj6);
            if (z3) {
                obj7 = "1";
            } else {
                obj7 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("allow_request_from_friends", obj7);
        } else {
            if (z) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("allow_request_from_view", obj);
            if (z2) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("allow_requests_from_followers", obj2);
        }
        if (C922760a7W.LIZIZ()) {
            map.put("request_display_setting", C921220a52.LIZ(i));
        }
        if (num2 != null) {
            map.put("filter_request_setting", String.valueOf(num2.intValue()));
        }
        map.put("is_show_avaliable_spot", C917660ZzI.LIZ());
        if (z6) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_show_avaliable_spot_red_dot", obj3);
        if (z7) {
            obj4 = "1";
        } else {
            obj4 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_always_show_layout", obj4);
        if (!z8) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_always_show_layout_red_dot", str3);
        if (C925650aCB.LIZ() != 0) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        map.put("auto_accept_request", str2);
        map.put("auto_accept_request_initiate_type", String.valueOf(C925650aCB.LIZ()));
        if (C931790aM5.LIZIZ()) {
            map.put("layout_key", C940770aaZ.LIZ().getDataSource().LIZ());
        }
        map.put("panel_layout_type", String.valueOf(C940770aaZ.LIZ().getDataSource().getPanelLayoutType()));
        map.put("from_page", str);
        C0KX4.LIZ("livesdk_anchor_guest_setting_page_show", map, null, true);
    }
}
