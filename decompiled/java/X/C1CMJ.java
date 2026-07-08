package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.MoltenFfiLinkMicSdk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CMJ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CMJ implements InterfaceC968200bIo, InterfaceC972900bQO {
    public final InterfaceC968200bIo LL;

    @Override // X.InterfaceC968200bIo
    public final void LIZ(C966440bFy c966440bFy) {
        this.LL.LIZ(c966440bFy);
    }

    @Override // X.InterfaceC968200bIo
    public final void LIZJ(C967640bHu c967640bHu) {
        this.LL.LIZJ(c967640bHu);
    }

    public C1CMJ(InterfaceC968200bIo interfaceC968200bIo) {
        this.LL = interfaceC968200bIo;
    }

    @Override // X.InterfaceC972900bQO
    public final C972940bQS LIZIZ(long j, ByteBuffer byteBuffer) {
        InputStream byteArrayInputStream;
        C1CMM c1cmmDecode;
        InputStream byteArrayInputStream2;
        byte[] byteArray;
        boolean z = true;
        if (j == -1467770842466705676L) {
            try {
                if (byteBuffer != null) {
                    byteArrayInputStream = new C19924412xW(byteBuffer);
                } else {
                    byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
                }
                c1cmmDecode = C1CMM.ADAPTER.decode(byteArrayInputStream);
                if (byteBuffer != null) {
                    MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                }
            } catch (Exception e) {
                e = e;
                z = false;
            }
            try {
                C1CMP c1cmp = c1cmmDecode.res;
                String str = c1cmp.invoke_id;
                C1CMS c1cms = c1cmp.content;
                LIZ(new C966440bFy(str, new C965950bFB(c1cms.rsp_data.toByteArray(), c1cms.biz_data.toByteArray(), c1cms.custom_data)));
                return new C972940bQS(null);
            } catch (Exception e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
                if (!z && byteBuffer != null) {
                    MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                }
                return C972930bQR.LIZ();
            }
        }
        if (j == -6296105044505079183L) {
            try {
                if (byteBuffer != null) {
                    byteArrayInputStream2 = new C19924412xW(byteBuffer);
                } else {
                    byteArrayInputStream2 = new ByteArrayInputStream(new byte[0]);
                }
                C1CMG c1cmgDecode = C1CMG.ADAPTER.decode(byteArrayInputStream2);
                if (byteBuffer != null) {
                    MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                }
                try {
                    C1CMD c1cmd = c1cmgDecode.res;
                    String str2 = c1cmd.invoke_id;
                    C966980bGq c966980bGqLJIIZILJ = C2231651CWd.LJIIZILJ(c1cmd.error);
                    ByteString byteString = c1cmd.content;
                    if (byteString != null) {
                        byteArray = byteString.toByteArray();
                    } else {
                        byteArray = null;
                    }
                    LIZJ(new C967640bHu(str2, c966980bGqLJIIZILJ, byteArray));
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
