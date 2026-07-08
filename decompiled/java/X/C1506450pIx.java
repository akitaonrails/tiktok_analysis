package X;

import com.bytedance.vmsdk.worker.JsWorker;

/* JADX INFO: renamed from: X.0pIx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1506450pIx implements InterfaceC1503680pEU<Throwable> {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ JsWorker LIZIZ;

    @Override // X.InterfaceC1503680pEU
    public final void LIZ(Throwable th) {
        Throwable th2 = th;
        if (this.LIZIZ.isRunning()) {
            JsWorker.nativeReject(this.LIZIZ.mNativeWorkerPtr.get(), th2.getMessage(), this.LIZ);
        }
    }

    public C1506450pIx(JsWorker jsWorker, long j) {
        this.LIZIZ = jsWorker;
        this.LIZ = j;
    }
}
