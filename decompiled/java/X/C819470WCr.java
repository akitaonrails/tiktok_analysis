package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0WCr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C819470WCr extends AbstractC819480WCs {
    public final Iterable<C0WCG> LIZ;
    public final byte[] LIZIZ;

    public C819470WCr() {
        throw null;
    }

    public final int hashCode() {
        return ((this.LIZ.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BackendRequest{events=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", extras=");
        sbLIZ.append(Arrays.toString(this.LIZIZ));
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC819480WCs
    public final Iterable<C0WCG> LIZ() {
        return this.LIZ;
    }

    @Override // X.AbstractC819480WCs
    public final byte[] LIZIZ() {
        return this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        byte[] bArrLIZIZ;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC819480WCs)) {
            return false;
        }
        AbstractC819480WCs abstractC819480WCs = (AbstractC819480WCs) obj;
        if (this.LIZ.equals(abstractC819480WCs.LIZ())) {
            byte[] bArr = this.LIZIZ;
            if (abstractC819480WCs instanceof C819470WCr) {
                bArrLIZIZ = ((C819470WCr) abstractC819480WCs).LIZIZ;
            } else {
                bArrLIZIZ = abstractC819480WCs.LIZIZ();
            }
            if (Arrays.equals(bArr, bArrLIZIZ)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C819470WCr(Iterable iterable, byte[] bArr) {
        this.LIZ = iterable;
        this.LIZIZ = bArr;
    }
}
