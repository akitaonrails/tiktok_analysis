package X;

import android.util.Pair;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.0Vm1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C807510Vm1 {
    public static final Pattern LIZ = PatternProtector.compile("^\\D?(\\d+)$");
    public static final Map<String, Integer> LIZIZ;
    public static final Map<String, Integer> LIZJ;

    static {
        HashMap map = new HashMap();
        LIZJ = map;
        map.put("01", 1);
        map.put("02", 2);
        map.put("03", 4);
        map.put("04", 8);
        map.put("05", 16);
        map.put("06", 32);
        map.put("07", 64);
        map.put("08", 128);
        map.put("09", 256);
        HashMap map2 = new HashMap();
        LIZIZ = map2;
        map2.put("00", 1);
        map2.put("01", 2);
        map2.put("02", 4);
        map2.put("03", 8);
        map2.put("04", 16);
        map2.put("05", 32);
        map2.put("06", 64);
        map2.put("07", 128);
        map2.put("08", 256);
        map2.put("09", 512);
    }

    public static Pair LIZIZ(String[] strArr) {
        if (strArr == null || strArr.length < 3) {
            return null;
        }
        Matcher matcher = LIZ.matcher(strArr[1]);
        if (!matcher.matches()) {
            return null;
        }
        Object obj = ((HashMap) LIZIZ).get(matcher.group(1));
        if (obj == null) {
            return null;
        }
        Object obj2 = ((HashMap) LIZJ).get(strArr[2]);
        if (obj2 == null) {
            return null;
        }
        return new Pair(obj, obj2);
    }

    public static String LIZ(int i, int i2) {
        String str;
        if (i != 4 && i != 5 && i != 7) {
            if (i == 8) {
                str = "hev1";
            } else if (i == 9) {
                str = "avc3";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(".0");
        sbLIZ.append(i);
        sbLIZ.append(".0");
        sbLIZ.append(i2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
