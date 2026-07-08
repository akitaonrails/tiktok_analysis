package X;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.16D8, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public abstract class C16D8 implements C16DG {
    public final C16DB LIZIZ;
    public ByteBuffer LIZJ = ByteBuffer.allocate(0);
    public boolean LIZ = true;
    public boolean LIZLLL = false;
    public boolean LJ = false;
    public boolean LJFF = false;
    public boolean LJI = false;

    public abstract void LJI();

    public int hashCode() {
        int iHashCode = (((this.LIZ ? 1 : 0) * 31) + this.LIZIZ.hashCode()) * 31;
        ByteBuffer byteBuffer = this.LIZJ;
        return ((((((((iHashCode + (byteBuffer != null ? byteBuffer.hashCode() : 0)) * 31) + (this.LIZLLL ? 1 : 0)) * 31) + (this.LJ ? 1 : 0)) * 31) + (this.LJFF ? 1 : 0)) * 31) + (this.LJI ? 1 : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Framedata{ opcode:");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", fin:");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", rsv1:");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", rsv2:");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", rsv3:");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", payload length:[pos:");
        sbLIZ.append(this.LIZJ.position());
        sbLIZ.append(", len:");
        sbLIZ.append(this.LIZJ.remaining());
        sbLIZ.append("], payload:");
        sbLIZ.append(this.LIZJ.remaining() > 1000 ? "(too big to display)" : new String(this.LIZJ.array()));
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C16DG
    public final boolean LIZ() {
        return this.LIZ;
    }

    @Override // X.C16DG
    public ByteBuffer LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.C16DG
    public final C16DB LIZJ() {
        return this.LIZIZ;
    }

    @Override // X.C16DG
    public final boolean LIZLLL() {
        return this.LJ;
    }

    @Override // X.C16DG
    public final boolean LJ() {
        return this.LJFF;
    }

    @Override // X.C16DG
    public final boolean LJFF() {
        return this.LJI;
    }

    public C16D8(C16DB c16db) {
        this.LIZIZ = c16db;
    }

    public void LJII(ByteBuffer byteBuffer) {
        this.LIZJ = byteBuffer;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C16D8 c16d8 = (C16D8) obj;
        if (this.LIZ != c16d8.LIZ || this.LIZLLL != c16d8.LIZLLL || this.LJ != c16d8.LJ || this.LJFF != c16d8.LJFF || this.LJI != c16d8.LJI || this.LIZIZ != c16d8.LIZIZ) {
            return false;
        }
        ByteBuffer byteBuffer = this.LIZJ;
        if (byteBuffer != null) {
            return byteBuffer.equals(c16d8.LIZJ);
        }
        if (c16d8.LIZJ == null) {
            return true;
        }
        return false;
    }
}
