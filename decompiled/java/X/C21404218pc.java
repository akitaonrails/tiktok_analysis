package X;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.18pc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21404218pc {
    public int LIZ;
    public ByteBuffer LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.18pi] */
    public C21404218pc() {
        if (AbstractC21404918pj.LIZ == null) {
            AbstractC21404918pj.LIZ = new AbstractC21404918pj() { // from class: X.18pi
            };
        }
    }

    public final int LIZ(int i) {
        if (i < this.LIZLLL) {
            return this.LIZIZ.getShort(this.LIZJ + i);
        }
        return 0;
    }

    public final void LIZIZ(int i, ByteBuffer byteBuffer) {
        this.LIZIZ = byteBuffer;
        if (byteBuffer != null) {
            this.LIZ = i;
            int i2 = i - byteBuffer.getInt(i);
            this.LIZJ = i2;
            this.LIZLLL = this.LIZIZ.getShort(i2);
            return;
        }
        this.LIZ = 0;
        this.LIZJ = 0;
        this.LIZLLL = 0;
    }
}
