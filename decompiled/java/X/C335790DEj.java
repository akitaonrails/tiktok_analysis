package X;

import com.ss.android.ugc.aweme.ad.ecp.model.ShopifyEcpCheckout;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0DEj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ecp.handlers.EcReadyHandler$EcReadyOnSubscribe$subscribe$1", f = "EcReadyHandler.kt", l = {BaseNotice.CREATOR, 70}, m = "invokeSuspend")
public final class C335790DEj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C335810DEl LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C335790DEj(C335810DEl c335810DEl, InterfaceC1364105Vn<? super C335790DEj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c335810DEl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C335790DEj(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("EcReadyHandler$EcReadyOnSubscribe@c425.subscribe$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EcReadyHandler$EcReadyOnSubscribe@c425.subscribe$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C334270D8n c334270D8n = C334270D8n.LIZ;
            C335810DEl c335810DEl = this.LLILLJJLI;
            String str = c335810DEl.LLILLL.LIZ;
            ShopifyEcpCheckout shopifyEcpCheckout = c335810DEl.LLILLJJLI;
            this.LL = 1;
            obj = c334270D8n.LIZ(str, shopifyEcpCheckout, null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EcReadyHandler$EcReadyOnSubscribe@c425.subscribe$1");
                return objLJFF;
            }
        }
        C335810DEl c335810DEl2 = this.LLILLJJLI;
        C335870DEr c335870DErLIZIZ = C335780DEi.LIZIZ(c335810DEl2.LL.LJ, C335740DEe.LIZ(c335810DEl2.LLILLL, (C334300D8q) obj));
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C335800DEk c335800DEk = new C335800DEk(this.LLILLJJLI, c335870DErLIZIZ, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c335800DEk) == objLJFF) {
            C1C7U.LIZIZ("EcReadyHandler$EcReadyOnSubscribe@c425.subscribe$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EcReadyHandler$EcReadyOnSubscribe@c425.subscribe$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
