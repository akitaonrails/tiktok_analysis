package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0k7X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1307170k7X {
    public static final void LIZ(InterfaceC1307160k7W interfaceC1307160k7W, String str) {
        if (str != null) {
            Object objLJJLIIIIJ = interfaceC1307160k7W.LJJLIIIIJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("strategy_");
            sbLIZ.append(str);
            if (!Intrinsics.LJFF(objLJJLIIIIJ, C2188811AlT.LIZIZ(sbLIZ))) {
                return;
            }
        }
        interfaceC1307160k7W.LJJJLIIL("trace_type");
        interfaceC1307160k7W.LJJJLIIL("strategy_version");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.0k7a, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r11v1, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZIZ(com.bytedance.android.starship.engine.graph.foundation.Task r9, java.lang.String r10, X.C1307200k7a r11, X.InterfaceC1364105Vn r12) throws java.lang.Throwable {
        /*
            boolean r0 = r12 instanceof X.C1307180k7Y
            if (r0 == 0) goto L86
            r5 = r12
            X.0k7Y r5 = (X.C1307180k7Y) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L86
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L12:
            java.lang.Object r1 = r5.LLILZ
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZIL
            r6 = 2
            r7 = 1
            if (r0 == 0) goto L32
            if (r0 == r7) goto L28
            if (r0 != r6) goto L8c
            X.C155000ia.LIZIZ(r1)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.0k7W r3 = r5.LLILLL
            kotlin.jvm.functions.Function1 r11 = r5.LLILLJJLI
            com.bytedance.android.starship.engine.graph.foundation.Task r9 = r5.LL
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L94
            goto L68
        L32:
            X.C155000ia.LIZIZ(r1)
            X.0k7W r3 = r9.LLIZLLLIL
            if (r3 == 0) goto L76
            X.0k7W r8 = r3.LLIIIZ(r10)     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = "task_id"
            long r0 = r9.LLILLJJLI     // Catch: java.lang.Throwable -> L97
            java.lang.Long r0 = X.C2286608xc.LJFF(r0)     // Catch: java.lang.Throwable -> L97
            r8.LJJLIIIJLLLLLLLZ(r0, r2)     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = "node_id"
            X.0k7b r0 = r9.LL     // Catch: java.lang.Throwable -> L97
            long r0 = r0.getId()     // Catch: java.lang.Throwable -> L97
            java.lang.Long r0 = X.C2286608xc.LJFF(r0)     // Catch: java.lang.Throwable -> L97
            r8.LJJLIIIJLLLLLLLZ(r0, r2)     // Catch: java.lang.Throwable -> L97
            r9.LLIZLLLIL = r8     // Catch: java.lang.Throwable -> L97
            r5.LL = r9     // Catch: java.lang.Throwable -> L97
            r5.LLILLJJLI = r11     // Catch: java.lang.Throwable -> L97
            r5.LLILLL = r3     // Catch: java.lang.Throwable -> L97
            r5.LLILZIL = r7     // Catch: java.lang.Throwable -> L97
            java.lang.Object r1 = r11.invoke(r5)     // Catch: java.lang.Throwable -> L97
            if (r1 != r4) goto L68
            goto L96
        L68:
            X.0k7W r0 = r9.LLIZLLLIL
            if (r0 == 0) goto L6f
            r0.close()
        L6f:
            r9.LLIZLLLIL = r3
            if (r1 == 0) goto L76
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L76:
            r0 = 0
            r5.LL = r0
            r5.LLILLJJLI = r0
            r5.LLILLL = r0
            r5.LLILZIL = r6
            java.lang.Object r0 = r11.invoke(r5)
            if (r0 != r4) goto L25
            return r4
        L86:
            X.0k7Y r5 = new X.0k7Y
            r5.<init>(r12)
            goto L12
        L8c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L94:
            r1 = move-exception
            goto L98
        L96:
            return r4
        L97:
            r1 = move-exception
        L98:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L97
            X.0k7W r0 = r9.LLIZLLLIL
            if (r0 == 0) goto La2
            r0.close()
        La2:
            r9.LLIZLLLIL = r3
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1307170k7X.LIZIZ(com.bytedance.android.starship.engine.graph.foundation.Task, java.lang.String, X.0k7a, X.05Vn):java.lang.Object");
    }
}
