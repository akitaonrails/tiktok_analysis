package X;

import com.ss.android.ugc.aweme.relation.feed.performanceui.PerformanceUserCardViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uSB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.feed.performanceui.PerformanceUserCardViewModel$loadMafUser$1$resp$1", f = "PerformanceUserCardViewModel.kt", l = {272, 274}, m = "invokeSuspend")
public final class C1704370uSB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AbstractC323330Clv<C1261860iwS>>, Object> {
    public int LL;
    public final /* synthetic */ C1263870izh LLILLJJLI;
    public final /* synthetic */ PerformanceUserCardViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1704370uSB(C1263870izh c1263870izh, PerformanceUserCardViewModel performanceUserCardViewModel, InterfaceC1364105Vn<? super C1704370uSB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1263870izh;
        this.LLILLL = performanceUserCardViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1704370uSB(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "PerformanceUserCardViewModel@63a3.loadMafUser$1$resp$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LL
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L33
            if (r0 != r5) goto L58
            X.C155000ia.LIZIZ(r9)
        L16:
            X.C1C7U.LIZIZ(r7)
            return r9
        L1a:
            X.C155000ia.LIZIZ(r9)
            X.0izh r1 = r8.LLILLJJLI
            if (r1 == 0) goto L38
            com.ss.android.ugc.aweme.relation.feed.performanceui.PerformanceUserCardViewModel r0 = r8.LLILLL
            X.0izl r0 = r0.XB1()
            r8.LL = r2
            java.lang.Object r9 = r0.LIZLLL(r1, r8)
            if (r9 != r6) goto L36
            X.C1C7U.LIZIZ(r7)
            return r6
        L33:
            X.C155000ia.LIZIZ(r9)
        L36:
            if (r9 != 0) goto L16
        L38:
            com.ss.android.ugc.aweme.relation.feed.performanceui.PerformanceUserCardViewModel r0 = r8.LLILLL
            X.0izl r4 = r0.XB1()
            X.0izh r3 = new X.0izh
            com.ss.android.ugc.aweme.relation.feed.RecUserBigCardConfig r0 = X.C1A9E.LIZ()
            int r2 = r0.loadCount
            r1 = 0
            r0 = 23
            r3.<init>(r2, r1, r0)
            r8.LL = r5
            java.lang.Object r9 = r4.LIZLLL(r3, r8)
            if (r9 != r6) goto L16
            X.C1C7U.LIZIZ(r7)
            return r6
        L58:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1704370uSB.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AbstractC323330Clv<C1261860iwS>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
