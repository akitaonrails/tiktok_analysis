package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAssem;
import com.ss.android.ugc.aweme.ecommerce.mall.vm.ShopIconServiceImpl;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0w7o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.vm.ShopIconServiceImpl$tryRequestReachCfg$2", f = "ShopIconServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C1768620w7o extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ShopIconServiceImpl LL;
    public final /* synthetic */ EnumC1768950w8L LLILLJJLI;
    public final /* synthetic */ C1768850w8B LLILLL;
    public final /* synthetic */ Map<String, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1768620w7o(ShopIconServiceImpl shopIconServiceImpl, EnumC1768950w8L enumC1768950w8L, C1768850w8B c1768850w8B, Map map, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = shopIconServiceImpl;
        this.LLILLJJLI = enumC1768950w8L;
        this.LLILLL = c1768850w8B;
        this.LLILZ = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1768620w7o(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        LifecycleRegistry lifecycle;
        Lifecycle.State currentState;
        CustomDotAssem customDotAssem;
        C1C7U.LIZ("ShopIconServiceImpl@ef90.tryRequestReachCfg$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CustomDotAssem customDotAssem2 = this.LL.LIZ;
        if (customDotAssem2 != null && (lifecycle = customDotAssem2.getLifecycle()) != null && (currentState = lifecycle.getCurrentState()) != null && currentState.isAtLeast(Lifecycle.State.CREATED) && (customDotAssem = this.LL.LIZ) != null) {
            customDotAssem.Pv(this.LLILLJJLI, this.LLILLL, this.LLILZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopIconServiceImpl@ef90.tryRequestReachCfg$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
