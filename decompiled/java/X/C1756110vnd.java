package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0vnd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1756110vnd {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(3));

    public static String LIZ() {
        String strLIZ = C1017903yT.LIZ();
        ((ConcurrentHashMap) LIZ.getValue()).put(strLIZ, new C1756090vnb());
        return strLIZ;
    }

    public static C1756090vnb LIZIZ(String str) {
        return (C1756090vnb) ((ConcurrentHashMap) LIZ.getValue()).get(str);
    }
}
