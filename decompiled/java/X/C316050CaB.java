package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CaB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.draft.EffectDraftDetailModel$loadDraft$1$cardDataList$1$1", f = "EffectDraftDetailModel.kt", l = {}, m = "invokeSuspend")
public final class C316050CaB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C316060CaC>, Object> {
    public final /* synthetic */ C316080CaE LL;
    public final /* synthetic */ C316060CaC LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C316050CaB(C316080CaE c316080CaE, C316060CaC c316060CaC, InterfaceC1364105Vn<? super C316050CaB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c316080CaE;
        this.LLILLJJLI = c316060CaC;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C316050CaB(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042 A[Catch: JSONException -> 0x0051, PHI: r1
      0x0042: PHI (r1v3 java.lang.String) = (r1v1 java.lang.String), (r1v4 java.lang.String) binds: [B:17:0x0040, B:15:0x003d] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {JSONException -> 0x0051, blocks: (B:3:0x0012, B:5:0x0018, B:7:0x0020, B:9:0x0028, B:10:0x002e, B:14:0x0037, B:18:0x0042, B:21:0x004b), top: B:26:0x0012 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "EffectDraftDetailModel@a1ea.loadDraft$1$cardDataList$1$1"
            X.C1C7U.LIZ(r6)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r8)
            X.0CaE r0 = r7.LL
            X.0CaC r5 = r7.LLILLJJLI
            r0.getClass()
            X.0Cdk r1 = X.C316080CaE.LIZ()     // Catch: org.json.JSONException -> L51
            if (r1 == 0) goto L31
            com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo r0 = r5.LL     // Catch: org.json.JSONException -> L51
            org.json.JSONObject r1 = r1.LJIIL(r0)     // Catch: org.json.JSONException -> L51
            if (r1 == 0) goto L31
            java.lang.String r0 = "AME_extra"
            org.json.JSONObject r1 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getJSONObject(r1, r0)     // Catch: org.json.JSONException -> L51
            if (r1 == 0) goto L31
            java.lang.String r0 = "creation"
            org.json.JSONObject r4 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getJSONObject(r1, r0)     // Catch: org.json.JSONException -> L51
        L2e:
            X.0CaD r3 = new X.0CaD     // Catch: org.json.JSONException -> L51
            goto L33
        L31:
            r4 = 0
            goto L2e
        L33:
            java.lang.String r2 = ""
            if (r4 == 0) goto L3f
            java.lang.String r0 = "ame_template_id"
            java.lang.String r1 = r4.optString(r0)     // Catch: org.json.JSONException -> L51
            if (r1 != 0) goto L42
        L3f:
            r1 = r2
            if (r4 == 0) goto L4b
        L42:
            java.lang.String r0 = "template_resource_id"
            java.lang.String r0 = r4.optString(r0)     // Catch: org.json.JSONException -> L51
            if (r0 == 0) goto L4b
            r2 = r0
        L4b:
            r3.<init>(r1, r2)     // Catch: org.json.JSONException -> L51
            r5.LLILLL = r3     // Catch: org.json.JSONException -> L51
            goto L55
        L51:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L55:
            X.C1C7U.LIZIZ(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C316050CaB.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C316060CaC> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
