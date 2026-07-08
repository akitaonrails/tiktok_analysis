package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0rhV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1598550rhV implements InterfaceC1598440rhK {
    @Override // X.InterfaceC1598440rhK
    public final Object LIZ(C1598490rhP c1598490rhP, InterfaceC1364105Vn<? super AbstractC316870CbV<String>> interfaceC1364105Vn) {
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
            Exception exc = new Exception("not login");
            c317290CcB.getClass();
            return new C316650Cb9(exc);
        }
        String str = c1598490rhP.LIZLLL;
        if (str != null && str.length() != 0) {
            Function1<String, Boolean> function1 = c1598490rhP.LJII;
            if (function1 != null && function1.invoke(c1598490rhP.LIZLLL).booleanValue()) {
                int i = C2187451AjH.LIZ;
                C1720106oR.LJI("SkylightListWithLoadMoreRepo", "fetchSkylightData, cancel before load more");
                AbstractC316870CbV.LIZ.getClass();
                return new C316880CbW("cancel before load more");
            }
            if (C1209404oG.LIZ()) {
                return LIZLLL(c1598490rhP, interfaceC1364105Vn);
            }
            return LIZJ(c1598490rhP, interfaceC1364105Vn);
        }
        C317290CcB c317290CcB2 = AbstractC316870CbV.LIZ;
        Exception exc2 = new Exception("page token is empty");
        c317290CcB2.getClass();
        return new C316650Cb9(exc2);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x029b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C1598490rhP r41, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r42) {
        /*
            Method dump skipped, instruction units count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1598550rhV.LIZJ(X.0rhP, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
    	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:117)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0166 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C1598490rhP r46, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r47) {
        /*
            Method dump skipped, instruction units count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1598550rhV.LIZLLL(X.0rhP, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
    	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:117)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:40:0x00a9
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod r10, X.C1598490rhP r11, boolean r12, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof X.C1598590rhZ
            if (r0 == 0) goto L2e
            r8 = r13
            X.0rhZ r8 = (X.C1598590rhZ) r8
            int r2 = r8.LLIZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2e
            int r2 = r2 - r1
            r8.LLIZ = r2
        L12:
            java.lang.Object r1 = r8.LLILZIL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r8.LLIZ
            r6 = 1
            r5 = 0
            r4 = 2
            if (r0 == 0) goto L4a
            if (r0 == r6) goto L3c
            if (r0 != r4) goto L34
            boolean r12 = r8.LLILZ
            X.01eN r2 = r8.LLILLL
            java.lang.Object r3 = r8.LLILLJJLI
            java.lang.String r3 = (java.lang.String) r3
            X.0rhP r11 = r8.LL
            goto L77
        L2e:
            X.0rhZ r8 = new X.0rhZ
            r8.<init>(r9, r13)
            goto L12
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3c:
            boolean r12 = r8.LLILZ
            X.01eN r2 = r8.LLILLL
            java.lang.Object r3 = r8.LLILLJJLI
            java.lang.String r3 = (java.lang.String) r3
            X.0rhP r11 = r8.LL
            X.C155000ia.LIZIZ(r1)
            goto L64
        L4a:
            X.C155000ia.LIZIZ(r1)
            java.lang.String r3 = r10.pageToken()
            X.01eN r2 = r11.LIZJ
            r8.LL = r11
            r8.LLILLJJLI = r3
            r8.LLILLL = r2
            r8.LLILZ = r12
            r8.LLIZ = r6
            java.lang.Object r0 = r2.LIZLLL(r5, r8)
            if (r0 != r7) goto L64
            return r7
        L64:
            X.0rge r0 = r11.LIZIZ     // Catch: java.lang.Throwable -> La9
            r8.LL = r11     // Catch: java.lang.Throwable -> La9
            r8.LLILLJJLI = r3     // Catch: java.lang.Throwable -> La9
            r8.LLILLL = r2     // Catch: java.lang.Throwable -> La9
            r8.LLILZ = r12     // Catch: java.lang.Throwable -> La9
            r8.LLIZ = r4     // Catch: java.lang.Throwable -> La9
            java.lang.Object r1 = r0.LJII(r8)     // Catch: java.lang.Throwable -> La9
            if (r1 != r7) goto L7a
            return r7
        L77:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> La7
        L7a:
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> La7
            r2.LIZIZ(r5)
            kotlin.jvm.functions.Function1<com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod, kotlin.Unit> r0 = r11.LJFF
            if (r0 == 0) goto L86
            r0.invoke(r5)
        L86:
            if (r3 == 0) goto L9e
            int r0 = r3.length()
            if (r0 == 0) goto L9e
            r0 = 0
        L8f:
            if (r0 == 0) goto La0
            if (r12 != 0) goto La0
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb8 r0 = new X.0Cb8
            r0.<init>(r1)
            return r0
        L9e:
            r0 = 1
            goto L8f
        La0:
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            X.0Cm0 r0 = X.C317290CcB.LJ(r0, r5, r3, r1, r6)
            return r0
        La7:
            r0 = move-exception
            goto Laa
        La9:
            r0 = move-exception
        Laa:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> La9
            r2.LIZIZ(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1598550rhV.LIZIZ(com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod, X.0rhP, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.C1598490rhP r28, boolean r29, boolean r30, boolean r31, X.InterfaceC1364105Vn<? super kotlin.Pair<com.ss.android.ugc.aweme.bean.MixRankSkylightResponse, java.lang.Boolean>> r32) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1598550rhV.LJ(X.0rhP, boolean, boolean, boolean, X.05Vn):java.lang.Object");
    }
}
