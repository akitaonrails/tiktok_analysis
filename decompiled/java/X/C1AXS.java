package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AXS, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AXS extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1AXM LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AXS(C1AXM c1axm, String str) {
        super(0);
        this.LL = c1axm;
        this.LLILLJJLI = str;
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
        this.LL.LLILII(this.LLILLJJLI);
        C2180891AWx c2180891AWxLJLI = this.LL.LJLI();
        c2180891AWxLJLI.LLJILJIL = null;
        c2180891AWxLJLI.LLJJ.clear();
        C1AXM c1axm2 = this.LL;
        c1axm2.LLJJJJLIIL = null;
        c1axm2.LJJJLL().clear();
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
        Map<String, Object> mapLJJL = this.LL.LJJL();
        C1AXM c1axm4 = this.LL;
        synchronized (mapLJJL) {
            try {
                c1axm4.LJJL().clear();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        HashMap<String, Map<String, String>> mapLJJLIIIJL = this.LL.LJJLIIIJL();
        C1AXM c1axm5 = this.LL;
        synchronized (mapLJJLIIIJL) {
            try {
                c1axm5.LJJLIIIJL().clear();
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                throw th3;
            }
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
        for (Map.Entry<String, C1AYC> entry : this.LL.LJJJLL().entrySet()) {
            entry.getValue().LIZ(entry.getKey());
        }
        this.LL.LJJLIIIIJ().clear();
        C1AXM c1axm7 = this.LL;
        c1axm7.LLLJ = null;
        c1axm7.LLILLJJLI();
        C965220bE0 c965220bE0 = this.LL.LL.LJIIJ;
        if (c965220bE0 != null) {
            c965220bE0.LIZIZ();
            c965220bE0.LLILLJJLI = 0;
            c965220bE0.LLILZLL = null;
        }
        C1AXM c1axm8 = this.LL;
        c1axm8.LLJL = null;
        ((ArrayList) c1axm8.LLLLIIL).clear();
        this.LL.LLLLIL = true;
        return Unit.LIZ;
    }
}
