package X;

import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0J2u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.mention.MentionKevaHelper$getInitialRecommendListCache$2", f = "MentionKevaHelper.kt", l = {}, m = "invokeSuspend")
public final class C485660J2u extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends MentionDataItem>>, Object> {
    public C485660J2u(InterfaceC1364105Vn<? super C485660J2u> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C485660J2u(interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List<com.ss.android.ugc.aweme.creative.model.common.MentionDataItem>] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2 */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "MentionKevaHelper@2cd8.getInitialRecommendListCache$2"
            X.C1C7U.LIZ(r9)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r11)
            r8 = 0
            X.01GW r0 = X.C555240Lq6.LIZIZ     // Catch: java.lang.Throwable -> L86
            java.lang.Object r2 = r0.getValue()     // Catch: java.lang.Throwable -> L86
            com.bytedance.keva.Keva r2 = (com.bytedance.keva.Keva) r2     // Catch: java.lang.Throwable -> L86
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = "cache_initial_recommend_list"
            r1.append(r0)     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = X.C555240Lq6.LIZ()     // Catch: java.lang.Throwable -> L86
            r1.append(r0)     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L86
            r7 = 0
            java.lang.String[] r0 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> L86
            java.lang.String[] r5 = r2.getStringArray(r1, r0)     // Catch: java.lang.Throwable -> L86
            if (r5 == 0) goto L54
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L86
            r6.<init>()     // Catch: java.lang.Throwable -> L86
            int r4 = r5.length     // Catch: java.lang.Throwable -> L86
            r3 = 0
        L38:
            if (r3 >= r4) goto L56
            r2 = r5[r3]     // Catch: java.lang.Throwable -> L86
            X.01GW r0 = X.C555240Lq6.LIZJ     // Catch: java.lang.Throwable -> L86
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> L86
            com.google.gson.Gson r1 = (com.google.gson.Gson) r1     // Catch: java.lang.Throwable -> L86
            java.lang.Class<com.ss.android.ugc.aweme.creative.model.common.MentionDataItem> r0 = com.ss.android.ugc.aweme.creative.model.common.MentionDataItem.class
            java.lang.Object r0 = r1.LJII(r2, r0)     // Catch: java.lang.Throwable -> L86
            com.ss.android.ugc.aweme.creative.model.common.MentionDataItem r0 = (com.ss.android.ugc.aweme.creative.model.common.MentionDataItem) r0     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto L51
            r6.add(r0)     // Catch: java.lang.Throwable -> L86
        L51:
            int r3 = r3 + 1
            goto L38
        L54:
            X.13BV r6 = X.C13BV.INSTANCE     // Catch: java.lang.Throwable -> L86
        L56:
            X.01GW r0 = X.C555240Lq6.LIZIZ     // Catch: java.lang.Throwable -> L86
            java.lang.Object r3 = r0.getValue()     // Catch: java.lang.Throwable -> L86
            com.bytedance.keva.Keva r3 = (com.bytedance.keva.Keva) r3     // Catch: java.lang.Throwable -> L86
            java.lang.String r2 = "cache_time"
            r0 = 0
            long r4 = r3.getLong(r2, r0)     // Catch: java.lang.Throwable -> L86
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L86
            r0 = 86400000(0x5265c00, float:7.82218E-36)
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L86
            long r2 = r2 - r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L74
            r7 = 1
        L74:
            java.lang.String r0 = X.C555240Lq6.LIZ()     // Catch: java.lang.Throwable -> L86
            X.C555240Lq6.LIZLLL = r0     // Catch: java.lang.Throwable -> L86
            if (r7 != 0) goto L82
            boolean r0 = r6.isEmpty()     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto L83
        L82:
            r6 = r8
        L83:
            X.C555240Lq6.LIZ = r6     // Catch: java.lang.Throwable -> L86
            goto L8b
        L86:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L8c
        L8b:
            r8 = r6
        L8c:
            X.C1C7U.LIZIZ(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C485660J2u.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends MentionDataItem>> interfaceC1364105Vn) {
        return new C485660J2u(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
