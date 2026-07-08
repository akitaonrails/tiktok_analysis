package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.pia.core.tracing.EventName;
import com.bytedance.pia.core.tracing.Tracing;
import com.bytedance.pia.core.worker.binding.BaseModule;
import com.bytedance.pia.core.worker.network.WorkerDelegate;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vmsdk.jsbridge.JSModuleManager;
import com.bytedance.vmsdk.jsbridge.utils.ReadableMap;
import com.bytedance.vmsdk.monitor.VmSdkMonitor;
import com.bytedance.vmsdk.worker.JsWorker;
import com.google.gson.n;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.1BP4, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BP4 implements InterfaceC1542530qF9 {
    public final C1BPD<String> LIZIZ = new C1BPD<>();
    public final C1BPD<String> LIZJ;
    public final C1BPD<n> LIZLLL;
    public final C1BPD<n> LJ;
    public final BaseModule LJFF;
    public final String LJI;
    public final String LJII;
    public final Uri LJIIIIZZ;
    public final String LJIIIZ;
    public final Uri LJIIJ;
    public final InterfaceC1535500q3o LJIIJJI;
    public final String LJIIL;
    public final JsWorker LJIILIIL;
    public final JSModuleManager LJIILJJIL;
    public final Map<String, ?> LJIILL;
    public final C1BP6 LJIILLIIL;
    public final C2204051BNz LJIIZILJ;
    public final InterfaceC1530550pvp<n> LJIJ;
    public final C1BP7 LJIJI;
    public InterfaceC1542530qF9 LJIJJ;
    public EnumC2204371BPf LJIJJLI;
    public final C650110Pej LJIL;

    @Override // X.InterfaceC1542530qF9
    public final void release() {
        LJFF(null);
    }

    public final boolean LIZ() {
        return this.LJIJJLI != EnumC2204371BPf.Terminate && this.LJIILIIL.isRunning();
    }

    public final void LJ() {
        C1BP7 c1bp7 = this.LJIJI;
        if (c1bp7 == null) {
            this.LJIIZILJ.LJIILJJIL.LIZJ(System.currentTimeMillis(), "request_worker.start");
        } else {
            this.LJIIZILJ.LJIILJJIL.LIZJ(c1bp7.LJIIIIZZ, "request_worker.start");
        }
        AtomicBoolean atomicBoolean = C1BOE.LIZ;
        if (this.LJIJJLI != EnumC2204371BPf.Create) {
            return;
        }
        this.LJIJJLI = EnumC2204371BPf.Fetching;
        Tracing.Event eventLJI = LJI(EventName.WorkerScriptRequestStart);
        eventLJI.args.put("url", this.LJIIIIZZ.toString());
        eventLJI.LIZ();
        C1BP7 c1bp72 = this.LJIJI;
        if (c1bp72 == null) {
            String str = this.LJIIIZ;
            if (str != null) {
                LIZLLL(Boolean.TRUE, str);
                return;
            } else {
                this.LJIJJ = this.LJIIJJI.LIZIZ(EnumC1535440q3i.Auto, new InterfaceC1535470q3l() { // from class: X.1BQ5
                    @Override // X.InterfaceC1535470q3l
                    public final /* synthetic */ Map getRequestHeaders() {
                        return null;
                    }

                    @Override // X.InterfaceC1535470q3l
                    public final /* synthetic */ boolean isForMainFrame() {
                        return false;
                    }

                    @Override // X.InterfaceC1535470q3l
                    public final Uri getUrl() {
                        return this.LIZ.LJIIIIZZ;
                    }
                }, new InterfaceC1530550pvp() { // from class: X.1BPU
                    @Override // X.InterfaceC1530550pvp
                    public final void accept(Object obj) {
                        boolean z;
                        C1BP4 c1bp4 = this.LIZ;
                        InterfaceC1532650pzD interfaceC1532650pzD = (InterfaceC1532650pzD) obj;
                        c1bp4.getClass();
                        try {
                            String strLIZ = C21346518gJ.LIZ(interfaceC1532650pzD);
                            AtomicBoolean atomicBoolean2 = C1BOE.LIZ;
                            if (interfaceC1532650pzD.LIZJ() == EnumC1535440q3i.Offline) {
                                z = true;
                            } else {
                                z = false;
                            }
                            c1bp4.LIZLLL(Boolean.valueOf(z), strLIZ);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c1bp4.LIZJ(th);
                        }
                    }
                }, new InterfaceC1530550pvp() { // from class: X.1BQ7
                    @Override // X.InterfaceC1530550pvp
                    public final void accept(Object obj) {
                        this.LIZ.LIZJ((Throwable) obj);
                    }
                });
                return;
            }
        }
        Runnable runnable = new Runnable() { // from class: X.1BPB
            @Override // java.lang.Runnable
            public final void run() {
                C1BP4 c1bp4 = this.LL;
                c1bp4.getClass();
                C1C7U.LIZ("Worker@ad9d.start$1L");
                c1bp4.LJIIZILJ.LJIILJJIL.LIZJ(c1bp4.LJIJI.LJII, "warmup.end");
                if (c1bp4.LJIILIIL.isRunning()) {
                    AtomicBoolean atomicBoolean2 = C1BOE.LIZ;
                    c1bp4.LIZLLL(Boolean.FALSE, "");
                } else {
                    AtomicBoolean atomicBoolean3 = C1BOE.LIZ;
                    c1bp4.LIZJ(c1bp4.LJIJI.LJFF);
                }
                C1C7U.LIZIZ("Worker@ad9d.start$1L");
            }
        };
        synchronized (c1bp72) {
            try {
                if (c1bp72.LIZLLL) {
                    runnable.run();
                } else {
                    c1bp72.LJ = runnable;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C1BP4(final C1BP9 c1bp9) {
        String strSubstring;
        RuntimeException runtimeException;
        final C1BPD<String> c1bpd = new C1BPD<>();
        this.LIZJ = c1bpd;
        this.LIZLLL = new C1BPD<>();
        this.LJ = new C1BPD<>();
        c1bp9.LIZ.LJIILJJIL.LIZJ(System.currentTimeMillis(), "initialize_worker.start");
        if (C2203961BNq.LIZ().isWorkerEnabled) {
            if (TextUtils.isEmpty(c1bp9.LIZIZ)) {
                this.LJI = "Worker";
            } else {
                this.LJI = c1bp9.LIZIZ;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(e3.e);
            sbLIZ.append(this.LJI);
            sbLIZ.append("] ");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            this.LJII = strLIZIZ;
            C2204051BNz c2204051BNz = c1bp9.LIZ;
            this.LJIIZILJ = c2204051BNz;
            LJI(EventName.WorkerEnvironmentInitializeStart).LIZ();
            try {
                if (!TextUtils.isEmpty(c1bp9.LIZJ)) {
                    C1BP7 c1bp7 = null;
                    if (c1bp9.LIZJ.startsWith("javascript:")) {
                        strSubstring = c1bp9.LIZJ.substring(11);
                        this.LJIIIIZZ = Uri.EMPTY;
                    } else {
                        this.LJIIIIZZ = Uri.parse(c1bp9.LIZJ);
                        strSubstring = null;
                    }
                    JsWorker.EngineType engineType = JsWorker.EngineType.QUICKJS;
                    AtomicBoolean atomicBoolean = C1BOE.LIZ;
                    Uri uri = this.LJIIIIZZ;
                    synchronized (C1BP7.class) {
                        if (C1BP7.LJIIJ != null && C1BP7.LJIIJ.LIZ.equals(uri)) {
                            C1BP7 c1bp72 = C1BP7.LJIIJ;
                            C1BP7.LJIIJ = null;
                            c1bp7 = c1bp72;
                        }
                    }
                    this.LJIJI = c1bp7;
                    if (c1bp7 == null) {
                        c2204051BNz.LJIILJJIL.LIZ(0, "pia_is_warmup");
                        JSModuleManager jSModuleManager = new JSModuleManager(C2204051BNz.LJIIZILJ);
                        this.LJIILJJIL = jSModuleManager;
                        try {
                            this.LJIILIIL = new JsWorker(jSModuleManager, engineType, null, false, "PIA");
                            Boolean bool = Boolean.TRUE;
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("use_vmsdk_worker", bool);
                                VmSdkMonitor.LJ("pia_worker", jSONObject);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        } finally {
                        }
                    } else {
                        c2204051BNz.LJIILJJIL.LIZ(1, "pia_is_warmup");
                        c2204051BNz.LJIILJJIL.LIZJ(c1bp7.LJI, "warmup.start");
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(strLIZIZ);
                        sbLIZ2.append("consume warmup worker.");
                        C1BPP.LJ(C2188811AlT.LIZIZ(sbLIZ2));
                        this.LJIILIIL = c1bp7.LIZIZ;
                        this.LJIILJJIL = c1bp7.LIZJ;
                    }
                    this.LJIIJ = c1bp9.LIZLLL;
                    this.LJIIJJI = c1bp9.LJ;
                    this.LJIIIZ = strSubstring;
                    this.LJIJ = c1bp9.LJII;
                    this.LJIILL = c1bp9.LJIIJ;
                    this.LJIJJLI = EnumC2204371BPf.Create;
                    StringBuilder sb = new StringBuilder();
                    sb.append(c2204051BNz.LJIIJ);
                    sb.append("PIANativeWorker ");
                    if (c1bp9.LJIIIIZZ) {
                        sb.append(" PIAWarmup");
                    }
                    if (c1bp7 != null) {
                        sb.append(" WarmupWorker");
                    }
                    String string = sb.toString();
                    this.LJIIL = string;
                    C1BP6 c1bp6 = c1bp9.LJFF;
                    this.LJIILLIIL = c1bp6;
                    c1bp6.getClass();
                    C650110Pej c650110Pej = new C650110Pej();
                    this.LJIL = c650110Pej;
                    C1BOE.LIZJ.add(c650110Pej);
                    C1287700jc8.LIZJ(new RunnableC2204351BPd(c1bp6, new C1BPT(this)));
                    this.LJIILJJIL.LIZIZ("BaseModule", BaseModule.class, this);
                    BaseModule baseModule = (BaseModule) this.LJIILJJIL.LIZ("BaseModule").getModule();
                    this.LJFF = baseModule;
                    baseModule.setMessageHandle(new InterfaceC1530550pvp() { // from class: X.1BPo
                        @Override // X.InterfaceC1530550pvp
                        public final void accept(Object obj) {
                            C1BP4 c1bp4 = this.LIZ;
                            ReadableMap readableMap = (ReadableMap) obj;
                            if (readableMap != null) {
                                c1bp4.LIZLLL.LIZ(C1BQX.LIZLLL(readableMap));
                            } else {
                                c1bp4.getClass();
                            }
                        }
                    });
                    baseModule.setBridgeMessageHandle(new InterfaceC1530550pvp() { // from class: X.1BPn
                        @Override // X.InterfaceC1530550pvp
                        public final void accept(Object obj) {
                            C1BP4 c1bp4 = this.LIZ;
                            ReadableMap readableMap = (ReadableMap) obj;
                            if (readableMap != null) {
                                c1bp4.LJ.LIZ(C1BQX.LIZLLL(readableMap));
                            } else {
                                c1bp4.getClass();
                            }
                        }
                    });
                    if (c1bp9.LJIIIZ) {
                        String str = C1BNX.LIZ;
                        if (!TextUtils.isEmpty(str)) {
                            this.LJIILIIL.evaluateJavaScript(str);
                        } else {
                            c1bp9.LIZ.LJII.LIZ("worker", -4);
                            throw new RuntimeException("Polyfill load failed!");
                        }
                    }
                    if (C2203961BNq.LIZ().isVanillaFetchEnabled) {
                        if (c1bp9.LJI != null) {
                            this.LJIILIIL.setWorkerDelegate(new WorkerDelegate(strLIZIZ, string, c1bp9.LJI, c1bp9.LJ));
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(strLIZIZ);
                            sbLIZ3.append("Initialize Fetch-API successfully");
                            C1BPP.LJ(C2188811AlT.LIZIZ(sbLIZ3));
                        } else {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append(strLIZIZ);
                            sbLIZ4.append("Initialize Fetch-API failed (Reason: 'Retrofit is null')");
                            C1BPP.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
                        }
                    }
                    this.LJIILIIL.setOnErrorCallback(new InterfaceC21345618gA() { // from class: X.1BPj
                        @Override // X.InterfaceC21345618gA
                        public final void LIZ(String str2) {
                            C1BP4 c1bp4 = this.LIZ;
                            C1BP9 c1bp92 = c1bp9;
                            c1bp4.getClass();
                            c1bp92.LIZ.LJII.LIZIZ("worker", -7, str2);
                            c1bp4.LIZIZ.LIZ(str2);
                        }
                    });
                    this.LJIILIIL.setOnMessageCallback(new InterfaceC21345618gA() { // from class: X.1BQO
                        @Override // X.InterfaceC21345618gA
                        public final void LIZ(String str2) {
                            c1bpd.LIZ(str2);
                        }
                    });
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(strLIZIZ);
                    sbLIZ5.append("Worker create successfully (URL: ");
                    sbLIZ5.append(c1bp9.LIZLLL);
                    sbLIZ5.append(")");
                    C1BPP.LJ(C2188811AlT.LIZIZ(sbLIZ5));
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append(strLIZIZ);
                    sbLIZ6.append("Create PIA worker (UserAgent: '");
                    sbLIZ6.append(string);
                    sbLIZ6.append("', RuntimeType: ");
                    sbLIZ6.append(engineType);
                    sbLIZ6.append(", URL: ");
                    sbLIZ6.append(this.LJIIIIZZ);
                    sbLIZ6.append(", Debuggable: ");
                    sbLIZ6.append(false);
                    sbLIZ6.append(")");
                    C1BPP.LJ(C2188811AlT.LIZIZ(sbLIZ6));
                    LJI(EventName.WorkerEnvironmentInitializeEnd).LIZ();
                    c1bp9.LIZ.LJIILJJIL.LIZJ(System.currentTimeMillis(), "initialize_worker.end");
                    return;
                }
                c1bp9.LIZ.LJII.LIZIZ("worker", -2, "script url is empty.");
                throw new C2204191BOn(-10001);
            } finally {
            }
        } else {
            c1bp9.LIZ.LJII.LIZ("worker", -1);
            throw new C1BOJ();
        }
    }

    public final void LIZIZ(String str) {
        if (!TextUtils.isEmpty(str) && LIZ()) {
            this.LJIILIIL.evaluateJavaScript(str);
        }
    }

    public final void LIZJ(final Throwable th) {
        AtomicBoolean atomicBoolean = C1BOE.LIZ;
        C1BP7 c1bp7 = this.LJIJI;
        if (c1bp7 == null) {
            this.LJIIZILJ.LJIILJJIL.LIZJ(System.currentTimeMillis(), "request_worker.end");
        } else {
            this.LJIIZILJ.LJIILJJIL.LIZJ(c1bp7.LJIIIZ, "request_worker.end");
        }
        C1287750jcD c1287750jcD = this.LJIIZILJ.LJII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("url=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", error=");
        sbLIZ.append(Log.getStackTraceString(th));
        c1287750jcD.LIZIZ("worker", -6, C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LJII);
        sbLIZ2.append("PIA worker fails to fetch script(URL:");
        sbLIZ2.append(this.LJIIIIZZ);
        sbLIZ2.append(", Reason: ");
        sbLIZ2.append(th);
        sbLIZ2.append(")");
        C1BPP.LIZJ(4, C2188811AlT.LIZIZ(sbLIZ2), th);
        this.LJIJJLI = EnumC2204371BPf.Terminate;
        Tracing.Event eventLJI = LJI(EventName.WorkerScriptRequestEnd);
        eventLJI.args.put("url", this.LJIIIIZZ.toString());
        eventLJI.args.put("flag", "failed");
        eventLJI.args.put("mode", "online");
        eventLJI.args.put("f", 0);
        eventLJI.args.put("m", 0);
        eventLJI.LIZ();
        C786410Ut5.LJJZZIII(C1287700jc8.LIZ(), new Runnable() { // from class: X.1BPS
            @Override // java.lang.Runnable
            public final void run() {
                C1BP4 c1bp4 = this.LL;
                Throwable th2 = th;
                c1bp4.getClass();
                C1C7U.LIZ("Worker@ad9d.onLoadError$1L");
                if (th2 == null) {
                    c1bp4.LIZIZ.LIZ("Load resource failed.");
                } else {
                    C1BPD<String> c1bpd = c1bp4.LIZIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Load resource failed, error: ");
                    sbLIZ3.append(th2.getMessage());
                    c1bpd.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                }
                c1bp4.LJIILIIL.terminate();
                C1C7U.LIZIZ("Worker@ad9d.onLoadError$1L");
            }
        });
    }

    public final void LJFF(n nVar) {
        InterfaceC1530550pvp<n> interfaceC1530550pvp = this.LJIJ;
        if (interfaceC1530550pvp != null) {
            interfaceC1530550pvp.accept(nVar);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJII);
        sbLIZ.append("PIA worker was terminated (URL: ");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(")");
        C1BPP.LJ(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1542530qF9 interfaceC1542530qF9 = this.LJIJJ;
        if (interfaceC1542530qF9 != null) {
            interfaceC1542530qF9.release();
            this.LJIJJ = null;
        }
        this.LJIJJLI = EnumC2204371BPf.Terminate;
        C1BP6 c1bp6 = this.LJIILLIIL;
        c1bp6.getClass();
        C1287700jc8.LIZJ(new C1BPZ(c1bp6));
        C1BOE.LIZJ.remove(this.LJIL);
        this.LJIILIIL.terminate();
    }

    public final Tracing.Event LJI(EventName eventName) {
        Tracing.Event eventLIZ = this.LJIIZILJ.LJIILL.LIZ(eventName);
        eventLIZ.args.put("worker", this.LJIIZILJ.LIZIZ(this));
        return eventLIZ;
    }

    public final void LIZLLL(Boolean bool, final String str) {
        String str2;
        String str3;
        C1BP7 c1bp7 = this.LJIJI;
        if (c1bp7 == null) {
            this.LJIIZILJ.LJIILJJIL.LIZJ(System.currentTimeMillis(), "request_worker.end");
        } else {
            this.LJIIZILJ.LJIILJJIL.LIZJ(c1bp7.LJIIIZ, "request_worker.end");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJII);
        sbLIZ.append("PIA worker fetches script successfully(URL: ");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", Mode: ");
        if (bool.booleanValue()) {
            str2 = "Offline";
        } else {
            str2 = "Network";
        }
        sbLIZ.append(str2);
        sbLIZ.append(")");
        C1BPP.LJ(C2188811AlT.LIZIZ(sbLIZ));
        Tracing.Event eventLJI = LJI(EventName.WorkerScriptRequestEnd);
        eventLJI.args.put("url", this.LJIIIIZZ.toString());
        eventLJI.args.put("flag", "success");
        if (bool.booleanValue()) {
            str3 = "offline";
        } else {
            str3 = "online";
        }
        eventLJI.args.put("mode", str3);
        eventLJI.args.put("f", 1);
        eventLJI.args.put("m", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        eventLJI.LIZ();
        C786410Ut5.LJJZZIII(C1287700jc8.LIZ(), new Runnable() { // from class: X.1BPR
            @Override // java.lang.Runnable
            public final void run() {
                C1BP4 c1bp4 = this.LL;
                String str4 = str;
                c1bp4.getClass();
                C1C7U.LIZ("Worker@ad9d.onLoadFinish$1L");
                c1bp4.LJI(EventName.WorkerExecuteStart).LIZ();
                c1bp4.LJIILIIL.evaluateJavaScript(str4, c1bp4.LJIIIIZZ.toString());
                c1bp4.LJIILIIL.evaluateJavaScript("if(typeof globalThis.__activate==='function'){globalThis.__activate();}");
                c1bp4.LJIJJLI = EnumC2204371BPf.Ready;
                C1C7U.LIZIZ("Worker@ad9d.onLoadFinish$1L");
            }
        });
    }
}
