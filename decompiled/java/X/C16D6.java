package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: X.16D6, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16D6 extends C16D2 {
    public final C13AX LIZIZ;
    public C16DC LIZJ;
    public final C16D9 LIZLLL;
    public final List<C16DC> LJ;
    public C16DC LJFF;
    public C16DN LJI;
    public final List<C16DN> LJII;
    public C16DG LJIIIIZZ;
    public final List<ByteBuffer> LJIIIZ;
    public ByteBuffer LJIIJ;
    public final SecureRandom LJIIJJI;
    public final int LJIIL;

    public static byte LJIJI(int i) {
        if (i == 1) {
            return (byte) 64;
        }
        if (i != 2) {
            return i != 3 ? (byte) 0 : (byte) 16;
        }
        return (byte) 32;
    }

    @Override // X.C16D2
    public final void LJIIJ() {
        this.LJIIJ = null;
        C16DC c16dc = this.LIZJ;
        if (c16dc != null) {
            c16dc.reset();
        }
        this.LIZJ = new C16D9();
        this.LJI = null;
    }

    @Override // X.C16D2
    public final C16D6 LIZJ() {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) this.LJ).iterator();
        while (it2.hasNext()) {
            arrayList.add(((C16DC) it2.next()).LIZ());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = ((ArrayList) this.LJII).iterator();
        while (it3.hasNext()) {
            arrayList2.add(((C16DN) it3.next()).LIZ());
        }
        return new C16D6(arrayList, arrayList2, this.LJIIL);
    }

    public final void LJIILJJIL() throws C16DH {
        long jLimit;
        synchronized (this.LJIIIZ) {
            try {
                Iterator it2 = ((ArrayList) this.LJIIIZ).iterator();
                jLimit = 0;
                while (it2.hasNext()) {
                    jLimit += (long) ((ByteBuffer) it2.next()).limit();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (jLimit <= this.LJIIL) {
            return;
        }
        LJIILL();
        this.LIZIZ.trace("Payload limit reached. Allowed: {} Current: {}", Integer.valueOf(this.LJIIL), Long.valueOf(jLimit));
        throw new C16DH(this.LJIIL);
    }

    public final void LJIILL() {
        synchronized (this.LJIIIZ) {
            try {
                ((ArrayList) this.LJIIIZ).clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final ByteBuffer LJIJ() {
        ByteBuffer byteBufferAllocate;
        synchronized (this.LJIIIZ) {
            try {
                Iterator it2 = ((ArrayList) this.LJIIIZ).iterator();
                long jLimit = 0;
                while (it2.hasNext()) {
                    jLimit += (long) ((ByteBuffer) it2.next()).limit();
                }
                LJIILJJIL();
                byteBufferAllocate = ByteBuffer.allocate((int) jLimit);
                Iterator it3 = ((ArrayList) this.LJIIIZ).iterator();
                while (it3.hasNext()) {
                    byteBufferAllocate.put((ByteBuffer) it3.next());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public final int hashCode() {
        C16DC c16dc = this.LIZJ;
        int iHashCode = (c16dc != null ? c16dc.hashCode() : 0) * 31;
        C16DN c16dn = this.LJI;
        int iHashCode2 = (iHashCode + (c16dn != null ? c16dn.hashCode() : 0)) * 31;
        int i = this.LJIIL;
        return iHashCode2 + (i ^ (i >>> 32));
    }

    public C16D6() {
        this(Collections.emptyList(), Collections.singletonList(new C0WAM("")), Integer.MAX_VALUE);
    }

    @Override // X.C16D2
    public final String toString() {
        String string = super.toString();
        if (this.LIZJ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(string);
            sbLIZ.append(" extension: ");
            sbLIZ.append(this.LIZJ.toString());
            string = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (this.LJI != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(string);
            sbLIZ2.append(" protocol: ");
            sbLIZ2.append(this.LJI.toString());
            string = C2188811AlT.LIZIZ(sbLIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(string);
        sbLIZ3.append(" max frame size: ");
        sbLIZ3.append(this.LJIIL);
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    @Override // X.C16D2
    public final EnumC994310byv LJI() {
        return EnumC994310byv.TWOWAY;
    }

    public static String LJIIZILJ(String str) {
        String strTrim = str.trim();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strTrim);
        sbLIZ.append("258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(strLIZIZ.getBytes());
            try {
                return C089Q.LIZIZ(bArrDigest, bArrDigest.length);
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        } catch (NoSuchAlgorithmException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new IllegalStateException(e2);
        }
    }

    @Override // X.C16D2
    public final EnumC994240byo LIZIZ(C16DX c16dx) {
        EnumC994240byo enumC994240byo;
        String strLJ = c16dx.LJ("Sec-WebSocket-Version");
        if (strLJ.length() > 0) {
            try {
                if (CastIntegerProtector.parseInt(strLJ.trim()) == 13) {
                    EnumC994240byo enumC994240byo2 = EnumC994240byo.NOT_MATCHED;
                    c16dx.LJ("Sec-WebSocket-Extensions");
                    Iterator it2 = ((ArrayList) this.LJ).iterator();
                    if (it2.hasNext()) {
                        C16DC c16dc = (C16DC) it2.next();
                        c16dc.LJI();
                        this.LIZJ = c16dc;
                        enumC994240byo = EnumC994240byo.MATCHED;
                        this.LIZIZ.trace("acceptHandshakeAsServer - Matching extension found: {}", c16dc);
                    } else {
                        enumC994240byo = enumC994240byo2;
                    }
                    EnumC994240byo enumC994240byoLJIILLIIL = LJIILLIIL(c16dx.LJ("Sec-WebSocket-Protocol"));
                    EnumC994240byo enumC994240byo3 = EnumC994240byo.MATCHED;
                    if (enumC994240byoLJIILLIIL == enumC994240byo3 && enumC994240byo == enumC994240byo3) {
                        return enumC994240byo3;
                    }
                    this.LIZIZ.trace("acceptHandshakeAsServer - No matching extension or protocol found.");
                    return enumC994240byo2;
                }
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        this.LIZIZ.trace("acceptHandshakeAsServer - Wrong websocket version.");
        return EnumC994240byo.NOT_MATCHED;
    }

    @Override // X.C16D2
    public final ByteBuffer LIZLLL(C16DG c16dg) {
        boolean z;
        int i;
        int i2;
        int i3;
        byte b;
        int i4;
        String str;
        this.LIZJ.LIZJ();
        if (this.LIZIZ.isTraceEnabled()) {
            C13AX c13ax = this.LIZIZ;
            Integer numValueOf = Integer.valueOf(c16dg.LIZIZ().remaining());
            if (c16dg.LIZIZ().remaining() > 1000) {
                str = "too big to display";
            } else {
                str = new String(c16dg.LIZIZ().array());
            }
            c13ax.trace("afterEnconding({}): {}", numValueOf, str);
        }
        ByteBuffer byteBufferLIZIZ = c16dg.LIZIZ();
        int i5 = 0;
        if (this.LIZ == EnumC19524111a3.CLIENT) {
            z = true;
        } else {
            z = false;
        }
        if (byteBufferLIZIZ.remaining() <= 125) {
            i = 1;
            i2 = 1;
        } else {
            if (byteBufferLIZIZ.remaining() <= 65535) {
                i = 2;
            } else {
                i = 8;
            }
            i2 = i + 1;
        }
        int i6 = i2 + 1;
        if (z) {
            i3 = 4;
        } else {
            i3 = 0;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i6 + i3 + byteBufferLIZIZ.remaining());
        C16DB c16dbLIZJ = c16dg.LIZJ();
        if (c16dbLIZJ == C16DB.CONTINUOUS) {
            b = 0;
        } else if (c16dbLIZJ == C16DB.TEXT) {
            b = 1;
        } else if (c16dbLIZJ == C16DB.BINARY) {
            b = 2;
        } else if (c16dbLIZJ == C16DB.CLOSING) {
            b = 8;
        } else if (c16dbLIZJ == C16DB.PING) {
            b = 9;
        } else if (c16dbLIZJ == C16DB.PONG) {
            b = 10;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Don't know how to handle ");
            sbLIZ.append(c16dbLIZJ.toString());
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        byte b2 = -128;
        if (c16dg.LIZ()) {
            i4 = -128;
        } else {
            i4 = 0;
        }
        byte bLJIJI = (byte) (b | ((byte) i4));
        if (c16dg.LIZLLL()) {
            bLJIJI = (byte) (bLJIJI | LJIJI(1));
        }
        if (c16dg.LJ()) {
            bLJIJI = (byte) (bLJIJI | LJIJI(2));
        }
        if (c16dg.LJFF()) {
            bLJIJI = (byte) (bLJIJI | LJIJI(3));
        }
        byteBufferAllocate.put(bLJIJI);
        long jRemaining = byteBufferLIZIZ.remaining();
        byte[] bArr = new byte[i];
        int i7 = (i * 8) - 8;
        int i8 = 0;
        do {
            bArr[i8] = (byte) (jRemaining >>> (i7 - (i8 * 8)));
            i8++;
        } while (i8 < i);
        if (i == 1) {
            byte b3 = bArr[0];
            if (!z) {
                b2 = 0;
            }
            byteBufferAllocate.put((byte) (b3 | b2));
        } else if (i == 2) {
            if (!z) {
                b2 = 0;
            }
            byteBufferAllocate.put((byte) (b2 | 126));
            byteBufferAllocate.put(bArr);
        } else if (i == 8) {
            if (!z) {
                b2 = 0;
            }
            byteBufferAllocate.put((byte) (b2 | 127));
            byteBufferAllocate.put(bArr);
        } else {
            throw new IllegalStateException("Size representation not supported/specified");
        }
        if (z) {
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
            byteBufferAllocate2.putInt(this.LJIIJJI.nextInt());
            byteBufferAllocate.put(byteBufferAllocate2.array());
            while (byteBufferLIZIZ.hasRemaining()) {
                byteBufferAllocate.put((byte) (byteBufferLIZIZ.get() ^ byteBufferAllocate2.get(i5 % 4)));
                i5++;
            }
        } else {
            byteBufferAllocate.put(byteBufferLIZIZ);
            byteBufferLIZIZ.flip();
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    @Override // X.C16D2
    public final C16DZ LJII(C16DR c16dr) {
        String strLIZIZ;
        c16dr.LJFF("Upgrade", "websocket");
        c16dr.LJFF("Connection", "Upgrade");
        byte[] bArr = new byte[16];
        this.LJIIJJI.nextBytes(bArr);
        try {
            strLIZIZ = C089Q.LIZIZ(bArr, 16);
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            strLIZIZ = null;
        }
        c16dr.LJFF("Sec-WebSocket-Key", strLIZIZ);
        c16dr.LJFF("Sec-WebSocket-Version", "13");
        StringBuilder sb = new StringBuilder();
        for (C16DC c16dc : (ArrayList) this.LJ) {
            c16dc.LJFF();
            c16dc.LJFF();
        }
        if (sb.length() != 0) {
            c16dr.LJFF("Sec-WebSocket-Extensions", sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        for (C16DN c16dn : (ArrayList) this.LJII) {
            if (c16dn.LIZJ().length() != 0) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(c16dn.LIZJ());
            }
        }
        if (sb2.length() != 0) {
            c16dr.LJFF("Sec-WebSocket-Protocol", sb2.toString());
        }
        return c16dr;
    }

    @Override // X.C16D2
    public final List<C16DG> LJIIJJI(ByteBuffer byteBuffer) throws C16DI {
        LinkedList linkedList;
        while (true) {
            linkedList = new LinkedList();
            if (this.LJIIJ == null) {
                break;
            }
            try {
                byteBuffer.mark();
                int iRemaining = byteBuffer.remaining();
                int iRemaining2 = this.LJIIJ.remaining();
                if (iRemaining2 > iRemaining) {
                    this.LJIIJ.put(byteBuffer.array(), byteBuffer.position(), iRemaining);
                    byteBuffer.position(byteBuffer.position() + iRemaining);
                    return Collections.emptyList();
                }
                this.LJIIJ.put(byteBuffer.array(), byteBuffer.position(), iRemaining2);
                byteBuffer.position(byteBuffer.position() + iRemaining2);
                linkedList.add(LJIL((ByteBuffer) this.LJIIJ.duplicate().position(0)));
                this.LJIIJ = null;
            } catch (C16DU e) {
                TryCatchGuardChecker.doCheck(e);
                int preferredSize = e.getPreferredSize();
                if (preferredSize >= 0) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(preferredSize);
                    this.LJIIJ.rewind();
                    byteBufferAllocate.put(this.LJIIJ);
                    this.LJIIJ = byteBufferAllocate;
                } else {
                    throw new C16DI(1002, "Negative count");
                }
            }
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            try {
                linkedList.add(LJIL(byteBuffer));
            } catch (C16DU e2) {
                TryCatchGuardChecker.doCheck(e2);
                byteBuffer.reset();
                int preferredSize2 = e2.getPreferredSize();
                if (preferredSize2 >= 0) {
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(preferredSize2);
                    this.LJIIJ = byteBufferAllocate2;
                    byteBufferAllocate2.put(byteBuffer);
                } else {
                    throw new C16DI(1002, "Negative count");
                }
            }
        }
        return linkedList;
    }

    public final void LJIILIIL(ByteBuffer byteBuffer) {
        synchronized (this.LJIIIZ) {
            try {
                ((ArrayList) this.LJIIIZ).add(byteBuffer);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final EnumC994240byo LJIILLIIL(String str) {
        for (C16DN c16dn : (ArrayList) this.LJII) {
            if (c16dn.LIZIZ(str)) {
                this.LJI = c16dn;
                this.LIZIZ.trace("acceptHandshake - Matching protocol found: {}", c16dn);
                return EnumC994240byo.MATCHED;
            }
        }
        return EnumC994240byo.NOT_MATCHED;
    }

    public final C16D8 LJIL(ByteBuffer byteBuffer) throws C16DU, C16DI {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C16DB c16db;
        int i;
        C16D8 c16d7;
        String str;
        if (byteBuffer != null) {
            int iRemaining = byteBuffer.remaining();
            int i2 = 2;
            LJJI(iRemaining, 2);
            byte b = byteBuffer.get();
            if ((b >> 8) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((b & 64) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((b & 32) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((b & 16) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            byte b2 = byteBuffer.get();
            if ((b2 & (-128)) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            int iIntValue = (byte) (b2 & 127);
            byte b3 = (byte) (b & 15);
            if (b3 != 0) {
                if (b3 != 1) {
                    if (b3 != 2) {
                        switch (b3) {
                            case 8:
                                c16db = C16DB.CLOSING;
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                c16db = C16DB.PING;
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                c16db = C16DB.PONG;
                                break;
                            default:
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Unknown opcode ");
                                sbLIZ.append((int) b3);
                                throw new C16DK(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    } else {
                        c16db = C16DB.BINARY;
                    }
                } else {
                    c16db = C16DB.TEXT;
                }
            } else {
                c16db = C16DB.CONTINUOUS;
            }
            if (iIntValue < 0 || iIntValue > 125) {
                if (c16db != C16DB.PING && c16db != C16DB.PONG && c16db != C16DB.CLOSING) {
                    if (iIntValue == 126) {
                        LJJI(iRemaining, 4);
                        iIntValue = new BigInteger(new byte[]{0, byteBuffer.get(), byteBuffer.get()}).intValue();
                        i2 = 4;
                    } else {
                        i2 = 10;
                        LJJI(iRemaining, 10);
                        byte[] bArr = new byte[8];
                        int i3 = 0;
                        do {
                            bArr[i3] = byteBuffer.get();
                            i3++;
                        } while (i3 < 8);
                        long jLongValue = new BigInteger(bArr).longValue();
                        LJJ(jLongValue);
                        iIntValue = (int) jLongValue;
                    }
                } else {
                    this.LIZIZ.trace("Invalid frame: more than 125 octets");
                    throw new C16DK("more than 125 octets");
                }
            }
            LJJ(iIntValue);
            if (z5) {
                i = 4;
            } else {
                i = 0;
            }
            LJJI(iRemaining, i2 + i + iIntValue);
            if (iIntValue >= 0) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iIntValue);
                if (z5) {
                    byte[] bArr2 = new byte[4];
                    byteBuffer.get(bArr2);
                    for (int i4 = 0; i4 < iIntValue; i4++) {
                        byteBufferAllocate.put((byte) (byteBuffer.get() ^ bArr2[i4 % 4]));
                    }
                } else {
                    byteBufferAllocate.put(byteBuffer.array(), byteBuffer.position(), byteBufferAllocate.limit());
                    byteBuffer.position(byteBuffer.position() + byteBufferAllocate.limit());
                }
                if (c16db != null) {
                    switch (C16DA.LIZ[c16db.ordinal()]) {
                        case 1:
                            c16d7 = new C16DQ();
                            break;
                        case 2:
                            c16d7 = new C16DF();
                            break;
                        case 3:
                            c16d7 = new C16DD();
                            break;
                        case 4:
                            c16d7 = new C16DV() { // from class: X.16DO
                                {
                                    C16DB c16db2 = C16DB.BINARY;
                                }
                            };
                            break;
                        case 5:
                            c16d7 = new C16D7();
                            break;
                        case 6:
                            c16d7 = new C16DV() { // from class: X.16DP
                                {
                                    C16DB c16db2 = C16DB.CONTINUOUS;
                                }
                            };
                            break;
                        default:
                            throw new IllegalArgumentException("Supplied opcode is invalid");
                    }
                    c16d7.LIZ = z;
                    c16d7.LJ = z2;
                    c16d7.LJFF = z3;
                    c16d7.LJI = z4;
                    byteBufferAllocate.flip();
                    c16d7.LJII(byteBufferAllocate);
                    if (c16d7.LIZIZ != C16DB.CONTINUOUS) {
                        if (!c16d7.LJ && !c16d7.LJFF && !c16d7.LJI) {
                            this.LJFF = this.LIZLLL;
                        } else {
                            this.LJFF = this.LIZJ;
                        }
                    }
                    if (this.LJFF == null) {
                        this.LJFF = this.LIZLLL;
                    }
                    this.LJFF.LIZLLL(c16d7);
                    this.LJFF.LJ();
                    if (this.LIZIZ.isTraceEnabled()) {
                        C13AX c13ax = this.LIZIZ;
                        Integer numValueOf = Integer.valueOf(c16d7.LIZIZ().remaining());
                        if (c16d7.LIZIZ().remaining() > 1000) {
                            str = "too big to display";
                        } else {
                            str = new String(c16d7.LIZIZ().array());
                        }
                        c13ax.trace("afterDecoding({}): {}", numValueOf, str);
                    }
                    c16d7.LJI();
                    return c16d7;
                }
                throw new IllegalArgumentException("Supplied opcode cannot be null");
            }
            throw new C16DI(1002, "Negative count");
        }
        throw new IllegalArgumentException();
    }

    public final void LJJ(long j) throws C16DH {
        if (j <= 2147483647L) {
            int i = this.LJIIL;
            if (j <= i) {
                if (j >= 0) {
                    return;
                }
                this.LIZIZ.trace("Limit underflow: Payloadsize is to little...");
                throw new C16DH("Payloadsize is to little...");
            }
            this.LIZIZ.trace("Payload limit reached. Allowed: {} Current: {}", Integer.valueOf(i), Long.valueOf(j));
            throw new C16DH("Payload limit reached.", this.LJIIL);
        }
        this.LIZIZ.trace("Limit exedeed: Payloadsize is to big...");
        throw new C16DH("Payloadsize is to big...");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C16D6.class != obj.getClass()) {
            return false;
        }
        C16D6 c16d6 = (C16D6) obj;
        if (this.LJIIL != c16d6.LJIIL) {
            return false;
        }
        C16DC c16dc = this.LIZJ;
        if (c16dc != null) {
            if (!c16dc.equals(c16d6.LIZJ)) {
                return false;
            }
        } else if (c16d6.LIZJ != null) {
            return false;
        }
        C16DN c16dn = this.LJI;
        C16DN c16dn2 = c16d6.LJI;
        if (c16dn != null) {
            return c16dn.equals(c16dn2);
        }
        if (c16dn2 == null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C16D2
    public final EnumC994240byo LIZ(C16DZ c16dz, C16DY c16dy) {
        EnumC994240byo enumC994240byo;
        if (c16dy.LJ("Upgrade").equalsIgnoreCase("websocket") && c16dy.LJ("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade")) {
            if (((C16DT) c16dz).LIZIZ("Sec-WebSocket-Key") && c16dy.LIZIZ("Sec-WebSocket-Accept")) {
                if (!LJIIZILJ(((C16DT) c16dz).LJ("Sec-WebSocket-Key")).equals(c16dy.LJ("Sec-WebSocket-Accept"))) {
                    this.LIZIZ.trace("acceptHandshakeAsClient - Wrong key for Sec-WebSocket-Key.");
                    return EnumC994240byo.NOT_MATCHED;
                }
                EnumC994240byo enumC994240byo2 = EnumC994240byo.NOT_MATCHED;
                c16dy.LJ("Sec-WebSocket-Extensions");
                Iterator it2 = ((ArrayList) this.LJ).iterator();
                if (it2.hasNext()) {
                    C16DC c16dc = (C16DC) it2.next();
                    c16dc.LJII();
                    this.LIZJ = c16dc;
                    enumC994240byo = EnumC994240byo.MATCHED;
                    this.LIZIZ.trace("acceptHandshakeAsClient - Matching extension found: {}", c16dc);
                } else {
                    enumC994240byo = enumC994240byo2;
                }
                EnumC994240byo enumC994240byoLJIILLIIL = LJIILLIIL(c16dy.LJ("Sec-WebSocket-Protocol"));
                EnumC994240byo enumC994240byo3 = EnumC994240byo.MATCHED;
                if (enumC994240byoLJIILLIIL == enumC994240byo3 && enumC994240byo == enumC994240byo3) {
                    return enumC994240byo3;
                }
                this.LIZIZ.trace("acceptHandshakeAsClient - No matching extension or protocol found.");
                return enumC994240byo2;
            }
            this.LIZIZ.trace("acceptHandshakeAsClient - Missing Sec-WebSocket-Key or Sec-WebSocket-Accept");
            return EnumC994240byo.NOT_MATCHED;
        }
        this.LIZIZ.trace("acceptHandshakeAsClient - Missing/wrong upgrade or connection in handshake.");
        return EnumC994240byo.NOT_MATCHED;
    }

    @Override // X.C16D2
    public final List<C16DG> LJ(String str, boolean z) {
        C16DD c16dd = new C16DD();
        c16dd.LIZJ = ByteBuffer.wrap(str.getBytes(StandardCharsets.UTF_8));
        c16dd.LIZLLL = z;
        try {
            c16dd.LJI();
            return Collections.singletonList(c16dd);
        } catch (C16DI e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C1286500jaC(e);
        }
    }

    @Override // X.C16D2
    public final void LJIIIIZZ(C16D0 c16d0, C16DG c16dg) throws C16DI {
        int i;
        String str;
        C16DB c16dbLIZJ = c16dg.LIZJ();
        if (c16dbLIZJ == C16DB.CLOSING) {
            if (c16dg instanceof C16D7) {
                C16D7 c16d7 = (C16D7) c16dg;
                i = c16d7.LJII;
                str = c16d7.LJIIIIZZ;
            } else {
                i = 1005;
                str = "";
            }
            if (c16d0.LLJ == EnumC199634139c.CLOSING) {
                c16d0.LJ(i, str, true);
                return;
            } else {
                c16d0.LIZJ(i, str, true);
                return;
            }
        }
        if (c16dbLIZJ == C16DB.PING) {
            c16d0.LLILZ.getClass();
            c16d0.LJIILIIL(Collections.singletonList(new C16DF((C16DQ) c16dg)));
            return;
        }
        if (c16dbLIZJ == C16DB.PONG) {
            c16d0.getClass();
            c16d0.LLJJIJI = System.nanoTime();
            c16d0.LLILZ.getClass();
            return;
        }
        if (c16dg.LIZ() && c16dbLIZJ != C16DB.CONTINUOUS) {
            if (this.LJIIIIZZ == null) {
                if (c16dbLIZJ == C16DB.TEXT) {
                    try {
                        c16d0.LLILZ.LJ(C1336120ksE.LIZIZ(c16dg.LIZIZ()), c16d0);
                        return;
                    } catch (RuntimeException e) {
                        TryCatchGuardChecker.doCheck(e);
                        LJIJJ(c16d0, e);
                        return;
                    }
                }
                if (c16dbLIZJ == C16DB.BINARY) {
                    try {
                        C16D4 c16d4 = c16d0.LLILZ;
                        c16dg.LIZIZ();
                        c16d4.LIZJ();
                        return;
                    } catch (RuntimeException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        LJIJJ(c16d0, e2);
                        return;
                    }
                }
                this.LIZIZ.error("non control or continious frame expected");
                throw new C16DI(1002, "non control or continious frame expected");
            }
            this.LIZIZ.error("Protocol error: Continuous frame sequence not completed.");
            throw new C16DI(1002, "Continuous frame sequence not completed.");
        }
        if (c16dbLIZJ != C16DB.CONTINUOUS) {
            if (this.LJIIIIZZ == null) {
                this.LJIIIIZZ = c16dg;
                LJIILIIL(c16dg.LIZIZ());
                LJIILJJIL();
            } else {
                this.LIZIZ.trace("Protocol error: Previous continuous frame sequence not completed.");
                throw new C16DI(1002, "Previous continuous frame sequence not completed.");
            }
        } else if (c16dg.LIZ()) {
            if (this.LJIIIIZZ != null) {
                LJIILIIL(c16dg.LIZIZ());
                LJIILJJIL();
                if (this.LJIIIIZZ.LIZJ() == C16DB.TEXT) {
                    ((C16D8) this.LJIIIIZZ).LJII(LJIJ());
                    ((C16D8) this.LJIIIIZZ).LJI();
                    try {
                        c16d0.LLILZ.LJ(C1336120ksE.LIZIZ(this.LJIIIIZZ.LIZIZ()), c16d0);
                    } catch (RuntimeException e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        LJIJJ(c16d0, e3);
                    }
                } else if (this.LJIIIIZZ.LIZJ() == C16DB.BINARY) {
                    ((C16D8) this.LJIIIIZZ).LJII(LJIJ());
                    ((C16D8) this.LJIIIIZZ).LJI();
                    try {
                        C16D4 c16d42 = c16d0.LLILZ;
                        this.LJIIIIZZ.LIZIZ();
                        c16d42.LIZJ();
                    } catch (RuntimeException e4) {
                        TryCatchGuardChecker.doCheck(e4);
                        LJIJJ(c16d0, e4);
                    }
                }
                this.LJIIIIZZ = null;
                LJIILL();
            } else {
                this.LIZIZ.trace("Protocol error: Previous continuous frame sequence not completed.");
                throw new C16DI(1002, "Continuous frame sequence was not started.");
            }
        } else if (this.LJIIIIZZ == null) {
            this.LIZIZ.error("Protocol error: Continuous frame sequence was not started.");
            throw new C16DI(1002, "Continuous frame sequence was not started.");
        }
        if (c16dbLIZJ == C16DB.TEXT && !C1336120ksE.LIZ(c16dg.LIZIZ())) {
            this.LIZIZ.error("Protocol error: Payload is not UTF8");
            throw new C16DI(1007);
        }
        if (c16dbLIZJ != C16DB.CONTINUOUS || this.LJIIIIZZ == null) {
            return;
        }
        LJIILIIL(c16dg.LIZIZ());
    }

    public final void LJIJJ(C16D0 c16d0, RuntimeException runtimeException) {
        this.LIZIZ.error("Runtime exception during onWebsocketMessage", (Throwable) runtimeException);
        c16d0.LLILZ.LJIIZILJ(c16d0, runtimeException);
    }

    public final InterfaceC20738016Da LJIJJLI(C16DX c16dx, C16DS c16ds) {
        c16ds.LJFF("Upgrade", "websocket");
        c16ds.LJFF("Connection", c16dx.LJ("Connection"));
        String strLJ = c16dx.LJ("Sec-WebSocket-Key");
        if (strLJ != null && !"".equals(strLJ)) {
            c16ds.LJFF("Sec-WebSocket-Accept", LJIIZILJ(strLJ));
            this.LIZJ.LIZIZ();
            C16DN c16dn = this.LJI;
            if (c16dn != null && c16dn.LIZJ().length() != 0) {
                c16ds.LJFF("Sec-WebSocket-Protocol", this.LJI.LIZJ());
            }
            c16ds.LIZIZ = "Web Socket Protocol Handshake";
            c16ds.LJFF("Server", "TooTallNate Java-WebSocket");
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            c16ds.LJFF("Date", simpleDateFormat.format(calendar.getTime()));
            return c16ds;
        }
        throw new C16DJ("missing Sec-WebSocket-Key");
    }

    public final void LJJI(int i, int i2) throws C16DU {
        if (i >= i2) {
            return;
        }
        this.LIZIZ.trace("Incomplete frame: maxpacketsize < realpacketsize");
        throw new C16DU(i2);
    }

    public C16D6(List<C16DC> list, List<C16DN> list2, int i) {
        this.LIZIZ = C13AD.LIZIZ(C16D6.class);
        this.LIZJ = new C16D9();
        this.LIZLLL = new C16D9();
        this.LJIIJJI = new SecureRandom();
        if (list != null && list2 != null && i >= 1) {
            this.LJ = new ArrayList(list.size());
            this.LJII = new ArrayList(list2.size());
            this.LJIIIZ = new ArrayList();
            Iterator<C16DC> it2 = list.iterator();
            boolean z = false;
            while (it2.hasNext()) {
                if (it2.next().getClass().equals(C16D9.class)) {
                    z = true;
                }
            }
            ((ArrayList) this.LJ).addAll(list);
            if (!z) {
                ArrayList arrayList = (ArrayList) this.LJ;
                ListProtector.add(arrayList, arrayList.size(), this.LIZJ);
            }
            ((ArrayList) this.LJII).addAll(list2);
            this.LJIIL = i;
            this.LJFF = null;
            return;
        }
        throw new IllegalArgumentException();
    }
}
