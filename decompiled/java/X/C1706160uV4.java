package X;

import java.util.List;

/* JADX INFO: renamed from: X.0uV4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1706160uV4 extends AbstractC1705800uUU<List<? extends C1706180uV6>> {
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    @Override // X.AbstractC1705800uUU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<? extends X.C1706180uV6> LJ(com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r11) {
        /*
            r10 = this;
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.List r0 = r11.getCategory_responses()
            java.util.Iterator r9 = r0.iterator()
        Ld:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L9b
            java.lang.Object r8 = r9.next()
            com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse r8 = (com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse) r8
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r0 = r8.getTotal_effects()
            java.util.Iterator r7 = r0.iterator()
        L26:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r1 = r7.next()
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r1
            X.0uVC r6 = new X.0uVC
            com.ss.android.ugc.effectmanager.common.model.UrlModel r0 = r1.getIcon_url()
            java.util.List r0 = r0.getUrlList()
            java.lang.String r3 = X.AbstractC1705830uUX.LIZIZ(r0)
            java.lang.String r2 = r1.getName()
            java.lang.String r1 = r1.getExtra()
            java.lang.String r0 = "effect_key"
            java.lang.String r0 = X.AbstractC1705830uUX.LIZLLL(r10, r1, r0)
            r6.<init>(r3, r2, r0)
            r4.add(r6)
            goto L26
        L55:
            java.lang.String r3 = r8.getName()
            java.lang.String r2 = r8.getExtra()
            java.lang.String r1 = "enable_detailed_cell"
            if (r2 == 0) goto L7f
            int r0 = r2.length()
            if (r0 != 0) goto L6b
            r0 = 1
        L68:
            if (r0 != 0) goto L7f
            goto L6d
        L6b:
            r0 = 0
            goto L68
        L6d:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L7b
            r0.<init>(r2)     // Catch: java.lang.Exception -> L7b
            int r0 = r0.optInt(r1)     // Catch: java.lang.Exception -> L7b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L7b
            goto L80
        L7b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L7f:
            r0 = 0
        L80:
            X.0uV5 r2 = X.EnumC1706170uV5.DETAIL
            int r1 = r2.getMark()
            if (r0 == 0) goto L98
            int r0 = r0.intValue()
            if (r0 != r1) goto L98
        L8e:
            X.0uV6 r0 = new X.0uV6
            r0.<init>(r3, r2, r4)
            r5.add(r0)
            goto Ld
        L98:
            X.0uV5 r2 = X.EnumC1706170uV5.NORMAL
            goto L8e
        L9b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1706160uV4.LJ(com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse):java.lang.Object");
    }
}
