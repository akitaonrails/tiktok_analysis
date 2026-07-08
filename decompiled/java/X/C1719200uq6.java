package X;

import com.ss.android.ugc.aweme.component.verify.pin.set.PinConfirmViewModel;
import com.ss.android.ugc.aweme.foundation.network.PipoAccountApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uq6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.verify.pin.set.PinConfirmViewModel$getPublicKey$1$1", f = "PinConfirmViewModel.kt", l = {38}, m = "invokeSuspend")
public final class C1719200uq6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public PinConfirmViewModel LL;
    public int LLILLJJLI;
    public final /* synthetic */ PinConfirmViewModel LLILLL;
    public final /* synthetic */ PipoAccountApi LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1719200uq6(PinConfirmViewModel pinConfirmViewModel, PipoAccountApi pipoAccountApi, String str, InterfaceC1364105Vn<? super C1719200uq6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = pinConfirmViewModel;
        this.LLILZ = pipoAccountApi;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1719200uq6(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        PinConfirmViewModel pinConfirmViewModel;
        C1C7U.LIZ("PinConfirmViewModel@f79e.getPublicKey$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                pinConfirmViewModel = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            pinConfirmViewModel = this.LLILLL;
            C1719280uqE c1719280uqE = C1719280uqE.LIZ;
            PipoAccountApi pipoAccountApi = this.LLILZ;
            String str = this.LLILZIL;
            this.LL = pinConfirmViewModel;
            this.LLILLJJLI = 1;
            obj = c1719280uqE.LIZJ(pipoAccountApi, str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PinConfirmViewModel@f79e.getPublicKey$1$1");
                return objLJFF;
            }
        }
        pinConfirmViewModel.LL = (String) obj;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PinConfirmViewModel@f79e.getPublicKey$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
