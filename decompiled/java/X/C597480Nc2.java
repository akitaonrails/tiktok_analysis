package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Nc2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.android.live.iap.service.IapServiceClass$preCheckIAPEnv$1", f = "IapServiceClass.kt", l = {553}, m = "invokeSuspend")
public final class C597480Nc2 extends C09AX implements Function1<InterfaceC1364105Vn<? super AbstractC1157840gEg<Unit>>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1789300wfA LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C597480Nc2(InterfaceC1789300wfA interfaceC1789300wfA, String str, InterfaceC1364105Vn<? super C597480Nc2> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1789300wfA;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C597480Nc2(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super AbstractC1157840gEg<Unit>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IapServiceClass@66cd.preCheckIAPEnv$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC1789300wfA interfaceC1789300wfA = this.LLILLJJLI;
            String str = this.LLILLL;
            this.LL = 1;
            obj = interfaceC1789300wfA.LIZ(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("IapServiceClass@66cd.preCheckIAPEnv$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("IapServiceClass@66cd.preCheckIAPEnv$1");
        return obj;
    }
}
