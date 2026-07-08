package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.08ED, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08ED {
    public static final Map<String, String> LIZ;
    public static final Pattern LIZIZ;

    static {
        HashMap map = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(C786410Ut5.LJLLI(C08ED.class, "/org/commonmark/internal/util/entities.properties"), Charset.forName("UTF-8")));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        map.put("NewLine", "\n");
                        LIZ = map;
                        LIZIZ = PatternProtector.compile("^&#[Xx]?");
                        return;
                    }
                    if (line.length() != 0) {
                        int iIndexOf = line.indexOf("=");
                        map.put(line.substring(0, iIndexOf), line.substring(iIndexOf + 1));
                    }
                } finally {
                }
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalStateException("Failed reading data for HTML named character references", e);
        }
    }

    public static String LIZ(String str) {
        int i;
        Matcher matcher = LIZIZ.matcher(str);
        if (matcher.find()) {
            if (matcher.end() == 2) {
                i = 10;
            } else {
                i = 16;
            }
            try {
                int i2 = CastIntegerProtector.parseInt(str.substring(matcher.end(), str.length() - 1), i);
                if (i2 == 0) {
                    return "�";
                }
                return new String(Character.toChars(i2));
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                return "�";
            }
        }
        String str2 = LIZ.get(str.substring(1, str.length() - 1));
        if (str2 != null) {
            return str2;
        }
        return str;
    }
}
