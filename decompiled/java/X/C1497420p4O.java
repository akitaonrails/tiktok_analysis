package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okio.ByteString;

/* JADX INFO: renamed from: X.0p4O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1497420p4O {
    public final long LIZ;
    public final boolean LIZIZ;
    public final InterfaceC1496620p36 LIZJ;
    public final InterfaceC1497590p4f LIZLLL;
    public boolean LJ;
    public int LJFF;
    public long LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public final C1496690p3D LJIIIZ = new C1496690p3D();
    public final C1496690p3D LJIIJ = new C1496690p3D();
    public final byte[] LJIIJJI;
    public final C1496760p3K LJIIL;

    public final void LIZ() {
        short s;
        long j = this.LJI;
        if (j > 0) {
            this.LIZJ.LJJJJLI(this.LJIIIZ, j);
            if (!this.LIZIZ) {
                this.LJIIIZ.LJIILLIIL(this.LJIIL);
                this.LJIIL.LIZIZ(0L);
                C1497500p4W.LIZIZ(this.LJIIL, this.LJIIJJI);
                this.LJIIL.close();
            }
        }
        int i = this.LJFF;
        if (i == 9) {
            InterfaceC1497590p4f interfaceC1497590p4f = this.LIZLLL;
            ByteString byteStringLJIJJ = this.LJIIIZ.LJIJJ();
            C1497410p4N c1497410p4N = (C1497410p4N) interfaceC1497590p4f;
            synchronized (c1497410p4N) {
                if (!c1497410p4N.LJIJ && (!c1497410p4N.LJIILJJIL || !c1497410p4N.LJI.isEmpty())) {
                    c1497410p4N.LJFF.add(byteStringLJIJJ);
                    C822660WOy c822660WOy = c1497410p4N.LJIIJJI;
                    if (c822660WOy != null) {
                        c822660WOy.execute(c1497410p4N.LJ);
                    }
                    return;
                }
                return;
            }
        }
        if (i == 10) {
            InterfaceC1497590p4f interfaceC1497590p4f2 = this.LIZLLL;
            this.LJIIIZ.LJIJJ();
            ((C1497410p4N) interfaceC1497590p4f2).LJII();
            return;
        }
        if (i != 8) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unknown control opcode: ");
            sbLIZ.append(Integer.toHexString(this.LJFF));
            throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ));
        }
        String strLJJIZ = "";
        C1496690p3D c1496690p3D = this.LJIIIZ;
        long j2 = c1496690p3D.LLILLJJLI;
        if (j2 == 1) {
            throw new ProtocolException("Malformed close payload length of 1.");
        }
        if (j2 != 0) {
            s = c1496690p3D.readShort();
            strLJJIZ = this.LJIIIZ.LJJIZ();
            String strLIZ = C1497500p4W.LIZ(s);
            if (strLIZ != null) {
                throw new ProtocolException(strLIZ);
            }
        } else {
            s = 1005;
        }
        ((C1497410p4N) this.LIZLLL).LJI(s, strLJJIZ);
        this.LJ = true;
    }

    public final void LIZIZ() {
        if (this.LJ) {
            throw new IOException("closed");
        }
        long jLJII = this.LIZJ.timeout().LJII();
        this.LIZJ.timeout().LIZIZ();
        try {
            int i = this.LIZJ.readByte() & 255;
            this.LIZJ.timeout().LJI(jLJII, TimeUnit.NANOSECONDS);
            this.LJFF = i & 15;
            boolean z = (i & 128) != 0;
            this.LJII = z;
            boolean z2 = (i & 8) != 0;
            this.LJIIIIZZ = z2;
            if (z2 && !z) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z3 = (i & 64) != 0;
            boolean z4 = (i & 32) != 0;
            boolean z5 = (i & 16) != 0;
            if (z3 || z4 || z5) {
                throw new ProtocolException("Reserved flags are unsupported.");
            }
            int i2 = this.LIZJ.readByte() & 255;
            boolean z6 = (i2 & 128) != 0;
            if (z6 == this.LIZIZ) {
                throw new ProtocolException(this.LIZIZ ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j = i2 & 127;
            this.LJI = j;
            if (j == 126) {
                this.LJI = ((long) this.LIZJ.readShort()) & 65535;
            } else if (j == 127) {
                long j2 = this.LIZJ.readLong();
                this.LJI = j2;
                if (j2 < 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Frame length 0x");
                    sbLIZ.append(Long.toHexString(this.LJI));
                    sbLIZ.append(" > 0x7FFFFFFFFFFFFFFF");
                    throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            if (this.LJIIIIZZ && this.LJI > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z6) {
                this.LIZJ.readFully(this.LJIIJJI);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ.timeout().LJI(jLJII, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    public C1497420p4O(boolean z, InterfaceC1496620p36 interfaceC1496620p36, C1497410p4N c1497410p4N, long j) {
        byte[] bArr;
        if (interfaceC1496620p36 != null) {
            if (c1497410p4N != null) {
                this.LIZIZ = z;
                this.LIZJ = interfaceC1496620p36;
                this.LIZLLL = c1497410p4N;
                this.LIZ = j;
                if (z) {
                    bArr = null;
                } else {
                    bArr = new byte[4];
                }
                this.LJIIJJI = bArr;
                this.LJIIL = z ? null : new C1496760p3K();
                return;
            }
            throw new NullPointerException("frameCallback == null");
        }
        throw new NullPointerException("source == null");
    }
}
