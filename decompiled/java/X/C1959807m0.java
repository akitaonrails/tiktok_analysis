package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: X.07m0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1959807m0 {
    public static Set<int[]> LIZ() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", new Class[0]).invoke(null, new Object[0]);
            if (objInvoke == null) {
                return Collections.emptySet();
            }
            Set<int[]> set = (Set) objInvoke;
            Iterator<int[]> it2 = set.iterator();
            while (it2.hasNext()) {
                if (!(it2.next() instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return Collections.emptySet();
        }
    }
}
