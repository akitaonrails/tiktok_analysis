package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YUI, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.im.core.sdk.MainSafeSDKManager$waitForDelay$1", f = "MainSafeSDKManager.kt", l = {245, 246}, m = "invokeSuspend")
public final class C0YUI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C883090Ykd LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YUI(long j, C883090Ykd c883090Ykd, InterfaceC1364105Vn<? super C0YUI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = c883090Ykd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YUI(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long j;
        C1C7U.LIZ("MainSafeSDKManager@313d.waitForDelay$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MainSafeSDKManager@313d.waitForDelay$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C882400YjW.LIZ.getClass();
            if ((((C883390Yl7) C882400YjW.LJI()).isDebug() || ((C883390Yl7) C882400YjW.LJI()).isLocalTest()) && C0YHJ.LIZ().debugDelayMs > 0) {
                j = C0YHJ.LIZ().debugDelayMs;
            } else {
                j = this.LLILLJJLI;
            }
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("MainSafeSDKManager@313d.waitForDelay$1");
                return objLJFF;
            }
        }
        C883090Ykd c883090Ykd = this.LLILLL;
        C0YUJ c0yuj = C0YUJ.LIZ;
        this.LL = 2;
        if (c883090Ykd.LJIILJJIL(c0yuj, this) == objLJFF) {
            C1C7U.LIZIZ("MainSafeSDKManager@313d.waitForDelay$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MainSafeSDKManager@313d.waitForDelay$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
