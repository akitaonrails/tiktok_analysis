package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0CrN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.common.utils.TakoEntranceHelper$showNewTakoCommonConditionWithFetch$4", f = "TakoEntranceHelper.kt", l = {222, 223}, m = "invokeSuspend")
public final class C326710CrN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C326710CrN(InterfaceC1364105Vn<? super C326710CrN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C326710CrN(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoEntranceHelper@18be.showNewTakoCommonConditionWithFetch$4");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoEntranceHelper@18be.showNewTakoCommonConditionWithFetch$4");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            long j = C1EE3.LIZ().initTaskDelay;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("TakoEntranceHelper@18be.showNewTakoCommonConditionWithFetch$4");
                return objLJFF;
            }
        }
        C14TF c14tf = C14TF.LIZIZ;
        this.LL = 2;
        if (c14tf.LJII(this) == objLJFF) {
            C1C7U.LIZIZ("TakoEntranceHelper@18be.showNewTakoCommonConditionWithFetch$4");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoEntranceHelper@18be.showNewTakoCommonConditionWithFetch$4");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C326710CrN(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
