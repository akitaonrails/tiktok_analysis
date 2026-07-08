package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.011U, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C011U {
    public static String LIZIZ(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((String) entry.getKey());
            sbLIZ.append("=");
            String str = (String) entry.getValue();
            str.getClass();
            try {
                sbLIZ.append(URLEncoder.encode(str, "utf-8"));
                arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
            } catch (UnsupportedEncodingException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new IllegalStateException("Unable to encode using UTF-8");
            }
        }
        return TextUtils.join("&", arrayList);
    }

    public static void LIZ(Uri.Builder builder, String str, Object obj) {
        if (obj == null || obj.toString() == null) {
            return;
        }
        builder.appendQueryParameter(str, obj.toString());
    }
}
