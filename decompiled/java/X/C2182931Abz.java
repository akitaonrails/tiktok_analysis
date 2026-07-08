package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMessageListener;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.MoltenFfiLinkMicSdk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: renamed from: X.1Abz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2182931Abz implements InterfaceC2182941Ac0, InterfaceC972900bQO {
    public final InterfaceC2182941Ac0 LL;

    @Override // X.InterfaceC2182941Ac0
    public final boolean LIZJ(String str, LinkMicMessageListener linkMicMessageListener) {
        return this.LL.LIZJ(str, linkMicMessageListener);
    }

    @Override // X.InterfaceC2182941Ac0
    public final boolean LIZLLL(String str) {
        return this.LL.LIZLLL(str);
    }

    public C2182931Abz(InterfaceC2182941Ac0 interfaceC2182941Ac0) {
        this.LL = interfaceC2182941Ac0;
    }

    @Override // X.InterfaceC972900bQO
    public final C972940bQS LIZIZ(long j, ByteBuffer byteBuffer) {
        InputStream byteArrayInputStream;
        C1CBO c1cboDecode;
        InputStream byteArrayInputStream2;
        boolean z = true;
        if (j == -7615579229408112176L) {
            try {
                if (byteBuffer != null) {
                    byteArrayInputStream = new C19924412xW(byteBuffer);
                } else {
                    byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
                }
                c1cboDecode = C1CBO.ADAPTER.decode(byteArrayInputStream);
                if (byteBuffer != null) {
                    MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                }
            } catch (Exception e) {
                e = e;
                z = false;
            }
            try {
                C1CEC c1cec = new C1CEC(Boolean.valueOf(LIZJ(c1cboDecode.message_method, new LinkMicMessageListener(new C1283590jVV(c1cboDecode.message_handler.longValue())))));
                return new C972940bQS(C2231651CWd.LIZLLL(C1CEC.ADAPTER.encodedSize(c1cec), new AwS612S0100000_33(c1cec, 171)));
            } catch (Exception e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
                if (!z && byteBuffer != null) {
                    MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                }
                return C972930bQR.LIZ();
            }
        }
        if (j == -7422558300971526091L) {
            try {
                if (byteBuffer != null) {
                    byteArrayInputStream2 = new C19924412xW(byteBuffer);
                } else {
                    byteArrayInputStream2 = new ByteArrayInputStream(new byte[0]);
                }
                C1CBR c1cbrDecode = C1CBR.ADAPTER.decode(byteArrayInputStream2);
                if (byteBuffer != null) {
                    MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                }
                try {
                    C1CEC c1cec2 = new C1CEC(Boolean.valueOf(LIZLLL(c1cbrDecode.message_method)));
                    return new C972940bQS(C2231651CWd.LIZLLL(C1CEC.ADAPTER.encodedSize(c1cec2), new AwS612S0100000_33(c1cec2, 173)));
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
