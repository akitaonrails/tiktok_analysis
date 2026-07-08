package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.03ya, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.opt.PdpTaskManager$Companion$preLoad$1", f = "PdpTaskManager.kt", l = {}, m = "invokeSuspend")
public final class C1018603ya extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1018603ya(InterfaceC1364105Vn<? super C1018603ya> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1018603ya(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PdpTaskManager$Companion@4b52.preLoad$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AnonymousClass0408.LIZ.getClass();
        AnonymousClass0408.LJIIIIZZ().contains("tts.product_detail");
        ((Keva) AnonymousClass0408.LJ.getValue()).contains("enable_page_template_mock");
        ConcurrentHashMap<Class<? extends Object>, C938403le> concurrentHashMap = C03M5.LIZ;
        PdpViewModel.z = Integer.valueOf(C497820Jfg.LIZJ(C786410Ut5.M3(C7879035x.LIZ())));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpTaskManager$Companion@4b52.preLoad$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1018603ya(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
