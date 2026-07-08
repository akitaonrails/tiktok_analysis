package X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.12td, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19900312td {
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

    /* JADX WARN: Removed duplicated region for block: B:101:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.InterfaceC19901112tl r17, java.lang.StringBuilder r18, int r19) {
        /*
            Method dump skipped, instruction units count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19900312td.LIZ(X.12tl, java.lang.StringBuilder, int):void");
    }

    public static void LIZJ(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                LIZJ(sb, i, str, it2.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it3 = ((Map) obj).entrySet().iterator();
            while (it3.hasNext()) {
                LIZJ(sb, i, str, it3.next());
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
            sb.append(C19854012mA.LIZ(AbstractC19854812mI.zza((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC19854812mI) {
            sb.append(": \"");
            sb.append(C19854012mA.LIZ((AbstractC19854812mI) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC19899612tW) {
            sb.append(" {");
            LIZ((AbstractC19899312tT) obj, sb, i + 2);
            sb.append("\n");
            LIZIZ(sb, i);
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i3 = i + 2;
            LIZJ(sb, i3, "key", entry.getKey());
            LIZJ(sb, i3, "value", entry.getValue());
            sb.append("\n");
            LIZIZ(sb, i);
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }
}
