package X;

import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import kotlin.jvm.functions.Function1;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: renamed from: X.0KBQ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KBQ extends C09AY implements Function1<SubscriptionProductDetailWithTemplateInfo, Boolean> {
    public C0KBQ() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo) {
        SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo2 = subscriptionProductDetailWithTemplateInfo;
        TemplateInfo templateInfo = subscriptionProductDetailWithTemplateInfo2.getTemplateInfo();
        boolean z = false;
        if (templateInfo != null && templateInfo.renewalPeriod > 1 && subscriptionProductDetailWithTemplateInfo2.getSubscriptionProductDetail() == null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
