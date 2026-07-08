package X;

import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.pia.core.PiaManifest;
import com.bytedance.pia.core.tracing.Tracing;
import com.bytedance.pia.core.worker.bridge.BridgeModule;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: X.1BOX, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BOX {
    public final C2204041BNy LIZ;
    public C1BP4 LIZIZ;

    public C1BOX(C2204041BNy c2204041BNy, PiaManifest piaManifest) {
        Object c098200Yq;
        WebView webView;
        WebSettings settings;
        this.LIZ = c2204041BNy;
        if (piaManifest.LIZLLL && C2203961BNq.LIZ().isPrefetchV1Enabled) {
            try {
                C1BOW c1bow = new C1BOW();
                c1bow.LJI = "Prefetch";
                c1bow.LJ = c2204041BNy.LJIJJLI;
                c1bow.LIZ = piaManifest.LIZ.toString();
                Uri uri = piaManifest.LIZJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("assets/js/");
                sbLIZ.append(piaManifest.LIZIZ);
                sbLIZ.append(".pia.worker.js");
                c1bow.LIZIZ = Uri.withAppendedPath(uri, C2188811AlT.LIZIZ(sbLIZ)).toString();
                View viewLJI = c2204041BNy.LJI();
                if ((viewLJI instanceof WebView) && (webView = (WebView) viewLJI) != null && (settings = webView.getSettings()) != null) {
                    settings.getUserAgentString();
                }
                c1bow.LIZJ = c2204041BNy;
                c1bow.LJFF = false;
                c098200Yq = c1bow.LIZ();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            final C1BP9 c1bp9 = (C1BP9) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
            if (c1bp9 != null) {
                C786410Ut5.LJJZZIII(C1287700jc8.LIZ(), new Runnable() { // from class: X.1BP3
                    /* JADX WARN: Type inference failed for: r2v3, types: [X.1BPX] */
                    public final void LIZ() {
                        Object c098200Yq2;
                        C1BOX c1box = this.LL;
                        try {
                            c098200Yq2 = new C1BP4(c1bp9);
                            C189200o6.m2constructorimpl(c098200Yq2);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            c098200Yq2 = new C098200Yq(th2);
                            C189200o6.m2constructorimpl(c098200Yq2);
                        }
                        final C1BOX c1box2 = this.LL;
                        if (C189200o6.m8isSuccessimpl(c098200Yq2)) {
                            final C1BP4 c1bp4 = (C1BP4) c098200Yq2;
                            c1bp4.LIZIZ("!function(){var e=globalThis.NativeModules,t=e.get(\"BaseModule\");globalThis.location={href:t.getHref()},globalThis.navigator={userAgent:t.getUserAgent()},globalThis.NativeModules={get:function(l){var a=e.get(l);return\"BaseModule\"==l?Object.assign(a,{storeNSRHtml:function(e){t.terminateWithResult({html:e})}}):a}}}();");
                            c1bp4.LJIILJJIL.LIZIZ("bridge", BridgeModule.class, c1bp4.LJIILLIIL);
                            c1bp4.LJ();
                            c1bp4.LIZIZ.LIZJ(new C2204401BPi(new InterfaceC1530550pvp() { // from class: X.1BPJ
                                @Override // X.InterfaceC1530550pvp
                                public final void accept(Object obj) {
                                    String str = (String) obj;
                                    c1box2.LIZ.LJII.LIZIZ("prefetch", 1001, str);
                                    C1BP6 c1bp6 = c1box2.LIZ.LJIJJ;
                                    n nVar = new n();
                                    nVar.LJJIIJ("error", str);
                                    c1bp6.LIZ(nVar, "pia.onWorkerError");
                                }
                            }, c1bp4));
                            final ?? r2 = new InterfaceC1530550pvp() { // from class: X.1BPX
                                @Override // X.InterfaceC1530550pvp
                                public final void accept(Object obj) {
                                    C1BP6 c1bp6 = c1box2.LIZ.LJIJJ;
                                    n nVar = new n();
                                    nVar.LJJIIJ("data", (String) obj);
                                    c1bp6.LIZ(nVar, "pia.onWorkerMessage");
                                }
                            };
                            c1bp4.LIZJ.LIZJ(new InterfaceC1530550pvp() { // from class: X.1BPh
                                @Override // X.InterfaceC1530550pvp
                                public final void accept(Object obj) {
                                    C1BP4 c1bp42 = c1bp4;
                                    InterfaceC1530550pvp interfaceC1530550pvp = r2;
                                    String str = (String) obj;
                                    c1bp42.getClass();
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append(c1bp42.LJII);
                                    sbLIZ2.append("Handle message from worker (Message: ");
                                    sbLIZ2.append(str);
                                    sbLIZ2.append(")");
                                    C1BPP.LJ(C2188811AlT.LIZIZ(sbLIZ2));
                                    interfaceC1530550pvp.accept(str);
                                }
                            });
                            final Tracing tracing = c1box2.LIZ.LJIILL;
                            final C2204571BPz c2204571BPz = new C2204571BPz(c1box2);
                            tracing.getClass();
                            C1287700jc8.LIZJ(new Runnable() { // from class: X.1BNd
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Tracing tracing2 = tracing;
                                    InterfaceC2203841BNe interfaceC2203841BNe = c2204571BPz;
                                    tracing2.getClass();
                                    C1C7U.LIZ("Tracing@6da2.subscribe$1L");
                                    Iterator it2 = ((ArrayList) tracing2.LIZ).iterator();
                                    while (it2.hasNext()) {
                                        interfaceC2203841BNe.accept(it2.next());
                                        if (interfaceC2203841BNe.LIZ()) {
                                            break;
                                        }
                                    }
                                    if (!interfaceC2203841BNe.LIZ()) {
                                        ((HashSet) tracing2.LIZIZ).add(interfaceC2203841BNe);
                                    }
                                    C1C7U.LIZIZ("Tracing@6da2.subscribe$1L");
                                }
                            });
                        }
                        C1BOX c1box3 = this.LL;
                        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
                        if (thM5exceptionOrNullimpl != null) {
                            c1box3.LIZ.LJII.LIZIZ("prefetch", 1003, Log.getStackTraceString(thM5exceptionOrNullimpl));
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                            c098200Yq2 = null;
                        }
                        c1box.LIZIZ = (C1BP4) c098200Yq2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("PrefetchManager@3dea.initializeWorker$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("PrefetchManager@3dea.initializeWorker$1");
                    }
                });
            }
        }
    }
}
