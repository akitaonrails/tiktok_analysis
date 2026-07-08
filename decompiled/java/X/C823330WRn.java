package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0WRn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C823330WRn {
    public static final C823340WRo LIZ = new C823340WRo();

    public static Object LIZ(String str) {
        C823340WRo c823340WRo = LIZ;
        ReentrantReadWriteLock.ReadLock lock = c823340WRo.LIZ.readLock();
        lock.lock();
        try {
            C0WR6 c0wr6 = (C0WR6) ((LinkedHashMap) c823340WRo.LIZIZ).get(str);
            lock.unlock();
            if (c0wr6 == null) {
                return null;
            }
            if (c0wr6 instanceof C0WR8) {
                C0WR8 c0wr8 = (C0WR8) c0wr6;
                return new C0WR8(c0wr8.LIZ, c0wr8.LIZJ).LIZ();
            }
            return c0wr6.LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    public static Boolean LIZIZ(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof Number) {
            int iIntValue = ((Number) obj).intValue();
            if (iIntValue != 0) {
                if (iIntValue != 1) {
                    return null;
                }
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        if (!(obj instanceof String)) {
            return null;
        }
        String string = a0.LJLIIIL((String) obj).toString();
        if (string.length() == 0) {
            return null;
        }
        Integer numLJIIJJI = C2095008Iq.LJIIJJI(string);
        if (numLJIIJJI != null) {
            int iIntValue2 = numLJIIJJI.intValue();
            if (iIntValue2 != 0) {
                if (iIntValue2 != 1) {
                    return null;
                }
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        String lowerCase = string.toLowerCase(Locale.US);
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != 110) {
            if (iHashCode != 121) {
                if (iHashCode != 3521) {
                    if (iHashCode != 119527) {
                        if (iHashCode != 3569038) {
                            if (iHashCode != 97196323 || !lowerCase.equals("false")) {
                                return null;
                            }
                        } else if (!lowerCase.equals("true")) {
                            return null;
                        }
                    } else if (!lowerCase.equals("yes")) {
                        return null;
                    }
                } else if (!lowerCase.equals("no")) {
                    return null;
                }
            } else if (!lowerCase.equals("y")) {
                return null;
            }
            return Boolean.TRUE;
        }
        if (!lowerCase.equals("n")) {
            return null;
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c A[PHI: r1
      0x003c: PHI (r1v1 java.lang.String) = (r1v0 java.lang.String), (r1v2 java.lang.String) binds: [B:17:0x003a, B:10:0x001e] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(java.lang.Object r3) {
        /*
            r2 = 0
            if (r3 != 0) goto L4
            return r2
        L4:
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L21
            java.lang.String r3 = (java.lang.String) r3
            java.lang.CharSequence r0 = kotlin.text.a0.LJLIIIL(r3)
            java.lang.String r1 = r0.toString()
            int r0 = r1.length()
            if (r0 == 0) goto L20
            java.lang.String r0 = "pns-null"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L3c
        L20:
            return r2
        L21:
            boolean r0 = r3 instanceof java.lang.Number
            if (r0 == 0) goto L2a
            java.lang.String r2 = r3.toString()
            return r2
        L2a:
            java.lang.String r0 = r3.toString()
            java.lang.CharSequence r0 = kotlin.text.a0.LJLIIIL(r0)
            java.lang.String r1 = r0.toString()
            int r0 = r1.length()
            if (r0 <= 0) goto L20
        L3c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C823330WRn.LIZJ(java.lang.Object):java.lang.String");
    }
}
