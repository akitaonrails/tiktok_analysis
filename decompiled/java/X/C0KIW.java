package X;

import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KIW, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KIW extends C09AY implements Function1<C0KGF, C0KGF> {
    public final /* synthetic */ SubscriptionProductDetailWithTemplateInfo LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KIW(SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo) {
        super(1);
        this.LL = subscriptionProductDetailWithTemplateInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0KGF invoke(C0KGF c0kgf) {
        return C0KGF.LIZ(c0kgf, null, null, null, this.LL, null, null, null, 495);
    }
}
