package X;

import android.app.Activity;

/* JADX INFO: renamed from: X.10Xr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class RunnableC19262910Xr implements Runnable {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ String LLILZ;

    public RunnableC19262910Xr(Activity activity, String str, String str2, String str3) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = activity;
        this.LLILZ = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r6 = this;
            java.lang.String r1 = r6.LL
            java.lang.String r0 = r6.LLILLJJLI
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto Lb
            return
        Lb:
            X.10Xz r1 = X.C19263710Xz.LIZ
            java.lang.String r0 = r6.LLILLJJLI
            r1.getClass()
            X.C19263710Xz.LJIILL = r0
            android.app.Activity r0 = r6.LLILLL
            android.net.Uri r5 = r0.getReferrer()
            X.08qG r4 = new X.08qG
            r4.<init>()
            java.lang.String r2 = r6.LLILZ
            java.util.HashMap<java.lang.String, java.lang.Object> r1 = r4.LIZ
            java.lang.String r0 = "open_url"
            r1.put(r0, r2)
            java.lang.String r3 = "dl_from"
            if (r5 == 0) goto L53
            java.lang.String r2 = r5.toString()
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r0 = X.C844470XAv.LIZ()
            java.lang.String r1 = r0.getPackageName()
            r0 = 0
            boolean r0 = kotlin.text.a0.LJJIIZI(r2, r1, r0)
            if (r0 != 0) goto L53
            java.lang.String r2 = "system"
        L46:
            r4.LIZLLL(r3, r2)
            org.json.JSONObject r1 = r4.LJ()
            java.lang.String r0 = "deeplink_system_cb"
            X.C20684815ws.LJIJ(r0, r1)
            return
        L53:
            android.app.Activity r0 = r6.LLILLL
            android.content.Intent r0 = r0.getIntent()
            r1 = 0
            if (r0 == 0) goto L65
            java.lang.String r0 = r0.getStringExtra(r3)     // Catch: java.lang.Exception -> L61
            goto L66
        L61:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L65:
            r0 = r1
        L66:
            java.lang.String r2 = "af"
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 != 0) goto L46
            android.app.Activity r0 = r6.LLILLL
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L7f
            java.lang.String r1 = r0.getStringExtra(r3)     // Catch: java.lang.Exception -> L7b
            goto L7f
        L7b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L7f:
            java.lang.String r2 = "facebook"
            boolean r0 = android.text.TextUtils.equals(r1, r2)
            if (r0 != 0) goto L46
            java.lang.String r2 = "others"
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC19262910Xr.LIZ():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("DeeplinkEventHelper@3d28.reportDeeplinkSystemCall$runnable$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DeeplinkEventHelper@3d28.reportDeeplinkSystemCall$runnable$1");
    }
}
