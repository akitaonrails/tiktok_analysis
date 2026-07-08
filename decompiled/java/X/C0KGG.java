package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.assem.SubPackageMultiMonthAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KGG, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KGG extends C09AY implements Function1<C514600KGc, Unit> {
    public final /* synthetic */ SubPackageMultiMonthAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KGG(SubPackageMultiMonthAssem subPackageMultiMonthAssem) {
        super(1);
        this.LL = subPackageMultiMonthAssem;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b3 A[PHI: r5
      0x00b3: PHI (r5v1 java.lang.Integer) = (r5v0 java.lang.Integer), (r5v3 java.lang.Integer) binds: [B:49:0x00b0, B:30:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(X.C514600KGc r13) {
        /*
            r12 = this;
            X.0KGc r13 = (X.C514600KGc) r13
            X.0KRp r4 = X.C1826730xdX.LIZJ()
            r3 = 0
            r2 = 0
            if (r4 == 0) goto L5d
            com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.assem.SubPackageMultiMonthAssem r0 = r12.LL
            int r7 = r0.hashCode()
            r8 = 1
            if (r13 == 0) goto L23
            X.0KJh r0 = r13.LIZJ
            if (r0 == 0) goto L23
            int r0 = r0.LIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r9 = r0.toString()
            if (r9 != 0) goto L25
        L23:
            java.lang.String r9 = ""
        L25:
            kotlin.Pair[] r6 = new kotlin.Pair[r8]
            if (r13 == 0) goto Lb7
            X.0KJh r0 = r13.LIZJ
            if (r0 == 0) goto Lb7
            int r0 = r0.LIZIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r5 = r0.toString()
        L37:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "detail_error_code"
            r1.<init>(r0, r5)
            r6[r3] = r1
            java.util.Map r10 = X.C2097608Jq.LJIIJ(r6)
            com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.assem.SubPackageMultiMonthAssem r0 = r12.LL
            X.0KCq r0 = r0.ip()
            if (r0 == 0) goto L53
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.LLILZIL
            if (r0 == 0) goto L53
            r10.putAll(r0)
        L53:
            r11 = 8
            X.0KRg r6 = new X.0KRg
            r6.<init>(r7, r8, r9, r10, r11)
            r4.LJI(r6)
        L5d:
            com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.assem.SubPackageMultiMonthAssem r0 = r12.LL
            X.0KCo r0 = r0.hp()
            if (r0 == 0) goto Lb5
            java.lang.String r6 = r0.LJI
        L67:
            if (r13 == 0) goto Laf
            X.0KJh r0 = r13.LIZJ
            if (r0 == 0) goto Laf
            int r0 = r0.LIZ
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L73:
            X.0KJh r0 = r13.LIZJ
            if (r0 == 0) goto Lb3
            int r0 = r0.LIZIZ
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L7d:
            com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.assem.SubPackageMultiMonthAssem r0 = r12.LL
            X.0KCq r0 = r0.ip()
            if (r0 == 0) goto Lad
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.LLILZIL
        L87:
            if (r13 == 0) goto La7
            java.util.Map<java.lang.String, java.util.List<com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo>> r0 = r13.LIZ
            if (r0 == 0) goto La7
            java.util.Collection r0 = r0.values()
            if (r0 == 0) goto La7
            java.lang.Object r0 = X.C13LP.LJJJLIIL(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto La7
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r3, r0)
            com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo r0 = (com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo) r0
            if (r0 == 0) goto La7
            webcast.api.sub.TemplateInfo r2 = r0.getTemplateInfo()
        La7:
            X.C0KDR.LJFF(r6, r5, r4, r1, r2)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Lad:
            r1 = r2
            goto L87
        Laf:
            r5 = r2
            if (r13 == 0) goto Lb3
            goto L73
        Lb3:
            r4 = r2
            goto L7d
        Lb5:
            r6 = r2
            goto L67
        Lb7:
            r5 = r2
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KGG.invoke(java.lang.Object):java.lang.Object");
    }
}
