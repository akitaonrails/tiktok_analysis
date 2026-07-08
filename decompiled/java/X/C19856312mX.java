package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: X.12mX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19856312mX {
    public static final Charset LIZ = Charset.forName("UTF-8");
    public static final byte[] LIZIZ;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        LIZIZ = bArr;
        ByteBuffer.wrap(bArr);
        C19856412mY c19856412mY = new C19856412mY();
        try {
            int i = c19856412mY.LIZ + c19856412mY.LIZIZ;
        } catch (C19857612mk e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalArgumentException(e);
        }
    }
}
