package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0fYh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1131810fYh implements InterfaceC1132040fZ4<C1132020fZ2> {
    public final InterfaceC1131620fYO LIZ;
    public final DataChannel LIZIZ;
    public final InterfaceC1132010fZ1 LIZJ;

    public final int LIZIZ() {
        return this.LIZ.getRetryCount();
    }

    public AbstractC1131810fYh(C1132340fZY c1132340fZY) {
        InterfaceC1131620fYO interfaceC1131620fYO = c1132340fZY.LIZ;
        this.LIZ = interfaceC1131620fYO;
        this.LIZIZ = interfaceC1131620fYO.getDataChannel();
        this.LIZJ = interfaceC1131620fYO.LJII();
    }
}
