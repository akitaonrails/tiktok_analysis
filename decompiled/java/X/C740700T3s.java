package X;

import android.text.TextUtils;
import com.ttnet.org.chromium.net.impl.CronetUrlRequest;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0T3s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C740700T3s {
    public static final Map<String, CronetUrlRequest> LIZ = new ConcurrentHashMap();

    public static void LIZ(String str) {
        if (!TextUtils.isEmpty(str)) {
            ((ConcurrentHashMap) LIZ).remove(str);
        }
    }
}
