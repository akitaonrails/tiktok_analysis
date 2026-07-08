package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.SkuManager;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04AY, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.SkuManager", f = "SkuManager.kt", l = {431}, m = "updateSkuSelectionState")
public final class C04AY extends AbstractC23140094w {
    public Function1 LL;
    public SkuItem LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ SkuManager LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04AY(SkuManager skuManager, InterfaceC1364105Vn<? super C04AY> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = skuManager;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkuManager@9073.updateSkuSelectionState$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objUo = this.LLILZ.uo(null, null, null, this);
        C1C7U.LIZIZ("SkuManager@9073.updateSkuSelectionState$1");
        return objUo;
    }
}
