package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0W9C, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W9C {
    public static C0W9D LIZ(FileChannel fileChannel) throws C0W9E, IOException {
        long size = fileChannel.size();
        if (size >= 22) {
            long j = size - ((long) 22);
            long jMin = Math.min(j, 65535L);
            if (0 <= jMin) {
                long j2 = 0;
                while (true) {
                    long j3 = j - j2;
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                    fileChannel.position(j3);
                    fileChannel.read(byteBufferAllocate);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    byteBufferAllocate.order(byteOrder);
                    if (byteBufferAllocate.getInt(0) == 101010256) {
                        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(2);
                        fileChannel.position(j3 + ((long) 20));
                        fileChannel.read(byteBufferAllocate2);
                        byteBufferAllocate2.order(byteOrder);
                        long j4 = byteBufferAllocate2.getShort(0);
                        if (j4 == j2) {
                            ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(4);
                            byteBufferAllocate3.order(byteOrder);
                            fileChannel.position((fileChannel.size() - j4) - ((long) 6));
                            fileChannel.read(byteBufferAllocate3);
                            long j5 = byteBufferAllocate3.getInt(0);
                            if (j5 >= 32) {
                                fileChannel.position(j5 - ((long) 24));
                                ByteBuffer byteBufferAllocate4 = ByteBuffer.allocate(24);
                                fileChannel.read(byteBufferAllocate4);
                                byteBufferAllocate4.order(byteOrder);
                                if (byteBufferAllocate4.getLong(8) == 2334950737559900225L && byteBufferAllocate4.getLong(16) == 3617552046287187010L) {
                                    long j6 = byteBufferAllocate4.getLong(0);
                                    if (j6 >= byteBufferAllocate4.capacity() && j6 <= 2147483639) {
                                        int i = (int) (((long) 8) + j6);
                                        long j7 = j5 - ((long) i);
                                        if (j7 >= 0) {
                                            fileChannel.position(j7);
                                            ByteBuffer byteBufferAllocate5 = ByteBuffer.allocate(i);
                                            fileChannel.read(byteBufferAllocate5);
                                            byteBufferAllocate5.order(byteOrder);
                                            long j8 = byteBufferAllocate5.getLong(0);
                                            if (j8 == j6) {
                                                return new C0W9D(byteBufferAllocate5, Long.valueOf(j7));
                                            }
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("APK Signing Block sizes in header and footer do not match: ");
                                            sbLIZ.append(j8);
                                            sbLIZ.append(" vs ");
                                            sbLIZ.append(j6);
                                            throw new C0W9E(C2188811AlT.LIZIZ(sbLIZ));
                                        }
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("APK Signing Block offset out of range: ");
                                        sbLIZ2.append(j7);
                                        throw new C0W9E(C2188811AlT.LIZIZ(sbLIZ2));
                                    }
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("APK Signing Block size out of range: ");
                                    sbLIZ3.append(j6);
                                    throw new C0W9E(C2188811AlT.LIZIZ(sbLIZ3));
                                }
                                throw new C0W9E("No APK Signing Block before ZIP Central Directory");
                            }
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                            sbLIZ4.append(j5);
                            throw new C0W9E(C2188811AlT.LIZIZ(sbLIZ4));
                        }
                    }
                    if (j2 == jMin) {
                        break;
                    }
                    j2++;
                }
            }
            throw new IOException("ZIP End of Central Directory (EOCD) record not found");
        }
        throw new IOException("APK too small for ZIP End of Central Directory (EOCD) record");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String LIZIZ(String str) {
        RandomAccessFile randomAccessFile;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            randomAccessFile = new RandomAccessFile(str, "r");
        } catch (Throwable th) {
            th = th;
            randomAccessFile = null;
        }
        try {
            Map mapLIZJ = LIZJ((ByteBuffer) LIZ(randomAccessFile.getChannel()).LIZ);
            if (mapLIZJ.containsKey(1903654775)) {
                ByteBuffer byteBuffer = (ByteBuffer) ((LinkedHashMap) mapLIZJ).get(1903654775);
                byte[] bArrArray = byteBuffer.array();
                int iArrayOffset = byteBuffer.arrayOffset();
                String str2 = new String(Arrays.copyOfRange(bArrArray, byteBuffer.position() + iArrayOffset, iArrayOffset + byteBuffer.limit()), Charsets.UTF_8);
                try {
                    randomAccessFile.close();
                    return str2;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    return str2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                TryCatchGuardChecker.doCheck(th);
                if (randomAccessFile != null) {
                }
                return null;
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                        throw th4;
                    } catch (Throwable th5) {
                        TryCatchGuardChecker.doCheck(th5);
                        throw th4;
                    }
                }
                throw th4;
            }
        }
        try {
            randomAccessFile.close();
            return null;
        } catch (Throwable th6) {
            TryCatchGuardChecker.doCheck(th6);
            return null;
        }
    }

    public static Map LIZJ(ByteBuffer byteBuffer) throws C0W9E {
        boolean z;
        boolean z2;
        boolean z3;
        if (Intrinsics.LJFF(byteBuffer.order(), ByteOrder.LITTLE_ENDIAN)) {
            int iCapacity = byteBuffer.capacity() - 24;
            if (iCapacity >= 8) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int iCapacity2 = byteBuffer.capacity();
                if (iCapacity <= byteBuffer.capacity()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    int iLimit = byteBuffer.limit();
                    int iPosition = byteBuffer.position();
                    try {
                        byteBuffer.position(0);
                        byteBuffer.limit(iCapacity);
                        byteBuffer.position(8);
                        ByteBuffer byteBufferSlice = byteBuffer.slice();
                        byteBufferSlice.order(byteBuffer.order());
                        byteBuffer.position(0);
                        byteBuffer.limit(iLimit);
                        byteBuffer.position(iPosition);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int i = 0;
                        while (byteBufferSlice.hasRemaining()) {
                            i++;
                            if (byteBufferSlice.remaining() >= 8) {
                                long j = byteBufferSlice.getLong();
                                if (j >= 4 && j <= 2147483647L) {
                                    int i2 = (int) j;
                                    int iPosition2 = byteBufferSlice.position() + i2;
                                    if (i2 <= byteBufferSlice.remaining()) {
                                        Integer numValueOf = Integer.valueOf(byteBufferSlice.getInt());
                                        int i3 = i2 - 4;
                                        if (i3 >= 0) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (z3) {
                                            int iLimit2 = byteBufferSlice.limit();
                                            int iPosition3 = byteBufferSlice.position();
                                            int i4 = i3 + iPosition3;
                                            if (i4 >= iPosition3 && i4 <= iLimit2) {
                                                byteBufferSlice.limit(i4);
                                                try {
                                                    ByteBuffer byteBufferSlice2 = byteBufferSlice.slice();
                                                    byteBufferSlice2.order(byteBufferSlice.order());
                                                    byteBufferSlice.position(i4);
                                                    byteBufferSlice.limit(iLimit2);
                                                    linkedHashMap.put(numValueOf, byteBufferSlice2);
                                                    byteBufferSlice.position(iPosition2);
                                                } catch (Throwable th) {
                                                    TryCatchGuardChecker.doCheck(th);
                                                    byteBufferSlice.limit(iLimit2);
                                                    throw th;
                                                }
                                            } else {
                                                throw new BufferUnderflowException();
                                            }
                                        } else {
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("size: ");
                                            sbLIZ.append(i3);
                                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                            strLIZIZ.toString();
                                            throw new IllegalArgumentException(strLIZIZ);
                                        }
                                    } else {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("APK Signing Block entry #");
                                        sbLIZ2.append(i);
                                        sbLIZ2.append(" size out of range: ");
                                        sbLIZ2.append(i2);
                                        sbLIZ2.append(", available: ");
                                        sbLIZ2.append(byteBufferSlice.remaining());
                                        throw new C0W9E(C2188811AlT.LIZIZ(sbLIZ2));
                                    }
                                } else {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("APK Signing Block entry #");
                                    sbLIZ3.append(i);
                                    sbLIZ3.append(" size out of range: ");
                                    sbLIZ3.append(j);
                                    throw new C0W9E(C2188811AlT.LIZIZ(sbLIZ3));
                                }
                            } else {
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("Insufficient data to read size of APK Signing Block entry #");
                                sbLIZ4.append(i);
                                throw new C0W9E(C2188811AlT.LIZIZ(sbLIZ4));
                            }
                        }
                        return linkedHashMap;
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        byteBuffer.position(0);
                        byteBuffer.limit(iLimit);
                        byteBuffer.position(iPosition);
                        throw th2;
                    }
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("end > capacity: ");
                sbLIZ5.append(iCapacity);
                sbLIZ5.append(" > ");
                sbLIZ5.append(iCapacity2);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ5);
                strLIZIZ2.toString();
                throw new IllegalArgumentException(strLIZIZ2);
            }
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("end < start: ");
            sbLIZ6.append(iCapacity);
            sbLIZ6.append(" < ");
            sbLIZ6.append(8);
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ6);
            strLIZIZ3.toString();
            throw new IllegalArgumentException(strLIZIZ3);
        }
        "ByteBuffer byte order must be little endian".toString();
        throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
    }
}
