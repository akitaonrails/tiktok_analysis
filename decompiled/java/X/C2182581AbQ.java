package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.MoltenFfiLinkMicSdk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.1AbQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2182581AbQ implements InterfaceC972880bQM, InterfaceC972900bQO {
    public final InterfaceC972880bQM LL;

    @Override // X.InterfaceC972880bQM
    public final void LIZ(C972850bQJ c972850bQJ) {
        this.LL.LIZ(c972850bQJ);
    }

    public C2182581AbQ(InterfaceC972880bQM interfaceC972880bQM) {
        this.LL = interfaceC972880bQM;
    }

    @Override // X.InterfaceC972900bQO
    public final C972940bQS LIZIZ(long j, ByteBuffer byteBuffer) {
        InputStream byteArrayInputStream;
        if (j == 7153124470911267489L) {
            boolean z = false;
            try {
                if (byteBuffer != null) {
                    byteArrayInputStream = new C19924412xW(byteBuffer);
                } else {
                    byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
                }
                C2225831C9t c2225831C9tDecode = C2225831C9t.ADAPTER.decode(byteArrayInputStream);
                if (byteBuffer != null) {
                    MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                }
                z = true;
                C2225801C9q c2225801C9q = c2225831C9tDecode.event;
                LIZ(new C972850bQJ(c2225801C9q.event_key, c2225801C9q.params));
                return new C972940bQS(null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if (!z && byteBuffer != null) {
                    MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                }
                return C972930bQR.LIZ();
            }
        }
        return new C972940bQS(null);
    }
}
