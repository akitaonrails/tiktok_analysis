package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uW4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.anchor.utils.RecommendProductUtil$getSuggestProduct$1", f = "RecommendProductUtil.kt", l = {167, 172}, m = "invokeSuspend")
public final class C1706780uW4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Function1<List<String>, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1706780uW4(Function1<? super List<String>, Unit> function1, InterfaceC1364105Vn<? super C1706780uW4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1706780uW4(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.String r4 = "RecommendProductUtil@508d.getSuggestProduct$1"
            X.C1C7U.LIZ(r4)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L35
            if (r0 == r1) goto L46
            if (r0 != r2) goto L71
            X.C155000ia.LIZIZ(r6)
        L16:
            if (r6 == 0) goto L2f
            kotlin.jvm.functions.Function1<java.util.List<java.lang.String>, kotlin.Unit> r1 = r5.LLILLJJLI
            X.0uW8 r0 = X.C1706820uW8.LIZ
            r0.getClass()
            boolean r0 = X.C1706820uW8.LIZIZ()
            X.C1706820uW8.LJIIIZ = r0
            if (r1 == 0) goto L2c
            java.util.List<java.lang.String> r0 = X.C1706820uW8.LJII
            r1.invoke(r0)
        L2c:
            X.C1706820uW8.LJI()
        L2f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        L35:
            X.C155000ia.LIZIZ(r6)
            X.099F r0 = X.C1706820uW8.LJIIJJI
            r5.LL = r1
            java.lang.Object r6 = r0.LJLIIIL(r5)
            if (r6 != r3) goto L49
            X.C1C7U.LIZIZ(r4)
            return r3
        L46:
            X.C155000ia.LIZIZ(r6)
        L49:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r0 = r6.booleanValue()
            if (r0 != 0) goto L57
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        L57:
            X.099G r0 = X.C1706820uW8.LJ
            if (r0 == 0) goto L2f
            boolean r0 = r0.isActive()
            if (r0 != r1) goto L2f
            X.099G r0 = X.C1706820uW8.LJ
            if (r0 == 0) goto L2f
            r5.LL = r2
            java.lang.Object r6 = r0.LJLIIIL(r5)
            if (r6 != r3) goto L16
            X.C1C7U.LIZIZ(r4)
            return r3
        L71:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1706780uW4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
