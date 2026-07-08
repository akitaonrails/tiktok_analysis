package X;

import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import kotlin.Unit;

/* JADX INFO: renamed from: X.17uX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21179917uX extends C09AY implements InterfaceC1685430txd<PopProductResp, String, Boolean, Boolean, ECommerceMessage, Boolean, Unit> {
    public final /* synthetic */ AbstractC21194217wq LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21179917uX(AbstractC21194217wq abstractC21194217wq) {
        super(6);
        this.LL = abstractC21194217wq;
    }

    @Override // X.InterfaceC1685430txd
    public final Unit invoke(PopProductResp popProductResp, String str, Boolean bool, Boolean bool2, ECommerceMessage eCommerceMessage, Boolean bool3) {
        boolean zBooleanValue = bool3.booleanValue();
        this.LL.LJJJJI(popProductResp, str, bool.booleanValue(), bool2.booleanValue(), eCommerceMessage, zBooleanValue, false);
        return Unit.LIZ;
    }
}
