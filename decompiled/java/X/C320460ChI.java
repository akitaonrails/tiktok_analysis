package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import defpackage.k9;
import defpackage.r2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0ChI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.base.handlers.MessageOperatorHandler$handleSug$2", f = "MessageOperatorHandler.kt", l = {1855, 1879}, m = "invokeSuspend")
public final class C320460ChI extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public TakoSug LL;
    public int LLILLJJLI;
    public final /* synthetic */ r2 LLILLL;
    public final /* synthetic */ TakoSug LLILZ;
    public final /* synthetic */ C1863280yaU LLILZIL;
    public final /* synthetic */ k9 LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C320460ChI(r2 r2Var, TakoSug takoSug, C1863280yaU c1863280yaU, k9 k9Var, int i, InterfaceC1364105Vn<? super C320460ChI> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLL = r2Var;
        this.LLILZ = takoSug;
        this.LLILZIL = c1863280yaU;
        this.LLILZLL = k9Var;
        this.LLIZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C320460ChI(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C320460ChI.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
