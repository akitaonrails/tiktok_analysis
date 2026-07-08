package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vKF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.mobileefffect.preupload.task.upload.UploadIconTask$run$2", f = "UploadIconTask.kt", l = {60}, m = "invokeSuspend")
public final class C1737890vKF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1737940vKK LLILLL;
    public final /* synthetic */ C1737870vKD LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1737890vKF(C1737940vKK c1737940vKK, C1737870vKD c1737870vKD, InterfaceC1364105Vn<? super C1737890vKF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1737940vKK;
        this.LLILZ = c1737870vKD;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1737890vKF c1737890vKF = new C1737890vKF(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1737890vKF.LLILLJJLI = obj;
        return c1737890vKF;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d2  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1737890vKF.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
