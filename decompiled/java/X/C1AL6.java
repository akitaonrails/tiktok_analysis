package X;

import com.bytedance.android.livesdk.comp.impl.event.api.LiveEventApi;

/* JADX INFO: renamed from: X.1AL6, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AL6 {
    public static final /* synthetic */ C1AL6 LIZ = new C1AL6();
    public static final C01GW<LiveEventApi> LIZIZ = C452501pT.LIZIZ(new C1ALC());

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r6, X.InterfaceC1364105Vn<? super com.bytedance.android.livesdk.comp.api.event.api.data.EventDetailData> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1AL8
            if (r0 == 0) goto L20
            r4 = r7
            X.1AL8 r4 = (X.C1AL8) r4
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
            goto L44
        L20:
            X.1AL8 r4 = new X.1AL8
            r4.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            X.01GW<com.bytedance.android.livesdk.comp.impl.event.api.LiveEventApi> r0 = X.C1AL6.LIZIZ     // Catch: java.lang.Exception -> L4a
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L4a
            com.bytedance.android.livesdk.comp.impl.event.api.LiveEventApi r0 = (com.bytedance.android.livesdk.comp.impl.event.api.LiveEventApi) r0     // Catch: java.lang.Exception -> L4a
            if (r0 == 0) goto L4e
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L4a
            java.lang.Object r3 = r0.getEventDetail(r6, r4)     // Catch: java.lang.Exception -> L4a
            if (r3 != r2) goto L47
            return r2
        L44:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L4a
        L47:
            com.bytedance.android.livesdk.comp.api.event.api.data.EventDetailData r3 = (com.bytedance.android.livesdk.comp.api.event.api.data.EventDetailData) r3     // Catch: java.lang.Exception -> L4a
            return r3
        L4a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4e:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AL6.LIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r6, X.InterfaceC1364105Vn<? super com.bytedance.android.livesdk.comp.impl.event.api.model.LiveEventSubscribeResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1AL9
            if (r0 == 0) goto L20
            r4 = r7
            X.1AL9 r4 = (X.C1AL9) r4
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
            goto L44
        L20:
            X.1AL9 r4 = new X.1AL9
            r4.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            X.01GW<com.bytedance.android.livesdk.comp.impl.event.api.LiveEventApi> r0 = X.C1AL6.LIZIZ     // Catch: java.lang.Exception -> L4a
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L4a
            com.bytedance.android.livesdk.comp.impl.event.api.LiveEventApi r0 = (com.bytedance.android.livesdk.comp.impl.event.api.LiveEventApi) r0     // Catch: java.lang.Exception -> L4a
            if (r0 == 0) goto L4e
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L4a
            java.lang.Object r3 = r0.registerEvent(r6, r4)     // Catch: java.lang.Exception -> L4a
            if (r3 != r2) goto L47
            return r2
        L44:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L4a
        L47:
            com.bytedance.android.livesdk.comp.impl.event.api.model.LiveEventSubscribeResponse r3 = (com.bytedance.android.livesdk.comp.impl.event.api.model.LiveEventSubscribeResponse) r3     // Catch: java.lang.Exception -> L4a
            return r3
        L4a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4e:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AL6.LIZJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.lang.String r6, X.InterfaceC1364105Vn<? super com.bytedance.android.livesdk.comp.impl.event.api.model.LiveEventSubscribeResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1ALB
            if (r0 == 0) goto L20
            r4 = r7
            X.1ALB r4 = (X.C1ALB) r4
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
            goto L44
        L20:
            X.1ALB r4 = new X.1ALB
            r4.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            X.01GW<com.bytedance.android.livesdk.comp.impl.event.api.LiveEventApi> r0 = X.C1AL6.LIZIZ     // Catch: java.lang.Exception -> L4a
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L4a
            com.bytedance.android.livesdk.comp.impl.event.api.LiveEventApi r0 = (com.bytedance.android.livesdk.comp.impl.event.api.LiveEventApi) r0     // Catch: java.lang.Exception -> L4a
            if (r0 == 0) goto L4e
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L4a
            java.lang.Object r3 = r0.unRegisterEvent(r6, r4)     // Catch: java.lang.Exception -> L4a
            if (r3 != r2) goto L47
            return r2
        L44:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L4a
        L47:
            com.bytedance.android.livesdk.comp.impl.event.api.model.LiveEventSubscribeResponse r3 = (com.bytedance.android.livesdk.comp.impl.event.api.model.LiveEventSubscribeResponse) r3     // Catch: java.lang.Exception -> L4a
            return r3
        L4a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4e:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AL6.LJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r6, java.lang.String r7, boolean r8, X.InterfaceC1364105Vn<? super com.bytedance.android.livesdk.comp.impl.event.api.model.LiveEventReportPreviewResponse> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.C1ALA
            if (r0 == 0) goto L20
            r4 = r9
            X.1ALA r4 = (X.C1ALA) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            goto L49
        L20:
            X.1ALA r4 = new X.1ALA
            r4.<init>(r5, r9)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            X.01GW<com.bytedance.android.livesdk.comp.impl.event.api.LiveEventApi> r0 = X.C1AL6.LIZIZ     // Catch: java.lang.Exception -> L4f
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Exception -> L4f
            com.bytedance.android.livesdk.comp.impl.event.api.LiveEventApi r1 = (com.bytedance.android.livesdk.comp.impl.event.api.LiveEventApi) r1     // Catch: java.lang.Exception -> L4f
            if (r1 == 0) goto L53
            if (r8 == 0) goto L3f
            r0 = 1
            goto L40
        L3f:
            r0 = 0
        L40:
            r4.LLILLL = r2     // Catch: java.lang.Exception -> L4f
            java.lang.Object r1 = r1.reportPreviewInfo(r6, r7, r0, r4)     // Catch: java.lang.Exception -> L4f
            if (r1 != r3) goto L4c
            return r3
        L49:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L4f
        L4c:
            com.bytedance.android.livesdk.comp.impl.event.api.model.LiveEventReportPreviewResponse r1 = (com.bytedance.android.livesdk.comp.impl.event.api.model.LiveEventReportPreviewResponse) r1     // Catch: java.lang.Exception -> L4f
            return r1
        L4f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L53:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AL6.LIZLLL(java.lang.String, java.lang.String, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r16, int r17, java.lang.String r18, long r19, java.lang.Integer r21, int r22, X.InterfaceC1364105Vn r23) {
        /*
            r15 = this;
            r7 = 0
            r8 = 0
            r3 = r23
            boolean r0 = r3 instanceof X.C1AL7
            if (r0 == 0) goto L25
            r14 = r3
            X.1AL7 r14 = (X.C1AL7) r14
            int r2 = r14.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r14.LLILLL = r2
        L17:
            java.lang.Object r3 = r14.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r14.LLILLL
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2b
            goto L55
        L25:
            X.1AL7 r14 = new X.1AL7
            r14.<init>(r15, r3)
            goto L17
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            X.C155000ia.LIZIZ(r3)
            X.01GW<com.bytedance.android.livesdk.comp.impl.event.api.LiveEventApi> r0 = X.C1AL6.LIZIZ     // Catch: java.lang.Exception -> L5b
            java.lang.Object r3 = r0.getValue()     // Catch: java.lang.Exception -> L5b
            com.bytedance.android.livesdk.comp.impl.event.api.LiveEventApi r3 = (com.bytedance.android.livesdk.comp.impl.event.api.LiveEventApi) r3     // Catch: java.lang.Exception -> L5b
            if (r3 == 0) goto L5f
            r14.LLILLL = r1     // Catch: java.lang.Exception -> L5b
            r13 = r22
            r10 = r19
            r6 = r18
            r5 = r17
            r12 = r21
            r4 = r16
            java.lang.Object r3 = r3.getLiveEventList(r4, r5, r6, r7, r8, r10, r12, r13, r14)     // Catch: java.lang.Exception -> L5b
            if (r3 != r2) goto L58
            return r2
        L55:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L5b
        L58:
            com.bytedance.android.livesdk.comp.api.event.api.data.LiveEventResponse r3 = (com.bytedance.android.livesdk.comp.api.event.api.data.LiveEventResponse) r3     // Catch: java.lang.Exception -> L5b
            return r3
        L5b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L5f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AL6.LIZIZ(java.lang.String, int, java.lang.String, long, java.lang.Integer, int, X.05Vn):java.lang.Object");
    }
}
