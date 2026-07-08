package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.MoltenFfiLinkMicSdk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.1AcE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2183081AcE implements InterfaceC2181451AZb, InterfaceC972900bQO {
    public final InterfaceC2181451AZb LL;

    @Override // X.InterfaceC2181451AZb
    public final void LIZ(C1AZZ c1azz) {
        this.LL.LIZ(c1azz);
    }

    @Override // X.InterfaceC2181451AZb
    public final void LIZJ(EnumC2183041AcA enumC2183041AcA, String str, String str2, String str3) {
        this.LL.LIZJ(enumC2183041AcA, str, str2, str3);
    }

    public C2183081AcE(InterfaceC2181451AZb interfaceC2181451AZb) {
        this.LL = interfaceC2181451AZb;
    }

    @Override // X.InterfaceC972900bQO
    public final C972940bQS LIZIZ(long j, ByteBuffer byteBuffer) {
        InputStream byteArrayInputStream;
        InputStream byteArrayInputStream2;
        boolean z = true;
        if (j == -7326800201260856930L) {
            try {
                if (byteBuffer != null) {
                    byteArrayInputStream = new C19924412xW(byteBuffer);
                } else {
                    byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
                }
                C2236991Cgz c2236991CgzDecode = C2236991Cgz.ADAPTER.decode(byteArrayInputStream);
                if (byteBuffer != null) {
                    MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                }
                try {
                    C2236961Cgw c2236961Cgw = c2236991CgzDecode.log_info;
                    LIZ(new C1AZZ(c2236961Cgw.tag, C2231651CWd.LJJIJIIJIL(c2236961Cgw.level), c2236961Cgw.message, c2236961Cgw.monitor_params));
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
        } else if (j == 5569185072315724432L) {
            try {
                if (byteBuffer != null) {
                    byteArrayInputStream2 = new C19924412xW(byteBuffer);
                } else {
                    byteArrayInputStream2 = new ByteArrayInputStream(new byte[0]);
                }
                C2237021Ch2 c2237021Ch2Decode = C2237021Ch2.ADAPTER.decode(byteArrayInputStream2);
                if (byteBuffer != null) {
                    MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                }
                try {
                    LIZJ(C2231651CWd.LJJIJIIJIL(c2237021Ch2Decode.level), c2237021Ch2Decode.tag, c2237021Ch2Decode.message, c2237021Ch2Decode.extra);
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
