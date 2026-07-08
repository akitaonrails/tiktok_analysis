package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutDslContentCallback;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.MoltenFfiLinkMicSdk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: renamed from: X.1AbV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2182631AbV implements InterfaceC2182621AbU, InterfaceC972900bQO {
    public final InterfaceC2182621AbU LL;

    @Override // X.InterfaceC2182621AbU
    public final String LIZ(String str) {
        return this.LL.LIZ(str);
    }

    @Override // X.InterfaceC2182621AbU
    public final void LIZJ(String str, LinkMicLayoutDslContentCallback linkMicLayoutDslContentCallback) {
        this.LL.LIZJ(str, linkMicLayoutDslContentCallback);
    }

    public C2182631AbV(C2182601AbS c2182601AbS) {
        this.LL = c2182601AbS;
    }

    @Override // X.InterfaceC972900bQO
    public final C972940bQS LIZIZ(long j, ByteBuffer byteBuffer) {
        InputStream byteArrayInputStream;
        InputStream byteArrayInputStream2;
        C2226641CCw c2226641CCwDecode;
        boolean z = true;
        if (j == 1074982991513519769L) {
            try {
                if (byteBuffer != null) {
                    byteArrayInputStream = new C19924412xW(byteBuffer);
                } else {
                    byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
                }
                C2226671CCz c2226671CCzDecode = C2226671CCz.ADAPTER.decode(byteArrayInputStream);
                if (byteBuffer != null) {
                    MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                }
                try {
                    C1CCW c1ccw = new C1CCW(LIZ(c2226671CCzDecode.layout_key));
                    return new C972940bQS(C2231651CWd.LIZLLL(C1CCW.ADAPTER.encodedSize(c1ccw), new AwS612S0100000_33(c1ccw, 167)));
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
        } else {
            if (j == 126838560106382958L) {
                try {
                    if (byteBuffer != null) {
                        byteArrayInputStream2 = new C19924412xW(byteBuffer);
                    } else {
                        byteArrayInputStream2 = new ByteArrayInputStream(new byte[0]);
                    }
                    c2226641CCwDecode = C2226641CCw.ADAPTER.decode(byteArrayInputStream2);
                    if (byteBuffer != null) {
                        MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                    }
                } catch (Exception e3) {
                    e = e3;
                    z = false;
                }
                try {
                    LIZJ(c2226641CCwDecode.layout_key, new LinkMicLayoutDslContentCallback(new C1283590jVV(c2226641CCwDecode.callback.longValue())));
                    return new C972940bQS(null);
                } catch (Exception e4) {
                    e = e4;
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
}
