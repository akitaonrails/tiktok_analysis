package X;

import Y.ARunnableS116S0100000_16;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.livesetting.gift.GiftReceiveFlowFluencyOptSetting;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0fkd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1139210fkd implements InterfaceC1142750fqL {
    public final Map<String, Long> LIZ = new LinkedHashMap();
    public final Map<String, Long> LIZIZ = new LinkedHashMap();

    /* JADX WARN: Removed duplicated region for block: B:36:0x006d A[Catch: JSONException -> 0x009e, PHI: r11
      0x006d: PHI (r11v5 java.lang.String) = (r11v0 java.lang.String), (r11v6 java.lang.String) binds: [B:35:0x006b, B:33:0x0068] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {JSONException -> 0x009e, blocks: (B:2:0x0000, B:4:0x000e, B:5:0x0011, B:7:0x0017, B:8:0x0019, B:10:0x0023, B:26:0x0053, B:28:0x0057, B:30:0x005b, B:32:0x0064, B:36:0x006d, B:38:0x0071, B:42:0x0078, B:48:0x008c, B:49:0x008e, B:12:0x0029, B:14:0x002d, B:15:0x0031, B:17:0x0035, B:18:0x0039, B:20:0x003d, B:21:0x0041, B:23:0x0045), top: B:54:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075 A[PHI: r11
      0x0075: PHI (r11v1 java.lang.String) = (r11v0 java.lang.String), (r11v5 java.lang.String), (r11v5 java.lang.String) binds: [B:35:0x006b, B:37:0x006f, B:39:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078 A[Catch: JSONException -> 0x009e, PHI: r10 r11
      0x0078: PHI (r10v3 java.lang.String) = (r10v0 java.lang.String), (r10v4 java.lang.String) binds: [B:41:0x0076, B:39:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0078: PHI (r11v4 java.lang.String) = (r11v1 java.lang.String), (r11v5 java.lang.String) binds: [B:41:0x0076, B:39:0x0073] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {JSONException -> 0x009e, blocks: (B:2:0x0000, B:4:0x000e, B:5:0x0011, B:7:0x0017, B:8:0x0019, B:10:0x0023, B:26:0x0053, B:28:0x0057, B:30:0x005b, B:32:0x0064, B:36:0x006d, B:38:0x0071, B:42:0x0078, B:48:0x008c, B:49:0x008e, B:12:0x0029, B:14:0x002d, B:15:0x0031, B:17:0x0035, B:18:0x0039, B:20:0x003d, B:21:0x0041, B:23:0x0045), top: B:54:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0084 A[PHI: r10 r11
      0x0084: PHI (r10v2 java.lang.String) = (r10v0 java.lang.String), (r10v3 java.lang.String) binds: [B:41:0x0076, B:43:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x0084: PHI (r11v3 java.lang.String) = (r11v1 java.lang.String), (r11v4 java.lang.String) binds: [B:41:0x0076, B:43:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1142750fqL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(final X.C1139250fkh r16) {
        /*
            r15 = this;
            X.00cf r6 = new X.00cf     // Catch: org.json.JSONException -> L9e
            r6.<init>()     // Catch: org.json.JSONException -> L9e
            r12 = -1
            r6.element = r12     // Catch: org.json.JSONException -> L9e
            r4 = r16
            boolean r0 = r4 instanceof X.C1139270fkj     // Catch: org.json.JSONException -> L9e
            if (r0 == 0) goto L29
            r0 = 1
            r6.element = r0     // Catch: org.json.JSONException -> L9e
        L11:
            X.0fkf r0 = r4.getResourceRequest()     // Catch: org.json.JSONException -> L9e
            if (r0 == 0) goto L26
            long r7 = r0.LIZLLL     // Catch: org.json.JSONException -> L9e
        L19:
            long r0 = r4.getResourceId()     // Catch: org.json.JSONException -> L9e
            com.bytedance.android.livesdk.gift.assets.AssetsModel r2 = X.C1138640fji.LIZLLL(r0)     // Catch: org.json.JSONException -> L9e
            if (r2 == 0) goto L4f
            int r12 = r2.resourceType     // Catch: org.json.JSONException -> L9e
            goto L4f
        L26:
            r7 = -1
            goto L19
        L29:
            boolean r0 = r4 instanceof X.C1139340fkq     // Catch: org.json.JSONException -> L9e
            if (r0 == 0) goto L31
            r0 = 2
            r6.element = r0     // Catch: org.json.JSONException -> L9e
            goto L11
        L31:
            boolean r0 = r4 instanceof X.C1139280fkk     // Catch: org.json.JSONException -> L9e
            if (r0 == 0) goto L39
            r0 = 3
            r6.element = r0     // Catch: org.json.JSONException -> L9e
            goto L11
        L39:
            boolean r0 = r4 instanceof X.C1139330fkp     // Catch: org.json.JSONException -> L9e
            if (r0 == 0) goto L41
            r0 = 4
            r6.element = r0     // Catch: org.json.JSONException -> L9e
            goto L11
        L41:
            boolean r0 = r4 instanceof X.C1139260fki     // Catch: org.json.JSONException -> L9e
            if (r0 == 0) goto L11
            r0 = r4
            X.0fki r0 = (X.C1139260fki) r0     // Catch: org.json.JSONException -> L9e
            int r0 = r0.getErrorCode()     // Catch: org.json.JSONException -> L9e
            r6.element = r0     // Catch: org.json.JSONException -> L9e
            goto L11
        L4f:
            java.lang.String r3 = ""
            if (r2 == 0) goto L6a
            com.bytedance.android.livesdk.gift.assets.ResourceModel r0 = r2.resourceModel     // Catch: org.json.JSONException -> L9e
            if (r0 == 0) goto L6a
            java.util.List<java.lang.String> r1 = r0.urlList     // Catch: org.json.JSONException -> L9e
            if (r1 == 0) goto L6a
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: org.json.JSONException -> L9e
            java.lang.Object[] r0 = r1.toArray(r0)     // Catch: org.json.JSONException -> L9e
            if (r0 == 0) goto L6a
            java.lang.String r11 = java.util.Arrays.toString(r0)     // Catch: org.json.JSONException -> L9e
            if (r11 != 0) goto L6d
        L6a:
            r11 = r3
            if (r2 == 0) goto L75
        L6d:
            com.bytedance.android.livesdk.gift.assets.ResourceModel r0 = r2.resourceByteVC1Model     // Catch: org.json.JSONException -> L9e
            if (r0 == 0) goto L75
            java.lang.String r10 = r0.uri     // Catch: org.json.JSONException -> L9e
            if (r10 != 0) goto L78
        L75:
            r10 = r3
            if (r2 == 0) goto L84
        L78:
            X.0fkf r0 = r4.getResourceRequest()     // Catch: org.json.JSONException -> L9e
            java.lang.String r0 = r0.LJ     // Catch: org.json.JSONException -> L9e
            java.lang.String r9 = r2.getResourceFormat(r0)     // Catch: org.json.JSONException -> L9e
            if (r9 != 0) goto L86
        L84:
            java.lang.String r9 = "unknown"
        L86:
            if (r2 == 0) goto L89
            goto L8c
        L89:
            r13 = 0
            goto L8e
        L8c:
            long r13 = r2.size     // Catch: org.json.JSONException -> L9e
        L8e:
            android.os.Handler r2 = X.C473410IhP.LIZ()     // Catch: org.json.JSONException -> L9e
            X.0fke r3 = new X.0fke     // Catch: org.json.JSONException -> L9e
            r5 = r15
            r3.<init>()     // Catch: org.json.JSONException -> L9e
            r0 = 100
            X.C786410Ut5.LJLIIL(r0, r2, r3)     // Catch: org.json.JSONException -> L9e
            return
        L9e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r0 = r0.toString()
            X.C20441214yg.LIZLLL(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1139210fkd.LIZIZ(X.0fkh):void");
    }

    @Override // X.InterfaceC1142750fqL
    public final void LIZJ(long j, C1139230fkf c1139230fkf) {
        long jLongValue;
        Long l = (Long) ((LinkedHashMap) this.LIZIZ).get(c1139230fkf.LIZ);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        this.LIZIZ.put(c1139230fkf.LIZ, Long.valueOf(TimeUnit.NANOSECONDS.toMillis(j - jLongValue)));
    }

    @Override // X.InterfaceC1142750fqL
    public final void LIZLLL(long j, C1139230fkf c1139230fkf) {
        long jLongValue;
        Long l = (Long) ((LinkedHashMap) this.LIZ).get(c1139230fkf.LIZ);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        this.LIZ.put(c1139230fkf.LIZ, Long.valueOf(TimeUnit.NANOSECONDS.toMillis(j - jLongValue)));
    }

    @Override // X.InterfaceC1142750fqL
    public final void LJ(long j, C1139230fkf c1139230fkf) {
        this.LIZIZ.put(c1139230fkf.LIZ, Long.valueOf(j));
    }

    @Override // X.InterfaceC1142750fqL
    public final void LJFF(long j, C1139230fkf c1139230fkf) {
        this.LIZ.put(c1139230fkf.LIZ, Long.valueOf(j));
    }

    @Override // X.InterfaceC1142750fqL
    public final void LJI(long j, C1139230fkf c1139230fkf) {
        AssetsModel assetsModelLIZLLL = C1138640fji.LIZLLL(j);
        if (assetsModelLIZLLL != null) {
            C1139200fkc c1139200fkc = new C1139200fkc(c1139230fkf, this, assetsModelLIZLLL, j, c1139230fkf.LIZLLL, assetsModelLIZLLL.resourceType);
            if (GiftReceiveFlowFluencyOptSetting.INSTANCE.getAsyncReportEvent()) {
                Map<Integer, String> map = C1138350fjF.LIZ;
                C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C01LX(100L, new ARunnableS116S0100000_16(c1139200fkc, 137), null), 2);
                return;
            }
            C786410Ut5.LJLIIL(100L, C473410IhP.LIZ(), new ARunnableS116S0100000_16(c1139200fkc, 137));
        }
    }
}
