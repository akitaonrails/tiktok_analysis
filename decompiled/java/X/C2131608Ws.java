package X;

import com.ss.android.ugc.aweme.ecommerce.loadretreat.EcomLoadRetreatConfigPageLife;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.08Ws, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.preloader.dispatch.ECPreloadDispatcher$setLoadRetreatModel$1", f = "ECPreloadDispatcher.kt", l = {}, m = "invokeSuspend")
public final class C2131608Ws extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EcomLoadRetreatConfigPageLife LL;
    public final /* synthetic */ C2132108Wx LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2131608Ws(EcomLoadRetreatConfigPageLife ecomLoadRetreatConfigPageLife, C2132108Wx c2132108Wx, InterfaceC1364105Vn<? super C2131608Ws> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = ecomLoadRetreatConfigPageLife;
        this.LLILLJJLI = c2132108Wx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2131608Ws(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("ECPreloadDispatcher@99f6.setLoadRetreatModel$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL == null) {
            C2132108Wx c2132108Wx = this.LLILLJJLI;
            for (AbstractC2132008Ww abstractC2132008Ww : c2132108Wx.LIZLLL) {
                if (c2132108Wx.LIZ.contains(abstractC2132008Ww)) {
                    C2132108Wx.LIZ(abstractC2132008Ww);
                }
            }
            this.LLILLJJLI.LIZLLL.clear();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECPreloadDispatcher@99f6.setLoadRetreatModel$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
