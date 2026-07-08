package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import kotlin.text.u;

/* JADX INFO: renamed from: X.08MA, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08MA {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(Set set) {
        if (set == null) {
            return C13BV.INSTANCE;
        }
        ThreadGroup threadGroup = C786410Ut5.u3().getThreadGroup();
        ThreadGroup threadGroup2 = threadGroup;
        while (threadGroup != null) {
            threadGroup2 = threadGroup;
            threadGroup = threadGroup.getParent();
        }
        LinkedList linkedList = new LinkedList();
        if (threadGroup2 != null) {
            int iActiveCount = (int) (((double) threadGroup2.activeCount()) * 1.5d);
            Thread[] threadArr = new Thread[iActiveCount];
            threadGroup2.enumerate(threadArr);
            for (int i = 0; i < iActiveCount; i++) {
                Thread thread = threadArr[i];
                if (thread != null && (!(set instanceof Collection) || !set.isEmpty())) {
                    Iterator it2 = set.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (u.LJJIIJZLJL(thread.getName(), (String) it2.next(), false)) {
                                linkedList.add(new C08MB(thread));
                                break;
                            }
                        }
                    }
                }
            }
        }
        return linkedList;
    }
}
