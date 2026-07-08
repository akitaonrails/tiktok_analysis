package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.052m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12886052m extends C09AY implements Function0<ConcurrentHashMap<String, Object>> {
    public final /* synthetic */ AbstractC12885052l<STORAGE_TYPE> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12886052m(AbstractC12885052l<STORAGE_TYPE> abstractC12885052l) {
        super(0);
        this.LL = abstractC12885052l;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object>] */
    @Override // kotlin.jvm.functions.Function0
    public final ConcurrentHashMap<String, Object> invoke() {
        String strLIZ = this.LL.LIZ.LIZ();
        C01GW c01gw = C12889052p.LIZ;
        ?? r1 = ((ConcurrentHashMap) c01gw.getValue()).get(strLIZ);
        if (r1 != 0) {
            return r1;
        }
        ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
        ((ConcurrentHashMap) c01gw.getValue()).put(strLIZ, concurrentHashMap);
        return concurrentHashMap;
    }
}
