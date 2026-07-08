package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0Mrj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C581730Mrj {
    public static final boolean LIZ(String str, Map map) {
        C582240MsY c582240MsY;
        Integer numValueOf;
        if (map == null || (c582240MsY = (C582240MsY) map.get(str)) == null || (numValueOf = Integer.valueOf(c582240MsY.LIZ)) == null || numValueOf.intValue() < 0 || numValueOf.intValue() == 1) {
            return false;
        }
        return true;
    }
}
