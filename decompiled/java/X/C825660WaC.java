package X;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.pumbaa.app2app.data.App2AppData;
import com.bytedance.pumbaa.app2app.data.App2AppUri;
import com.bytedance.pumbaa.app2app.data.KV;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0WaC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C825660WaC {
    public static App2AppData LIZIZ(Uri uri, ContentValues contentValues) {
        ArrayList arrayList;
        String string;
        App2AppUri app2AppUriLIZ = C825680WaE.LIZ(uri);
        if (contentValues == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str : contentValues.keySet()) {
                if (str != null) {
                    Object obj = contentValues.get(str);
                    if (obj != null) {
                        string = obj.toString();
                    } else {
                        string = null;
                    }
                    arrayList.add(new KV(str, string));
                }
            }
        }
        return new App2AppData("contentResolver", null, null, null, null, null, null, null, null, null, null, app2AppUriLIZ, arrayList, null, null, null, null, null, null, null, null, null);
    }

    public static App2AppData LIZJ(Bundle bundle, String str) {
        return new App2AppData("contentResolver", null, null, null, null, null, null, null, null, null, null, new App2AppUri(null, str, null, null), C825670WaD.LIZ(bundle), null, null, null, null, null, null, null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.pumbaa.app2app.data.App2AppData LIZLLL(android.content.Intent r27, java.lang.String r28) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C825660WaC.LIZLLL(android.content.Intent, java.lang.String):com.bytedance.pumbaa.app2app.data.App2AppData");
    }

    public static App2AppData LIZ(String str, String str2, Bundle bundle) {
        return new App2AppData("contentProvider", null, null, null, null, null, null, null, null, null, null, new App2AppUri(null, str, null, null), C825670WaD.LIZ(bundle), str2, null, null, null, null, null, null, null, null);
    }
}
