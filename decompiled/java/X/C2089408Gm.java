package X;

import java.util.Map;

/* JADX INFO: renamed from: X.08Gm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2089408Gm {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(String str, String str2, Map<String, String> map) {
        C2089008Gi c2089008Gi = new C2089008Gi("sslocal://webcast_subscribe/pgc_privilege_page?");
        c2089008Gi.LIZLLL("sec_anchor_id", str);
        c2089008Gi.LIZLLL("page_type", str2);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            c2089008Gi.LIZLLL(entry.getKey(), entry.getValue());
        }
        return c2089008Gi.LJ();
    }
}
