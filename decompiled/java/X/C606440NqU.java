package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NqU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.preload.ShopMixMallDataPreload$Companion$sendMallRequestResult$1", f = "ShopMixMallDataPreload.kt", l = {}, m = "invokeSuspend")
public final class C606440NqU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1771590wCb LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C606440NqU(C1771590wCb c1771590wCb, int i, String str, long j, InterfaceC1364105Vn<? super C606440NqU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1771590wCb;
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C606440NqU(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShopMixMallDataPreload$Companion@47ad.sendMallRequestResult$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C1771980wDE.LJII(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, false, "", "", "", "");
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopMixMallDataPreload$Companion@47ad.sendMallRequestResult$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
