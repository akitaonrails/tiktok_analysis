package X;

/* JADX INFO: renamed from: X.15gb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20583915gb {
    public static final C20583915gb LIZ = new C20583915gb();

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.story.note.avatar.AvatarThoughtSocialAvatarResponse> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C20584415gg
            if (r0 == 0) goto L20
            r4 = r6
            X.15gg r4 = (X.C20584415gg) r4
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
            X.15gg r4 = new X.15gg
            r4.<init>(r5, r6)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            X.0DUg r0 = X.InterfaceC20584015gc.LIZ     // Catch: java.lang.Exception -> L4b
            r0.getClass()     // Catch: java.lang.Exception -> L4b
            X.15gc r0 = X.C339920DUg.LIZ()     // Catch: java.lang.Exception -> L4b
            if (r0 == 0) goto L4f
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L4b
            java.lang.Object r3 = r0.LIZ(r4)     // Catch: java.lang.Exception -> L4b
            if (r3 != r2) goto L48
            return r2
        L45:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L4b
        L48:
            com.ss.android.ugc.aweme.story.note.avatar.AvatarThoughtSocialAvatarResponse r3 = (com.ss.android.ugc.aweme.story.note.avatar.AvatarThoughtSocialAvatarResponse) r3     // Catch: java.lang.Exception -> L4b
            return r3
        L4b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20583915gb.LIZLLL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List<java.lang.String> r8, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.story.note.avatar.AvatarThoughtCancelResponse> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C20584115gd
            if (r0 == 0) goto L20
            r5 = r9
            X.15gd r5 = (X.C20584115gd) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r4 = 1
            if (r0 == 0) goto L2e
            if (r0 != r4) goto L26
            goto L6e
        L20:
            X.15gd r5 = new X.15gd
            r5.<init>(r7, r9)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r8, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r8.iterator()
        L40:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            com.ss.android.ugc.aweme.story.note.avatar.AvatarThoughtTask r0 = new com.ss.android.ugc.aweme.story.note.avatar.AvatarThoughtTask
            r0.<init>(r1)
            r3.add(r0)
            goto L40
        L55:
            com.ss.android.ugc.aweme.story.note.avatar.AvatarThoughtCancelRequest r1 = new com.ss.android.ugc.aweme.story.note.avatar.AvatarThoughtCancelRequest
            r1.<init>(r3)
            X.0DUg r0 = X.InterfaceC20584015gc.LIZ     // Catch: java.lang.Exception -> L74
            r0.getClass()     // Catch: java.lang.Exception -> L74
            X.15gc r0 = X.C339920DUg.LIZ()     // Catch: java.lang.Exception -> L74
            if (r0 == 0) goto L78
            r5.LLILLL = r4     // Catch: java.lang.Exception -> L74
            java.lang.Object r1 = r0.LIZIZ(r1, r5)     // Catch: java.lang.Exception -> L74
            if (r1 != r6) goto L71
            return r6
        L6e:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L74
        L71:
            com.ss.android.ugc.aweme.story.note.avatar.AvatarThoughtCancelResponse r1 = (com.ss.android.ugc.aweme.story.note.avatar.AvatarThoughtCancelResponse) r1     // Catch: java.lang.Exception -> L74
            return r1
        L74:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L78:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20583915gb.LIZ(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.story.note.avatar.AvatarThoughtGenerateResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C20584215ge
            if (r0 == 0) goto L20
            r4 = r7
            X.15ge r4 = (X.C20584215ge) r4
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
            X.15ge r4 = new X.15ge
            r4.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            X.0DUg r0 = X.InterfaceC20584015gc.LIZ     // Catch: java.lang.Exception -> L4b
            r0.getClass()     // Catch: java.lang.Exception -> L4b
            X.15gc r0 = X.C339920DUg.LIZ()     // Catch: java.lang.Exception -> L4b
            if (r0 == 0) goto L4f
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L4b
            java.lang.Object r3 = r0.LJ(r6, r4)     // Catch: java.lang.Exception -> L4b
            if (r3 != r2) goto L48
            return r2
        L45:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L4b
        L48:
            com.ss.android.ugc.aweme.story.note.avatar.AvatarThoughtGenerateResponse r3 = (com.ss.android.ugc.aweme.story.note.avatar.AvatarThoughtGenerateResponse) r3     // Catch: java.lang.Exception -> L4b
            return r3
        L4b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20583915gb.LIZIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.util.List<java.lang.String> r8, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.story.note.avatar.AvatarThoughtResultsResponse> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C20584315gf
            if (r0 == 0) goto L20
            r5 = r9
            X.15gf r5 = (X.C20584315gf) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r4 = 1
            if (r0 == 0) goto L2e
            if (r0 != r4) goto L26
            goto L6e
        L20:
            X.15gf r5 = new X.15gf
            r5.<init>(r7, r9)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r8, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r8.iterator()
        L40:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            com.ss.android.ugc.aweme.story.note.avatar.AvatarThoughtTask r0 = new com.ss.android.ugc.aweme.story.note.avatar.AvatarThoughtTask
            r0.<init>(r1)
            r3.add(r0)
            goto L40
        L55:
            com.ss.android.ugc.aweme.story.note.avatar.AvatarThoughtResultsRequest r1 = new com.ss.android.ugc.aweme.story.note.avatar.AvatarThoughtResultsRequest
            r1.<init>(r3)
            X.0DUg r0 = X.InterfaceC20584015gc.LIZ     // Catch: java.lang.Exception -> L74
            r0.getClass()     // Catch: java.lang.Exception -> L74
            X.15gc r0 = X.C339920DUg.LIZ()     // Catch: java.lang.Exception -> L74
            if (r0 == 0) goto L78
            r5.LLILLL = r4     // Catch: java.lang.Exception -> L74
            java.lang.Object r1 = r0.LIZLLL(r1, r5)     // Catch: java.lang.Exception -> L74
            if (r1 != r6) goto L71
            return r6
        L6e:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L74
        L71:
            com.ss.android.ugc.aweme.story.note.avatar.AvatarThoughtResultsResponse r1 = (com.ss.android.ugc.aweme.story.note.avatar.AvatarThoughtResultsResponse) r1     // Catch: java.lang.Exception -> L74
            return r1
        L74:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L78:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20583915gb.LIZJ(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.lang.String r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.base.api.BaseResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C20584515gh
            if (r0 == 0) goto L20
            r4 = r7
            X.15gh r4 = (X.C20584515gh) r4
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
            X.15gh r4 = new X.15gh
            r4.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            X.0DUg r0 = X.InterfaceC20584015gc.LIZ     // Catch: java.lang.Exception -> L4b
            r0.getClass()     // Catch: java.lang.Exception -> L4b
            X.15gc r0 = X.C339920DUg.LIZ()     // Catch: java.lang.Exception -> L4b
            if (r0 == 0) goto L4f
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L4b
            java.lang.Object r3 = r0.LIZJ(r6, r4)     // Catch: java.lang.Exception -> L4b
            if (r3 != r2) goto L48
            return r2
        L45:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L4b
        L48:
            com.ss.android.ugc.aweme.base.api.BaseResponse r3 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r3     // Catch: java.lang.Exception -> L4b
            return r3
        L4b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20583915gb.LJ(java.lang.String, X.05Vn):java.lang.Object");
    }
}
