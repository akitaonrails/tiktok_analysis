package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.MoltenFfiLinkMicSdk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.1AcZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2183291AcZ implements InterfaceC20426014wE, InterfaceC972900bQO {
    public final InterfaceC20426014wE LL;

    @Override // X.InterfaceC20426014wE
    public final void LIZ(String str, EnumC20430114wt enumC20430114wt, String str2, String str3) {
        this.LL.LIZ(str, enumC20430114wt, str2, str3);
    }

    public C2183291AcZ(InterfaceC20426014wE interfaceC20426014wE) {
        this.LL = interfaceC20426014wE;
    }

    @Override // X.InterfaceC972900bQO
    public final C972940bQS LIZIZ(long j, ByteBuffer byteBuffer) {
        InputStream byteArrayInputStream;
        EnumC20430114wt enumC20430114wt;
        if (j == 6751983175442037444L) {
            try {
                if (byteBuffer != null) {
                    byteArrayInputStream = new C19924412xW(byteBuffer);
                } else {
                    byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
                }
                C2236941Cgu c2236941CguDecode = C2236941Cgu.ADAPTER.decode(byteArrayInputStream);
                if (byteBuffer != null) {
                    MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                }
                String str = c2236941CguDecode.tag;
                int i = C2231771CWp.LIZIZ[c2236941CguDecode.level.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    throw new C1954807lC();
                                }
                                enumC20430114wt = EnumC20430114wt.Error;
                            } else {
                                enumC20430114wt = EnumC20430114wt.Warn;
                            }
                        } else {
                            enumC20430114wt = EnumC20430114wt.Debug;
                        }
                    } else {
                        enumC20430114wt = EnumC20430114wt.Info;
                    }
                } else {
                    enumC20430114wt = EnumC20430114wt.Verbose;
                }
                LIZ(str, enumC20430114wt, c2236941CguDecode.message, c2236941CguDecode.extra);
                return new C972940bQS(null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if (0 == 0 && byteBuffer != null) {
                    MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                }
                return C972930bQR.LIZ();
            }
        }
        return new C972940bQS(null);
    }
}
