package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0Lcp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C547010Lcp {
    public static final ConcurrentHashMap<String, C0LUM> LIZ = new ConcurrentHashMap<>();

    public static C0LUM LIZ(String str, C546660LcG c546660LcG) {
        InterfaceC2180908gZ c547020Lcq;
        ConcurrentHashMap<String, C0LUM> concurrentHashMap = LIZ;
        C0LUM c0lum = concurrentHashMap.get(str);
        if (c0lum != null) {
            return c0lum;
        }
        int i = C547000Lco.LIZ[c546660LcG.LIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                c547020Lcq = new C547060Lcu(str);
            } else {
                throw new C1954807lC();
            }
        } else {
            c547020Lcq = new C547020Lcq(str);
        }
        C557010Lsx c557010Lsx = new C557010Lsx(new C2180708gX(c547020Lcq, null), new C2180808gY(c547020Lcq, null));
        concurrentHashMap.put(str, c557010Lsx);
        return c557010Lsx;
    }
}
