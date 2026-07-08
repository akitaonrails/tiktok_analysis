package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vmsdk.worker.JsWorker;

/* JADX INFO: renamed from: X.18cD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21321118cD {
    public InterfaceC21345118g5 LIZ;

    public C21321118cD(JsWorker jsWorker) {
        try {
            this.LIZ = (InterfaceC21345118g5) Class.forName("com.bytedance.vmsdk.devtool.WorkerInspectorDelegateImpl").getConstructor(JsWorker.class).newInstance(jsWorker);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
