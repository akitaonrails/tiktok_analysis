package X;

import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.e;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.AwS602S0100000_23;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0pzV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532830pzV implements InterfaceC1541110qCr<C1532750pzN, C1532790pzR> {
    public final String LIZ = "strict_match";
    public final String LIZIZ = "ignored_all_keys";
    public final String LIZJ = "ignored_match_keys";
    public final String LIZLLL = "need_common_params";
    public final HashSet<String> LJ = C093Y.LIZJ("ignored_match_keys", "ignored_all_keys", "need_common_params", "strict_match");

    @Override // X.InterfaceC1541110qCr
    public final void LIZ(C1541080qCo<C1532790pzR> c1541080qCo, String str) {
    }

    @Override // X.InterfaceC1541110qCr
    public final void LIZIZ(InterfaceC1541060qCm interfaceC1541060qCm, AbstractC1541140qCu<C1532790pzR> abstractC1541140qCu, EnumC1541150qCv enumC1541150qCv) {
    }

    @Override // X.InterfaceC1541110qCr
    public final boolean LIZLLL(InterfaceC1541060qCm interfaceC1541060qCm, InterfaceC1541060qCm interfaceC1541060qCm2) {
        return true;
    }

    @Override // X.InterfaceC1541110qCr
    public final boolean LJI(C1541080qCo<C1532790pzR> c1541080qCo) {
        return true;
    }

    @Override // X.InterfaceC1541110qCr
    public final void LJII(InterfaceC1541060qCm interfaceC1541060qCm, C1541080qCo<C1532790pzR> c1541080qCo) {
    }

    @Override // X.InterfaceC1541110qCr
    public final InterfaceC1541060qCm LJ(Object obj, boolean z) {
        C1532750pzN c1532750pzN = (C1532750pzN) obj;
        InterfaceC1532860pzY.LIZ.getClass();
        if (C1532910pzd.LIZJ == null || !C1532880pza.LIZ.contains(c1532750pzN.LIZIZ)) {
            return null;
        }
        return c1532750pzN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.google.gson.k] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [com.google.gson.n] */
    /* JADX WARN: Type inference failed for: r4v14, types: [com.google.gson.n] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.gson.k] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // X.InterfaceC1541110qCr
    public final C1532750pzN LIZJ(k kVar, C08AB c08ab, Map map) {
        Object c098200Yq;
        Object c098200Yq2;
        String lowerCase;
        Object c098200Yq3;
        LinkedHashMap<String, String> linkedHashMapLJ;
        Object c098200Yq4;
        boolean z;
        ?? r4;
        String strLJIL;
        Object c098200Yq5;
        boolean zBooleanValue;
        Object c098200Yq6;
        Object c098200Yq7;
        LinkedHashMap<String, String> linkedHashMap;
        EnumC838370Wuh enumC838370Wuh;
        Object c098200Yq8;
        if (kVar instanceof n) {
            n nVarLJIILIIL = kVar.LJIILIIL();
            try {
                c098200Yq = nVarLJIILIIL.LJJIIZ("url").LJIL();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            String str = (String) c098200Yq;
            if (str == null) {
                C1532930pzf.LIZJ.LIZIZ("NetService", "parseInput", "cannot get url, which is required");
                return null;
            }
            try {
                k kVarLJJIIZ = nVarLJIILIIL.LJJIIZ("method");
                if (kVarLJJIIZ != null) {
                    c098200Yq2 = kVarLJJIIZ.LJIL();
                } else {
                    c098200Yq2 = null;
                }
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = null;
            }
            String str2 = (String) c098200Yq2;
            if (str2 != null && (lowerCase = str2.toLowerCase(Locale.ROOT)) != null) {
                final C013C c013c = new C013C();
                c013c.element = true;
                final C013C c013c2 = new C013C();
                final C259800zU c259800zU = new C259800zU();
                Class cls = String.class;
                final C013C c013c3 = new C013C();
                c013c3.element = true;
                try {
                    k kVarLJJIIZ2 = nVarLJIILIIL.LJJIIZ("query");
                    kVarLJJIIZ2.getClass();
                    if (kVarLJJIIZ2 instanceof n) {
                        c098200Yq3 = kVarLJJIIZ2.LJIILIIL();
                    } else {
                        c098200Yq3 = null;
                    }
                    C189200o6.m2constructorimpl(c098200Yq3);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    c098200Yq3 = new C098200Yq(th3);
                    C189200o6.m2constructorimpl(c098200Yq3);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq3)) {
                    c098200Yq3 = null;
                }
                n nVar = (n) c098200Yq3;
                if (nVar != null) {
                    c08ab.LIZJ("parse_query");
                    C1532870pzZ c1532870pzZ = C1532870pzZ.LIZ;
                    InterfaceC1514200pVS interfaceC1514200pVS = new InterfaceC1514200pVS() { // from class: X.0pVR
                        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.util.HashSet] */
                        @Override // X.InterfaceC1514200pVS
                        public final boolean LIZ(String str3, k kVar2) {
                            if (!this.LIZ.LJ.contains(str3)) {
                                return false;
                            }
                            C1532830pzV c1532830pzV = this.LIZ;
                            C013C c013c4 = c013c2;
                            C259800zU<Set<String>> c259800zU2 = c259800zU;
                            C013C c013c5 = c013c;
                            C013C c013c6 = c013c3;
                            try {
                                if (Intrinsics.LJFF(str3, c1532830pzV.LIZIZ)) {
                                    c013c4.element = kVar2.LJ();
                                } else if (Intrinsics.LJFF(str3, c1532830pzV.LIZJ)) {
                                    ?? hashSet = new HashSet();
                                    Iterator<k> it2 = kVar2.LJIIL().iterator();
                                    while (it2.hasNext()) {
                                        hashSet.add(it2.next().LJIL());
                                    }
                                    c259800zU2.element = hashSet;
                                } else if (Intrinsics.LJFF(str3, c1532830pzV.LIZLLL)) {
                                    c013c5.element = kVar2.LJ();
                                } else if (Intrinsics.LJFF(str3, c1532830pzV.LIZ)) {
                                    c013c6.element = kVar2.LJ();
                                }
                                C189200o6.m2constructorimpl(Unit.LIZ);
                                return true;
                            } catch (Throwable th4) {
                                TryCatchGuardChecker.doCheck(th4);
                                C189200o6.m2constructorimpl(new C098200Yq(th4));
                                return true;
                            }
                        }
                    };
                    c1532870pzZ.getClass();
                    linkedHashMapLJ = C1532870pzZ.LIZIZ(nVar, false, map, interfaceC1514200pVS, false).LJ();
                } else {
                    linkedHashMapLJ = null;
                }
                try {
                    k kVarLJJIIZ3 = nVarLJIILIIL.LJJIIZ("preferred_type");
                    if (kVarLJJIIZ3 != null) {
                        c098200Yq4 = kVarLJJIIZ3.LJIL();
                    } else {
                        c098200Yq4 = null;
                    }
                    C189200o6.m2constructorimpl(c098200Yq4);
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                    c098200Yq4 = new C098200Yq(th4);
                    C189200o6.m2constructorimpl(c098200Yq4);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq4)) {
                    c098200Yq4 = null;
                }
                String str3 = (String) c098200Yq4;
                boolean zBooleanValue2 = false;
                if (u.LJIJI(str3, "protobuf", true)) {
                    cls = TypedInput.class;
                    z = true;
                } else if (u.LJIJI(str3, "type_input", true)) {
                    cls = TypedInput.class;
                    z = false;
                } else {
                    z = true;
                }
                ?? LJJIIZ = nVarLJIILIIL.LJJIIZ("body");
                if (LJJIIZ != 0) {
                    if (LJJIIZ instanceof q) {
                        try {
                            strLJIL = LJJIIZ.LJIL();
                            try {
                                c098200Yq8 = Unit.LIZ;
                                C189200o6.m2constructorimpl(c098200Yq8);
                            } catch (Throwable th5) {
                                th = th5;
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq8 = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq8);
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            strLJIL = null;
                        }
                        C189200o6.m1boximpl(c098200Yq8);
                        r4 = 0;
                    } else {
                        if (LJJIIZ instanceof n) {
                            C1532870pzZ c1532870pzZ2 = C1532870pzZ.LIZ;
                            n nVarLJIILIIL2 = LJJIIZ.LJIILIIL();
                            c1532870pzZ2.getClass();
                            C08FT c08ftLIZIZ = C1532870pzZ.LIZIZ(nVarLJIILIIL2, false, map, null, true);
                            LJJIIZ = c08ftLIZIZ.LLILLJJLI;
                            if (LJJIIZ == 0) {
                                LJJIIZ = new n();
                                LinkedHashMap<String, String> linkedHashMap2 = c08ftLIZIZ.LL;
                                if (linkedHashMap2 != null) {
                                    for (Map.Entry<String, String> entry : linkedHashMap2.entrySet()) {
                                        LJJIIZ.LJJIFFI(entry.getKey(), new q(entry.getValue()));
                                    }
                                }
                            }
                        }
                        strLJIL = null;
                        r4 = LJJIIZ;
                    }
                } else {
                    r4 = 0;
                    strLJIL = null;
                }
                try {
                    k kVarLJJIIZ4 = nVarLJIILIIL.LJJIIZ("body_base_64");
                    if (kVarLJJIIZ4 != null) {
                        c098200Yq5 = Boolean.valueOf(kVarLJJIIZ4.LJ());
                    } else {
                        c098200Yq5 = null;
                    }
                    C189200o6.m2constructorimpl(c098200Yq5);
                } catch (Throwable th7) {
                    TryCatchGuardChecker.doCheck(th7);
                    c098200Yq5 = new C098200Yq(th7);
                    C189200o6.m2constructorimpl(c098200Yq5);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq5)) {
                    c098200Yq5 = null;
                }
                Boolean bool = (Boolean) c098200Yq5;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                try {
                    k kVarLJJIIZ5 = nVarLJIILIIL.LJJIIZ("disable_redirect");
                    if (kVarLJJIIZ5 != null) {
                        c098200Yq6 = Boolean.valueOf(kVarLJJIIZ5.LJ());
                    } else {
                        c098200Yq6 = null;
                    }
                    C189200o6.m2constructorimpl(c098200Yq6);
                } catch (Throwable th8) {
                    TryCatchGuardChecker.doCheck(th8);
                    c098200Yq6 = new C098200Yq(th8);
                    C189200o6.m2constructorimpl(c098200Yq6);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq6)) {
                    c098200Yq6 = null;
                }
                Boolean bool2 = (Boolean) c098200Yq6;
                if (bool2 != null) {
                    zBooleanValue2 = bool2.booleanValue();
                }
                try {
                    k kVarLJJIIZ6 = nVarLJIILIIL.LJJIIZ("header");
                    kVarLJJIIZ6.getClass();
                    if (kVarLJJIIZ6 instanceof n) {
                        c098200Yq7 = kVarLJJIIZ6.LJIILIIL();
                    } else {
                        c098200Yq7 = null;
                    }
                    C189200o6.m2constructorimpl(c098200Yq7);
                } catch (Throwable th9) {
                    TryCatchGuardChecker.doCheck(th9);
                    c098200Yq7 = new C098200Yq(th9);
                    C189200o6.m2constructorimpl(c098200Yq7);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq7)) {
                    c098200Yq7 = null;
                }
                n nVar2 = (n) c098200Yq7;
                if (nVar2 != null) {
                    c08ab.LIZJ("parse_header");
                    C1532870pzZ.LIZ.getClass();
                    linkedHashMap = C1532870pzZ.LIZIZ(nVar2, true, map, null, false).LJ();
                } else {
                    linkedHashMap = null;
                }
                Set set = (Set) c259800zU.element;
                if (c013c3.element) {
                    enumC838370Wuh = EnumC838370Wuh.STRICT;
                } else if (c013c2.element) {
                    enumC838370Wuh = EnumC838370Wuh.IGNORE;
                } else {
                    enumC838370Wuh = EnumC838370Wuh.FUZZY;
                }
                C1532720pzK c1532720pzKLIZIZ = C1532730pzL.LIZIZ(str, set, linkedHashMapLJ, enumC838370Wuh);
                boolean z2 = c013c.element;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap<>();
                }
                return new C1532750pzN(c1532720pzKLIZIZ, lowerCase, cls, zBooleanValue2, z2, linkedHashMap, strLJIL, zBooleanValue, r4, null, null, z, 13824);
            }
            C1532930pzf.LIZJ.LIZIZ("NetService", "parseInput", "cannot get method, which is required");
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC1541110qCr
    public final C1535940q4W LJFF(C1532750pzN c1532750pzN, InterfaceC1541060qCm interfaceC1541060qCm, C1535940q4W c1535940q4W) {
        C1532750pzN c1532750pzN2 = c1532750pzN;
        if (c1535940q4W != null && Intrinsics.LJFF(c1532750pzN2.LIZJ, TypedInput.class)) {
            c1535940q4W.LJ = EnumC1533170q03.ONLY_ONCE;
        }
        return c1535940q4W;
    }

    @Override // X.InterfaceC1541110qCr
    public final void LJIIIIZZ(InterfaceC1541240qD4 interfaceC1541240qD4, C08AB c08ab, C1541080qCo c1541080qCo) {
        C1532750pzN c1532750pzN;
        int i;
        C1532790pzR c1532790pzR = (C1532790pzR) interfaceC1541240qD4;
        if (c08ab != null && c1541080qCo != null) {
            Integer num = c1541080qCo.LJIILIIL;
            InterfaceC1541060qCm interfaceC1541060qCm = c1541080qCo.LIZ.LIZLLL;
            String str = null;
            if ((interfaceC1541060qCm instanceof C1532750pzN) && (c1532750pzN = (C1532750pzN) interfaceC1541060qCm) != null) {
                if ((num != null && num.intValue() >= 0) || c1541080qCo.LIZ.LIZ) {
                    InterfaceC1532860pzY.LIZ.getClass();
                    InterfaceC1532860pzY interfaceC1532860pzY = C1532910pzd.LIZJ;
                    if (interfaceC1532860pzY != null) {
                        C1532720pzK c1532720pzK = c1532750pzN.LIZ;
                        C0X52<?> c0x52 = c1532790pzR.LIZ;
                        if (c0x52 != null) {
                            i = c0x52.LIZ.LIZIZ;
                        } else {
                            i = -1;
                        }
                        boolean z = c1541080qCo.LIZ.LIZ;
                        String strLJIIJJI = c1541080qCo.LJIIJJI();
                        C1540860qCS c1540860qCSLJIIJ = c1541080qCo.LJIIJ();
                        if (c1540860qCSLJIIJ != null) {
                            str = c1540860qCSLJIIJ.LIZJ;
                        }
                        interfaceC1532860pzY.LJI(c1532720pzK, c08ab, i, z, strLJIIJJI, str);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1541110qCr
    public final AbstractC1541130qCt<?> LJIIIZ(InterfaceC1541060qCm interfaceC1541060qCm, final C1541080qCo<C1532790pzR> c1541080qCo, AbstractC1541130qCt<?> abstractC1541130qCt) {
        final C1532750pzN c1532750pzN = (C1532750pzN) interfaceC1541060qCm;
        return new AbstractC1541130qCt<C1532700pzI>(c1532750pzN, c1541080qCo) { // from class: X.0pzI
            public static final Gson LJII;
            public final C1532750pzN LIZLLL;
            public volatile C1532790pzR LJ;
            public volatile C0X9S<?> LJFF;
            public final AtomicReference<C1532010pyB<C1532790pzR>> LJI;

            @Override // X.AbstractC1541130qCt
            public final boolean LJFF(InterfaceC1541240qD4 interfaceC1541240qD4) {
                return false;
            }

            static {
                e eVar = new e();
                eVar.LJIILIIL = true;
                LJII = eVar.LIZ();
            }

            @Override // X.AbstractC1541130qCt
            public final boolean LIZIZ() {
                C0X52<?> c0x52;
                C2175508fh c2175508fh;
                TypedInput typedInput;
                InputStream inputStreamIn;
                C0X52<?> c0x522;
                InputStream inputStreamIn2;
                C0X9S<?> c0x9s = this.LJFF;
                Unit unit = null;
                if (c0x9s == null) {
                    C1532790pzR c1532790pzR = this.LJ;
                    if (c1532790pzR == null || (c0x522 = c1532790pzR.LIZ) == null) {
                        return false;
                    }
                    try {
                        TypedInput typedInput2 = c0x522.LIZ.LJ;
                        if (typedInput2 != null && (inputStreamIn2 = typedInput2.in()) != null) {
                            inputStreamIn2.close();
                            unit = Unit.LIZ;
                        }
                        C189200o6.m2constructorimpl(unit);
                        return true;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                        return true;
                    }
                }
                try {
                    c0x9s.cancel();
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                }
                try {
                    C1532790pzR c1532790pzR2 = this.LJ;
                    if (c1532790pzR2 != null && (c0x52 = c1532790pzR2.LIZ) != null && (c2175508fh = c0x52.LIZ) != null && (typedInput = c2175508fh.LJ) != null && (inputStreamIn = typedInput.in()) != null) {
                        inputStreamIn.close();
                        unit = Unit.LIZ;
                    }
                    C189200o6.m2constructorimpl(unit);
                    return true;
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    C189200o6.m2constructorimpl(new C098200Yq(th3));
                    return true;
                }
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:159:0x0385 A[Catch: all -> 0x04af, TryCatch #6 {all -> 0x04af, blocks: (B:112:0x02b0, B:113:0x02b8, B:137:0x033b, B:139:0x0341, B:141:0x0347, B:143:0x034f, B:147:0x035a, B:149:0x0360, B:150:0x0365, B:152:0x036d, B:154:0x0373, B:156:0x0377, B:166:0x03a5, B:168:0x03a9, B:178:0x03ef, B:157:0x037d, B:159:0x0385, B:161:0x038b, B:163:0x038f, B:165:0x0397, B:169:0x03ad, B:170:0x03be, B:172:0x03c4, B:173:0x03dc, B:175:0x03e0, B:151:0x0369), top: B:234:0x02b0 }] */
            /* JADX WARN: Removed duplicated region for block: B:168:0x03a9 A[Catch: all -> 0x04af, TryCatch #6 {all -> 0x04af, blocks: (B:112:0x02b0, B:113:0x02b8, B:137:0x033b, B:139:0x0341, B:141:0x0347, B:143:0x034f, B:147:0x035a, B:149:0x0360, B:150:0x0365, B:152:0x036d, B:154:0x0373, B:156:0x0377, B:166:0x03a5, B:168:0x03a9, B:178:0x03ef, B:157:0x037d, B:159:0x0385, B:161:0x038b, B:163:0x038f, B:165:0x0397, B:169:0x03ad, B:170:0x03be, B:172:0x03c4, B:173:0x03dc, B:175:0x03e0, B:151:0x0369), top: B:234:0x02b0 }] */
            /* JADX WARN: Removed duplicated region for block: B:176:0x03eb  */
            /* JADX WARN: Removed duplicated region for block: B:181:0x0408 A[Catch: all -> 0x04ad, TryCatch #5 {all -> 0x04ad, blocks: (B:195:0x0482, B:115:0x02bd, B:117:0x02c5, B:119:0x02cb, B:121:0x02d3, B:124:0x02dc, B:126:0x02e2, B:128:0x02e6, B:131:0x0312, B:133:0x0318, B:134:0x031d, B:136:0x0325, B:194:0x047e, B:135:0x0321, B:129:0x02f9, B:179:0x03fa, B:181:0x0408, B:183:0x040c, B:185:0x0410, B:187:0x042e, B:188:0x0447, B:190:0x044d, B:191:0x0462, B:193:0x046a), top: B:233:0x02b8 }] */
            /* JADX WARN: Removed duplicated region for block: B:187:0x042e A[Catch: all -> 0x04ad, TryCatch #5 {all -> 0x04ad, blocks: (B:195:0x0482, B:115:0x02bd, B:117:0x02c5, B:119:0x02cb, B:121:0x02d3, B:124:0x02dc, B:126:0x02e2, B:128:0x02e6, B:131:0x0312, B:133:0x0318, B:134:0x031d, B:136:0x0325, B:194:0x047e, B:135:0x0321, B:129:0x02f9, B:179:0x03fa, B:181:0x0408, B:183:0x040c, B:185:0x0410, B:187:0x042e, B:188:0x0447, B:190:0x044d, B:191:0x0462, B:193:0x046a), top: B:233:0x02b8 }] */
            /* JADX WARN: Removed duplicated region for block: B:203:0x04c1  */
            /* JADX WARN: Removed duplicated region for block: B:205:0x04df  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x018f  */
            /* JADX WARN: Removed duplicated region for block: B:75:0x019f A[Catch: all -> 0x01f5, TRY_LEAVE, TryCatch #2 {all -> 0x01f5, blocks: (B:40:0x00fb, B:42:0x0105, B:44:0x010b, B:45:0x011f, B:46:0x0133, B:48:0x0139, B:50:0x013f, B:52:0x0147, B:56:0x0152, B:58:0x0158, B:59:0x015d, B:61:0x0165, B:63:0x016b, B:65:0x016f, B:72:0x0191, B:73:0x0199, B:75:0x019f, B:66:0x017e, B:68:0x0182, B:60:0x0161), top: B:228:0x00fb }] */
            /* JADX WARN: Removed duplicated region for block: B:77:0x01b2 A[Catch: all -> 0x01f3, TryCatch #1 {all -> 0x01f3, blocks: (B:78:0x01c4, B:76:0x01a5, B:77:0x01b2, B:79:0x01c8), top: B:227:0x0103 }] */
            /* JADX WARN: Removed duplicated region for block: B:87:0x0207  */
            /* JADX WARN: Removed duplicated region for block: B:89:0x0225  */
            /* JADX WARN: Type inference failed for: r10v1 */
            /* JADX WARN: Type inference failed for: r10v15 */
            /* JADX WARN: Type inference failed for: r10v16 */
            /* JADX WARN: Type inference failed for: r10v2, types: [byte[]] */
            /* JADX WARN: Type inference failed for: r10v3, types: [java.util.HashMap, java.util.LinkedHashMap] */
            /* JADX WARN: Type inference failed for: r10v4, types: [byte[]] */
            /* JADX WARN: Type inference failed for: r10v5 */
            /* JADX WARN: Type inference failed for: r10v8 */
            /* JADX WARN: Type inference failed for: r22v0, types: [X.0pzI, X.0qCt] */
            /* JADX WARN: Type inference failed for: r2v10 */
            /* JADX WARN: Type inference failed for: r2v11, types: [X.0qD0, java.lang.String] */
            /* JADX WARN: Type inference failed for: r2v12 */
            /* JADX WARN: Type inference failed for: r6v10 */
            /* JADX WARN: Type inference failed for: r6v126 */
            /* JADX WARN: Type inference failed for: r6v54 */
            /* JADX WARN: Type inference failed for: r6v56 */
            /* JADX WARN: Type inference failed for: r6v8 */
            @Override // X.InterfaceC1541360qDG
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void execute() {
                /*
                    Method dump skipped, instruction units count: 1390
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1532700pzI.execute():void");
            }

            public static C1493620oyG LJI(C1532750pzN c1532750pzN2) {
                C1493620oyG c1493620oyG = new C1493620oyG();
                boolean z = c1532750pzN2.LIZLLL;
                c1493620oyG.LJIILLIIL = !z;
                c1493620oyG.LJIIIZ = z;
                return c1493620oyG;
            }

            @Override // X.AbstractC1541130qCt
            public final boolean LJ(AbstractC1541130qCt abstractC1541130qCt2) {
                C1532700pzI c1532700pzI = (C1532700pzI) abstractC1541130qCt2;
                C1532790pzR c1532790pzR = this.LJ;
                if (c1532790pzR != null) {
                    c1532700pzI.LIZLLL(c1532790pzR, EnumC1541200qD0.CACHE);
                } else {
                    C1532010pyB<C1532790pzR> c1532010pyB = this.LJI.get();
                    if (c1532010pyB == null) {
                        c1532010pyB = new C1532010pyB<>();
                        AtomicReference<C1532010pyB<C1532790pzR>> atomicReference = this.LJI;
                        while (true) {
                            if (atomicReference.compareAndSet(null, c1532010pyB)) {
                                break;
                            }
                            if (atomicReference.get() != null) {
                                c1532010pyB = this.LJI.get();
                                break;
                            }
                        }
                    }
                    C1532790pzR c1532790pzR2 = this.LJ;
                    if (c1532790pzR2 != null) {
                        c1532700pzI.LIZLLL(c1532790pzR2, EnumC1541200qD0.CACHE);
                        C1532010pyB<C1532790pzR> andSet = this.LJI.getAndSet(null);
                        if (andSet != null) {
                            andSet.LIZIZ(c1532790pzR2);
                            return true;
                        }
                    } else {
                        if (c1532010pyB == null) {
                            C1532760pzO.LIZJ(C1532930pzf.LIZJ, "NetOperation", "onReuse", "cannot get response and synchronizer", null, null, 48);
                            return false;
                        }
                        if (this.LIZLLL.LJIILIIL) {
                            c1532010pyB.LIZ(c1532700pzI.LIZ, new AwS602S0100000_23(this, c1532700pzI, 38));
                            return true;
                        }
                        C1532960pzi.LJI(c1532010pyB.LIZIZ, c1532700pzI.LIZ, null);
                        C1532790pzR c1532790pzR3 = this.LJ;
                        if (c1532790pzR3 == null) {
                            return false;
                        }
                        c1532700pzI.LIZLLL(c1532790pzR3, EnumC1541200qD0.REQUEST);
                        return true;
                    }
                }
                return true;
            }

            public final void LJII(C1532790pzR c1532790pzR) {
                this.LJ = c1532790pzR;
                this.LJFF = null;
                C1532010pyB<C1532790pzR> andSet = this.LJI.getAndSet(null);
                if (andSet != null) {
                    andSet.LIZIZ(c1532790pzR);
                }
            }

            {
                super(c1541080qCo);
                this.LIZLLL = c1532750pzN;
                this.LJI = new AtomicReference<>(null);
            }
        };
    }
}
