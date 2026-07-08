package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05PR, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.highlight.TakoHighLightAnimHelper$playAnimSequentially$1$1", f = "TakoHighLightAnimHelper.kt", l = {25, 30}, m = "invokeSuspend")
public final class C05PR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public C05PU LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ List<C05PU> LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ Function1<C05PU, C05PU> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05PR(List<? extends C05PU> list, boolean z, Function1<? super C05PU, ? extends C05PU> function1, InterfaceC1364105Vn<? super C05PR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = list;
        this.LLILZIL = z;
        this.LLILZLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05PR(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0030 -> B:7:0x001c). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "TakoHighLightAnimHelper@f850.playAnimSequentially$1$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r3 = 2
            r5 = 1
            if (r0 == 0) goto L36
            if (r0 == r5) goto L48
            if (r0 != r3) goto L84
            X.05PU r0 = r7.LLILLJJLI
            java.lang.Object r2 = r7.LL
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            X.C155000ia.LIZIZ(r8)
        L1c:
            java.lang.Object r0 = r2.invoke(r0)
            X.05PU r0 = (X.C05PU) r0
        L22:
            if (r0 == 0) goto L8c
            X.05PS r1 = X.C05PS.LIZ
            r7.LL = r2
            r7.LLILLJJLI = r0
            r7.LLILLL = r3
            java.lang.Object r1 = r1.LIZ(r0, r7)
            if (r1 != r4) goto L1c
            X.C1C7U.LIZIZ(r6)
            return r4
        L36:
            X.C155000ia.LIZIZ(r8)
            java.util.List<X.05PU> r0 = r7.LLILZ
            if (r0 == 0) goto L6b
            java.util.List r0 = X.C13LP.LJJJJLI(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r2 = r0.iterator()
            goto L4f
        L48:
            java.lang.Object r2 = r7.LL
            java.util.Iterator r2 = (java.util.Iterator) r2
            X.C155000ia.LIZIZ(r8)
        L4f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L6b
            java.lang.Object r1 = r2.next()
            X.05PU r1 = (X.C05PU) r1
            X.05PS r0 = X.C05PS.LIZ
            r7.LL = r2
            r7.LLILLL = r5
            java.lang.Object r0 = r0.LIZ(r1, r7)
            if (r0 != r4) goto L4f
            X.C1C7U.LIZIZ(r6)
            return r4
        L6b:
            java.util.List<X.05PU> r0 = r7.LLILZ
            if (r0 == 0) goto L8c
            java.lang.Object r1 = X.C13LP.LJJLIIIJJI(r0)
            if (r1 == 0) goto L8c
            boolean r0 = r7.LLILZIL
            r0 = r0 ^ 1
            if (r0 == 0) goto L8c
            kotlin.jvm.functions.Function1<X.05PU, X.05PU> r2 = r7.LLILZLL
            java.lang.Object r0 = r2.invoke(r1)
            X.05PU r0 = (X.C05PU) r0
            goto L22
        L84:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L8c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05PR.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
