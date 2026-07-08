package X;

import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.1Dbm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2259241Dbm {
    public final int LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final byte[] LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(e3.h);
        sbLIZ.append(C2259261Dbo.LJJJI[this.LIZ]);
        sbLIZ.append(", data length:");
        sbLIZ.append(this.LIZLLL.length);
        sbLIZ.append(")");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C2259241Dbm LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append((char) 0);
        byte[] bytes = C2188811AlT.LIZIZ(sbLIZ).getBytes(C2259261Dbo.LJJJLIIL);
        return new C2259241Dbm(2, bytes, bytes.length);
    }

    public final double LJI(ByteOrder byteOrder) throws Throwable {
        Object objLJIIIZ = LJIIIZ(byteOrder);
        if (objLJIIIZ != null) {
            if (objLJIIIZ instanceof String) {
                return CastDoubleProtector.parseDouble((String) objLJIIIZ);
            }
            if (objLJIIIZ instanceof long[]) {
                if (((long[]) objLJIIIZ).length == 1) {
                    return r4[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objLJIIIZ instanceof int[]) {
                if (((int[]) objLJIIIZ).length == 1) {
                    return r4[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objLJIIIZ instanceof double[]) {
                double[] dArr = (double[]) objLJIIIZ;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objLJIIIZ instanceof C2259251Dbn[]) {
                C2259251Dbn[] c2259251DbnArr = (C2259251Dbn[]) objLJIIIZ;
                if (c2259251DbnArr.length == 1) {
                    C2259251Dbn c2259251Dbn = c2259251DbnArr[0];
                    return c2259251Dbn.LIZ / c2259251Dbn.LIZIZ;
                }
                throw new NumberFormatException("There are more than one component");
            }
            throw new NumberFormatException("Couldn't find a double value");
        }
        throw new NumberFormatException("NULL can't be converted to a double value");
    }

    public final int LJII(ByteOrder byteOrder) throws Throwable {
        Object objLJIIIZ = LJIIIZ(byteOrder);
        if (objLJIIIZ != null) {
            if (objLJIIIZ instanceof String) {
                return CastIntegerProtector.parseInt((String) objLJIIIZ);
            }
            if (objLJIIIZ instanceof long[]) {
                long[] jArr = (long[]) objLJIIIZ;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objLJIIIZ instanceof int[]) {
                int[] iArr = (int[]) objLJIIIZ;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            throw new NumberFormatException("Couldn't find a integer value");
        }
        throw new NumberFormatException("NULL can't be converted to a integer value");
    }

    public final String LJIIIIZZ(ByteOrder byteOrder) throws Throwable {
        Object objLJIIIZ = LJIIIZ(byteOrder);
        if (objLJIIIZ == null) {
            return null;
        }
        if (objLJIIIZ instanceof String) {
            return (String) objLJIIIZ;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objLJIIIZ instanceof long[]) {
            long[] jArr = (long[]) objLJIIIZ;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objLJIIIZ instanceof int[]) {
            int[] iArr = (int[]) objLJIIIZ;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objLJIIIZ instanceof double[]) {
            double[] dArr = (double[]) objLJIIIZ;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objLJIIIZ instanceof C2259251Dbn[])) {
            return null;
        }
        C2259251Dbn[] c2259251DbnArr = (C2259251Dbn[]) objLJIIIZ;
        while (i < c2259251DbnArr.length) {
            sb.append(c2259251DbnArr[i].LIZ);
            sb.append('/');
            sb.append(c2259251DbnArr[i].LIZIZ);
            i++;
            if (i != c2259251DbnArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x01a3: MOVE (r10 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:16777635), block:B:140:0x01a3 */
    public final Object LJIIIZ(ByteOrder byteOrder) throws Throwable {
        C2259281Dbq c2259281Dbq;
        InputStream inputStream;
        byte b;
        byte[] bArr;
        byte b2;
        InputStream inputStream2 = null;
        try {
            try {
                try {
                    c2259281Dbq = new C2259281Dbq(this.LIZLLL);
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    TryCatchGuardChecker.doCheck(th);
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                            throw th;
                        } catch (IOException e) {
                            TryCatchGuardChecker.doCheck(e);
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                c2259281Dbq = null;
            }
            try {
                c2259281Dbq.LLILLJJLI = byteOrder;
                boolean z = true;
                int length = 0;
                switch (this.LIZ) {
                    case 1:
                    case 6:
                        byte[] bArr2 = this.LIZLLL;
                        if (bArr2.length == 1 && (b2 = bArr2[0]) >= 0 && b2 <= 1) {
                            String str = new String(new char[]{(char) (b2 + 48)});
                            try {
                                c2259281Dbq.close();
                                return str;
                            } catch (IOException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                return str;
                            }
                        }
                        String str2 = new String(bArr2, C2259261Dbo.LJJJLIIL);
                        try {
                            c2259281Dbq.close();
                            return str2;
                        } catch (IOException e4) {
                            TryCatchGuardChecker.doCheck(e4);
                            return str2;
                        }
                    case 2:
                    case 7:
                        if (this.LIZIZ >= C2259261Dbo.LJJJJ.length) {
                            int i = 0;
                            while (true) {
                                bArr = C2259261Dbo.LJJJJ;
                                if (i < bArr.length) {
                                    if (this.LIZLLL[i] == bArr[i]) {
                                        i++;
                                    } else {
                                        z = false;
                                    }
                                }
                            }
                            if (z) {
                                length = bArr.length;
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        while (length < this.LIZIZ && (b = this.LIZLLL[length]) != 0) {
                            if (b >= 32) {
                                sb.append((char) b);
                            } else {
                                sb.append('?');
                            }
                            length++;
                        }
                        String string = sb.toString();
                        try {
                            c2259281Dbq.close();
                            return string;
                        } catch (IOException e5) {
                            TryCatchGuardChecker.doCheck(e5);
                            return string;
                        }
                    case 3:
                        int[] iArr = new int[this.LIZIZ];
                        while (length < this.LIZIZ) {
                            iArr[length] = c2259281Dbq.readUnsignedShort();
                            length++;
                        }
                        try {
                            c2259281Dbq.close();
                            return iArr;
                        } catch (IOException e6) {
                            TryCatchGuardChecker.doCheck(e6);
                            return iArr;
                        }
                    case 4:
                        long[] jArr = new long[this.LIZIZ];
                        while (length < this.LIZIZ) {
                            jArr[length] = ((long) c2259281Dbq.readInt()) & 4294967295L;
                            length++;
                        }
                        try {
                            c2259281Dbq.close();
                            return jArr;
                        } catch (IOException e7) {
                            TryCatchGuardChecker.doCheck(e7);
                            return jArr;
                        }
                    case 5:
                        C2259251Dbn[] c2259251DbnArr = new C2259251Dbn[this.LIZIZ];
                        while (length < this.LIZIZ) {
                            c2259251DbnArr[length] = new C2259251Dbn(((long) c2259281Dbq.readInt()) & 4294967295L, ((long) c2259281Dbq.readInt()) & 4294967295L);
                            length++;
                        }
                        try {
                            c2259281Dbq.close();
                            return c2259251DbnArr;
                        } catch (IOException e8) {
                            TryCatchGuardChecker.doCheck(e8);
                            return c2259251DbnArr;
                        }
                    case 8:
                        int[] iArr2 = new int[this.LIZIZ];
                        while (length < this.LIZIZ) {
                            iArr2[length] = c2259281Dbq.readShort();
                            length++;
                        }
                        try {
                            c2259281Dbq.close();
                            return iArr2;
                        } catch (IOException e9) {
                            TryCatchGuardChecker.doCheck(e9);
                            return iArr2;
                        }
                    case BdTuring.TYPE_ECAF /* 9 */:
                        int[] iArr3 = new int[this.LIZIZ];
                        while (length < this.LIZIZ) {
                            iArr3[length] = c2259281Dbq.readInt();
                            length++;
                        }
                        try {
                            c2259281Dbq.close();
                            return iArr3;
                        } catch (IOException e10) {
                            TryCatchGuardChecker.doCheck(e10);
                            return iArr3;
                        }
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        C2259251Dbn[] c2259251DbnArr2 = new C2259251Dbn[this.LIZIZ];
                        while (length < this.LIZIZ) {
                            c2259251DbnArr2[length] = new C2259251Dbn(c2259281Dbq.readInt(), c2259281Dbq.readInt());
                            length++;
                        }
                        try {
                            c2259281Dbq.close();
                            return c2259251DbnArr2;
                        } catch (IOException e11) {
                            TryCatchGuardChecker.doCheck(e11);
                            return c2259251DbnArr2;
                        }
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        double[] dArr = new double[this.LIZIZ];
                        while (length < this.LIZIZ) {
                            dArr[length] = c2259281Dbq.readFloat();
                            length++;
                        }
                        try {
                            c2259281Dbq.close();
                            return dArr;
                        } catch (IOException e12) {
                            TryCatchGuardChecker.doCheck(e12);
                            return dArr;
                        }
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        double[] dArr2 = new double[this.LIZIZ];
                        while (length < this.LIZIZ) {
                            dArr2[length] = c2259281Dbq.readDouble();
                            length++;
                        }
                        try {
                            c2259281Dbq.close();
                            return dArr2;
                        } catch (IOException e13) {
                            TryCatchGuardChecker.doCheck(e13);
                            return dArr2;
                        }
                    default:
                        try {
                            c2259281Dbq.close();
                            return null;
                        } catch (IOException e14) {
                            TryCatchGuardChecker.doCheck(e14);
                            return null;
                        }
                }
            } catch (IOException e15) {
                e = e15;
                TryCatchGuardChecker.doCheck(e);
                if (c2259281Dbq != null) {
                    try {
                        c2259281Dbq.close();
                        return null;
                    } catch (IOException e16) {
                        TryCatchGuardChecker.doCheck(e16);
                        return null;
                    }
                }
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static C2259241Dbm LIZIZ(long j, ByteOrder byteOrder) {
        return LIZJ(new long[]{j}, byteOrder);
    }

    public static C2259241Dbm LIZJ(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C2259261Dbo.LJJJIL[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j : jArr) {
            byteBufferWrap.putInt((int) j);
        }
        return new C2259241Dbm(4, byteBufferWrap.array(), jArr.length);
    }

    public static C2259241Dbm LIZLLL(C2259251Dbn[] c2259251DbnArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C2259261Dbo.LJJJIL[5] * c2259251DbnArr.length]);
        byteBufferWrap.order(byteOrder);
        for (C2259251Dbn c2259251Dbn : c2259251DbnArr) {
            byteBufferWrap.putInt((int) c2259251Dbn.LIZ);
            byteBufferWrap.putInt((int) c2259251Dbn.LIZIZ);
        }
        return new C2259241Dbm(5, byteBufferWrap.array(), c2259251DbnArr.length);
    }

    public static C2259241Dbm LJ(int i, ByteOrder byteOrder) {
        return LJFF(new int[]{i}, byteOrder);
    }

    public static C2259241Dbm LJFF(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C2259261Dbo.LJJJIL[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i : iArr) {
            byteBufferWrap.putShort((short) i);
        }
        return new C2259241Dbm(3, byteBufferWrap.array(), iArr.length);
    }

    public C2259241Dbm(int i, byte[] bArr, int i2) {
        this(i, -1L, bArr, i2);
    }

    public C2259241Dbm(int i, long j, byte[] bArr, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = j;
        this.LIZLLL = bArr;
    }
}
