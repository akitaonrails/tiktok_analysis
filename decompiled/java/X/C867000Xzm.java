package X;

/* JADX INFO: renamed from: X.0Xzm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C867000Xzm {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZ(X.InterfaceC1364105Vn r5, kotlin.jvm.functions.Function1 r6) {
        /*
            boolean r0 = r5 instanceof X.C865140Xwm
            if (r0 == 0) goto L20
            r4 = r5
            X.0Xwm r4 = (X.C865140Xwm) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r2 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L5b
        L20:
            X.0Xwm r4 = new X.0Xwm
            r4.<init>(r5)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r2)
            r4.LL = r6     // Catch: X.C872730YLn -> L63
            r4.LLILLL = r1     // Catch: X.C872730YLn -> L63
            X.1DEt r2 = new X.1DEt     // Catch: X.C872730YLn -> L63
            X.05Vn r0 = X.C099M.LIZLLL(r4)     // Catch: X.C872730YLn -> L63
            r2.<init>(r1, r0)     // Catch: X.C872730YLn -> L63
            r2.LJIJJ()     // Catch: X.C872730YLn -> L63
            X.0Ztd r1 = new X.0Ztd     // Catch: X.C872730YLn -> L63
            r0 = 19
            r1.<init>(r2, r0)     // Catch: X.C872730YLn -> L63
            r6.invoke(r1)     // Catch: X.C872730YLn -> L63
            java.lang.Object r2 = r2.LJIJ()     // Catch: X.C872730YLn -> L63
            java.lang.Object r0 = X.C099R.LJFF()     // Catch: X.C872730YLn -> L63
            if (r2 != r0) goto L58
            X.C099Q.LIZJ(r4)     // Catch: X.C872730YLn -> L63
        L58:
            if (r2 != r3) goto L5e
            return r3
        L5b:
            X.C155000ia.LIZIZ(r2)     // Catch: X.C872730YLn -> L63
        L5e:
            X.0Y6Q r0 = X.C865670Xxd.LIZJ(r2)     // Catch: X.C872730YLn -> L63
            return r0
        L63:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.0YMW r1 = r0.getError()
            if (r1 == 0) goto L7b
            X.0YPP r0 = X.C0YPQ.Companion
            r0.getClass()
            X.0YPR r3 = X.C0YPP.LIZIZ(r1)
        L76:
            X.0Y6Q r0 = X.C865670Xxd.LIZIZ(r3)
            return r0
        L7b:
            X.0YPY r3 = new X.0YPY
            java.lang.String r2 = "Unknown error"
            r1 = 0
            r0 = -1
            r3.<init>(r0, r2, r1, r1)
            goto L76
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C867000Xzm.LIZ(X.05Vn, kotlin.jvm.functions.Function1):java.lang.Object");
    }

    public static final <T> void LIZIZ(C0Y6Q<T> c0y6q, InterfaceC863600XuI<T> interfaceC863600XuI) {
        C0YMW iMError;
        if (interfaceC863600XuI == null) {
            return;
        }
        if (c0y6q.LIZIZ()) {
            interfaceC863600XuI.onSuccess(c0y6q.LIZ);
            return;
        }
        C0YPQ c0ypq = c0y6q.LIZIZ;
        if (c0ypq != null) {
            iMError = c0ypq.toIMError();
        } else {
            iMError = null;
        }
        interfaceC863600XuI.LIZIZ(iMError);
    }

    public static final <T> void LIZJ(C0Y6Q<T> c0y6q, InterfaceC867020Xzo<T> interfaceC867020Xzo) {
        C0YMW iMError;
        if (interfaceC867020Xzo == null) {
            return;
        }
        if (c0y6q.LIZIZ()) {
            interfaceC867020Xzo.LIZ(new C868810Y6l<>(c0y6q.LIZ, null, null));
            return;
        }
        C0YPQ c0ypq = c0y6q.LIZIZ;
        if (c0ypq == null || (iMError = c0ypq.toIMError()) == null) {
            iMError = C0YMW.newBuilder().LIZ;
            iMError.code = -1;
        }
        interfaceC867020Xzo.LIZIZ(new C0Y00(iMError, null));
    }
}
