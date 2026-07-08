package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: Add missing generic type declarations: [RESPONSE] */
/* JADX INFO: renamed from: X.0xv0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.api.pcs.infra.payment.task.fetch.AbsFetchTemplateTask$doTask$1$1", f = "AbsFetchTemplateTask.kt", l = {43}, m = "invokeSuspend")
public final class C1837560xv0<RESPONSE> extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C470590Icr<RESPONSE>>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC1837520xuw<RESPONSE, FETCH_PARAM_GLOBAL> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1837560xv0(AbstractC1837520xuw<RESPONSE, FETCH_PARAM_GLOBAL> abstractC1837520xuw, InterfaceC1364105Vn<? super C1837560xv0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC1837520xuw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1837560xv0(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.0xv0<RESPONSE> for r4v1 'this'  X.05Vn
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.String r3 = "AbsFetchTemplateTask@6fbe.doTask$1$1"
            X.C1C7U.LIZ(r3)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LL
            r1 = 1
            if (r0 == 0) goto L17
            if (r0 != r1) goto L28
            X.C155000ia.LIZIZ(r5)
        L13:
            X.C1C7U.LIZIZ(r3)
            return r5
        L17:
            X.C155000ia.LIZIZ(r5)
            X.0xuw<RESPONSE, FETCH_PARAM_GLOBAL> r0 = r4.LLILLJJLI
            r4.LL = r1
            java.lang.Object r5 = r0.LJIIJJI(r4)
            if (r5 != r2) goto L13
            X.C1C7U.LIZIZ(r3)
            return r2
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1837560xv0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, Object obj) {
        return ((a) create(interfaceC497601wk, (InterfaceC1364105Vn) obj)).invokeSuspend(Unit.LIZ);
    }
}
