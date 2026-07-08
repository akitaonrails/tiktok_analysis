package X;

import android.util.Pair;
import com.bytedance.im.core.proto.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import net.jpountz.lz4.LZ4Exception;
import net.jpountz.lz4.LZ4Factory;

/* JADX INFO: renamed from: X.0YLK, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YLK {
    public static Pair LIZ(C0YEM c0yem, Request request) {
        if (request.cmd.intValue() > C0YMR.IMCMD_NOT_USED.getValue()) {
            C870830YEf c870830YEfLJIIIZ = c0yem.LJIIIZ();
            byte[] bArrEncode = request.encode();
            float length = bArrEncode.length;
            if (c870830YEfLJIIIZ != null) {
                if (bArrEncode.length <= c870830YEfLJIIIZ.LJIIIIZZ) {
                    return new Pair("pb", bArrEncode);
                }
                byte[] bArrCompress = LZ4Factory.fastestInstance().fastCompressor().compress(bArrEncode);
                C868780Y6i c868780Y6iLIZLLL = c0yem.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SSEncodeAndDecode encode original length = ");
                sbLIZ.append(length);
                sbLIZ.append(" compressed length = ");
                sbLIZ.append(bArrCompress.length);
                sbLIZ.append(" compress rate = ");
                sbLIZ.append(bArrCompress.length / length);
                c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
                if (bArrCompress.length <= c870830YEfLJIIIZ.LJII) {
                    return new Pair("__lz4", bArrCompress);
                }
                throw new C0YIJ(-2004);
            }
            throw new C0YIJ(-2001);
        }
        throw new C0YIJ(-2002);
    }

    public static byte[] LIZIZ(C0YEM c0yem, byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            int length = bArr.length * 3;
            int i = 0;
            while (true) {
                i++;
                try {
                    return LZ4Factory.fastestInstance().safeDecompressor().decompress(bArr, length);
                } catch (LZ4Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (i <= 2) {
                        c0yem.LIZLLL().LJIIIZ("SSEncodeAndDecode lz4Decompress", e);
                        length = 51200 * i;
                    } else {
                        throw e;
                    }
                }
            }
        } else {
            return null;
        }
    }
}
