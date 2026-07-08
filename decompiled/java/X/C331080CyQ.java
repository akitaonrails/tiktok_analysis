package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CyQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C331080CyQ extends C09AY implements Function1<C331090CyR, C331090CyR> {
    public final /* synthetic */ List<C331070CyP> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C331080CyQ(List<C331070CyP> list) {
        super(1);
        this.LL = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C331090CyR invoke(C331090CyR c331090CyR) {
        C331090CyR c331090CyR2 = c331090CyR;
        List<C331070CyP> list = this.LL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C331070CyP c331070CyP : list) {
            C1876907Wt c1876907Wt = c331070CyP.LLIZ;
            Object arrayList = linkedHashMap.get(c1876907Wt);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(c1876907Wt, arrayList);
            }
            ((List) arrayList).add(c331070CyP);
        }
        int size = linkedHashMap.keySet().size();
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        C1876907Wt c1876907Wt2 = null;
        for (C331070CyP c331070CyP2 : list) {
            if (size > 1 && !Intrinsics.LJFF(c331070CyP2.LLIZ, c1876907Wt2)) {
                c1876907Wt2 = c331070CyP2.LLIZ;
                c13dvLIZIZ.add(c1876907Wt2);
            }
            c13dvLIZIZ.add(c331070CyP2);
        }
        return C331090CyR.LIZ(c331090CyR2, true, C1697820uHc.LIZ(c13dvLIZIZ), null, null, 12);
    }
}
