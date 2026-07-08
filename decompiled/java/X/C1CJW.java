package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.MoltenFfiLinkMicSdk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.AwS613S0100000_34;

/* JADX INFO: renamed from: X.1CJW, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CJW implements C1CJX, InterfaceC972900bQO {
    public final C1CJX LL;

    @Override // X.C1CJX
    public final EnumC972330bPT G8() {
        return this.LL.G8();
    }

    @Override // X.C1CJX
    public final long LIZ() {
        return this.LL.LIZ();
    }

    @Override // X.C1CJX
    public final boolean LIZJ(long j) {
        return this.LL.LIZJ(j);
    }

    @Override // X.C1CJX
    public final String LIZLLL(C969260bKW c969260bKW) {
        return this.LL.LIZLLL(c969260bKW);
    }

    public C1CJW(C1CJX c1cjx) {
        this.LL = c1cjx;
    }

    @Override // X.InterfaceC972900bQO
    public final C972940bQS LIZIZ(long j, ByteBuffer byteBuffer) {
        InputStream byteArrayInputStream;
        C1CJY c1cjyDecode;
        InputStream byteArrayInputStream2;
        boolean z = true;
        if (j == -138125205016612010L) {
            try {
                if (byteBuffer != null) {
                    byteArrayInputStream = new C19924412xW(byteBuffer);
                } else {
                    byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
                }
                c1cjyDecode = C1CJY.ADAPTER.decode(byteArrayInputStream);
                if (byteBuffer != null) {
                    MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                }
            } catch (Exception e) {
                e = e;
                z = false;
            }
            try {
                C1CCW c1ccw = new C1CCW(LIZLLL(C2231651CWd.LJJJJIZL(c1cjyDecode.key)));
                return new C972940bQS(C2231651CWd.LIZLLL(C1CCW.ADAPTER.encodedSize(c1ccw), new AwS612S0100000_33(c1ccw, 164)));
            } catch (Exception e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
                if (!z && byteBuffer != null) {
                    MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                }
                return C972930bQR.LIZ();
            }
        }
        if (j == 4730287220382071272L) {
            try {
                C1CJU c1cju = new C1CJU(Long.valueOf(LIZ()));
                return new C972940bQS(C2231651CWd.LIZLLL(C1CJU.ADAPTER.encodedSize(c1cju), new AwS613S0100000_34(c1cju, 114)));
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                return C972930bQR.LIZ();
            }
        }
        if (j == 3023854642970162271L) {
            try {
                C1CF8 c1cf8 = new C1CF8(G8().into());
                return new C972940bQS(C2231651CWd.LIZLLL(C1CF8.ADAPTER.encodedSize(c1cf8), new AwS613S0100000_34(c1cf8, 113)));
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
                return C972930bQR.LIZ();
            }
        }
        if (j == 1607835117145793763L) {
            try {
                if (byteBuffer != null) {
                    byteArrayInputStream2 = new C19924412xW(byteBuffer);
                } else {
                    byteArrayInputStream2 = new ByteArrayInputStream(new byte[0]);
                }
                C1CFP c1cfpDecode = C1CFP.ADAPTER.decode(byteArrayInputStream2);
                if (byteBuffer != null) {
                    MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                }
                try {
                    C1CEC c1cec = new C1CEC(Boolean.valueOf(LIZJ(c1cfpDecode.group_channel_id.longValue())));
                    return new C972940bQS(C2231651CWd.LIZLLL(C1CEC.ADAPTER.encodedSize(c1cec), new AwS612S0100000_33(c1cec, 165)));
                } catch (Exception e5) {
                    e = e5;
                    TryCatchGuardChecker.doCheck(e);
                    if (!z && byteBuffer != null) {
                        MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                    }
                    return C972930bQR.LIZ();
                }
            } catch (Exception e6) {
                e = e6;
                z = false;
            }
        } else {
            return new C972940bQS(null);
        }
    }
}
