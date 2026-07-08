package X;

import com.ss.android.ugc.aweme.shortvideo.model.SummaryData;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0FQK, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FQK {
    public static final Map<String, C531550Ksz> LIZ = new ConcurrentHashMap();

    public static C531550Ksz LIZ(String str) {
        return (C531550Ksz) ((ConcurrentHashMap) LIZ).get(str);
    }

    public static SummaryData LIZIZ(String str) {
        C531550Ksz c531550Ksz = (C531550Ksz) ((ConcurrentHashMap) LIZ).get(str);
        if (c531550Ksz != null) {
            return c531550Ksz.LIZLLL;
        }
        return null;
    }
}
