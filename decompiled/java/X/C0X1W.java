package X;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.secapi.ISecApi;

/* JADX INFO: renamed from: X.0X1W, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0X1W<T> extends C841660X0a<T> {
    public boolean LIZIZ;
    public boolean LIZJ;
    public final Object LIZLLL = new Object();

    @Override // X.InterfaceC841670X0b
    public T LIZ() {
        InterfaceC841670X0b<RES> interfaceC841670X0b = this.LIZ;
        if (interfaceC841670X0b == 0) {
            return null;
        }
        return (T) interfaceC841670X0b.LIZ();
    }

    @Override // X.InterfaceC841670X0b
    public T LIZIZ() {
        InterfaceC841670X0b<RES> interfaceC841670X0b = this.LIZ;
        if (interfaceC841670X0b == 0) {
            return null;
        }
        return (T) interfaceC841670X0b.LIZIZ();
    }

    public final boolean LIZLLL(int i) {
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF != null && ((ISecApi) ServiceManager.get().getService(ISecApi.class)).needVerifyImage(i)) {
            ((ISecApi) ServiceManager.get().getService(ISecApi.class)).popCaptcha(activityLJFF, i, new C149A(this) { // from class: X.0X1X
                public final /* synthetic */ C0X1W<T> LIZ;

                {
                    this.LIZ = this;
                }

                @Override // X.C149A
                public final void LIZIZ(int i2, boolean z) {
                    C0X1W<T> c0x1w = this.LIZ;
                    c0x1w.LIZIZ = z;
                    c0x1w.LIZJ = true;
                    synchronized (c0x1w.LIZLLL) {
                        try {
                            c0x1w.LIZLLL.notifyAll();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            });
            synchronized (this.LIZLLL) {
                int i2 = 4;
                while (!this.LIZJ) {
                    try {
                        int i3 = i2 - 1;
                        if (i2 <= 0) {
                            break;
                        }
                        this.LIZLLL.wait(50000L);
                        i2 = i3;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                this.LIZLLL.notifyAll();
            }
            return true;
        }
        return false;
    }

    public final boolean LJFF(String str) {
        Activity activityLJFF;
        if (TextUtils.isEmpty(str) || (activityLJFF = C2214201BlK.LJFF()) == null) {
            return false;
        }
        ((ISecApi) ServiceManager.get().getService(ISecApi.class)).popCaptchaV2(activityLJFF, str, new C149A(this) { // from class: X.0X1Y
            public final /* synthetic */ C0X1W<T> LIZ;

            {
                this.LIZ = this;
            }

            @Override // X.C149A
            public final void LIZIZ(int i, boolean z) {
                C0X1W<T> c0x1w = this.LIZ;
                c0x1w.LIZIZ = z;
                c0x1w.LIZJ = true;
                synchronized (c0x1w.LIZLLL) {
                    try {
                        c0x1w.LIZLLL.notifyAll();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }, null);
        synchronized (this.LIZLLL) {
            int i = 4;
            while (!this.LIZJ) {
                try {
                    int i2 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    this.LIZLLL.wait(50000L);
                    i = i2;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            this.LIZLLL.notifyAll();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ(java.lang.String r7, org.json.JSONObject r8) {
        /*
            r6 = this;
            java.lang.String r5 = "status_code"
            boolean r0 = r8.has(r5)
            java.lang.String r2 = "message"
            r4 = 0
            if (r0 == 0) goto L12
            int r0 = r8.optInt(r5)
            if (r0 == 0) goto L25
        L12:
            boolean r0 = r8.has(r2)
            if (r0 == 0) goto L26
            java.lang.String r1 = "success"
            java.lang.String r0 = r8.optString(r2)
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L26
        L25:
            return r4
        L26:
            java.lang.String r3 = "error_code"
            boolean r0 = r8.has(r3)
            if (r0 == 0) goto L37
            int r1 = r8.optInt(r3)
        L32:
            boolean r0 = r6.LIZLLL(r1)
            return r0
        L37:
            boolean r0 = r8.has(r5)
            if (r0 == 0) goto L42
            int r1 = r8.optInt(r5)
            goto L32
        L42:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.secapi.ISecApi> r0 = com.ss.android.ugc.aweme.secapi.ISecApi.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.secapi.ISecApi r0 = (com.ss.android.ugc.aweme.secapi.ISecApi) r0
            boolean r0 = r0.isCaptchaUrl(r7)
            if (r0 == 0) goto Lc3
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.secapi.ISecApi> r0 = com.ss.android.ugc.aweme.secapi.ISecApi.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.secapi.ISecApi r0 = (com.ss.android.ugc.aweme.secapi.ISecApi) r0
            boolean r0 = r0.isCaptchaUrl(r7)
            if (r0 == 0) goto Lc1
            boolean r0 = r8.has(r2)
            if (r0 == 0) goto Lbe
            java.lang.String r1 = r8.optString(r2)
        L70:
            java.lang.String r0 = "error"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto Lc1
            java.lang.String r0 = "data"
            java.lang.String r0 = r8.optString(r0)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>(r0)
            int r4 = r2.optInt(r3)
            java.lang.String r0 = "verify_center_decision_conf"
            java.lang.String r1 = r2.optString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L9b
            java.lang.String r0 = "verify_center_secondary_decision_conf"
            java.lang.String r1 = r2.optString(r0)
        L9b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            android.util.Pair r2 = android.util.Pair.create(r0, r1)
            java.lang.Object r0 = r2.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r2.second
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L32
            java.lang.Object r0 = r2.second
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r6.LJFF(r0)
            return r0
        Lbe:
            java.lang.String r1 = ""
            goto L70
        Lc1:
            r1 = 0
            goto L9b
        Lc3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0X1W.LJ(java.lang.String, org.json.JSONObject):boolean");
    }
}
