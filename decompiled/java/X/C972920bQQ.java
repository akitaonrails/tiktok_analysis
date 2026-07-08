package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicTaskCallback;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.MoltenFfiLinkMicSdk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0bQQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C972920bQQ implements InterfaceC968360bJ4, InterfaceC972900bQO {
    public final InterfaceC968360bJ4 LL;

    @Override // X.InterfaceC968360bJ4
    public final void LIZ(C966210bFb c966210bFb, LinkMicTaskCallback linkMicTaskCallback) {
        this.LL.LIZ(c966210bFb, linkMicTaskCallback);
    }

    public C972920bQQ(InterfaceC968360bJ4 interfaceC968360bJ4) {
        this.LL = interfaceC968360bJ4;
    }

    @Override // X.InterfaceC972900bQO
    public final C972940bQS LIZIZ(long j, ByteBuffer byteBuffer) {
        InputStream byteArrayInputStream;
        EnumC972970bQV enumC972970bQV;
        if (j == -8144012066320084790L) {
            try {
                if (byteBuffer != null) {
                    byteArrayInputStream = new C19924412xW(byteBuffer);
                } else {
                    byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
                }
                C2225771C9n c2225771C9nDecode = C2225771C9n.ADAPTER.decode(byteArrayInputStream);
                if (byteBuffer != null) {
                    MoltenFfiLinkMicSdk.freeNativeMemory(byteBuffer);
                }
                C2225731C9j c2225731C9j = c2225771C9nDecode.task;
                int i = C2231771CWp.LJJIJL[c2225731C9j.scene.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        throw new C1954807lC();
                    }
                    enumC972970bQV = EnumC972970bQV.PreJoinRtcChannel;
                } else {
                    enumC972970bQV = EnumC972970bQV.JoinRtcChannel;
                }
                LIZ(new C966210bFb(enumC972970bQV, c2225731C9j.params), new LinkMicTaskCallback(new C1283590jVV(c2225771C9nDecode.callback.longValue())));
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
