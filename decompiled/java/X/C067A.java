package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.067A, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.probe.core.observer.ProbeObserverReporter$actuallySend$1", f = "ProbeObserverReporter.kt", l = {154}, m = "invokeSuspend")
public final class C067A extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public AnonymousClass1489 LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ AnonymousClass1489 LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C067A(String str, AnonymousClass1489 anonymousClass1489, String str2, InterfaceC1364105Vn<? super C067A> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = str;
        this.LLILZIL = anonymousClass1489;
        this.LLILZLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C067A(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072 A[Catch: all -> 0x00ce, TryCatch #0 {all -> 0x00ce, blocks: (B:15:0x004b, B:16:0x004e, B:19:0x0054, B:26:0x0062, B:31:0x0072, B:51:0x00c1, B:45:0x00b3, B:47:0x00b9, B:32:0x0084, B:34:0x0099, B:36:0x009f, B:39:0x00a4, B:9:0x002c, B:11:0x0037), top: B:62:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084 A[Catch: all -> 0x00ce, TryCatch #0 {all -> 0x00ce, blocks: (B:15:0x004b, B:16:0x004e, B:19:0x0054, B:26:0x0062, B:31:0x0072, B:51:0x00c1, B:45:0x00b3, B:47:0x00b9, B:32:0x0084, B:34:0x0099, B:36:0x009f, B:39:0x00a4, B:9:0x002c, B:11:0x0037), top: B:62:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e4  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C067A.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
