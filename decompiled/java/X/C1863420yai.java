package X;

import defpackage.u2;
import defpackage.w2;
import defpackage.x2;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0yai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1863420yai {
    public final synchronized u2 LJFF(Integer num, Long l) {
        u2 u2Var;
        u2Var = null;
        if (l != null && num != null) {
            u2Var = C1863380yae.LJJIJIIJI.get(LJIIIIZZ(num.intValue(), l.longValue(), null));
        }
        return u2Var;
    }

    public static String LJIIIIZZ(int i, long j, String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(j);
            sbLIZ.append('_');
            sbLIZ.append(i);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(j);
        sbLIZ2.append('_');
        sbLIZ2.append(i);
        sbLIZ2.append('_');
        sbLIZ2.append(str);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public final synchronized C05YC LIZ(Integer num, Long l, String str) {
        C05YC<w2> c05ycLIZIZ;
        c05ycLIZIZ = null;
        if (l != null && num != null) {
            C05YC<w2> c05yc = C1863380yae.LJJIII.get(LJIIIIZZ(num.intValue(), l.longValue(), str));
            if (c05yc == null) {
                c05ycLIZIZ = C09IR.LIZIZ(0, 20, null, 4);
                C1863380yae.LJJIII.put(LJIIIIZZ(num.intValue(), l.longValue(), str), c05ycLIZIZ);
            } else {
                c05ycLIZIZ = c05yc;
            }
        }
        return c05ycLIZIZ;
    }

    public final synchronized C05YC LIZIZ(Integer num, Long l, String str) {
        C05YC<x2> c05ycLIZIZ;
        c05ycLIZIZ = null;
        if (l != null && num != null) {
            C05YC<x2> c05yc = C1863380yae.LJJIIJ.get(LJIIIIZZ(num.intValue(), l.longValue(), str));
            if (c05yc == null) {
                c05ycLIZIZ = C09IR.LIZIZ(0, 20, null, 4);
                C1863380yae.LJJIIJ.put(LJIIIIZZ(num.intValue(), l.longValue(), str), c05ycLIZIZ);
            } else {
                c05ycLIZIZ = c05yc;
            }
        }
        return c05ycLIZIZ;
    }

    public final synchronized InterfaceC332260D0u LIZJ(Integer num, Long l, String str) {
        InterfaceC332260D0u<Boolean> interfaceC332260D0uLIZ;
        if (l != null && num != null) {
            interfaceC332260D0uLIZ = C1863380yae.LJJIIZ.get(LJIIIIZZ(num.intValue(), l.longValue(), str));
            if (interfaceC332260D0uLIZ == null) {
                interfaceC332260D0uLIZ = C1BNE.LIZ(Boolean.FALSE);
                C1863380yae.LJJIIZ.put(LJIIIIZZ(num.intValue(), l.longValue(), str), interfaceC332260D0uLIZ);
            }
        } else {
            interfaceC332260D0uLIZ = null;
        }
        return interfaceC332260D0uLIZ;
    }

    public final synchronized InterfaceC332260D0u LIZLLL(Integer num, Long l, String str) {
        InterfaceC332260D0u<Boolean> interfaceC332260D0uLIZ;
        if (l != null && num != null) {
            interfaceC332260D0uLIZ = C1863380yae.LJJIIJZLJL.get(LJIIIIZZ(num.intValue(), l.longValue(), str));
            if (interfaceC332260D0uLIZ == null) {
                interfaceC332260D0uLIZ = C1BNE.LIZ(Boolean.FALSE);
                C1863380yae.LJJIIJZLJL.put(LJIIIIZZ(num.intValue(), l.longValue(), str), interfaceC332260D0uLIZ);
            }
        } else {
            interfaceC332260D0uLIZ = null;
        }
        return interfaceC332260D0uLIZ;
    }

    public final synchronized Set LJ(Integer num, Long l, String str) {
        Set<String> linkedHashSet;
        if (l != null && num != null) {
            linkedHashSet = C1863380yae.LJJIJIIJIL.get(LJIIIIZZ(num.intValue(), l.longValue(), str));
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<>();
                C1863380yae.LJJIJIIJIL.put(LJIIIIZZ(num.intValue(), l.longValue(), str), linkedHashSet);
            }
        } else {
            linkedHashSet = null;
        }
        return linkedHashSet;
    }

    public final synchronized w2 LJI(Integer num, Long l, String str) {
        w2 w2Var;
        if (l != null && num != null) {
            w2Var = C1863380yae.LJJIJ.get(LJIIIIZZ(num.intValue(), l.longValue(), str));
        } else {
            w2Var = null;
        }
        return w2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean LJII(java.lang.Integer r5, java.lang.Long r6, java.lang.String r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r6 == 0) goto L23
            if (r5 == 0) goto L23
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r3 = X.C1863380yae.LJJIIZI     // Catch: java.lang.Throwable -> L20
            long r1 = r6.longValue()     // Catch: java.lang.Throwable -> L20
            int r0 = r5.intValue()     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = LJIIIIZZ(r0, r1, r7)     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = r3.get(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L23
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L20
            goto L24
        L20:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L23:
            r0 = 0
        L24:
            monitor-exit(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863420yai.LJII(java.lang.Integer, java.lang.Long, java.lang.String):boolean");
    }
}
