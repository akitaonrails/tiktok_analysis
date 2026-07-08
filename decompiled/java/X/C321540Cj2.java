package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Cj2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C321540Cj2 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Map<String, String> LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C321540Cj2(Map<String, String> map, boolean z, C013C c013c) {
        super(0);
        this.LL = map;
        this.LLILLJJLI = z;
        this.LLILLL = c013c;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Map<String, String> map = this.LL;
        boolean z = this.LLILLJJLI;
        C013C c013c = this.LLILLL;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Map<Integer, String> map2 = C798410VTr.LIZ;
            map.putAll(C798410VTr.LIZJ(false, z && !c013c.element));
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("memory dump v2 cost:");
            sbLIZ.append(jCurrentTimeMillis2);
            C2188811AlT.LIZIZ(sbLIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return Unit.LIZ;
    }
}
