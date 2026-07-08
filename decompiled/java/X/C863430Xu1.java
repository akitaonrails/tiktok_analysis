package X;

import com.ss.android.ugc.aweme.ttep.ttepcomponent.TTEPPreviewEffectLogicComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xu1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ttep.ttepcomponent.TTEPPreviewEffectLogicComponent$tryApplyEffect$1", f = "TTEPPreviewEffectLogicComponent.kt", l = {225, 226, 230}, m = "invokeSuspend")
public final class C863430Xu1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public boolean LL;
    public int LLILLJJLI;
    public final /* synthetic */ TTEPPreviewEffectLogicComponent LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863430Xu1(TTEPPreviewEffectLogicComponent tTEPPreviewEffectLogicComponent, InterfaceC1364105Vn<? super C863430Xu1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = tTEPPreviewEffectLogicComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C863430Xu1(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.String r8 = "TTEPPreviewEffectLogicComponent@5edf.tryApplyEffect$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r9.LLILLJJLI
            r6 = 0
            r4 = 3
            r7 = 2
            r1 = 1
            if (r0 == 0) goto L20
            if (r0 == r1) goto L31
            if (r0 == r7) goto L53
            if (r0 != r4) goto L79
            X.C155000ia.LIZIZ(r10)
        L1a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L20:
            X.C155000ia.LIZIZ(r10)
            com.ss.android.ugc.aweme.ttep.ttepcomponent.TTEPPreviewEffectLogicComponent r0 = r9.LLILLL
            r9.LLILLJJLI = r1
            java.lang.Object r10 = r0.awaitVEFirstFrame(r9)
            if (r10 != r5) goto L34
            X.C1C7U.LIZIZ(r8)
            return r5
        L31:
            X.C155000ia.LIZIZ(r10)
        L34:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r3 = r10.booleanValue()
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0Xu0 r1 = new X.0Xu0
            com.ss.android.ugc.aweme.ttep.ttepcomponent.TTEPPreviewEffectLogicComponent r0 = r9.LLILLL
            r1.<init>(r0, r6)
            r9.LL = r3
            r9.LLILLJJLI = r7
            java.lang.Object r10 = X.C23250099c.LJI(r9, r2, r1)
            if (r10 != r5) goto L58
            X.C1C7U.LIZIZ(r8)
            return r5
        L53:
            boolean r3 = r9.LL
            X.C155000ia.LIZIZ(r10)
        L58:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r0 = r10.booleanValue()
            if (r3 == 0) goto L1a
            if (r0 == 0) goto L1a
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0Xu2 r1 = new X.0Xu2
            com.ss.android.ugc.aweme.ttep.ttepcomponent.TTEPPreviewEffectLogicComponent r0 = r9.LLILLL
            r1.<init>(r0, r6)
            r9.LLILLJJLI = r4
            java.lang.Object r0 = X.C23250099c.LJI(r9, r2, r1)
            if (r0 != r5) goto L1a
            X.C1C7U.LIZIZ(r8)
            return r5
        L79:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C863430Xu1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
