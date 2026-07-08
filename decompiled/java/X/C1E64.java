package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Set;

/* JADX INFO: renamed from: X.1E64, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1E64 {
    public static String[] LIZIZ() {
        return new String[]{"www.tiktok.com", "global.tiktok.com", "us.tiktok.com", "uk.tiktok.com", "gb.tiktok.com", "jp.tiktok.com", "www.tiktok.in", "de.tiktok.com", "br.tiktok.com", "fr.tiktok.com", "it.tiktok.com", "es.tiktok.com", "nl.tiktok.com", "kr.tiktok.com", "au.tiktok.com", "ca.tiktok.com", "mx.tiktok.com", "se.tiktok.com", "be.tiktok.com", "ru.tiktok.com", "sa.tiktok.com", "ae.tiktok.com", "vn.tiktok.com", "id.tiktok.com", "th.tiktok.com", "ng.tiktok.com", "tr.tiktok.com", "tr.tiktok.com", "eg.tiktok.com", "za.tiktok.com", "sg.tiktok.com", "hk.tiktok.com", "tw.tiktok.com", "cn.tiktok.com", "www.tt.site", "www.tt.inc", "www.tt.fun", "lite.tt.site", "lite.tt.inc", "lite.tt.fun", "tiktok.me"};
    }

    public static Uri LIZ(int i, Uri uri, String str) {
        String strLIZIZ;
        Uri uri2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (i != 1) {
            if (i != 18) {
                strLIZIZ = "";
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("sslocal://live?unique_id=");
                sbLIZ.append(str);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("sslocal://live?room_id=");
            sbLIZ2.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (TextUtils.isEmpty(strLIZIZ) || (uri2 = UriProtector.parse(strLIZIZ)) == null) {
            return null;
        }
        if (!TextUtils.equals(UriProtector.parse(strLIZIZ).getHost(), "webview")) {
            Set<String> setLIZJ = C1907940zkW.LIZJ(uri);
            Uri.Builder builderBuildUpon = uri2.buildUpon();
            if (setLIZJ != null && builderBuildUpon != null) {
                for (String str2 : setLIZJ) {
                    builderBuildUpon.appendQueryParameter(str2, C1907940zkW.LIZIZ(uri, str2));
                }
            }
            return builderBuildUpon.build();
        }
        return uri2;
    }
}
