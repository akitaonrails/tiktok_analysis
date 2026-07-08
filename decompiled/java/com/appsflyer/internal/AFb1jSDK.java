package com.appsflyer.internal;

import X.C0WZX;
import X.C2204961BRm;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes31.dex */
public final class AFb1jSDK extends AFc1dSDK<String> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFc1dSDK
    /* JADX INFO: renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
    public String AFKeystoreWrapper() throws Throwable {
        Cursor cursorLJJJ;
        try {
            cursorLJJJ = C2204961BRm.LJJJ(this.valueOf.getContentResolver(), Uri.parse("content://" + this.AFKeystoreWrapper), new String[]{"aid"}, null, null, null, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bdsYuleyw==", new String[]{"01c45"}));
            if (cursorLJJJ != null) {
                try {
                    if (cursorLJJJ.moveToFirst()) {
                        String string = cursorLJJJ.getString(cursorLJJJ.getColumnIndexOrThrow("aid"));
                        cursorLJJJ.close();
                        return string;
                    }
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    if (cursorLJJJ != null) {
                        cursorLJJJ.close();
                    }
                    throw th;
                }
            }
            if (cursorLJJJ != null) {
                cursorLJJJ.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            cursorLJJJ = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.String] */
    @Override // com.appsflyer.internal.AFc1dSDK
    public final /* synthetic */ String valueOf() {
        this.AFInAppEventType.values().execute(this.AFInAppEventParameterName);
        return super.valueOf();
    }

    public final String values() {
        this.AFInAppEventType.values().execute(this.AFInAppEventParameterName);
        return (String) super.valueOf();
    }

    public AFb1jSDK(Context context, AFd1kSDK aFd1kSDK) {
        super(context, aFd1kSDK, "com.facebook.katana.provider.AttributionIdProvider", "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1");
    }
}
