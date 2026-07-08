package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.044w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.PdpRefreshRepository$operator$1", f = "PdpRefreshRepository.kt", l = {98}, m = "refreshPdpInfo")
public final class C10400044w extends AbstractC23140094w {
    public Function2 LL;
    public SkuItem LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C10399044v LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10400044w(C10399044v c10399044v, InterfaceC1364105Vn<? super C10400044w> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c10399044v;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PdpRefreshRepository@da9a.operator$1$refreshPdpInfo$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJLZ = this.LLILZIL.LJLZ(null, null, this);
        C1C7U.LIZIZ("PdpRefreshRepository@da9a.operator$1$refreshPdpInfo$1");
        return objLJLZ;
    }
}
