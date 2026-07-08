package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SjH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C729370SjH {
    public static Set<String> LIZJ;
    public static final C01GW LIZ = C452501pT.LIZIZ(new C729380SjI());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C729390SjJ());
    public static final Map<String, Video> LIZLLL = new LinkedHashMap();

    public static Set LIZ() {
        if (LIZJ == null) {
            LIZJ = LIZIZ().getStringSet("key_unique_id_list", new LinkedHashSet());
        }
        return LIZJ;
    }

    public static Keva LIZIZ() {
        return (Keva) LIZIZ.getValue();
    }

    public static void LIZJ(Function1 function1) {
        Iterator it2;
        Set setLIZ = LIZ();
        if (setLIZ != null && (it2 = setLIZ.iterator()) != null) {
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (((Boolean) function1.invoke(str)).booleanValue()) {
                    it2.remove();
                    LIZIZ().erase(str);
                }
            }
            LIZIZ().storeStringSet("key_unique_id_list", LIZ());
        }
    }
}
