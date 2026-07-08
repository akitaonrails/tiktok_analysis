package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.MoltenFfiLinkMicSdk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: renamed from: X.1AbZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2182671AbZ implements InterfaceC2182661AbY, InterfaceC972900bQO {
    public final InterfaceC2182661AbY LL;

    @Override // X.InterfaceC2182661AbY
    public final C2182101Aae LIZ() {
        return this.LL.LIZ();
    }

    @Override // X.InterfaceC2182661AbY
    public final void LIZJ(C1283980jW8 c1283980jW8) {
        this.LL.LIZJ(c1283980jW8);
    }

    @Override // X.InterfaceC2182661AbY
    public final void reset() {
        this.LL.reset();
    }

    public C2182671AbZ(C2181561AZm c2181561AZm) {
        this.LL = c2181561AZm;
    }

    @Override // X.InterfaceC972900bQO
    public final C972940bQS LIZIZ(long j, ByteBuffer byteBuffer) {
        InputStream byteArrayInputStream;
        C2233761Cbm c2233761CbmLIZ = null;
        if (j == -3779761857270542146L) {
            boolean z = false;
            try {
                if (byteBuffer != null) {
                    byteArrayInputStream = new C19924412xW(byteBuffer);
                } else {
                    byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
                }
                C2228391CJp c2228391CJpDecode = C2228391CJp.ADAPTER.decode(byteArrayInputStream);
                if (byteBuffer != null) {
                    MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                }
                z = true;
                LIZJ(C2231651CWd.LJJIII(c2228391CJpDecode.rect));
                return new C972940bQS(null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if (!z && byteBuffer != null) {
                    MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                }
                return C972930bQR.LIZ();
            }
        }
        if (j == 4149337822638645994L) {
            try {
                C2182101Aae c2182101AaeLIZ = LIZ();
                if (c2182101AaeLIZ != null) {
                    c2233761CbmLIZ = c2182101AaeLIZ.LIZ();
                }
                C2233851Cbv c2233851Cbv = new C2233851Cbv(c2233761CbmLIZ);
                return new C972940bQS(C2231651CWd.LIZLLL(C2233851Cbv.ADAPTER.encodedSize(c2233851Cbv), new AwS612S0100000_33(c2233851Cbv, 168)));
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                return C972930bQR.LIZ();
            }
        }
        if (j == 455992807901950320L) {
            try {
                reset();
                return new C972940bQS(null);
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                return C972930bQR.LIZ();
            }
        }
        return new C972940bQS(null);
    }
}
