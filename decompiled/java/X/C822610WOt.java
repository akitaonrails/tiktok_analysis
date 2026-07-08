package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.0WOt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C822610WOt {
    public static final List<InterfaceC822620WOu> LIZ = Collections.synchronizedList(new LinkedList());

    public static final void LIZ(C824330WVj c824330WVj) {
        Iterator<InterfaceC822620WOu> it2 = LIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().LIZ(c824330WVj);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}
