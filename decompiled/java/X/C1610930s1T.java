package X;

import android.util.LruCache;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.vibefeed.clientai.cache.VibeIntentScoreIndex;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0s1T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1610930s1T {
    public static final C1610930s1T LIZ = new C1610930s1T();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(560));
    public static final LruCache<String, C1610940s1U> LIZJ = new LruCache<>(200);
    public static final ExecutorService LIZLLL = C823050WQl.LJFF();
    public static final Gson LJ = new Gson();

    public static VibeIntentScoreIndex LIZ(String str) {
        Object c098200Yq;
        Keva keva = (Keva) LIZIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("index.");
        sbLIZ.append(str);
        Object obj = null;
        String string = keva.getString(C2188811AlT.LIZIZ(sbLIZ), null);
        if (string != null && string.length() != 0) {
            try {
                c098200Yq = (VibeIntentScoreIndex) LJ.LJII(string, VibeIntentScoreIndex.class);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            VibeIntentScoreIndex vibeIntentScoreIndex = (VibeIntentScoreIndex) obj;
            if (vibeIntentScoreIndex == null) {
                return new VibeIntentScoreIndex();
            }
            return vibeIntentScoreIndex;
        }
        return new VibeIntentScoreIndex();
    }

    public static String LIZIZ(String str, String str2, EnumC1576090r7H enumC1576090r7H) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('.');
        sbLIZ.append(str2);
        sbLIZ.append('.');
        sbLIZ.append(enumC1576090r7H.getProtocolValue());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
