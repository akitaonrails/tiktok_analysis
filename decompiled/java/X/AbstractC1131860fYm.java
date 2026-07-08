package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0fYm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1131860fYm implements InterfaceC1132040fZ4<C1132180fZI> {
    public final C1132340fZY LIZ;
    public final InterfaceC1131620fYO LIZIZ;
    public final DataChannel LIZJ;

    public AbstractC1131860fYm(C1132340fZY c1132340fZY) {
        this.LIZ = c1132340fZY;
        InterfaceC1131620fYO interfaceC1131620fYO = c1132340fZY.LIZ;
        this.LIZIZ = interfaceC1131620fYO;
        this.LIZJ = interfaceC1131620fYO.getDataChannel();
    }

    public final void LIZIZ(boolean z) {
        this.LIZIZ.LJFF(z);
    }
}
