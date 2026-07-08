package X;

import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.08K8, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public abstract class C08K8 {
    public volatile Map<String, String> LIZ = C2097608Jq.LJ();
    public volatile Map<String, String> LIZIZ = C2097608Jq.LJ();
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public Set<? extends EnumC2366109Ox> LJ = C08CX.INSTANCE;

    public abstract Map<String, String> LIZ();

    public abstract String LIZIZ();

    public abstract String LIZJ();

    public abstract C01CW LIZLLL();

    public void LJ() {
    }

    public final void LJFF() {
        Object c098200Yq;
        int i = C01CX.LIZ[LIZLLL().ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new C1954807lC();
            }
            if (this.LJ.contains(C2366009Ow.LIZJ)) {
                Npth.addTag(LIZJ(), "true");
                return;
            }
            return;
        }
        if (!this.LJ.contains(C2366009Ow.LIZJ)) {
            C2097608Jq.LJ();
            return;
        }
        try {
            c098200Yq = LIZ();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Map mapLJ = C2097608Jq.LJ();
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = mapLJ;
        }
        Map<String, String> map = (Map) c098200Yq;
        if (true ^ map.isEmpty()) {
            Npth.addTag(LIZJ(), "true");
            this.LIZ = map;
        }
    }

    public final void LJI() {
        Object c098200Yq;
        try {
            c098200Yq = LIZ();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Map mapLJ = C2097608Jq.LJ();
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = mapLJ;
        }
        Map<String, String> map = (Map) c098200Yq;
        if (!(!map.isEmpty())) {
            this.LIZIZ = C2097608Jq.LJ();
            return;
        }
        this.LIZIZ = map;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZJ());
        sbLIZ.append("_pressure");
        Npth.addTag(C2188811AlT.LIZIZ(sbLIZ), "true");
    }
}
