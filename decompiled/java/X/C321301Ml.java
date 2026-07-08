package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01Ml, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", f = "Errors.kt", l = {95}, m = "invokeSuspend")
public final class C321301Ml extends C09AX implements InterfaceC1631630sYr<InterfaceC346701Wf<Object>, Throwable, Long, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ Function2<Throwable, InterfaceC1364105Vn<? super Boolean>, Object> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C321301Ml(long j, Function2<? super Throwable, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function2, InterfaceC1364105Vn<? super C321301Ml> interfaceC1364105Vn) {
        super(4, interfaceC1364105Vn);
        this.LLILZ = j;
        this.LLILZIL = function2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to X.01Ml for r8v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r8.LL
            r6 = 1
            if (r0 == 0) goto L1b
            if (r0 != r6) goto L35
            X.C155000ia.LIZIZ(r9)
        Le:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r0 = r9.booleanValue()
            if (r0 == 0) goto L33
        L16:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            return r0
        L1b:
            X.C155000ia.LIZIZ(r9)
            java.lang.Object r5 = r8.LLILLJJLI
            long r3 = r8.LLILLL
            long r1 = r8.LLILZ
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L33
            kotlin.jvm.functions.Function2<java.lang.Throwable, X.05Vn<? super java.lang.Boolean>, java.lang.Object> r0 = r8.LLILZIL
            r8.LL = r6
            java.lang.Object r9 = r0.invoke(r5, r8)
            if (r9 != r7) goto Le
            return r7
        L33:
            r6 = 0
            goto L16
        L35:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C321301Ml.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(InterfaceC346701Wf<Object> interfaceC346701Wf, Throwable th, Long l, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        long jLongValue = l.longValue();
        C321301Ml c321301Ml = new C321301Ml(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c321301Ml.LLILLJJLI = th;
        c321301Ml.LLILLL = jLongValue;
        return c321301Ml.invokeSuspend(Unit.LIZ);
    }
}
