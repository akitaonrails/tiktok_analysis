package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.MoltenFfiLinkMicSdk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: renamed from: X.1Acl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2183411Acl implements InterfaceC970260bM8, InterfaceC972900bQO {
    public final InterfaceC970260bM8 LL;

    @Override // X.InterfaceC970260bM8
    public final void LIZ(long j, String str, Map map) {
        this.LL.LIZ(j, str, map);
    }

    public C2183411Acl(C970250bM7 c970250bM7) {
        this.LL = c970250bM7;
    }

    @Override // X.InterfaceC972900bQO
    public final C972940bQS LIZIZ(long j, ByteBuffer byteBuffer) {
        InputStream byteArrayInputStream;
        if (j == -7506104543504682391L) {
            boolean z = false;
            try {
                if (byteBuffer != null) {
                    byteArrayInputStream = new C19924412xW(byteBuffer);
                } else {
                    byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
                }
                C2224061C2y c2224061C2yDecode = C2224061C2y.ADAPTER.decode(byteArrayInputStream);
                if (byteBuffer != null) {
                    MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                }
                z = true;
                LIZ(c2224061C2yDecode.level.longValue(), c2224061C2yDecode.event, c2224061C2yDecode.param_map);
                return new C972940bQS(null);
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
