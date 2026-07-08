package X;

/* JADX INFO: renamed from: X.11cf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19540311cf extends AbstractC19526011aM {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIIJJI;
    public final String LJIIIZ = "AuthKey";
    public final C19523211Zu LJIIJ = new C19523211Zu(this, "GetAuthKey");

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19540311cf.class, "ability", "getAbility()Lcom/ss/android/ugc/gamora/editor/audioservice/pipeline/tools/abilities/IPPGetAuthKeyAbility;", 0);
        C13LE.LIZ.getClass();
        LJIIJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC19524311a5
    public final String LJIILLIIL() {
        return this.LJIIIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    @Override // X.AbstractC19526011aM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIJJ(X.InterfaceC19526611aS r10, X.C11ZU r11) {
        /*
            r9 = this;
            r8 = 0
            if (r11 != 0) goto L4
            return r8
        L4:
            long r6 = android.os.SystemClock.uptimeMillis()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.11ZT<?>> r0 = r11.LIZ
            java.lang.String r5 = "AUTH_KEY"
            java.lang.Object r4 = r0.get(r5)
            X.11ZT r4 = (X.C11ZT) r4
            if (r4 == 0) goto L1e
            java.lang.Integer r2 = r4.LIZIZ
            if (r2 != 0) goto L1f
            T r1 = r4.LIZ
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig
            if (r0 != 0) goto L35
        L1e:
            return r8
        L1f:
            long r0 = r4.LIZJ
            long r6 = r6 - r0
            int r0 = r2.intValue()
            long r2 = (long) r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 >= 0) goto L1e
            T r1 = r4.LIZ
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig
            if (r0 != 0) goto L35
            return r8
        L35:
            if (r1 == 0) goto L1e
            r9.LJJIJIIJI(r10, r5, r1)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19540311cf.LJIJJ(X.11aS, X.11ZU):boolean");
    }

    @Override // X.AbstractC19526011aM
    public final void LJIJJLI(InterfaceC19526611aS interfaceC19526611aS, C11ZU c11zu) {
        Object objLJJIII;
        if (c11zu == null || (objLJJIII = LJJIII(interfaceC19526611aS, "AUTH_KEY")) == null) {
            return;
        }
        c11zu.LIZ(600, "AUTH_KEY", objLJJIII);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084 A[LOOP:1: B:27:0x007e->B:29:0x0084, LOOP_END] */
    @Override // X.AbstractC19526011aM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJI(X.InterfaceC19526511aR r17, java.util.List<? extends X.InterfaceC19526611aS> r18, java.util.List<? extends X.InterfaceC19526611aS> r19, X.InterfaceC1364105Vn<? super java.lang.String> r20) {
        /*
            r16 = this;
            r5 = r20
            r3 = r18
            r4 = r19
            boolean r0 = r5 instanceof X.C19541611cs
            r9 = r16
            if (r0 == 0) goto L69
            r8 = r5
            X.11cs r8 = (X.C19541611cs) r8
            int r2 = r8.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L69
            int r2 = r2 - r1
            r8.LLILZIL = r2
        L1a:
            java.lang.Object r7 = r8.LLILLL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LLILZIL
            r5 = 1
            if (r0 == 0) goto L4a
            if (r0 != r5) goto L72
            java.lang.Object r4 = r8.LLILLJJLI
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r3 = r8.LL
            java.util.List r3 = (java.util.List) r3
            X.C155000ia.LIZIZ(r7)
        L32:
            if (r7 == 0) goto L7a
            java.util.Iterator r2 = r3.iterator()
        L38:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L6f
            java.lang.Object r1 = r2.next()
            X.11aS r1 = (X.InterfaceC19526611aS) r1
            java.lang.String r0 = "AUTH_KEY"
            r9.LJJIJIIJI(r1, r0, r7)
            goto L38
        L4a:
            X.C155000ia.LIZIZ(r7)
            X.11Zu r2 = r9.LJIIJ
            X.1Bqa<java.lang.Object>[] r1 = X.C19540311cf.LJIIJJI
            r0 = 0
            r0 = r1[r0]
            java.lang.Object r0 = r2.getValue(r9, r0)
            X.11dB r0 = (X.InterfaceC19543511dB) r0
            if (r0 == 0) goto L7a
            r8.LL = r3
            r8.LLILLJJLI = r4
            r8.LLILZIL = r5
            java.lang.Object r7 = r0.LJII(r8)
            if (r7 != r6) goto L32
            return r6
        L69:
            X.11cs r8 = new X.11cs
            r8.<init>(r9, r5)
            goto L1a
        L6f:
            java.lang.String r0 = "_CONNECT_ID_DEFAULT"
            return r0
        L72:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L7a:
            java.util.Iterator r1 = r4.iterator()
        L7e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L97
            java.lang.Object r10 = r1.next()
            X.11aS r10 = (X.InterfaceC19526611aS) r10
            r11 = -20
            java.lang.String r12 = "authKey error"
            java.lang.String r13 = r9.LJIIIZ
            r14 = 0
            X.11YJ r15 = X.C11YJ.CLIENT
            r9.LJJIIZI(r10, r11, r12, r13, r14, r15)
            goto L7e
        L97:
            java.lang.String r0 = "_CONNECT_ID_TERMINATION_ERROR"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19540311cf.LJIJI(X.11aR, java.util.List, java.util.List, X.05Vn):java.lang.Object");
    }
}
