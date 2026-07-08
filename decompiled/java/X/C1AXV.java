package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AXV, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AXV extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1AXM LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AXV(C1AXM c1axm, boolean z) {
        super(0);
        this.LL = c1axm;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1AZW c1azw = C1AZW.LIZ;
        String strLLIIII = this.LL.LLIIII(2129);
        c1azw.getClass();
        C1AZW.LIZ(strLLIIII, "reset", null, null);
        C1303200k18.LIZLLL = null;
        C1303200k18.LJ = null;
        C1303200k18.LJFF = null;
        this.LL.LJJLIIJ().LIZ();
        if (this.LLILLJJLI) {
            this.LL.LLIIJI(C2490609pQ.LIZIZ());
        }
        C1AXM c1axm = this.LL;
        c1axm.LLLLIIIILLL.LLIILII(c1axm.LJLI(), 2);
        this.LL.LLILII(null);
        C2180891AWx c2180891AWxLJLI = this.LL.LJLI();
        c2180891AWxLJLI.LLJILJIL = null;
        c2180891AWxLJLI.LLJJ.clear();
        for (Map.Entry<String, C1AYC> entry : this.LL.LJJJLL().entrySet()) {
            entry.getValue().LIZ(entry.getKey());
        }
        this.LL.LJJJLL().clear();
        HashMap<String, Map<String, String>> mapLJJLIIIIJ = this.LL.LJJLIIIIJ();
        C1AXM c1axm2 = this.LL;
        synchronized (mapLJJLIIIIJ) {
            try {
                c1axm2.LJJLIIIIJ().clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Map<String, Object> mapLJJL = this.LL.LJJL();
        C1AXM c1axm3 = this.LL;
        synchronized (mapLJJL) {
            try {
                c1axm3.LJJL().clear();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        HashMap<String, Map<String, String>> mapLJJLIIIJL = this.LL.LJJLIIIJL();
        C1AXM c1axm4 = this.LL;
        synchronized (mapLJJLIIIJL) {
            try {
                c1axm4.LJJLIIIJL().clear();
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                throw th3;
            }
        }
        HashMap<String, Map<String, JSONObject>> mapLJJLI = this.LL.LJJLI();
        C1AXM c1axm5 = this.LL;
        synchronized (mapLJJLI) {
            try {
                c1axm5.LJJLI().clear();
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                throw th4;
            }
        }
        this.LL.LLILLJJLI();
        ((ArrayList) this.LL.LLLLIIL).clear();
        this.LL.LL.LJFF.LJJZZI();
        return Unit.LIZ;
    }
}
