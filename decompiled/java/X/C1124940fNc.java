package X;

import com.bytedance.keva.Keva;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fNc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1124940fNc {
    public static C11JL LIZ;
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(49));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(47));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(48));

    public static Keva LIZ() {
        return (Keva) LIZLLL.getValue();
    }

    public static void LIZIZ(String str, String str2, List list, Map map) {
        if (str == null || map == null || list == null) {
            return;
        }
        if (Intrinsics.LJFF(str2, "full")) {
            LIZ().clear();
        }
        for (Map.Entry entry : map.entrySet()) {
            LIZ().storeString((String) entry.getKey(), (String) entry.getValue());
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            LIZ().erase((String) it2.next());
        }
        ((Keva) LIZIZ.getValue()).storeString("live_i18n_version_code_v1", str);
    }
}
