package X;

import com.ss.android.ugc.aweme.ecommerce.ug.pitaya.manager.EcUgPitayaManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.057s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.pitaya.manager.EcUgPitayaManager$initPitayaAfterUserTrigger$1", f = "EcUgPitayaManager.kt", l = {125}, m = "invokeSuspend")
public final class C13022057s extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C13022057s(InterfaceC1364105Vn<? super C13022057s> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C13022057s(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcUgPitayaManager@a4f0.initPitayaAfterUserTrigger$1");
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
            long jIntValue = ((long) ((Number) C13023057t.LIZ.getValue()).intValue()) * 1000;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jIntValue, this) == objLJFF) {
                C1C7U.LIZIZ("EcUgPitayaManager@a4f0.initPitayaAfterUserTrigger$1");
                return objLJFF;
            }
        }
        EcUgPitayaManager.INSTANCE.tryInitPitayaSdk();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcUgPitayaManager@a4f0.initPitayaAfterUserTrigger$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C13022057s(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
