package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03WZ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.repository.OrderSubmitRepository", f = "OrderSubmitRepository.kt", l = {173, 179}, m = "tryFetchBillInfo")
public final class C03WZ extends AbstractC23140094w {
    public BillInfoRequest LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Function1 LLILZ;
    public C259800zU LLILZIL;
    public C259800zU LLILZLL;
    public C259800zU LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public long LLJI;
    public /* synthetic */ Object LLJIJIL;
    public final /* synthetic */ C03WX LLJILJIL;
    public int LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03WZ(C03WX c03wx, InterfaceC1364105Vn<? super C03WZ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJILJIL = c03wx;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrderSubmitRepository@9af5.tryFetchBillInfo$1");
        this.LLJIJIL = obj;
        this.LLJILJILJ |= Integer.MIN_VALUE;
        Object objLJJJJZI = this.LLJILJIL.LJJJJZI(null, false, null, false, null, null, this);
        C1C7U.LIZIZ("OrderSubmitRepository@9af5.tryFetchBillInfo$1");
        return objLJJJJZI;
    }
}
