package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import dtj.u7;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.1Bwi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2221261Bwi implements InterfaceC2221401Bww {
    public final InterfaceC2221271Bwj LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public volatile Exception LIZLLL;
    public final /* synthetic */ C2221281Bwk LJ;

    @Override // X.InterfaceC2221401Bww
    public final void execute() {
        C2221281Bwk c2221281Bwk;
        InterfaceC2221271Bwj interfaceC2221271Bwj;
        C133L c133l = this.LJ.LJFF;
        if (c133l != null) {
            try {
                if (c133l.length() == 0) {
                    long j = this.LIZIZ;
                    if (j % 16 != 0) {
                        C2221281Bwk c2221281Bwk2 = this.LJ;
                        int i = (int) (16 - (j % 16));
                        c2221281Bwk2.LJIIJ = i;
                        j += (long) i;
                        c2221281Bwk2.LJIIJJI = this.LIZ.LIZ(i);
                    }
                    this.LJ.LJI = j;
                    C2221281Bwk c2221281Bwk3 = this.LJ;
                    c2221281Bwk3.LJII(true, "Produce on empty file, mMp4HeaderSize:%d", Long.valueOf(c2221281Bwk3.LJI));
                    if (this.LIZIZ == 0) {
                        C1448790nnx.LJII(100102, this.LJ.LJIIZILJ, "");
                    }
                    int i2 = (int) j;
                    C1637890six.LIZ.LIZJ("parallel_upload_ve_compile_first_offset", i2, null, Boolean.valueOf(u7.LJ()));
                    write(new byte[i2], 0, i2);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("produce write: data length: ");
                    sbLIZ.append(this.LIZ.getLength());
                    sbLIZ.append(", offset = ");
                    sbLIZ.append(this.LJ.LJIIJ);
                    sbLIZ.append(", size = ");
                    sbLIZ.append(this.LIZJ - this.LJ.LJIIJ);
                    C201955140j.LIZIZ("upload2G", C2188811AlT.LIZIZ(sbLIZ));
                    C2221281Bwk c2221281Bwk4 = this.LJ;
                    C133L c133l2 = c2221281Bwk4.LJFF;
                    InterfaceC2221271Bwj interfaceC2221271Bwj2 = this.LIZ;
                    int i3 = c2221281Bwk4.LJIIJ;
                    int i4 = this.LIZJ - i3;
                    c133l2.getClass();
                    interfaceC2221271Bwj2.LIZIZ(c133l2, i3, i4);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("produce write: data length: ");
                    sbLIZ2.append(this.LIZ.getLength());
                    sbLIZ2.append(", offset = ");
                    sbLIZ2.append(this.LIZIZ);
                    sbLIZ2.append(", size = ");
                    sbLIZ2.append(this.LIZJ);
                    C201955140j.LIZIZ("upload2G", C2188811AlT.LIZIZ(sbLIZ2));
                    seek(this.LIZIZ);
                    C133L c133l3 = this.LJ.LJFF;
                    InterfaceC2221271Bwj interfaceC2221271Bwj3 = this.LIZ;
                    int i5 = this.LIZJ;
                    c133l3.getClass();
                    interfaceC2221271Bwj3.LIZIZ(c133l3, 0, i5);
                    if (this.LIZIZ == 0 && (interfaceC2221271Bwj = (c2221281Bwk = this.LJ).LJIIJJI) != null) {
                        C133L c133l4 = c2221281Bwk.LJFF;
                        int i6 = c2221281Bwk.LJIIJ;
                        c133l4.getClass();
                        interfaceC2221271Bwj.LIZIZ(c133l4, 0, i6);
                    }
                }
                this.LJ.LJII(false, "write offset:%d size:%d", Long.valueOf(this.LIZIZ), Integer.valueOf(this.LIZJ));
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZLLL = e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("ArrayIndexOutOfBoundsException: index out of bounds when producing data, mSize = ");
                sbLIZ3.append(this.LIZJ);
                sbLIZ3.append(", alignBias = ");
                sbLIZ3.append(this.LJ.LJIIJ);
                C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        ((ReentrantLock) this.LJ.LIZ).lock();
        this.LJ.LIZIZ.signalAll();
        ((ReentrantLock) this.LJ.LIZ).unlock();
    }

    public C2221261Bwi(C2221281Bwk c2221281Bwk, InterfaceC2221271Bwj interfaceC2221271Bwj, long j, int i) {
        this.LJ = c2221281Bwk;
        this.LIZ = interfaceC2221271Bwj;
        this.LIZIZ = j;
        this.LIZJ = i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProduceCommand: data length: ");
        sbLIZ.append(interfaceC2221271Bwj.getLength());
        sbLIZ.append(", offset = ");
        sbLIZ.append(j);
        sbLIZ.append(", size = ");
        sbLIZ.append(i);
        C201955140j.LIZIZ("upload2G", C2188811AlT.LIZIZ(sbLIZ));
    }
}
