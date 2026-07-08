package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0W4k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C817320W4k {
    public static final Map<String, C817270W4f> LIZ;

    static {
        HashMap map = new HashMap();
        LIZ = map;
        C817300W4i c817300W4i = new InterfaceC817280W4g() { // from class: X.0W4i
            @Override // X.InterfaceC817280W4g
            public final boolean LIZ(String str, String str2) {
                return true;
            }
        };
        C817290W4h c817290W4h = new InterfaceC817280W4g() { // from class: X.0W4h
            @Override // X.InterfaceC817280W4g
            public final boolean LIZ(String str, String str2) {
                if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
                    return false;
                }
                return true;
            }
        };
        if (map.isEmpty()) {
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("publish_consume_interval", c817300W4i), new Pair("batch_num", c817300W4i), new Pair("batch_num_all", c817300W4i), new Pair("previous_page_position", c817290W4h), new Pair("previous_page", c817290W4h), new Pair("relation_tag", new InterfaceC817280W4g() { // from class: X.0W4j
                @Override // X.InterfaceC817280W4g
                public final boolean LIZ(String str, String str2) {
                    if (!Intrinsics.LJFF(str, "-2") && !Intrinsics.LJFF(str2, "-2")) {
                        return false;
                    }
                    return true;
                }
            }), new Pair("music_name", c817300W4i), new Pair("insert_aweme_duration", c817300W4i), new Pair("play_order_profile", c817300W4i));
            ArrayList arrayList = new ArrayList();
            arrayList.add("poi_region_code");
            arrayList.add("poi_city");
            arrayList.add("fake_mining_grade");
            arrayList.add("author_id");
            arrayList.add("music_id");
            arrayList.add("music_type");
            arrayList.add("tt_poi_type_name_level1");
            map.put("video_play", new C817270W4f(mapLJIIIIZZ, C1697810uHb.LJ("zhushengyuan@bytedance.com"), arrayList));
            map.put("video_play_finish", new C817270W4f(mapLJIIIIZZ, C1697810uHb.LJ("zhushengyuan@bytedance.com"), arrayList));
            map.put("play_time", new C817270W4f(mapLJIIIIZZ, C1697810uHb.LJ("zhushengyuan@bytedance.com"), arrayList));
            map.put("enter_add_yours_detail_page", new C817270W4f(null, C1697810uHb.LJ("yangjiahui.0127@bytedance.com"), null));
            map.put("add_yours_client_show", new C817270W4f(null, C1697810uHb.LJ("yangjiahui.0127@bytedance.com"), null));
            map.put("favourite_add_yours_title", new C817270W4f(null, C1697810uHb.LJ("yangjiahui.0127@bytedance.com"), null));
            map.put("enter_add_yours_invite_panel", new C817270W4f(null, C1697810uHb.LJ("yangjiahui.0127@bytedance.com"), null));
            map.put("select_add_yours_invitee", new C817270W4f(null, C1697810uHb.LJ("yangjiahui.0127@bytedance.com"), null));
            map.put("send_add_yours_invitation", new C817270W4f(null, C1697810uHb.LJ("yangjiahui.0127@bytedance.com"), null));
            map.put("enter_add_yours_topic_list", new C817270W4f(null, C1697810uHb.LJ("yangjiahui.0127@bytedance.com"), null));
            map.put("change_personal_collection_tab", new C817270W4f(null, C1697810uHb.LJ("yangjiahui.0127@bytedance.com"), null));
            map.put("enter_add_yours_settings", new C817270W4f(null, C1697810uHb.LJ("yangjiahui.0127@bytedance.com"), null));
            map.put("change_add_yours_settings", new C817270W4f(null, C1697810uHb.LJ("yangjiahui.0127@bytedance.com"), null));
            map.put("add_yours_bottom_button_show", new C817270W4f(null, C1697810uHb.LJ("yangjiahui.0127@bytedance.com"), null));
            map.put("add_yours_bottom_button_click", new C817270W4f(null, C1697810uHb.LJ("yangjiahui.0127@bytedance.com"), null));
        }
    }

    public static boolean LIZ(String str, String str2, String str3) {
        List<String> list;
        C817270W4f c817270W4f = (C817270W4f) ((HashMap) LIZ).get(str);
        if (c817270W4f != null && (list = c817270W4f.LIZJ) != null && list.contains(str2) && str3.length() == 0) {
            return true;
        }
        return false;
    }
}
