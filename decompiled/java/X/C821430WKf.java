package X;

import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0WKf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C821430WKf {
    public static X509Certificate[][] LIZ(String str) {
        Pair pairLIZ;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            if (randomAccessFile.length() >= 22) {
                pairLIZ = C821450WKh.LIZ(randomAccessFile, 0);
                if (pairLIZ == null) {
                    pairLIZ = C821450WKh.LIZ(randomAccessFile, 65535);
                }
            } else {
                pairLIZ = null;
            }
            if (pairLIZ != null) {
                ByteBuffer byteBuffer = (ByteBuffer) pairLIZ.first;
                long jLongValue = ((Long) pairLIZ.second).longValue();
                long j = (-20) + jLongValue;
                if (j >= 0) {
                    randomAccessFile.seek(j);
                    if (randomAccessFile.readInt() == 1347094023) {
                        final String str2 = "ZIP64 APK not supported";
                        throw new Exception(str2) { // from class: X.0WKj
                        };
                    }
                }
                C821450WKh.LIZIZ(byteBuffer);
                long j2 = ((long) byteBuffer.getInt(byteBuffer.position() + 16)) & 4294967295L;
                if (j2 < jLongValue) {
                    C821450WKh.LIZIZ(byteBuffer);
                    if ((((long) byteBuffer.getInt(byteBuffer.position() + 12)) & 4294967295L) + j2 == jLongValue) {
                        if (j2 >= 32) {
                            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                            byteBufferAllocate.order(byteOrder);
                            randomAccessFile.seek(j2 - ((long) byteBufferAllocate.capacity()));
                            randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
                            if (byteBufferAllocate.getLong(8) == 2334950737559900225L && byteBufferAllocate.getLong(16) == 3617552046287187010L) {
                                long j3 = byteBufferAllocate.getLong(0);
                                if (j3 >= byteBufferAllocate.capacity() && j3 <= 2147483639) {
                                    int i = (int) (8 + j3);
                                    long j4 = j2 - ((long) i);
                                    if (j4 >= 0) {
                                        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i);
                                        byteBufferAllocate2.order(byteOrder);
                                        randomAccessFile.seek(j4);
                                        randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
                                        long j5 = byteBufferAllocate2.getLong(0);
                                        if (j5 == j3) {
                                            Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j4));
                                            ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
                                            long jLongValue2 = ((Long) pairCreate.second).longValue();
                                            if (byteBuffer2.order() == byteOrder) {
                                                int iCapacity = byteBuffer2.capacity() - 24;
                                                if (iCapacity >= 8) {
                                                    int iCapacity2 = byteBuffer2.capacity();
                                                    if (iCapacity <= byteBuffer2.capacity()) {
                                                        int iLimit = byteBuffer2.limit();
                                                        int iPosition = byteBuffer2.position();
                                                        try {
                                                            byteBuffer2.position(0);
                                                            byteBuffer2.limit(iCapacity);
                                                            byteBuffer2.position(8);
                                                            ByteBuffer byteBufferSlice = byteBuffer2.slice();
                                                            byteBufferSlice.order(byteBuffer2.order());
                                                            byteBuffer2.position(0);
                                                            byteBuffer2.limit(iLimit);
                                                            byteBuffer2.position(iPosition);
                                                            int i2 = 0;
                                                            while (byteBufferSlice.hasRemaining()) {
                                                                i2++;
                                                                if (byteBufferSlice.remaining() >= 8) {
                                                                    long j6 = byteBufferSlice.getLong();
                                                                    if (j6 >= 4 && j6 <= 2147483647L) {
                                                                        int i3 = (int) j6;
                                                                        int iPosition2 = byteBufferSlice.position() + i3;
                                                                        if (i3 <= byteBufferSlice.remaining()) {
                                                                            if (byteBufferSlice.getInt() == 1896449818) {
                                                                                X509Certificate[][] x509CertificateArrLJIIJ = LJIIJ(randomAccessFile.getChannel(), new C821460WKi(LJ(i3 - 4, byteBufferSlice), jLongValue2, j2, jLongValue, byteBuffer));
                                                                                randomAccessFile.close();
                                                                                try {
                                                                                    randomAccessFile.close();
                                                                                    return x509CertificateArrLJIIJ;
                                                                                } catch (IOException e) {
                                                                                    TryCatchGuardChecker.doCheck(e);
                                                                                    return x509CertificateArrLJIIJ;
                                                                                }
                                                                            }
                                                                            byteBufferSlice.position(iPosition2);
                                                                        } else {
                                                                            final String str3 = "APK Signing Block entry #" + i2 + " size out of range: " + i3 + ", available: " + byteBufferSlice.remaining();
                                                                            throw new Exception(str3) { // from class: X.0WKj
                                                                            };
                                                                        }
                                                                    } else {
                                                                        final String str4 = "APK Signing Block entry #" + i2 + " size out of range: " + j6;
                                                                        throw new Exception(str4) { // from class: X.0WKj
                                                                        };
                                                                    }
                                                                } else {
                                                                    final String str5 = "Insufficient data to read size of APK Signing Block entry #" + i2;
                                                                    throw new Exception(str5) { // from class: X.0WKj
                                                                    };
                                                                }
                                                            }
                                                            final String str6 = "No APK Signature Scheme v2 block in APK Signing Block";
                                                            throw new Exception(str6) { // from class: X.0WKj
                                                            };
                                                        } catch (Throwable th) {
                                                            TryCatchGuardChecker.doCheck(th);
                                                            byteBuffer2.position(0);
                                                            byteBuffer2.limit(iLimit);
                                                            byteBuffer2.position(iPosition);
                                                            throw th;
                                                        }
                                                    }
                                                    throw new IllegalArgumentException("end > capacity: " + iCapacity + " > " + iCapacity2);
                                                }
                                                throw new IllegalArgumentException("end < start: " + iCapacity + " < 8");
                                            }
                                            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                                        }
                                        final String str7 = "APK Signing Block sizes in header and footer do not match: " + j5 + " vs " + j3;
                                        throw new Exception(str7) { // from class: X.0WKj
                                        };
                                    }
                                    final String str8 = "APK Signing Block offset out of range: " + j4;
                                    throw new Exception(str8) { // from class: X.0WKj
                                    };
                                }
                                final String str9 = "APK Signing Block size out of range: " + j3;
                                throw new Exception(str9) { // from class: X.0WKj
                                };
                            }
                            final String str10 = "No APK Signing Block before ZIP Central Directory";
                            throw new Exception(str10) { // from class: X.0WKj
                            };
                        }
                        final String str11 = "APK too small for APK Signing Block. ZIP Central Directory offset: " + j2;
                        throw new Exception(str11) { // from class: X.0WKj
                        };
                    }
                    final String str12 = "ZIP Central Directory is not immediately followed by End of Central Directory";
                    throw new Exception(str12) { // from class: X.0WKj
                    };
                }
                final String str13 = "ZIP Central Directory offset out of range: " + j2 + ". ZIP End of Central Directory offset: " + jLongValue;
                throw new Exception(str13) { // from class: X.0WKj
                };
            }
            final String str14 = "Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes";
            throw new Exception(str14) { // from class: X.0WKj
            };
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            try {
                randomAccessFile.close();
                throw th2;
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw th2;
            }
        }
    }

    public static int LIZIZ(int i) {
        if (i != 1) {
            if (i == 2) {
                return 64;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unknown content digest algorthm: ");
            sbLIZ.append(i);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return 32;
    }

    public static int LIZJ(int i) {
        if (i != 513) {
            if (i != 514) {
                if (i != 769) {
                    switch (i) {
                        case 257:
                        case 259:
                            return 1;
                        case 258:
                        case 260:
                            return 2;
                        default:
                            throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                    }
                }
                return 1;
            }
            return 2;
        }
        return 1;
    }

    public static String LIZLLL(int i) {
        if (i != 1) {
            if (i == 2) {
                return "SHA-512";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unknown content digest algorthm: ");
            sbLIZ.append(i);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return "SHA-256";
    }

    public static ByteBuffer LJFF(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() >= 4) {
            int i = byteBuffer.getInt();
            if (i >= 0) {
                if (i <= byteBuffer.remaining()) {
                    return LJ(i, byteBuffer);
                }
                int iRemaining = byteBuffer.remaining();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Length-prefixed field longer than remaining buffer. Field length: ");
                sbLIZ.append(i);
                sbLIZ.append(", remaining: ");
                sbLIZ.append(iRemaining);
                throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
            }
            throw new IllegalArgumentException("Negative length");
        }
        int iRemaining2 = byteBuffer.remaining();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
        sbLIZ2.append(iRemaining2);
        throw new IOException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static byte[] LJII(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i >= 0) {
            if (i <= byteBuffer.remaining()) {
                byte[] bArr = new byte[i];
                byteBuffer.get(bArr);
                return bArr;
            }
            int iRemaining = byteBuffer.remaining();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Underflow while reading length-prefixed value. Length: ");
            sbLIZ.append(i);
            sbLIZ.append(", available: ");
            sbLIZ.append(iRemaining);
            throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
        }
        throw new IOException("Negative length");
    }

    public static ByteBuffer LJ(int i, ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (i2 >= iPosition && i2 <= iLimit) {
            byteBuffer.limit(i2);
            try {
                ByteBuffer byteBufferSlice = byteBuffer.slice();
                byteBufferSlice.order(byteBuffer.order());
                byteBuffer.position(i2);
                byteBuffer.limit(iLimit);
                return byteBufferSlice;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                byteBuffer.limit(iLimit);
                throw th;
            }
        }
        throw new BufferUnderflowException();
    }

    public static void LJI(int i, byte[] bArr) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    public static byte[][] LJIIIZ(int[] iArr, C0W4Q[] c0w4qArr) throws DigestException {
        int i;
        long j;
        int length;
        long j2 = 0;
        int i2 = 0;
        long jZza = 0;
        while (true) {
            j = 1048576;
            if (i2 >= 3) {
                break;
            }
            jZza += (c0w4qArr[i2].zza() + 1048575) / 1048576;
            i2++;
        }
        if (jZza < 2097151) {
            byte[][] bArr = new byte[iArr.length][];
            int i3 = 0;
            while (true) {
                length = iArr.length;
                if (i3 >= length) {
                    break;
                }
                int i4 = (int) jZza;
                byte[] bArr2 = new byte[(LIZIZ(iArr[i3]) * i4) + 5];
                bArr2[0] = 90;
                LJI(i4, bArr2);
                bArr[i3] = bArr2;
                i3++;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            MessageDigest[] messageDigestArr = new MessageDigest[length];
            for (int i5 = 0; i5 < iArr.length; i5++) {
                String strLIZLLL = LIZLLL(iArr[i5]);
                try {
                    messageDigestArr[i5] = MessageDigest.getInstance(strLIZLLL);
                } catch (NoSuchAlgorithmException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new RuntimeException(strLIZLLL.concat(" digest not supported"), e);
                }
            }
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            for (i = 3; i6 < i; i = 3) {
                C0W4Q c0w4q = c0w4qArr[i6];
                long jZza2 = c0w4q.zza();
                long j3 = 0;
                while (jZza2 > j2) {
                    int iMin = (int) Math.min(jZza2, j);
                    LJI(iMin, bArr3);
                    for (int i9 = 0; i9 < length; i9++) {
                        messageDigestArr[i9].update(bArr3);
                    }
                    try {
                        c0w4q.LIZ(messageDigestArr, j3, iMin);
                        for (int i10 = 0; i10 < iArr.length; i10++) {
                            int i11 = iArr[i10];
                            byte[] bArr4 = bArr[i10];
                            int iLIZIZ = LIZIZ(i11);
                            MessageDigest messageDigest = messageDigestArr[i10];
                            int iDigest = messageDigest.digest(bArr4, (i8 * iLIZIZ) + 5, iLIZIZ);
                            if (iDigest != iLIZIZ) {
                                throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + iDigest);
                            }
                        }
                        long j4 = iMin;
                        j3 += j4;
                        jZza2 -= j4;
                        i8++;
                        j2 = 0;
                        j = 1048576;
                    } catch (IOException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        throw new DigestException("Failed to digest chunk #" + i8 + " of section #" + i7, e2);
                    }
                }
                i7++;
                i6++;
                j2 = 0;
            }
            byte[][] bArr5 = new byte[iArr.length][];
            for (int i12 = 0; i12 < iArr.length; i12++) {
                int i13 = iArr[i12];
                byte[] bArr6 = bArr[i12];
                String strLIZLLL2 = LIZLLL(i13);
                try {
                    bArr5[i12] = MessageDigest.getInstance(strLIZLLL2).digest(bArr6);
                } catch (NoSuchAlgorithmException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    throw new RuntimeException(strLIZLLL2.concat(" digest not supported"), e3);
                }
            }
            return bArr5;
        }
        throw new DigestException("Too many chunks: " + jZza);
    }

    public static X509Certificate[][] LJIIJ(final FileChannel fileChannel, C821460WKi c821460WKi) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferLJFF = LJFF(c821460WKi.LIZ);
                int i = 0;
                while (byteBufferLJFF.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(LJIIIIZZ(LJFF(byteBufferLJFF), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw new SecurityException("Failed to parse/verify signer #" + i + " block", e);
                    }
                }
                if (i > 0) {
                    if (!map.isEmpty()) {
                        final long j = c821460WKi.LIZIZ;
                        final long j2 = c821460WKi.LIZJ;
                        long j3 = c821460WKi.LIZLLL;
                        ByteBuffer byteBuffer = c821460WKi.LJ;
                        if (!map.isEmpty()) {
                            final long j4 = 0;
                            C0W4Q c0w4q = new C0W4Q(fileChannel, j4, j) { // from class: X.0W4O
                                public final FileChannel LIZ;
                                public final long LIZIZ;
                                public final long LIZJ;

                                {
                                    this.LIZ = fileChannel;
                                    this.LIZIZ = j4;
                                    this.LIZJ = j;
                                }

                                @Override // X.C0W4Q
                                public final long zza() {
                                    return this.LIZJ;
                                }

                                @Override // X.C0W4Q
                                public final void LIZ(MessageDigest[] messageDigestArr, long j5, int i2) throws IOException {
                                    MappedByteBuffer map2 = this.LIZ.map(FileChannel.MapMode.READ_ONLY, this.LIZIZ + j5, i2);
                                    map2.load();
                                    for (MessageDigest messageDigest : messageDigestArr) {
                                        map2.position(0);
                                        messageDigest.update(map2);
                                    }
                                }
                            };
                            final long j5 = j3 - j2;
                            C0W4Q c0w4q2 = new C0W4Q(fileChannel, j2, j5) { // from class: X.0W4O
                                public final FileChannel LIZ;
                                public final long LIZIZ;
                                public final long LIZJ;

                                {
                                    this.LIZ = fileChannel;
                                    this.LIZIZ = j2;
                                    this.LIZJ = j5;
                                }

                                @Override // X.C0W4Q
                                public final long zza() {
                                    return this.LIZJ;
                                }

                                @Override // X.C0W4Q
                                public final void LIZ(MessageDigest[] messageDigestArr, long j52, int i2) throws IOException {
                                    MappedByteBuffer map2 = this.LIZ.map(FileChannel.MapMode.READ_ONLY, this.LIZIZ + j52, i2);
                                    map2.load();
                                    for (MessageDigest messageDigest : messageDigestArr) {
                                        map2.position(0);
                                        messageDigest.update(map2);
                                    }
                                }
                            };
                            final ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                            byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                            C821450WKh.LIZIZ(byteBufferDuplicate);
                            int iPosition = byteBufferDuplicate.position() + 16;
                            if (j >= 0 && j <= 4294967295L) {
                                byteBufferDuplicate.putInt(byteBufferDuplicate.position() + iPosition, (int) j);
                                C0W4Q c0w4q3 = new C0W4Q(byteBufferDuplicate) { // from class: X.0W4P
                                    public final ByteBuffer LIZ;

                                    @Override // X.C0W4Q
                                    public final long zza() {
                                        return this.LIZ.capacity();
                                    }

                                    {
                                        this.LIZ = byteBufferDuplicate.slice();
                                    }

                                    @Override // X.C0W4Q
                                    public final void LIZ(MessageDigest[] messageDigestArr, long j6, int i2) {
                                        ByteBuffer byteBufferSlice;
                                        synchronized (this.LIZ) {
                                            try {
                                                int i3 = (int) j6;
                                                this.LIZ.position(i3);
                                                this.LIZ.limit(i3 + i2);
                                                byteBufferSlice = this.LIZ.slice();
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                throw th;
                                            }
                                        }
                                        for (MessageDigest messageDigest : messageDigestArr) {
                                            byteBufferSlice.position(0);
                                            messageDigest.update(byteBufferSlice);
                                        }
                                    }
                                };
                                int size = map.size();
                                int[] iArr = new int[size];
                                Iterator it2 = map.keySet().iterator();
                                int i2 = 0;
                                while (it2.hasNext()) {
                                    iArr[i2] = ((Integer) it2.next()).intValue();
                                    i2++;
                                }
                                try {
                                    byte[][] bArrLJIIIZ = LJIIIZ(iArr, new C0W4Q[]{c0w4q, c0w4q2, c0w4q3});
                                    for (int i3 = 0; i3 < size; i3++) {
                                        int i4 = iArr[i3];
                                        if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i4)), bArrLJIIIZ[i3])) {
                                            throw new SecurityException(LIZLLL(i4).concat(" digest of contents did not verify"));
                                        }
                                    }
                                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                                } catch (DigestException e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                    throw new SecurityException("Failed to compute digest(s) of contents", e2);
                                }
                            }
                            throw new IllegalArgumentException("uint32 value of out range: " + j);
                        }
                        throw new SecurityException("No digests provided");
                    }
                    throw new SecurityException("No content digests found");
                }
                throw new SecurityException("No signers found");
            } catch (IOException e3) {
                TryCatchGuardChecker.doCheck(e3);
                throw new SecurityException("Failed to read list of signers", e3);
            }
        } catch (CertificateException e4) {
            TryCatchGuardChecker.doCheck(e4);
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e4);
        }
    }

    public static X509Certificate[] LJIIIIZZ(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) throws IOException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferLJFF = LJFF(byteBuffer);
        ByteBuffer byteBufferLJFF2 = LJFF(byteBuffer);
        byte[] bArrLJII = LJII(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrLJII2 = null;
        byte[] bArrLJII3 = null;
        int i = -1;
        int i2 = 0;
        while (byteBufferLJFF2.hasRemaining()) {
            i2++;
            try {
                ByteBuffer byteBufferLJFF3 = LJFF(byteBufferLJFF2);
                if (byteBufferLJFF3.remaining() >= 8) {
                    int i3 = byteBufferLJFF3.getInt();
                    arrayList.add(Integer.valueOf(i3));
                    if (i3 != 513 && i3 != 514 && i3 != 769) {
                        switch (i3) {
                            case 257:
                            case 258:
                            case 259:
                            case 260:
                                break;
                            default:
                                continue;
                        }
                    }
                    if (i != -1) {
                        int iLIZJ = LIZJ(i3);
                        int iLIZJ2 = LIZJ(i);
                        if (iLIZJ != 1 && iLIZJ2 == 1) {
                        }
                    }
                    bArrLJII3 = LJII(byteBufferLJFF3);
                    i = i3;
                } else {
                    throw new SecurityException("Signature record too short");
                }
            } catch (IOException | BufferUnderflowException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new SecurityException("Failed to parse signature record #" + i2, e);
            }
        }
        if (i == -1) {
            if (i2 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i != 513 && i != 514) {
            if (i == 769) {
                str = "DSA";
            } else {
                switch (i) {
                    case 257:
                    case 258:
                    case 259:
                    case 260:
                        str = "RSA";
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                }
            }
        } else {
            str = "EC";
        }
        if (i != 513) {
            if (i != 514) {
                if (i != 769) {
                    switch (i) {
                        case 257:
                            pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                            break;
                        case 258:
                            pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                            break;
                        case 259:
                            pairCreate = Pair.create("SHA256withRSA", null);
                            break;
                        case 260:
                            pairCreate = Pair.create("SHA512withRSA", null);
                            break;
                        default:
                            throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                    }
                } else {
                    pairCreate = Pair.create("SHA256withDSA", null);
                }
            } else {
                pairCreate = Pair.create("SHA512withECDSA", null);
            }
        } else {
            pairCreate = Pair.create("SHA256withECDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrLJII));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferLJFF);
            if (signature.verify(bArrLJII3)) {
                byteBufferLJFF.clear();
                ByteBuffer byteBufferLJFF4 = LJFF(byteBufferLJFF);
                ArrayList arrayList2 = new ArrayList();
                int i4 = 0;
                while (byteBufferLJFF4.hasRemaining()) {
                    i4++;
                    try {
                        ByteBuffer byteBufferLJFF5 = LJFF(byteBufferLJFF4);
                        if (byteBufferLJFF5.remaining() >= 8) {
                            int i5 = byteBufferLJFF5.getInt();
                            arrayList2.add(Integer.valueOf(i5));
                            if (i5 == i) {
                                bArrLJII2 = LJII(byteBufferLJFF5);
                            }
                        } else {
                            throw new IOException("Record too short");
                        }
                    } catch (IOException | BufferUnderflowException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        throw new IOException("Failed to parse digest record #" + i4, e2);
                    }
                }
                if (arrayList.equals(arrayList2)) {
                    int iLIZJ3 = LIZJ(i);
                    byte[] bArr = (byte[]) ((HashMap) map).put(Integer.valueOf(iLIZJ3), bArrLJII2);
                    if (bArr != null && !MessageDigest.isEqual(bArr, bArrLJII2)) {
                        throw new SecurityException(LIZLLL(iLIZJ3).concat(" contents digest does not match the digest specified by a preceding signer"));
                    }
                    ByteBuffer byteBufferLJFF6 = LJFF(byteBufferLJFF);
                    ArrayList arrayList3 = new ArrayList();
                    int i6 = 0;
                    while (byteBufferLJFF6.hasRemaining()) {
                        i6++;
                        final byte[] bArrLJII4 = LJII(byteBufferLJFF6);
                        try {
                            final X509Certificate x509Certificate = (X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrLJII4));
                            arrayList3.add(new C0X25(x509Certificate, bArrLJII4) { // from class: X.0WKk
                                public final byte[] LLILLJJLI;

                                @Override // java.security.cert.Certificate
                                public final byte[] getEncoded() {
                                    return this.LLILLJJLI;
                                }

                                {
                                    this.LLILLJJLI = bArrLJII4;
                                }
                            });
                        } catch (CertificateException e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            throw new SecurityException("Failed to decode certificate #" + i6, e3);
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        if (Arrays.equals(bArrLJII, ((Certificate) ListProtector.get(arrayList3, 0)).getPublicKey().getEncoded())) {
                            return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
                        }
                        throw new SecurityException("Public key mismatch between certificate and signature record");
                    }
                    throw new SecurityException("No certificates listed");
                }
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e4) {
            TryCatchGuardChecker.doCheck(e4);
            throw new SecurityException("Failed to verify " + str2 + " signature", e4);
        }
    }
}
