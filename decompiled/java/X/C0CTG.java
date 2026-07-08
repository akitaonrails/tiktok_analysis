package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CTG, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.im.core.client.DefaultSendMessageQueue$NetworkJob$await$2", f = "DefaultSendMessageQueue.kt", l = {259}, m = "invokeSuspend")
public final class C0CTG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<Object>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0D2H<Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CTG(C0D2H<Object> c0d2h, InterfaceC1364105Vn<? super C0CTG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0d2h;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0CTG c0ctg = new C0CTG(this.LLILLL, interfaceC1364105Vn);
        c0ctg.LLILLJJLI = obj;
        return c0ctg;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to X.0CTG for r5v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r4 = "DefaultSendMessageQueue$NetworkJob@2d3e.await$2"
            X.C1C7U.LIZ(r4)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LL
            r2 = 1
            if (r0 == 0) goto L17
            if (r0 != r2) goto L2c
            X.C155000ia.LIZIZ(r6)
        L13:
            X.C1C7U.LIZIZ(r4)
            return r6
        L17:
            X.C155000ia.LIZIZ(r6)
            java.lang.Object r1 = r5.LLILLJJLI
            X.0D2H<java.lang.Object> r0 = r5.LLILLL
            kotlin.jvm.functions.Function2<X.01wk, X.05Vn<? super T>, java.lang.Object> r0 = r0.LIZJ
            r5.LL = r2
            java.lang.Object r6 = r0.invoke(r1, r5)
            if (r6 != r3) goto L13
            X.C1C7U.LIZIZ(r4)
            return r3
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0CTG.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
