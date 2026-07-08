package X;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0jQK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1280380jQK implements C1ET9 {
    public int LIZ;
    public int LIZIZ;
    public InterfaceC1271370jBn LIZJ;

    @Override // X.C1ET9
    public final void LIZ() {
    }

    @Override // X.C1ET9
    public final void LIZIZ() {
    }

    @Override // X.C1ET9
    public final void LIZJ() {
    }

    @Override // X.C1ET9
    public final void LJFF() {
    }

    @Override // X.C1ET9
    public final void getLatency() {
    }

    @Override // X.C1ET9
    public final C1280410jQN getConfig() {
        return new C1280410jQN(1);
    }

    @Override // X.C1ET9
    public final void LIZLLL(C1280390jQL c1280390jQL) {
        ByteBuffer[] byteBufferArr;
        if (this.LIZJ != null && (byteBufferArr = c1280390jQL.LIZ) != null && byteBufferArr.length > 0) {
            ByteBuffer byteBuffer = byteBufferArr[0];
            byteBuffer.rewind();
            this.LIZJ.LIZIZ(byteBuffer, c1280390jQL.LIZIZ, this.LIZ, this.LIZIZ, c1280390jQL.LIZJ);
        }
    }

    @Override // X.C1ET9
    public final void LJ(C1280400jQM c1280400jQM) {
        this.LIZ = c1280400jQM.LIZ;
        this.LIZIZ = c1280400jQM.LIZIZ;
    }
}
