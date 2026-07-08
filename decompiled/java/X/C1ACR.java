package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.security.SecureRandom;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.1ACR, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ACR {
    public static final C1ACR LIZ = new C1ACR();
    public static final Map<String, C01GW<C1ACB>> LIZIZ;
    public static final SecureRandom LIZJ;
    public static Pair<? extends Aweme, Boolean> LIZLLL;
    public static boolean LJ;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZIZ = linkedHashMap;
        LIZJ = new SecureRandom();
        linkedHashMap.put("preview_slide", C292401Bi.LIZ(new C1ADS()));
        linkedHashMap.put("preview_watch", C292401Bi.LIZ(new C1ADT()));
    }
}
