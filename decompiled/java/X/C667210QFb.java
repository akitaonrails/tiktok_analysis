package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0QFb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAssem$tryToDoSearchPreload$1", f = "CustomDotAssem.kt", l = {}, m = "invokeSuspend")
public final class C667210QFb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C667210QFb(String str, InterfaceC1364105Vn<? super C667210QFb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C667210QFb(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("CustomDotAssem@3d76.tryToDoSearchPreload$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            String strLIZIZ = C1942307jB.LIZIZ(UriProtector.parse(this.LL), "landing_deeplink");
            if (strLIZIZ != null) {
                Uri uri = UriProtector.parse(strLIZIZ);
                if (((IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class)).LJIL(uri) && (C13LP.LJJJJ(C1942307jB.LIZIZ(uri, "enter_method"), (List) C1131304bf.LIZIZ.getValue()) || Intrinsics.LJFF(C1942307jB.LIZIZ(uri, "do_preload_when_show"), "1"))) {
                    ((IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class)).LJJJJI(strLIZIZ, EnumC667200QFa.TASK.getValue(), true);
                }
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CustomDotAssem@3d76.tryToDoSearchPreload$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
