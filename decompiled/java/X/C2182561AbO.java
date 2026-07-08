package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutPipelineStartRunnable;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutRustRunnable;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.MoltenFfiLinkMicSdk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.1AbO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2182561AbO implements InterfaceC1308550k9l, InterfaceC972900bQO {
    public final InterfaceC1308550k9l LL;

    @Override // X.InterfaceC1308550k9l
    public final void LIZ(LinkMicLayoutRustRunnable linkMicLayoutRustRunnable) {
        this.LL.LIZ(linkMicLayoutRustRunnable);
    }

    @Override // X.InterfaceC1308550k9l
    public final void LIZJ(LinkMicLayoutPipelineStartRunnable linkMicLayoutPipelineStartRunnable) {
        this.LL.LIZJ(linkMicLayoutPipelineStartRunnable);
    }

    public C2182561AbO(C1308530k9j c1308530k9j) {
        this.LL = c1308530k9j;
    }

    @Override // X.InterfaceC972900bQO
    public final C972940bQS LIZIZ(long j, ByteBuffer byteBuffer) {
        InputStream byteArrayInputStream;
        InputStream byteArrayInputStream2;
        boolean z = true;
        if (j == -8329807913849465448L) {
            try {
                if (byteBuffer != null) {
                    byteArrayInputStream = new C19924412xW(byteBuffer);
                } else {
                    byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
                }
                C1C3Z c1c3zDecode = C1C3Z.ADAPTER.decode(byteArrayInputStream);
                if (byteBuffer != null) {
                    MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                }
                try {
                    LIZJ(new LinkMicLayoutPipelineStartRunnable(new C1283590jVV(c1c3zDecode.runnable.longValue())));
                    return new C972940bQS(null);
                } catch (Exception e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    if (!z && byteBuffer != null) {
                        MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                    }
                    return C972930bQR.LIZ();
                }
            } catch (Exception e2) {
                e = e2;
                z = false;
            }
        } else if (j == -8119537408272701004L) {
            try {
                if (byteBuffer != null) {
                    byteArrayInputStream2 = new C19924412xW(byteBuffer);
                } else {
                    byteArrayInputStream2 = new ByteArrayInputStream(new byte[0]);
                }
                C1C3W c1c3wDecode = C1C3W.ADAPTER.decode(byteArrayInputStream2);
                if (byteBuffer != null) {
                    MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                }
                try {
                    LIZ(new LinkMicLayoutRustRunnable(new C1283590jVV(c1c3wDecode.runnable.longValue())));
                    return new C972940bQS(null);
                } catch (Exception e3) {
                    e = e3;
                    TryCatchGuardChecker.doCheck(e);
                    if (!z && byteBuffer != null) {
                        MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                    }
                    return C972930bQR.LIZ();
                }
            } catch (Exception e4) {
                e = e4;
                z = false;
            }
        } else {
            return new C972940bQS(null);
        }
    }
}
