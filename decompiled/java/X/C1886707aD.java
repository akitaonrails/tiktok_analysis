package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.regex.Matcher;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07aD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1886707aD {
    public static C1887107aH LIZ(String str) {
        String strGroup;
        String strGroup2;
        if (str != null && !a0.LJJJIL(str)) {
            Matcher matcher = PatternProtector.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
            if (matcher.matches() && (strGroup = matcher.group(1)) != null) {
                int i = CastIntegerProtector.parseInt(strGroup);
                String strGroup3 = matcher.group(2);
                if (strGroup3 != null) {
                    int i2 = CastIntegerProtector.parseInt(strGroup3);
                    String strGroup4 = matcher.group(3);
                    if (strGroup4 != null) {
                        int i3 = CastIntegerProtector.parseInt(strGroup4);
                        if (matcher.group(4) != null) {
                            strGroup2 = matcher.group(4);
                        } else {
                            strGroup2 = "";
                        }
                        return new C1887107aH(i, i2, i3, strGroup2);
                    }
                }
            }
        }
        return null;
    }
}
