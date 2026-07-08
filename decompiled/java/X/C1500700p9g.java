package X;

import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Map;

/* JADX INFO: renamed from: X.0p9g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1500700p9g {
    public EnumC1500730p9j LIZ = EnumC1500730p9j.POST;
    public String LIZIZ;
    public Map<String, String> LIZJ;
    public Map<String, String> LIZLLL;
    public byte[] LJ;
    public InterfaceC1500680p9e LJFF;
    public String LJI;
    public Map<String, String> LJII;
    public InterfaceC1502210pC7 LJIIIIZZ;

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final byte[] LIZ() {
        Map<String, String> map;
        byte[] bArr = this.LJ;
        if (bArr != null) {
            return bArr;
        }
        InterfaceC1500680p9e interfaceC1500680p9e = this.LJFF;
        if (interfaceC1500680p9e != null) {
            C1500670p9d c1500670p9d = (C1500670p9d) interfaceC1500680p9e;
            C1500650p9b c1500650p9b = c1500670p9d.LIZ;
            Object obj = c1500670p9d.LIZIZ;
            c1500650p9b.getClass();
            try {
                return ((TypedByteArray) c1500650p9b.LIZ.LIZ((T) obj)).getBytes();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unable to convert ");
                sbLIZ.append(obj);
                sbLIZ.append(" to TypedOutput");
                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), e);
            }
        }
        Map<String, String> map2 = this.LJII;
        if ((map2 == null || map2.isEmpty()) || (map = this.LJII) == null || map.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (String str : map.keySet()) {
            String str2 = map.get(str);
            if (str != null && str2 != null) {
                if (byteArrayOutputStream.size() > 0) {
                    byteArrayOutputStream.write(38);
                }
                try {
                    String strEncode = URLEncoder.encode(str, "UTF-8");
                    String strEncode2 = URLEncoder.encode(str2, "UTF-8");
                    byteArrayOutputStream.write(strEncode.getBytes("UTF-8"));
                    byteArrayOutputStream.write(61);
                    byteArrayOutputStream.write(strEncode2.getBytes("UTF-8"));
                } catch (IOException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    throw new RuntimeException(e2);
                }
            }
        }
        return byteArrayOutputStream.toByteArray();
    }
}
