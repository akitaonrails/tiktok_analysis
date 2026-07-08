package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0vGz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1735870vGz {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(293));

    public static boolean LIZ(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return PatternProtector.compile("[\\ud800\\udc00-\\udbff\\udfff\\ud800-\\udfff]").matcher(str).find();
    }

    public static boolean LIZIZ(String str) {
        if (str != null && str.length() != 0 && Regex.find$default((Regex) LIZ.getValue(), str, 0, 2, null) != null) {
            return true;
        }
        return false;
    }
}
