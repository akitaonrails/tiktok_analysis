package X;

import com.bytedance.retrofit2.client.Request;

/* JADX INFO: renamed from: X.0pKx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1507690pKx {
    public static String LIZ(Request request) {
        String url;
        if (request != null && (url = request.getUrl()) != null) {
            return C1946007jm.LIZJ(C1946007jm.LJ(url), "ec_native_prefetch_key");
        }
        return null;
    }
}
