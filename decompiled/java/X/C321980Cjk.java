package X;

import defpackage.r2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Cjk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.base.handlers.MessageOperatorHandler$batchDeleteMessage$1", f = "MessageOperatorHandler.kt", l = {3616}, m = "invokeSuspend")
public final class C321980Cjk extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public C259800zU LLILLJJLI;
    public C259800zU LLILLL;
    public int LLILZ;
    public final /* synthetic */ r2 LLILZIL;
    public final /* synthetic */ C1863280yaU LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C321980Cjk(r2 r2Var, C1863280yaU c1863280yaU, InterfaceC1364105Vn<? super C321980Cjk> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILZIL = r2Var;
        this.LLILZLL = c1863280yaU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C321980Cjk(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, X.13BV] */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [T, com.ss.android.ugc.aweme.tako.ccl.net.BatchDeleteResponse] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C321980Cjk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
