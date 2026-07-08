package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.05ha, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1422805ha {
    public static final C1422805ha LIZ = new C1422805ha();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(990));
    public static final C054G LIZJ = C2296808zG.LIZ(C0PEM.LIZJ);
    public static volatile C1422405hW LIZLLL;
    public static volatile boolean LJ;
    public static volatile C099G LJFF;
    public static volatile long LJI;

    static {
        C687360Qxi.LIZ(new InterfaceC687370Qxj() { // from class: X.05hc
            @Override // X.InterfaceC687370Qxj
            public final void onLowMemory() {
                if (C1422805ha.LIZLLL != null) {
                    C1422805ha c1422805ha = C1422805ha.LIZ;
                    C1422805ha.LIZLLL = null;
                    C1422805ha.LJ = false;
                }
            }
        });
    }

    public static C1422405hW LIZIZ(C677540Qhs c677540Qhs) {
        boolean z;
        Object c098200Yq;
        String string = ((Keva) LIZIZ.getValue()).getString("mix_search_chunk_filter_cache", "");
        if (string != null && string.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        Object obj = null;
        if (z) {
            return null;
        }
        try {
            c098200Yq = C677540Qhs.LIZJ(c677540Qhs, string);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (C1422405hW) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C677540Qhs r6, X.InterfaceC1364105Vn<? super X.C1422405hW> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1422905hb
            if (r0 == 0) goto L20
            r4 = r7
            X.05hb r4 = (X.C1422905hb) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L45
        L20:
            X.05hb r4 = new X.05hb
            r4.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            boolean r0 = X.C1422805ha.LJ
            if (r0 == 0) goto L38
            X.05hW r0 = X.C1422805ha.LIZLLL
            return r0
        L38:
            X.099G r0 = X.C1422805ha.LJFF
            if (r0 == 0) goto L4e
            r4.LLILLL = r1     // Catch: java.lang.Throwable -> L53
            java.lang.Object r3 = r0.LJLIIIL(r4)     // Catch: java.lang.Throwable -> L53
            if (r3 != r2) goto L48
            return r2
        L45:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L53
        L48:
            X.05hW r3 = (X.C1422405hW) r3     // Catch: java.lang.Throwable -> L53
            X.C189200o6.m2constructorimpl(r3)     // Catch: java.lang.Throwable -> L53
            goto L5f
        L4e:
            X.05hW r3 = LIZIZ(r6)
            goto L68
        L53:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r3 = new X.00Yq
            r3.<init>(r0)
            X.C189200o6.m2constructorimpl(r3)
        L5f:
            boolean r0 = X.C189200o6.m7isFailureimpl(r3)
            if (r0 == 0) goto L66
            r3 = 0
        L66:
            X.05hW r3 = (X.C1422405hW) r3
        L68:
            X.C1422805ha.LIZLLL = r3
            X.C1422805ha.LJ = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1422805ha.LIZ(X.0Qhs, X.05Vn):java.lang.Object");
    }
}
