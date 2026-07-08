package X;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.09EQ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09EQ {
    public static final C09EQ LIZIZ = new C09EQ();
    public final List<C09ES> LIZ = new CopyOnWriteArrayList();

    public final C08FV LIZ(C08FG c08fg, Throwable th) {
        String strTrim;
        if (c08fg != null && th != null && ((CopyOnWriteArrayList) this.LIZ).size() != 0) {
            for (C09ES c09es : (CopyOnWriteArrayList) this.LIZ) {
                c09es.getClass();
                if (c08fg.getName().equals(c09es.LIZIZ)) {
                    StackTraceElement[] stackTrace = th.getStackTrace();
                    int i = 0;
                    int i2 = -1;
                    while (i2 < stackTrace.length && i < c09es.LIZ.length) {
                        if (i2 == -1) {
                            strTrim = th.toString().trim();
                        } else {
                            strTrim = stackTrace[i2].toString().trim();
                        }
                        i2++;
                        if (strTrim.contains(c09es.LIZ[i].trim())) {
                            i++;
                        }
                    }
                    if (i == c09es.LIZ.length && c09es.LIZLLL != null) {
                        if ("string".equals(c09es.LIZJ)) {
                            C09ER.LIZJ(c09es.LIZJ);
                            return new C08FV(c09es.LIZLLL.LJIL());
                        }
                        if ("byte".equals(c09es.LIZJ)) {
                            C09ER.LIZJ(c09es.LIZJ);
                            return new C08FV(Byte.valueOf(c09es.LIZLLL.LJFF()));
                        }
                        if ("short".equals(c09es.LIZJ)) {
                            C09ER.LIZJ(c09es.LIZJ);
                            return new C08FV(Short.valueOf(c09es.LIZLLL.LJIJI()));
                        }
                        if ("int".equals(c09es.LIZJ)) {
                            C09ER.LIZJ(c09es.LIZJ);
                            return new C08FV(Integer.valueOf(c09es.LIZLLL.LJIIJJI()));
                        }
                        if ("long".equals(c09es.LIZJ)) {
                            C09ER.LIZJ(c09es.LIZJ);
                            return new C08FV(Long.valueOf(c09es.LIZLLL.LJIIZILJ()));
                        }
                        if ("float".equals(c09es.LIZJ)) {
                            C09ER.LIZJ(c09es.LIZJ);
                            return new C08FV(Float.valueOf(c09es.LIZLLL.LJIIJ()));
                        }
                        if ("double".equals(c09es.LIZJ)) {
                            C09ER.LIZJ(c09es.LIZJ);
                            return new C08FV(Double.valueOf(c09es.LIZLLL.LJIIIZ()));
                        }
                        if ("boolean".equals(c09es.LIZJ)) {
                            C09ER.LIZJ(c09es.LIZJ);
                            return new C08FV(Boolean.valueOf(c09es.LIZLLL.LJ()));
                        }
                        if ("jsonElement".equals(c09es.LIZJ)) {
                            C09ER.LIZJ(c09es.LIZJ);
                            return new C08FV(c09es.LIZLLL);
                        }
                        if ("null".equals(c09es.LIZJ)) {
                            C09ER.LIZJ(c09es.LIZJ);
                            return new C08FV(null);
                        }
                    }
                }
            }
        }
        return null;
    }
}
