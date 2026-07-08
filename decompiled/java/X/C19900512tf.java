package X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.12tf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19900512tf {
    public static final char[] LIZ;

    static {
        char[] cArr = new char[80];
        LIZ = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void LIZIZ(StringBuilder sb, int i) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(LIZ, 0, i2);
            i -= i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.InterfaceC19911612vS r17, java.lang.StringBuilder r18, int r19) {
        /*
            Method dump skipped, instruction units count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19900512tf.LIZJ(X.12vS, java.lang.StringBuilder, int):void");
    }

    public static void LIZ(StringBuilder sb, int i, String str, Object obj) {
        AbstractC19855612mQ c19855812mS;
        if (obj instanceof List) {
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                LIZ(sb, i, str, it2.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it3 = ((Map) obj).entrySet().iterator();
            while (it3.hasNext()) {
                LIZ(sb, i, str, it3.next());
            }
            return;
        }
        sb.append('\n');
        LIZIZ(sb, i);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            String str2 = (String) obj;
            AbstractC19855612mQ abstractC19855612mQ = AbstractC19855612mQ.zza;
            if (str2.isEmpty()) {
                c19855812mS = AbstractC19855612mQ.zza;
            } else {
                c19855812mS = new C19855812mS(str2.getBytes(C19856312mX.LIZ));
            }
            sb.append(C19853912m9.LIZ(c19855812mS));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC19855612mQ) {
            sb.append(": \"");
            sb.append(C19853912m9.LIZ((AbstractC19855612mQ) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC19907912ur) {
            sb.append(" {");
            LIZJ((AbstractC19900712th) obj, sb, i + 2);
            sb.append("\n");
            LIZIZ(sb, i);
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            int i3 = i + 2;
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            LIZ(sb, i3, "key", entry.getKey());
            LIZ(sb, i3, "value", entry.getValue());
            sb.append("\n");
            LIZIZ(sb, i);
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }
}
