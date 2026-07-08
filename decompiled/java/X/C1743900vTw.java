package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vTw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@InterfaceC1294060jmO
public final class C1743900vTw {
    public static final /* synthetic */ int LIZIZ = 0;
    public final C1488180opU LIZ;

    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db A[EDGE_INSN: B:57:0x00db->B:54:0x00db BREAK  A[LOOP:0: B:3:0x0004->B:53:0x00d5], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ() {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1743900vTw.LIZIZ():java.lang.Object");
    }

    public final Map<String, Object> LJ() {
        C1488180opU c1488180opU = this.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (c1488180opU != null) {
            linkedHashMap.putAll(C1488170opT.LIZ.LIZ(c1488180opU));
            c1488180opU.getClass();
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0opU, java.lang.Object] */
    public C1743900vTw() {
        ?? r2;
        synchronized (C1488170opT.LIZ) {
            C1488170opT c1488170opT = C1488170opT.LIZ;
            C1488170opT.LIZIZ.getAndAdd(1);
            r2 = new Object() { // from class: X.0opU
            };
            C1488170opT.LIZJ.put((C1488180opU) r2, new LinkedHashMap());
        }
        this.LIZ = r2;
    }

    public static Boolean LJIIL(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        if (Intrinsics.LJFF(lowerCase, "true")) {
            return Boolean.TRUE;
        }
        if (Intrinsics.LJFF(lowerCase, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final long LIZ(String str) {
        Long lLJIILIIL;
        Long l = 0L;
        Class cls = Long.TYPE;
        C1488180opU c1488180opU = this.LIZ;
        if (c1488180opU != null) {
            Object obj = C1488170opT.LIZ.LIZ(c1488180opU).get(str);
            Long l2 = null;
            if (obj != null) {
                if (Intrinsics.LJFF(cls, obj.getClass())) {
                    lLJIILIIL = (Long) obj;
                } else if (Intrinsics.LJFF(cls, String.class)) {
                    Object string = obj.toString();
                    if (string != null) {
                        lLJIILIIL = (Long) string;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                    }
                } else if (Intrinsics.LJFF(cls, Boolean.TYPE)) {
                    Object objLJIIL = LJIIL(obj.toString());
                    if (!(objLJIIL instanceof Long)) {
                        objLJIIL = null;
                    }
                    lLJIILIIL = (Long) objLJIIL;
                    if (lLJIILIIL != null) {
                    }
                } else if (Intrinsics.LJFF(cls, Integer.TYPE)) {
                    Object objLJIIJJI = C2095008Iq.LJIIJJI(obj.toString());
                    if (!(objLJIIJJI instanceof Long)) {
                        objLJIIJJI = null;
                    }
                    lLJIILIIL = (Long) objLJIIJJI;
                    if (lLJIILIIL != null) {
                    }
                } else if (Intrinsics.LJFF(cls, Long.TYPE)) {
                    lLJIILIIL = C2095008Iq.LJIILIIL(obj.toString());
                    if ((lLJIILIIL instanceof Long) && lLJIILIIL != null) {
                    }
                } else if (Intrinsics.LJFF(cls, Double.TYPE)) {
                    Object objLJII = C2327809Ae.LJII(obj.toString());
                    if (!(objLJII instanceof Long)) {
                        objLJII = null;
                    }
                    lLJIILIIL = (Long) objLJII;
                    if (lLJIILIIL != null) {
                    }
                } else if (Intrinsics.LJFF(cls, Float.TYPE)) {
                    Object objLJIIIIZZ = C2327809Ae.LJIIIIZZ(obj.toString());
                    if (!(objLJIIIIZZ instanceof Long)) {
                        objLJIIIIZZ = null;
                    }
                    lLJIILIIL = (Long) objLJIIIIZZ;
                    if (lLJIILIIL != null) {
                    }
                } else if (Intrinsics.LJFF(cls, Object.class)) {
                    lLJIILIIL = (Long) obj;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(cls.getName());
                    sbLIZ.append(" is not VALID.");
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                }
                l2 = lLJIILIIL;
            }
            if (!Intrinsics.LJFF(l2, "#$&*REMOVED*&$#")) {
                if (l2 != null) {
                    l = l2;
                } else {
                    c1488180opU.getClass();
                }
            }
        }
        return l.longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ef A[EDGE_INSN: B:68:0x00ef->B:66:0x00ef BREAK  A[LOOP:0: B:3:0x0004->B:14:0x002a], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZJ(java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1743900vTw.LIZJ(java.lang.String):java.lang.String");
    }

    public final boolean LIZLLL(String str) {
        Boolean boolLJIIL;
        Boolean bool = Boolean.FALSE;
        Class cls = Boolean.TYPE;
        C1488180opU c1488180opU = this.LIZ;
        if (c1488180opU != null) {
            Object obj = C1488170opT.LIZ.LIZ(c1488180opU).get(str);
            Boolean bool2 = null;
            if (obj != null) {
                if (Intrinsics.LJFF(cls, obj.getClass())) {
                    boolLJIIL = (Boolean) obj;
                } else if (Intrinsics.LJFF(cls, String.class)) {
                    Object string = obj.toString();
                    if (string != null) {
                        boolLJIIL = (Boolean) string;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                    }
                } else if (Intrinsics.LJFF(cls, Boolean.TYPE)) {
                    boolLJIIL = LJIIL(obj.toString());
                    if ((boolLJIIL instanceof Boolean) && boolLJIIL != null) {
                    }
                } else if (Intrinsics.LJFF(cls, Integer.TYPE)) {
                    Object objLJIIJJI = C2095008Iq.LJIIJJI(obj.toString());
                    if (!(objLJIIJJI instanceof Boolean)) {
                        objLJIIJJI = null;
                    }
                    boolLJIIL = (Boolean) objLJIIJJI;
                    if (boolLJIIL != null) {
                    }
                } else if (Intrinsics.LJFF(cls, Long.TYPE)) {
                    Object objLJIILIIL = C2095008Iq.LJIILIIL(obj.toString());
                    if (!(objLJIILIIL instanceof Boolean)) {
                        objLJIILIIL = null;
                    }
                    boolLJIIL = (Boolean) objLJIILIIL;
                    if (boolLJIIL != null) {
                    }
                } else if (Intrinsics.LJFF(cls, Double.TYPE)) {
                    Object objLJII = C2327809Ae.LJII(obj.toString());
                    if (!(objLJII instanceof Boolean)) {
                        objLJII = null;
                    }
                    boolLJIIL = (Boolean) objLJII;
                    if (boolLJIIL != null) {
                    }
                } else if (Intrinsics.LJFF(cls, Float.TYPE)) {
                    Object objLJIIIIZZ = C2327809Ae.LJIIIIZZ(obj.toString());
                    if (!(objLJIIIIZZ instanceof Boolean)) {
                        objLJIIIIZZ = null;
                    }
                    boolLJIIL = (Boolean) objLJIIIIZZ;
                    if (boolLJIIL != null) {
                    }
                } else if (Intrinsics.LJFF(cls, Object.class)) {
                    boolLJIIL = (Boolean) obj;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(cls.getName());
                    sbLIZ.append(" is not VALID.");
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                }
                bool2 = boolLJIIL;
            }
            if (!Intrinsics.LJFF(bool2, "#$&*REMOVED*&$#")) {
                if (bool2 != null) {
                    bool = bool2;
                } else {
                    c1488180opU.getClass();
                }
            }
        }
        return bool.booleanValue();
    }

    public final boolean LJFF(String str) {
        C1488180opU c1488180opU = this.LIZ;
        if (c1488180opU == null) {
            return false;
        }
        boolean zContainsKey = C1488170opT.LIZ.LIZ(c1488180opU).containsKey(str);
        if (!zContainsKey) {
            c1488180opU.getClass();
        }
        return zContainsKey;
    }

    public final void LJIIJJI(String str) {
        try {
            C1488170opT.LIZ.LIZ(this.LIZ).put(str, "#$&*REMOVED*&$#");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJI(int i, String str) {
        C1488170opT.LIZ.LIZ(this.LIZ).put(str, Integer.valueOf(i));
    }

    public final void LJII(long j, String str) {
        C1488170opT.LIZ.LIZ(this.LIZ).put(str, Long.valueOf(j));
    }

    public final void LJIIIZ(String str, Map<String, String> map) {
        C1488170opT.LIZ.LIZ(this.LIZ).put(str, map);
    }

    public final void LJIIJ(String str, boolean z) {
        C1488170opT.LIZ.LIZ(this.LIZ).put(str, Boolean.valueOf(z));
    }

    public final void LJIIIIZZ(String str, String str2, boolean z) {
        if (!z) {
            if (str2 != null) {
                str2 = str2.toLowerCase(Locale.ROOT);
            } else {
                str2 = null;
            }
        }
        Map<String, Object> mapLIZ = C1488170opT.LIZ.LIZ(this.LIZ);
        if (str2 == null) {
            mapLIZ.remove(str);
        } else {
            mapLIZ.put(str, str2);
        }
    }
}
