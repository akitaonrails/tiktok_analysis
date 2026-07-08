package X;

import android.net.ConnectivityManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.effectmanager.common.listener.IMonitorService;
import com.ss.android.ugc.effectmanager.common.model.ApiState;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.ss.android.ugc.effectmanager.knadapt.KNMonitorService;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0sbV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1633270sbV {
    public static final C1633270sbV LIZIZ = new C1633270sbV();
    public final /* synthetic */ C1633280sbW LIZ;

    public final void LIZ() {
        C1633280sbW c1633280sbW = this.LIZ;
        c1633280sbW.LJII.setValue(null);
        c1633280sbW.LJIIIZ.setValue(null);
        c1633280sbW.LJIIIIZZ.setValue(null);
        c1633280sbW.LJFF = null;
        c1633280sbW.LJI = null;
        c1633280sbW.LIZJ.cancel();
        InterfaceC332260D0u<Pair<Integer, ApiState<PanelInfoModel>>> interfaceC332260D0u = c1633280sbW.LIZIZ.LIZIZ;
        ApiState.Loading loading = ApiState.Loading.INSTANCE;
        interfaceC332260D0u.setValue(new Pair<>(-1, loading));
        c1633280sbW.LIZIZ.LIZ.setValue(loading);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [T, X.0sbW] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.0scE] */
    public C1633270sbV() {
        Object c098200Yq;
        C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZJ);
        ?? r8 = new InterfaceC1633640sc6() { // from class: X.0scE
            public final InterfaceC1633730scF LIZ;

            {
                IMonitorService iMonitorService = (IMonitorService) PluggableExtentionKt.pluggableSpi$default(IMonitorService.class, false, false, false, 14, null);
                this.LIZ = iMonitorService != null ? new KNMonitorService(iMonitorService) : null;
            }

            @Override // X.InterfaceC1633640sc6
            public final void LIZ(InterfaceC1633630sc5 interfaceC1633630sc5) {
                EnumC1641410sod type = interfaceC1633630sc5.getType();
                InterfaceC1633730scF interfaceC1633730scF = this.LIZ;
                if (interfaceC1633730scF != null) {
                    C1633710scD metrics = interfaceC1633630sc5.getMetrics();
                    Throwable thLIZ = interfaceC1633630sc5.LIZ();
                    C13DA c13da = new C13DA();
                    String message = thLIZ.getMessage();
                    if (message == null && (message = C13LE.LIZ(thLIZ.getClass()).LJI()) == null) {
                        message = "Unknown error";
                    }
                    c13da.put("error_msg", message);
                    LIZLLL(c13da, metrics);
                    LIZJ(c13da, type);
                    interfaceC1633730scF.monitorStatusRate("ep_common_event", 1, c13da.build());
                    return;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }

            public static void LIZJ(C13DA c13da, EnumC1641410sod enumC1641410sod) {
                int i = C1633680scA.LIZ[enumC1641410sod.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            c13da.put("url_path", "/effect/horizontal/stream");
                            c13da.put("event_name", "proxy_horizontal_panel");
                            return;
                        }
                        throw new C1954807lC();
                    }
                    c13da.put("url_path", "/panel/info");
                    c13da.put("event_name", "panel");
                    return;
                }
                c13da.put("url_path", "/effect/horizontal/effects");
                c13da.put("event_name", "full_width_horizontal");
            }

            public static void LIZLLL(C13DA c13da, C1633710scD c1633710scD) {
                Pair[] pairArr = new Pair[9];
                String str = c1633710scD.LJ;
                if (str == null) {
                    str = "";
                }
                pairArr[0] = new Pair("log_id", str);
                pairArr[1] = new Pair("panel", "default");
                pairArr[2] = new Pair("category", "default");
                pairArr[3] = new Pair("duration", Long.valueOf(C19990113Jj.LJIIIZ(c1633710scD.LIZLLL)));
                pairArr[4] = new Pair("network_time", Long.valueOf(C19990113Jj.LJIIIZ(c1633710scD.LIZ)));
                pairArr[5] = new Pair("json_time", Long.valueOf(C19990113Jj.LJIIIZ(c1633710scD.LIZIZ)));
                pairArr[6] = new Pair("io_time", Long.valueOf(C19990113Jj.LJIIIZ(c1633710scD.LIZJ)));
                pairArr[7] = new Pair("size", Long.valueOf(c1633710scD.LJFF));
                pairArr[8] = new Pair("is_proxy", "1");
                c13da.putAll(C2097608Jq.LJIIIIZZ(pairArr));
            }

            @Override // X.InterfaceC1633640sc6
            public final void LIZIZ(C1633710scD c1633710scD, EnumC1641410sod enumC1641410sod) {
                InterfaceC1633730scF interfaceC1633730scF = this.LIZ;
                if (interfaceC1633730scF != null) {
                    C13DA c13da = new C13DA();
                    LIZLLL(c13da, c1633710scD);
                    LIZJ(c13da, enumC1641410sod);
                    interfaceC1633730scF.monitorStatusRate("ep_common_event", 0, c13da.build());
                    return;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        };
        try {
            C844470XAv.LIZ.getClass();
            Object objH2 = C786410Ut5.H2(C844470XAv.LIZ(), "connectivity");
            c098200Yq = objH2 instanceof ConnectivityManager ? (ConnectivityManager) objH2 : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C1490940otw c1490940otw = new C1490940otw((ConnectivityManager) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq));
        C259800zU c259800zU = new C259800zU();
        ApiState.Loading loading = ApiState.Loading.INSTANCE;
        ?? c1633280sbW = new C1633280sbW(c054gLIZ, new C1633470sbp(C1BNE.LIZ(loading), C1BNE.LIZ(new Pair(-1, loading)), r8, c1490940otw, new AwS569S0100000_25(c259800zU, (C259800zU<C1633280sbW>) 880), new AwS569S0100000_25(c259800zU, (C259800zU<C1633280sbW>) 881)), c1490940otw);
        c259800zU.element = c1633280sbW;
        this.LIZ = c1633280sbW;
    }

    public final void LIZIZ(C1633200sbO c1633200sbO, C1633750scH c1633750scH, C1633780scK c1633780scK, String str, Function0 function0) {
        C1633280sbW c1633280sbW = this.LIZ;
        C23250099c.LIZLLL(c1633280sbW.LIZ, null, null, new C1633260sbU(c1633280sbW, c1633200sbO, function0, str, c1633750scH, c1633780scK, null), 3);
    }
}
