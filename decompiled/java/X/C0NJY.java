package X;

import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NJY, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.reactive.UserCanceledReactiveAccountImpl$onReactiveAccountSuccess$1", f = "UserCanceledReactiveAccountImpl.kt", l = {155}, m = "invokeSuspend")
public final class C0NJY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IAccountUserService LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NJY(IAccountUserService iAccountUserService, InterfaceC1364105Vn<? super C0NJY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iAccountUserService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NJY(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UserCanceledReactiveAccountImpl@11f3.onReactiveAccountSuccess$1");
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
            if (AnonymousClass0958.LIZIZ(Mp4ScreenVideoLoadTimeout.CONTROL, this) == objLJFF) {
                C1C7U.LIZIZ("UserCanceledReactiveAccountImpl@11f3.onReactiveAccountSuccess$1");
                return objLJFF;
            }
        }
        IAccountUserService iAccountUserService = this.LLILLJJLI;
        if (iAccountUserService != null) {
            iAccountUserService.LJI();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UserCanceledReactiveAccountImpl@11f3.onReactiveAccountSuccess$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
