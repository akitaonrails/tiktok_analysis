package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.1BEP, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public class C1BEP extends AbstractC2201481BEc {
    public C1BEP() {
        super(null);
    }

    @Override // X.AbstractC2201481BEc, X.InterfaceC2201661BEu
    public final C1BEW LIZ(InterfaceC2201591BEn interfaceC2201591BEn) {
        int i;
        String host;
        C1BEZ c1bezLIZIZ = LIZIZ(interfaceC2201591BEn.getRequest());
        String str = c1bezLIZIZ.LIZIZ;
        C1BEQ c1beq = this.LIZ.LIZIZ;
        if (c1beq != null) {
            i = c1beq.LJII;
        } else {
            i = 10000;
        }
        try {
            host = UriProtector.parse(str).getHost();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            host = null;
        }
        boolean zContains = true;
        if (!TextUtils.isEmpty(host)) {
            zContains = true ^ ((ArrayList) this.LIZ.LIZIZ.LJIIIZ).contains(host);
        }
        return LIZLLL(c1bezLIZIZ, i, zContains);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    @Override // X.AbstractC2201481BEc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1BEZ LIZIZ(X.C1BEZ r10) {
        /*
            r9 = this;
            r6 = 0
            if (r10 != 0) goto L4
            return r6
        L4:
            java.lang.String r2 = r10.LIZIZ
            X.1BEN r0 = r9.LIZ
            X.1BEQ r0 = r0.LIZIZ
            boolean r5 = r9 instanceof X.C846370XId
            boolean r0 = r0.LJIIIIZZ
            r4 = 1
            if (r0 == 0) goto L93
            r0 = r5 ^ 1
            if (r0 != 0) goto L1b
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 > r0) goto L93
        L1b:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L93
            r8 = 0
            r7 = 0
        L23:
            java.net.URI.create(r2)     // Catch: java.lang.Exception -> L27
            goto L75
        L27:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            r1 = r3
        L2c:
            boolean r0 = r1 instanceof java.net.URISyntaxException
            if (r0 != 0) goto L5d
            java.lang.Throwable r1 = r1.getCause()
            if (r1 != 0) goto L2c
            java.lang.String r1 = r3.getMessage()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L75
            if (r6 != 0) goto L48
            java.lang.String r0 = "at index (\\d+):"
            java.util.regex.Pattern r6 = com.bytedance.mt.protector.impl.PatternProtector.compile(r0)
        L48:
            java.util.regex.Matcher r1 = r6.matcher(r1)
            boolean r0 = r1.find()
            if (r0 == 0) goto L75
            java.lang.String r0 = r1.group(r4)
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)     // Catch: java.lang.Exception -> L71
            if (r0 < 0) goto L75
            goto L6a
        L5d:
            java.net.URISyntaxException r1 = (java.net.URISyntaxException) r1
            int r0 = r1.getIndex()
            if (r0 < 0) goto L75
            java.lang.String r2 = X.C2667011l.LIZ(r0, r2)
            goto L6e
        L6a:
            java.lang.String r2 = X.C2667011l.LIZ(r0, r2)
        L6e:
            int r7 = r7 + 1
            goto L23
        L71:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L75:
            X.1BE8 r0 = X.C1BE8.LIZIZ()
            X.1BER r0 = r0.LIZJ
            boolean r0 = r0.LIZIZ
            if (r0 == 0) goto L93
            java.util.Locale r3 = java.util.Locale.getDefault()
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r1[r8] = r0
            r1[r4] = r2
            java.lang.String r0 = "encoded[%d] url: [%s]"
            X.C786410Ut5.k4(r3, r0, r1)
        L93:
            if (r5 != 0) goto Lb2
            X.1BEK r0 = r10.LJ
            if (r0 == 0) goto Lb2
            org.json.JSONObject r3 = r0.LJII
            if (r3 != 0) goto La4
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            r0.LJII = r3
        La4:
            java.lang.String r1 = "custom_net"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch: org.json.JSONException -> Lae
            r3.putOpt(r1, r0)     // Catch: org.json.JSONException -> Lae
            goto Lb2
        Lae:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        Lb2:
            X.1BEb r1 = r10.LIZ
            r1.LIZ = r2
            X.1BEZ r0 = new X.1BEZ
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BEP.LIZIZ(X.1BEZ):X.1BEZ");
    }

    public C1BEW LIZLLL(C1BEZ c1bez, int i, boolean z) {
        throw new RuntimeException("Not implemented");
    }
}
