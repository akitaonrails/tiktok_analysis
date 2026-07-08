package X;

import com.ss.android.ugc.aweme.aigc.asynctask.CommonAigcQuotaInput;
import com.ss.android.ugc.aweme.aigc.asynctask.QuotaResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LSQ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.GeneralI2VQuotaTask$run$2", f = "GeneralI2VQuotaTask.kt", l = {35, 43, 53, 59}, m = "invokeSuspend")
public final class C0LSQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0LQD>, Object> {
    public QuotaResult LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C0LST LLILZ;
    public final /* synthetic */ CommonAigcQuotaInput LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LSQ(C0LST c0lst, CommonAigcQuotaInput commonAigcQuotaInput, InterfaceC1364105Vn<? super C0LSQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c0lst;
        this.LLILZIL = commonAigcQuotaInput;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LSQ(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0103  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r43) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LSQ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0LQD> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
