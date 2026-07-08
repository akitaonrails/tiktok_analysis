package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicResponseCallback;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.MoltenFfiLinkMicSdk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.1AcV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2183251AcV implements InterfaceC2183241AcU, InterfaceC972900bQO {
    public final InterfaceC2183241AcU LL;

    @Override // X.InterfaceC2183241AcU
    public final void LIZ(C2183211AcR c2183211AcR, LinkMicResponseCallback linkMicResponseCallback) {
        this.LL.LIZ(c2183211AcR, linkMicResponseCallback);
    }

    public C2183251AcV(InterfaceC2183241AcU interfaceC2183241AcU) {
        this.LL = interfaceC2183241AcU;
    }

    @Override // X.InterfaceC972900bQO
    public final C972940bQS LIZIZ(long j, ByteBuffer byteBuffer) {
        InputStream byteArrayInputStream;
        if (j == -8963606637122683554L) {
            boolean z = false;
            try {
                if (byteBuffer != null) {
                    byteArrayInputStream = new C19924412xW(byteBuffer);
                } else {
                    byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
                }
                C2229111CMj c2229111CMjDecode = C2229111CMj.ADAPTER.decode(byteArrayInputStream);
                if (byteBuffer != null) {
                    MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                }
                z = true;
                LIZ(C2231651CWd.LJJIL(c2229111CMjDecode.request), new LinkMicResponseCallback(new C1283590jVV(c2229111CMjDecode.callback.longValue())));
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
