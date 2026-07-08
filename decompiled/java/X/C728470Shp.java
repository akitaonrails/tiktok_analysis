package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0Shp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C728470Shp {
    public static void LIZ(int i, C19EG c19eg) {
        String str;
        switch (i) {
            case C538540LAe.LLJJJIL /* 60000 */:
                C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
                c1389890mGx.LJIIIZ(2131849050);
                c1389890mGx.LIZ(true);
                c1389890mGx.LJIIJJI();
                str = "other";
                HashMap map = new HashMap();
                map.put("notice_reason", str);
                C20684815ws.LJIILLIIL("story_push_expire_notice_show", map);
                break;
            case 60001:
                C1389890mGx c1389890mGx2 = new C1389890mGx(c19eg);
                c1389890mGx2.LJIIIZ(2131849049);
                c1389890mGx2.LIZ(true);
                c1389890mGx2.LJIIJJI();
                str = "delete";
                HashMap map2 = new HashMap();
                map2.put("notice_reason", str);
                C20684815ws.LJIILLIIL("story_push_expire_notice_show", map2);
                break;
            case 60002:
                C1389890mGx c1389890mGx3 = new C1389890mGx(c19eg);
                c1389890mGx3.LJIIIZ(2131849048);
                c1389890mGx3.LIZ(true);
                c1389890mGx3.LJIIJJI();
                str = "expire";
                HashMap map22 = new HashMap();
                map22.put("notice_reason", str);
                C20684815ws.LJIILLIIL("story_push_expire_notice_show", map22);
                break;
            default:
                if (i != 20000) {
                    switch (i) {
                        case 60001:
                            str = "delete";
                            break;
                        case 60002:
                            str = "expire";
                            break;
                        default:
                            str = "other";
                            break;
                    }
                    HashMap map222 = new HashMap();
                    map222.put("notice_reason", str);
                    C20684815ws.LJIILLIIL("story_push_expire_notice_show", map222);
                }
                break;
        }
    }
}
