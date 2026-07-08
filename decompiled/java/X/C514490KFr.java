package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.ui.SubPackageMultiMonthFragment;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KFr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C514490KFr extends C09AY implements Function1<String, Boolean> {
    public final /* synthetic */ C514770KGt LL;
    public final /* synthetic */ SubPackageMultiMonthFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C514490KFr(C514770KGt c514770KGt, SubPackageMultiMonthFragment subPackageMultiMonthFragment) {
        super(1);
        this.LL = c514770KGt;
        this.LLILLJJLI = subPackageMultiMonthFragment;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000b  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r5 = (java.lang.String) r5
            int r0 = r5.hashCode()
            r1 = 0
            r3 = 1
            switch(r0) {
                case -1806105978: goto L11;
                case -847605649: goto L3b;
                case -847605648: goto L48;
                case -770769740: goto L55;
                case -750090523: goto L62;
                case -679263376: goto L77;
                case 410223322: goto L8a;
                default: goto Lb;
            }
        Lb:
            r1 = 1
        Lc:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L11:
            java.lang.String r0 = "item_package_migration_alert"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Lb
            X.0KGt r0 = r4.LL
            com.bytedance.android.livesdk.chatroom.api.UpdateTips r0 = r0.LJIIJJI
            if (r0 == 0) goto L2a
            java.lang.String r0 = r0.desc
            if (r0 == 0) goto L2a
            int r0 = r0.length()
            if (r0 <= 0) goto L2a
            goto Lb
        L2a:
            X.0KGt r0 = r4.LL
            com.bytedance.android.livesdk.chatroom.api.UpdateTips r0 = r0.LJIIJJI
            if (r0 == 0) goto Lc
            java.lang.String r0 = r0.btnText
            if (r0 == 0) goto Lc
            int r0 = r0.length()
            if (r0 <= 0) goto Lc
            goto Lb
        L3b:
            java.lang.String r0 = "item_package_renew_describe1"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Lb
            X.0KGt r0 = r4.LL
            boolean r1 = r0.LIZJ
            goto Lc
        L48:
            java.lang.String r0 = "item_package_renew_describe2"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Lb
            X.0KGt r0 = r4.LL
            boolean r1 = r0.LIZIZ
            goto Lc
        L55:
            java.lang.String r0 = "item_package_offer_description"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Lb
            X.0KGt r0 = r4.LL
            boolean r1 = r0.LJ
            goto Lc
        L62:
            java.lang.String r0 = "item_package_renew_describe_eu_region_only"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Lb
            com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.ui.SubPackageMultiMonthFragment r0 = r4.LLILLJJLI
            boolean r0 = r0.LLJJIJI
            if (r0 == 0) goto Lc
            X.0KGt r0 = r4.LL
            boolean r0 = r0.LIZIZ
            if (r0 == 0) goto Lc
            goto Lb
        L77:
            java.lang.String r0 = "item_package_refund_info"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Lb
            X.0KGt r0 = r4.LL
            com.bytedance.android.livesdk.subscribe.model.RefundInfo r0 = r0.LJII
            if (r0 == 0) goto Lc
            boolean r0 = r0.showExtensionRefundInstructions
            if (r0 != r3) goto Lc
            goto Lb
        L8a:
            java.lang.String r0 = "item_package_refund_alert"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Lb
            X.0KGt r0 = r4.LL
            com.bytedance.android.livesdk.subscribe.model.RefundInfo r2 = r0.LJII
            if (r2 == 0) goto Lc
            boolean r0 = r2.eligibleForExtensionRefund
            if (r0 != r3) goto Lc
            boolean r0 = r2.showExtensionRefundInstructions
            if (r0 != r3) goto Lc
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C514490KFr.invoke(java.lang.Object):java.lang.Object");
    }
}
