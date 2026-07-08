package X;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1DGY, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DGY extends C09AY implements Function0<Map<Class<C1DGM>, ? extends C1DGM>> {
    public final /* synthetic */ C1DGX<KEY> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1DGY(C1DGX<KEY> c1dgx) {
        super(0);
        this.LL = c1dgx;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<Class<C1DGM>, ? extends C1DGM> invoke() {
        Set<C1DGM> setKeySet = this.LL.LIZIZ.LIZ().LIZLLL.keySet();
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(setKeySet, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (Object obj : setKeySet) {
            linkedHashMap.put(obj.getClass(), obj);
        }
        return linkedHashMap;
    }
}
