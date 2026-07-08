package X;

import java.nio.MappedByteBuffer;

/* JADX INFO: renamed from: X.1BAF, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BAF extends AbstractC1790420wgy {
    public final MappedByteBuffer LIZJ;
    public int LIZLLL;

    public C1BAF(MappedByteBuffer mappedByteBuffer) {
        this.LIZJ = mappedByteBuffer;
    }

    @Override // X.AbstractC1790420wgy
    public final void LIZLLL(byte b) {
        MappedByteBuffer mappedByteBuffer = this.LIZJ;
        int i = this.LIZLLL;
        this.LIZLLL = i + 1;
        mappedByteBuffer.put(i, b);
    }
}
