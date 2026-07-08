package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okio.ByteString;

/* JADX INFO: renamed from: X.0p4P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1497430p4P {
    public final boolean LIZ;
    public final InterfaceC1496620p36 LIZIZ;
    public final InterfaceC1497600p4g LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public long LJFF;
    public boolean LJI;
    public boolean LJII;
    public final C1496690p3D LJIIIIZZ = new C1496690p3D();
    public final C1496690p3D LJIIIZ = new C1496690p3D();
    public final byte[] LJIIJ;
    public final C1496760p3K LJIIJJI;

    public final void LIZ() {
        short s;
        long j = this.LJFF;
        if (j > 0) {
            this.LIZIZ.LJJJJLI(this.LJIIIIZZ, j);
            if (!this.LIZ) {
                this.LJIIIIZZ.LJIILLIIL(this.LJIIJJI);
                this.LJIIJJI.LIZIZ(0L);
                C1497510p4X.LIZIZ(this.LJIIJJI, this.LJIIJ);
                this.LJIIJJI.close();
            }
        }
        switch (this.LJ) {
            case 8:
                String strLJJIZ = "";
                C1496690p3D c1496690p3D = this.LJIIIIZZ;
                long j2 = c1496690p3D.LLILLJJLI;
                if (j2 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j2 != 0) {
                    s = c1496690p3D.readShort();
                    strLJJIZ = this.LJIIIIZZ.LJJIZ();
                    String strLIZ = C1497510p4X.LIZ(s);
                    if (strLIZ != null) {
                        throw new ProtocolException(strLIZ);
                    }
                } else {
                    s = 1005;
                }
                ((C1497400p4M) this.LIZJ).LJI(s, strLJJIZ);
                this.LIZLLL = true;
                return;
            case BdTuring.TYPE_ECAF /* 9 */:
                InterfaceC1497600p4g interfaceC1497600p4g = this.LIZJ;
                ByteString byteStringLJIJJ = this.LJIIIIZZ.LJIJJ();
                C1497400p4M c1497400p4M = (C1497400p4M) interfaceC1497600p4g;
                synchronized (c1497400p4M) {
                    if (!c1497400p4M.LJIIZILJ && (!c1497400p4M.LJIILJJIL || !c1497400p4M.LJIIL.isEmpty())) {
                        c1497400p4M.LJIIJJI.add(byteStringLJIJJ);
                        C822660WOy c822660WOy = c1497400p4M.LJIIIZ;
                        if (c822660WOy != null) {
                            c822660WOy.execute(c1497400p4M.LJI);
                            break;
                        }
                        return;
                    }
                    return;
                }
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                InterfaceC1497600p4g interfaceC1497600p4g2 = this.LIZJ;
                this.LJIIIIZZ.LJIJJ();
                ((C1497400p4M) interfaceC1497600p4g2).LJII();
                return;
            default:
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unknown control opcode: ");
                sbLIZ.append(Integer.toHexString(this.LJ));
                throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LIZIZ() {
        if (this.LIZLLL) {
            throw new IOException("closed");
        }
        long jLJII = this.LIZIZ.timeout().LJII();
        this.LIZIZ.timeout().LIZIZ();
        try {
            int i = this.LIZIZ.readByte() & 255;
            this.LIZIZ.timeout().LJI(jLJII, TimeUnit.NANOSECONDS);
            this.LJ = i & 15;
            boolean z = (i & 128) != 0;
            this.LJI = z;
            boolean z2 = (i & 8) != 0;
            this.LJII = z2;
            if (z2 && !z) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z3 = (i & 64) != 0;
            boolean z4 = (i & 32) != 0;
            boolean z5 = (i & 16) != 0;
            if (z3 || z4 || z5) {
                throw new ProtocolException("Reserved flags are unsupported.");
            }
            int i2 = this.LIZIZ.readByte() & 255;
            boolean z6 = (i2 & 128) != 0;
            if (z6 == this.LIZ) {
                throw new ProtocolException(this.LIZ ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j = i2 & 127;
            this.LJFF = j;
            if (j == 126) {
                this.LJFF = ((long) this.LIZIZ.readShort()) & 65535;
            } else if (j == 127) {
                long j2 = this.LIZIZ.readLong();
                this.LJFF = j2;
                if (j2 < 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Frame length 0x");
                    sbLIZ.append(Long.toHexString(this.LJFF));
                    sbLIZ.append(" > 0x7FFFFFFFFFFFFFFF");
                    throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            if (this.LJII && this.LJFF > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z6) {
                this.LIZIZ.readFully(this.LJIIJ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZIZ.timeout().LJI(jLJII, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    public C1497430p4P(boolean z, InterfaceC1496620p36 interfaceC1496620p36, C1497400p4M c1497400p4M) {
        byte[] bArr;
        if (interfaceC1496620p36 != null) {
            if (c1497400p4M != null) {
                this.LIZ = z;
                this.LIZIZ = interfaceC1496620p36;
                this.LIZJ = c1497400p4M;
                if (z) {
                    bArr = null;
                } else {
                    bArr = new byte[4];
                }
                this.LJIIJ = bArr;
                this.LJIIJJI = z ? null : new C1496760p3K();
                return;
            }
            throw new NullPointerException("frameCallback == null");
        }
        throw new NullPointerException("source == null");
    }
}
