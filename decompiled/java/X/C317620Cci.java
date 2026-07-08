package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cci, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.creation.component.AITheaterCameoControlComponent$refreshCameoInfo$1", f = "AITheaterCameoControlComponent.kt", l = {264}, m = "invokeSuspend")
public final class C317620Cci extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C549180LgK LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C317620Cci(C549180LgK c549180LgK, InterfaceC1364105Vn<? super C317620Cci> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c549180LgK;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C317620Cci(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC550750Lir interfaceC550750LirG9;
        Object objLJIILIIL;
        C1C7U.LIZ("AITheaterCameoControlComponent@4a33.refreshCameoInfo$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLJIILIIL = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            AITheaterProfileService aITheaterProfileServiceH2 = this.LLILLJJLI.H2();
            if (aITheaterProfileServiceH2 != null && (interfaceC550750LirG9 = aITheaterProfileServiceH2.g9()) != null) {
                String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
                LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.LLILLJJLI);
                this.LL = 1;
                objLJIILIIL = interfaceC550750LirG9.LJIILIIL(currentUserID, true, lifecycleScope, this);
                if (objLJIILIIL == objLJFF) {
                    C1C7U.LIZIZ("AITheaterCameoControlComponent@4a33.refreshCameoInfo$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AITheaterCameoControlComponent@4a33.refreshCameoInfo$1");
            return unit;
        }
        C189200o6.m1boximpl(objLJIILIIL);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AITheaterCameoControlComponent@4a33.refreshCameoInfo$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
