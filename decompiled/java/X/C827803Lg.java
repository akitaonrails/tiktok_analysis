package X;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import njp.a;

/* JADX INFO: renamed from: X.03Lg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.utils.USVirtualManager$showInvalidVirtualProductInfoDialog$1", f = "USVirtualManager.kt", l = {}, m = "invokeSuspend")
public final class C827803Lg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C828603Lo LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C827803Lg(C828603Lo c828603Lo, InterfaceC1364105Vn<? super C827803Lg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c828603Lo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C827803Lg(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IECommerceHostService iECommerceHostService;
        C928103jz c928103jzLIZJ;
        Context context;
        Activity activityLIZ;
        boolean z;
        String name;
        C1C7U.LIZ("USVirtualManager@122d.showInvalidVirtualProductInfoDialog$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        InterfaceC911603hK rootPageMonitor = ((IApplicationDependencyService) iECommerceHostService).getRootPageMonitor();
        if (rootPageMonitor != null && (c928103jzLIZJ = rootPageMonitor.LIZJ()) != null && (context = c928103jzLIZJ.LIZ) != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            C828603Lo c828603Lo = this.LL;
            C1397580mTM c1397580mTM = new C1397580mTM(activityLIZ);
            c1397580mTM.LJII = false;
            c1397580mTM.LJFF(2131833157);
            c1397580mTM.LIZ(2131833156);
            C985403tE.LIZ(c1397580mTM, AFwS228S0000000_1.get$arr$(903));
            C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
            c828603Lo.LIZJ = c1397510mTF;
            c1397510mTF.LIZLLL();
            C03O0.LJJLIIIJILLIZJL(C03O0.LIZ, "client", null, null, C2097608Jq.LJI(new Pair("popup_order_placement", "payment_timeout")), null, false, 54);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("USVirtualManager@122d.showInvalidVirtualProductInfoDialog$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
