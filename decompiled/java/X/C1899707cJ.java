package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Set;
import java.util.regex.PatternSyntaxException;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.text.Regex;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.07cJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1899707cJ {
    public static final Set<String> LIZJ = C13LQ.LJLIIL(new String[]{",", e3.d, "?", "!"});
    public static final Set<String> LIZLLL = C13LQ.LJLIIL(new String[]{"。", "？", "！", "，"});
    public static final List<String> LJ = C1106604Um.LIZ;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1234));
    public String LIZIZ;

    public final String LIZ(String str) {
        boolean z;
        Character chValueOf;
        boolean z2;
        boolean z3;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (str == null) {
                return "";
            }
            return str;
        }
        try {
            str = new Regex("[\\u200B-\\u200D\\uFEFF\\u2060\\u180E\\u200E\\u200F]").replace(str, "");
        } catch (PatternSyntaxException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (RuntimeException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        int length = str.length() - 1;
        this.LIZ.getValue();
        System.currentTimeMillis();
        while (length >= 0) {
            int i = -1;
            if (length < str.length()) {
                StringBuilder sb = new StringBuilder(str);
                char cCharAt = str.charAt(length);
                if (length != 0) {
                    i = length - 1;
                }
                int i2 = length + 1;
                if (LIZLLL.contains(String.valueOf(cCharAt))) {
                    if (i >= 0) {
                        chValueOf = Character.valueOf(str.charAt(i));
                    } else {
                        chValueOf = null;
                    }
                    if (chValueOf != null && !C1244080iTm.LJ(chValueOf.charValue()) && !C1899607cI.LIZ(chValueOf.charValue())) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (i2 < str.length() && !C1244080iTm.LJ(str.charAt(i2)) && !C1899607cI.LIZ(str.charAt(i2))) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (!z2 && !z3) {
                        sb.setCharAt(length, ' ');
                    } else {
                        sb.deleteCharAt(length);
                    }
                    this.LIZIZ = sb.toString();
                } else if (LIZJ.contains(String.valueOf(cCharAt)) && (i2 >= str.length() || C1244080iTm.LJ(str.charAt(i2)) || C1899607cI.LIZ(str.charAt(i2)))) {
                    int iLIZ = ((C1899507cH) this.LIZ.getValue()).LIZ(length, str);
                    if (iLIZ < 0) {
                        length += iLIZ;
                    } else {
                        sb.deleteCharAt(length);
                        this.LIZIZ = sb.toString();
                    }
                }
                length = i;
            } else {
                length = i;
            }
            String str2 = this.LIZIZ;
            if (str2 != null) {
                str = str2;
            }
            this.LIZIZ = null;
        }
        System.currentTimeMillis();
        return str;
    }
}
