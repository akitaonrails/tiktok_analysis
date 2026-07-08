package X;

import com.ss.android.ugc.aweme.nimblecard.model.NimbleJson;
import com.ss.android.ugc.aweme.nimblecard.model.Template;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qts, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C684980Qts {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(371));

    public static Integer LIZIZ(String str) {
        List<Template> list;
        NimbleJson nimbleJson = C685370QuV.LIZ;
        NimbleJson nimbleJson2 = C685370QuV.LIZ;
        if (nimbleJson2 == null || (list = nimbleJson2.templates) == null) {
            return null;
        }
        Iterator<Template> it2 = list.iterator();
        int i = 0;
        while (true) {
            if (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().name, str)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf != null && numValueOf.intValue() == -1) {
            return null;
        }
        return numValueOf;
    }

    public static List LIZ(String str, String str2) {
        if (str2 != null) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(str2);
            return (List) concurrentHashMap.get(C2188811AlT.LIZIZ(sbLIZ));
        }
        return null;
    }
}
