package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0q0H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533310q0H {
    public static Map<String, String> LIZJ;
    public static final C1533310q0H LIZ = new C1533310q0H();
    public static String LIZIZ = "-1";
    public static final List<String> LIZLLL = new ArrayList();
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(188));

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair LIZIZ(C1532710pzJ c1532710pzJ, String str, String str2) {
        T t;
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        C1540860qCS c1540860qCSLJIIJ;
        C1533020pzo c1533020pzo;
        Object c098200Yq4;
        C1532950pzh c1532950pzh = c1532710pzJ.LJJIFFI;
        C259800zU c259800zU = new C259800zU();
        String str3 = c1532710pzJ.LJIJJ;
        if (str3 != null) {
            C1532980pzk c1532980pzk = (C1532980pzk) c1532950pzh.LIZLLL.getValue();
            c1532980pzk.getClass();
            Pair pair = new Pair(str3, str);
            LinkedHashMap linkedHashMap = (LinkedHashMap) c1532980pzk.LIZIZ;
            Object obj = linkedHashMap.get(pair);
            t = obj;
            if (obj == null) {
                C0VSZ c0vsz = new C0VSZ(c1532980pzk.LIZ, str);
                linkedHashMap.put(pair, c0vsz);
                t = c0vsz;
            }
        } else {
            t = 0;
        }
        c259800zU.element = t;
        if (t == 0) {
            C1532680pzG.LIZ.getClass();
            if (!C1532680pzG.LJIIIZ) {
                C1541080qCo<C1532310pyf> c1541080qCo = c1532710pzJ.LJJIIZI;
                if (c1541080qCo != null) {
                    c1540860qCSLJIIJ = c1541080qCo.LJIIJ();
                } else {
                    c1540860qCSLJIIJ = null;
                }
                if ((c1540860qCSLJIIJ instanceof C1533020pzo) && (c1533020pzo = (C1533020pzo) c1540860qCSLJIIJ) != null) {
                    try {
                        LinkedHashMap linkedHashMap2 = (LinkedHashMap) c1533020pzo.LJIIJ;
                        Object obj2 = linkedHashMap2.get(str);
                        T t2 = obj2;
                        if (obj2 == null) {
                            C0VSZ c0vsz2 = (C0VSZ) c259800zU.element;
                            C0VSZ c0vsz3 = c0vsz2;
                            if (c0vsz2 == null) {
                                c0vsz3 = new C0VSZ(C1532680pzG.LIZIZ(), str);
                            }
                            linkedHashMap2.put(str, c0vsz3);
                            t2 = c0vsz3;
                        }
                        c259800zU.element = t2;
                        c098200Yq4 = Unit.LIZ;
                        C189200o6.m2constructorimpl(c098200Yq4);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq4 = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq4);
                    }
                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq4);
                    if (thM5exceptionOrNullimpl != null) {
                        C1532760pzO.LIZJ(C1532920pze.LIZJ, "GeckoUtils", "getPathByLoader", "error occurs", thM5exceptionOrNullimpl, null, 32);
                    }
                    C189200o6.m1boximpl(c098200Yq4);
                }
            }
        }
        T t3 = c259800zU.element;
        if (t3 == 0) {
            return null;
        }
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(File.separator);
            c098200Yq = ((C0VSZ) t3).LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            C1532920pze.LIZJ.LIZIZ("GeckoUtils", "getPathByLoader", "error occurs when getting path");
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str4 = (String) c098200Yq;
        if (str4 == null) {
            return null;
        }
        try {
            c098200Yq2 = new C0VSJ(str4);
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq2 = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq2) != null) {
            C1532920pze.LIZJ.LIZIZ("GeckoUtils", "getPathByLoader", "error occurs when getting file");
        }
        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
            return null;
        }
        try {
            c098200Yq3 = C2095008Iq.LJIILIIL((String) a0.LJJLIIIJILLIZJL(str4, new String[]{File.separator}, 0, 6).get(r1.size() - 2));
            C189200o6.m2constructorimpl(c098200Yq3);
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            c098200Yq3 = new C098200Yq(th4);
            C189200o6.m2constructorimpl(c098200Yq3);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq3) != null) {
            C1532920pze.LIZJ.LIZIZ("GeckoUtils", "getPathByLoader", "error occurs when getting version");
        }
        if (C189200o6.m7isFailureimpl(c098200Yq3)) {
            c098200Yq3 = null;
        }
        Long l = (Long) c098200Yq3;
        if (l == null) {
            return null;
        }
        return new Pair(c098200Yq2, Long.valueOf(l.longValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0196 A[PHI: r0
      0x0196: PHI (r0v61 java.lang.String) = (r0v60 java.lang.String), (r0v64 java.lang.String) binds: [B:53:0x014f, B:55:0x0158] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(final X.C1532950pzh r10, boolean r11, final java.lang.String r12, final java.lang.String r13, X.C1532710pzJ r14, final X.InterfaceC1533340q0K r15, boolean r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1533310q0H.LIZ(X.0pzh, boolean, java.lang.String, java.lang.String, X.0pzJ, X.0q0K, boolean, boolean):void");
    }
}
