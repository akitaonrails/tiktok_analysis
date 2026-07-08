package X;

import com.bytedance.aigc.proto.Level;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0LdA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C547220LdA {
    public final String LIZ;
    public final C547200Ld8 LIZIZ;
    public final C547180Ld6 LIZJ;
    public boolean LJ;
    public volatile Boolean LJI;
    public final ConcurrentHashMap<String, C547230LdB> LIZLLL = new ConcurrentHashMap<>();
    public Level LJFF = Level.DEBUG;

    public final void LIZ() {
        if (this.LJ || this.LIZLLL.isEmpty()) {
            return;
        }
        ConcurrentHashMap<String, C547230LdB> concurrentHashMap = this.LIZLLL;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(concurrentHashMap.size()));
        Iterator<T> it2 = concurrentHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            linkedHashMap.put(entry.getKey(), ((C547230LdB) entry.getValue()).LIZIZ);
        }
        C01GW c01gw = C547160Ld4.LIZ;
        C547160Ld4.LJ(this.LJFF, this.LIZ, this.LIZIZ, this.LIZJ, new AwS582S0100000_3(linkedHashMap, (Map<String, String>) 116));
        this.LIZLLL.clear();
        this.LJFF = Level.DEBUG;
        this.LJI = null;
    }

    public final C547270LdF LIZLLL() {
        C547270LdF c547270LdF;
        Object c098200Yq;
        Object c098200Yq2;
        String strName = this.LIZIZ.LIZIZ.name();
        if (!C547240LdC.LIZIZ) {
            synchronized (C547240LdC.LIZJ) {
                try {
                    if (!C547240LdC.LIZIZ) {
                        try {
                            List list = (List) C547240LdC.LIZLLL.invoke();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : list) {
                                if (obj instanceof AbstractC806270Vk1) {
                                    arrayList.add(obj);
                                }
                            }
                            ArrayList<AbstractC806270Vk1> arrayList2 = new ArrayList();
                            for (Object obj2 : arrayList) {
                                AbstractC806270Vk1 abstractC806270Vk1 = (AbstractC806270Vk1) obj2;
                                try {
                                    c098200Yq2 = Boolean.valueOf(abstractC806270Vk1.LIZ());
                                    C189200o6.m2constructorimpl(c098200Yq2);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    c098200Yq2 = new C098200Yq(th);
                                    C189200o6.m2constructorimpl(c098200Yq2);
                                }
                                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
                                if (thM5exceptionOrNullimpl != null) {
                                    C547140Ld2 c547140Ld2 = C547130Ld1.LIZIZ;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("shouldRegister() error for provider ");
                                    sbLIZ.append(abstractC806270Vk1.getClass().getSimpleName());
                                    c547140Ld2.LIZIZ("AIKitTraceConfigRegistry", C2188811AlT.LIZIZ(sbLIZ), thM5exceptionOrNullimpl);
                                }
                                Boolean bool = Boolean.FALSE;
                                if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                                    c098200Yq2 = bool;
                                }
                                if (((Boolean) c098200Yq2).booleanValue()) {
                                    arrayList2.add(obj2);
                                }
                            }
                            for (AbstractC806270Vk1 abstractC806270Vk12 : arrayList2) {
                                try {
                                    c098200Yq = abstractC806270Vk12.LIZJ();
                                    C189200o6.m2constructorimpl(c098200Yq);
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    c098200Yq = new C098200Yq(th2);
                                    C189200o6.m2constructorimpl(c098200Yq);
                                }
                                Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                                if (thM5exceptionOrNullimpl2 != null) {
                                    C547140Ld2 c547140Ld22 = C547130Ld1.LIZIZ;
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("getConfig() error for provider ");
                                    sbLIZ2.append(abstractC806270Vk12.getClass().getSimpleName());
                                    c547140Ld22.LIZIZ("AIKitTraceConfigRegistry", C2188811AlT.LIZIZ(sbLIZ2), thM5exceptionOrNullimpl2);
                                }
                                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                                    c098200Yq = null;
                                }
                                C547290LdH c547290LdH = (C547290LdH) c098200Yq;
                                if (c547290LdH != null) {
                                    C547240LdC.LIZ.put(c547290LdH.LIZ, c547290LdH);
                                }
                            }
                            C547240LdC.LIZIZ = true;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C547130Ld1.LIZIZ.LIZIZ("AIKitTraceConfigRegistry", "discover providers error", e);
                        }
                    }
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    throw th3;
                }
            }
        }
        C547290LdH c547290LdH2 = C547240LdC.LIZ.get(strName);
        return (c547290LdH2 == null || (c547270LdF = c547290LdH2.LIZIZ) == null) ? C547270LdF.LJFF : c547270LdF;
    }

    public static void LIZIZ(C547220LdA c547220LdA, Function1 function1) {
        c547220LdA.getClass();
        c547220LdA.LJ(null, function1, Level.DEBUG);
    }

    public static void LIZJ(C547220LdA c547220LdA, Function1 function1) {
        c547220LdA.getClass();
        c547220LdA.LJ(null, new AwS587S0100000_8(function1, 646), Level.ERROR);
    }

    public C547220LdA(String str, C547200Ld8 c547200Ld8, C547180Ld6 c547180Ld6) {
        this.LIZ = str;
        this.LIZIZ = c547200Ld8;
        this.LIZJ = c547180Ld6;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(java.lang.String r6, kotlin.jvm.functions.Function1 r7, com.bytedance.aigc.proto.Level r8) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C547220LdA.LJ(java.lang.String, kotlin.jvm.functions.Function1, com.bytedance.aigc.proto.Level):void");
    }
}
