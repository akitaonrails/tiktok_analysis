package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0YRG, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YRG {
    public final C868780Y6i LIZ;
    public final Function2<C0YL9, InterfaceC1364105Vn<? super Unit>, Object> LIZIZ;
    public C1DEK LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a A[Catch: all -> 0x00a3, TRY_LEAVE, TryCatch #2 {all -> 0x00a3, blocks: (B:29:0x0072, B:31:0x007a, B:32:0x0080, B:36:0x0090), top: B:58:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.0954] */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.1DEK] */
    /* JADX WARN: Type inference failed for: r2v6, types: [X.0954] */
    /* JADX WARN: Type inference failed for: r2v7, types: [X.0954] */
    /* JADX WARN: Type inference failed for: r2v9, types: [X.0954] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x008c -> B:26:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.C0YRH
            if (r0 == 0) goto L2a
            r7 = r12
            X.0YRH r7 = (X.C0YRH) r7
            int r2 = r7.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2a
            int r2 = r2 - r1
            r7.LLILZIL = r2
        L12:
            java.lang.Object r0 = r7.LLILLL
            java.lang.Object r8 = X.C099R.LJFF()
            int r1 = r7.LLILZIL
            java.lang.String r6 = "MessageGapWorkQueue"
            r5 = 1
            r4 = 2
            r3 = 0
            if (r1 == 0) goto L46
            if (r1 == r5) goto L3e
            if (r1 != r4) goto L36
            X.0WWy r9 = r7.LLILLJJLI
            X.0954 r2 = r7.LL
            goto L30
        L2a:
            X.0YRH r7 = new X.0YRH
            r7.<init>(r11, r12)
            goto L12
        L30:
            X.C155000ia.LIZIZ(r0)     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> La5
            goto L65
        L34:
            r10 = move-exception
            goto L90
        L36:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3e:
            X.0WWy r9 = r7.LLILLJJLI
            X.0954 r2 = r7.LL
            X.C155000ia.LIZIZ(r0)     // Catch: java.lang.Throwable -> La5
            goto L72
        L46:
            X.C155000ia.LIZIZ(r0)
            X.1DEK r0 = r11.LIZJ
            if (r0 == 0) goto L58
            X.0Y6i r2 = r11.LIZ
            java.lang.String r1 = "Work queue is already started"
            r0 = 4
            X.C868780Y6i.LJIILLIIL(r2, r6, r1, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L58:
            r1 = -2
            r0 = 6
            X.1DEK r2 = X.C095G.LIZ(r1, r3, r0)
            r11.LIZJ = r2
            X.1DEL r9 = new X.1DEL     // Catch: java.lang.Throwable -> La5
            r9.<init>(r2)     // Catch: java.lang.Throwable -> La5
        L65:
            r7.LL = r2     // Catch: java.lang.Throwable -> La5
            r7.LLILLJJLI = r9     // Catch: java.lang.Throwable -> La5
            r7.LLILZIL = r5     // Catch: java.lang.Throwable -> La5
            java.lang.Object r0 = r9.LIZ(r7)     // Catch: java.lang.Throwable -> La5
            if (r0 != r8) goto L72
            goto L9b
        L72:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> La3
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> La3
            if (r0 == 0) goto L9d
            java.lang.Object r1 = r9.next()     // Catch: java.lang.Throwable -> La3
            X.0YL9 r1 = (X.C0YL9) r1     // Catch: java.lang.Throwable -> La3
            kotlin.jvm.functions.Function2<X.0YL9, X.05Vn<? super kotlin.Unit>, java.lang.Object> r0 = r11.LIZIZ     // Catch: java.lang.Exception -> L8f java.lang.Throwable -> La3
            r7.LL = r2     // Catch: java.lang.Exception -> L8f java.lang.Throwable -> La3
            r7.LLILLJJLI = r9     // Catch: java.lang.Exception -> L8f java.lang.Throwable -> La3
            r7.LLILZIL = r4     // Catch: java.lang.Exception -> L8f java.lang.Throwable -> La3
            java.lang.Object r0 = r0.invoke(r1, r7)     // Catch: java.lang.Exception -> L8f java.lang.Throwable -> La3
            if (r0 != r8) goto L65
            goto L9c
        L8f:
            r10 = move-exception
        L90:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r10)     // Catch: java.lang.Throwable -> La3
            X.0Y6i r1 = r11.LIZ     // Catch: java.lang.Throwable -> La3
            java.lang.String r0 = "process work item failed"
            r1.LJIIIIZZ(r6, r0, r10)     // Catch: java.lang.Throwable -> La3
            goto L65
        L9b:
            return r8
        L9c:
            return r8
        L9d:
            X.C094C.LIZ(r2, r3)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        La3:
            r1 = move-exception
            goto La6
        La5:
            r1 = move-exception
        La6:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> Lad
            throw r1     // Catch: java.lang.Throwable -> Laa
        Laa:
            r0 = move-exception
            r3 = r1
            goto Lae
        Lad:
            r0 = move-exception
        Lae:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lb2
            goto Lb4
        Lb2:
            r0 = move-exception
            goto Lae
        Lb4:
            X.C094C.LIZ(r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YRG.LIZIZ(X.05Vn):java.lang.Object");
    }

    public C0YRG(C868780Y6i c868780Y6i, C0YNA c0yna) {
        this.LIZ = c868780Y6i;
        this.LIZIZ = c0yna;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C0YL9 r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YRG.LIZ(X.0YL9, X.05Vn):java.lang.Object");
    }
}
