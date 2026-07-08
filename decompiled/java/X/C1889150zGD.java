package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0zGD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1889150zGD {
    public static final void LIZ(AbstractC1865990yer abstractC1865990yer, List<C1889180zGG> list, Map<AbstractC1865990yer, C1889180zGG> map, Function1<? super C1889180zGG, Unit> function1) {
        C1889180zGG c1889180zGG = map.get(abstractC1865990yer);
        if (c1889180zGG != null && c1889180zGG.LIZLLL) {
            ((ArrayList) list).add(c1889180zGG);
            function1.invoke(c1889180zGG);
        }
    }
}
