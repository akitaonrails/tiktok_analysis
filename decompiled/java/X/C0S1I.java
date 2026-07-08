package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS37S2100000_11;

/* JADX INFO: renamed from: X.0S1I, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S1I {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(C1608750rxx c1608750rxx) {
        ArrayList arrayList = null;
        if (c1608750rxx == null) {
            return null;
        }
        Set<? extends InterfaceC1608860ry8<?>> set = c1608750rxx.LIZIZ.LIZ;
        if (set != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(set, 10));
            Iterator<T> it2 = set.iterator();
            while (it2.hasNext()) {
                arrayList.add(((InterfaceC1608860ry8) it2.next()).LIZ().getString());
            }
        }
        return arrayList;
    }

    public static void LIZIZ(Integer num, C1608750rxx c1608750rxx, List list, String str, String str2) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0S1F(c1608750rxx, new AwS37S2100000_11(num, str, str2, 2), "avatar_component_click", list, null), 3);
    }
}
