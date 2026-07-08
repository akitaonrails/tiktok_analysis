package X;

import java.io.DataInput;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: X.08mv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2220308mv {
    public final C2221108n3[] LIZ;

    public C2220308mv(C2221108n3[] c2221108n3Arr) {
        this.LIZ = c2221108n3Arr;
    }

    public static final C2220308mv LIZ(DataInput dataInput) throws IOException {
        RandomAccessFile randomAccessFile = (RandomAccessFile) dataInput;
        if (randomAccessFile.readByte() == 1) {
            int i = randomAccessFile.readInt();
            if (i >= 0) {
                C2221108n3[] c2221108n3Arr = new C2221108n3[i];
                for (int i2 = 0; i2 < i; i2++) {
                    c2221108n3Arr[i2] = new C2221108n3(randomAccessFile.readUTF(), randomAccessFile.readUTF());
                }
                return new C2220308mv(c2221108n3Arr);
            }
            throw new RuntimeException("illegal number of shared libraries");
        }
        throw new RuntimeException("wrong dso manifest version");
    }
}
