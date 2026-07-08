package X;

import defpackage.r2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0yaX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.base.handlers.MessageOperatorHandler$dispatchBackgroundSync$1", f = "MessageOperatorHandler.kt", l = {3396, 3423, 3456, 3490, 3510, 3525, 3526}, m = "invokeSuspend")
public final class C1863310yaX extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public C1863280yaU LL;
    public r2 LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ C1863280yaU LLILZIL;
    public final /* synthetic */ r2 LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1863310yaX(r2 r2Var, C1863280yaU c1863280yaU, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILZIL = c1863280yaU;
        this.LLILZLL = r2Var;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1863310yaX(this.LLILZLL, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x026a, code lost:
    
        if (r11 != false) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x029a  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863310yaX.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
