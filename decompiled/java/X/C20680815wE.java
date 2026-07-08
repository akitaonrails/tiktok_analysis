package X;

import android.util.SparseArray;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.15wE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20680815wE extends C09AY implements Function2<SparseArray<C20680915wF>, Map<String, Object>, Unit> {
    public C20680815wE() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(SparseArray<C20680915wF> sparseArray, Map<String, Object> map) {
        int i;
        SparseArray<C20680915wF> sparseArray2 = sparseArray;
        Map<String, Object> map2 = map;
        if (!sparseArray2.contains(8)) {
            i = 0;
        } else if (sparseArray2.get(8).LIZ > sparseArray2.get(5).LIZ) {
            i = 1;
        } else {
            i = 2;
        }
        map2.put("preload_status", Integer.valueOf(i));
        return Unit.LIZ;
    }
}
