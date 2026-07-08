package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;

/* JADX INFO: renamed from: X.07rB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1991907rB {
    public static String[] LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            String binaryString = Integer.toBinaryString(cCharAt);
            if (binaryString.length() < 8) {
                sb.append(cCharAt);
            } else {
                int i2 = CastIntegerProtector.parseInt(binaryString.substring(0, binaryString.length() - 8), 2);
                int i3 = CastIntegerProtector.parseInt(binaryString.substring(binaryString.length() - 8), 2);
                sb.append((char) i2);
                sb.append((char) i3);
            }
        }
        return sb.toString().split("\n");
    }
}
