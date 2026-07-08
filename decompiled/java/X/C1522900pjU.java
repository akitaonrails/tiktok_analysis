package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0pjU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1522900pjU {
    public static C0X0P LIZ(Map map) {
        String str;
        if (map == null || ((str = (String) map.get("Content-Type")) == null && (str = (String) map.get("content-type")) == null)) {
            str = "text/html; charset=UTF-8";
        }
        return C0X0P.LIZJ(str);
    }
}
