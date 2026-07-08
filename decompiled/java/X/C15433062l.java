package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS229S0000000_2;

/* JADX INFO: renamed from: X.062l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15433062l {
    public static final C15433062l LIZ = new C15433062l();
    public static final ConcurrentHashMap<String, C15437062p> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, C15436062o<?>> LIZJ = new ConcurrentHashMap<>();
    public static volatile long LIZLLL;

    public static void LIZIZ(long j) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, C15437062p> entry : LIZIZ.entrySet()) {
            String key = entry.getKey();
            if (j - entry.getValue().LIZIZ >= 300000) {
                arrayList.add(key);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            LIZIZ.remove(it2.next());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<String, C15436062o<?>> entry2 : LIZJ.entrySet()) {
            String key2 = entry2.getKey();
            if (j - entry2.getValue().LIZIZ >= 300000) {
                arrayList2.add(key2);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            LIZJ.remove(it3.next());
        }
    }

    public static String LIZJ(String str, Map map) {
        if (map != null && !map.isEmpty()) {
            String strLJJLIIIJ = C13LP.LJJLIIIJ(new TreeMap(map).entrySet(), "&", null, null, 0, null, AFwS229S0000000_2.get$arr$(136), 30);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('?');
            sbLIZ.append(strLJJLIIIJ);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    public static void LJ(String str, Map map) {
        String strLIZJ = LIZJ(str, map);
        LIZIZ.remove(strLIZJ);
        LIZJ.remove(strLIZJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(long r8, java.lang.String r10, X.InterfaceC1364105Vn r11, X.AnonymousClass0957 r12) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof X.C15434062m
            if (r0 == 0) goto L25
            r6 = r11
            X.062m r6 = (X.C15434062m) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r1 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L36
            if (r0 == r3) goto L33
            if (r0 != r4) goto L2b
            java.lang.Object r10 = r6.LL
            goto L68
        L25:
            X.062m r6 = new X.062m
            r6.<init>(r7, r11)
            goto L12
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            java.lang.Object r10 = r6.LL
            goto L4d
        L36:
            X.C155000ia.LIZIZ(r1)
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L57
            r6.LL = r10     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L84
            r6.LLILZ = r3     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L84
            java.lang.Object r1 = r12.LJLIIIL(r6)     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L84
            if (r1 != r5) goto L50
            return r5
        L4d:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L84
        L50:
            X.00o6 r1 = (X.C189200o6) r1     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L84
            java.lang.Object r0 = r1.m10unboximpl()     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L84
            return r0
        L57:
            X.01cV r1 = new X.01cV     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L84
            r0 = 0
            r1.<init>(r12, r0)     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L84
            r6.LL = r10     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L84
            r6.LLILZ = r4     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L84
            java.lang.Object r1 = X.C099A.LIZIZ(r8, r1, r6)     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L84
            if (r1 != r5) goto L6b
            return r5
        L68:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L84
        L6b:
            X.00o6 r1 = (X.C189200o6) r1     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L84
            java.lang.Object r0 = r1.m10unboximpl()     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L84
            return r0
        L72:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.062o<?>> r0 = X.C15433062l.LIZJ
            r0.remove(r10)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r0
        L84:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.062o<?>> r0 = X.C15433062l.LIZJ
            r0.remove(r10)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15433062l.LIZ(long, java.lang.String, X.05Vn, X.0957):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object LIZLLL(java.lang.String r13, java.util.Map<java.lang.String, java.lang.String> r14, long r15, kotlin.jvm.functions.Function1<? super X.InterfaceC1364105Vn<? super X.C189200o6<? extends T>>, ? extends java.lang.Object> r17, X.InterfaceC1364105Vn<? super X.C189200o6<? extends T>> r18) {
        /*
            r12 = this;
            r3 = r18
            boolean r0 = r3 instanceof X.C15435062n
            if (r0 == 0) goto L42
            r4 = r3
            X.062n r4 = (X.C15435062n) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L42
            int r2 = r2 - r1
            r4.LLILLL = r2
        L14:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L2b
            if (r1 != r0) goto L48
            X.C155000ia.LIZIZ(r3)
        L24:
            X.00o6 r3 = (X.C189200o6) r3
            java.lang.Object r0 = r3.m10unboximpl()
            return r0
        L2b:
            X.C155000ia.LIZIZ(r3)
            X.062k r5 = new X.062k
            r11 = 0
            r10 = r17
            r8 = r15
            r7 = r14
            r6 = r13
            r5.<init>(r6, r7, r8, r10, r11)
            r4.LLILLL = r0
            java.lang.Object r3 = X.C2296808zG.LJ(r5, r4)
            if (r3 != r2) goto L24
            return r2
        L42:
            X.062n r4 = new X.062n
            r4.<init>(r12, r3)
            goto L14
        L48:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15433062l.LIZLLL(java.lang.String, java.util.Map, long, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }
}
