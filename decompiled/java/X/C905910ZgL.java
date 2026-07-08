package X;

import com.ss.android.ugc.aweme.im.streaming.api.RetryInfoComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZgL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streaming.StreamRepositoryImpl$resumeFromSnapshot$1", f = "StreamRepositoryImpl.kt", l = {330, 345, 355, 359, 362, 364}, m = "invokeSuspend")
public final class C905910ZgL extends C09AX implements Function2<InterfaceC346701Wf<? super InterfaceC905820ZgC>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C875220YVc LLILLL;
    public final /* synthetic */ C905950ZgP LLILZ;
    public final /* synthetic */ C869590Y9l LLILZIL;
    public final /* synthetic */ RetryInfoComponent LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C905910ZgL(C875220YVc c875220YVc, C905950ZgP c905950ZgP, C869590Y9l c869590Y9l, RetryInfoComponent retryInfoComponent, InterfaceC1364105Vn<? super C905910ZgL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c875220YVc;
        this.LLILZ = c905950ZgP;
        this.LLILZIL = c869590Y9l;
        this.LLILZLL = retryInfoComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C905910ZgL c905910ZgL = new C905910ZgL(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c905910ZgL.LLILLJJLI = obj;
        return c905910ZgL;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0135 A[LOOP:0: B:53:0x012f->B:55:0x0135, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C905910ZgL.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super InterfaceC905820ZgC> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
