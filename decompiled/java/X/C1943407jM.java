package X;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: X.07jM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1943407jM {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str, String str2, Map map) {
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("aweme").authority("bulletin_board_router").appendQueryParameter("bulletin_board_id", str).appendQueryParameter("bulletin_action", str2);
        for (Map.Entry entry : map.entrySet()) {
            builderAppendQueryParameter.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderAppendQueryParameter.build().toString();
    }
}
