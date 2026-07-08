package X;

import com.bytedance.compression.zstd.ZstdCompress;
import com.bytedance.compression.zstd.ZstdDictCompress;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0VCb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C793830VCb implements InterfaceC793490VAt {
    public final boolean LIZ;
    public byte[] LIZIZ;
    public ZstdDictCompress LIZJ;

    public C793830VCb(boolean z) {
        this.LIZ = z;
    }

    @Override // X.InterfaceC793490VAt
    public final C793730VBr LIZ(C793730VBr c793730VBr) {
        if (c793730VBr.LIZ()) {
            return null;
        }
        long jCompressBound = ZstdCompress.compressBound(c793730VBr.LIZIZ);
        if (jCompressBound <= 2147483647L) {
            int i = (int) jCompressBound;
            byte[] bArr = new byte[i];
            return new C793730VBr(bArr, ZstdCompress.compress(bArr, 0, i, c793730VBr.LIZ, 0, c793730VBr.LIZIZ, 15));
        }
        throw new C2252871DFt(-1L, "Max output size is greater than MAX_INT");
    }

    @Override // X.InterfaceC793490VAt
    public final C793730VBr LIZIZ(C793730VBr c793730VBr, byte[] bArr) {
        if (c793730VBr.LIZ()) {
            return null;
        }
        long jCompressBound = ZstdCompress.compressBound(c793730VBr.LIZIZ);
        if (jCompressBound <= 2147483647L) {
            int i = (int) jCompressBound;
            byte[] bArr2 = new byte[i];
            if (this.LIZ) {
                if (this.LIZJ == null || !Arrays.equals(bArr, this.LIZIZ)) {
                    this.LIZJ = new ZstdDictCompress(bArr, 15);
                    this.LIZIZ = bArr;
                }
                return new C793730VBr(bArr2, ZstdCompress.compress(bArr2, 0, i, c793730VBr.LIZ, 0, c793730VBr.LIZIZ, this.LIZJ));
            }
            return new C793730VBr(bArr2, ZstdCompress.compress(bArr2, 0, i, c793730VBr.LIZ, 0, c793730VBr.LIZIZ, new ZstdDictCompress(bArr, 15)));
        }
        throw new C2252871DFt(-1L, "Max output size is greater than MAX_INT");
    }
}
