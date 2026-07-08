package X;

import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0CRp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C313750CRp {
    public static AnonymousClass0956 LIZ;
    public static volatile String LIZIZ;
    public static final Set<String> LIZJ = Collections.newSetFromMap(new ConcurrentHashMap());
    public static final Set<String> LIZLLL = Collections.newSetFromMap(new ConcurrentHashMap());
    public static WeakReference<InterfaceC313740CRo> LJ;

    public static void LIZ(SearchSugResponse searchSugResponse) {
        String str;
        if (((Number) C271930AlD.LIZ.getValue()).intValue() == 1 && (str = searchSugResponse.LLILLL) != null && str.length() > 3) {
            String str2 = searchSugResponse.LLILLL;
            String strSubstring = str2.substring(0, str2.length() - 1);
            Set<String> set = LIZLLL;
            if (set.contains(strSubstring)) {
                return;
            }
            set.add(searchSugResponse.LLILLL);
            LIZIZ(searchSugResponse, null);
        }
    }

    public static void LIZIZ(SearchSugResponse searchSugResponse, InterfaceC313740CRo interfaceC313740CRo) {
        if (!C301410Brf.LIZ()) {
            return;
        }
        AnonymousClass0956 anonymousClass0956 = LIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        if (interfaceC313740CRo != null) {
            LJ = new WeakReference<>(interfaceC313740CRo);
        }
        LIZ = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C313730CRn(searchSugResponse, null), 3);
    }
}
