package X;

import android.net.Uri;

/* JADX INFO: renamed from: X.0JJH, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JJH {
    public static String LIZ(long j, String str, String str2, String str3, String str4, String str5) {
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("sslocal").authority("webcast_pcs").path("/meeting/calendly_booking").appendQueryParameter("anchor_id", str).appendQueryParameter("sec_anchor_id", str2);
        if (str3.length() > 0) {
            builderAppendQueryParameter.appendQueryParameter("show_entrance", str3);
        }
        return builderAppendQueryParameter.appendQueryParameter("sku_id", String.valueOf(j)).appendQueryParameter("booking_description", str5).appendQueryParameter("booking_title", str4).build().toString();
    }
}
