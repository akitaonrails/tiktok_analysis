package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: renamed from: X.09fV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2429109fV {
    public static final C2429109fV LIZ = new C2429109fV();

    public static final void LIZ(Context context, String str) throws Throwable {
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(Uri.fromFile(new C0VSJ(str)));
        if (!C2429209fW.LIZ().needInterceptBySandbox(intent, 1207966465)) {
            C2204961BRm.LJJJJI(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkj9dPSVF/XyG/+XDE6AP/+kVu8p3XEhkvbcqKfNVwCFM", null));
        }
    }
}
