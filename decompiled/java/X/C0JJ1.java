package X;

import android.net.Uri;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0JJ1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JJ1 {
    public static String LIZ(long j, Long l, String str, String str2, String str3) {
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("sslocal").authority("webcast_pcs").path("/third_party_biolink").appendQueryParameter("sku_id", String.valueOf(j)).appendQueryParameter("show_entrance", str);
        if (!a0.LJJJIL(str2)) {
            builderAppendQueryParameter.appendQueryParameter("anchor_id", str2);
        }
        if (!a0.LJJJIL(str3)) {
            builderAppendQueryParameter.appendQueryParameter("sec_anchor_id", str3);
        }
        if (l != null) {
            builderAppendQueryParameter.appendQueryParameter("room_id", l.toString());
        }
        return builderAppendQueryParameter.build().toString();
    }
}
