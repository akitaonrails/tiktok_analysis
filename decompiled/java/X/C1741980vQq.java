package X;

import android.text.TextUtils;
import android.util.Patterns;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0vQq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1741980vQq implements InterfaceC1742050vQx {
    public C2193451Asx LIZ;
    public final String LIZIZ;

    public C1741980vQq(String str) {
        try {
            this.LIZIZ = str;
            if (!TextUtils.isEmpty(null) && Patterns.WEB_URL.matcher(str).matches()) {
                C2193451Asx.LIZ(UriProtector.parse(null), new C1742010vQt(this));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public C1741980vQq(String str, String str2, String str3) {
        try {
            this.LIZIZ = str3;
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && Patterns.WEB_URL.matcher(str).matches() && Patterns.WEB_URL.matcher(str2).matches()) {
                this.LIZ = new C2193451Asx(UriProtector.parse(str), UriProtector.parse(str2), null);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad  */
    @Override // X.InterfaceC1742050vQx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1742040vQw LIZIZ(android.app.Activity r7, X.C1741990vQr r8, X.InterfaceC1742030vQv r9) throws java.lang.Throwable {
        /*
            r6 = this;
            android.net.Uri r5 = r8.LIZLLL
            r3 = 0
            if (r5 != 0) goto L2f
            if (r7 == 0) goto Lb3
            android.content.Context r0 = X.C786410Ut5.L3(r7)
            if (r0 == 0) goto Lb3
            android.content.Context r0 = X.C786410Ut5.L3(r7)
            java.lang.String r2 = r0.getPackageName()
        L15:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Lb0
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r2)
            java.lang.String r0 = ":/oauth2callback"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            android.net.Uri r5 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
        L2f:
            X.1Asx r0 = r6.LIZ
            if (r0 == 0) goto Lb6
            java.lang.String r0 = r6.LIZIZ
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb6
            if (r5 == 0) goto Lb6
            java.lang.String r0 = r8.LIZJ
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lad
            java.lang.String r0 = r8.LIZJ
            java.lang.String r4 = "code"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L59
            java.lang.String r0 = r8.LIZJ
            java.lang.String r4 = "id_token"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto Lad
        L59:
            X.1Asz r2 = new X.1Asz
            X.1Asx r1 = r6.LIZ
            java.lang.String r0 = r6.LIZIZ
            r2.<init>(r1, r0, r4, r5)
            java.util.Set<java.lang.String> r0 = r8.LIZ
            java.lang.String r0 = X.C1742070vQz.LIZ(r0)
            r2.LJII = r0
            java.lang.String r1 = r8.LIZIZ
            if (r1 == 0) goto L73
            java.lang.String r0 = "state cannot be empty if defined"
            X.C20137213qk.LIZIZ(r0, r1)
        L73:
            r2.LJIIIIZZ = r1
            X.1Asy r1 = r2.LIZ()
            X.1AtG r4 = new X.1AtG
            r4.<init>(r7)
            r0 = 0
            android.net.Uri[] r0 = new android.net.Uri[r0]
            X.0WWG r0 = r4.LIZ(r0)
            X.0WWF r0 = r0.LIZ()
            android.content.Intent r2 = r4.LIZIZ(r1, r0)
            com.bytedance.router.monitor.RouterPageMonitor r0 = com.bytedance.router.monitor.RouterPageMonitor.INSTANCE
            com.bytedance.router.monitor.page.IRouterPageEventDispatcher r1 = r0.getDispatcher()
            java.lang.String r0 = "Activity_startActivityForResult_2"
            r1.dispatchActivityOpReached(r7, r2, r0)
            X.C1701330uNH.LIZ(r2, r7)
            X.0WZX r1 = new X.0WZX
            java.lang.String r0 = "dzBzEgAjS8/YVFkiQFyXYrVAyWIUdI6xHarbrweXKG/ZeLx8i0kfWOmAbxE7AVXjJvXV1JUgNz7g/9dLaEE="
            r1.<init>(r0, r3)
            r0 = 100
            X.C2204961BRm.LJIIZILJ(r0, r7, r2, r1)
            X.0vQw r0 = new X.0vQw
            r0.<init>(r7, r4, r9)
            return r0
        Lad:
            java.lang.String r4 = "token"
            goto L59
        Lb0:
            r5 = r3
            goto L2f
        Lb3:
            r2 = r3
            goto L15
        Lb6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1741980vQq.LIZIZ(android.app.Activity, X.0vQr, X.0vQv):X.0vQw");
    }
}
