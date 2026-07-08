package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0rg1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.platform.data.fetch.FetcherSuiteExecutor$executeBatchWithMeta$2", f = "FetcherSuiteExecutor.kt", l = {124}, m = "invokeSuspend")
public final class C1597630rg1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1158310gFR>, Object> {
    public Object LL;
    public C1597620rg0 LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C1597620rg0 LLILZLL;
    public final /* synthetic */ List<EnumC1597060rf6> LLIZ;
    public final /* synthetic */ C1596730reZ LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1597630rg1(C1597620rg0 c1597620rg0, List<? extends EnumC1597060rf6> list, C1596730reZ c1596730reZ, InterfaceC1364105Vn<? super C1597630rg1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c1597620rg0;
        this.LLIZ = list;
        this.LLIZLLLIL = c1596730reZ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1597630rg1 c1597630rg1 = new C1597630rg1(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c1597630rg1.LLILZIL = obj;
        return c1597630rg1;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0044 -> B:6:0x0021). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r6 = "FetcherSuiteExecutor@1dfd.executeBatchWithMeta$2"
            X.C1C7U.LIZ(r6)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r13.LLILZ
            r1 = 1
            if (r0 == 0) goto L47
            if (r0 != r1) goto Lb4
            java.lang.Object r0 = r13.LLILLL
            java.util.Collection r0 = (java.util.Collection) r0
            X.0rg0 r5 = r13.LLILLJJLI
            java.lang.Object r3 = r13.LL
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r4 = r13.LLILZIL
            java.util.Collection r4 = (java.util.Collection) r4
            X.C155000ia.LIZIZ(r14)
        L21:
            r0.add(r14)
        L24:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto La7
            java.lang.Object r0 = r3.next()
            X.0957 r0 = (X.AnonymousClass0957) r0
            r13.LLILZIL = r4
            r13.LL = r3
            r13.LLILLJJLI = r5
            r13.LLILLL = r4
            r13.LLILZ = r1
            java.lang.Object r14 = r0.LJLIIIL(r13)
            if (r14 != r2) goto L44
            X.C1C7U.LIZIZ(r6)
            return r2
        L44:
            r0 = r4
            r4 = r0
            goto L21
        L47:
            X.C155000ia.LIZIZ(r14)
            java.lang.Object r5 = r13.LLILZIL
            X.01wk r5 = (X.InterfaceC497601wk) r5
            X.0rg0 r3 = r13.LLILZLL
            java.util.List<X.0rf6> r0 = r13.LLIZ
            java.util.Map r4 = r3.LJ(r0)
            X.0rg0 r8 = r13.LLILZLL
            X.0reZ r11 = r13.LLIZLLLIL
            java.util.ArrayList r3 = new java.util.ArrayList
            int r0 = r4.size()
            r3.<init>(r0)
            java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L6d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L94
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r9 = r0.getKey()
            X.0rg8 r9 = (X.InterfaceC1597700rg8) r9
            java.lang.Object r10 = r0.getValue()
            java.util.List r10 = (java.util.List) r10
            X.0rg2 r7 = new X.0rg2
            r12 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            r0 = 3
            X.099G r0 = X.C23250099c.LIZIZ(r5, r12, r12, r7, r0)
            r3.add(r0)
            goto L6d
        L94:
            X.0rg0 r5 = r13.LLILZLL
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r3, r0)
            r4.<init>(r0)
            java.util.Iterator r3 = r3.iterator()
            goto L24
        La7:
            java.util.List r4 = (java.util.List) r4
            r5.getClass()
            X.0gFR r0 = X.C1597620rg0.LJFF(r4)
            X.C1C7U.LIZIZ(r6)
            return r0
        Lb4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1597630rg1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1158310gFR> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
