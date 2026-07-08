package X;

import com.bytedance.retrofit2.client.Request;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07jo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1946207jo {
    public static String LIZ(Request request) {
        String url;
        String strLIZJ;
        if (request != null && (url = request.getUrl()) != null && (strLIZJ = C1946007jm.LIZJ(C1946007jm.LJ(url), "ec_native_prefetch_request_id")) != null && (!a0.LJJJIL(strLIZJ))) {
            return strLIZJ;
        }
        return null;
    }
}
