package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0i3L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1227690i3L {
    public static C1227700i3M LIZ = new C1227700i3M(null);

    public static final void LJIIIZ(String str, C1227700i3M c1227700i3M, Map<String, String> map) {
        C0I0B.LJFF.LIZIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.putAll(C2097608Jq.LJIIIIZZ(new Pair("biz_line", c1227700i3M.LIZ), new Pair("biz_scene", c1227700i3M.LIZIZ)));
        C20684815ws.LJIILLIIL(str, linkedHashMap);
    }

    public static final void LJIIJ(String str, String str2, boolean z) {
        C1227700i3M c1227700i3M = new C1227700i3M(null);
        LIZ = c1227700i3M;
        c1227700i3M.LJ = z;
        c1227700i3M.LIZ = str;
        c1227700i3M.LIZIZ = str2;
        LJIIIZ("group_chat_create_start", c1227700i3M, C2097908Jt.LIZJ(new Pair("from_contact_panel", C1529305yl.LIZ(Boolean.valueOf(z)))));
        LIZ.LIZJ = EnumC1227710i3N.STARTED;
    }
}
