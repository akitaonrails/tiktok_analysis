package X;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.AwS652S0100000_3;

/* JADX INFO: renamed from: X.08g5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2177908g5 {
    public static final String LIZ(C0VSJ c0vsj) throws NoSuchAlgorithmException, IOException {
        if (c0vsj.length() <= 3145728) {
            return C08F1.LIZ(c0vsj);
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(c0vsj, "r");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        randomAccessFile.seek(0L);
        LIZIZ(randomAccessFile, new AwS652S0100000_3(messageDigest, 0));
        long j = 1048576;
        randomAccessFile.seek((c0vsj.length() - j) / ((long) 2));
        LIZIZ(randomAccessFile, new AwS652S0100000_3(messageDigest, 1));
        randomAccessFile.seek(c0vsj.length() - j);
        LIZIZ(randomAccessFile, new AwS652S0100000_3(messageDigest, 2));
        return C08HM.LJ(messageDigest.digest());
    }

    public static final void LIZIZ(RandomAccessFile randomAccessFile, InterfaceC1631620sYq interfaceC1631620sYq) throws IOException {
        byte[] bArr = new byte[1024];
        int i = 0;
        do {
            int i2 = randomAccessFile.read(bArr, 0, Math.min(1048576 - i, 1024));
            if (i2 <= 0) {
                return;
            }
            interfaceC1631620sYq.invoke(bArr, 0, Integer.valueOf(i2));
            i += i2;
        } while (i < 1048576);
    }
}
