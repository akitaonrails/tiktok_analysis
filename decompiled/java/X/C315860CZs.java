package X;

import com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.model.effect.FailedReviewPageInitData;

/* JADX INFO: renamed from: X.0CZs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C315860CZs {
    public final FailedReviewPageInitData LIZ;

    public static InterfaceC318260Cdk LIZLLL() {
        IEffectCreatorService iEffectCreatorService = (IEffectCreatorService) PluggableExtentionKt.pluggableSpi$default(IEffectCreatorService.class, false, false, false, 14, null);
        if (iEffectCreatorService != null) {
            return iEffectCreatorService.draftService();
        }
        return null;
    }

    public C315860CZs(FailedReviewPageInitData failedReviewPageInitData) {
        this.LIZ = failedReviewPageInitData;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectResponse>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C315890CZv
            if (r0 == 0) goto L20
            r6 = r8
            X.0CZv r6 = (X.C315890CZv) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 1
            if (r0 == 0) goto L2e
            if (r0 != r4) goto L26
            goto L63
        L20:
            X.0CZv r6 = new X.0CZv
            r6.<init>(r7, r8)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.model.effect.FailedReviewPageInitData r0 = r7.LIZ
            if (r0 != 0) goto L45
            X.0CZx r1 = new X.0CZx
            java.lang.String r0 = "initData null."
            r1.<init>(r0)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r0
        L45:
            boolean r0 = X.C0C02.LIZ()
            if (r0 == 0) goto L50
            com.ss.android.ugc.aweme.model.effect.FailedReviewPageInitData r0 = r7.LIZ
            int r3 = r0.effectSource
            goto L52
        L50:
            r3 = 102(0x66, float:1.43E-43)
        L52:
            X.1DFB r2 = X.C0PEM.LIZJ     // Catch: java.lang.Throwable -> L73
            X.0CZr r1 = new X.0CZr     // Catch: java.lang.Throwable -> L73
            r0 = 0
            r1.<init>(r7, r3, r0)     // Catch: java.lang.Throwable -> L73
            r6.LLILLL = r4     // Catch: java.lang.Throwable -> L73
            java.lang.Object r1 = X.C23250099c.LJI(r6, r2, r1)     // Catch: java.lang.Throwable -> L73
            if (r1 != r5) goto L66
            return r5
        L63:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L73
        L66:
            com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectResponse r1 = (com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectResponse) r1     // Catch: java.lang.Throwable -> L73
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L73
            X.00o6 r0 = X.C189200o6.m1boximpl(r1)     // Catch: java.lang.Throwable -> L73
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L73
            goto L7f
        L73:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L7f:
            java.lang.Throwable r1 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r1 == 0) goto L91
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            X.00o6 r0 = X.C189200o6.m1boximpl(r0)
        L91:
            X.00o6 r0 = (X.C189200o6) r0
            java.lang.Object r2 = r0.m10unboximpl()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "deleteEffect(), return "
            r1.<init>(r0)
            java.lang.String r0 = X.C189200o6.m9toStringimpl(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "FailedReviewViewModelRepo"
            X.C318790Ceb.LIZ(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C315860CZs.LIZIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super X.C189200o6<X.C315940Ca0>> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C315900CZw
            if (r0 == 0) goto L20
            r7 = r9
            X.0CZw r7 = (X.C315900CZw) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r5 = 1
            if (r0 == 0) goto L2e
            if (r0 != r5) goto L26
            goto L4c
        L20:
            X.0CZw r7 = new X.0CZw
            r7.<init>(r8, r9)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.model.effect.FailedReviewPageInitData r4 = r8.LIZ
            X.0Cdk r3 = LIZLLL()
            if (r4 == 0) goto L82
            if (r3 == 0) goto L82
            X.1DFB r2 = X.C0PEM.LIZJ     // Catch: java.lang.Throwable -> L5d
            X.0CZz r1 = new X.0CZz     // Catch: java.lang.Throwable -> L5d
            r0 = 0
            r1.<init>(r3, r8, r4, r0)     // Catch: java.lang.Throwable -> L5d
            r7.LLILLL = r5     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r1 = X.C23250099c.LJI(r7, r2, r1)     // Catch: java.lang.Throwable -> L5d
            if (r1 != r6) goto L4f
            return r6
        L4c:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L5d
        L4f:
            X.00o6 r1 = (X.C189200o6) r1     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r0 = r1.m10unboximpl()     // Catch: java.lang.Throwable -> L5d
            X.00o6 r0 = X.C189200o6.m1boximpl(r0)     // Catch: java.lang.Throwable -> L5d
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L5d
            goto L69
        L5d:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L69:
            java.lang.Throwable r1 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r1 == 0) goto L7b
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            X.00o6 r0 = X.C189200o6.m1boximpl(r0)
        L7b:
            X.00o6 r0 = (X.C189200o6) r0
            java.lang.Object r0 = r0.m10unboximpl()
            return r0
        L82:
            java.lang.Throwable r1 = new java.lang.Throwable
            java.lang.String r0 = "initData or draftService null."
            r1.<init>(r0)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C315860CZs.LIZJ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C315790CZl r9, X.InterfaceC1364105Vn<? super X.C189200o6<kotlin.Unit>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C315870CZt
            if (r0 == 0) goto L20
            r7 = r10
            X.0CZt r7 = (X.C315870CZt) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r5 = 1
            if (r0 == 0) goto L2e
            if (r0 != r5) goto L26
            goto L77
        L20:
            X.0CZt r7 = new X.0CZt
            r7.<init>(r8, r10)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            X.0Cdk r4 = LIZLLL()
            if (r4 != 0) goto L47
            X.0CZx r1 = new X.0CZx
            java.lang.String r0 = "draftService null."
            r1.<init>(r0)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r0
        L47:
            java.lang.String r3 = r9.LIZ
            if (r3 == 0) goto L64
            int r0 = r3.length()
            if (r0 == 0) goto L64
            r0 = 0
        L52:
            if (r0 == 0) goto L66
            X.0CZx r1 = new X.0CZx
            java.lang.String r0 = "draftId null."
            r1.<init>(r0)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r0
        L64:
            r0 = 1
            goto L52
        L66:
            X.1DFB r2 = X.C0PEM.LIZJ     // Catch: java.lang.Throwable -> L88
            X.0CZp r1 = new X.0CZp     // Catch: java.lang.Throwable -> L88
            r0 = 0
            r1.<init>(r4, r8, r3, r0)     // Catch: java.lang.Throwable -> L88
            r7.LLILLL = r5     // Catch: java.lang.Throwable -> L88
            java.lang.Object r1 = X.C23250099c.LJI(r7, r2, r1)     // Catch: java.lang.Throwable -> L88
            if (r1 != r6) goto L7a
            return r6
        L77:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L88
        L7a:
            X.00o6 r1 = (X.C189200o6) r1     // Catch: java.lang.Throwable -> L88
            java.lang.Object r0 = r1.m10unboximpl()     // Catch: java.lang.Throwable -> L88
            X.00o6 r0 = X.C189200o6.m1boximpl(r0)     // Catch: java.lang.Throwable -> L88
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L88
            goto L94
        L88:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L94:
            java.lang.Throwable r1 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r1 == 0) goto La6
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            X.00o6 r0 = X.C189200o6.m1boximpl(r0)
        La6:
            X.00o6 r0 = (X.C189200o6) r0
            java.lang.Object r2 = r0.m10unboximpl()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "deleteDraft(), return "
            r1.<init>(r0)
            java.lang.String r0 = X.C189200o6.m9toStringimpl(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "FailedReviewViewModelRepo"
            X.C318790Ceb.LIZ(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C315860CZs.LIZ(X.0CZl, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.C315810CZn r12, X.InterfaceC1364105Vn<? super X.C189200o6<kotlin.Unit>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof X.C315880CZu
            r7 = r11
            if (r0 == 0) goto L21
            r4 = r13
            X.0CZu r4 = (X.C315880CZu) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r4.LLILLL = r2
        L13:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 != r1) goto L27
            goto L79
        L21:
            X.0CZu r4 = new X.0CZu
            r4.<init>(r7, r13)
            goto L13
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r3)
            X.0Cdk r6 = LIZLLL()
            if (r6 != 0) goto L48
            X.0CZx r1 = new X.0CZx
            java.lang.String r0 = "draftService null."
            r1.<init>(r0)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r0
        L48:
            r9 = r12
            java.lang.String r8 = r9.LIZ
            if (r8 == 0) goto L66
            int r0 = r8.length()
            if (r0 == 0) goto L66
            r0 = 0
        L54:
            if (r0 == 0) goto L68
            X.0CZx r1 = new X.0CZx
            java.lang.String r0 = "draftId null."
            r1.<init>(r0)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r0
        L66:
            r0 = 1
            goto L54
        L68:
            X.1DFB r0 = X.C0PEM.LIZJ     // Catch: java.lang.Throwable -> L8a
            X.0CZq r5 = new X.0CZq     // Catch: java.lang.Throwable -> L8a
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L8a
            r4.LLILLL = r1     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r3 = X.C23250099c.LJI(r4, r0, r5)     // Catch: java.lang.Throwable -> L8a
            if (r3 != r2) goto L7c
            return r2
        L79:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L8a
        L7c:
            X.00o6 r3 = (X.C189200o6) r3     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r0 = r3.m10unboximpl()     // Catch: java.lang.Throwable -> L8a
            X.00o6 r0 = X.C189200o6.m1boximpl(r0)     // Catch: java.lang.Throwable -> L8a
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L8a
            goto L96
        L8a:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L96:
            java.lang.Throwable r1 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r1 == 0) goto La8
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            X.00o6 r0 = X.C189200o6.m1boximpl(r0)
        La8:
            X.00o6 r0 = (X.C189200o6) r0
            java.lang.Object r2 = r0.m10unboximpl()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "updateDraft(), return "
            r1.<init>(r0)
            java.lang.String r0 = X.C189200o6.m9toStringimpl(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "FailedReviewViewModelRepo"
            X.C318790Ceb.LIZ(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C315860CZs.LJ(X.0CZn, X.05Vn):java.lang.Object");
    }
}
