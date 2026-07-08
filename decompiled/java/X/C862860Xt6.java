package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xt6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.android.livesdk.viewerwishestmp.settings.presenter.ViewerWishesSettingsPresenter$requestSettingListRecursive$1", f = "ViewerWishesSettingsPresenter.kt", l = {221}, m = "invokeSuspend")
public final class C862860Xt6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C1AI9 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862860Xt6(int i, C1AI9 c1ai9, InterfaceC1364105Vn<? super C862860Xt6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = c1ai9;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C862860Xt6(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ViewerWishesSettingsPresenter@547f.requestSettingListRecursive$1");
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
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("ViewerWishesSettingsPresenter@547f.requestSettingListRecursive$1");
                return objLJFF;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestSettingListRecursive, retryCount = ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", Thread = ");
        sbLIZ.append(C786410Ut5.u3());
        C20441214yg.LIZIZ("ViewerWishesSettingPresenter", C2188811AlT.LIZIZ(sbLIZ));
        final C1AI9 c1ai9 = this.LLILLL;
        c1ai9.LJIIL(new InterfaceC1135130fe3() { // from class: X.1AIR
            @Override // X.InterfaceC1135130fe3
            public final void onSuccess() {
                boolean zLIZJ = c1ai9.LIZJ();
                c1ai9.LIZ.wG();
                c1ai9.LIZ.KM(zLIZJ);
                C1AI9.LJIIIIZZ(c1ai9, false, false, 7);
                if (zLIZJ) {
                    return;
                }
                c1ai9.LJIIJ();
            }

            @Override // X.InterfaceC1135130fe3
            public final void onFailed(int i2) {
                c1ai9.LIZ.wG();
                c1ai9.LIZ.HO();
                c1ai9.LIZ.KM(false);
            }
        }, this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ViewerWishesSettingsPresenter@547f.requestSettingListRecursive$1");
        return unit;
    }
}
