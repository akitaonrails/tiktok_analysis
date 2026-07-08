package X;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0jux, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1299370jux {
    public static final C1299370jux LIZ = new C1299370jux();
    public static final Map<String, C1299340juu> LIZIZ = new ConcurrentHashMap(3);
    public static final Map<String, Integer> LIZJ = new LinkedHashMap();

    public static void LIZLLL(String str) {
        if (str.length() != 0) {
            Map<String, Integer> map = LIZJ;
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            if (linkedHashMap.get(str) != null) {
                int iIntValue = ((Number) linkedHashMap.get(str)).intValue() - 1;
                if (iIntValue <= 0) {
                    ((ConcurrentHashMap) LIZIZ).remove(str);
                    map.remove(str);
                } else {
                    map.put(str, Integer.valueOf(iIntValue));
                }
            }
        }
    }

    public static C1299340juu LIZ(String str, boolean z, boolean z2, Boolean bool, boolean z3, boolean z4) {
        boolean z5;
        if (bool == null) {
            if (z3) {
                C1299360juw c1299360juw = new C1299360juw() { // from class: X.0jv1
                };
                c1299360juw.LIZ = str;
                c1299360juw.LIZIZ = null;
                c1299360juw.LIZJ = z;
                c1299360juw.LIZLLL = z2;
                c1299360juw.LJ = Boolean.valueOf(z4);
                final String str2 = c1299360juw.LIZ;
                final String strLIZ = C1299340juu.LIZ();
                final String[] strArr = c1299360juw.LIZIZ;
                final boolean z6 = c1299360juw.LIZJ;
                final boolean z7 = c1299360juw.LIZLLL;
                final Boolean bool2 = c1299360juw.LJ;
                return new C1299340juu(str2, strLIZ, strArr, z6, z7, bool2) { // from class: X.0juz
                };
            }
            C1299360juw c1299360juw2 = new C1299360juw();
            c1299360juw2.LIZ = str;
            c1299360juw2.LIZIZ = null;
            c1299360juw2.LIZJ = z;
            c1299360juw2.LIZLLL = z2;
            c1299360juw2.LJ = Boolean.valueOf(z4);
            return new C1299340juu(c1299360juw2);
        }
        if (z3) {
            C1299360juw c1299360juw3 = new C1299360juw() { // from class: X.0jv1
            };
            c1299360juw3.LIZ = str;
            c1299360juw3.LIZIZ = null;
            c1299360juw3.LIZJ = z;
            c1299360juw3.LIZLLL = z2;
            c1299360juw3.LJ = Boolean.valueOf(z4);
            final String str3 = c1299360juw3.LIZ;
            final String strLIZ2 = C1299340juu.LIZ();
            final String[] strArr2 = c1299360juw3.LIZIZ;
            final boolean z8 = c1299360juw3.LIZJ;
            final boolean z9 = c1299360juw3.LIZLLL;
            final Boolean bool3 = c1299360juw3.LJ;
            return new C1299340juu(str3, strLIZ2, strArr2, z8, z9, bool3) { // from class: X.0juz
            };
        }
        boolean zBooleanValue = bool.booleanValue();
        String strLIZ3 = C1299340juu.LIZ();
        if (!z && !zBooleanValue) {
            z5 = false;
        } else {
            z5 = true;
        }
        return new C1299340juu(str, strLIZ3, null, z5, z2, Boolean.FALSE, false);
    }

    public static C1299340juu LIZIZ(Boolean bool, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        boolean z7;
        boolean z8 = false;
        if (z6) {
            boolean zLJFF = Intrinsics.LJFF(bool, Boolean.TRUE);
            if (!z2 && !zLJFF) {
                z7 = false;
            } else {
                z7 = true;
            }
            return new C1299340juu(str, "-1", null, z7, z3, Boolean.FALSE, false);
        }
        if (!z) {
            return LIZ(str, z2, z3, bool, z4, z5);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZIZ;
        C1299340juu c1299340juu = (C1299340juu) concurrentHashMap.get(str);
        Map<String, Integer> map = LIZJ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            obj = 0;
            linkedHashMap.put(str, obj);
        }
        map.put(str, Integer.valueOf(((Number) obj).intValue() + 1));
        if (c1299340juu != null) {
            boolean z9 = c1299340juu.LIZIZ;
            if (z2 || Intrinsics.LJFF(bool, Boolean.TRUE)) {
                z8 = true;
            }
            if (z9 != z8 || (c1299340juu instanceof C1299390juz) != z4) {
                return LIZ(str, z2, z3, bool, z4, z5);
            }
            return c1299340juu;
        }
        C1299340juu c1299340juuLIZ = LIZ(str, z2, z3, bool, z4, z5);
        concurrentHashMap.put(str, c1299340juuLIZ);
        return c1299340juuLIZ;
    }

    public static /* synthetic */ C1299340juu LIZJ(C1299370jux c1299370jux, boolean z, String str, boolean z2, boolean z3, Boolean bool, boolean z4, boolean z5) {
        c1299370jux.getClass();
        return LIZIZ(bool, str, z, z2, z3, z4, false, z5);
    }
}
