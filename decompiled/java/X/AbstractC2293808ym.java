package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.08ym, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2293808ym<R> {
    public static final ConcurrentHashMap<String, String> LIZJ = new ConcurrentHashMap<>();
    public volatile boolean LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1200));

    public final boolean LJFF() {
        return LIZJ.get(((C2292908yd) this).LIZLLL) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C2293608yk
            if (r0 == 0) goto L45
            r4 = r6
            X.08yk r4 = (X.C2293608yk) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r2 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 != r1) goto L4b
            X.C155000ia.LIZIZ(r2)
        L22:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L2f
            boolean r0 = r2.booleanValue()
        L2a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2f:
            r0 = 0
            goto L2a
        L31:
            X.C155000ia.LIZIZ(r2)
            X.08yf r2 = new X.08yf
            r0 = 0
            r2.<init>(r5, r0)
            r4.LLILLL = r1
            r0 = 30000(0x7530, double:1.4822E-319)
            java.lang.Object r2 = X.C099A.LIZJ(r0, r2, r4)
            if (r2 != r3) goto L22
            return r3
        L45:
            X.08yk r4 = new X.08yk
            r4.<init>(r5, r6)
            goto L12
        L4b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2293808ym.LIZ(X.05Vn):java.lang.Object");
    }

    public final Object LIZIZ(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        if (LJFF() && this.LIZ) {
            return true;
        }
        return LJ(interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn<? super java.lang.String> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C2293708yl
            if (r0 == 0) goto L21
            r6 = r8
            X.08yl r6 = (X.C2293708yl) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r5 = r6.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L2f
            if (r0 != r2) goto L27
            goto L50
        L21:
            X.08yl r6 = new X.08yl
            r6.<init>(r7, r8)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r5)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r1 = X.AbstractC2293808ym.LIZJ
            r0 = r7
            X.08yd r0 = (X.C2292908yd) r0
            java.lang.String r0 = r0.LIZLLL
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L40
            return r0
        L40:
            X.1DFB r1 = X.C0PEM.LIZJ     // Catch: java.lang.Throwable -> L65
            X.08yb r0 = new X.08yb     // Catch: java.lang.Throwable -> L65
            r0.<init>(r7, r3)     // Catch: java.lang.Throwable -> L65
            r6.LLILLL = r2     // Catch: java.lang.Throwable -> L65
            java.lang.Object r5 = X.C23250099c.LJI(r6, r1, r0)     // Catch: java.lang.Throwable -> L65
            if (r5 != r4) goto L53
            return r4
        L50:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Throwable -> L65
        L53:
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L61
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r1 = X.AbstractC2293808ym.LIZJ     // Catch: java.lang.Throwable -> L65
            r0 = r7
            X.08yd r0 = (X.C2292908yd) r0     // Catch: java.lang.Throwable -> L65
            java.lang.String r0 = r0.LIZLLL     // Catch: java.lang.Throwable -> L65
            r1.put(r0, r5)     // Catch: java.lang.Throwable -> L65
        L61:
            X.C189200o6.m2constructorimpl(r5)     // Catch: java.lang.Throwable -> L65
            goto L71
        L65:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r5 = new X.00Yq
            r5.<init>(r0)
            X.C189200o6.m2constructorimpl(r5)
        L71:
            boolean r0 = X.C189200o6.m7isFailureimpl(r5)
            if (r0 != 0) goto L78
            return r5
        L78:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2293808ym.LIZLLL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.InterfaceC1364105Vn<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C2294008yo
            if (r0 == 0) goto L45
            r4 = r6
            X.08yo r4 = (X.C2294008yo) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r2 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 != r1) goto L4b
            X.C155000ia.LIZIZ(r2)
        L22:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L2f
            boolean r0 = r2.booleanValue()
        L2a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2f:
            r0 = 0
            goto L2a
        L31:
            X.C155000ia.LIZIZ(r2)
            X.08yh r2 = new X.08yh
            r0 = 0
            r2.<init>(r5, r0)
            r4.LLILLL = r1
            r0 = 30000(0x7530, double:1.4822E-319)
            java.lang.Object r2 = X.C099A.LIZJ(r0, r2, r4)
            if (r2 != r3) goto L22
            return r3
        L45:
            X.08yo r4 = new X.08yo
            r4.<init>(r5, r6)
            goto L12
        L4b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2293808ym.LJ(X.05Vn):java.lang.Object");
    }

    public static void LJI(Object obj, InterfaceC20236714Gf interfaceC20236714Gf) {
        Object c098200Yq;
        try {
            C189200o6.m2constructorimpl(obj);
            interfaceC20236714Gf.resumeWith(obj);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resume error ");
            sbLIZ.append(thM5exceptionOrNullimpl);
            C201955140j.LJII(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ));
            C805380Via.LIZJ(new Exception("downloadEffect already resumed"), "downloadEffect already resumed");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(android.graphics.Bitmap r8, X.InterfaceC1364105Vn<? super R> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C2293908yn
            if (r0 == 0) goto L21
            r6 = r9
            X.08yn r6 = (X.C2293908yn) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r4 = r6.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r3 = 1
            r5 = 0
            if (r0 == 0) goto L2f
            if (r0 != r3) goto L27
            goto L8c
        L21:
            X.08yn r6 = new X.08yn
            r6.<init>(r7, r9)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r4)
            boolean r0 = r7.LIZ
            if (r0 != 0) goto L37
            return r5
        L37:
            java.lang.System.currentTimeMillis()
            X.01GW r0 = r7.LIZIZ     // Catch: java.lang.Throwable -> L93
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> L93
            com.bytedance.byted_bach_sdk.BachAlgorithmSystem r1 = (com.bytedance.byted_bach_sdk.BachAlgorithmSystem) r1     // Catch: java.lang.Throwable -> L93
            com.bytedance.byted_bach_sdk.input.BachBitmapInput r0 = new com.bytedance.byted_bach_sdk.input.BachBitmapInput     // Catch: java.lang.Throwable -> L93
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L93
            com.bytedance.byted_bach_sdk.BachAlgorithmSystem$BachErrorCode r1 = r1.execute(r0)     // Catch: java.lang.Throwable -> L93
            com.bytedance.byted_bach_sdk.BachAlgorithmSystem$BachErrorCode r0 = com.bytedance.byted_bach_sdk.BachAlgorithmSystem.BachErrorCode.NO_ERROR     // Catch: java.lang.Throwable -> L93
            if (r1 != r0) goto L8a
            r6.LLILLL = r3     // Catch: java.lang.Throwable -> L93
            r0 = r7
            X.08yd r0 = (X.C2292908yd) r0     // Catch: java.lang.Throwable -> L93
            X.01GW r0 = r0.LIZIZ     // Catch: java.lang.Throwable -> L93
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> L93
            com.bytedance.byted_bach_sdk.BachAlgorithmSystem r1 = (com.bytedance.byted_bach_sdk.BachAlgorithmSystem) r1     // Catch: java.lang.Throwable -> L93
            java.lang.String r0 = "after_effect_0"
            com.bytedance.byted_bach_sdk.buffer.BachAlgorithmOutput r0 = r1.getResult(r0)     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L86
            java.util.HashMap<java.lang.String, com.bytedance.byted_bach_sdk.buffer.BachObject>[] r1 = r0.m_dataMap     // Catch: java.lang.Throwable -> L93
            if (r1 == 0) goto L86
            r0 = 0
            java.lang.Object r1 = X.C13LQ.LJJIIZ(r0, r1)     // Catch: java.lang.Throwable -> L93
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L93
            if (r1 == 0) goto L86
            java.lang.String r0 = "score"
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L93
            com.bytedance.byted_bach_sdk.buffer.BachObject r0 = (com.bytedance.byted_bach_sdk.buffer.BachObject) r0     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L86
            com.bytedance.byted_bach_sdk.buffer.AlgorithmResultUnion r0 = r0.valueResult     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L86
            double r0 = r0.doubleVal     // Catch: java.lang.Throwable -> L93
            java.lang.Double r4 = X.C2286608xc.LIZJ(r0)     // Catch: java.lang.Throwable -> L93
            goto L87
        L86:
            r4 = r5
        L87:
            if (r4 != r2) goto L8f
            return r2
        L8a:
            r4 = r5
            goto L8f
        L8c:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Throwable -> L93
        L8f:
            X.C189200o6.m2constructorimpl(r4)     // Catch: java.lang.Throwable -> L93
            goto L9f
        L93:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r4 = new X.00Yq
            r4.<init>(r0)
            X.C189200o6.m2constructorimpl(r4)
        L9f:
            java.lang.Throwable r3 = X.C189200o6.m5exceptionOrNullimpl(r4)
            if (r3 == 0) goto Lba
            X.0WiJ r2 = X.C830690WiJ.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "execute error "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LJII(r2, r0)
        Lba:
            boolean r0 = X.C189200o6.m7isFailureimpl(r4)
            if (r0 != 0) goto Lc1
            return r4
        Lc1:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2293808ym.LIZJ(android.graphics.Bitmap, X.05Vn):java.lang.Object");
    }
}
