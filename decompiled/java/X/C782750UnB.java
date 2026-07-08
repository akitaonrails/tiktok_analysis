package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0UnB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C782750UnB {
    public static final String LIZ(InterfaceC782830UnJ interfaceC782830UnJ) {
        if (interfaceC782830UnJ == null || !interfaceC782830UnJ.LLLII() || !interfaceC782830UnJ.LLILLIZIL() || !interfaceC782830UnJ.LJJLIIIJLLLLLLLZ()) {
            return "default";
        }
        return "expand";
    }

    public static final void LIZJ(DataChannel dataChannel, String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, int i2, Map map) {
        HashMap map2 = new HashMap();
        map2.put("anchor_id", str2);
        map2.put("room_id", str3);
        map2.put("live_type", str4);
        map2.put("page_level", str5);
        map2.put("red_dot_id", str6);
        map2.put("priority", String.valueOf(i));
        if (str7 == null) {
            str7 = "";
        }
        map2.put("event_position", str7);
        map2.put("current_red_dot_cnt", String.valueOf(i2));
        map2.putAll(map);
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJIIZI(map2);
        c474500IjALIZ.LIZ();
    }

    public static final void LIZIZ(DataChannel dataChannel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, int i2, Map map) {
        HashMap map2 = new HashMap();
        map2.put("anchor_id", str2);
        map2.put("room_id", str3);
        map2.put("live_type", str4);
        map2.put("event_page", str5);
        map2.put("page_level", str6);
        map2.put("red_dot_id", str7);
        if (str8 != null) {
            map2.put("effect_tab_name", str8);
        }
        map2.put("priority", String.valueOf(i));
        if (str9 == null) {
            str9 = "";
        }
        map2.put("event_position", str9);
        map2.put("current_red_dot_cnt", String.valueOf(i2));
        map2.putAll(map);
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJIIZI(map2);
        c474500IjALIZ.LIZ();
    }
}
