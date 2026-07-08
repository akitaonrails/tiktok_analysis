package X;

import com.bytedance.mt.protector.impl.UriProtector;

/* JADX INFO: renamed from: X.07kI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1949207kI {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(str2);
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZIZ(String str, boolean z) {
        String str2;
        if (z) {
            str2 = "aweme://pipo/cashier/bind_finish";
        } else {
            str2 = "aweme://pipo/cashier/bind_result";
        }
        return UriProtector.parse(str2).buildUpon().appendQueryParameter("bind_request_id", str).build().toString();
    }
}
