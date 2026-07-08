package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

/* JADX INFO: renamed from: X.0ksF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1336130ksF {
    public final InputStream LIZ;
    public final CharsetDecoder LIZIZ;
    public final ByteBuffer LIZJ;
    public boolean LIZLLL;
    public char LJ;

    public C1336130ksF(InputStream inputStream, Charset charset) {
        byte[] bArrLJIIZILJ;
        this.LIZ = inputStream;
        this.LIZIZ = charset.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
        C1336150ksH c1336150ksH = C1336150ksH.LIZJ;
        synchronized (c1336150ksH) {
            try {
                bArrLJIIZILJ = c1336150ksH.LIZ.LJIIZILJ();
                if (bArrLJIIZILJ != null) {
                    c1336150ksH.LIZIZ -= bArrLJIIZILJ.length / 2;
                } else {
                    bArrLJIIZILJ = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrLJIIZILJ == null ? new byte[8196] : bArrLJIIZILJ);
        this.LIZJ = byteBufferWrap;
        byteBufferWrap.flip();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZ(char[] r10, int r11, int r12) throws java.nio.charset.CharacterCodingException {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1336130ksF.LIZ(char[], int, int):int");
    }
}
