package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.ss.android.ugc.aweme.api.ISandboxService;

/* JADX INFO: renamed from: X.0dpS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@InterfaceC1294060jmO
public final class C1065320dpS {
    public static final C1065320dpS LIZ = new C1065320dpS();

    public static void LIZ(Context context, String str) {
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(Uri.fromFile(new C0VSJ(str)));
        ISandboxService iSandboxServiceLIZ = C824400WVq.LIZ();
        if (iSandboxServiceLIZ != null && iSandboxServiceLIZ.needInterceptBySandbox(intent, 1207966465)) {
            return;
        }
        C2204961BRm.LJJJJI(context, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyRYRXpDIPipRcTPqAyVk6029i4OYnFZIGSz20Zsg==", null));
    }
}
