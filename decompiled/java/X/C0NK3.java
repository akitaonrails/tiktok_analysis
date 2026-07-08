package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NK3, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.assem.arch.viewModel.store.FlowStore$1", f = "FlowStore.kt", l = {44}, m = "invokeSuspend")
public final class C0NK3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC824740WWy LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0NK4<Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NK3(C0NK4<Object> c0nk4, InterfaceC1364105Vn<? super C0NK3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0nk4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NK3(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005f -> B:6:0x0015). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r0 = "FlowStore@573a.<init>$1"
            X.C1C7U.LIZ(r0)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LLILLJJLI
            r6 = 1
            if (r0 == 0) goto L48
            if (r0 != r6) goto L72
            X.0WWy r4 = r7.LL
            X.C155000ia.LIZIZ(r8)
        L15:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r0 = r8.booleanValue()
            if (r0 == 0) goto L6a
            r4.next()
            X.0NK4<java.lang.Object> r3 = r7.LLILLL
        L22:
            X.0NK5<S> r2 = r3.LIZLLL
            monitor-enter(r2)
            java.util.LinkedList<kotlin.jvm.functions.Function1<S, kotlin.Unit>> r0 = r2.LIZ     // Catch: java.lang.Throwable -> L67
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L30
            monitor-exit(r2)
            r1 = 0
            goto L39
        L30:
            java.util.LinkedList<kotlin.jvm.functions.Function1<S, kotlin.Unit>> r0 = r2.LIZ     // Catch: java.lang.Throwable -> L67
            java.lang.Object r1 = r0.removeFirst()     // Catch: java.lang.Throwable -> L67
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1     // Catch: java.lang.Throwable -> L67
            monitor-exit(r2)
        L39:
            r3.LIZ()
            if (r1 == 0) goto L57
            X.1DDq r0 = r3.LIZ
            java.lang.Object r0 = r0.getValue()
            r1.invoke(r0)
            goto L22
        L48:
            X.C155000ia.LIZIZ(r8)
            X.0NK4<java.lang.Object> r0 = r7.LLILLL
            X.1DEK r0 = r0.LIZJ
            r0.getClass()
            X.1DEL r4 = new X.1DEL
            r4.<init>(r0)
        L57:
            r7.LL = r4
            r7.LLILLJJLI = r6
            java.lang.Object r8 = r4.LIZ(r7)
            if (r8 != r5) goto L15
            java.lang.String r0 = "FlowStore@573a.<init>$1"
            X.C1C7U.LIZIZ(r0)
            return r5
        L67:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L6a:
            kotlin.Unit r1 = kotlin.Unit.LIZ
            java.lang.String r0 = "FlowStore@573a.<init>$1"
            X.C1C7U.LIZIZ(r0)
            return r1
        L72:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NK3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
