package X;

import android.app.RemoteInput;
import android.content.Intent;
import android.net.Uri;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0Vvn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C813570Vvn {
    public static Set<String> LIZIZ(Object obj) {
        return ((RemoteInput) obj).getAllowedDataTypes();
    }

    public static Map<String, Uri> LIZJ(Intent intent, String str) {
        return RemoteInput.getDataResultsFromIntent(intent, str);
    }

    public static void LIZ(C813560Vvm c813560Vvm, Intent intent, Map<String, Uri> map) {
        RemoteInput.addDataResultToIntent(C813560Vvm.LIZ(c813560Vvm), intent, map);
    }

    public static RemoteInput.Builder LIZLLL(RemoteInput.Builder builder, String str, boolean z) {
        return builder.setAllowDataType(str, z);
    }
}
