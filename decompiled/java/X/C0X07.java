package X;

import com.ss.android.ugc.aweme.legoImp.task.pumbaa.settings.NetworkTypeConfig;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0X07, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X07 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str, String str2) {
        Set<String> set = ((NetworkTypeConfig) C0X08.LIZIZ.getValue()).cdnPathList;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<T> it2 = set.iterator();
            while (it2.hasNext()) {
                if (u.LJJIIJZLJL(str2, (String) it2.next(), false)) {
                    return true;
                }
            }
        }
        ConcurrentHashMap<String, Boolean> concurrentHashMap = C0X08.LIZJ;
        if (concurrentHashMap.containsKey(str)) {
            Boolean bool = concurrentHashMap.get(str);
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        }
        Iterator<T> it3 = ((NetworkTypeConfig) C0X08.LIZIZ.getValue()).cdnDomainList.iterator();
        while (it3.hasNext()) {
            if (u.LJIIZILJ(str, (String) it3.next(), false)) {
                C0X08.LIZJ.put(str, Boolean.TRUE);
                return true;
            }
        }
        C0X08.LIZJ.put(str, Boolean.FALSE);
        return false;
    }
}
