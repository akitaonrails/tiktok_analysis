package X;

import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AwS547S0100000_3;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.07aQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1888007aQ {
    public final List<String> LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS547S0100000_3(this, 119));

    public C1888007aQ(List<String> list) {
        this.LIZ = list;
    }

    public static String LIZ(String str) {
        StringBuilder sb = new StringBuilder("^");
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '*') {
                if (cCharAt != '.') {
                    sb.append(Pattern.quote(String.valueOf(cCharAt)));
                } else {
                    sb.append("\\.");
                }
            } else {
                sb.append("[a-zA-Z0-9-]+");
            }
        }
        sb.append(e3.c);
        return sb.toString();
    }
}
