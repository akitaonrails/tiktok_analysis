package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0CrF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C326630CrF {
    public static final C326630CrF LIZ = new C326630CrF();
    public static final C054G LIZIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public static volatile C099G LIZJ;

    public final void LIZ() {
        synchronized (this) {
            try {
                C099G c099g = LIZJ;
                if (c099g != null) {
                    c099g.LIZIZ(null);
                }
                LIZJ = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.tako.aivideo.detail.repo.TakoAIVideoResponse> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C326620CrE
            if (r0 == 0) goto L21
            r5 = r7
            X.0CrE r5 = (X.C326620CrE) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 1
            r1 = 0
            if (r0 == 0) goto L2f
            if (r0 != r2) goto L27
            goto L44
        L21:
            X.0CrE r5 = new X.0CrE
            r5.<init>(r6, r7)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r4)
            monitor-enter(r6)
            X.099G r0 = X.C326630CrF.LIZJ     // Catch: java.lang.Throwable -> L64
            X.C326630CrF.LIZJ = r1     // Catch: java.lang.Throwable -> L64
            monitor-exit(r6)
            if (r0 != 0) goto L3b
            return r1
        L3b:
            r5.LLILLL = r2     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r4 = r0.LJLIIIL(r5)     // Catch: java.lang.Throwable -> L4d
            if (r4 != r3) goto L47
            return r3
        L44:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Throwable -> L4d
        L47:
            com.ss.android.ugc.aweme.tako.aivideo.detail.repo.TakoAIVideoResponse r4 = (com.ss.android.ugc.aweme.tako.aivideo.detail.repo.TakoAIVideoResponse) r4     // Catch: java.lang.Throwable -> L4d
            X.C189200o6.m2constructorimpl(r4)     // Catch: java.lang.Throwable -> L4d
            goto L59
        L4d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r4 = new X.00Yq
            r4.<init>(r0)
            X.C189200o6.m2constructorimpl(r4)
        L59:
            X.C189200o6.m5exceptionOrNullimpl(r4)
            boolean r0 = X.C189200o6.m7isFailureimpl(r4)
            if (r0 != 0) goto L63
            return r4
        L63:
            return r1
        L64:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L64
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C326630CrF.LIZIZ(X.05Vn):java.lang.Object");
    }

    public final void LIZJ(Context context) {
        if (context == null) {
            return;
        }
        C1863130yaF.LIZ.getClass();
        if (!C1863130yaF.LIZ() || !C14TF.LIZIZ.LJJIJ(context)) {
            return;
        }
        synchronized (this) {
            try {
                LIZ.getClass();
                if (LIZJ != null && (!r0.isCancelled())) {
                    return;
                }
                LIZJ = C23250099c.LIZIZ(LIZIZ, null, null, new C326570Cr9(null), 3);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
