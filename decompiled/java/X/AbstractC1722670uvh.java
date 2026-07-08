package X;

import X.InterfaceC1722700uvk;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0uvh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1722670uvh<RESPONSE extends InterfaceC1722700uvk> {
    public abstract byte[] LIZ(InterfaceC1722680uvi interfaceC1722680uvi);

    public abstract RESPONSE LIZIZ(ByteBuffer byteBuffer);

    public abstract void LIZLLL(RESPONSE response, InterfaceC1722680uvi interfaceC1722680uvi);

    public void LIZJ(InterfaceC1722680uvi interfaceC1722680uvi) {
        LIZLLL(LIZIZ(interfaceC1722680uvi.LJII(LIZ(interfaceC1722680uvi))), interfaceC1722680uvi);
    }
}
