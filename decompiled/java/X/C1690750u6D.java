package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0u6D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.foundation.pager.PagerState$animateScrollToPage$3", f = "PagerState.kt", l = {619}, m = "invokeSuspend")
public final class C1690750u6D extends C09AX implements Function2<InterfaceC1392705cj, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AbstractC1690640u62 LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ float LLILZIL;
    public final /* synthetic */ InterfaceC1677030tk5<Float> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1690750u6D(AbstractC1690640u62 abstractC1690640u62, int i, float f, InterfaceC1677030tk5<Float> interfaceC1677030tk5, InterfaceC1364105Vn<? super C1690750u6D> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = abstractC1690640u62;
        this.LLILZ = i;
        this.LLILZIL = f;
        this.LLILZLL = interfaceC1677030tk5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1690750u6D c1690750u6D = new C1690750u6D(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1690750u6D.LLILLJJLI = obj;
        return c1690750u6D;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        r4 = r0;
     */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r12.LL
            r4 = 1
            if (r0 == 0) goto L11
            if (r0 != r4) goto L95
            X.C155000ia.LIZIZ(r13)
        Le:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L11:
            X.C155000ia.LIZIZ(r13)
            java.lang.Object r0 = r12.LLILLJJLI
            X.05cj r0 = (X.InterfaceC1392705cj) r0
            X.0u62 r8 = r12.LLILLL
            X.0u6C r3 = new X.0u6C
            r3.<init>(r0, r8)
            int r7 = r12.LLILZ
            float r5 = r12.LLILZIL
            X.0tk5<java.lang.Float> r10 = r12.LLILZLL
            kotlin.jvm.internal.AwS639S0100000_25 r1 = new kotlin.jvm.internal.AwS639S0100000_25
            r0 = 145(0x91, float:2.03E-43)
            r1.<init>(r8, r0)
            r12.LL = r4
            float r0 = X.C1690670u65.LIZ
            java.lang.Integer r0 = X.C2286608xc.LJ(r7)
            r1.invoke(r3, r0)
            int r0 = r8.LJ
            r6 = 0
            if (r7 <= r0) goto L93
            r9 = 1
        L3d:
            int r1 = r3.LJ()
            int r0 = r8.LJ
            int r1 = r1 - r0
            int r4 = r1 + 1
            if (r9 == 0) goto L71
            int r0 = r3.LJ()
            if (r7 > r0) goto L75
        L4e:
            int r0 = r3.LIZ(r7, r6)
            float r8 = (float) r0
            float r8 = r8 + r5
            X.03Hg r1 = new X.03Hg
            r1.<init>()
            kotlin.jvm.internal.AwS460S0200000_25 r11 = new kotlin.jvm.internal.AwS460S0200000_25
            r0 = 31
            r11.<init>(r1, r3, r0)
            r7 = 0
            r9 = r7
            java.lang.Object r1 = X.C1677810tlL.LIZ(r7, r8, r9, r10, r11, r12)
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto L6e
            kotlin.Unit r1 = kotlin.Unit.LIZ
        L6e:
            if (r1 != r2) goto Le
            return r2
        L71:
            int r0 = r8.LJ
            if (r7 >= r0) goto L4e
        L75:
            int r0 = r8.LJ
            int r0 = r7 - r0
            int r1 = java.lang.Math.abs(r0)
            r0 = 3
            if (r1 < r0) goto L4e
            if (r9 == 0) goto L8d
            int r4 = r7 - r4
            int r0 = r8.LJ
            if (r4 >= r0) goto L89
        L88:
            r4 = r0
        L89:
            r3.LJFF(r4, r6)
            goto L4e
        L8d:
            int r4 = r4 + r7
            int r0 = r8.LJ
            if (r4 <= r0) goto L89
            goto L88
        L93:
            r9 = 0
            goto L3d
        L95:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1690750u6D.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1392705cj interfaceC1392705cj, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1392705cj, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
