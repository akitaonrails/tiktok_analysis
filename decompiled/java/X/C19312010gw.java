package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.10gw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.auth.factory.ComposePagerSignupManager$updateComposePager$1$2$1", f = "ComposePagerSignupManager.kt", l = {}, m = "invokeSuspend")
public final class C19312010gw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C19311910gv LLILLJJLI;
    public final /* synthetic */ AbstractC1690640u62 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19312010gw(C19311910gv c19311910gv, AbstractC1690640u62 abstractC1690640u62, InterfaceC1364105Vn<? super C19312010gw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c19311910gv;
        this.LLILLL = abstractC1690640u62;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C19312010gw c19312010gw = new C19312010gw(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c19312010gw.LL = obj;
        return c19312010gw;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19312010gw.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
