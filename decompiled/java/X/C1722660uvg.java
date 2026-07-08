package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0uvg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1722660uvg extends AbstractC1722670uvh<InterfaceC1722700uvk> {
    @Override // X.AbstractC1722670uvh
    public final byte[] LIZ(InterfaceC1722680uvi interfaceC1722680uvi) throws C1722690uvj {
        throw new C1722690uvj("EndState doesn't generateRequest");
    }

    @Override // X.AbstractC1722670uvh
    public final InterfaceC1722700uvk LIZIZ(ByteBuffer byteBuffer) throws C1722690uvj {
        throw new C1722690uvj("EndState doesn't generateResponse");
    }

    @Override // X.AbstractC1722670uvh
    public final void LIZJ(InterfaceC1722680uvi interfaceC1722680uvi) {
        if (interfaceC1722680uvi.LJFF().LL.isConnected()) {
            try {
                interfaceC1722680uvi.LJFF().close();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.AbstractC1722670uvh
    public final void LIZLLL(InterfaceC1722700uvk interfaceC1722700uvk, InterfaceC1722680uvi interfaceC1722680uvi) throws C1722690uvj {
        throw new C1722690uvj("EndState doesn't handleResponse");
    }
}
