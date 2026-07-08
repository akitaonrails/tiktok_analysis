package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: X.12md, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19856912md {
    public static final Charset LIZ;
    public static final byte[] LIZIZ;

    public static int LIZ(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.12me] */
    static {
        Charset.forName("US-ASCII");
        LIZ = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        final int i = 0;
        byte[] bArr = new byte[0];
        LIZIZ = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new AbstractC19857112mf(i) { // from class: X.12me
                public int LIZ;
                public int LIZIZ;
                public int LIZJ = Integer.MAX_VALUE;

                {
                    this.LIZ = i;
                }

                public final int LIZJ(int i2) {
                    if (i2 >= 0) {
                        if (i2 >= 0) {
                            int i3 = this.LIZJ;
                            if (i2 <= i3) {
                                this.LIZJ = i2;
                                int i4 = this.LIZ + this.LIZIZ;
                                this.LIZ = i4;
                                if (i4 > i2) {
                                    int i5 = i4 - i2;
                                    this.LIZIZ = i5;
                                    this.LIZ = i4 - i5;
                                    return i3;
                                }
                                this.LIZIZ = 0;
                                return i3;
                            }
                            throw C19903212u6.LIZLLL();
                        }
                        throw C19903212u6.LIZJ();
                    }
                    throw C19903212u6.LIZIZ();
                }
            }.LIZJ(0);
        } catch (C19903212u6 e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalArgumentException(e);
        }
    }
}
