package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ykk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.im.core.sdk.MainSafeSDKManager$refreshSDKAction$1$1", f = "MainSafeSDKManager.kt", l = {87}, m = "invokeSuspend")
public final class C883160Ykk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C883090Ykd LLILLJJLI;
    public final /* synthetic */ EnumC883260Yku LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C883160Ykk(C883090Ykd c883090Ykd, EnumC883260Yku enumC883260Yku, InterfaceC1364105Vn<? super C883160Ykk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c883090Ykd;
        this.LLILLL = enumC883260Yku;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C883160Ykk(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MainSafeSDKManager@313d.refreshSDKAction$1$1");
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
            C883090Ykd c883090Ykd = this.LLILLJJLI;
            C883310Ykz c883310Ykz = new C883310Ykz(this.LLILLL, 1);
            this.LL = 1;
            if (c883090Ykd.LJIILJJIL(c883310Ykz, this) == objLJFF) {
                C1C7U.LIZIZ("MainSafeSDKManager@313d.refreshSDKAction$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MainSafeSDKManager@313d.refreshSDKAction$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
