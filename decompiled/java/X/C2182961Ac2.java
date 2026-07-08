package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.MoltenFfiLinkMicSdk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: renamed from: X.1Ac2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2182961Ac2 implements InterfaceC2182981Ac4, InterfaceC972900bQO {
    public final InterfaceC2182981Ac4 LL;

    @Override // X.InterfaceC2182981Ac4
    public final String LIZ(C2182991Ac5 c2182991Ac5) {
        return this.LL.LIZ(c2182991Ac5);
    }

    public C2182961Ac2(C2182971Ac3 c2182971Ac3) {
        this.LL = c2182971Ac3;
    }

    @Override // X.InterfaceC972900bQO
    public final C972940bQS LIZIZ(long j, ByteBuffer byteBuffer) {
        InputStream byteArrayInputStream;
        if (j == 3432284696833251240L) {
            boolean z = false;
            try {
                if (byteBuffer != null) {
                    byteArrayInputStream = new C19924412xW(byteBuffer);
                } else {
                    byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
                }
                C2233311Cb3 c2233311Cb3Decode = C2233311Cb3.ADAPTER.decode(byteArrayInputStream);
                if (byteBuffer != null) {
                    MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                }
                z = true;
                C1CCW c1ccw = new C1CCW(LIZ(C2231651CWd.LJJJLL(c2233311Cb3Decode.key)));
                return new C972940bQS(C2231651CWd.LIZLLL(C1CCW.ADAPTER.encodedSize(c1ccw), new AwS612S0100000_33(c1ccw, 172)));
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
