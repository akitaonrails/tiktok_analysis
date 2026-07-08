package X;

import android.text.TextUtils;
import com.bytedance.retrofit2.client.Request;

/* JADX INFO: renamed from: X.0oQb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1472750oQb {
    public static volatile boolean LIZ = true;
    public static volatile boolean LIZIZ = true;
    public static volatile boolean LIZJ = true;
    public static volatile boolean LIZLLL = true;
    public static volatile boolean LJ = true;
    public static volatile boolean LJFF = true;
    public static volatile boolean LJI = true;
    public static volatile boolean LJII = true;
    public static volatile boolean LJIIIIZZ;

    public static int LIZ(Request request) {
        if (request == null) {
            return -1;
        }
        String path = request.getPath();
        if (TextUtils.isEmpty(path)) {
            return -1;
        }
        if (path.contains("/aweme/v1/feed/")) {
            return 1;
        }
        if (!path.contains("/aweme/v2/feed/")) {
            return -1;
        }
        return 2;
    }
}
