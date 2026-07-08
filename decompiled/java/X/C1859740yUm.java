package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0yUm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1859740yUm {
    public static final ConcurrentHashMap<String, TakoMixFeed> LIZ = new ConcurrentHashMap<>();

    public static TakoMixFeed LIZ(String str) {
        if (str != null && str.length() != 0) {
            return LIZ.get(str);
        }
        return null;
    }
}
