package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.13w3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20170113w3<P> {
    public InterfaceC497601wk LIZ;
    public final LinkedHashMap<C20168613vo, C20169913w1<P>> LIZIZ = new LinkedHashMap<>();
    public final HashMap<C20168613vo, Set<C20168613vo>> LIZJ = new HashMap<>();
    public final HashMap<C20168613vo, Set<C20168613vo>> LIZLLL = new HashMap<>();
    public final HashMap<C20168613vo, Integer> LJ = new HashMap<>();
    public final List<C20168613vo> LJFF = new ArrayList();
    public final ConcurrentHashMap<C20168613vo, EnumC20169713vz> LJI = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<C20168613vo, Throwable> LJII = new ConcurrentHashMap<>();
    public C20170413w6 LJIIIIZZ;

    public C20170113w3(InterfaceC497601wk interfaceC497601wk) {
        this.LIZ = interfaceC497601wk;
    }

    public final void LIZIZ(C20169913w1<P> c20169913w1) {
        this.LIZIZ.put(c20169913w1.LIZIZ(), c20169913w1);
        HashMap<C20168613vo, Set<C20168613vo>> map = this.LIZJ;
        C20168613vo c20168613voLIZIZ = c20169913w1.LIZIZ();
        if (map.get(c20168613voLIZIZ) == null) {
            map.put(c20168613voLIZIZ, new LinkedHashSet());
        }
        HashMap<C20168613vo, Set<C20168613vo>> map2 = this.LIZLLL;
        C20168613vo c20168613voLIZIZ2 = c20169913w1.LIZIZ();
        if (map2.get(c20168613voLIZIZ2) == null) {
            map2.put(c20168613voLIZIZ2, new LinkedHashSet());
        }
    }

    public final void LIZ(C20168613vo c20168613vo, C20168613vo c20168613vo2) {
        HashMap<C20168613vo, Set<C20168613vo>> map = this.LIZJ;
        Set<C20168613vo> linkedHashSet = map.get(c20168613vo2);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
            map.put(c20168613vo2, linkedHashSet);
        }
        linkedHashSet.add(c20168613vo);
        HashMap<C20168613vo, Set<C20168613vo>> map2 = this.LIZLLL;
        Set<C20168613vo> linkedHashSet2 = map2.get(c20168613vo);
        if (linkedHashSet2 == null) {
            linkedHashSet2 = new LinkedHashSet<>();
            map2.put(c20168613vo, linkedHashSet2);
        }
        linkedHashSet2.add(c20168613vo2);
    }

    public static final <P> void LJ(C20170113w3<P> c20170113w3, Function1<? super C20170413w6, Unit> function1, C20170413w6 c20170413w6) {
        c20170113w3.LJIIIIZZ = c20170413w6;
        if (function1 != null) {
            function1.invoke(c20170413w6);
        }
        C20168613vo c20168613vo = c20170413w6.LIZ;
        C13E8 c13e8 = new C13E8();
        HashSet hashSet = new HashSet();
        c13e8.addLast(c20168613vo);
        hashSet.add(c20168613vo);
        while (!c13e8.isEmpty()) {
            Set<C20168613vo> set = c20170113w3.LIZJ.get(c13e8.removeFirst());
            if (set == null) {
                set = C08CX.INSTANCE;
            }
            for (C20168613vo c20168613vo2 : set) {
                if (hashSet.add(c20168613vo2)) {
                    EnumC20169713vz enumC20169713vz = c20170113w3.LJI.get(c20168613vo2);
                    if (enumC20169713vz == EnumC20169713vz.PENDING || enumC20169713vz == EnumC20169713vz.RUNNING) {
                        ConcurrentHashMap<C20168613vo, EnumC20169713vz> concurrentHashMap = c20170113w3.LJI;
                        EnumC20169713vz enumC20169713vz2 = EnumC20169713vz.SKIPPED;
                        concurrentHashMap.put(c20168613vo2, enumC20169713vz2);
                        if (function1 != null) {
                            function1.invoke(new C20170413w6(c20168613vo2, enumC20169713vz2, 0L, null, Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT), false, false, 0, 236));
                        }
                    }
                    c13e8.addLast(c20168613vo2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <P> java.lang.Object LIZLLL(X.InterfaceC383701eN r7, X.C20170113w3<P> r8, X.C20168613vo r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            boolean r0 = r10 instanceof X.C20170313w5
            if (r0 == 0) goto L2a
            r3 = r10
            X.13w5 r3 = (X.C20170313w5) r3
            int r2 = r3.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2a
            int r2 = r2 - r1
            r3.LLILZIL = r2
        L12:
            java.lang.Object r2 = r3.LLILZ
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r3.LLILZIL
            r5 = 0
            r6 = 1
            if (r0 == 0) goto L38
            if (r0 != r6) goto L30
            X.13vo r9 = r3.LLILLL
            X.13w3 r8 = r3.LLILLJJLI
            X.01eN r7 = r3.LL
            X.C155000ia.LIZIZ(r2)
            goto L4a
        L2a:
            X.13w5 r3 = new X.13w5
            r3.<init>(r10)
            goto L12
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L38:
            X.C155000ia.LIZIZ(r2)
            r3.LL = r7
            r3.LLILLJJLI = r8
            r3.LLILLL = r9
            r3.LLILZIL = r6
            java.lang.Object r0 = r7.LIZLLL(r5, r3)
            if (r0 != r1) goto L4a
            return r1
        L4a:
            java.util.HashMap<X.13vo, java.util.Set<X.13vo>> r0 = r8.LIZJ     // Catch: java.lang.Throwable -> L90
            java.lang.Object r0 = r0.get(r9)     // Catch: java.lang.Throwable -> L90
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Throwable -> L90
            if (r0 != 0) goto L56
            X.08CX r0 = X.C08CX.INSTANCE     // Catch: java.lang.Throwable -> L90
        L56:
            java.util.Iterator r4 = r0.iterator()     // Catch: java.lang.Throwable -> L90
        L5a:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto L8a
            java.lang.Object r3 = r4.next()     // Catch: java.lang.Throwable -> L90
            X.13vo r3 = (X.C20168613vo) r3     // Catch: java.lang.Throwable -> L90
            java.util.HashMap<X.13vo, java.lang.Integer> r0 = r8.LJ     // Catch: java.lang.Throwable -> L90
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L90
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto L88
            int r2 = r0.intValue()     // Catch: java.lang.Throwable -> L90
        L74:
            int r2 = r2 - r6
            java.lang.Integer r1 = X.C2286608xc.LJ(r2)     // Catch: java.lang.Throwable -> L90
            java.util.HashMap<X.13vo, java.lang.Integer> r0 = r8.LJ     // Catch: java.lang.Throwable -> L90
            r0.put(r3, r1)     // Catch: java.lang.Throwable -> L90
            if (r2 > 0) goto L5a
            java.util.List<X.13vo> r0 = r8.LJFF     // Catch: java.lang.Throwable -> L90
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L90
            r0.add(r3)     // Catch: java.lang.Throwable -> L90
            goto L5a
        L88:
            r2 = 0
            goto L74
        L8a:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L90
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L90
            goto L9c
        L90:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L9c:
            r7.LIZIZ(r5)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20170113w3.LIZLLL(X.01eN, X.13w3, X.13vo, X.05Vn):java.lang.Object");
    }

    public static final <P> Object LJFF(Function1<? super C20170413w6, Unit> function1, InterfaceC383701eN interfaceC383701eN, C20170113w3<P> c20170113w3, C20170413w6 c20170413w6, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        if (function1 != null) {
            function1.invoke(c20170413w6);
        }
        Object objLIZLLL = LIZLLL(interfaceC383701eN, c20170113w3, c20170413w6.LIZ, interfaceC1364105Vn);
        if (objLIZLLL == C099R.LJFF()) {
            return objLIZLLL;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:21:0x0079, B:33:0x00a3], limit reached: 133 */
    /* JADX WARN: Path cross not found for [B:33:0x00a3, B:21:0x0079], limit reached: 133 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0149 A[EDGE_INSN: B:113:0x0149->B:59:0x0149 BREAK  A[LOOP:2: B:55:0x013b->B:114:?]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0281  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v2, types: [T, java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x01f0 -> B:12:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(P r26, kotlin.jvm.functions.Function1<? super X.C20168613vo, kotlin.Unit> r27, kotlin.jvm.functions.Function1<? super X.C20170413w6, kotlin.Unit> r28, kotlin.jvm.functions.Function1<? super X.C20170413w6, kotlin.Unit> r29, X.InterfaceC1364105Vn<? super P> r30) {
        /*
            Method dump skipped, instruction units count: 667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20170113w3.LIZJ(java.lang.Object, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }
}
