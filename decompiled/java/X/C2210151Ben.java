package X;

import com.bytedance.applog.compress.CompressManager;
import java.util.HashMap;

/* JADX INFO: renamed from: X.1Ben, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2210151Ben implements InterfaceC2211431Bgr {
    public final C2209571Bdr LIZ;
    public final CompressManager LIZIZ;

    public final C2210751Bfl LIZ(byte[] bArr) {
        C2210751Bfl c2210751Bfl = new C2210751Bfl();
        C2210391BfB c2210391BfB = new C2210391BfB();
        c2210751Bfl.LIZ = this.LIZIZ.compress(bArr, this.LIZ.LJ.getInt("content_encode_method", 0), c2210391BfB);
        c2210751Bfl.LIZIZ = c2210391BfB.LIZJ;
        HashMap map = new HashMap(4);
        int i = c2210391BfB.LIZJ;
        if (i == 0) {
            map.put("log-encode-type", "gzip");
            map.put("Content-Encoding", "gzip");
            map.put("Content-Type", "application/octet-stream;tt-data=b");
        } else if (i != 1 && i != 2) {
            if (i == -1) {
                map.put("Content-Type", "application/json;charset=utf-8");
            }
        } else {
            map.put("log-encode-type", "zstd");
            map.put("log-encode-token", String.valueOf(0));
            map.put("Content-Type", "application/octet-stream;tt-data=b");
        }
        c2210751Bfl.LIZJ = map;
        return c2210751Bfl;
    }

    public C2210151Ben(C2209901BeO c2209901BeO, C2209571Bdr c2209571Bdr) {
        this.LIZ = c2209571Bdr;
        this.LIZIZ = new CompressManager(c2209901BeO.LJIIJ, c2209901BeO.LJJZZI);
    }
}
