package X;

import android.view.Window;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveForceRefreshRateSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveFluencyPeriodIntervalSetting;
import com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor;
import com.bytedance.android.livesdkapi.host.IHostPerformanceOpt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jwk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1300480jwk implements InterfaceC1162920gMs {
    public final String LIZ;
    public final int LIZIZ;
    public final InterfaceC1300440jwg LIZJ;
    public boolean LIZLLL;
    public final InterfaceC1300500jwm LJ;
    public final InterfaceC1162920gMs LJFF;
    public double LJI;
    public JSONObject LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public long LJIIJ;
    public C1300510jwn LJIIJJI;
    public final Map<String, String> LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public final int LJIILL;
    public Pair<Float, Float> LJIILLIIL;
    public Map<String, String> LJIIZILJ;
    public Function0<? extends Map<String, String>> LJIJ;
    public final C01GW LJIJI;

    @Override // X.InterfaceC1162920gMs
    public final int LIZ() {
        return 60;
    }

    @Override // X.InterfaceC1162920gMs
    public final void LIZIZ(C0VVO c0vvo) {
    }

    @Override // X.InterfaceC1162920gMs
    public final void LIZLLL(C1163640gO2 c1163640gO2) {
    }

    @Override // X.InterfaceC1162920gMs
    public final void LJ(C0VVN c0vvn) {
    }

    @Override // X.InterfaceC1162920gMs
    public final void start() {
        LIZJ(null);
    }

    @Override // X.InterfaceC1162920gMs
    public final void stop() {
        int value;
        InterfaceC1101330elX interfaceC1101330elX;
        InterfaceC1300500jwm interfaceC1300500jwm;
        IHostPerformanceOpt iHostPerformanceOpt = (IHostPerformanceOpt) C1161920gLG.LIZJ(IHostPerformanceOpt.class);
        if (iHostPerformanceOpt != null) {
            iHostPerformanceOpt.iG1(this.LIZ);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LJIILJJIL = jCurrentTimeMillis;
        if (this.LJIIIZ && (interfaceC1300500jwm = this.LJ) != null) {
            interfaceC1300500jwm.LIZJ(jCurrentTimeMillis, this.LIZ);
        }
        this.LJIIIZ = false;
        if (this.LIZLLL && (value = (int) (((this.LJIILJJIL - this.LJIILIIL) + ((long) ((int) LiveFluencyPeriodIntervalSetting.INSTANCE.getValue()))) / ((long) LSPassThroughRecordSizeConfig.DEFAULT))) > 0 && (interfaceC1101330elX = C1EOY.LJIJI) != null) {
            this.LJIILLIIL = interfaceC1101330elX.LJFF(value);
        }
        this.LJFF.stop();
    }

    @Override // X.InterfaceC1162920gMs
    public final void LIZJ(Window window) {
        IHostPerformanceOpt iHostPerformanceOpt = (IHostPerformanceOpt) C1161920gLG.LIZJ(IHostPerformanceOpt.class);
        if (iHostPerformanceOpt != null) {
            iHostPerformanceOpt.sh(this.LIZ);
        }
        if (((Number) this.LJIJI.getValue()).longValue() % ((long) this.LIZIZ) != 0) {
            return;
        }
        this.LJIILIIL = System.currentTimeMillis();
        this.LJFF.LIZJ(window);
        this.LJIIIZ = true;
        InterfaceC1300500jwm interfaceC1300500jwm = this.LJ;
        if (interfaceC1300500jwm != null) {
            interfaceC1300500jwm.LIZ(this.LJIILIIL, this.LIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0341  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(boolean r24) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 845
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1300480jwk.LJFF(boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.0gO2] */
    public C1300480jwk(String str, int i, InterfaceC1300440jwg interfaceC1300440jwg, InterfaceC1300500jwm interfaceC1300500jwm, int i2) {
        interfaceC1300440jwg = (i2 & 4) != 0 ? null : interfaceC1300440jwg;
        interfaceC1300500jwm = (i2 & 16) != 0 ? null : interfaceC1300500jwm;
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = interfaceC1300440jwg;
        this.LIZLLL = false;
        this.LJ = interfaceC1300500jwm;
        IHostPerformanceMonitor iHostPerformanceMonitor = (IHostPerformanceMonitor) C1161920gLG.LIZJ(IHostPerformanceMonitor.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("live_fluency_");
        sbLIZ.append(str);
        InterfaceC1162920gMs interfaceC1162920gMsNt0 = iHostPerformanceMonitor.nt0(C2188811AlT.LIZIZ(sbLIZ));
        this.LJFF = interfaceC1162920gMsNt0;
        this.LJIIL = new LinkedHashMap();
        this.LJIILL = 60;
        this.LJIJI = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(510));
        interfaceC1162920gMsNt0.LIZIZ(new C0VVO() { // from class: X.0jwl
            @Override // X.C0VVO
            public final void LIZIZ(double d) {
                this.LIZ.LJI = d;
            }
        });
        interfaceC1162920gMsNt0.LJ(new C0VVN() { // from class: X.0gO3
            @Override // X.C0VVN
            public final void LIZLLL(JSONObject jSONObject) throws JSONException {
                C1300480jwk c1300480jwk = this.LIZ;
                c1300480jwk.LJII = jSONObject;
                c1300480jwk.LJFF(false);
            }
        });
        interfaceC1162920gMsNt0.LIZLLL(new C0VVQ() { // from class: X.0gO2
            @Override // X.C0VVQ
            public final void onEmpty() throws JSONException {
                this.LIZ.LJII = new JSONObject();
                this.LIZ.LJFF(true);
            }
        });
        if (!LiveForceRefreshRateSetting.INSTANCE.getValue()) {
            this.LJIILL = interfaceC1162920gMsNt0.LIZ();
        }
    }
}
