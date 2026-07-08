package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.shopbag.PublishAudienceEventData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01xh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.shoppingbag.list.DefaultShopBagList$publishEvent2LynxNew$1$params$1", f = "DefaultShopBagList.kt", l = {}, m = "invokeSuspend")
public final class C503501xh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ Object LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C503501xh(int i, Object obj, InterfaceC1364105Vn<? super C503501xh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = obj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C503501xh(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLIZLLL;
        C1C7U.LIZ("DefaultShopBagList@b462.publishEvent2LynxNew$1$params$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            strLIZLLL = C08JS.LIZLLL(new PublishAudienceEventData(this.LL, this.LLILLJJLI));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strLIZLLL = null;
        }
        C1C7U.LIZIZ("DefaultShopBagList@b462.publishEvent2LynxNew$1$params$1");
        return strLIZLLL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
