package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0p7b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1499410p7b extends AbstractC1499420p7c<C0XM9, C0X52<?>> {
    public final C603820NmG<String, C603820NmG<String, C1499430p7d>> LIZIZ = new C603820NmG<>(16);
    public final String LIZJ = "MemoryCache";

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(X.C0XM9 r3) {
        /*
            boolean r0 = X.C1498970p6t.LIZ(r3)
            if (r0 == 0) goto Lb
            X.0XLO r0 = r3.LIZJ
            java.lang.String r0 = r0.LJIIIIZZ
            return r0
        Lb:
            boolean r0 = X.C1498970p6t.LIZIZ(r3)
            if (r0 == 0) goto L41
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            X.0XLO r0 = r3.LIZJ
            java.lang.String r0 = r0.LJIIIIZZ
            r2.append(r0)
            java.lang.String r0 = "m:post "
            r2.append(r0)
            X.0XMA r0 = r3.LJ
            X.0X3j r1 = r0.LIZJ
            if (r1 == 0) goto L3c
            X.0XMH r0 = new X.0XMH
            r0.<init>(r1)
        L2c:
            java.lang.String r0 = r0.md5Stub()
            if (r0 != 0) goto L34
        L32:
            java.lang.String r0 = ""
        L34:
            r2.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
            return r0
        L3c:
            com.bytedance.retrofit2.mime.TypedOutput r0 = r0.LIZIZ
            if (r0 == 0) goto L32
            goto L2c
        L41:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1499410p7b.LIZIZ(X.0XM9):java.lang.String");
    }

    public static final String LIZJ(Object obj) {
        C0XM9 c0xm9 = (C0XM9) obj;
        if (C1346100l8K.LIZIZ(c0xm9, 20)) {
            return "not_pending";
        }
        String strLIZIZ = LIZIZ(c0xm9);
        if (strLIZIZ != null) {
            return strLIZIZ;
        }
        return "not_support";
    }

    public final C0X52 LIZLLL(Object obj) {
        String strLIZ;
        C1499430p7d c1499430p7dLIZJ;
        C1496480p2s c1496480p2s;
        C0XM9 c0xm9 = (C0XM9) obj;
        String strLIZIZ = LIZIZ(c0xm9);
        C1496480p2s c1496480p2s2 = null;
        if (strLIZIZ != null) {
            C1346000l8A c1346000l8ALIZ = C1346100l8K.LIZ(c0xm9);
            if (c1346000l8ALIZ == null || (strLIZ = c1346000l8ALIZ.LIZIZ) == null) {
                strLIZ = c0xm9.LIZJ.LJFF.LIZ();
            }
            synchronized (this.LIZIZ) {
                try {
                    C603820NmG<String, C1499430p7d> c603820NmGLIZJ = this.LIZIZ.LIZJ(strLIZ);
                    if (c603820NmGLIZJ != null) {
                        c1499430p7dLIZJ = c603820NmGLIZJ.LIZJ(strLIZIZ);
                    } else {
                        c1499430p7dLIZJ = null;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (c1499430p7dLIZJ != null) {
                if (System.currentTimeMillis() > c1499430p7dLIZJ.LIZJ) {
                    synchronized (this.LIZIZ) {
                        try {
                            C603820NmG<String, C1499430p7d> c603820NmGLIZJ2 = this.LIZIZ.LIZJ(strLIZ);
                            if (c603820NmGLIZJ2 != null) {
                                c603820NmGLIZJ2.LJ(strLIZIZ);
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            throw th2;
                        }
                    }
                    return null;
                }
                if (C1346100l8K.LIZIZ(c0xm9, 16)) {
                    c1499430p7dLIZJ.LIZJ = System.currentTimeMillis() + ((long) c1499430p7dLIZJ.LIZ);
                }
                C0X52<?> c0x52 = c1499430p7dLIZJ.LIZIZ;
                Boolean bool = Boolean.TRUE;
                C1496500p2u c1496500p2u = C1496500p2u.LIZ;
                if (C1496500p2u.LIZIZ) {
                    c1496480p2s = (C1496480p2s) C1496500p2u.LIZLLL.getValue();
                } else {
                    c1496480p2s = C1496500p2u.LIZJ;
                    if (c1496480p2s == null) {
                        c1496480p2s = null;
                    }
                }
                c1496480p2s.LIZIZ(c0x52, "is_from_cache", bool);
                if (C1496500p2u.LIZIZ) {
                    c1496480p2s2 = (C1496480p2s) C1496500p2u.LIZLLL.getValue();
                } else {
                    C1496480p2s c1496480p2s3 = C1496500p2u.LIZJ;
                    if (c1496480p2s3 != null) {
                        c1496480p2s2 = c1496480p2s3;
                    }
                }
                c1496480p2s2.LIZIZ(c0x52, "from_cache_type", "Memory");
                return c1499430p7dLIZJ.LIZIZ;
            }
        }
        return null;
    }

    public final void LJ(C0XM9 c0xm9, C0X52 c0x52) {
        C1346000l8A c1346000l8ALIZ;
        String strLIZIZ;
        C1496480p2s c1496480p2s;
        if (c0x52.LIZJ() && (c1346000l8ALIZ = C1346100l8K.LIZ(c0xm9)) != null && (strLIZIZ = LIZIZ(c0xm9)) != null) {
            String strLIZ = c1346000l8ALIZ.LIZIZ;
            if (strLIZ == null) {
                strLIZ = c0xm9.LIZJ.LJFF.LIZ();
            }
            synchronized (this.LIZIZ) {
                try {
                    C603820NmG<String, C1499430p7d> c603820NmGLIZJ = this.LIZIZ.LIZJ(strLIZ);
                    if (c603820NmGLIZJ == null) {
                        c603820NmGLIZJ = new C603820NmG<>(c1346000l8ALIZ.LIZJ);
                        this.LIZIZ.LIZLLL(strLIZ, c603820NmGLIZJ);
                    }
                    C1499430p7d c1499430p7dLIZJ = c603820NmGLIZJ.LIZJ(strLIZIZ);
                    if (c1499430p7dLIZJ != null) {
                        c1499430p7dLIZJ.LIZIZ = c0x52;
                        c1499430p7dLIZJ.LIZ = c1346000l8ALIZ.LIZLLL;
                        c1499430p7dLIZJ.LIZJ = System.currentTimeMillis() + ((long) c1499430p7dLIZJ.LIZ);
                    } else {
                        c603820NmGLIZJ.LIZLLL(strLIZIZ, new C1499430p7d(c1346000l8ALIZ.LIZLLL, c0x52));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            Boolean bool = Boolean.TRUE;
            C1496500p2u c1496500p2u = C1496500p2u.LIZ;
            if (C1496500p2u.LIZIZ) {
                c1496480p2s = (C1496480p2s) C1496500p2u.LIZLLL.getValue();
            } else {
                c1496480p2s = C1496500p2u.LIZJ;
                if (c1496480p2s == null) {
                    c1496480p2s = null;
                }
            }
            c1496480p2s.LIZIZ(c0x52, "is_fresh_cache", bool);
        }
    }
}
