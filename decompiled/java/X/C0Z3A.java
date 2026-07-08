package X;

import com.ss.android.ugc.aweme.im.sdk.resourcemanage.monitor.DMResourceManagementAiServiceMonitor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Z3A, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.resourcemanage.monitor.DMResourceManagementAiServiceMonitor$whenUserLeaveInbox$1", f = "DMResourceManagementAiServiceMonitor.kt", l = {129}, m = "invokeSuspend")
public final class C0Z3A extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Z3A(int i, InterfaceC1364105Vn<? super C0Z3A> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0Z3A(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DMResourceManagementAiServiceMonitor@2526.whenUserLeaveInbox$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(10000L, this) == objLJFF) {
                C1C7U.LIZIZ("DMResourceManagementAiServiceMonitor@2526.whenUserLeaveInbox$1");
                return objLJFF;
            }
        }
        DMResourceManagementAiServiceMonitor.LIZ.getClass();
        C893470Z3h c893470Z3h = (C893470Z3h) DMResourceManagementAiServiceMonitor.LIZJ().get(C2286608xc.LJ(this.LLILLJJLI));
        if (c893470Z3h != null) {
            for (String str : (C823170WQx) c893470Z3h.LIZLLL.getValue()) {
                InterfaceC1664506fT interfaceC1664506fTLIZ = c893470Z3h.LIZ();
                if (interfaceC1664506fTLIZ != null) {
                    interfaceC1664506fTLIZ.LJI("enter_chat_predict_compensation_v1", str);
                }
            }
            for (String str2 : (C823170WQx) c893470Z3h.LIZJ.getValue()) {
                if (((C823170WQx) c893470Z3h.LJ.getValue()).contains(str2)) {
                    InterfaceC1664506fT interfaceC1664506fTLIZ2 = c893470Z3h.LIZ();
                    if (interfaceC1664506fTLIZ2 != null) {
                        interfaceC1664506fTLIZ2.LIZ("enter_chat_predict_compensation_v1", str2);
                    }
                    InterfaceC1664506fT interfaceC1664506fTLIZ3 = c893470Z3h.LIZ();
                    if (interfaceC1664506fTLIZ3 != null) {
                        interfaceC1664506fTLIZ3.LIZIZ("enter_chat_predict_compensation_v1", str2, C0Z38.MODE_FIRST_ONLY, ((C823170WQx) c893470Z3h.LIZLLL.getValue()).contains(str2));
                    }
                }
            }
            InterfaceC1664506fT interfaceC1664506fTLIZ4 = c893470Z3h.LIZ();
            if (interfaceC1664506fTLIZ4 != null) {
                interfaceC1664506fTLIZ4.LJ("enter_chat_predict_compensation_v1");
            }
            InterfaceC1664506fT interfaceC1664506fTLIZ5 = c893470Z3h.LIZ();
            if (interfaceC1664506fTLIZ5 != null) {
                interfaceC1664506fTLIZ5.LIZLLL("enter_chat_predict_compensation_v1");
            }
            InterfaceC1664506fT interfaceC1664506fTLIZ6 = c893470Z3h.LIZ();
            if (interfaceC1664506fTLIZ6 != null) {
                interfaceC1664506fTLIZ6.LIZJ("enter_chat_predict_compensation_v1");
            }
            InterfaceC1664506fT interfaceC1664506fTLIZ7 = c893470Z3h.LIZ();
            if (interfaceC1664506fTLIZ7 != null) {
                interfaceC1664506fTLIZ7.LJFF("enter_chat_predict_compensation_v1");
            }
        }
        DMResourceManagementAiServiceMonitor.LIZ.getClass();
        DMResourceManagementAiServiceMonitor.LIZJ().remove(C2286608xc.LJ(this.LLILLJJLI));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DMResourceManagementAiServiceMonitor@2526.whenUserLeaveInbox$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
