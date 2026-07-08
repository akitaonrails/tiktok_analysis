package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0D4H, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D4H {
    public static final /* synthetic */ int LIZ = 0;

    static {
        new SimpleDateFormat("MMMM d, yyyy", Locale.US);
    }

    public static String LIZ(Integer num) {
        if (num == null) {
            return "";
        }
        if (num.intValue() < 1000) {
            return num.toString();
        }
        if (num.intValue() < 1000000) {
            String strJ4 = C786410Ut5.j4("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(((double) num.intValue()) / 1000.0d)}, 1));
            if (u.LJIIZILJ(strJ4, ".0", false)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(a0.LJJZ(strJ4, ".0", strJ4));
                sbLIZ.append('k');
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strJ4);
            sbLIZ2.append('k');
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        String strJ42 = C786410Ut5.j4("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(((double) num.intValue()) / 1000000.0d)}, 1));
        if (u.LJIIZILJ(strJ42, ".0", false)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(a0.LJJZ(strJ42, ".0", strJ42));
            sbLIZ3.append('M');
            return C2188811AlT.LIZIZ(sbLIZ3);
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(strJ42);
        sbLIZ4.append('M');
        return C2188811AlT.LIZIZ(sbLIZ4);
    }

    public static boolean LIZIZ(String str) {
        if (str == null || a0.LJLIIIL(str).toString().length() == 0) {
            return false;
        }
        return true;
    }

    public static String LIZJ(String str) {
        String strLJ = LJ(str);
        if (strLJ == null) {
            return null;
        }
        String strLJJLL = a0.LJJLL('#', strLJ, strLJ);
        String string = a0.LJLIIIL(a0.LJJLL('?', strLJJLL, strLJJLL)).toString();
        if (string.length() == 0) {
            return null;
        }
        if (a0.LJJIIZI(string, "cdn.shopify.com", true)) {
            String strLJJLJ = a0.LJJLJ('/', string, string);
            if (strLJJLJ.length() > 0) {
                return strLJJLJ;
            }
        }
        return string;
    }

    public static String LJ(String str) {
        if (str != null && !a0.LJJJIL(str)) {
            String string = a0.LJLIIIL(str).toString();
            if (u.LJJIIJZLJL(string, "`", false) && u.LJIIZILJ(string, "`", false) && string.length() >= 2) {
                string = string.substring(1, string.length() - 1);
            }
            String strLJLJJI = a0.LJLJJI(string, ',', 65292);
            if (a0.LJJIIZI(strLJLJJI, " ", false)) {
                strLJLJJI = u.LJJIFFI(strLJLJJI, " ", "%20", false);
            }
            return a0.LJLIIIL(strLJLJJI).toString();
        }
        return null;
    }

    public static C332560D1y LIZLLL(String str, Double d) {
        String string;
        Double dLJII;
        if (str != null && (string = a0.LJLIIIL(str).toString()) != null && string.length() > 0) {
            dLJII = C2327809Ae.LJII(string);
        } else {
            string = null;
            dLJII = null;
        }
        if (dLJII != null) {
            if (dLJII.doubleValue() < 0.0d) {
                return null;
            }
            float fDoubleValue = (float) dLJII.doubleValue();
            if (Intrinsics.LIZIZ(dLJII, 0.0d)) {
                string = CardStruct.IStatusCode.DEFAULT;
            }
            return new C332560D1y(fDoubleValue, string);
        }
        if (d == null) {
            return null;
        }
        double dDoubleValue = d.doubleValue();
        if (dDoubleValue <= 0.0d) {
            return null;
        }
        return new C332560D1y((float) dDoubleValue, C786410Ut5.k4(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(Math.floor(((double) 10) * dDoubleValue) / 10.0d)}, 1)));
    }
}
