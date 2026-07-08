package X;

import android.hardware.Camera;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1Ai9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2186751Ai9 implements Camera.PreviewCallback {
    public InterfaceC2186741Ai8 LL;
    public C2186841AiI LLILLJJLI;
    public final /* synthetic */ C2186791AiD LLILLL;

    public C2186751Ai9(C2186791AiD c2186791AiD) {
        this.LLILLL = c2186791AiD;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        C2186841AiI c2186841AiI = this.LLILLJJLI;
        InterfaceC2186741Ai8 interfaceC2186741Ai8 = this.LL;
        if (c2186841AiI != null) {
            if (interfaceC2186741Ai8 != null) {
                try {
                    if (bArr != null) {
                        interfaceC2186741Ai8.LIZ(new C2186601Ahu(bArr, c2186841AiI.LL, c2186841AiI.LLILLJJLI));
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        C2186791AiD c2186791AiD = this.LLILLL;
                        if (jElapsedRealtime - c2186791AiD.LJIIJ < 200) {
                            return;
                        }
                        c2186791AiD.LJIIJ = jElapsedRealtime;
                        return;
                    }
                    throw new NullPointerException("No preview data received");
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    interfaceC2186741Ai8.LIZIZ(new Exception("parse data error"));
                    return;
                }
            }
            return;
        }
        if (interfaceC2186741Ai8 != null) {
            interfaceC2186741Ai8.LIZIZ(new Exception("No resolution available"));
        }
    }
}
