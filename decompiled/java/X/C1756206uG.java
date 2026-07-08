package X;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06uG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1756206uG {
    public static final ConcurrentHashMap<String, C1756906uN> LIZ = new ConcurrentHashMap<>();

    public static C1756006uE LIZ(String str, String str2) {
        C1756006uE c1756006uE = null;
        if (str2 == null) {
            return null;
        }
        C1756906uN c1756906uN = LIZ.get(str);
        if (c1756906uN != null) {
            synchronized (c1756906uN) {
                c1756006uE = (C1756006uE) ((LinkedHashMap) c1756906uN.LIZ).get(str2);
            }
        }
        return c1756006uE;
    }

    public static void LIZJ(String str, C1756006uE c1756006uE) {
        String uuid;
        C1756906uN c1756906uN;
        C869590Y9l c869590Y9l = c1756006uE.LIZ;
        if (c869590Y9l != null && (uuid = c869590Y9l.getUuid()) != null && (c1756906uN = LIZ.get(str)) != null) {
            synchronized (c1756906uN) {
                C1756006uE c1756006uE2 = (C1756006uE) ((LinkedHashMap) c1756906uN.LIZ).get(uuid);
                c1756906uN.LIZ.put(uuid, c1756006uE);
                if (Intrinsics.LJFF(c1756006uE2, c1756006uE)) {
                    for (InterfaceC1757406uS interfaceC1757406uS : c1756906uN.LIZIZ) {
                        C869590Y9l c869590Y9l2 = c1756006uE.LIZ;
                        if (c869590Y9l2 != null) {
                            interfaceC1757406uS.LIZIZ(c869590Y9l2);
                        }
                    }
                } else {
                    for (InterfaceC1757406uS interfaceC1757406uS2 : c1756906uN.LIZIZ) {
                        C869590Y9l c869590Y9l3 = c1756006uE.LIZ;
                        if (c869590Y9l3 != null) {
                            interfaceC1757406uS2.LIZIZ(c869590Y9l3);
                        }
                    }
                }
            }
        }
    }

    public static void LIZIZ(String str, String str2, boolean z) {
        C1756906uN c1756906uN = LIZ.get(str);
        if (c1756906uN != null) {
            synchronized (c1756906uN) {
                Map<String, C1756006uE> map = c1756906uN.LIZ;
                if (str2 == null) {
                    str2 = "";
                }
                C1756006uE c1756006uERemove = map.remove(str2);
                if (c1756006uERemove == null) {
                    return;
                }
                if (z) {
                    for (InterfaceC1757406uS interfaceC1757406uS : c1756906uN.LIZIZ) {
                        C869590Y9l c869590Y9l = c1756006uERemove.LIZ;
                        if (c869590Y9l != null) {
                            interfaceC1757406uS.LIZJ(c869590Y9l);
                        }
                    }
                }
            }
        }
    }
}
