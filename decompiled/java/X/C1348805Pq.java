package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Pq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.aggregationproscons.api.SearchAggregationProsConsRequestHelper$request$1", f = "SearchAggregationProsConsRequestHelper.kt", l = {35, 38, 46}, m = "invokeSuspend")
public final class C1348805Pq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ Function0<Unit> LLJ;
    public final /* synthetic */ Function1<C0O7A<C0OGU>, Unit> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1348805Pq(String str, int i, String str2, int i2, int i3, int i4, String str3, Function0<Unit> function0, Function1<? super C0O7A<C0OGU>, Unit> function1, InterfaceC1364105Vn<? super C1348805Pq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = str2;
        this.LLILZIL = i2;
        this.LLILZLL = i3;
        this.LLIZ = i4;
        this.LLIZLLLIL = str3;
        this.LLJ = function0;
        this.LLJI = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1348805Pq(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r6 = r19
            java.lang.String r9 = "SearchAggregationProsConsRequestHelper@3af.request$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r4 = X.C099R.LJFF()
            r5 = r18
            int r0 = r5.LL
            r3 = 3
            r2 = 2
            r8 = 1
            if (r0 == 0) goto L23
            if (r0 == r8) goto L42
            if (r0 == r2) goto L76
            if (r0 != r3) goto L90
            X.C155000ia.LIZIZ(r6)
        L1d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L23:
            X.C155000ia.LIZIZ(r6)
            X.05n2 r0 = X.C1456605n2.LIZIZ
            X.09U0 r0 = r0.LIZ()
            X.1DEx r7 = r0.LIZJ
            X.05BS r6 = new X.05BS
            kotlin.jvm.functions.Function0<kotlin.Unit> r1 = r5.LLJ
            r0 = 0
            r6.<init>(r1, r0)
            r5.LL = r8
            java.lang.Object r0 = X.C23250099c.LJI(r5, r7, r6)
            if (r0 != r4) goto L45
            X.C1C7U.LIZIZ(r9)
            return r4
        L42:
            X.C155000ia.LIZIZ(r6)
        L45:
            X.05n2 r0 = X.C1456605n2.LIZIZ
            r0.getClass()
            X.01GW r0 = X.C1456605n2.LIZLLL
            java.lang.Object r0 = r0.getValue()
            X.0SvR r0 = (X.InterfaceC736910SvR) r0
            X.00hg r10 = r0.getOperator()
            X.05Pr r10 = (X.InterfaceC1348905Pr) r10
            java.lang.String r11 = r5.LLILLJJLI
            int r12 = r5.LLILLL
            java.lang.String r13 = r5.LLILZ
            int r14 = r5.LLILZIL
            int r15 = r5.LLILZLL
            int r1 = r5.LLIZ
            java.lang.String r0 = r5.LLIZLLLIL
            r5.LL = r2
            r17 = r0
            r16 = r1
            X.01Wa r6 = r10.LLIL(r11, r12, r13, r14, r15, r16, r17)
            if (r6 != r4) goto L79
            X.C1C7U.LIZIZ(r9)
            return r4
        L76:
            X.C155000ia.LIZIZ(r6)
        L79:
            X.01Wa r6 = (X.InterfaceC346201Wa) r6
            Y.AgS283S0100000_2 r2 = new Y.AgS283S0100000_2
            kotlin.jvm.functions.Function1<X.0O7A<X.0OGU>, kotlin.Unit> r1 = r5.LLJI
            r0 = 78
            r2.<init>(r1, r0)
            r5.LL = r3
            java.lang.Object r0 = r6.collect(r2, r5)
            if (r0 != r4) goto L1d
            X.C1C7U.LIZIZ(r9)
            return r4
        L90:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1348805Pq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
