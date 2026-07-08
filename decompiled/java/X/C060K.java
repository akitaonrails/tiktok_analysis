package X;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.060K, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.TakoServiceImpl$onTakoShareNetworkUnavailable$1$1", f = "TakoServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C060K extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DialogC1389620mGW LL;
    public final /* synthetic */ Activity LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C060K(DialogC1389620mGW dialogC1389620mGW, Activity activity, InterfaceC1364105Vn<? super C060K> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = dialogC1389620mGW;
        this.LLILLJJLI = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C060K(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        View decorView;
        C1C7U.LIZ("TakoServiceImpl@d56d.onTakoShareNetworkUnavailable$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C786410Ut5.LJIIJ(this.LL);
        Window window = this.LLILLJJLI.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            C0DQF.LJ(decorView, this.LLILLJJLI.getString(2131829222), null, null, true, 12);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TakoServiceImpl@d56d.onTakoShareNetworkUnavailable$1$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoServiceImpl@d56d.onTakoShareNetworkUnavailable$1$1");
        return unit2;
    }
}
