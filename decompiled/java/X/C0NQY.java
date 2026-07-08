package X;

import Y.ARunnableS109S0100000_9;
import Y.AfS0S1000100_9;
import Y.AfS178S0100000_9;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pns.gatekeeper.GatekeeperEngine;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0NQY, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NQY {
    public static final long LJIIIZ;
    public static final /* synthetic */ int LJIIJ = 0;
    public final C01GW LIZ = C452501pT.LIZIZ(new C593660NQe());
    public final Map<String, C0N0M> LIZIZ = new LinkedHashMap();
    public final Object LIZJ = new Object();
    public volatile boolean LIZLLL;
    public volatile boolean LJ;
    public volatile long LJFF;
    public final C01GW LJI;
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;

    static {
        TimeUnit.MINUTES.toMillis(30L);
        LJIIIZ = TimeUnit.SECONDS.toMillis(5L);
    }

    public C0NQY() {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LJI = C452501pT.LIZ(enumC452301pR, AFwS195S0000000_9.get$arr$(47));
        this.LJII = C452501pT.LIZ(enumC452301pR, new AwS553S0100000_9(this, 25));
        this.LJIIIIZZ = C452501pT.LIZ(enumC452301pR, AFwS195S0000000_9.get$arr$(46));
    }

    public final void LIZ(final boolean z) {
        if (C0XF5.LIZIZ() && C036E.LIZ.LIZJ == C0O0L.AVAILABLE) {
            LIZIZ(z);
        } else {
            C036E.LIZ.LIZ(new C0H62() { // from class: X.0NQZ
                @Override // X.C0H62
                public final void onChange(C0O0L c0o0l, C0O0L c0o0l2) {
                    if (c0o0l2 == C0O0L.AVAILABLE) {
                        C036E.LIZ.LIZLLL(this);
                        this.LL.LIZIZ(z);
                    }
                }
            });
        }
    }

    public final void LIZIZ(boolean z) {
        C11NZ<DecisionMakerNetworkApi.DecisionMakerResponseModel> data;
        if (C290540Ba8.LIZ()) {
            synchronized (this) {
                try {
                    if (this.LJ) {
                        return;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (z && jCurrentTimeMillis - this.LJFF < LJIIIZ) {
                        return;
                    }
                    this.LJ = true;
                    this.LJFF = jCurrentTimeMillis;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        if (((Boolean) C593690NQh.LIZ.getValue()).booleanValue()) {
            C593700NQi c593700NQi = (C593700NQi) this.LJI.getValue();
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("report_to_tea", "1"));
            C0NFL c0nfl = new C0NFL(this, null);
            C09BB c09bb = c593700NQi.LIZ;
            c09bb.getClass();
            data = C11NZ.LJIJJLI(new C09B9(c09bb, "/tiktok/ppf/api/eligibility/v2", mapLIZJ, c0nfl));
        } else {
            data = ((DecisionMakerNetworkApi) this.LJIIIIZZ.getValue()).getData();
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        data.LJJIJIIJIL(new AfS0S1000100_9("/tiktok/ppf/api/eligibility/v2", jCurrentTimeMillis2, 2)).LJJIJIIJI(new AfS0S1000100_9("/tiktok/ppf/api/eligibility/v2", jCurrentTimeMillis2, 3)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0NQd
            @Override // X.C09JN
            public final void accept(Object obj) {
                String strLJIILL;
                final List listLLIIII;
                GatekeeperEngine gatekeeperEngine;
                C1C7U.LIZ("GatekeeperDecisionMaker@e782.loadEligibilityDataReal$1");
                DecisionMakerNetworkApi.DecisionMakerResponseModel decisionMakerResponseModel = (DecisionMakerNetworkApi.DecisionMakerResponseModel) obj;
                this.LL.LJ = false;
                if (decisionMakerResponseModel.status_code == 0) {
                    C0NQY c0nqy = this.LL;
                    List<DecisionMakerNetworkApi.EligibilityModel> eligibilityData = decisionMakerResponseModel.getEligibilityData();
                    c0nqy.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (DecisionMakerNetworkApi.EligibilityModel eligibilityModel : eligibilityData) {
                        linkedHashMap.put(eligibilityModel.idValue, eligibilityModel);
                    }
                    ((Map) c0nqy.LIZ.getValue()).clear();
                    ((Map) c0nqy.LIZ.getValue()).putAll(linkedHashMap);
                    C593670NQf c593670NQf = C593670NQf.LIZ;
                    try {
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (!linkedHashMap.isEmpty()) {
                        strLJIILL = C1703730uR9.LIZ().LJIILL(linkedHashMap);
                    } else {
                        strLJIILL = "";
                    }
                    Keva keva = C593670NQf.LIZIZ;
                    c593670NQf.getClass();
                    keva.storeString(C593670NQf.LIZ(), strLJIILL);
                    try {
                        Object service = ServiceManager.get().getService(IGatekeeperService.class);
                        if ((service instanceof GatekeeperEngine) && (gatekeeperEngine = (GatekeeperEngine) service) != null) {
                            gatekeeperEngine.LJIILJJIL(decisionMakerResponseModel);
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                    this.LL.LIZLLL = true;
                    C0NQY c0nqy2 = this.LL;
                    synchronized (c0nqy2.LIZJ) {
                        try {
                            listLLIIII = C13LP.LLIIII(((LinkedHashMap) c0nqy2.LIZIZ).values());
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                            throw th3;
                        }
                    }
                    C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0N0L
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("GatekeeperDecisionMaker@e782.runTasks$1");
                            try {
                                Iterator<C0N0M> it2 = listLLIIII.iterator();
                                while (it2.hasNext()) {
                                    it2.next().execute();
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("GatekeeperDecisionMaker@e782.runTasks$1");
                        }
                    });
                }
                C1C7U.LIZIZ("GatekeeperDecisionMaker@e782.loadEligibilityDataReal$1");
            }
        }, new AfS178S0100000_9(this, 4));
    }

    public final void LIZJ(String str) {
        C0N0M c0n0m;
        synchronized (this.LIZJ) {
            try {
                c0n0m = (C0N0M) ((LinkedHashMap) this.LIZIZ).get(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS109S0100000_9(c0n0m, 18));
    }
}
