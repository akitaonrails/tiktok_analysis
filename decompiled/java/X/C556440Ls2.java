package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ls2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.wave.graph.AIGCWorkflowSessionStore$watchSession$job$1", f = "AIGCWorkflowSessionStore.kt", l = {156}, m = "invokeSuspend")
public final class C556440Ls2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC556470Ls5 LLILLJJLI;
    public final /* synthetic */ C556460Ls4 LLILLL;
    public final /* synthetic */ C05YC<C1346605Ou> LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C556440Ls2(InterfaceC556470Ls5 interfaceC556470Ls5, C556460Ls4 c556460Ls4, C05YC<C1346605Ou> c05yc, String str, InterfaceC1364105Vn<? super C556440Ls2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC556470Ls5;
        this.LLILLL = c556460Ls4;
        this.LLILZ = c05yc;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C556440Ls2(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r3 = "AIGCWorkflowSessionStore@d8ea.watchSession$job$1"
            X.C1C7U.LIZ(r3)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r10.LL
            r1 = 1
            if (r0 == 0) goto L19
            if (r0 != r1) goto L51
            X.C155000ia.LIZIZ(r11)
        L13:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r3)
            return r0
        L19:
            X.C155000ia.LIZIZ(r11)
            X.00zU r7 = new X.00zU
            r7.<init>()
            X.0Ls5 r0 = r10.LLILLJJLI
            X.05Ou r0 = r0.getState()
            if (r0 == 0) goto L2d
            java.util.Map<java.lang.String, X.05f1> r0 = r0.LIZ
            if (r0 != 0) goto L31
        L2d:
            java.util.Map r0 = X.C2097608Jq.LJ()
        L31:
            r7.element = r0
            X.0Ls5 r0 = r10.LLILLJJLI
            X.0950 r0 = r0.getEvents()
            Y.AgS40S1300000_8 r4 = new Y.AgS40S1300000_8
            X.0Ls4 r6 = r10.LLILLL
            X.05YC<X.05Ou> r8 = r10.LLILZ
            java.lang.String r5 = r10.LLILZIL
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r10.LL = r1
            java.lang.Object r0 = r0.collect(r4, r10)
            if (r0 != r2) goto L13
            X.C1C7U.LIZIZ(r3)
            return r2
        L51:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C556440Ls2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
