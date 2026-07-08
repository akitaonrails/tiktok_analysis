package com.benchmark.strategy;

import X.C21320818cA;
import X.C21320918cB;
import X.InterfaceC21345618gA;
import com.benchmark.port.nativePort.BSModuleInvoker;
import com.bytedance.vmsdk.worker.JsWorker;

/* JADX INFO: loaded from: classes33.dex */
public final class BXVmsdkHandler {
    public static JsWorker LIZ;

    public static synchronized void LIZ() {
        if (LIZ != null) {
            return;
        }
        if (JsWorker.initialize()) {
            C21320818cA c21320818cA = new C21320818cA();
            c21320818cA.LJFF = null;
            c21320818cA.LIZ = JsWorker.EngineType.QUICKJS;
            c21320818cA.LIZJ = null;
            c21320818cA.LJ = false;
            c21320818cA.LIZLLL = true;
            c21320818cA.LIZIZ = "ByteBench";
            JsWorker jsWorker = new JsWorker(new C21320918cB(c21320818cA));
            LIZ = jsWorker;
            jsWorker.setOnMessageCallback(new InterfaceC21345618gA() { // from class: com.benchmark.strategy.BXVmsdkHandler.1
                @Override // X.InterfaceC21345618gA
                public final void LIZ(String str) {
                }
            });
            BSModuleInvoker.LIZ(LIZ.getNativePtr());
        }
    }
}
