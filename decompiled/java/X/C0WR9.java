package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0WR9, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0WR9 implements C0WRO {
    public final Map<String, C0WR6> LIZ;

    public abstract C0WRM LIZIZ();

    public String toString() {
        return this.LIZ.toString();
    }

    public C0WR9(Map<String, C0WR6> map) {
        this.LIZ = map;
    }

    public void LIZJ(Map<String, C0WR6> map) {
        Object c098200Yq;
        try {
            for (Map.Entry<String, C0WR6> entry : this.LIZ.entrySet()) {
                if (entry.getValue().LIZIZ != null) {
                    C0WR6 c0wq8 = new C0WQ8(entry.getValue().LIZ, entry.getValue().LIZ());
                    c0wq8.LIZIZ = entry.getValue().LIZ();
                    map.put(entry.getKey(), c0wq8);
                } else if (entry.getValue() instanceof C0WR8) {
                    C0WR8 c0wr8 = (C0WR8) entry.getValue();
                    c0wr8.getClass();
                    C0WR6 c0wr82 = new C0WR8(c0wr8.LIZ, c0wr8.LIZJ);
                    if (C823240WRe.LIZ().preloadFields.contains(entry.getKey())) {
                        c0wr82.LIZ();
                    }
                    map.put(entry.getKey(), c0wr82);
                } else {
                    map.put(entry.getKey(), entry.getValue());
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C823280WRi.LIZLLL(thM5exceptionOrNullimpl);
        }
    }

    @Override // X.C0WRO
    public C0WR6 query(String str) {
        return this.LIZ.get(str);
    }

    public final void LIZLLL(String str, String str2, C0WR6 c0wr6) throws Exception {
        C0WQ7.LIZ.getClass();
        C0WQG c0wqgLIZ = C0WQ7.LIZ(str, str2);
        if (c0wqgLIZ != null) {
            if (c0wqgLIZ.LIZ == LIZIZ()) {
                if (c0wqgLIZ.LIZIZ == c0wr6.LIZ) {
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("field type unmatched in ");
                sbLIZ.append(str);
                sbLIZ.append(": ");
                sbLIZ.append(str2);
                sbLIZ.append(", define: ");
                sbLIZ.append(c0wqgLIZ);
                final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                throw new Exception(strLIZIZ) { // from class: X.0WRA
                };
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("field scope unmatched in ");
            sbLIZ2.append(str);
            sbLIZ2.append(": ");
            sbLIZ2.append(str2);
            sbLIZ2.append(", define: ");
            sbLIZ2.append(c0wqgLIZ);
            final String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            throw new Exception(strLIZIZ2) { // from class: X.0WRA
            };
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("field define not exists in ");
        sbLIZ3.append(str);
        sbLIZ3.append(": ");
        sbLIZ3.append(str2);
        final String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        throw new Exception(strLIZIZ3) { // from class: X.0WRA
        };
    }

    public void LIZ(String str, String str2, C0WR6 c0wr6, boolean z) {
        Object c098200Yq;
        try {
            if (!z) {
                this.LIZ.put(str2, c0wr6);
            } else {
                LIZLLL(str, str2, c0wr6);
                this.LIZ.put(str2, c0wr6);
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C823280WRi.LJ(thM5exceptionOrNullimpl, "ContextInfo.add: error", C2097608Jq.LJIIJ(new Pair("pumbaa_exception_type", "field_validate_error"), new Pair("pumbaa_trigger_biz", str), new Pair("pumbaa_key", str2)));
        }
    }
}
