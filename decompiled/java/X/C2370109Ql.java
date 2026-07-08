package X;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.09Ql, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2370109Ql {
    public static void LIZ(Exception exc, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("e", exc.toString());
        linkedHashMap.put("tag", str);
        C1421105hJ.LIZJ("rd_exception_event_live_ecommerce", linkedHashMap);
    }
}
