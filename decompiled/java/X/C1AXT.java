package X;

import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AXT, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AXT extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1AXM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AXT(C1AXM c1axm) {
        super(0);
        this.LL = c1axm;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String strLLIIII = this.LL.LLIIII(1434);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL.LJLLL());
        sbLIZ.append(":destroy");
        C1AZW.LJIIJ(12, strLLIIII, C2188811AlT.LIZIZ(sbLIZ), null, null);
        C1303200k18.LIZLLL = null;
        C1303200k18.LJ = null;
        C1303200k18.LJFF = null;
        this.LL.LJJLIIJ().LIZ();
        this.LL.LLIIJI(C2490609pQ.LIZIZ());
        C1AXM c1axm = this.LL;
        c1axm.LLLLIIIILLL.LLIILII(c1axm.LJLI(), 2);
        C1AXM c1axm2 = this.LL;
        ViewGroup viewGroup = c1axm2.LLLLIILL;
        if (viewGroup != null) {
            c1axm2.LJJIIJ();
            C786410Ut5.LJJJLZIJ(c1axm2.LLJJI, viewGroup);
        }
        C2180891AWx c2180891AWxLJLI = this.LL.LJLI();
        c2180891AWxLJLI.LLJILJIL = null;
        c2180891AWxLJLI.LLJJ.clear();
        this.LL.LJJJLL().clear();
        HashMap<String, Map<String, String>> mapLJJLIIIIJ = this.LL.LJJLIIIIJ();
        C1AXM c1axm3 = this.LL;
        synchronized (mapLJJLIIIIJ) {
            try {
                c1axm3.LJJLIIIIJ().clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        HashMap<String, Map<String, String>> mapLJJLIIIJL = this.LL.LJJLIIIJL();
        C1AXM c1axm4 = this.LL;
        synchronized (mapLJJLIIIJL) {
            try {
                c1axm4.LJJLIIIJL().clear();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        Map<String, Object> mapLJJL = this.LL.LJJL();
        C1AXM c1axm5 = this.LL;
        synchronized (mapLJJL) {
            try {
                c1axm5.LJJL().clear();
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                throw th3;
            }
        }
        for (Map.Entry<String, C1AYC> entry : this.LL.LJJJLL().entrySet()) {
            entry.getValue().LIZ(entry.getKey());
        }
        this.LL.LJJLIIIIJ().clear();
        Map<String, String> map = this.LL.LLILZIL;
        if (map != null) {
            ((LinkedHashMap) map).clear();
        }
        HashMap<String, Map<String, JSONObject>> mapLJJLI = this.LL.LJJLI();
        C1AXM c1axm6 = this.LL;
        synchronized (mapLJJLI) {
            try {
                c1axm6.LJJLI().clear();
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                throw th4;
            }
        }
        this.LL.LLILLJJLI();
        this.LL.LLLJ = null;
        return Unit.LIZ;
    }
}
