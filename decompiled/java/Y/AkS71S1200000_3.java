package Y;

import X.C080U;
import X.C08S4;
import X.C0VSJ;
import X.C1897250zTH;
import X.C1956407lS;
import X.C2097608Jq;
import X.C2111308Ox;
import X.C2188811AlT;
import X.InterfaceC1487280oo2;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class AkS71S1200000_3 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(AkS71S1200000_3 akS71S1200000_3, Object obj) throws IOException {
        JSONObject jSONObject;
        String str = (String) obj;
        if (str.hashCode() == 3446944 && str.equals("post")) {
            String str2 = akS71S1200000_3.s0;
            Map map = (Map) akS71S1200000_3.l1;
            Map map2 = (Map) akS71S1200000_3.l2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Object obj2 = map.get("Content-Type");
            if ((obj2 instanceof String) && a0.LJJIIZI((CharSequence) obj2, "json", false)) {
                byteArrayOutputStream.write(C1956407lS.LIZ(map2).getBytes(Charset.forName("UTF-8")));
                try {
                    C08S4 c08s4 = C08S4.LIZ;
                    try {
                        jSONObject = new JSONObject(byteArrayOutputStream.toString("UTF-8"));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        jSONObject = new JSONObject();
                    }
                    List listLIZIZ = C1956407lS.LIZIZ(map);
                    c08s4.getClass();
                    return new JSONObject(C08S4.LIZLLL(str2, jSONObject, "application/json; charset=UTF-8", listLIZIZ));
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    return new JSONObject();
                }
            }
            for (Map.Entry entry : map2.entrySet()) {
                String str3 = (String) entry.getKey();
                Object value = entry.getValue();
                if (byteArrayOutputStream.size() > 0) {
                    byteArrayOutputStream.write(38);
                }
                try {
                    String strEncode = URLEncoder.encode(str3, "UTF-8");
                    String strEncode2 = URLEncoder.encode(C1956407lS.LIZ(value), "UTF-8");
                    byteArrayOutputStream.write(strEncode.getBytes(Charset.forName("UTF-8")));
                    byteArrayOutputStream.write(61);
                    byteArrayOutputStream.write(strEncode2.getBytes(Charset.forName("UTF-8")));
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    throw new RuntimeException(e3);
                }
            }
            try {
                C08S4 c08s42 = C08S4.LIZ;
                TypedByteArray typedByteArray = new TypedByteArray(null, byteArrayOutputStream.toByteArray(), new String[0]);
                List listLIZIZ2 = C1956407lS.LIZIZ(map);
                ((ArrayList) listLIZIZ2).add(new C080U("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8"));
                c08s42.getClass();
                return new JSONObject(C08S4.LIZJ(str2, typedByteArray, listLIZIZ2));
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
                return new JSONObject();
            }
        }
        String str4 = akS71S1200000_3.s0;
        Map map3 = (Map) akS71S1200000_3.l1;
        try {
            C08S4 c08s43 = C08S4.LIZ;
            Map mapLJ = C2097608Jq.LJ();
            List listLIZIZ3 = C1956407lS.LIZIZ(map3);
            c08s43.getClass();
            return new JSONObject(C08S4.LIZIZ(str4, listLIZIZ3, mapLJ));
        } catch (Exception e5) {
            TryCatchGuardChecker.doCheck(e5);
            return new JSONObject();
        }
    }

    public static final Object apply$1(AkS71S1200000_3 akS71S1200000_3, Object obj) throws Exception {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((C1897250zTH) akS71S1200000_3.l1).LJIIIIZZ());
        sbLIZ.append(akS71S1200000_3.s0);
        C2111308Ox.LIZIZ((File) akS71S1200000_3.l2, new C0VSJ(C2188811AlT.LIZIZ(sbLIZ)));
        return ((C1897250zTH) akS71S1200000_3.l1).LJI(akS71S1200000_3.s0);
    }

    public AkS71S1200000_3(String str, Object obj, Object obj2, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = obj;
        this.l2 = obj2;
    }
}
