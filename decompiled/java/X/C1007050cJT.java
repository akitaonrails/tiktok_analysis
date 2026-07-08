package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.home.router.WalletIntermediateRoute;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cJT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.home.router.WalletIntermediateRoute$open$1", f = "WalletIntermediateRoute.kt", l = {57}, m = "invokeSuspend")
public final class C1007050cJT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Bundle LLILLJJLI;
    public final /* synthetic */ WalletIntermediateRoute LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ DialogC1389620mGW LLILZIL;
    public final /* synthetic */ Activity LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1007050cJT(Bundle bundle, WalletIntermediateRoute walletIntermediateRoute, Context context, DialogC1389620mGW dialogC1389620mGW, Activity activity, InterfaceC1364105Vn<? super C1007050cJT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bundle;
        this.LLILLL = walletIntermediateRoute;
        this.LLILZ = context;
        this.LLILZIL = dialogC1389620mGW;
        this.LLILZLL = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1007050cJT(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        C1C7U.LIZ("WalletIntermediateRoute@57e0.open$1");
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
            Bundle bundle = this.LLILLJJLI;
            if (bundle != null) {
                string = bundle.getString("token", null);
            } else {
                string = null;
            }
            Bundle bundle2 = this.LLILLJJLI;
            if (bundle2 != null) {
                string2 = bundle2.getString("host", "");
            } else {
                string2 = null;
            }
            Bundle bundle3 = this.LLILLJJLI;
            if (bundle3 != null) {
                string3 = bundle3.getString("pipo_enter_from", "");
            } else {
                string3 = null;
            }
            Bundle bundle4 = this.LLILLJJLI;
            if (bundle4 != null) {
                string4 = bundle4.getString("auth_type", null);
            } else {
                string4 = null;
            }
            Bundle bundle5 = this.LLILLJJLI;
            if (bundle5 != null) {
                string5 = bundle5.getString("merchant_id", null);
            } else {
                string5 = null;
            }
            C1005580cH6 getSchemaUseCase = this.LLILLL.getGetSchemaUseCase();
            this.LL = 1;
            getSchemaUseCase.getClass();
            obj = C1005580cH6.LIZ(getSchemaUseCase, string, string2, string3, string4, string5, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("WalletIntermediateRoute@57e0.open$1");
                return objLJFF;
            }
        }
        AbstractC989720brW abstractC989720brW = (AbstractC989720brW) obj;
        if (abstractC989720brW instanceof C989710brV) {
            SmartRouter.buildRoute(this.LLILZ, (String) ((C989710brV) abstractC989720brW).LIZIZ).open();
            C786410Ut5.LJIIJ(this.LLILZIL);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("WalletIntermediateRoute@57e0.open$1");
            return unit;
        }
        if (abstractC989720brW instanceof C991340bu8) {
            C786410Ut5.LJIIJ(this.LLILZIL);
            this.LLILLL.showErrorPopup(this.LLILZLL, ((C991340bu8) abstractC989720brW).LIZLLL);
        } else if (abstractC989720brW instanceof C989700brU) {
            C786410Ut5.LJIIJ(this.LLILZIL);
            this.LLILLL.showErrorPopup(this.LLILZLL, null);
        } else {
            throw new C1954807lC();
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("WalletIntermediateRoute@57e0.open$1");
        return unit2;
    }
}
