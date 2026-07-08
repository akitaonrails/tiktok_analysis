package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.127Z, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C127Z implements InterfaceC736910SvR<Object> {
    public static final C01GW<C127Z> LLILLJJLI = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(365));
    public final C127Y LL = new C127Y(this);

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LL;
    }

    public static Map LIZ(Object obj, Map map) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(C1741890vQh.LJIIIIZZ(obj));
            if (mapLJIIJ != null) {
                linkedHashMap.putAll(mapLJIIJ);
            }
            linkedHashMap.putAll(map);
            return linkedHashMap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C2097608Jq.LJ();
        }
    }
}
