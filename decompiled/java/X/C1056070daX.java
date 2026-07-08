package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0daX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.helper.SocialFriendsHelper$getContactModel$1$1", f = "SocialFriendsHelper.kt", l = {483, 486}, m = "invokeSuspend")
public final class C1056070daX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public boolean LL;
    public int LLILLJJLI;
    public final /* synthetic */ EnumC1074240e3q LLILLL;
    public final /* synthetic */ C09AJ<List<Integer>> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1056070daX(EnumC1074240e3q enumC1074240e3q, C09AJ<List<Integer>> c09aj, InterfaceC1364105Vn<? super C1056070daX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = enumC1074240e3q;
        this.LLILZ = c09aj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1056070daX(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0074 A[Catch: Exception -> 0x0091, all -> 0x00a5, TRY_ENTER, TryCatch #1 {Exception -> 0x0091, blocks: (B:7:0x0015, B:25:0x0074, B:26:0x0082, B:15:0x0038, B:16:0x003b, B:18:0x004c, B:20:0x005a, B:11:0x0024), top: B:35:0x000d, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082 A[Catch: Exception -> 0x0091, all -> 0x00a5, TRY_LEAVE, TryCatch #1 {Exception -> 0x0091, blocks: (B:7:0x0015, B:25:0x0074, B:26:0x0082, B:15:0x0038, B:16:0x003b, B:18:0x004c, B:20:0x005a, B:11:0x0024), top: B:35:0x000d, outer: #0 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "SocialFriendsHelper@b1e6.getContactModel$1$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r7.LLILLJJLI
            r5 = 2
            r3 = 1
            if (r0 == 0) goto L21
            if (r0 == r3) goto L38
            if (r0 != r5) goto L19
            boolean r2 = r7.LL
            X.C155000ia.LIZIZ(r8)     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La5
            goto L72
        L19:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L21:
            X.C155000ia.LIZIZ(r8)
            X.0dzU r0 = X.C1071540dzU.LIZIZ     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La5
            X.0daN r1 = r0.LIZIZ()     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La5
            X.0e3q r0 = r7.LLILLL     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La5
            r7.LLILLJJLI = r3     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La5
            java.lang.Object r8 = r1.LIZIZ(r0, r7)     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La5
            if (r8 != r4) goto L3b
            X.C1C7U.LIZIZ(r6)
            return r4
        L38:
            X.C155000ia.LIZIZ(r8)     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La5
        L3b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La5
            boolean r2 = r8.booleanValue()     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La5
            X.0DQq r0 = X.C338980DQq.LIZ     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La5
            r0.getClass()     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La5
            boolean r0 = X.C338980DQq.LIZIZ()     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La5
            if (r0 == 0) goto L72
            X.0dzU r1 = X.C1071540dzU.LIZIZ     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La5
            X.0dxY r0 = X.EnumC1070340dxY.CONTACT     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La5
            X.0dxl r0 = r1.LJ(r0)     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La5
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La5
            if (r0 == 0) goto L72
            X.0daa r1 = r1.LJIIIZ()     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La5
            X.0daZ r0 = X.EnumC1056090daZ.CONTACT_BOOK_SYNCING     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La5
            int r0 = r0.getValue()     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La5
            r7.LL = r2     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La5
            r7.LLILLJJLI = r5     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La5
            java.lang.Object r0 = r1.LIZ(r0, r7)     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La5
            if (r0 != r4) goto L72
            X.C1C7U.LIZIZ(r6)
            return r4
        L72:
            if (r2 == 0) goto L82
            X.09AJ<java.util.List<java.lang.Integer>> r1 = r7.LLILZ     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La5
            java.lang.Integer r0 = X.C2286608xc.LJ(r3)     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La5
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La5
            r1.onNext(r0)     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La5
            goto L9a
        L82:
            X.09AJ<java.util.List<java.lang.Integer>> r1 = r7.LLILZ     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La5
            r0 = 0
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La5
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La5
            r1.onNext(r0)     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> La5
            goto L9a
        L91:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> La5
            X.09AJ<java.util.List<java.lang.Integer>> r0 = r7.LLILZ     // Catch: java.lang.Throwable -> La5
            r0.onError(r1)     // Catch: java.lang.Throwable -> La5
        L9a:
            X.09AJ<java.util.List<java.lang.Integer>> r0 = r7.LLILZ
            r0.onComplete()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        La5:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> La5
            X.09AJ<java.util.List<java.lang.Integer>> r0 = r7.LLILZ
            r0.onComplete()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1056070daX.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
