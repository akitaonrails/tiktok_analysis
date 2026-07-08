package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import defpackage.r2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ChE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.base.handlers.MessageOperatorHandler$syncDataAfterGenVideo$1", f = "MessageOperatorHandler.kt", l = {2307, 2319, 2320, 2324}, m = "invokeSuspend")
public final class C320420ChE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1863380yae LL;
    public int LLILLJJLI;
    public final /* synthetic */ r2 LLILLL;
    public final /* synthetic */ Message LLILZ;
    public final /* synthetic */ C1863280yaU LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C320420ChE(r2 r2Var, Message message, C1863280yaU c1863280yaU, long j, int i, InterfaceC1364105Vn<? super C320420ChE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = r2Var;
        this.LLILZ = message;
        this.LLILZIL = c1863280yaU;
        this.LLILZLL = j;
        this.LLIZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C320420ChE(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C320420ChE.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
