package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LA7, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.choosemv.MultiColTemplateScene$getLottieView$1", f = "MultiColTemplateScene.kt", l = {941, 962}, m = "invokeSuspend")
public final class C0LA7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1295960jpS LL;
    public C1424590nAv LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C1295960jpS LLILZLL;
    public final /* synthetic */ C1424590nAv LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LA7(String str, C1295960jpS c1295960jpS, C1424590nAv c1424590nAv, Function0<Unit> function0, InterfaceC1364105Vn<? super C0LA7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = str;
        this.LLILZLL = c1295960jpS;
        this.LLIZ = c1424590nAv;
        this.LLIZLLLIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LA7(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r7 = "MultiColTemplateScene@5338.getLottieView$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r8.LLILZ
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L34
            if (r0 == r5) goto L4d
            if (r0 != r6) goto L9b
            java.lang.Object r5 = r8.LLILLL
            java.lang.String r5 = (java.lang.String) r5
            X.0nAv r2 = r8.LLILLJJLI
            X.0jpS r3 = r8.LL
            X.C155000ia.LIZIZ(r9)
        L1e:
            boolean r0 = r2.isVisible()
            if (r0 == 0) goto L2e
            r3.playAnimation()
            long r0 = java.lang.System.currentTimeMillis()
            X.C538490L9z.LJFF(r0, r5)
        L2e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L34:
            X.C155000ia.LIZIZ(r9)
            X.1DFB r3 = X.C0PEM.LIZJ
            X.0LA6 r2 = new X.0LA6
            java.lang.String r1 = r8.LLILZIL
            r0 = 0
            r2.<init>(r1, r0)
            r8.LLILZ = r5
            java.lang.Object r9 = X.C23250099c.LJI(r8, r3, r2)
            if (r9 != r4) goto L50
            X.C1C7U.LIZIZ(r7)
            return r4
        L4d:
            X.C155000ia.LIZIZ(r9)
        L50:
            X.0jj4 r9 = (X.C1292000jj4) r9
            if (r9 == 0) goto L8f
            V r0 = r9.LIZ
            X.0jnS r0 = (X.C1294720jnS) r0
            if (r0 == 0) goto L8f
            X.0jpS r3 = r8.LLILZLL
            X.0nAv r2 = r8.LLIZ
            java.lang.String r5 = r8.LLILZIL
            r3.setComposition(r0)
            X.0MWA r0 = X.C1424590nAv.LLLLLLIL(r5)
            X.0MW9 r1 = X.C0MW9.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 == 0) goto L77
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.setProgress(r0)
            r2.LLLIIII = r1
            goto L2e
        L77:
            X.0MWB r0 = X.C0MWB.LIZ
            r2.LLLIIII = r0
            r8.LL = r3
            r8.LLILLJJLI = r2
            r8.LLILLL = r5
            r8.LLILZ = r6
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r8)
            if (r0 != r4) goto L1e
            X.C1C7U.LIZIZ(r7)
            return r4
        L8f:
            X.0nAv r2 = r8.LLIZ
            kotlin.jvm.functions.Function0<kotlin.Unit> r1 = r8.LLIZLLLIL
            X.0MWC r0 = X.C0MWC.LIZ
            r2.LLLIIII = r0
            r1.invoke()
            goto L2e
        L9b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LA7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
