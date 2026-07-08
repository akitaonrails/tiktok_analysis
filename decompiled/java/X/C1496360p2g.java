package X;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.0p2g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1496360p2g {
    public static final C1495840p1q[] LIZ;
    public static final Map<ByteString, Integer> LIZIZ;

    static {
        int i = 0;
        ByteString byteString = C1495840p1q.LJFF;
        ByteString byteString2 = C1495840p1q.LJI;
        ByteString byteString3 = C1495840p1q.LJII;
        ByteString byteString4 = C1495840p1q.LJ;
        C1495840p1q[] c1495840p1qArr = {new C1495840p1q(C1495840p1q.LJIIIIZZ, ""), new C1495840p1q(byteString, "GET"), new C1495840p1q(byteString, "POST"), new C1495840p1q(byteString2, "/"), new C1495840p1q(byteString2, "/index.html"), new C1495840p1q(byteString3, "http"), new C1495840p1q(byteString3, "https"), new C1495840p1q(byteString4, "200"), new C1495840p1q(byteString4, "204"), new C1495840p1q(byteString4, "206"), new C1495840p1q(byteString4, "304"), new C1495840p1q(byteString4, "400"), new C1495840p1q(byteString4, "404"), new C1495840p1q(byteString4, "500"), new C1495840p1q("accept-charset", ""), new C1495840p1q("accept-encoding", "gzip, deflate"), new C1495840p1q("accept-language", ""), new C1495840p1q("accept-ranges", ""), new C1495840p1q("accept", ""), new C1495840p1q("access-control-allow-origin", ""), new C1495840p1q("age", ""), new C1495840p1q("allow", ""), new C1495840p1q("authorization", ""), new C1495840p1q("cache-control", ""), new C1495840p1q("content-disposition", ""), new C1495840p1q("content-encoding", ""), new C1495840p1q("content-language", ""), new C1495840p1q("content-length", ""), new C1495840p1q("content-location", ""), new C1495840p1q("content-range", ""), new C1495840p1q("content-type", ""), new C1495840p1q("cookie", ""), new C1495840p1q("date", ""), new C1495840p1q("etag", ""), new C1495840p1q("expect", ""), new C1495840p1q("expires", ""), new C1495840p1q("from", ""), new C1495840p1q("host", ""), new C1495840p1q("if-match", ""), new C1495840p1q("if-modified-since", ""), new C1495840p1q("if-none-match", ""), new C1495840p1q("if-range", ""), new C1495840p1q("if-unmodified-since", ""), new C1495840p1q("last-modified", ""), new C1495840p1q("link", ""), new C1495840p1q("location", ""), new C1495840p1q("max-forwards", ""), new C1495840p1q("proxy-authenticate", ""), new C1495840p1q("proxy-authorization", ""), new C1495840p1q("range", ""), new C1495840p1q("referer", ""), new C1495840p1q("refresh", ""), new C1495840p1q("retry-after", ""), new C1495840p1q("server", ""), new C1495840p1q("set-cookie", ""), new C1495840p1q("strict-transport-security", ""), new C1495840p1q("transfer-encoding", ""), new C1495840p1q("user-agent", ""), new C1495840p1q("vary", ""), new C1495840p1q("via", ""), new C1495840p1q("www-authenticate", "")};
        LIZ = c1495840p1qArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c1495840p1qArr.length);
        while (true) {
            C1495840p1q[] c1495840p1qArr2 = LIZ;
            if (i >= c1495840p1qArr2.length) {
                LIZIZ = Collections.unmodifiableMap(linkedHashMap);
                return;
            } else {
                if (!linkedHashMap.containsKey(c1495840p1qArr2[i].LIZ)) {
                    linkedHashMap.put(c1495840p1qArr2[i].LIZ, Integer.valueOf(i));
                }
                i++;
            }
        }
    }

    public static void LIZ(ByteString byteString) throws IOException {
        int size = byteString.size();
        for (int i = 0; i < size; i++) {
            byte b = byteString.getByte(i);
            if (b >= 65 && b <= 90) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PROTOCOL_ERROR response malformed: mixed case name: ");
                sbLIZ.append(byteString.utf8());
                throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }
}
