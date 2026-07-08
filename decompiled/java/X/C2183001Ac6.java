package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.CompleteCallback;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.MoltenFfiLinkMicSdk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: renamed from: X.1Ac6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2183001Ac6 implements InterfaceC972720bQ6, InterfaceC972900bQO {
    public final InterfaceC972720bQ6 LL;

    @Override // X.InterfaceC972720bQ6
    public final boolean LIZ(String str) {
        return this.LL.LIZ(str);
    }

    @Override // X.InterfaceC972720bQ6
    public final String LIZJ(EnumC2231831CWv enumC2231831CWv, double d, long j, CompleteCallback completeCallback) {
        return this.LL.LIZJ(enumC2231831CWv, d, j, completeCallback);
    }

    public C2183001Ac6(InterfaceC972720bQ6 interfaceC972720bQ6) {
        this.LL = interfaceC972720bQ6;
    }

    @Override // X.InterfaceC972900bQO
    public final C972940bQS LIZIZ(long j, ByteBuffer byteBuffer) {
        InputStream byteArrayInputStream;
        InputStream byteArrayInputStream2;
        boolean z = true;
        if (j == 3229611350387138238L) {
            try {
                if (byteBuffer != null) {
                    byteArrayInputStream = new C19924412xW(byteBuffer);
                } else {
                    byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
                }
                C2229591COf c2229591COfDecode = C2229591COf.ADAPTER.decode(byteArrayInputStream);
                if (byteBuffer != null) {
                    MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                }
                try {
                    C1CCW c1ccw = new C1CCW(LIZJ(C2231651CWd.LJJJJL(c2229591COfDecode.timer_type), c2229591COfDecode.duration.doubleValue(), c2229591COfDecode.uid.longValue(), new CompleteCallback(new C1283590jVV(c2229591COfDecode.callback.longValue()))));
                    return new C972940bQS(C2231651CWd.LIZLLL(C1CCW.ADAPTER.encodedSize(c1ccw), new AwS612S0100000_33(c1ccw, 176)));
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
        } else if (j == 1073181679852936201L) {
            try {
                if (byteBuffer != null) {
                    byteArrayInputStream2 = new C19924412xW(byteBuffer);
                } else {
                    byteArrayInputStream2 = new ByteArrayInputStream(new byte[0]);
                }
                C1C4L c1c4lDecode = C1C4L.ADAPTER.decode(byteArrayInputStream2);
                if (byteBuffer != null) {
                    MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                }
                try {
                    C1CEC c1cec = new C1CEC(Boolean.valueOf(LIZ(c1c4lDecode.timer_id)));
                    return new C972940bQS(C2231651CWd.LIZLLL(C1CEC.ADAPTER.encodedSize(c1cec), new AwS612S0100000_33(c1cec, 174)));
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
