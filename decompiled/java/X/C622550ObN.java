package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.text.CharsKt__CharJVMKt;

/* JADX INFO: renamed from: X.0ObN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C622550ObN {
    public static Pair LIZIZ(C622570ObP c622570ObP) {
        Aweme aweme;
        String awemeRawAdIdStr;
        ConcurrentHashMap<String, Pair<String, String>> concurrentHashMap;
        Fragment fragment = c622570ObP.LIZ;
        if (fragment != null) {
            int iIdentityHashCode = System.identityHashCode(fragment);
            CharsKt__CharJVMKt.checkRadix(16);
            String string = Integer.toString(iIdentityHashCode, 16);
            if (string != null && (aweme = c622570ObP.LIZIZ) != null && (awemeRawAdIdStr = AwemeExtKt.getAwemeRawAdIdStr(aweme)) != null && (concurrentHashMap = C622570ObP.LJIILJJIL.get(string)) != null) {
                return concurrentHashMap.get(awemeRawAdIdStr);
            }
            return null;
        }
        return null;
    }

    public static void LIZ(C622570ObP c622570ObP, Pair pair) {
        Aweme aweme;
        String awemeRawAdIdStr;
        ConcurrentHashMap<String, Pair<String, String>> concurrentHashMapPutIfAbsent;
        Fragment fragment = c622570ObP.LIZ;
        if (fragment != null) {
            int iIdentityHashCode = System.identityHashCode(fragment);
            CharsKt__CharJVMKt.checkRadix(16);
            String string = Integer.toString(iIdentityHashCode, 16);
            if (string != null && (aweme = c622570ObP.LIZIZ) != null && (awemeRawAdIdStr = AwemeExtKt.getAwemeRawAdIdStr(aweme)) != null) {
                ConcurrentHashMap<String, ConcurrentHashMap<String, Pair<String, String>>> concurrentHashMap = C622570ObP.LJIILJJIL;
                ConcurrentHashMap<String, Pair<String, String>> concurrentHashMap2 = concurrentHashMap.get(string);
                if (concurrentHashMap2 == null && (concurrentHashMapPutIfAbsent = concurrentHashMap.putIfAbsent(string, (concurrentHashMap2 = new ConcurrentHashMap<>()))) != null) {
                    concurrentHashMap2 = concurrentHashMapPutIfAbsent;
                }
                if (concurrentHashMap2.putIfAbsent(awemeRawAdIdStr, pair) == null) {
                    C625790Ogb.LIZ();
                }
            }
        }
    }
}
