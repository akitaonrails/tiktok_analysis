package X;

/* JADX INFO: renamed from: X.0eXM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1092540eXM {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(com.bytedance.android.livesdk.livesetting.level.GuidanceConfig r13, com.bytedance.android.livesdk.model.message.EntranceGuidanceContainer r14) {
        /*
            java.lang.String r3 = "?"
            java.lang.String r6 = ""
            if (r13 == 0) goto L12
            com.bytedance.android.livesdk.livesetting.level.DisplayConfiguration r0 = r13.displayConfiguration     // Catch: java.lang.Exception -> Lb9
            if (r0 == 0) goto L12
            com.bytedance.android.livesdk.livesetting.level.InteractionConfiguration r0 = r0.interactionConfiguration     // Catch: java.lang.Exception -> Lb9
            if (r0 == 0) goto L12
            java.lang.String r2 = r0.schema     // Catch: java.lang.Exception -> Lb9
            if (r2 != 0) goto L13
        L12:
            r2 = r6
        L13:
            if (r14 == 0) goto L19
            java.util.Map<java.lang.String, java.lang.String> r5 = r14.extra     // Catch: java.lang.Exception -> Lb9
            if (r5 != 0) goto L1e
        L19:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> Lb9
            r5.<init>()     // Catch: java.lang.Exception -> Lb9
        L1e:
            if (r13 == 0) goto L2c
            com.bytedance.android.livesdk.livesetting.level.DisplayConfiguration r0 = r13.displayConfiguration     // Catch: java.lang.Exception -> Lb9
            if (r0 == 0) goto L2c
            com.bytedance.android.livesdk.livesetting.level.InteractionConfiguration r0 = r0.interactionConfiguration     // Catch: java.lang.Exception -> Lb9
            if (r0 == 0) goto L2c
            java.util.Map<java.lang.String, java.lang.String> r4 = r0.eventParams     // Catch: java.lang.Exception -> Lb9
            if (r4 != 0) goto L31
        L2c:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> Lb9
            r4.<init>()     // Catch: java.lang.Exception -> Lb9
        L31:
            if (r13 == 0) goto L3f
            com.bytedance.android.livesdk.livesetting.level.DisplayConfiguration r0 = r13.displayConfiguration     // Catch: java.lang.Exception -> Lb9
            if (r0 == 0) goto L3f
            com.bytedance.android.livesdk.livesetting.level.InteractionConfiguration r0 = r0.interactionConfiguration     // Catch: java.lang.Exception -> Lb9
            if (r0 == 0) goto L3f
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.params     // Catch: java.lang.Exception -> Lb9
            if (r0 != 0) goto L44
        L3f:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> Lb9
            r0.<init>()     // Catch: java.lang.Exception -> Lb9
        L44:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> Lb9
            r1.<init>()     // Catch: java.lang.Exception -> Lb9
            r1.putAll(r5)     // Catch: java.lang.Exception -> Lb9
            r1.putAll(r4)     // Catch: java.lang.Exception -> Lb9
            r1.putAll(r0)     // Catch: java.lang.Exception -> Lb9
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Exception -> Lb9
            if (r0 == 0) goto L59
            return r2
        L59:
            java.util.Set r0 = r1.entrySet()     // Catch: java.lang.Exception -> Lb9
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lb9
            r7.<init>()     // Catch: java.lang.Exception -> Lb9
            java.util.Iterator r4 = r0.iterator()     // Catch: java.lang.Exception -> Lb9
        L66:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Exception -> Lb9
            if (r0 == 0) goto L85
            java.lang.Object r1 = r4.next()     // Catch: java.lang.Exception -> Lb9
            r0 = r1
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Exception -> Lb9
            java.lang.Object r0 = r0.getKey()     // Catch: java.lang.Exception -> Lb9
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch: java.lang.Exception -> Lb9
            boolean r0 = kotlin.text.a0.LJJJIL(r0)     // Catch: java.lang.Exception -> Lb9
            r0 = r0 ^ 1
            if (r0 == 0) goto L66
            r7.add(r1)     // Catch: java.lang.Exception -> Lb9
            goto L66
        L85:
            java.lang.String r8 = "&"
            r9 = 0
            r11 = 0
            r0 = 265(0x109, float:3.71E-43)
            kotlin.jvm.internal.AFwS254S0000000_17 r13 = kotlin.jvm.internal.AFwS254S0000000_17.get$arr$(r0)     // Catch: java.lang.Exception -> Lb9
            r14 = 30
            r10 = r9
            r12 = r9
            java.lang.String r1 = X.C13LP.LJJLIIIJ(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Exception -> Lb9
            boolean r0 = kotlin.text.a0.LJJIIZI(r2, r3, r11)     // Catch: java.lang.Exception -> Lb9
            if (r0 == 0) goto L9f
            java.lang.String r3 = "&"
        L9f:
            boolean r0 = kotlin.text.a0.LJJJIL(r1)     // Catch: java.lang.Exception -> Lb9
            r0 = r0 ^ 1
            if (r0 == 0) goto Lb8
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> Lb9
            r0.append(r2)     // Catch: java.lang.Exception -> Lb9
            r0.append(r3)     // Catch: java.lang.Exception -> Lb9
            r0.append(r1)     // Catch: java.lang.Exception -> Lb9
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r0)     // Catch: java.lang.Exception -> Lb9
        Lb8:
            return r2
        Lb9:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "parse Celebration Page schema crash"
            X.C1CC2.LIZ(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1092540eXM.LIZ(com.bytedance.android.livesdk.livesetting.level.GuidanceConfig, com.bytedance.android.livesdk.model.message.EntranceGuidanceContainer):java.lang.String");
    }
}
