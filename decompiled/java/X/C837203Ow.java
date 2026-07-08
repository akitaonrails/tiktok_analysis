package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.03Ow, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C837203Ow extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C837203Ow(String str, boolean z) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        PaymentCacheHelper.LJII.put(this.LL, Boolean.valueOf(this.LLILLJJLI));
        return Unit.LIZ;
    }
}
