package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01Nb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.iap.core.restore.action.ListenToCashierDismissAction$perform$2", f = "ListenToCashierDismissAction.kt", l = {32}, m = "invokeSuspend")
public final class C322901Nb extends C09AX implements Function2<C1411490mpn, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C322901Nb(InterfaceC1364105Vn<? super C322901Nb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C322901Nb(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ListenToCashierDismissAction@2867.perform$2");
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
            if (AnonymousClass0958.LIZIZ(2000L, this) == objLJFF) {
                C1C7U.LIZIZ("ListenToCashierDismissAction@2867.perform$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ListenToCashierDismissAction@2867.perform$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C1411490mpn c1411490mpn, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C322901Nb(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
