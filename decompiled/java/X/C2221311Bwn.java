package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.1Bwn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2221311Bwn implements InterfaceC2221401Bww {
    public final long LIZ;
    public final byte[] LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public volatile int LJ;
    public Exception LJFF;
    public volatile EnumC2221351Bwr LJI;
    public final /* synthetic */ C2221281Bwk LJII;

    @Override // X.InterfaceC2221401Bww
    public final void execute() {
        long length = this.LJII.LJIILJJIL.length();
        if (this.LJII.LJII) {
            if (this.LIZ < length) {
                LIZIZ(length);
                return;
            } else {
                LIZ(EnumC2221351Bwr.CONSUME_END);
                return;
            }
        }
        if (this.LIZJ > length) {
            this.LJI = EnumC2221351Bwr.CONSUME_WAIT_DATA;
        } else {
            LIZIZ(length);
        }
    }

    public final void LIZ(EnumC2221351Bwr enumC2221351Bwr) {
        ((ReentrantLock) this.LJII.LIZJ).lock();
        this.LJI = enumC2221351Bwr;
        this.LJII.LIZLLL.signalAll();
        ((ReentrantLock) this.LJII.LIZJ).unlock();
    }

    public final void LIZIZ(long j) {
        long jMin = Math.min(this.LIZLLL, j) - this.LIZ;
        if (jMin > 16) {
            jMin -= jMin % 16;
        }
        this.LJ = (int) jMin;
        C133L c133l = this.LJII.LJFF;
        if (c133l != null) {
            try {
                c133l.seek(this.LIZ);
                read(this.LIZIZ, 0, this.LJ);
                LIZ(EnumC2221351Bwr.CONSUME_DONE);
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                this.LJFF = e;
                LIZ(EnumC2221351Bwr.CONSUME_FAIL);
            }
        }
    }

    public C2221311Bwn(C2221281Bwk c2221281Bwk, long j, byte[] bArr, int i, int i2) {
        this.LJII = c2221281Bwk;
        this.LIZ = j;
        this.LIZIZ = bArr;
        this.LIZLLL = ((long) i) + j;
        this.LIZJ = j + ((long) i2);
    }
}
