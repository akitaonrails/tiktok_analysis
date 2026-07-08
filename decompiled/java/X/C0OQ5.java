package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0OQ5, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OQ5 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str, String str2, String str3) {
        if (str.length() != 0 && str2.length() != 0 && str3.length() != 0) {
            Uri uri = UriProtector.parse(str);
            if (!C1907940zkW.LIZJ(uri).contains(str2)) {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                builderBuildUpon.appendQueryParameter(str2, str3);
                return builderBuildUpon.build().toString();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('(');
            sbLIZ.append(str2);
            sbLIZ.append("=[^&]*)");
            Regex regex = new Regex(C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str2);
            sbLIZ2.append('=');
            sbLIZ2.append(str3);
            return regex.replaceFirst(str, C2188811AlT.LIZIZ(sbLIZ2));
        }
        return str;
    }
}
