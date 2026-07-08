package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.ui.SubUpdowngradePackageFragment;
import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KE6, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KE6 extends C09AY implements Function1<SubscriptionProductDetailWithTemplateInfo, Boolean> {
    public final /* synthetic */ SubUpdowngradePackageFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KE6(SubUpdowngradePackageFragment subUpdowngradePackageFragment) {
        super(1);
        this.LL = subUpdowngradePackageFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke(com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo r4) {
        /*
            r3 = this;
            com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo r4 = (com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo) r4
            webcast.api.sub.TemplateInfo r0 = r4.getTemplateInfo()
            r2 = 1
            if (r0 == 0) goto L28
            boolean r0 = r0.shouldDisplay
            if (r0 != r2) goto L28
            webcast.api.sub.TemplateInfo r0 = r4.getTemplateInfo()
            if (r0 == 0) goto L26
            java.lang.String r1 = r0.packageId
        L15:
            com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.ui.SubUpdowngradePackageFragment r0 = r3.LL
            X.0KCF r0 = r0.LLILZ
            java.lang.String r0 = r0.LJIL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L28
        L21:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L26:
            r1 = 0
            goto L15
        L28:
            r2 = 0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KE6.invoke(java.lang.Object):java.lang.Object");
    }
}
