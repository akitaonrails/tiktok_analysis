package X;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.09b2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2401409b2 implements InterfaceC1051760dTa {
    public final WeakReference<Context> LL;

    public C2401409b2(WeakReference<Context> weakReference) {
        this.LL = weakReference;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    @Override // X.InterfaceC1051760dTa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void call(X.C1058910df7 r7, org.json.JSONObject r8) throws org.json.JSONException {
        /*
            r6 = this;
            org.json.JSONObject r2 = r7.LIZLLL
            java.lang.String r4 = "installed"
            r5 = -1
            if (r2 != 0) goto Lb
            r8.put(r4, r5)
            return
        Lb:
            java.lang.String r0 = "pkg_name"
            java.lang.String r1 = r2.optString(r0)
            java.lang.String r0 = "open_url"
            java.lang.String r3 = r2.optString(r0)
            java.lang.ref.WeakReference<android.content.Context> r0 = r6.LL
            android.content.Context r2 = X.C086J.LIZIZ(r0)
            if (r2 == 0) goto L2c
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L31
            boolean r0 = X.C2162308dZ.LJFF(r2, r1)
            if (r0 == 0) goto L30
            r5 = 1
        L2c:
            r8.put(r4, r5)
            return
        L30:
            r5 = 0
        L31:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L2c
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.VIEW"
            r1.<init>(r0)
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r3)
            r1.setData(r0)
            boolean r0 = X.C2162308dZ.LJ(r2, r1)
            if (r0 == 0) goto L4d
            r5 = 1
            goto L2c
        L4d:
            r5 = 0
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2401409b2.call(X.0df7, org.json.JSONObject):void");
    }
}
