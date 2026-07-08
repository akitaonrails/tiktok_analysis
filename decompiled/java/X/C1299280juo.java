package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.jsbridge.LynxEmbeddedModule;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.LynxBackgroundRuntime;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateBundle;
import com.lynx.tasm.base.TraceController;
import com.lynx.tasm.base.TraceEvent;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0juo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1299280juo implements InterfaceC1299290jup {
    public volatile LynxBackgroundRuntime LIZIZ;
    public final Object LIZ = new Object();
    public WeakReference<InterfaceC1300010jvz> LIZJ = new WeakReference<>(null);

    public final void LIZ(LynxView lynxView, ReadableMap readableMap) {
        if (!readableMap.hasKey("method")) {
            return;
        }
        s lynxContext = lynxView.getLynxContext();
        if (this.LIZIZ == null) {
            synchronized (this.LIZ) {
                try {
                    if (this.LIZIZ == null) {
                        TraceEvent.LIZLLL("LogicExecutor.Init");
                        InterfaceC1300010jvz interfaceC1300010jvz = this.LIZJ.get();
                        if (interfaceC1300010jvz == null) {
                            LynxLog.e("DefaultLogicExecutor", "LynxViewGroup not found");
                        } else {
                            C1299310jur c1299310jurLJJIIJZLJL = interfaceC1300010jvz.LJJIIJZLJL();
                            TemplateBundle templateBundleLJJIFFI = interfaceC1300010jvz.LJJIFFI();
                            if (c1299310jurLJJIIJZLJL == null || templateBundleLJJIFFI == null || lynxContext == null) {
                                LynxLog.e("DefaultLogicExecutor", "init LynxBackgroundRuntime failed.");
                            } else {
                                c1299310jurLJJIIJZLJL.LIZJ("LynxEmbeddedModule", LynxEmbeddedModule.class, interfaceC1300010jvz);
                                this.LIZIZ = new LynxBackgroundRuntime(lynxContext, c1299310jurLJJIIJZLJL, interfaceC1300010jvz.isDebuggable());
                                String strLIZIZ = "/logic.js";
                                String str = templateBundleLJJIFFI.LL;
                                if (str != null && (str.startsWith("/") || str.startsWith("http"))) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(str);
                                    sbLIZ.append("/logic.js");
                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                }
                                this.LIZIZ.LIZJ(strLIZIZ, templateBundleLJJIFFI);
                                TraceEvent.LJII("LogicExecutor.Init");
                            }
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        if (this.LIZIZ == null) {
            return;
        }
        String string = readableMap.getString("method");
        if (TraceController.isTracingStarted()) {
            HashMap map = new HashMap();
            map.put("name", string);
            TraceEvent.LIZJ("LogicExecutor.OnLynxEvent", map);
        }
        if (string == "sendGlobalEvent") {
            String string2 = readableMap.getString("name");
            JavaOnlyArray javaOnlyArray = (JavaOnlyArray) readableMap.getArray("params");
            javaOnlyArray.pushInt(lynxView.getLynxViewId());
            this.LIZIZ.LJ(string2, javaOnlyArray);
        } else {
            JavaOnlyArray javaOnlyArray2 = new JavaOnlyArray();
            if (readableMap.getType("args") == ReadableType.TemplateData) {
                javaOnlyArray2.pushTemplateData(readableMap.getTemplateData("args"));
            } else if (readableMap.getType("args") == ReadableType.Map) {
                javaOnlyArray2.pushMap((JavaOnlyMap) readableMap.getMap("args"));
            }
            javaOnlyArray2.pushInt(lynxView.getLynxViewId());
            LynxBackgroundRuntime lynxBackgroundRuntime = this.LIZIZ;
            lynxBackgroundRuntime.getClass();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("LynxContext callFunction, module: ");
            sbLIZ2.append("embeddedModule");
            sbLIZ2.append(", method: ");
            sbLIZ2.append(string);
            LynxLog.i("LynxBackgroundRuntime", C2188811AlT.LIZIZ(sbLIZ2));
            lynxBackgroundRuntime.LIZJ.LIZIZ("embeddedModule", string, javaOnlyArray2);
        }
        if (TraceController.isTracingStarted()) {
            TraceEvent.LJII("LogicExecutor.OnLynxEvent");
        }
    }
}
