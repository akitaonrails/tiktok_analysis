package X;

import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0juY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1299120juY {
    public final String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;

    public static Map<String, C1299120juY> LIZ(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableMap map2 = readableArray.getMap(i);
            String string = map2.getString("name");
            C1299120juY c1299120juY = (C1299120juY) map.get(string);
            if (c1299120juY == null) {
                c1299120juY = new C1299120juY(string, map2.getString("type"), map2.getString("function"), map2.getString("lepusType"), map2.getString("lepusFunction"));
            } else {
                if (c1299120juY.LIZIZ == null && c1299120juY.LIZJ == null) {
                    c1299120juY.LIZIZ = map2.getString("type");
                    c1299120juY.LIZJ = map2.getString("function");
                }
                if (c1299120juY.LIZLLL == null && c1299120juY.LJ == null) {
                    c1299120juY.LIZLLL = map2.getString("lepusType");
                    c1299120juY.LJ = map2.getString("lepusFunction");
                }
            }
            map.put(c1299120juY.LIZ, c1299120juY);
        }
        return map;
    }

    public C1299120juY(String str, String str2, String str3, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
    }
}
