package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ChunkConfig;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03WS, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.starter.OrderSubmitStarter$genRepoIdAndQueryBillInfo$1", f = "OrderSubmitStarter.kt", l = {}, m = "invokeSuspend")
public final class C03WS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C03WX LLILLJJLI;
    public final /* synthetic */ C259800zU<BillInfoRequest> LLILLL;
    public final /* synthetic */ HashMap<String, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03WS(C03WX c03wx, C259800zU<BillInfoRequest> c259800zU, HashMap<String, Object> map, InterfaceC1364105Vn<? super C03WS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c03wx;
        this.LLILLL = c259800zU;
        this.LLILZ = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C03WS c03ws = new C03WS(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c03ws.LL = obj;
        return c03ws;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("OrderSubmitStarter@3acc.genRepoIdAndQueryBillInfo$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        C01GW c01gw = C03WV.LIZ;
        if (((Keva) c01gw.getValue()).contains("enable_osp_chunk")) {
            z = ((Keva) c01gw.getValue()).getBoolean("enable_osp_chunk", false);
        } else {
            z = ((ChunkConfig) C03WW.LIZIZ.getValue()).enable;
        }
        if (z) {
            C03WX c03wx = this.LLILLJJLI;
            c03wx.LJIIIIZZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C03WT(c03wx, this.LLILLL, this.LLILZ, null), 3);
        } else {
            C03WX c03wx2 = this.LLILLJJLI;
            c03wx2.LJII = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C03WU(c03wx2, this.LLILLL, this.LLILZ, null), 3);
        }
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C202091145p(null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OrderSubmitStarter@3acc.genRepoIdAndQueryBillInfo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
