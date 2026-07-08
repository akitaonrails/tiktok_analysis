package X;

import Y.ARunnableS117S0100000_17;
import com.bytedance.android.livesdk.livesetting.gift.GiftReceiveFlowFluencyOptSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS205S0000000_17;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fkD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1138950fkD {
    public InterfaceC1139030fkL LIZ;
    public Double LIZIZ;
    public long LJ;
    public C1139000fkI LJFF;
    public Function1<? super C1139000fkI, Unit> LJI;
    public final C11NJ LIZJ = new C11NJ();
    public final ArrayList<C1139040fkM> LIZLLL = new ArrayList<>();
    public final C01GW LJII = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(136));
    public final ARunnableS117S0100000_17 LJIIIIZZ = new ARunnableS117S0100000_17(this, 144);

    public final void LIZIZ() {
        this.LIZJ.LJ();
        LIZ(System.currentTimeMillis());
        InterfaceC1139030fkL interfaceC1139030fkL = this.LIZ;
        if (interfaceC1139030fkL != null) {
            interfaceC1139030fkL.stop();
        }
        this.LJI = null;
        C1141290fnz.LIZ.removeCallbacks(this.LJIIIIZZ);
    }

    public final void LIZ(long j) {
        Object c098200Yq;
        JSONObject jSONObjectLIZ;
        if (GiftReceiveFlowFluencyOptSetting.INSTANCE.getEnabled()) {
            return;
        }
        try {
            InterfaceC1139050fkN interfaceC1139050fkN = (InterfaceC1139050fkN) this.LJII.getValue();
            if (interfaceC1139050fkN != null && (jSONObjectLIZ = interfaceC1139050fkN.LIZ()) != null) {
                double dOptDouble = jSONObjectLIZ.optDouble("render_fps:", -1.0d);
                double d = 0.0d;
                if (dOptDouble < 0.0d) {
                    dOptDouble = 0.0d;
                }
                double dOptDouble2 = jSONObjectLIZ.optDouble("push_client_fps:", -1.0d);
                if (dOptDouble2 >= 0.0d) {
                    d = dOptDouble2;
                }
                C1139040fkM c1139040fkM = new C1139040fkM(dOptDouble, d, this.LJ, j);
                synchronized (this.LIZLLL) {
                    try {
                        this.LIZLLL.add(c1139040fkM);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }
}
