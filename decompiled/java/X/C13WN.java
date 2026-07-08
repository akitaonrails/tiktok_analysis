package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.JobSupport;
import njp.a;

/* JADX INFO: renamed from: X.13WN, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {956, 958}, m = "invokeSuspend")
public final class C13WN extends C09AW implements Function2<AbstractC1421005hI<? super C09AE>, InterfaceC1364105Vn<? super Unit>, Object> {
    public C2252711DFd LLILLJJLI;
    public C1DF2 LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ JobSupport LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13WN(InterfaceC1364105Vn interfaceC1364105Vn, JobSupport jobSupport) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = jobSupport;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C13WN c13wn = new C13WN(interfaceC1364105Vn, this.LLILZLL);
        c13wn.LLILZIL = obj;
        return c13wn;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0025 -> B:7:0x0019). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0038 -> B:7:0x0019). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r5 = 2
            r3 = 1
            if (r0 == 0) goto L3b
            if (r0 == r3) goto L74
            if (r0 != r5) goto L6c
            X.1DF2 r0 = r6.LLILLL
            X.1DFd r1 = r6.LLILLJJLI
            java.lang.Object r2 = r6.LLILZIL
            X.05hI r2 = (X.AbstractC1421005hI) r2
            X.C155000ia.LIZIZ(r7)
        L19:
            X.1DF2 r0 = r0.LJ()
        L1d:
            boolean r3 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r3 != 0) goto L77
            boolean r3 = r0 instanceof X.C1DFF
            if (r3 == 0) goto L19
            r3 = r0
            X.1DFF r3 = (X.C1DFF) r3
            X.13WO r3 = r3.LLILZIL
            r6.LLILZIL = r2
            r6.LLILLJJLI = r1
            r6.LLILLL = r0
            r6.LLILZ = r5
            java.lang.Object r3 = r2.LIZ(r3, r6)
            if (r3 != r4) goto L19
            return r4
        L3b:
            X.C155000ia.LIZIZ(r7)
            java.lang.Object r2 = r6.LLILZIL
            X.05hI r2 = (X.AbstractC1421005hI) r2
            kotlinx.coroutines.JobSupport r0 = r6.LLILZLL
            java.lang.Object r1 = r0.LJJJJZI()
            boolean r0 = r1 instanceof X.C1DFF
            if (r0 == 0) goto L59
            X.1DFF r1 = (X.C1DFF) r1
            X.13WO r0 = r1.LLILZIL
            r6.LLILZ = r3
            java.lang.Object r0 = r2.LIZ(r0, r6)
            if (r0 != r4) goto L77
            return r4
        L59:
            boolean r0 = r1 instanceof X.C13WP
            if (r0 == 0) goto L77
            X.13WP r1 = (X.C13WP) r1
            X.1DFc r1 = r1.getList()
            if (r1 == 0) goto L77
            java.lang.Object r0 = r1.LIZLLL()
            X.1DF2 r0 = (X.C1DF2) r0
            goto L1d
        L6c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L74:
            X.C155000ia.LIZIZ(r7)
        L77:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13WN.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC1421005hI<? super C09AE> abstractC1421005hI, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(abstractC1421005hI, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
