package X;

import android.content.Context;
import com.ss.android.ugc.aweme.commentv2.headeranchor.CommentHeaderAnchorAssem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0lFF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1350390lFF {
    public static final C1350390lFF LIZ = new C1350390lFF();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1350370lFD());
    public static final Set<InterfaceC1350330lF9> LIZJ;
    public static List<InterfaceC1350330lF9> LIZLLL;
    public static final HashMap<String, InterfaceC1350330lF9> LJ;
    public static final boolean LJFF;
    public static final LinkedHashMap<String, InterfaceC1350330lF9> LJI;
    public static final C1DEV LJII;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LIZJ = linkedHashSet;
        LIZLLL = new ArrayList();
        LJ = new HashMap<>();
        LJFF = C0CNZ.LIZIZ();
        LJI = new LinkedHashMap<>(16, 0.75f, true);
        LJII = C2191201ApK.LIZ();
        CommentHeaderAnchorAssem.LLJJJJLIIL.getClass();
        linkedHashSet.addAll(C1350590lFZ.LIZ());
    }

    public static void LIZIZ(int i, Context context) {
        if (context == null) {
            return;
        }
        C01GW<Map<String, Integer>> c01gw = C1357700lR2.LJFF;
        Context contextLJ = C1356320lOo.LJ(i, context);
        if (!C20673215v0.LIZ(i, contextLJ)) {
            C20673215v0.LJI(i, contextLJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r8, X.InterfaceC1350330lF9 r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C1350410lFH
            if (r0 == 0) goto L2a
            r6 = r10
            X.0lFH r6 = (X.C1350410lFH) r6
            int r2 = r6.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2a
            int r2 = r2 - r1
            r6.LLILZLL = r2
        L12:
            java.lang.Object r5 = r6.LLILZ
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r6.LLILZLL
            r4 = 0
            r0 = 1
            if (r1 == 0) goto L38
            if (r1 != r0) goto L30
            X.1DEV r3 = r6.LLILLL
            X.0lF9 r9 = r6.LLILLJJLI
            java.lang.Object r8 = r6.LL
            X.C155000ia.LIZIZ(r5)
            goto L4c
        L2a:
            X.0lFH r6 = new X.0lFH
            r6.<init>(r7, r10)
            goto L12
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L38:
            X.C155000ia.LIZIZ(r5)
            X.1DEV r3 = X.C1350390lFF.LJII
            r6.LL = r8
            r6.LLILLJJLI = r9
            r6.LLILLL = r3
            r6.LLILZLL = r0
            java.lang.Object r0 = r3.LIZLLL(r4, r6)
            if (r0 != r2) goto L4c
            return r2
        L4c:
            java.util.LinkedHashMap<java.lang.String, X.0lF9> r2 = X.C1350390lFF.LJI     // Catch: java.lang.Throwable -> L72
            int r1 = r2.size()     // Catch: java.lang.Throwable -> L72
            r0 = 9
            if (r1 <= r0) goto L69
            java.util.Set r0 = r2.keySet()     // Catch: java.lang.Throwable -> L72
            java.lang.Object r0 = X.C13LP.LJJJLIIL(r0)     // Catch: java.lang.Throwable -> L72
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L4c
            java.lang.Object r0 = r2.remove(r0)     // Catch: java.lang.Throwable -> L72
            X.0lF9 r0 = (X.InterfaceC1350330lF9) r0     // Catch: java.lang.Throwable -> L72
            goto L4c
        L69:
            r2.put(r8, r9)     // Catch: java.lang.Throwable -> L72
            r3.LIZIZ(r4)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L72:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L72
            r3.LIZIZ(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1350390lFF.LIZ(java.lang.String, X.0lF9, X.05Vn):java.lang.Object");
    }
}
