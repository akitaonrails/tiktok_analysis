package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0pyF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532050pyF extends AbstractC1532040pyE {
    public final String LJII;
    public volatile byte[] LJIIIIZZ;

    @Override // X.AbstractC1532040pyE
    public final void LJIIJJI() {
    }

    @Override // X.AbstractC1532040pyE
    public final String LJII() {
        return this.LJII;
    }

    @Override // X.AbstractC1532040pyE
    public final byte[] LJIIJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC1532040pyE
    public final void LIZJ(int i) {
        this.LJIIIIZZ = Arrays.copyOf(this.LJIIIIZZ, i);
        this.LJFF = i;
    }

    @Override // X.AbstractC1532040pyE
    public final byte[] LJFF(int i) {
        LIZIZ(i);
        if (this.LJ != this.LJIIIIZZ.length) {
            if (this.LJ > this.LJIIIIZZ.length) {
                C1532760pzO.LIZJ(C1532920pze.LIZJ, this.LJII, "finish", "unexpected count is larger than the size of buf", null, null, 48);
            }
            this.LJIIIIZZ = Arrays.copyOf(this.LJIIIIZZ, this.LJ);
        }
        this.LJFF = i;
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC1532040pyE
    public final int LIZLLL(InputStream inputStream, int i) throws IOException {
        LIZIZ(i);
        int i2 = 0;
        while (this.LJ < this.LJFF) {
            int i3 = inputStream.read(this.LJIIIIZZ, this.LJ, this.LJFF - this.LJ);
            if (i3 == -1) {
                if (i2 <= 0) {
                    return -1;
                }
                return i2;
            }
            this.LJ += i3;
            i2 += i3;
        }
        return i2;
    }

    @Override // X.AbstractC1532040pyE
    public final boolean LJIIIIZZ(C0VSJ c0vsj, Function1 function1) throws Throwable {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c0vsj.getPath());
        sbLIZ.append("_tmp");
        C0VSJ c0vsj2 = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        c0vsj2.delete();
        c0vsj.delete();
        C09BH.LJIIIIZZ(c0vsj2, this.LJIIIIZZ);
        if (!((Boolean) function1.invoke(c0vsj2)).booleanValue()) {
            try {
                C189200o6.m2constructorimpl(Boolean.valueOf(c0vsj2.delete()));
                return false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return false;
            }
        }
        if (c0vsj2.renameTo(c0vsj)) {
            return true;
        }
        throw new IOException("rename file failed");
    }

    @Override // X.AbstractC1532040pyE
    public final void LJIIL(int i, byte b) {
        LIZIZ(i);
        LIZ(i, 1);
        this.LJIIIIZZ[this.LJ] = b;
        this.LJ++;
    }

    public C1532050pyF(int i, int i2, File file, boolean z) {
        this(new byte[i], 0, file, i2, z);
    }

    @Override // X.AbstractC1532040pyE
    public final void LJ(int i, byte[] bArr, int i2, int i3) {
        LIZIZ(i);
        LIZ(i, i3);
        byte[] bArr2 = this.LJIIIIZZ;
        if (i >= 0 && i2 >= 0 && i2 <= bArr.length && i3 >= 0 && (i2 + i3) - bArr.length <= 0) {
            System.arraycopy(bArr, i2, bArr2, this.LJ, i3);
            this.LJ += i3;
            return;
        }
        throw new IndexOutOfBoundsException("index out of bounds");
    }

    public C1532050pyF(byte[] bArr, int i, File file, int i2, boolean z) {
        super(file, i2, z);
        this.LJII = "ByteMeta";
        this.LJIIIIZZ = bArr;
        this.LJFF = this.LJIIIIZZ.length;
        this.LJ = i;
    }

    @Override // X.AbstractC1532040pyE
    public final void LJIIIZ(int i, byte[] bArr, int i2, int i3, C1532070pyH c1532070pyH) {
        LIZ(i, i3);
        System.arraycopy(this.LJIIIIZZ, i, bArr, i2, i3);
    }
}
