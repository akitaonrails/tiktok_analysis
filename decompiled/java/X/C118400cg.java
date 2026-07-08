package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.00cg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C118400cg {
    public static final List LIZ(int i, int i2, List list) {
        boolean z;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        List listSubList = null;
        if (z) {
            return null;
        }
        try {
            int size = list.size();
            C118300cf c118300cf = new C118300cf();
            c118300cf.element = C13LZ.LJ(i, 0, size);
            int iLJ = C13LZ.LJ(i2, 0, size);
            int i3 = c118300cf.element;
            if (i3 > iLJ) {
                if (iLJ <= size) {
                    size = iLJ;
                }
                c118300cf.element = size;
                iLJ = i3;
            }
            int i4 = c118300cf.element;
            if (i4 >= iLJ) {
                return null;
            }
            listSubList = list.subList(i4, iLJ);
            return listSubList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            Object obj = listSubList;
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            return (List) obj;
        }
    }
}
