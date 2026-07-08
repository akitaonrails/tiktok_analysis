package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.image.experiment.HeifUrlReplaceConfig;
import java.util.List;
import java.util.Set;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0jgJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1290290jgJ {
    public static Uri LIZ(Uri uri, HeifUrlReplaceConfig heifUrlReplaceConfig) {
        int iLastIndexOf;
        if (uri != null && heifUrlReplaceConfig != null && !Boolean.FALSE.equals(heifUrlReplaceConfig.isEnable()) && heifUrlReplaceConfig.isValid()) {
            String path = uri.getPath();
            if (TextUtils.isEmpty(path)) {
                return uri;
            }
            Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
            if (queryParameterNames != null && (queryParameterNames.contains("x-signature") || queryParameterNames.contains("x-orig-sign"))) {
                return uri;
            }
            boolean z = false;
            for (String str : heifUrlReplaceConfig.getImageTemplates()) {
                if (!TextUtils.isEmpty(str) && path.contains(str)) {
                    z = true;
                }
            }
            if (!z) {
                return uri;
            }
            String path2 = uri.getPath();
            String strSubstring = "";
            if (!TextUtils.isEmpty(path2) && (iLastIndexOf = path2.lastIndexOf(e3.d)) < path2.length() - 1 && iLastIndexOf >= 0) {
                strSubstring = path2.substring(iLastIndexOf + 1);
            }
            if (TextUtils.isEmpty(strSubstring)) {
                return uri;
            }
            String lowerCase = strSubstring.toLowerCase();
            List<String> replacedExtensions = heifUrlReplaceConfig.getReplacedExtensions();
            if (replacedExtensions != null && replacedExtensions.contains(lowerCase)) {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                int iLastIndexOf2 = path.lastIndexOf(e3.d);
                if (iLastIndexOf2 > 0 && iLastIndexOf2 <= path.length()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(path.substring(0, iLastIndexOf2));
                    sbLIZ.append(e3.d);
                    sbLIZ.append(heifUrlReplaceConfig.getExtension());
                    builderBuildUpon.path(C2188811AlT.LIZIZ(sbLIZ));
                    builderBuildUpon.appendQueryParameter("o", strSubstring);
                    return builderBuildUpon.build();
                }
                return uri;
            }
            return uri;
        }
        return uri;
    }
}
