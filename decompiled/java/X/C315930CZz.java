package X;

import com.ss.android.ugc.aweme.model.effect.FailedReviewPageInitData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CZz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.failreview.FailedReviewViewModelRepo$findCorrespondingDraft$2$1", f = "FailedReviewViewModelRepo.kt", l = {}, m = "invokeSuspend")
public final class C315930CZz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends C315940Ca0>>, Object> {
    public final /* synthetic */ InterfaceC318260Cdk LL;
    public final /* synthetic */ C315860CZs LLILLJJLI;
    public final /* synthetic */ FailedReviewPageInitData LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315930CZz(InterfaceC318260Cdk interfaceC318260Cdk, C315860CZs c315860CZs, FailedReviewPageInitData failedReviewPageInitData, InterfaceC1364105Vn<? super C315930CZz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC318260Cdk;
        this.LLILLJJLI = c315860CZs;
        this.LLILLL = failedReviewPageInitData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C315930CZz(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006b A[PHI: r1
      0x006b: PHI (r1v5 java.lang.String) = (r1v3 java.lang.String), (r1v6 java.lang.String) binds: [B:21:0x0069, B:19:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "FailedReviewViewModelRepo@7b24.findCorrespondingDraft$2$1"
            X.C1C7U.LIZ(r6)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r8)
            X.0Cdk r1 = r7.LL
            X.0CZs r0 = r7.LLILLJJLI
            r0.getClass()
            android.app.Application r0 = X.C0CHQ.LIZ
            java.util.List r0 = r1.LJII(r0)
            com.ss.android.ugc.aweme.model.effect.FailedReviewPageInitData r5 = r7.LLILLL
            java.util.Iterator r2 = r0.iterator()
        L1e:
            boolean r0 = r2.hasNext()
            r4 = 0
            if (r0 == 0) goto L84
            java.lang.Object r3 = r2.next()
            r0 = r3
            com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo r0 = (com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo) r0
            java.lang.String r1 = r0.getEffectId()
            java.lang.String r0 = r5.effectId
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L1e
        L38:
            com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo r3 = (com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo) r3
            if (r3 == 0) goto L86
            java.lang.String r0 = r3.getDraftId()
            int r0 = r0.length()
            if (r0 == 0) goto L86
            X.0Cdk r0 = r7.LL
            org.json.JSONObject r1 = r0.LJIIL(r3)
            if (r1 == 0) goto L5c
            java.lang.String r0 = "AME_extra"
            org.json.JSONObject r1 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getJSONObject(r1, r0)
            if (r1 == 0) goto L5c
            java.lang.String r0 = "creation"
            org.json.JSONObject r4 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getJSONObject(r1, r0)
        L5c:
            java.lang.String r2 = ""
            if (r4 == 0) goto L68
            java.lang.String r0 = "ame_template_id"
            java.lang.String r1 = r4.optString(r0)
            if (r1 != 0) goto L6b
        L68:
            r1 = r2
            if (r4 == 0) goto L74
        L6b:
            java.lang.String r0 = "template_resource_id"
            java.lang.String r0 = r4.optString(r0)
            if (r0 == 0) goto L74
            r2 = r0
        L74:
            X.0Ca0 r0 = new X.0Ca0
            r0.<init>(r3, r1, r2)
            X.C189200o6.m2constructorimpl(r0)
            X.00o6 r0 = X.C189200o6.m1boximpl(r0)
            X.C1C7U.LIZIZ(r6)
            return r0
        L84:
            r3 = r4
            goto L38
        L86:
            X.0CZx r1 = new X.0CZx
            java.lang.String r0 = "cannot get corresponding draft."
            r1.<init>(r0)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            X.00o6 r0 = X.C189200o6.m1boximpl(r0)
            X.C1C7U.LIZIZ(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C315930CZz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends C315940Ca0>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
