package X;

import com.bytedance.android.livesdk.subscribe.model.RefundInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KHQ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KHQ extends C09AY implements Function1<C514770KGt, Unit> {
    public final /* synthetic */ C0KHB LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KHQ(C0KHB c0khb) {
        super(1);
        this.LL = c0khb;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C514770KGt c514770KGt) {
        RefundInfo refundInfo = c514770KGt.LJII;
        if (refundInfo != null && refundInfo.eligibleForExtensionRefund && refundInfo.showExtensionRefundInstructions) {
            C16F5 c16f5 = this.LL.LL;
            if (c16f5 != null) {
                C500260Jjc.LLFFF(c16f5);
            }
        } else {
            C16F5 c16f52 = this.LL.LL;
            if (c16f52 != null) {
                C500260Jjc.LJIILIIL(c16f52);
            }
        }
        return Unit.LIZ;
    }
}
