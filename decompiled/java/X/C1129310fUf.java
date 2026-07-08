package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fUf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129310fUf {
    public static String LIZJ;
    public static int LIZLLL;
    public static int LJ;
    public static final C1129310fUf LIZ = new C1129310fUf();
    public static String LIZIZ = CardStruct.IStatusCode.DEFAULT;
    public static String LJFF = "";
    public static String LJI = "";

    public static boolean LIZJ() {
        Object c098200Yq;
        if (LJI.length() == 0 || 0 != 0) {
            return false;
        }
        try {
            c098200Yq = Long.valueOf(new JSONObject(LJI).optLong("ucl", 0L));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = 0L;
        }
        return ((Number) c098200Yq).longValue() > 0;
    }

    public static int LIZ() {
        return LIZLLL;
    }

    public static String LIZIZ() {
        return LIZIZ;
    }
}
