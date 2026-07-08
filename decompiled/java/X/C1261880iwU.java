package X;

import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iwU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel$dislikeCurrentUser$1$1", f = "RecSwipeViewModel.kt", l = {425, 430}, m = "invokeSuspend")
public final class C1261880iwU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1261860iwS LL;
    public int LLILLJJLI;
    public final /* synthetic */ RecSwipeViewModel LLILLL;
    public final /* synthetic */ C1261860iwS LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1261880iwU(RecSwipeViewModel recSwipeViewModel, C1261860iwS c1261860iwS, InterfaceC1364105Vn<? super C1261880iwU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = recSwipeViewModel;
        this.LLILZ = c1261860iwS;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1261880iwU(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "RecSwipeViewModel@199f.dislikeCurrentUser$1$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r8.LLILLJJLI
            r4 = 2
            r6 = 1
            if (r0 == 0) goto L1f
            if (r0 == r6) goto L1c
            if (r0 != r4) goto L14
            goto L60
        L14:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1c:
            X.0iwS r3 = r8.LL
            goto L44
        L1f:
            X.C155000ia.LIZIZ(r9)
            com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel r0 = r8.LLILLL
            X.0iwS r3 = r8.LLILZ
            X.0izl r2 = r0.XB1()     // Catch: java.lang.Throwable -> L71
            X.07u6 r0 = X.EnumC2010007u6.SCENE_BIG_CARDS     // Catch: java.lang.Throwable -> L71
            int r1 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            X.0N2n r0 = X.EnumC587510N2n.DISLIKE_USER     // Catch: java.lang.Throwable -> L71
            int r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            r8.LL = r3     // Catch: java.lang.Throwable -> L71
            r8.LLILLJJLI = r6     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r2.LIZJ(r3, r1, r0, r8)     // Catch: java.lang.Throwable -> L71
            if (r0 != r5) goto L47
            X.C1C7U.LIZIZ(r7)
            return r5
        L44:
            X.C155000ia.LIZIZ(r9)     // Catch: java.lang.Throwable -> L71
        L47:
            X.0iyv r0 = X.C1263390iyv.LIZIZ     // Catch: java.lang.Throwable -> L71
            X.09ig r2 = r0.LIZJ()     // Catch: java.lang.Throwable -> L71
            X.00dY r1 = X.C1263100iyS.LJ(r3)     // Catch: java.lang.Throwable -> L71
            r0 = 0
            r8.LL = r0     // Catch: java.lang.Throwable -> L71
            r8.LLILLJJLI = r4     // Catch: java.lang.Throwable -> L71
            java.lang.Object r9 = r2.LIZ(r1, r8)     // Catch: java.lang.Throwable -> L71
            if (r9 != r5) goto L63
            X.C1C7U.LIZIZ(r7)
            return r5
        L60:
            X.C155000ia.LIZIZ(r9)     // Catch: java.lang.Throwable -> L71
        L63:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L71
            boolean r0 = r9.booleanValue()     // Catch: java.lang.Throwable -> L71
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L71
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L71
            goto L7d
        L71:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L7d:
            X.0iwS r3 = r8.LLILZ
            java.lang.Throwable r2 = X.C189200o6.m5exceptionOrNullimpl(r1)
            if (r2 == 0) goto La5
            int r0 = X.C2187451AjH.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "dislike "
            r1.append(r0)
            java.lang.String r0 = r3.getUid()
            r1.append(r0)
            java.lang.String r0 = " fail"
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "RecSwipeViewModel"
            X.C1720106oR.LIZIZ(r0, r1, r2)
        La5:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1261880iwU.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
