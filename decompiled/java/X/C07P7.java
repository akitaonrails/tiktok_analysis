package X;

import com.ss.android.ugc.aweme.ab.SectionVoListImageConfig;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07P7, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07P7 {
    public static final boolean LIZ(C1422405hW c1422405hW) {
        C07P8.LIZ.getClass();
        if (Intrinsics.LJFF(((SectionVoListImageConfig) C07P8.LIZJ.getValue()).enable, Boolean.TRUE)) {
            List<C1397705dX> list = c1422405hW.LIZJ;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            for (C1397705dX c1397705dX : list) {
                C07P8 c07p8 = C07P8.LIZ;
                long j = c1397705dX.LIZIZ;
                c07p8.getClass();
                C01GW c01gw = C07P8.LIZJ;
                List<Long> list2 = ((SectionVoListImageConfig) c01gw.getValue()).list;
                if (list2 == null || !list2.isEmpty()) {
                    List<Long> list3 = ((SectionVoListImageConfig) c01gw.getValue()).list;
                    if (list3 != null && list3.contains(Long.valueOf(j))) {
                        return true;
                    }
                }
            }
            return false;
        }
        List<C1397705dX> list4 = c1422405hW.LIZJ;
        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
            Iterator<C1397705dX> it2 = list4.iterator();
            while (it2.hasNext()) {
                long j2 = it2.next().LIZIZ;
                if (j2 == 4 || j2 == 9) {
                    return true;
                }
            }
        }
        return false;
    }
}
